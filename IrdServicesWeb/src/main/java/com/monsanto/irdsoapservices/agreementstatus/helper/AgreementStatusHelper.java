package com.monsanto.irdsoapservices.agreementstatus.helper;

import com.monsanto.irdsoapservices.agreementstatus.dao.AgreementStatusDao;
import com.monsanto.irdsoapservices.agreementstatus.domain.AgreementInfo;
import com.monsanto.irdsoapservices.agreementstatus.domain.AgreementStatusInfo;
import com.monsanto.irdsoapservices.agreementstatus.schema.response.AgreementStatusResponseType;
import com.monsanto.irdsoapservices.agreementstatus.schema.response.ListPartnerAgencyAttribute;
import com.monsanto.irdsoapservices.agreementstatus.schema.response.ExceptionType;
import com.monsanto.irdsoapservices.agreementstatus.schema.request.AgreementStatusRequest;
import com.monsanto.irdsoapservices.agreementstatus.schema.request.AgreementStatusRequestDetailsType;
import com.monsanto.irdsoapservices.agreementstatus.schema.request.PartnerIdentifierType;
import com.monsanto.irdsoapservices.agreementstatus.schema.AgreementStatusFault;
import com.monsanto.irdsoapservices.utils.ErrorEmailer;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jul 12, 2010
 * Time: 9:51:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class AgreementStatusHelper {
    AgreementStatusDao agreementStatusDao;
    AgreementStatusResponseBuilder responseBuilder;

    Logger logger = Logger.getLogger(this.getClass());

    public AgreementStatusResponseType getAgreementStatus(AgreementStatusRequest agreementStatusRequest) throws AgreementStatusFault {
        AgreementStatusResponseType response;
        try {
            logger.info("Starting to retrieve Agreement Status information");
            List<String> glnList = extractGLNsFromRequest(agreementStatusRequest);
            logger.info("Found "+glnList.size()+" GLNs in the request");
            if(glnList.size() > 10000) {
                throw new Exception("Service can currently support only 10,000 GLNs per Request.");
            }
            List<AgreementStatusInfo> agreementStatusList = agreementStatusDao.getAgreementStatusInfo(glnList);
            HashMap<String, AgreementStatusInfo> normalizedStatusMap = normalizeAgreementStatusList(agreementStatusList);
            List<AgreementStatusInfo> agreementList = new ArrayList<AgreementStatusInfo>();
            agreementList.addAll(normalizedStatusMap.values());
            logger.info("Found Agreement Status for "+agreementList.size()+" GLNs");
            response = responseBuilder.getAgreementStatusResponse(agreementStatusRequest, agreementList);
        } catch (Exception e) {
            logger.error(e);
            new ErrorEmailer().sendErrorEmail(e, "Error occurred during getAgreementStatus() operation.");
            ExceptionType exceptionType = new ExceptionType();
            exceptionType.setFaultMessage(e.getMessage());
            throw new AgreementStatusFault("Error occurred during getAgreementStatus() operation", exceptionType, e);
        }

        return response;
    }

    // method is public only to be tested separately
    public List<String> extractGLNsFromRequest(AgreementStatusRequest request) {
        List<String> glns = new ArrayList<String>();
        List<AgreementStatusRequestDetailsType> requestDetails = request.getAgreementStatusRequestBody().getAgreementStatusRequestDetails();
        for (AgreementStatusRequestDetailsType requestDetailsType: requestDetails) {
            for(PartnerIdentifierType partnerIdentifierType : requestDetailsType.getPartnerIdentifier()) {
                if(ListPartnerAgencyAttribute.GLN.value().equalsIgnoreCase(partnerIdentifierType.getAgency())) {
                    glns.add(partnerIdentifierType.getValue());
                }
            }
        }
        return glns;
    }

    // method is public only to be tested separately
    public HashMap<String, AgreementStatusInfo> normalizeAgreementStatusList(List<AgreementStatusInfo> denormalizedStatusList) {
        HashMap<String, AgreementStatusInfo> normalizedStatusMap = new HashMap<String, AgreementStatusInfo>();
        List<AgreementInfo> agreementList = null;
        AgreementInfo agreementInfo;
        for(AgreementStatusInfo currentStatusInfo : denormalizedStatusList) {
            AgreementStatusInfo existingStatusInfo = normalizedStatusMap.get(currentStatusInfo.getGln());
            if(existingStatusInfo != null) {
                agreementList = existingStatusInfo.getAgreements();
                int existingAgreementIndex = findAgreementIndex(agreementList, currentStatusInfo.getTempAgreement().getAgreementName());
                if(existingAgreementIndex != -1) {
                    agreementList.get(existingAgreementIndex).getZones().add(currentStatusInfo.getTempAgreement().getTempZone());
                } else {
                    agreementInfo = currentStatusInfo.getTempAgreement();
                    agreementInfo.getZones().add(currentStatusInfo.getTempAgreement().getTempZone());
                    agreementList.add(agreementInfo);
                }
            } else {
                currentStatusInfo.getTempAgreement().getZones().add(currentStatusInfo.getTempAgreement().getTempZone());
                currentStatusInfo.getAgreements().add(currentStatusInfo.getTempAgreement());
                normalizedStatusMap.put(currentStatusInfo.getGln(), currentStatusInfo);
            }
        }
        return normalizedStatusMap;
    }

    private int findAgreementIndex(List<AgreementInfo> agreementList, String agreementName) {
        int agrIndex = -1;
        AgreementInfo agreementInfo = null;
        for(int index = 0; index < agreementList.size(); index++) {
            agreementInfo = agreementList.get(index);
            if(agreementInfo.getAgreementName().equalsIgnoreCase(agreementName)) {
                agrIndex = index;
                break;
            }
        }
        return agrIndex;
    }

    public void setAgreementStatusDao(AgreementStatusDao agreementStatusDao) {
        this.agreementStatusDao = agreementStatusDao;
    }

    public void setResponseBuilder(AgreementStatusResponseBuilder responseBuilder) {
        this.responseBuilder = responseBuilder;
    }

//    public List<AgreementStatusInfo> normalizeAgreementStatusList(List<AgreementStatusInfo> denormalizedStatusList) {
//        List<AgreementStatusInfo> normalizedStatusList = new ArrayList<AgreementStatusInfo>();
//        if(denormalizedStatusList!= null && denormalizedStatusList.size() > 0) {
//            AgreementStatusInfo prevStatusInfo = denormalizedStatusList.get(0);
//            AgreementInfo prevAgreementInfo = prevStatusInfo.getTempAgreement();
//            prevAgreementInfo.getZones().add(prevAgreementInfo.getTempZone());
//            prevStatusInfo.getAgreements().add(prevAgreementInfo);
//            //prevStatusInfo.getAgreements().add(prevStatusInfo.getTempAgreement());
//            if(denormalizedStatusList.size() == 1) {
//                normalizedStatusList.add(prevStatusInfo);
//            }
//            AgreementStatusInfo currentStatusInfo = null;
//            AgreementInfo currentAgreementInfo = null;
//            for(int index = 1; index < denormalizedStatusList.size(); index++) {
//                currentStatusInfo = denormalizedStatusList.get(index);
//                currentAgreementInfo = currentStatusInfo.getTempAgreement();
//                if(!currentStatusInfo.getGln().equals(prevStatusInfo.getGln())) {
//                    normalizedStatusList.add(prevStatusInfo);
//                    prevStatusInfo = currentStatusInfo;
//                    prevAgreementInfo = prevStatusInfo.getTempAgreement();
//                    prevAgreementInfo.getZones().add(prevAgreementInfo.getTempZone());
//                }
//                if(!prevAgreementInfo.getAgreementName().equals(currentAgreementInfo.getAgreementName())) {
//                    prevStatusInfo.getAgreements().add(prevAgreementInfo);
//                    prevAgreementInfo = currentAgreementInfo;
//                }
//                prevAgreementInfo.getZones().add(currentAgreementInfo.getTempZone());
//
//                if(index ==(denormalizedStatusList.size()-1)) {
//                    normalizedStatusList.add(prevStatusInfo);
//                }
//            }
//        }
//        return normalizedStatusList;
//    }

}

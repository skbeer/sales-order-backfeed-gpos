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

import java.util.*;

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
    private static final int MAX_LIMIT = 10000;
    private static final String SYSTEM_CODE_GLN = "GLN";
    private static final String SYSTEM_CODE_SAP = "SAP";
    private static final int MAP_FILTER_SIZE = 50;

    public AgreementStatusResponseType getAgreementStatus(AgreementStatusRequest agreementStatusRequest) throws AgreementStatusFault {
        AgreementStatusResponseType response;
        try {
            logger.info("Starting to retrieve Agreement Status information");
            List<String> glnList = extractGLNsFromRequest(agreementStatusRequest);
            checkLimitOfGLNs(glnList);
            List<String> assignedBySellerList = extractAssignedBySellersFromRequest(agreementStatusRequest);
            checkLimitOfAssignedBySellers(assignedBySellerList);
            List<AgreementStatusInfo> agreementStatusList = agreementStatusDao.getAgreementStatusInfo(glnList, assignedBySellerList);
            List<AgreementStatusInfo> filteredAgreementStatusList=filterByGLNORSAP(agreementStatusList);
            HashMap<String, AgreementStatusInfo> normalizedStatusMap = normalizeAgreementStatusList(filteredAgreementStatusList);
            List<AgreementStatusInfo> agreementList = new ArrayList<AgreementStatusInfo>();
            agreementList.addAll(normalizedStatusMap.values());
            logger.info("Found Agreement Status for "+agreementList.size()+" GLNs and ASSIGNED_BY_SELLERs");
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

    protected List<AgreementStatusInfo> filterByGLNORSAP(List<AgreementStatusInfo> agreementStatusList) {
        List<AgreementStatusInfo> filteredList=new ArrayList<AgreementStatusInfo>();
        String currentAcctKey=null;
        List<AgreementStatusInfo> agreementStatusListByAcctKey=null;
        for(AgreementStatusInfo currentStatusInfo : agreementStatusList) {
            if(isNewOrChangeInAcctKey(currentAcctKey, currentStatusInfo)){
                if(currentAcctKey!=null){
                    filteredList.addAll(processFilterByAccountKey(agreementStatusListByAcctKey));
                }
                currentAcctKey= getCurrentAccountKey(currentStatusInfo);
                agreementStatusListByAcctKey=new ArrayList<AgreementStatusInfo>();
            }
            agreementStatusListByAcctKey.add(currentStatusInfo);
        }
        filteredList.addAll(processFilterByAccountKey(agreementStatusListByAcctKey));
        return filteredList;
    }
    
    private boolean isNewOrChangeInAcctKey(String currentAcctKey, AgreementStatusInfo currentStatusInfo) {
        return currentAcctKey==null|| !currentAcctKey.equals(getCurrentAccountKey(currentStatusInfo));
    }

    private String getCurrentAccountKey(AgreementStatusInfo currentStatusInfo) {
        if(currentStatusInfo.getAcctId()!=null && currentStatusInfo.getSpeciesCode()!=null){
            return currentStatusInfo.getAcctId()+"||"+currentStatusInfo.getSpeciesCode();
        }
        throw new IllegalArgumentException();
    }

    private List<AgreementStatusInfo> processFilterByAccountKey(List<AgreementStatusInfo> agreementStatusListByAcctId){
            List<AgreementStatusInfo> filteredList=new ArrayList<AgreementStatusInfo>();
            Map<String,AgreementStatusInfo> idValueMap=new HashMap();
            for(AgreementStatusInfo currentStatusInfo : agreementStatusListByAcctId) {
                idValueMap.put(currentStatusInfo.getSystemTypeCode(),currentStatusInfo);
            }
            if(idValueMap.get(SYSTEM_CODE_GLN)!=null){
                filteredList.add(idValueMap.get(SYSTEM_CODE_GLN));
            }else if(idValueMap.get(SYSTEM_CODE_SAP)!=null){
                filteredList.add(idValueMap.get(SYSTEM_CODE_SAP));
            }
            return filteredList;
    }

    private void checkLimitOfGLNs(List<String> glnList) throws Exception {
        logger.info("Found "+glnList.size()+" GLNs in the request");
        if(glnList.size() > MAX_LIMIT) {
            throw new Exception("Service can currently support only "+MAX_LIMIT+" GLNs per Request.");
        }
    }

    private void checkLimitOfAssignedBySellers(List<String> assignedBySellerList) throws Exception {
        logger.info("Found "+assignedBySellerList.size()+" ASSIGNED_BY_SELLERs in the request");                                        
        if(assignedBySellerList.size() > MAX_LIMIT) {
            throw new Exception("Service can currently support only "+MAX_LIMIT+" ASSIGNED_BY_SELLERs per Request.");
        }
    }

    // method is public only to be tested separately
    public List<String> extractGLNsFromRequest(AgreementStatusRequest request) {
        List<String> glns = new ArrayList<String>();
        List<AgreementStatusRequestDetailsType> requestDetails = request.getAgreementStatusRequestBody().getAgreementStatusRequestDetails();
        for (AgreementStatusRequestDetailsType requestDetailsType: requestDetails) {
            List<PartnerIdentifierType> partnerIdentifierTypes=requestDetailsType.getPartnerIdentifier();
            if (isIgnoreGLN(partnerIdentifierTypes)) continue;
            for(PartnerIdentifierType partnerIdentifierType : partnerIdentifierTypes) {
                if(ListPartnerAgencyAttribute.GLN.value().equalsIgnoreCase(partnerIdentifierType.getAgency())) {
                    glns.add(partnerIdentifierType.getValue());
                }
            }
        }
        return glns;
    }

    private boolean isIgnoreGLN(List<PartnerIdentifierType> partnerIdentifierTypes) {
        for(PartnerIdentifierType partnerIdentifierType : partnerIdentifierTypes) {
            if(isAssignedBySellerPartnerAgency(partnerIdentifierType.getAgency())){
                return true;
            }
        }
        return false;
    }


    public List<String> extractAssignedBySellersFromRequest(AgreementStatusRequest request) {
        List<String> assignedBySellers = new ArrayList<String>();
        List<AgreementStatusRequestDetailsType> requestDetails = request.getAgreementStatusRequestBody().getAgreementStatusRequestDetails();
        for (AgreementStatusRequestDetailsType requestDetailsType: requestDetails) {
            for(PartnerIdentifierType partnerIdentifierType : requestDetailsType.getPartnerIdentifier()) {
                if(isAssignedBySellerPartnerAgency(partnerIdentifierType.getAgency())) {
                    assignedBySellers.add(partnerIdentifierType.getValue());
                }
            }
        }
        return assignedBySellers;
    }

    private boolean isAssignedBySellerPartnerAgency(String agency) {
        return ListPartnerAgencyAttribute.ASSIGNED_BY_SELLER.value().equalsIgnoreCase(agency);
    }

    // method is public only to be tested separately
    protected HashMap<String, AgreementStatusInfo> normalizeAgreementStatusList(List<AgreementStatusInfo> denormalizedStatusList) {
        HashMap<String, AgreementStatusInfo> normalizedStatusMap = new HashMap<String, AgreementStatusInfo>();
        List<AgreementInfo> agreementList = null;
        AgreementInfo agreementInfo;
        for(AgreementStatusInfo currentStatusInfo : denormalizedStatusList) {
            AgreementStatusInfo existingStatusInfo = normalizedStatusMap.get(currentStatusInfo.getAliasId());
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
                normalizedStatusMap.put(currentStatusInfo.getAliasId(), currentStatusInfo);
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



}

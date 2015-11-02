package com.monsanto.irdsoapservices.agreementstatuspartners.helper;

import com.monsanto.irdsoapservices.agreementstatus.dao.AgreementStatusDao;
import com.monsanto.irdsoapservices.agreementstatus.domain.AgreementInfo;
import com.monsanto.irdsoapservices.agreementstatus.domain.AgreementStatusInfo;
import com.monsanto.irdsoapservices.agreementstatus.domain.ZoneInfo;
import com.monsanto.irdsoapservices.agreementstatuspartners.domain.AgreementStatusRequestDetail;
import com.monsanto.irdsoapservices.agreementstatuspartners.domain.PartnerInformationRequest;
import com.monsanto.irdsoapservices.agreementstatuspartners.schema.AgreementStatusFault;
import com.monsanto.irdsoapservices.agreementstatuspartners.schema.*;
import com.monsanto.irdsoapservices.utils.ErrorEmailer;
import org.apache.log4j.Logger;

import java.util.*;

public class AgreementStatusHelper {

    public static final String FROM = "From";
    public static final String BUYER = "Buyer";
    public static final String SELLER = "Seller";
    public static final String SHIP_TO = "ShipTo";

    public static final String SYSTEM_CODE_GLN = "GLN";
    public static final String SYSTEM_CODE_IC = "IC";

    private Logger logger = Logger.getLogger(this.getClass());

    private AgreementStatusDao agreementStatusDao;
    private AgreementStatusResponseBuilder responseBuilder;

    public void setAgreementStatusDao(AgreementStatusDao agreementStatusDao) {
        this.agreementStatusDao = agreementStatusDao;
    }

    public void setResponseBuilder(AgreementStatusResponseBuilder responseBuilder) {
        this.responseBuilder = responseBuilder;
    }

    public AgreementStatusResponseType getAgreementStatus(AgreementStatusRequestType agreementStatusRequest) throws AgreementStatusFault {
        AgreementStatusResponseType response;
        try {

            PartnerInformationRequest from = extractFrom(agreementStatusRequest);
            Map<String, String> fromMapID = extractFromId(from);
            List<AgreementStatusRequestDetail> agreementStatusRequestDetailList=extractAgreementStatusRequestDetails(agreementStatusRequest);

            List<String> assignedBySellerList = extractAliasIdsFromRequest(ListPartnerAgencyAttribute.ASSIGNED_BY_SELLER.value(), agreementStatusRequestDetailList);

            List<String> glnList = extractAliasIdsFromRequest(ListPartnerAgencyAttribute.GLN.value(), agreementStatusRequestDetailList);
            if(fromMapID.containsKey(ListPartnerAgencyAttribute.GLN.value())){
                glnList.add(fromMapID.get(ListPartnerAgencyAttribute.GLN.value()));
            }

            List<String> icList = extractAliasIdsFromRequest(ListPartnerAgencyAttribute.AGIIS_EBID.value(), agreementStatusRequestDetailList);
            if(fromMapID.containsKey(ListPartnerAgencyAttribute.AGIIS_EBID.value())){
                icList.add(fromMapID.get(ListPartnerAgencyAttribute.AGIIS_EBID.value()));
            }
            List<AgreementStatusInfo> agreementStatusList = agreementStatusDao.getAgreementStatusInfo(icList, Collections.EMPTY_LIST, Arrays.asList(SYSTEM_CODE_IC));
            for(AgreementStatusInfo currentStatusInfo : agreementStatusList) {
                assignedBySellerList.add(currentStatusInfo.getAcctId());
            }
            if(fromMapID.containsKey(ListPartnerAgencyAttribute.ASSIGNED_BY_SELLER.value())){
                assignedBySellerList.add(fromMapID.get(ListPartnerAgencyAttribute.ASSIGNED_BY_SELLER.value()));
            }
            agreementStatusList = agreementStatusDao.getAgreementStatusInfo(glnList , assignedBySellerList, Arrays.asList(SYSTEM_CODE_GLN ,SYSTEM_CODE_IC));
            HashMap<String, AgreementStatusInfo> normalizedStatusMap = normalizeAgreementStatusList(agreementStatusList);
            List<AgreementStatusInfo> agreementListNormalized = new ArrayList<AgreementStatusInfo>();
            agreementListNormalized.addAll(normalizedStatusMap.values());
            Map<String, String> icCodeMap = filterIcCodes(agreementStatusList);
            response = responseBuilder.getAgreementStatusResponse(agreementStatusRequest.getHeader().getThisDocumentIdentifier().getDocumentIdentifier(),
                    from,agreementStatusRequestDetailList,
                    agreementListNormalized,icCodeMap);
        } catch (Exception e) {
            logger.error(e);
            new ErrorEmailer().sendErrorEmail(e, "Error occurred during getAgreementStatus() operation.");
            ExceptionType exceptionType = new ExceptionType();
            exceptionType.setFaultMessage(e.getMessage());
            throw new AgreementStatusFault("Error occurred during getAgreementStatus() operation", exceptionType, e);
        }

        return response;
    }

    private Map<String,String> filterIcCodes(List<AgreementStatusInfo> agreementStatusList) {
        Map<String,String> iCCodes = new HashMap<String,String>();
        List<String> assignedBySellerList = new ArrayList<String>();
        for(AgreementStatusInfo currentStatusInfo : agreementStatusList) {
            assignedBySellerList.add(currentStatusInfo.getAcctId());
        }
        List<AgreementStatusInfo> agreementStatusListIC = agreementStatusDao.getAgreementStatusInfo(new ArrayList<String>(), assignedBySellerList, Arrays.asList(SYSTEM_CODE_IC));
        for(AgreementStatusInfo currentStatusInfo : agreementStatusListIC) {
            iCCodes.put(currentStatusInfo.getAcctId(), currentStatusInfo.getAliasId());
        }
        return iCCodes;
    }

    //
    private PartnerInformationRequest extractFrom(AgreementStatusRequestType agreementStatusRequest) {
        return extractPartnerInformation(FROM, agreementStatusRequest.getHeader().getFrom().getPartnerInformation());
    }

    private Map<String, String> extractFromId(PartnerInformationRequest partnerInformationRequest){
        Map<String, String> result = new HashMap<String, String>();
        if(ListPartnerAgencyAttribute.GLN.value().equalsIgnoreCase(partnerInformationRequest.getAgency())){
            result.put(ListPartnerAgencyAttribute.GLN.value(),partnerInformationRequest.getId());
        }
        else if(ListPartnerAgencyAttribute.AGIIS_EBID.value().equalsIgnoreCase(partnerInformationRequest.getAgency())){
            result.put(ListPartnerAgencyAttribute.AGIIS_EBID.value(),partnerInformationRequest.getId());
        }
        else if(ListPartnerAgencyAttribute.ASSIGNED_BY_SELLER.value().equalsIgnoreCase(partnerInformationRequest.getAgency())){
            result.put(ListPartnerAgencyAttribute.ASSIGNED_BY_SELLER.value(),partnerInformationRequest.getId());
        }
        return result;
    }

    private List<com.monsanto.irdsoapservices.agreementstatuspartners.domain.AgreementStatusRequestDetail> extractAgreementStatusRequestDetails(AgreementStatusRequestType agreementStatusRequest) {
        List<com.monsanto.irdsoapservices.agreementstatuspartners.domain.AgreementStatusRequestDetail>  domainRequests = new ArrayList<com.monsanto.irdsoapservices.agreementstatuspartners.domain.AgreementStatusRequestDetail>();
        List<AgreementStatusRequestBodyType> agreementStatusRequestBodyList = agreementStatusRequest.getAgreementStatusRequestBody();
        for (AgreementStatusRequestBodyType agreementStatusRequestBodyType : agreementStatusRequestBodyList){
            AgreementStatusRequestPartnersType agreementStatusRequestPartnersType = agreementStatusRequestBodyType.getAgreementStatusRequestPartners();
            if(agreementStatusRequestPartnersType!= null) {
                PartnerInformationRequest buyer = agreementStatusRequestPartnersType.getBuyer() == null ?null: extractPartnerInformation(BUYER, agreementStatusRequestPartnersType.getBuyer().getPartnerInformation());
                PartnerInformationRequest seller = agreementStatusRequestPartnersType.getSeller() == null ?null: extractPartnerInformation(SELLER, agreementStatusRequestPartnersType.getSeller().getPartnerInformation());
                PartnerInformationRequest shipTo = agreementStatusRequestPartnersType.getShipTo() == null ?null:extractPartnerInformation(SHIP_TO, agreementStatusRequestPartnersType.getShipTo().getPartnerInformation());
                AgreementStatusRequestDetail agreementStatusRequestDetail = new AgreementStatusRequestDetail(buyer,seller,shipTo);
                domainRequests.add(agreementStatusRequestDetail);
            }
        }
        return domainRequests;
    }

    private PartnerInformationRequest extractPartnerInformation(String element, com.monsanto.irdsoapservices.agreementstatuspartners.schema.PartnerInformationType partnerInformationType){
       return new PartnerInformationRequest(element, partnerInformationType.getPartnerName() ,partnerInformationType.getPartnerIdentifier().get(0).getAgency().value(),
               partnerInformationType.getPartnerIdentifier().get(0).getValue());
    }

    private List<String> extractAliasIdsFromRequest(String agency, List<AgreementStatusRequestDetail> agreementStatusRequestDetailList){
        List<String> aliasIds = new ArrayList<String>();
        for(AgreementStatusRequestDetail agreementStatusRequestDetail:agreementStatusRequestDetailList){
            if(agreementStatusRequestDetail.getBuyer() != null &&agency.equalsIgnoreCase(agreementStatusRequestDetail.getBuyer().getAgency())){
                aliasIds.add(agreementStatusRequestDetail.getBuyer().getId());
            }
            if(agreementStatusRequestDetail.getSeller() != null &&agency.equalsIgnoreCase(agreementStatusRequestDetail.getSeller().getAgency())){
                aliasIds.add(agreementStatusRequestDetail.getSeller().getId());
            }
            if(agreementStatusRequestDetail.getShipTo() != null &&agency.equalsIgnoreCase(agreementStatusRequestDetail.getShipTo().getAgency())){
                aliasIds.add(agreementStatusRequestDetail.getShipTo().getId());
            }
        }
        return aliasIds;
    }

    private HashMap<String, AgreementStatusInfo> normalizeAgreementStatusList(List<AgreementStatusInfo> denormalizedStatusList) {
        HashMap<String, AgreementStatusInfo> normalizedStatusMap = new HashMap<String, AgreementStatusInfo>();
        List<AgreementInfo> agreementList = null;
        for(AgreementStatusInfo currentStatusInfo : denormalizedStatusList) {
            AgreementStatusInfo existingStatusInfo = normalizedStatusMap.get(currentStatusInfo.getAcctId());
            if(existingStatusInfo != null) {
                agreementList = existingStatusInfo.getAgreements();
                if(!agreementList.contains(currentStatusInfo.getTempAgreement())){
                    AgreementInfo agreementInfo = currentStatusInfo.getTempAgreement();
                    agreementInfo.getZones().add(agreementInfo.getTempZone());
                    agreementList.add(agreementInfo);
                }
                else{
                    AgreementInfo current =agreementList.get(agreementList.indexOf(currentStatusInfo.getTempAgreement()));
                    List<ZoneInfo> zoneList = current.getZones();
                    if(!zoneList.contains(currentStatusInfo.getTempAgreement().getTempZone())){
                        zoneList.add(currentStatusInfo.getTempAgreement().getTempZone());
                    }
                }
            } else {
                AgreementInfo agreementInfo = currentStatusInfo.getTempAgreement();
                agreementInfo.getZones().add(agreementInfo.getTempZone());
                currentStatusInfo.getAgreements().add(agreementInfo);
                normalizedStatusMap.put(currentStatusInfo.getAcctId(), currentStatusInfo);
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


}
package com.monsanto.irdsoapservices.agreementstatuspartners.helper;


import com.monsanto.irdsoapservices.agreementstatus.domain.AgreementInfo;
import com.monsanto.irdsoapservices.agreementstatus.domain.AgreementStatusInfo;
import com.monsanto.irdsoapservices.agreementstatus.domain.ZoneInfo;
import com.monsanto.irdsoapservices.agreementstatuspartners.domain.AgreementStatusRequestDetail;
import com.monsanto.irdsoapservices.agreementstatuspartners.domain.PartnerInformationRequest;
import com.monsanto.irdsoapservices.agreementstatuspartners.schema.*;
import com.monsanto.irdsoapservices.salesorder.constants.XmlConstants;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import java.util.*;

public class AgreementStatusResponseBuilder {

    public AgreementStatusResponseType getAgreementStatusResponse(String documentIdentifier, PartnerInformationRequest from,List<AgreementStatusRequestDetail> agreementStatusRequestDetailList,List<AgreementStatusInfo> agreementStatusList,
                                                                  Map<String, String> icCodeMap) {
        AgreementStatusResponseType response = new AgreementStatusResponseType();
        response.setHeader(getHeaderType(documentIdentifier,from,agreementStatusList,icCodeMap));
        createResponseBody(response,agreementStatusRequestDetailList,agreementStatusList,icCodeMap);
        return response;
    }

    private void createResponseBody(AgreementStatusResponseType response, List<AgreementStatusRequestDetail> agreementStatusRequestDetailList,List<AgreementStatusInfo> agreementStatusList,
                                    Map<String, String> icCodeMap){


        //List<AgreementStatusListType> agreementStatusList;

        for (AgreementStatusRequestDetail agreementStatusRequestDetail:agreementStatusRequestDetailList){
            PartnerInformationType partnerInformationType = null;
            AgreementStatusResponseBodyType agreementStatusResponseBody = new AgreementStatusResponseBodyType();
            AgreementStatusResponsePartnersType agreementPartners = new AgreementStatusResponsePartnersType();
            AgreementStatusResponsePropertiesType agreementStatusResponsePropertiesType = new AgreementStatusResponsePropertiesType();
            PartnerInformationRequest partnerInformationRequest = agreementStatusRequestDetail.getBuyer();
            AgreementStatusInfo agreementStatusInfo = getAcctId(partnerInformationRequest,agreementStatusList,icCodeMap);
            String acctID =agreementStatusInfo ==null?null:agreementStatusInfo.getAcctId();
            if(acctID!=null){
                partnerInformationType = getPartnerInformationForHeader(getName(acctID,agreementStatusList),
                        getGLN(acctID,agreementStatusList),ListPartnerAgencyAttribute.GLN,
                        acctID,ListPartnerAgencyAttribute.ASSIGNED_BY_SELLER,
                        getAGIISEBID(acctID, icCodeMap), ListPartnerAgencyAttribute.AGIIS_EBID);
                BuyerType buyer = new BuyerType();
                buyer.setPartnerInformation(partnerInformationType);
                agreementPartners.setBuyer(buyer);

            }
            partnerInformationRequest = agreementStatusRequestDetail.getSeller();
            agreementStatusInfo = getAcctId(partnerInformationRequest,agreementStatusList,icCodeMap);
            acctID = (agreementStatusInfo ==null?null:agreementStatusInfo.getAcctId());
            if(acctID!=null){
                partnerInformationType = getPartnerInformationForHeader(getName(acctID,agreementStatusList),
                        getGLN(acctID,agreementStatusList),ListPartnerAgencyAttribute.GLN,
                        acctID,ListPartnerAgencyAttribute.ASSIGNED_BY_SELLER,
                        getAGIISEBID(acctID, icCodeMap), ListPartnerAgencyAttribute.AGIIS_EBID);
                SellerType seller = new SellerType();
                seller.setPartnerInformation(partnerInformationType);
                agreementPartners.setSeller(seller);

            }
            partnerInformationRequest = agreementStatusRequestDetail.getShipTo();
            agreementStatusInfo = getAcctId(partnerInformationRequest,agreementStatusList,icCodeMap);
            acctID =agreementStatusInfo ==null?null:agreementStatusInfo.getAcctId();
            if(acctID!=null){
                partnerInformationType = getPartnerInformationForHeader(getName(acctID,agreementStatusList),
                        getGLN(acctID,agreementStatusList),ListPartnerAgencyAttribute.GLN,
                        acctID,ListPartnerAgencyAttribute.ASSIGNED_BY_SELLER,
                        getAGIISEBID(acctID, icCodeMap), ListPartnerAgencyAttribute.AGIIS_EBID);
                ShipToType shipTo = new ShipToType();
                shipTo.setPartnerInformation(partnerInformationType);
                agreementPartners.setShipTo(shipTo);
                for(AgreementInfo agreementInfo : agreementStatusInfo.getAgreements()) {
                    for(ZoneInfo zoneInfo : agreementInfo.getZones()) {
                        AgreementStatusListType agreementStatusListType = new AgreementStatusListType();
                        agreementStatusListType.setAgreementName(agreementInfo.getAgreementName());
                        agreementStatusListType.setAgreementStatus(agreementInfo.getAgreementStatus());
                        agreementStatusListType.setLicenseNumber(agreementInfo.getLicenseNumber());
                        agreementStatusListType.getZone().add(getZoneType(zoneInfo));
                        agreementStatusResponsePropertiesType.getAgreementStatusList().add(agreementStatusListType);
                    }

                }
                agreementStatusResponseBody.setAgreementStatusResponseProperties(agreementStatusResponsePropertiesType);
            }
            else{
                if(agreementStatusRequestDetail.getShipTo()!=null   ) {
                    partnerInformationType = getPartnerInformationForHeader(agreementStatusRequestDetail.getShipTo().getName(), agreementStatusRequestDetail.getShipTo().getId(),
                            agreementStatusRequestDetail.getShipTo().getAgency());
                    ShipToType shipTo = new ShipToType();
                    shipTo.setPartnerInformation(partnerInformationType);
                    agreementPartners.setShipTo(shipTo);
                }

            }

            //

            agreementStatusResponseBody.setAgreementStatusResponsePartners(agreementPartners);
            response.getAgreementStatusResponseBody().add(agreementStatusResponseBody);

        }
    }

    private HeaderType getHeaderType(String documentIdentifier,PartnerInformationRequest from,List<AgreementStatusInfo> agreementStatusList,
                                     Map<String, String> icCodeMap) {
        HeaderType headerType = new HeaderType();

        FromType fromType = new FromType();
        PartnerInformationType partnerInformationType = getPartnerInformationForHeader(XmlConstants.MONSANTO_PARTNER_NAME,
                XmlConstants.MONSANTO_GLN,ListPartnerAgencyAttribute.GLN,
                XmlConstants.MONSANTO_ASSIGNED_BY_SELLER,ListPartnerAgencyAttribute.ASSIGNED_BY_SELLER,
                XmlConstants.MONSANTO_EBID, ListPartnerAgencyAttribute.AGIIS_EBID);
        fromType.setPartnerInformation(partnerInformationType);
        ///
        ToType toType = new ToType();
        AgreementStatusInfo agreementStatusInfo = getAcctId(from,agreementStatusList,icCodeMap);
        String acctID =agreementStatusInfo ==null?null:agreementStatusInfo.getAcctId();
        if(acctID==null){
            partnerInformationType = getPartnerInformationForHeader(from.getName(),from.getId(),from.getAgency());
        }
        else{
            partnerInformationType = getPartnerInformationForHeader(getName(acctID,agreementStatusList),
                    getGLN(acctID,agreementStatusList),ListPartnerAgencyAttribute.GLN,
                    acctID,ListPartnerAgencyAttribute.ASSIGNED_BY_SELLER,
                    getAGIISEBID(acctID, icCodeMap), ListPartnerAgencyAttribute.AGIIS_EBID);
        }

        toType.setPartnerInformation(partnerInformationType);
        ///
        ThisDocumentIdentifierType thisDocumentIdentifierType = new ThisDocumentIdentifierType();
        thisDocumentIdentifierType.setDocumentIdentifier(documentIdentifier);

        ThisDocumentDateTimeType thisDocumentDateTimeType = new ThisDocumentDateTimeType();
        thisDocumentDateTimeType.setDateTime(getDateTimeType(new Date()));

        headerType.setFrom(fromType);
        headerType.setTo(toType);
        headerType.setThisDocumentIdentifier(thisDocumentIdentifierType);
        headerType.setThisDocumentDateTime(thisDocumentDateTimeType);
        return headerType;
    }

    private DateTimeType getDateTimeType(Date date) {
        DateTimeType dateTimeType = new DateTimeType();
        dateTimeType.setDateTimeQualifier(ListDateQualifier.ON);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        dateTimeType.setValue(new XMLGregorianCalendarImpl(gregorianCalendar));
        return dateTimeType;
    }

    private PartnerInformationType getPartnerInformationForHeader(String partnerName,
                                                                  String partnerGLN, ListPartnerAgencyAttribute agencyGLN,
                                                                  String partnerAssignedBySeller, ListPartnerAgencyAttribute agencyAssignedBySeller,
                                                                  String partnerEbid, ListPartnerAgencyAttribute agencyEbid) {
        PartnerInformationType partnerInformationType = new PartnerInformationType();
        if( partnerName != null){
            partnerInformationType.setPartnerName(partnerName);
        }

        if(partnerGLN!=null && !partnerGLN.equals("")){
            partnerInformationType.getPartnerIdentifier().add(getPartnerIdentifierType(partnerGLN, agencyGLN));
        }
        if(partnerAssignedBySeller!=null){
            partnerInformationType.getPartnerIdentifier().add(getPartnerIdentifierType(partnerAssignedBySeller, agencyAssignedBySeller));
        }
        if(partnerEbid!=null){
            partnerInformationType.getPartnerIdentifier().add(getPartnerIdentifierType(partnerEbid, agencyEbid));
        }
        return partnerInformationType;
    }


    private PartnerInformationType getPartnerInformationForHeader(String partnerName,
                                                                  String partnerID, String agency) {
        PartnerInformationType partnerInformationType = new PartnerInformationType();
        if( partnerName != null){
            partnerInformationType.setPartnerName(partnerName);
        }
        if(ListPartnerAgencyAttribute.GLN.value().equalsIgnoreCase(agency)){
            partnerInformationType.getPartnerIdentifier().add(getPartnerIdentifierType(partnerID, ListPartnerAgencyAttribute.GLN));
        }
        if(ListPartnerAgencyAttribute.ASSIGNED_BY_SELLER.value().equalsIgnoreCase(agency)){
            partnerInformationType.getPartnerIdentifier().add(getPartnerIdentifierType(partnerID, ListPartnerAgencyAttribute.ASSIGNED_BY_SELLER));
        }
        if(ListPartnerAgencyAttribute.AGIIS_EBID.value().equalsIgnoreCase(agency)){
            partnerInformationType.getPartnerIdentifier().add(getPartnerIdentifierType(partnerID, ListPartnerAgencyAttribute.AGIIS_EBID));
        }
        return partnerInformationType;
    }

    private PartnerIdentifierType getPartnerIdentifierType(String partnerId, ListPartnerAgencyAttribute agency) {
        PartnerIdentifierType partnerIdentifierType = new PartnerIdentifierType();
        partnerIdentifierType.setAgency(agency);
        partnerIdentifierType.setValue(partnerId);
        return partnerIdentifierType;
    }

    private AgreementStatusInfo getAcctId(PartnerInformationRequest partnerInformationRequest, List<AgreementStatusInfo> agreementStatusList, Map<String, String> icCodeMap){
        if(partnerInformationRequest!=null) {
            if (ListPartnerAgencyAttribute.ASSIGNED_BY_SELLER.value().equalsIgnoreCase(partnerInformationRequest.getAgency())) {
                for (AgreementStatusInfo agreementStatusInfo : agreementStatusList) {
                    if (partnerInformationRequest.getId().equalsIgnoreCase(agreementStatusInfo.getAcctId())) {
                        return agreementStatusInfo;
                    }
                }
            } else if (ListPartnerAgencyAttribute.GLN.value().equalsIgnoreCase(partnerInformationRequest.getAgency())) {
                for (AgreementStatusInfo agreementStatusInfo : agreementStatusList) {
                    if (AgreementStatusHelper.SYSTEM_CODE_GLN.equals(agreementStatusInfo.getSystemTypeCode()) && partnerInformationRequest.getId().equalsIgnoreCase(agreementStatusInfo.getAliasId())) {
                        return agreementStatusInfo;
                    }
                }
            } else if (ListPartnerAgencyAttribute.AGIIS_EBID.value().equalsIgnoreCase(partnerInformationRequest.getAgency())) {
                String accountID = "";
                for (String key : icCodeMap.keySet()) {
                    if (icCodeMap.get(key).equalsIgnoreCase(partnerInformationRequest.getId())) {
                        accountID = key;
                    }
                }
                for (AgreementStatusInfo agreementStatusInfo : agreementStatusList) {
                    if (accountID.equalsIgnoreCase(agreementStatusInfo.getAcctId())) {
                        return agreementStatusInfo;
                    }
                }

            }
        }
       return null;

    }

    private String getName(String acctId, List<AgreementStatusInfo> agreementStatusList){
        for (AgreementStatusInfo agreementStatusInfo: agreementStatusList){
            if(agreementStatusInfo.getAcctId().equalsIgnoreCase(acctId)){
                return agreementStatusInfo.getPartnerName();
            }
        }
        return null;
    }

    private String getGLN(String acctId, List<AgreementStatusInfo> agreementStatusList){
        for (AgreementStatusInfo agreementStatusInfo: agreementStatusList){
            if(AgreementStatusHelper.SYSTEM_CODE_GLN.equals(agreementStatusInfo.getSystemTypeCode()) && agreementStatusInfo.getAcctId().equalsIgnoreCase(acctId)){
                return agreementStatusInfo.getAliasId();
            }
        }
        return null;
    }


    private String getAGIISEBID(String acctId,  Map<String, String> icCodeMap){
        return icCodeMap.get(acctId);
    }



    private ZoneType getZoneType(ZoneInfo zoneInfo) {
        ZoneType zoneType = new ZoneType();
        zoneType.setZoneID(zoneInfo.getZoneId());
        zoneType.setZoneType(zoneInfo.getZoneType());
        zoneType.setZoneName(zoneInfo.getZoneName());
        zoneType.setProductClassification(zoneInfo.getCropCode());
        zoneType.setProductDescription(zoneInfo.getCropName());
        return zoneType;
    }

}

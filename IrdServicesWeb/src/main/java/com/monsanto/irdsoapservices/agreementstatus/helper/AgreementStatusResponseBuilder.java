package com.monsanto.irdsoapservices.agreementstatus.helper;

import com.monsanto.irdsoapservices.agreementstatus.domain.AgreementInfo;
import com.monsanto.irdsoapservices.agreementstatus.domain.AgreementStatusInfo;
import com.monsanto.irdsoapservices.agreementstatus.domain.ZoneInfo;
import com.monsanto.irdsoapservices.agreementstatus.schema.response.*;
import com.monsanto.irdsoapservices.agreementstatus.schema.request.AgreementStatusRequest;
import com.monsanto.irdsoapservices.salesorder.constants.XmlConstants;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;                         

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jul 12, 2010
 * Time: 12:28:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class AgreementStatusResponseBuilder {

    public AgreementStatusResponseType getAgreementStatusResponse(AgreementStatusRequest request, List<AgreementStatusInfo> agreementList) {
        AgreementStatusResponseType response = new AgreementStatusResponseType();
        response.setHeader(getHeaderType(request));
        response.setAgreementStatusResponseBody(getResponseBody(agreementList));
        return response;
    }

    private AgreementStatusResponseBodyType getResponseBody(List<AgreementStatusInfo> agreementList) {
        AgreementStatusResponseBodyType agreementStatusResponseBodyType = new AgreementStatusResponseBodyType();
        for(AgreementStatusInfo agreementStatusInfo: agreementList) {
            agreementStatusResponseBodyType.getAgreementStatusResponseDetails().add(getAgreementStatusResponseDetails(agreementStatusInfo));
        }
        return agreementStatusResponseBodyType;
    }

    private AgreementStatusResponseDetails getAgreementStatusResponseDetails(AgreementStatusInfo agreementStatusInfo) {
        AgreementStatusResponseDetails agreementStatusResponseDetails = new AgreementStatusResponseDetails();
        agreementStatusResponseDetails.setPartnerInformation(getPartnerInformationForBody(agreementStatusInfo.getPartnerName(),
                agreementStatusInfo.getAliasId(), agreementStatusInfo.getSystemTypeCode(), agreementStatusInfo.getAcctId(), agreementStatusInfo.getContactName()));
        for(AgreementInfo agreementInfo : agreementStatusInfo.getAgreements()) {
            agreementStatusResponseDetails.getAgreementStatusList().add(getAgreementStatusListType(agreementInfo));
        }
        return agreementStatusResponseDetails;
    }

    private AgreementStatusListType getAgreementStatusListType(AgreementInfo agreementInfo) {
        AgreementStatusListType agreementStatusListType = new AgreementStatusListType();
        agreementStatusListType.setAgreementName(agreementInfo.getAgreementName());
        agreementStatusListType.setAgreementStatus(agreementInfo.getAgreementStatus());
        agreementStatusListType.setLicenseNumber(agreementInfo.getLicenseNumber());
        for(ZoneInfo zoneInfo : agreementInfo.getZones()) {
            agreementStatusListType.getZone().add(getZoneType(zoneInfo));
        }
        return agreementStatusListType;
    }

    private ZoneType getZoneType(ZoneInfo zoneInfo) {
        ZoneType zoneType = new ZoneType();
        zoneType.setZoneID(zoneInfo.getZoneId());
        zoneType.setZoneType(zoneInfo.getZoneType());
        zoneType.setZoneName(zoneInfo.getZoneName());
        zoneType.setProductCropCode(zoneInfo.getCropCode());
        zoneType.setProductCrop(zoneInfo.getCropName());
        return zoneType;
    }

    private PartnerInformationType getPartnerInformationForBody(String partnerName, String gln,String systemTypeCode, String acctId, String contactName) {
        PartnerInformationType partnerInformationType =null;
        if(systemTypeCode!=null && systemTypeCode.equals(ListPartnerAgencyAttribute.GLN.value())){
              partnerInformationType = getPartnerInformationForHeader(partnerName, gln, ListPartnerAgencyAttribute.GLN);
        }else {
              partnerInformationType = getPartnerInformationForHeader(partnerName);            
        }

        partnerInformationType.getPartnerIdentifier().add(getPartnerIdentifierType(acctId, ListPartnerAgencyAttribute.ASSIGNED_BY_SELLER));
        ContactInformationType contactInformationType = new ContactInformationType();
        contactInformationType.getContactName().add(contactName);
        partnerInformationType.getContactInformation().add(contactInformationType);
        return partnerInformationType;
    }

    private HeaderType getHeaderType(AgreementStatusRequest request) {
        HeaderType headerType = new HeaderType();
        FromType fromType = new FromType();
        PartnerInformationType partnerInformationType = getPartnerInformationForHeader(XmlConstants.MONSANTO_PARTNER_NAME, XmlConstants.MONSANTO_EBID, ListPartnerAgencyAttribute.AGIIS_EBID);
        fromType.setPartnerInformation(partnerInformationType);

        ToType toType = new ToType();
        partnerInformationType = getPartnerInformationForHeader(request.getHeader().getFrom().getPartnerInformation().getPartnerName().get(0),
                request.getHeader().getFrom().getPartnerInformation().getPartnerIdentifier().getValue(),
                ListPartnerAgencyAttribute.fromValue(request.getHeader().getFrom().getPartnerInformation().getPartnerIdentifier().getAgency()));
        toType.setPartnerInformation(partnerInformationType);

        ThisDocumentIdentifierType thisDocumentIdentifierType = new ThisDocumentIdentifierType();
        thisDocumentIdentifierType.setDocumentIdentifier(request.getHeader().getThisDocumentIdentifier().getDocumentIdentifier());

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
    private PartnerInformationType getPartnerInformationForHeader(String partnerName) {
        PartnerInformationType partnerInformationType = new PartnerInformationType();
        partnerInformationType.getPartnerName().add(partnerName);
        return partnerInformationType;
    }
    private PartnerInformationType getPartnerInformationForHeader(String partnerName, String partnerEbid, ListPartnerAgencyAttribute agency) {
        PartnerInformationType partnerInformationType = new PartnerInformationType();
        partnerInformationType.getPartnerName().add(partnerName);
        partnerInformationType.getPartnerIdentifier().add(getPartnerIdentifierType(partnerEbid, agency));
        return partnerInformationType;
    }

    private PartnerIdentifierType getPartnerIdentifierType(String partnerEbid, ListPartnerAgencyAttribute agency) {
        PartnerIdentifierType partnerIdentifierType = new PartnerIdentifierType();
        partnerIdentifierType.setAgency(agency);
        partnerIdentifierType.setValue(partnerEbid);
        return partnerIdentifierType;
    }


}

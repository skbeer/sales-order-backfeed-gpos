package com.monsanto.irdsoapservices.agreementstatus.service;

import com.monsanto.irdsoapservices.agreementstatus.schema.response.AgreementStatusResponseType;
import com.monsanto.irdsoapservices.agreementstatus.schema.request.*;
import com.monsanto.irdsoapservices.salesorder.constants.XmlConstants;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import junit.framework.TestCase;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jul 12, 2010
 * Time: 4:12:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class AgreementStatusServiceImpl_AT extends TestCase {

    public void testGetAgreementStatus() throws Exception {
        AgreementStatusServiceImpl serviceImpl = new AgreementStatusServiceImpl();
        AgreementStatusResponseType responseType = serviceImpl.getAgreementStatus(getRequest());
        assertNotNull(responseType);
        assertTrue("Agreement Status expected.", (responseType.getAgreementStatusResponseBody().getAgreementStatusResponseDetails().size()>0));
//        JAXBContext jxContext = JAXBContext.newInstance("com.monsanto.irdsoapservices.agreementstatus.schema.response");
//        Marshaller marshaller = jxContext.createMarshaller();
//        com.monsanto.irdsoapservices.agreementstatus.schema.response.ObjectFactory objectFactory = new com.monsanto.irdsoapservices.agreementstatus.schema.response.ObjectFactory();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));
//        marshaller.marshal(objectFactory.createAgreementStatusResponse(responseType), new FileOutputStream("c:\\some.xml"));
    }

    private AgreementStatusRequest getRequest() {
        AgreementStatusRequest request = new AgreementStatusRequest();
        request.setHeader(getHeaderType());
        AgreementStatusRequestDetailsType detailsType = new AgreementStatusRequestDetailsType();
        detailsType.setStateOrProvince("MO");
        detailsType.getPartnerIdentifier().add(getPartnerIdentifierType("0629245000011", "GLN"));
        AgreementStatusRequestBodyType bodyType = new AgreementStatusRequestBodyType();
        bodyType.getAgreementStatusRequestDetails().add(detailsType);
        request.setAgreementStatusRequestBody(bodyType);
        return request;
    }

    private HeaderType getHeaderType() {
        HeaderType headerType = new HeaderType();
        FromType fromType = new FromType();
        PartnerInformationType partnerInformationType = getPartnerInformationForHeader(XmlConstants.MONSANTO_PARTNER_NAME, XmlConstants.MONSANTO_EBID, "AGIIS-EBID");
        fromType.setPartnerInformation(partnerInformationType);

        ToType toType = new ToType();
        partnerInformationType = getPartnerInformationForHeader("A Partner", "1001", "GLN");
        toType.setPartnerInformation(partnerInformationType);

        ThisDocumentIdentifierType thisDocumentIdentifierType = new ThisDocumentIdentifierType();
        thisDocumentIdentifierType.setDocumentIdentifier("");

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
        dateTimeType.setDateTimeQualifier("ON");
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        dateTimeType.setValue(new XMLGregorianCalendarImpl(gregorianCalendar));
        return dateTimeType;
    }

    private PartnerInformationType getPartnerInformationForHeader(String partnerName, String partnerEbid, String agency) {
        PartnerInformationType partnerInformationType = new PartnerInformationType();
        partnerInformationType.getPartnerName().add(partnerName);
        partnerInformationType.setPartnerIdentifier(getPartnerIdentifierType(partnerEbid, agency));
        return partnerInformationType;
    }

    private PartnerIdentifierType getPartnerIdentifierType(String partnerEbid, String agency) {
        PartnerIdentifierType partnerIdentifierType = new PartnerIdentifierType();
        partnerIdentifierType.setAgency(agency);
        partnerIdentifierType.setValue(partnerEbid);
        return partnerIdentifierType;
    }


}

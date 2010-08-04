package com.monsanto.agreementstatus.helper;

import com.monsanto.irdsoapservices.agreementstatus.domain.AgreementInfo;
import com.monsanto.irdsoapservices.agreementstatus.domain.AgreementStatusInfo;
import com.monsanto.irdsoapservices.agreementstatus.domain.ZoneInfo;
import com.monsanto.irdsoapservices.agreementstatus.helper.AgreementStatusResponseBuilder;
import com.monsanto.irdsoapservices.salesorder.constants.XmlConstants;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jul 12, 2010
 * Time: 3:22:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class AgreementStatusResponseBuilder_UT extends TestCase {

    AgreementStatusResponseBuilder builder = new AgreementStatusResponseBuilder();

    public void testCreateAgreementStatusResponse() throws Exception {
        AgreementStatusRequest request = new AgreementStatusRequest();
        request.setHeader(getHeaderType());
        AgreementStatusResponseType responseType = builder.getAgreementStatusResponse(request, getAgreements());
        assertNotNull(responseType);
        assertEquals("MONSANTO AGRICULTURAL CO", responseType.getHeader().getFrom().getPartnerInformation().getPartnerName().get(0));
        assertEquals("A Partner", responseType.getHeader().getTo().getPartnerInformation().getPartnerName().get(0));        
        assertEquals(2, responseType.getAgreementStatusResponseBody().getAgreementStatusResponseDetails().size());
        assertEquals(2, responseType.getAgreementStatusResponseBody().getAgreementStatusResponseDetails().get(0).getAgreementStatusList().size());
        assertEquals(1, responseType.getAgreementStatusResponseBody().getAgreementStatusResponseDetails().get(0).getAgreementStatusList().get(0).getZone().size());
        assertEquals(2, responseType.getAgreementStatusResponseBody().getAgreementStatusResponseDetails().get(0).getAgreementStatusList().get(1).getZone().size());

//        JAXBContext jxContext = JAXBContext.newInstance("com.monsanto.irdsoapservices.agreementstatus.schema.response");
//        Marshaller marshaller = jxContext.createMarshaller();
//        ObjectFactory objectFactory = new ObjectFactory();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));
//        marshaller.marshal(objectFactory.createAgreementStatusResponse(responseType), new FileOutputStream("c:\\some.xml"));
    }

    private HeaderType getHeaderType() {
        HeaderType headerType = new HeaderType();
        FromType fromType = new FromType();
        PartnerInformationType partnerInformationType = getPartnerInformationForHeader("A Partner", "1001", "GLN");
        fromType.setPartnerInformation(partnerInformationType);

        ToType toType = new ToType();
        partnerInformationType = getPartnerInformationForHeader(XmlConstants.MONSANTO_PARTNER_NAME, XmlConstants.MONSANTO_EBID, "AGIIS-EBID");
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


    private List<AgreementStatusInfo> getAgreements() {
        List<AgreementStatusInfo> agreementList = new ArrayList<AgreementStatusInfo>();
        agreementList.add(getAgreementStatusInfo("1001", new String[]{"MTA1", "MTA2"}, new int[]{1,2}));
        agreementList.add(getAgreementStatusInfo("2001", new String[]{"MTA3", "MTA4"}, new int[]{1,2}));
        return agreementList;
    }

    private AgreementStatusInfo getAgreementStatusInfo(String gln, String[] agreements, int[] zoneCount) {
        AgreementStatusInfo agrStatusInfo = new AgreementStatusInfo();
        agrStatusInfo.setGln(gln);
        agrStatusInfo.setAcctId(gln);
        agrStatusInfo.setPartnerName("Good Partner");
        agrStatusInfo.setContactName("Nice Contact");
        for (int i = 0; i < agreements.length; i++) {
            agrStatusInfo.getAgreements().add(getAgreementInfo(agreements[i], zoneCount[i]));
        }
        return agrStatusInfo;
    }

    private AgreementInfo getAgreementInfo(String agreementName, int zoneCount) {
        AgreementInfo agreementInfo = new AgreementInfo();
        agreementInfo.setAgreementName(agreementName);
        agreementInfo.setAgreementStatus("Licensed");
        agreementInfo.setLicenseNumber("203");
        for (int i = 0; i < zoneCount; i++) {
            ZoneInfo zoneInfo = new ZoneInfo();
            zoneInfo.setZoneName("Zone "+i);
            zoneInfo.setZoneId("ID "+i);
            zoneInfo.setZoneType("Type "+i);
            agreementInfo.getZones().add(zoneInfo);
        }
        return agreementInfo;
    }

}

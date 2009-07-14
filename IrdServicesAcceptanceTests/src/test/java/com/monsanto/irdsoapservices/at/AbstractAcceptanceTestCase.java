package com.monsanto.irdsoapservices.at;

import junit.framework.TestCase;
import com.monsanto.irdsoapservices.client.AccountInformationService_Service;
import com.monsanto.irdsoapservices.client.AccountInformationService;
import com.monsanto.irdsoapservices.agreements.client.AccountAgreementService_Service;
import com.monsanto.irdsoapservices.agreements.client.AccountAgreementService;
import com.monsanto.irdsoapservices.brands.client.BrandsService_Service;
import com.monsanto.irdsoapservices.brands.client.BrandsService;
import com.monsanto.irdsoapservices.clientutil.ClientFactory;
import com.monsanto.irdsoapservices.clientutil.EnvironmentEnum;
import com.monsanto.isdcommon.header.schema.HeaderType;
import com.monsanto.isdcommon.header.schema.PartnerInformationType;
import com.monsanto.isdcommon.header.schema.PartnerIdentifierType;
import com.monsanto.isdcommon.header.schema.PartnerTypeAttribute;

import javax.xml.ws.soap.SOAPFaultException;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;
import java.util.Calendar;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 25, 2009
 * Time: 9:35:38 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractAcceptanceTestCase extends TestCase {
//    public static final String ACCT_INFO_WSDL_LOCATION = "http://services-d.monsanto.com/IrdServices/AccountInformation?wsdl";
//    public static final String ACCT_AGR_WSDL_LOCATION = "http://services-d.monsanto.com/IrdServices/AccountAgreements?wsdl";
//    public static final String BRANDS_WSDL_LOCATION = "http://services-d.monsanto.com/IrdServices/Brands?wsdl";
//    public static final String USER_NAME = "weblogic";
//    public static final String PASSWORD = "weblogic";
      public static final String USER_NAME = "NA1000SVC-SBTESTING";
      public static final String PASSWORD = "Met@123";

    private void init() throws Exception {
    }

    protected static final int GROWER_ACCT_ID = 10;

    protected void assertSoapException(Exception e, String exceptionPrefix) {
        e.printStackTrace();
        assertTrue(e instanceof SOAPFaultException);
        assertTrue(e.getMessage().startsWith(exceptionPrefix));
    }

    protected HeaderType getHeaderType() throws Exception {
        HeaderType headerType = new HeaderType();
        PartnerInformationType partnerInfo = new PartnerInformationType();
        partnerInfo.setPartnerName("MyMonsanto");
        PartnerIdentifierType partnerIdentifier = new PartnerIdentifierType();
        partnerIdentifier.setType(PartnerTypeAttribute.USER_ID);
        partnerIdentifier.setValue("MKUCHIP");
        partnerInfo.setPartnerIdentifier(partnerIdentifier);
        headerType.setDocumentIdentifier("ABC1010");
        headerType.setDocumentDateTime(transformToXmlGregorianCalendar(Calendar.getInstance()));
        headerType.setFrom(partnerInfo);
        return headerType;
    }

    protected void assertHeader(HeaderType header) throws Exception {
        assertNotNull(header);
        assertEquals("ABC1010", header.getDocumentIdentifier());
        assertEquals("MyMonsanto", header.getTo().getPartnerName());
        assertNotNull(header.getDocumentDateTime());
        assertEquals("US Commercial Services Development Team", header.getFrom().getPartnerName());
    }
    
    protected XMLGregorianCalendar transformToXmlGregorianCalendar(Calendar calendar) throws Exception {
        XMLGregorianCalendar xmlCal = DatatypeFactory.newInstance().newXMLGregorianCalendar();
        xmlCal.setDay(calendar.get(Calendar.DAY_OF_MONTH));
        // We do a +1 below because XMLGregorianCalendar goes from 1 to 12
        // while Calendar.MONTH goes from 0 to 11 !!!
        xmlCal.setMonth(calendar.get(Calendar.MONTH) + 1);
        xmlCal.setYear(calendar.get(Calendar.YEAR));
        xmlCal.setTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE),
                calendar.get(Calendar.SECOND));
        return xmlCal;
    }

    @Override
    protected void setUp() throws Exception {
        init();
        

        doSetUp();
    }

    protected void doSetUp() throws Exception {

    }

    protected void assertValidationSoapFault(Exception e) {
        assertTrue(e instanceof SOAPFaultException);
        assertTrue(e.getMessage().startsWith("Schema validation errors"));
    }
}

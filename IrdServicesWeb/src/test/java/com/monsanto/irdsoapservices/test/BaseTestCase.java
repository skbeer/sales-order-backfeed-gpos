package com.monsanto.irdsoapservices.test;

import junit.framework.TestCase;
import com.monsanto.isdcommon.header.schema.HeaderType;
import com.monsanto.isdcommon.header.schema.PartnerInformationType;
import com.monsanto.irdsoapservices.utils.XmlDateTimeUtil;
import com.monsanto.irdsoapservices.utils.Configuration;

import java.util.Calendar;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Apr 3, 2009
 * Time: 12:52:32 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class BaseTestCase extends TestCase {

    @Override
    protected void setUp() throws Exception {
        System.setProperty("lsi.function", "win");
        doSetUp();
    }
    protected abstract void doSetUp() throws Exception;

    protected HeaderType getValidHeader(String docIdentifier, String fromPartner) throws Exception {
        HeaderType header = new HeaderType();
        header.setDocumentIdentifier(docIdentifier);
        PartnerInformationType partner = new PartnerInformationType();
        partner.setPartnerName(fromPartner);
        header.setFrom(partner);
        header.setDocumentDateTime(XmlDateTimeUtil.transformToXmlGregorianCalendar(Calendar.getInstance()));
        return header;
    }

    protected void assertHeader(HeaderType header, String docIdentifier, String toPartner) throws Exception {
        assertNotNull(header);
        assertEquals(docIdentifier, header.getDocumentIdentifier());
        assertEquals(Configuration.getInstance().getProperty(Configuration.PARTNER_NAME), header.getFrom().getPartnerName());
        assertEquals(toPartner, header.getTo().getPartnerName());
    }
}

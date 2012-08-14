package com.monsanto.commercial.growercreditlist.requestbuilder;

import com.monsanto.commercial.growercreditlist.domain.ClientInfo;
import com.monsanto.commercial.growercreditlist.gen.creditinfo.header.HeaderType;
import com.monsanto.commercial.growercreditlist.gen.creditinfo.header.PartnerInformationType;
import com.monsanto.commercial.growercreditlist.gen.creditinfo.header.PartnerIdentifierType;
import com.monsanto.commercial.growercreditlist.gen.creditinfo.header.PartnerTypeAttribute;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import java.util.GregorianCalendar;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 27, 2012
 * Time: 1:37:10 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class BaseRequestBuilder {
    private static final String MONSANTO_NAME = "MONSANTO AGRICULTURAL CO";
    private static final String MONSANTO_EBID = "0062668030000";
    protected static final String DEFAULT_VERSION = "1.0";

    protected HeaderType getHeaderType(ClientInfo clientInfo) {
        HeaderType headerType = new HeaderType();
        headerType.setDocumentIdentifier(clientInfo.getDocIdentifier());
        headerType.setDocumentDateTime(new XMLGregorianCalendarImpl(new GregorianCalendar()));
        headerType.setFrom(getPartnerInformationType(clientInfo));
        return headerType;
    }

    private PartnerInformationType getPartnerInformationType(ClientInfo clientInfo) {
        PartnerInformationType partnerInformationType = new PartnerInformationType();
        PartnerIdentifierType partnerIdentifierType = new PartnerIdentifierType();
        partnerIdentifierType.setType(PartnerTypeAttribute.SAP_ID);
        partnerIdentifierType.setValue(clientInfo.getPartnerId());
        partnerInformationType.setPartnerIdentifier(partnerIdentifierType);
        return partnerInformationType;
    }

}

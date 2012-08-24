package com.monsanto.commercial.growercreditlist.requestbuilder;

import com.monsanto.commercial.growercreditlist.domain.ClientInfo;
import com.monsanto.commercial.growercreditlist.gen.creditinfo.header.HeaderType;
import com.monsanto.commercial.growercreditlist.gen.creditinfo.header.PartnerInformationType;
import com.monsanto.commercial.growercreditlist.gen.creditinfo.header.PartnerIdentifierType;
import com.monsanto.commercial.growercreditlist.gen.creditinfo.header.PartnerTypeAttribute;
import com.monsanto.commercial.growercreditlist.gen.creditlist.schema.*;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import java.util.GregorianCalendar;

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
        headerType.setDataSource("FPOS_BACKFEED_JOB");
        return headerType;
    }

    private PartnerInformationType getPartnerInformationType(ClientInfo clientInfo) {
        PartnerInformationType partnerInformationType = new PartnerInformationType();
        PartnerIdentifierType partnerIdentifierType = new PartnerIdentifierType();
        partnerIdentifierType.setType(PartnerTypeAttribute.EBID);
        partnerIdentifierType.setValue(clientInfo.getPartnerId());
        partnerInformationType.setPartnerIdentifier(partnerIdentifierType);
        partnerInformationType.setPartnerName(clientInfo.getPartnerName());
        return partnerInformationType;
    }

    protected com.monsanto.commercial.growercreditlist.gen.creditlist.schema.HeaderType getCreditListHeader(ClientInfo clientInfo) {
        com.monsanto.commercial.growercreditlist.gen.creditlist.schema.HeaderType headerType = new com.monsanto.commercial.growercreditlist.gen.creditlist.schema.HeaderType();
        ThisDocumentIdentifierType thisDocumentIdentifierType = new ThisDocumentIdentifierType();
        thisDocumentIdentifierType.setDocumentIdentifier(clientInfo.getDocIdentifier());
        ThisDocumentDateTimeType thisDocumentDateTimeType = new ThisDocumentDateTimeType();
        DateTimeType dateTimeType = new DateTimeType();
        dateTimeType.setDateTimeQualifier(ListDateQualifier.ON);
        dateTimeType.setValue(new XMLGregorianCalendarImpl(new GregorianCalendar()));
        thisDocumentDateTimeType.setDateTime(dateTimeType);
        headerType.setThisDocumentDateTime(thisDocumentDateTimeType);
        headerType.setThisDocumentIdentifier(thisDocumentIdentifierType);
        headerType.setFrom(getMonsantoFromType());
        headerType.setTo(getToType(clientInfo));
        return headerType;
    }

    protected FromType getMonsantoFromType() {
        FromType fromType = new FromType();
        fromType.setPartnerInformation(getPartnerInformation(MONSANTO_NAME, MONSANTO_EBID, ListPartnerAgencyAttribute.AGIIS_EBID));
        return fromType;
    }

    protected ToType getToType(ClientInfo clientInfo) {
        ToType toType = new ToType();
        toType.setPartnerInformation(getPartnerInformation(clientInfo.getPartnerName(), clientInfo.getPartnerId(), ListPartnerAgencyAttribute.AGIIS_EBID));
        return toType;
    }

    protected com.monsanto.commercial.growercreditlist.gen.creditlist.schema.PartnerInformationType getPartnerInformation(String partnerName, String partnerId, ListPartnerAgencyAttribute idType) {
        com.monsanto.commercial.growercreditlist.gen.creditlist.schema.PartnerInformationType partnerInformationType = new com.monsanto.commercial.growercreditlist.gen.creditlist.schema.PartnerInformationType();
        partnerInformationType.getPartnerIdentifier().add(getPartnerIdentifierType(partnerId, idType));
        partnerInformationType.getPartnerName().add(partnerName);
        return partnerInformationType;
    }

    protected com.monsanto.commercial.growercreditlist.gen.creditlist.schema.PartnerIdentifierType getPartnerIdentifierType(String partnerId, ListPartnerAgencyAttribute idType) {
        com.monsanto.commercial.growercreditlist.gen.creditlist.schema.PartnerIdentifierType partnerIdentifierType = new com.monsanto.commercial.growercreditlist.gen.creditlist.schema.PartnerIdentifierType();
        partnerIdentifierType.setAgency(idType);
        partnerIdentifierType.setValue(partnerId);
        return partnerIdentifierType;
    }
}

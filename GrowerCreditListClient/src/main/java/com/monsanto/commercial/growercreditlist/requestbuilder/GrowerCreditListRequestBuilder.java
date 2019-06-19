package com.monsanto.commercial.growercreditlist.requestbuilder;

import com.monsanto.commercial.growercreditlist.gen.creditlist.schema.*;
import com.monsanto.commercial.growercreditlist.domain.GrowerInfo;
import com.monsanto.commercial.growercreditlist.domain.ClientInfo;
import com.monsanto.commercial.growercreditlist.exception.RequestBuilderException;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import java.util.List;
import java.util.GregorianCalendar;
import java.util.Date;
import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Aug 15, 2012
 * Time: 2:23:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class GrowerCreditListRequestBuilder extends BaseRequestBuilder {

    public GrowerCreditListListType createRequestType(List<GrowerInfo> growerInfoList, ClientInfo clientInfo) throws RequestBuilderException {
        GrowerCreditListListType creditListType = new GrowerCreditListListType();
        GrowerCreditListListBodyType creditListBodyType = new GrowerCreditListListBodyType();
        for(GrowerInfo growerInfo : growerInfoList) {
            if(growerInfo != null) {
                creditListBodyType.getGrowerCreditListDetails().add(getCreditListDetails(growerInfo));
            }
        }
        creditListType.setHeader(getCreditListHeader(clientInfo));
        creditListType.setVersion(DEFAULT_VERSION);
        creditListType.setGrowerCreditListBody(creditListBodyType);
        return creditListType;
    }

    private GrowerCreditListListBodyType.GrowerCreditListDetails getCreditListDetails(GrowerInfo growerInfo) {
        GrowerCreditListListBodyType.GrowerCreditListDetails detailsType = new GrowerCreditListListBodyType.GrowerCreditListDetails();
        PartnerInformationType partnerInformationType = getPartnerInformation(growerInfo.getName(), growerInfo.getAccountId(), ListPartnerAgencyAttribute.ASSIGNED_BY_SELLER);
        if(growerInfo.getGln()!= null) {
            partnerInformationType.getPartnerIdentifier().add(getPartnerIdentifierType(growerInfo.getGln(), ListPartnerAgencyAttribute.GLN));
        }
        partnerInformationType.setAddressInformation(getAddressInformationType(growerInfo));
        detailsType.setPartnerInformation(partnerInformationType);
        GrowerCreditListPropertiesType propertiesType = new GrowerCreditListPropertiesType();
        propertiesType.setCreditType(growerInfo.getCreditType());
        propertiesType.setAmountAvailable(getAmountAvailable(growerInfo.getCreditAvailable()));
        propertiesType.setAmountApproved(getAmountApproved(growerInfo.getCreditApproved()));
        propertiesType.setDateApproved(getDateApprovedType(growerInfo.getDateApproved()));
        //DDP-1877 Changes made by VVVL as part of this JIRA - Start
        propertiesType.setCreditIdentifier(growerInfo.getDealer_gln());
        //DDP-1877 Changes made by VVVL as part of this JIRA - End
        propertiesType.setCreditStatus("Approved");
        detailsType.setGrowerCreditListProperties(propertiesType);
        return detailsType;
    }

    private AddressInformationType getAddressInformationType(GrowerInfo growerInfo) {
        AddressInformationType addressInformationType = new AddressInformationType();
        addressInformationType.getAddressLine().add(growerInfo.getAddress());
        addressInformationType.setCityName(growerInfo.getCity());
        addressInformationType.setPostalCode(growerInfo.getZip());
        addressInformationType.setStateOrProvince(growerInfo.getState());
        return addressInformationType;
    }

    private GrowerCreditListPropertiesType.DateApproved getDateApprovedType(Date dateAppr) {
        GrowerCreditListPropertiesType.DateApproved dateApproved = new GrowerCreditListPropertiesType.DateApproved();
        DateTimeType dateTimeType = new DateTimeType();
        dateTimeType.setDateTimeQualifier(ListDateQualifier.ON);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(dateAppr);
        dateTimeType.setValue(new XMLGregorianCalendarImpl(gregorianCalendar));
        dateApproved.setDateTime(dateTimeType);
        return dateApproved;
    }

    private GrowerCreditListPropertiesType.AmountAvailable getAmountAvailable(double creditAvailable) {
        GrowerCreditListPropertiesType.AmountAvailable amountAvailableType = new GrowerCreditListPropertiesType.AmountAvailable();
        amountAvailableType.setMonetaryValue(new BigDecimal(creditAvailable).setScale(2, BigDecimal.ROUND_HALF_UP));
        amountAvailableType.setCurrencyCode("USD");
        return amountAvailableType;
    }

    private GrowerCreditListPropertiesType.AmountApproved getAmountApproved(double creditApproved) {
        GrowerCreditListPropertiesType.AmountApproved amountApproved = new GrowerCreditListPropertiesType.AmountApproved();
        amountApproved.setMonetaryValue(new BigDecimal(creditApproved).setScale(2, BigDecimal.ROUND_HALF_UP));
        amountApproved.setCurrencyCode("USD");
        return amountApproved;
    }

}

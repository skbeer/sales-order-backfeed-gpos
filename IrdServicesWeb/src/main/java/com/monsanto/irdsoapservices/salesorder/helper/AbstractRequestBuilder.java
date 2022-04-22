package com.monsanto.irdsoapservices.salesorder.helper;

import com.monsanto.irdsoapservices.constants.DBConstants;
import com.monsanto.irdsoapservices.salesorder.constants.XmlConstants;
import com.monsanto.irdsoapservices.salesorder.domain.PartnerInfo;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.schema.*;
import com.monsanto.irdsoapservices.utils.StringUtils;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by IntelliJ IDEA..
 * User: MKUCHIP
 * Date: Jun 22, 2010
 * Time: 11:51:57 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractRequestBuilder {

    protected HeaderType getHeaderType(TransactionInfo transactionInfo, String tranType) {
        HeaderType headerType = new HeaderType();

        FromType fromType = new FromType();
        PartnerInformationType partnerInformationType = getPartnerInformationForHeader(XmlConstants.MONSANTO_PARTNER_NAME, XmlConstants.MONSANTO_EBID, ListPartnerAgencyAttribute.AGIIS_EBID);
        fromType.setPartnerInformation(partnerInformationType);

        ToType toType = new ToType();
        //CUSTPLT-632 - Introducing new Partner Agdata
        if(transactionInfo.getTransactionType().equalsIgnoreCase(DBConstants.GPOS_AGDATA_TRAN_TYPE))
        {
            partnerInformationType = getPartnerInformationForHeader(transactionInfo.getName(), transactionInfo.getCompanyCode(), ListPartnerAgencyAttribute.D_U_N_S);
        }
        else {
            partnerInformationType = getPartnerInformationForHeader(transactionInfo.getName(), transactionInfo.getCompanyCode(), ListPartnerAgencyAttribute.AGIIS_EBID);
        }
        toType.setPartnerInformation(partnerInformationType);

        ThisDocumentIdentifierType thisDocumentIdentifierType = new ThisDocumentIdentifierType();
        thisDocumentIdentifierType.setDocumentIdentifier(createDocumentIdentifier(transactionInfo, tranType));

        ThisDocumentDateTimeType thisDocumentDateTimeType = new ThisDocumentDateTimeType();
        thisDocumentDateTimeType.setDateTime(getDateTimeType(new Date()));

        headerType.setFrom(fromType);
        headerType.setTo(toType);
        headerType.setThisDocumentIdentifier(thisDocumentIdentifierType);
        headerType.setThisDocumentDateTime(thisDocumentDateTimeType);
        headerType.setSalesOrderReportSequenceNumber((transactionInfo.getLastTransactionNumber()+1)+"");

        return headerType;
    }

    protected DateTimeType getDateTimeType(Date date) {
        DateTimeType dateTimeType = new DateTimeType();
        dateTimeType.setDateTimeQualifier(ListDateQualifier.ON);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        dateTimeType.setValue(new XMLGregorianCalendarImpl(gregorianCalendar));
        return dateTimeType;
    }

    protected String createDocumentIdentifier(TransactionInfo transactionInfo, String tranType) {
        StringBuffer sBuffer = new StringBuffer();
        sBuffer.append(tranType);
        sBuffer.append("_");
        sBuffer.append((transactionInfo.getLastTransactionNumber()+1)+"");
        sBuffer.append("_");
        sBuffer.append("SEQUENCE");
        sBuffer.append("_");
        sBuffer.append(transactionInfo.getCompanyCode());
        sBuffer.append("_");
        sBuffer.append(new SimpleDateFormat(XmlConstants.DATE_FORMAT_FOR_DOCUMENT_IDENTIFIER).format(new Date()));
        return sBuffer.toString();
    }

    protected PartnerInformationType getPartnerInformationForHeader(String partnerName, String partnerEbid, ListPartnerAgencyAttribute agency) {
        PartnerInformationType partnerInformationType = new PartnerInformationType();
        partnerInformationType.getPartnerName().add(partnerName);
        PartnerIdentifierType partnerIdentifierType = new PartnerIdentifierType();
        partnerIdentifierType.setAgency(agency);
        partnerIdentifierType.setValue(partnerEbid);
        partnerInformationType.getPartnerIdentifier().add(partnerIdentifierType);
        return partnerInformationType;
    }

    protected MeasurementType getMeasurementType(String uomValue, String quantity) {
        MeasurementType measurementType = new MeasurementType();
        UnitOfMeasureCodeType unitOfMeasureCodeType = new UnitOfMeasureCodeType();
        unitOfMeasureCodeType.setDomain(XmlConstants.UN_REC_20);
        unitOfMeasureCodeType.setValue(uomValue);
        if(org.apache.commons.lang.StringUtils.isNotBlank(quantity)){
            try{
                measurementType.setMeasurementValue(new Double(quantity).doubleValue());
            }catch (Exception e){//number format exception
                measurementType.setMeasurementValue(0);
            }
        }
        else{//empty or null quantity
            measurementType.setMeasurementValue(0);
        }
        measurementType.setUnitOfMeasureCode(unitOfMeasureCodeType);
        return measurementType;
    }

    protected ProductidentificationType getProductionIdentificationType(ListProductIDAgency agency, String value, String productName, String productNum, String lineIdentifier) {
        ProductidentificationType productidentificationType = new ProductidentificationType();
        productidentificationType.setProductIdentifier(getProductIdentifierType(agency, value));
        productidentificationType.setProductName(productName);
        productidentificationType.setProductNum(productNum);
        productidentificationType.setLineIdentifier(lineIdentifier);
        return productidentificationType;
    }

    private ProductIdentifierType getProductIdentifierType(ListProductIDAgency agency, String value) {
        ProductIdentifierType productIdentifierType = new ProductIdentifierType();
        productIdentifierType.setAgency(agency);
        productIdentifierType.setValue(value);
        return productIdentifierType;
    }
    //CUSTPLT-632 - Introducing new Partner Agdata
    protected PartnerInformationType getPartnerInformationTypeForBody(PartnerInfo partnerInfo, boolean isGrower, TransactionInfo transactionInfo) {
        PartnerInformationType partnerInformationType = new PartnerInformationType();
        PartnerIdentifierType partnerIdentifierType;

        if(!StringUtils.isNullOrEmpty(partnerInfo.getEbid())) {
            partnerIdentifierType = new PartnerIdentifierType();
            partnerIdentifierType.setAgency(ListPartnerAgencyAttribute.AGIIS_EBID);
            partnerIdentifierType.setValue(partnerInfo.getEbid());
            partnerInformationType.getPartnerIdentifier().add(partnerIdentifierType);
        }
        //CUSTPLT-632 - Introducing new Partner Agdata
        if (!StringUtils.isNullOrEmpty(partnerInfo.getAcctId())) {
                partnerIdentifierType = new PartnerIdentifierType();
                partnerIdentifierType.setAgency(ListPartnerAgencyAttribute.ASSIGNED_BY_SELLER);
                if(transactionInfo.getTransactionType().equalsIgnoreCase(DBConstants.GPOS_AGDATA_TRAN_TYPE)) {
                   partnerIdentifierType.setValue(partnerInfo.getTechId());
                }
                else {
                    partnerIdentifierType.setValue(partnerInfo.getAcctId());
                }
                partnerInformationType.getPartnerIdentifier().add(partnerIdentifierType);
            }

        if(!StringUtils.isNullOrEmpty(partnerInfo.getNapd())) {
            partnerIdentifierType = new PartnerIdentifierType();
            partnerIdentifierType.setAgency(ListPartnerAgencyAttribute.AGIIS_NAPD);
            partnerIdentifierType.setValue(partnerInfo.getNapd());
            partnerInformationType.getPartnerIdentifier().add(partnerIdentifierType);
        }

        if(!StringUtils.isNullOrEmpty(partnerInfo.getBuyerId())) {
            partnerIdentifierType = new PartnerIdentifierType();
            partnerIdentifierType.setAgency(ListPartnerAgencyAttribute.ASSIGNED_BY_BUYER);
            partnerIdentifierType.setValue(partnerInfo.getBuyerId());
            partnerInformationType.getPartnerIdentifier().add(partnerIdentifierType);
        }

        if(!StringUtils.isNullOrEmpty(partnerInfo.getGln())) {
            partnerIdentifierType = new PartnerIdentifierType();
            partnerIdentifierType.setAgency(ListPartnerAgencyAttribute.GLN);
            partnerIdentifierType.setValue(partnerInfo.getGln());
            partnerInformationType.getPartnerIdentifier().add(partnerIdentifierType);
        }

        partnerInformationType.getPartnerName().add(partnerInfo.getPartnerName());

        AddressInformationType addressInformationType = new AddressInformationType();
        addressInformationType.getAddressLine().add(partnerInfo.getAddress());
        addressInformationType.setCityName(partnerInfo.getCity());
        addressInformationType.setStateOrProvince(partnerInfo.getState());
        addressInformationType.setPostalCode(partnerInfo.getZip());
        addressInformationType.setCounty(partnerInfo.getCounty());
        addressInformationType.setPostalCountry(partnerInfo.getPostalCountry());

        partnerInformationType.setAddressInformation(addressInformationType);

        if(isGrower) {
            ContactInformationType contactInformationType = new ContactInformationType();
            contactInformationType.getContactName().add(partnerInfo.getContactName());
            partnerInformationType.getContactInformation().add(contactInformationType);
        }
        return partnerInformationType;
    }
}

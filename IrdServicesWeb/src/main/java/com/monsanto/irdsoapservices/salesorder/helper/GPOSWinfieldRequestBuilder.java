package com.monsanto.irdsoapservices.salesorder.helper;

import com.monsanto.irdsoapservices.constants.DBConstants;
import com.monsanto.irdsoapservices.salesorder.constants.XmlConstants;
import com.monsanto.irdsoapservices.salesorder.domain.GPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.LineItemInfo;
import com.monsanto.irdsoapservices.salesorder.domain.PartnerInfo;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.helper.GPOSRequestBuilder;
import com.monsanto.irdsoapservices.salesorder.schema.*;
import com.monsanto.irdsoapservices.utils.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: caggarw
 * Date: Mar 22, 2012
 * Time: 3:02:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class GPOSWinfieldRequestBuilder extends GPOSRequestBuilder {

    @Override
    protected String createDocumentIdentifier(TransactionInfo transactionInfo, String tranType) {
        StringBuffer sBuffer = new StringBuffer();
        sBuffer.append(tranType);
        sBuffer.append("_");
        sBuffer.append(transactionInfo.getDataSourceType());
        sBuffer.append("_");
        sBuffer.append((transactionInfo.getLastTransactionNumber() + 1) + "");
        sBuffer.append("_");
        sBuffer.append("SEQUENCE");
        sBuffer.append("_");
        sBuffer.append(transactionInfo.getCompanyCode());
        sBuffer.append("_");
        sBuffer.append(new SimpleDateFormat(XmlConstants.DATE_FORMAT_FOR_DOCUMENT_IDENTIFIER).format(new Date()));
        return sBuffer.toString();
    }

    @Override
    protected SalesOrderPartnersType getSalesOrderPartnersType(TransactionInfo transactionInfo, GPOSOrderInfo gposOrderInfo) {
        SalesOrderPartnersType salesOrderPartnersType = super.getSalesOrderPartnersType(transactionInfo, gposOrderInfo);
        PartnerInformationType partnerInformationType=null;
        if (!StringUtils.isNullOrEmpty(gposOrderInfo.getSalesRepWinfield().getBuyerId())) {
            OtherPartnerType otherPartner = new OtherPartnerType();
            partnerInformationType=getPartnerInformationTypeForBody(gposOrderInfo.getSalesRepWinfield(), false);
            if(transactionInfo.getTransactionType().equalsIgnoreCase(DBConstants.GPOS_AGDATA_TRAN_TYPE)){
                getMdmTechId(gposOrderInfo.getSalesRepWinfield(),partnerInformationType);
            }
            otherPartner.setPartnerInformation(partnerInformationType);
            otherPartner.setPartnerRole(ListPartnerRoles.SELLING_PARTNER);
            salesOrderPartnersType.getOtherPartner().add(otherPartner);
        }
        return salesOrderPartnersType;
    }

    private PartnerInformationType getMdmTechId(PartnerInfo partnerInfo, PartnerInformationType partnerInformationType) {
        PartnerIdentifierType partnerIdentifierType;
                if (!StringUtils.isNullOrEmpty(partnerInfo.getTechId())) {
                partnerIdentifierType = new PartnerIdentifierType();
                partnerIdentifierType.setAgency(ListPartnerAgencyAttribute.ASSIGNED_BY_SELLER);
                partnerIdentifierType.setValue(partnerInfo.getTechId());
                partnerInformationType.getPartnerIdentifier().add(partnerIdentifierType);
            }
            partnerInformationType.getPartnerName().add(partnerInfo.getPartnerName());
            return partnerInformationType;
        }

    @Override
    protected SalesOrderTransactionDetailsType getSalesOrderTransactionDetailsType(GPOSOrderInfo gposOrderInfo, TransactionInfo transactionInfo) {
        SalesOrderTransactionDetailsType salesOrderTransactionDetailsType = new SalesOrderTransactionDetailsType();
        SalesOrderLineItemType salesOrderLineItemType = null;
        //AgInfo code changes
        ProductidentificationType productidentificationType=null;
        int lineNumber = 1;
        for (LineItemInfo lineItem : gposOrderInfo.getLineItems()) {
            salesOrderLineItemType = new SalesOrderLineItemType();
            salesOrderLineItemType.setLineNumber(lineNumber++);
           /* salesOrderLineItemType.setLineNumber(new Long(lineItem.getItemNumber()).longValue());
              salesOrderLineItemType.getProductIdentification().add(getProductionIdentificationType(ListProductIDAgency.AGIIS_PRODUCT_ID, lineItem.getProductGtin(), lineItem.getProductName()));*/
            //AgInfo code changes
            productidentificationType = getProductionIdentificationType(ListProductIDAgency.AGIIS_PRODUCT_ID, lineItem.getProductGtin(), lineItem.getProductName());
            productidentificationType = (getProductionIdentificationType(ListProductIDAgency.UPC, lineItem.getProductUpc(), lineItem.getProductName()));
            if(transactionInfo.getTransactionType().equalsIgnoreCase(DBConstants.GPOS_AGDATA_TRAN_TYPE)){
                getAgDataInfo(lineItem,productidentificationType);
            }
            salesOrderLineItemType.getProductIdentification().add(productidentificationType);
            DeliveryQuantityType deliveryQuantityType = new DeliveryQuantityType();
            deliveryQuantityType.setMeasurement(getMeasurementType(lineItem.getSalesQuantity().getQtyUom(), lineItem.getSalesQuantity().getQtyValue()));
            salesOrderLineItemType.setDeliveredQuantity(deliveryQuantityType);
            DeliveryQuantityEquivalentType deliveryQuantityEquivalentType = new DeliveryQuantityEquivalentType();
            deliveryQuantityEquivalentType.setMeasurement(getMeasurementType(lineItem.getEquivalentQuantity().getQtyUom(), lineItem.getEquivalentQuantity().getQtyValue()));
            salesOrderLineItemType.setDeliveredQuantityEquivalent(deliveryQuantityEquivalentType);
            if ("Y".equalsIgnoreCase(lineItem.getOrderTransactionType())) {
                salesOrderLineItemType.setOrderTransactionType(XmlConstants.ORDER_TYPE_MANUAL);
            }
            salesOrderTransactionDetailsType.getSalesOrderLineItem().add(salesOrderLineItemType);
        }
        return salesOrderTransactionDetailsType;
    }
    //new
    private ProductidentificationType getAgDataInfo(LineItemInfo lineItem,ProductidentificationType productidentificationType)
    {
         if(lineItem!=null && !StringUtils.isNullOrEmpty(lineItem.getProductName()) ){
            if(lineItem.getProductName().substring(0, 2).equals("DP")) {
                productidentificationType.setBrandFamily("National");
                productidentificationType.setBrandName("DeltaPine Cotton");
            }
            else if(lineItem.getProductName().substring(0, 2).equals("AS")) {
                productidentificationType.setBrandFamily("National");
                productidentificationType.setBrandName("Asgrow Soybeans");
            }
            else if(lineItem.getProductName().substring(0,1).equals("S")) {
                productidentificationType.setBrandFamily("National");
                productidentificationType.setBrandName("DEKALB Sorghum");
            }
            else if(lineItem.getProductName().substring(0, 3).equals("DKC"))
            {
                productidentificationType.setBrandFamily("National");
                productidentificationType.setBrandName("DEKALB Corn");
            }
        }


        return productidentificationType;
    }
}

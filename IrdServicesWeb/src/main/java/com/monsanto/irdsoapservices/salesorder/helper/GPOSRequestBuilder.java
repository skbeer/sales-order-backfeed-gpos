package com.monsanto.irdsoapservices.salesorder.helper;

import com.monsanto.irdsoapservices.salesorder.constants.XmlConstants;
import com.monsanto.irdsoapservices.salesorder.domain.LineItemInfo;
import com.monsanto.irdsoapservices.salesorder.domain.GPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.schema.*;
import com.monsanto.irdsoapservices.utils.StringUtils;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 9, 2010
 * Time: 9:28:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class GPOSRequestBuilder extends AbstractRequestBuilder {

    public SalesOrderReport buildGPOSRequest(List<GPOSOrderInfo> gposOrderInfoList, TransactionInfo transactionInfo) throws Exception {
        SalesOrderReport salesOrderReport = new SalesOrderReport();
        salesOrderReport.setHeader(getHeaderType(transactionInfo, XmlConstants.GPOS_TRAN_TYPE));
        salesOrderReport.setVersion("1.0");
        salesOrderReport.setSalesOrderReportBody(getSalesOrderReportBodyType(gposOrderInfoList, transactionInfo));
        return salesOrderReport;
    }

    private SalesOrderReportBodyType getSalesOrderReportBodyType(List<GPOSOrderInfo> gposOrderInfoList, TransactionInfo transactionInfo) throws Exception {
        SalesOrderReportBodyType salesOrderReportBodyType = new SalesOrderReportBodyType();
        for(GPOSOrderInfo gposOrderInfo : gposOrderInfoList) {
            SalesOrderReportDetailsType salesOrderReportDetailsType = new SalesOrderReportDetailsType();

            SalesOrderReportPropertiesType salesOrderReportPropertiesType = getSalesOrderPropertiesType(gposOrderInfo);
            SalesOrderPartnersType salesOrderPartnersType = getSalesOrderPartnersType(transactionInfo, gposOrderInfo);
            SalesOrderTransactionDetailsType salesOrderTransactionDetailsType = getSalesOrderTransactionDetailsType(gposOrderInfo);

            salesOrderReportDetailsType.setSalesOrderReportProperties(salesOrderReportPropertiesType);
            salesOrderReportDetailsType.setSalesOrderPartners(salesOrderPartnersType);
            salesOrderReportDetailsType.setSalesOrderTransactionDetails(salesOrderTransactionDetailsType);

            salesOrderReportBodyType.getSalesOrderReportDetails().add(salesOrderReportDetailsType);
        }
        return salesOrderReportBodyType;
    }

    protected SalesOrderTransactionDetailsType getSalesOrderTransactionDetailsType(GPOSOrderInfo gposOrderInfo) {
        SalesOrderTransactionDetailsType salesOrderTransactionDetailsType = new SalesOrderTransactionDetailsType();
        SalesOrderLineItemType salesOrderLineItemType = null;

        for(LineItemInfo lineItem : gposOrderInfo.getLineItems()) {
            salesOrderLineItemType = new SalesOrderLineItemType();
            salesOrderLineItemType.setLineNumber(new Long(lineItem.getItemNumber()).longValue());
            salesOrderLineItemType.getProductIdentification().add(getProductionIdentificationType(ListProductIDAgency.AGIIS_PRODUCT_ID, lineItem.getProductGtin(), lineItem.getProductName()));
            salesOrderLineItemType.getProductIdentification().add(getProductionIdentificationType(ListProductIDAgency.UPC, lineItem.getProductUpc(), lineItem.getProductName()));
            DeliveryQuantityType deliveryQuantityType = new DeliveryQuantityType();
            deliveryQuantityType.setMeasurement(getMeasurementType(lineItem.getSalesQuantity().getQtyUom(), lineItem.getSalesQuantity().getQtyValue()));
            salesOrderLineItemType.setDeliveredQuantity(deliveryQuantityType);
            DeliveryQuantityEquivalentType deliveryQuantityEquivalentType = new DeliveryQuantityEquivalentType();
            deliveryQuantityEquivalentType.setMeasurement(getMeasurementType(lineItem.getEquivalentQuantity().getQtyUom(), lineItem.getEquivalentQuantity().getQtyValue()));
            salesOrderLineItemType.setDeliveredQuantityEquivalent(deliveryQuantityEquivalentType);
            if(!StringUtils.isNullOrEmpty(lineItem.getSalesRep().getBuyerId())) {
                SalesPersonType salesPersonType = new SalesPersonType();
                salesPersonType.setPartnerInformation(getPartnerInformationTypeForBody(lineItem.getSalesRep(), false));
                salesOrderLineItemType.setSalesPerson(salesPersonType);
            }
            salesOrderTransactionDetailsType.getSalesOrderLineItem().add(salesOrderLineItemType);
        }
        return salesOrderTransactionDetailsType;
    }

    protected SalesOrderPartnersType getSalesOrderPartnersType(TransactionInfo transactionInfo, GPOSOrderInfo gposOrderInfo) {
        SalesOrderPartnersType salesOrderPartnersType = new SalesOrderPartnersType();
        ShipToType shipToType = new ShipToType();
        shipToType.setPartnerInformation(getPartnerInformationTypeForBody(gposOrderInfo.getDealerInfo(), false));

        BuyerType buyerType = new BuyerType();
        buyerType.setPartnerInformation(getPartnerInformationForHeader(transactionInfo.getName(), transactionInfo.getCompanyCode(), ListPartnerAgencyAttribute.AGIIS_EBID));

        SellerType sellerType = new SellerType();
        sellerType.setPartnerInformation(getPartnerInformationForHeader(XmlConstants.MONSANTO_PARTNER_NAME, XmlConstants.MONSANTO_EBID, ListPartnerAgencyAttribute.AGIIS_EBID));

        OtherPartnerType otherPartnerType = new OtherPartnerType();
        otherPartnerType.setPartnerRole(ListPartnerRoles.BILL_TO_PARTY);
        otherPartnerType.setPartnerInformation(getPartnerInformationTypeForBody(gposOrderInfo.getDealerInfo(), false));

        salesOrderPartnersType.setBuyer(buyerType);
        salesOrderPartnersType.setSeller(sellerType);
        salesOrderPartnersType.setShipTo(shipToType);
        salesOrderPartnersType.getOtherPartner().add(otherPartnerType);

        otherPartnerType = new OtherPartnerType();
        otherPartnerType.setPartnerRole(ListPartnerRoles.END_USE_CUSTOMER);
        otherPartnerType.setPartnerInformation(getPartnerInformationTypeForBody(gposOrderInfo.getGrowerInfo(), true));
        salesOrderPartnersType.getOtherPartner().add(otherPartnerType);
        return salesOrderPartnersType;
    }

    private SalesOrderReportPropertiesType getSalesOrderPropertiesType(GPOSOrderInfo gposOrderInfo) {
        SalesOrderReportPropertiesType salesOrderReportPropertiesType = new SalesOrderReportPropertiesType();

        SalesOrderNumberType salesOrderNumberType = new SalesOrderNumberType();
        salesOrderNumberType.setDocumentIdentifier(gposOrderInfo.getOrderNumber());

        SalesOrderTypeCodeType salesOrderTypeCodeType = new SalesOrderTypeCodeType();
        salesOrderTypeCodeType.setValue(gposOrderInfo.getOrderType());

        SalesOrderIssuedDateType salesOrderIssuedDateType = new SalesOrderIssuedDateType();
        salesOrderIssuedDateType.setDateTime(getDateTimeType(gposOrderInfo.getOrderDate()));

        salesOrderReportPropertiesType.setSalesOrderNumber(salesOrderNumberType);
        salesOrderReportPropertiesType.setSalesOrderTypeCode(salesOrderTypeCodeType);
        salesOrderReportPropertiesType.setSalesOrderIssuedDate(salesOrderIssuedDateType);
        salesOrderReportPropertiesType.setSalesOrderYear(gposOrderInfo.getOrderFiscalYear());
        return salesOrderReportPropertiesType;
    }

}

package com.monsanto.irdsoapservices.salesorder.helper;

import com.monsanto.irdsoapservices.salesorder.schema.*;
import com.monsanto.irdsoapservices.salesorder.domain.PPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.domain.LineItemInfo;
import com.monsanto.irdsoapservices.salesorder.domain.COSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.constants.XmlConstants;
import com.monsanto.irdsoapservices.utils.StringUtils;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 22, 2010
 * Time: 1:06:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class COSRequestBuilder extends AbstractRequestBuilder {

    public SalesOrderReport buildCOSRequest(List<COSOrderInfo> cosOrders, TransactionInfo transactionInfo) throws Exception {
        SalesOrderReport salesOrderReport = new SalesOrderReport();
        salesOrderReport.setHeader(getHeaderType(transactionInfo, XmlConstants.COS_TRAN_TYPE));
        salesOrderReport.setVersion("1.0");
        salesOrderReport.setSalesOrderReportBody(getSalesOrderReportBodyType(cosOrders, transactionInfo));
        return salesOrderReport;
    }

    private SalesOrderReportBodyType getSalesOrderReportBodyType(List<COSOrderInfo> cosOrderInfo, TransactionInfo transactionInfo) throws Exception {
        SalesOrderReportBodyType salesOrderReportBodyType = new SalesOrderReportBodyType();
        for(COSOrderInfo cosOrder : cosOrderInfo) {
            SalesOrderReportDetailsType salesOrderReportDetailsType = new SalesOrderReportDetailsType();

            SalesOrderReportPropertiesType salesOrderReportPropertiesType = getSalesOrderPropertiesType(cosOrder);
            SalesOrderPartnersType salesOrderPartnersType = getSalesOrderPartnersType(transactionInfo, cosOrder);
            SalesOrderTransactionDetailsType salesOrderTransactionDetailsType = getSalesOrderTransactionDetailsType(cosOrder);

            salesOrderReportDetailsType.setSalesOrderReportProperties(salesOrderReportPropertiesType);
            salesOrderReportDetailsType.setSalesOrderPartners(salesOrderPartnersType);
            salesOrderReportDetailsType.setSalesOrderTransactionDetails(salesOrderTransactionDetailsType);

            salesOrderReportBodyType.getSalesOrderReportDetails().add(salesOrderReportDetailsType);
        }
        return salesOrderReportBodyType;
    }

    private SalesOrderTransactionDetailsType getSalesOrderTransactionDetailsType(COSOrderInfo cosOrder) {
        SalesOrderTransactionDetailsType salesOrderTransactionDetailsType = new SalesOrderTransactionDetailsType();
        SalesOrderLineItemType salesOrderLineItemType = null;

        for(LineItemInfo lineItem : cosOrder.getLineItems()) {
            salesOrderLineItemType = new SalesOrderLineItemType();
            salesOrderLineItemType.setLineNumber(new Long(lineItem.getItemNumber()).longValue());
            salesOrderLineItemType.getProductIdentification().add(getProductionIdentificationType(ListProductIDAgency.AGIIS_PRODUCT_ID, lineItem.getProductGtin(), lineItem.getProductName()));
            salesOrderLineItemType.getProductIdentification().add(getProductionIdentificationType(ListProductIDAgency.UPC, lineItem.getProductUpc(), lineItem.getProductName()));

            ProductQuantityType_0020 productQuantityType_0020 = new ProductQuantityType_0020();
            productQuantityType_0020.setMeasurement(getMeasurementType(lineItem.getProductQuantity().getQtyUom(), lineItem.getProductQuantity().getQtyValue()));
            salesOrderLineItemType.setProductQuantity(productQuantityType_0020);
            ProductQuantityEquivalentType productQuantityEquivalentType = new ProductQuantityEquivalentType();
            productQuantityEquivalentType.setMeasurement(getMeasurementType(lineItem.getProductQuantityEquivalent().getQtyUom(), lineItem.getProductQuantityEquivalent().getQtyValue()));
            salesOrderLineItemType.setProductQuantityEquivalent(productQuantityEquivalentType);

            ShippedQuantityType shippedQuantityType = new ShippedQuantityType();
            shippedQuantityType.setMeasurement(getMeasurementType(lineItem.getShippedQuantity().getQtyUom(), lineItem.getShippedQuantity().getQtyValue()));
            salesOrderLineItemType.setShippedQuantity(shippedQuantityType);
            ShippedQuantityEquivalentType shippedQuantityEquivalentType = new ShippedQuantityEquivalentType();
            shippedQuantityEquivalentType.setMeasurement(getMeasurementType(lineItem.getShippedQuantityEquivalent().getQtyUom(), lineItem.getShippedQuantityEquivalent().getQtyValue()));
            salesOrderLineItemType.setShippedQuantityEquivalent(shippedQuantityEquivalentType);

            DeliveryQuantityEquivalentType deliveryQuantityEquivalentType = new DeliveryQuantityEquivalentType();
            deliveryQuantityEquivalentType.setMeasurement(getMeasurementType(lineItem.getDeliveredQuantityEquivalent().getQtyUom(), lineItem.getDeliveredQuantityEquivalent().getQtyValue()));
            salesOrderLineItemType.setDeliveredQuantityEquivalent(deliveryQuantityEquivalentType);

            salesOrderTransactionDetailsType.getSalesOrderLineItem().add(salesOrderLineItemType);
        }
        return salesOrderTransactionDetailsType;
    }

    private SalesOrderPartnersType getSalesOrderPartnersType(TransactionInfo transactionInfo, COSOrderInfo cosOrder) {
        SalesOrderPartnersType salesOrderPartnersType = new SalesOrderPartnersType();
        ShipToType shipToType = new ShipToType();
        shipToType.setPartnerInformation(getPartnerInformationTypeForBody(cosOrder.getShipTo(), false));

        BuyerType buyerType = new BuyerType();
        buyerType.setPartnerInformation(getPartnerInformationForHeader(transactionInfo.getName(), transactionInfo.getCompanyCode(), ListPartnerAgencyAttribute.AGIIS_EBID));

        SellerType sellerType = new SellerType();
        sellerType.setPartnerInformation(getPartnerInformationForHeader(XmlConstants.MONSANTO_PARTNER_NAME, XmlConstants.MONSANTO_EBID, ListPartnerAgencyAttribute.AGIIS_EBID));

        OtherPartnerType otherPartnerType = new OtherPartnerType();
        otherPartnerType.setPartnerRole(ListPartnerRoles.BILL_TO_PARTY);
        otherPartnerType.setPartnerInformation(getPartnerInformationTypeForBody(cosOrder.getBillTo(), false));

        salesOrderPartnersType.setBuyer(buyerType);
        salesOrderPartnersType.setSeller(sellerType);
        salesOrderPartnersType.setShipTo(shipToType);
        salesOrderPartnersType.getOtherPartner().add(otherPartnerType);
        
        return salesOrderPartnersType;
    }

    private SalesOrderReportPropertiesType getSalesOrderPropertiesType(COSOrderInfo cosOrder) {
        SalesOrderReportPropertiesType salesOrderReportPropertiesType = new SalesOrderReportPropertiesType();

        SalesOrderNumberType salesOrderNumberType = new SalesOrderNumberType();
        salesOrderNumberType.setDocumentIdentifier(cosOrder.getOrderNumber());

        SalesOrderTypeCodeType salesOrderTypeCodeType = new SalesOrderTypeCodeType();
        salesOrderTypeCodeType.setValue(XmlConstants.COS_TRAN_TYPE);

        SalesOrderIssuedDateType salesOrderIssuedDateType = new SalesOrderIssuedDateType();
        salesOrderIssuedDateType.setDateTime(getDateTimeType(cosOrder.getOrderDate()));

        salesOrderReportPropertiesType.setSalesOrderNumber(salesOrderNumberType);
        salesOrderReportPropertiesType.setSalesOrderTypeCode(salesOrderTypeCodeType);
        salesOrderReportPropertiesType.setSalesOrderIssuedDate(salesOrderIssuedDateType);
        return salesOrderReportPropertiesType;
    }
}

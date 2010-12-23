package com.monsanto.irdsoapservices.salesorder.helper;

import com.monsanto.irdsoapservices.salesorder.constants.XmlConstants;
import com.monsanto.irdsoapservices.salesorder.domain.COSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.LineItemInfo;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.schema.*;

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
            salesOrderLineItemType =  new SalesOrderLineItemType();
            salesOrderLineItemType.getProductIdentification().add(getProductionIdentificationType(ListProductIDAgency.AGIIS_PRODUCT_ID, lineItem.getProductGtin(), lineItem.getProductName()));

            ProductQuantityEquivalentType productQuantityEquivalentType = new ProductQuantityEquivalentType();
            productQuantityEquivalentType.setMeasurement(getMeasurementType(lineItem.getQtyUom(), lineItem.getOrderQty()));
            salesOrderLineItemType.setProductQuantityEquivalent(productQuantityEquivalentType);

            ShippedQuantityEquivalentType shippedQuantityEquivalentType = new ShippedQuantityEquivalentType();
            shippedQuantityEquivalentType.setMeasurement(getMeasurementType(lineItem.getQtyUom(), lineItem.getShippedQty()));
            salesOrderLineItemType.setShippedQuantityEquivalent(shippedQuantityEquivalentType);

            PendingQuantityEquivalentType pendingQuantityEquivalentType = new PendingQuantityEquivalentType();
            pendingQuantityEquivalentType.setMeasurement(getMeasurementType(lineItem.getQtyUom(), lineItem.getPendingQty()));
            salesOrderLineItemType.setPendingQuantityEquivalent(pendingQuantityEquivalentType);

            salesOrderTransactionDetailsType.getSalesOrderLineItem().add(salesOrderLineItemType);
        }

        return salesOrderTransactionDetailsType;
    }

    private SalesOrderPartnersType getSalesOrderPartnersType(TransactionInfo transactionInfo, COSOrderInfo cosOrder) {
        SalesOrderPartnersType salesOrderPartnersType = new SalesOrderPartnersType();
        ShipToType shipToType = new ShipToType();
        shipToType.setPartnerInformation(getPartnerInformationTypeForBody(cosOrder.getDealerInfo(), false));

        BuyerType buyerType = new BuyerType();
        buyerType.setPartnerInformation(getPartnerInformationForHeader(transactionInfo.getName(), transactionInfo.getCompanyCode(), ListPartnerAgencyAttribute.AGIIS_EBID));

        SellerType sellerType = new SellerType();
        sellerType.setPartnerInformation(getPartnerInformationForHeader(XmlConstants.MONSANTO_PARTNER_NAME, XmlConstants.MONSANTO_EBID, ListPartnerAgencyAttribute.AGIIS_EBID));

        salesOrderPartnersType.setBuyer(buyerType);
        salesOrderPartnersType.setSeller(sellerType);
        salesOrderPartnersType.setShipTo(shipToType);

        return salesOrderPartnersType;
    }

    private SalesOrderReportPropertiesType getSalesOrderPropertiesType(COSOrderInfo cosOrder) {
        SalesOrderReportPropertiesType salesOrderReportPropertiesType = new SalesOrderReportPropertiesType();

        SalesOrderNumberType salesOrderNumberType = new SalesOrderNumberType();
        salesOrderNumberType.setDocumentIdentifier(cosOrder.getOrderNumber());

        SalesOrderTypeCodeType salesOrderTypeCodeType = new SalesOrderTypeCodeType();
        salesOrderTypeCodeType.setValue(XmlConstants.COS_TRAN_TYPE);

        salesOrderReportPropertiesType.setSalesOrderNumber(salesOrderNumberType);
        salesOrderReportPropertiesType.setSalesOrderTypeCode(salesOrderTypeCodeType);

        return salesOrderReportPropertiesType;
    }
}

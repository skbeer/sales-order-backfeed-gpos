package com.monsanto.irdsoapservices.salesorder.helper;

import com.monsanto.irdsoapservices.salesorder.constants.XmlConstants;
import com.monsanto.irdsoapservices.salesorder.domain.PPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.PartnerInfo;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.domain.LineItemInfo;
import com.monsanto.irdsoapservices.salesorder.schema.*;
import com.monsanto.irdsoapservices.utils.StringUtils;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 9, 2010
 * Time: 9:28:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class PPOSRequestBuilder extends AbstractRequestBuilder {

    public SalesOrderReport buildPPOSRequest(List<PPOSOrderInfo> pposOrders, TransactionInfo transactionInfo) throws Exception {
        SalesOrderReport salesOrderReport = new SalesOrderReport();
        salesOrderReport.setHeader(getHeaderType(transactionInfo, XmlConstants.PPOS_TRAN_TYPE));
        salesOrderReport.setVersion("1.0");
        salesOrderReport.setSalesOrderReportBody(getSalesOrderReportBodyType(pposOrders, transactionInfo));
        return salesOrderReport;
    }

    private SalesOrderReportBodyType getSalesOrderReportBodyType(List<PPOSOrderInfo> pposOrderInfo, TransactionInfo transactionInfo) throws Exception {
        SalesOrderReportBodyType salesOrderReportBodyType = new SalesOrderReportBodyType();
        for(PPOSOrderInfo pposOrder : pposOrderInfo) {
            SalesOrderReportDetailsType salesOrderReportDetailsType = new SalesOrderReportDetailsType();

            SalesOrderReportPropertiesType salesOrderReportPropertiesType = getSalesOrderPropertiesType(pposOrder);
            SalesOrderPartnersType salesOrderPartnersType = getSalesOrderPartnersType(transactionInfo, pposOrder);
            SalesOrderTransactionDetailsType salesOrderTransactionDetailsType = getSalesOrderTransactionDetailsType(pposOrder);

            salesOrderReportDetailsType.setSalesOrderReportProperties(salesOrderReportPropertiesType);
            salesOrderReportDetailsType.setSalesOrderPartners(salesOrderPartnersType);
            salesOrderReportDetailsType.setSalesOrderTransactionDetails(salesOrderTransactionDetailsType);

            salesOrderReportBodyType.getSalesOrderReportDetails().add(salesOrderReportDetailsType);
        }
        return salesOrderReportBodyType;
    }

    private SalesOrderTransactionDetailsType getSalesOrderTransactionDetailsType(PPOSOrderInfo pposOrder) {
        SalesOrderTransactionDetailsType salesOrderTransactionDetailsType = new SalesOrderTransactionDetailsType();
        SalesOrderLineItemType salesOrderLineItemType = null;

        for(LineItemInfo lineItem : pposOrder.getLineItems()) {
            salesOrderLineItemType = new SalesOrderLineItemType();
            salesOrderLineItemType.setLineNumber(new Long(lineItem.getItemNumber()).longValue());
            salesOrderLineItemType.getProductIdentification().add(getProductionIdentificationType(ListProductIDAgency.AGIIS_PRODUCT_ID, lineItem.getProductGtin(), lineItem.getProductName()));
            salesOrderLineItemType.getProductIdentification().add(getProductionIdentificationType(ListProductIDAgency.UPC, lineItem.getProductUpc(), lineItem.getProductName()));
            ProductQuantityType_0020 productQuantityType_0020 = new ProductQuantityType_0020();
            productQuantityType_0020.setMeasurement(getMeasurementType(lineItem.getSalesQuantity().getQtyUom(), lineItem.getSalesQuantity().getQtyValue()));
            salesOrderLineItemType.setProductQuantity(productQuantityType_0020);
            ProductQuantityEquivalentType productQuantityEquivalentType = new ProductQuantityEquivalentType();
            productQuantityEquivalentType.setMeasurement(getMeasurementType(lineItem.getEquivalentQuantity().getQtyUom(), lineItem.getEquivalentQuantity().getQtyValue()));
            salesOrderLineItemType.setProductQuantityEquivalent(productQuantityEquivalentType);
            if(!StringUtils.isNullOrEmpty(lineItem.getSalesRepId())) {
                SalesPersonType salesPersonType = new SalesPersonType();
                salesPersonType.setPartnerInformation(getPartnerInformationForHeader(lineItem.getSalesRepName(), lineItem.getSalesRepId(), ListPartnerAgencyAttribute.ASSIGNED_BY_BUYER));
                salesOrderLineItemType.setSalesPerson(salesPersonType);
            }
            salesOrderTransactionDetailsType.getSalesOrderLineItem().add(salesOrderLineItemType);
        }
        return salesOrderTransactionDetailsType;
    }

    private SalesOrderPartnersType getSalesOrderPartnersType(TransactionInfo transactionInfo, PPOSOrderInfo pposOrder) {
        SalesOrderPartnersType salesOrderPartnersType = new SalesOrderPartnersType();
        ShipToType shipToType = new ShipToType();
        shipToType.setPartnerInformation(getPartnerInformationTypeForBody(pposOrder.getDealerInfo(), false));

        BuyerType buyerType = new BuyerType();
        buyerType.setPartnerInformation(getPartnerInformationForHeader(transactionInfo.getName(), transactionInfo.getCompanyCode(), ListPartnerAgencyAttribute.AGIIS_EBID));

        SellerType sellerType = new SellerType();
        sellerType.setPartnerInformation(getPartnerInformationForHeader(XmlConstants.MONSANTO_PARTNER_NAME, XmlConstants.MONSANTO_EBID, ListPartnerAgencyAttribute.AGIIS_EBID));

        OtherPartnerType otherPartnerType = new OtherPartnerType();
        otherPartnerType.setPartnerRole(ListPartnerRoles.BILL_TO_PARTY);
        otherPartnerType.setPartnerInformation(getPartnerInformationTypeForBody(pposOrder.getDealerInfo(), false));

        salesOrderPartnersType.setBuyer(buyerType);
        salesOrderPartnersType.setSeller(sellerType);
        salesOrderPartnersType.setShipTo(shipToType);
        salesOrderPartnersType.getOtherPartner().add(otherPartnerType);

        otherPartnerType = new OtherPartnerType();
        otherPartnerType.setPartnerRole(ListPartnerRoles.END_USE_CUSTOMER);
        otherPartnerType.setPartnerInformation(getPartnerInformationTypeForBody(pposOrder.getGrowerInfo(), true));
        salesOrderPartnersType.getOtherPartner().add(otherPartnerType);
        return salesOrderPartnersType;
    }

    private SalesOrderReportPropertiesType getSalesOrderPropertiesType(PPOSOrderInfo pposOrder) {
        SalesOrderReportPropertiesType salesOrderReportPropertiesType = new SalesOrderReportPropertiesType();

        SalesOrderNumberType salesOrderNumberType = new SalesOrderNumberType();
        salesOrderNumberType.setDocumentIdentifier(pposOrder.getOrderNumber());

        SalesOrderTypeCodeType salesOrderTypeCodeType = new SalesOrderTypeCodeType();
        salesOrderTypeCodeType.setValue(pposOrder.getOrderType());

        SalesOrderIssuedDateType salesOrderIssuedDateType = new SalesOrderIssuedDateType();
        salesOrderIssuedDateType.setDateTime(getDateTimeType(pposOrder.getOrderDate()));

        salesOrderReportPropertiesType.setSalesOrderNumber(salesOrderNumberType);
        salesOrderReportPropertiesType.setSalesOrderTypeCode(salesOrderTypeCodeType);
        salesOrderReportPropertiesType.setSalesOrderIssuedDate(salesOrderIssuedDateType);
        salesOrderReportPropertiesType.setSalesOrderYear(pposOrder.getOrderFiscalYear());
        return salesOrderReportPropertiesType;
    }

}

package com.monsanto.salesorder.helper.test;

import com.monsanto.irdsoapservices.salesorder.domain.LineItemInfo;
import com.monsanto.irdsoapservices.salesorder.domain.GPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.PartnerInfo;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.helper.GPOSRequestBuilder;
import com.monsanto.irdsoapservices.salesorder.schema.*;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 10, 2010
 * Time: 12:54:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class GPOSRequestBuilder_UT extends TestCase {

    GPOSRequestBuilder requestBuilder = new GPOSRequestBuilder();
    private static final String GPOS_ORDER_TYPE = "NS";
    private static final String GPOS_TRANS_TYPE = "GPOS";

    public void testBuildPPOSRequet() throws Exception {
        SalesOrderReport salesReport = requestBuilder.buildGPOSRequest(getGPOSPposOrderInfo(), getTransactionInfo());
        assertNotNull(salesReport);
        assertEquals("1", salesReport.getHeader().getSalesOrderReportSequenceNumber());
        assertTrue(salesReport.getHeader().getThisDocumentIdentifier().getDocumentIdentifier().startsWith("NS_1_SEQUENCE_1001_"));
        assertEquals("MONSANTO AGRICULTURAL CO", salesReport.getHeader().getFrom().getPartnerInformation().getPartnerName().get(0));
        assertEquals(1, salesReport.getSalesOrderReportBody().getSalesOrderReportDetails().size());
        List<SalesOrderReportDetailsType> salesOrderReportDetailsTypeList=salesReport.getSalesOrderReportBody().getSalesOrderReportDetails();
        for(SalesOrderReportDetailsType salesOrderReportDetailsType:salesOrderReportDetailsTypeList){
            SalesOrderReportPropertiesType salesOrderReportPropertiesType=salesOrderReportDetailsType.getSalesOrderReportProperties();
            assertEquals(salesOrderReportPropertiesType.getSalesOrderTypeCode().getValue(), GPOS_ORDER_TYPE);
            SalesOrderTransactionDetailsType salesOrderTransactionDetailsType=salesOrderReportDetailsType.getSalesOrderTransactionDetails();
            List<SalesOrderLineItemType> salesOrderLinetItemList=salesOrderTransactionDetailsType.getSalesOrderLineItem();

            SalesOrderLineItemType salesOrderLineItemType1=salesOrderLinetItemList.get(0);
            DeliveryQuantityType deliveryQuantityType1=salesOrderLineItemType1.getDeliveredQuantity();
            assertEquals(deliveryQuantityType1.getMeasurement().getMeasurementValue(),101.0);
            assertEquals(deliveryQuantityType1.getMeasurement().getUnitOfMeasureCode().getValue(),"UN");
            DeliveryQuantityEquivalentType deliveryQuantityEquivalentType1=salesOrderLineItemType1.getDeliveredQuantityEquivalent();
            assertEquals(deliveryQuantityEquivalentType1.getMeasurement().getMeasurementValue(),100.0);
            assertEquals(deliveryQuantityEquivalentType1.getMeasurement().getUnitOfMeasureCode().getValue(),"BG");

            SalesOrderLineItemType salesOrderLineItemType2=salesOrderLinetItemList.get(1);
            DeliveryQuantityType deliveryQuantityType2=salesOrderLineItemType2.getDeliveredQuantity();
            assertEquals(deliveryQuantityType2.getMeasurement().getMeasurementValue(),201.0);
            assertEquals(deliveryQuantityType2.getMeasurement().getUnitOfMeasureCode().getValue(),"UN");
            DeliveryQuantityEquivalentType deliveryQuantityEquivalentType2=salesOrderLineItemType2.getDeliveredQuantityEquivalent();
            assertEquals(deliveryQuantityEquivalentType2.getMeasurement().getMeasurementValue(),200.0);
            assertEquals(deliveryQuantityEquivalentType2.getMeasurement().getUnitOfMeasureCode().getValue(),"BG");
        }
    }

    private List<GPOSOrderInfo> getGPOSPposOrderInfo() {
        GPOSOrderInfo gposOrderInfo = new GPOSOrderInfo();
        gposOrderInfo.setOrderNumber("100");
        gposOrderInfo.setOrderDate(new Date());
        gposOrderInfo.setOrderFiscalYear("2010");
        gposOrderInfo.setOrderType(GPOS_ORDER_TYPE);
        gposOrderInfo.setDealerInfo(getPartnerInfo("Dealer"));
        gposOrderInfo.setGrowerInfo(getPartnerInfo("Grower"));
        gposOrderInfo.getLineItems().add(getLineItemInfo("1", "Product 1", "GTIN 1", "UPC 1", "100", "BG", "101", "UN", getPartnerInfo("SalesRep1 ")));
        gposOrderInfo.getLineItems().add(getLineItemInfo("2", "Product 2", "GTIN 2", "UPC 2", "200", "BG", "201", "UN", getPartnerInfo("SalesRep2 ")));
        List<GPOSOrderInfo> list = new ArrayList<GPOSOrderInfo>();
        list.add(gposOrderInfo);
        return list;
    }

    private TransactionInfo getTransactionInfo() {
        TransactionInfo transactionInfo = new TransactionInfo();
        transactionInfo.setCompanyCode("1001");
        transactionInfo.setGroupCode("XA");
        transactionInfo.setName("Company Name");
        transactionInfo.setLastTransactionNumber(0);
        transactionInfo.setTransactionType(GPOS_TRANS_TYPE);
        transactionInfo.setMaxFileSize(10);
        return transactionInfo;
    }

    private PartnerInfo getPartnerInfo(String prefix) {
        PartnerInfo partnerInfo = new PartnerInfo();
        partnerInfo.setPartnerName(prefix+" Name");
        partnerInfo.setContactName(prefix+" ContactName");
        partnerInfo.setAcctId(prefix+" AcctId");
        partnerInfo.setAddress(prefix+" Address");
        partnerInfo.setCity(prefix+" City");
        partnerInfo.setCounty(prefix+" County");
        partnerInfo.setEbid(prefix+" Ebid");
        partnerInfo.setState(prefix+" State");
        partnerInfo.setZip(prefix+" Zip");
        return partnerInfo;
    }

    private LineItemInfo getLineItemInfo(String itemNumber, String productName, String productGtin, String productUpc, String equivalentQuantity, String equivalentQuantityUom, String salesQuantity, String salesQuantityUom, PartnerInfo salesRep) {
        LineItemInfo lineItemInfo = new LineItemInfo();
        lineItemInfo.setItemNumber(itemNumber);
        lineItemInfo.setProductName(productName);
        lineItemInfo.setProductGtin(productGtin);
        lineItemInfo.setProductUpc(productUpc);
        lineItemInfo.getEquivalentQuantity().setQtyValue(equivalentQuantity);
        lineItemInfo.getEquivalentQuantity().setQtyUom(equivalentQuantityUom);
        lineItemInfo.getSalesQuantity().setQtyValue(salesQuantity);
        lineItemInfo.getSalesQuantity().setQtyUom(salesQuantityUom);
        salesRep.setBuyerId(itemNumber);
        lineItemInfo.setSalesRep(salesRep);
        return lineItemInfo;
    }

}

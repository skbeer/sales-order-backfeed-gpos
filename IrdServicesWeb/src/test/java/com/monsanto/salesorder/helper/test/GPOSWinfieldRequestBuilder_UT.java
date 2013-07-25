package com.monsanto.salesorder.helper.test;

import com.monsanto.irdsoapservices.constants.DBConstants;
import com.monsanto.irdsoapservices.salesorder.domain.GPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.LineItemInfo;
import com.monsanto.irdsoapservices.salesorder.domain.PartnerInfo;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.helper.GPOSWinfieldRequestBuilder;
import com.monsanto.irdsoapservices.salesorder.schema.*;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: caggarw
 * Date: Mar 22, 2012
 * Time: 3:00:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class GPOSWinfieldRequestBuilder_UT extends TestCase {

    GPOSWinfieldRequestBuilder requestBuilder = new GPOSWinfieldRequestBuilder();
    private static final String GPOS_ORDER_TYPE = "NS";

    public void testBuildGPOSRequet() throws Exception {
        SalesOrderReport salesReport = requestBuilder.buildGPOSRequest(getGPOSPposOrderInfo(), getTransactionInfo());
        assertNotNull(salesReport);
        assertEquals("1", salesReport.getHeader().getSalesOrderReportSequenceNumber());
        assertTrue(salesReport.getHeader().getThisDocumentIdentifier().getDocumentIdentifier().startsWith("NS_AGRIMINE_"));
        assertEquals("MONSANTO AGRICULTURAL CO", salesReport.getHeader().getFrom().getPartnerInformation().getPartnerName().get(0));
        assertEquals(1, salesReport.getSalesOrderReportBody().getSalesOrderReportDetails().size());
        List<SalesOrderReportDetailsType> salesOrderReportDetailsTypeList=salesReport.getSalesOrderReportBody().getSalesOrderReportDetails();
        for(SalesOrderReportDetailsType salesOrderReportDetailsType:salesOrderReportDetailsTypeList){
            SalesOrderReportPropertiesType salesOrderReportPropertiesType=salesOrderReportDetailsType.getSalesOrderReportProperties();

            SalesOrderPartnersType salesOrderPartnersType = salesOrderReportDetailsType.getSalesOrderPartners();
            List<OtherPartnerType> otherPartnerList = salesOrderPartnersType.getOtherPartner();
            int count=0;
            for (OtherPartnerType otherPartner: otherPartnerList) {
                PartnerInformationType partnerInfo = otherPartner.getPartnerInformation();
                if (ListPartnerRoles.SELLING_PARTNER.value().equalsIgnoreCase(otherPartner.getPartnerRole().value())) {
                    List<PartnerIdentifierType> partnerIdentifierTypeList = partnerInfo.getPartnerIdentifier();
                    for (PartnerIdentifierType partnerIdentifierType : partnerIdentifierTypeList) {
                        String agency = partnerIdentifierType.getAgency().value();
                        if(ListPartnerAgencyAttribute.ASSIGNED_BY_BUYER.value().equalsIgnoreCase(agency)){
                            assertEquals("SalesRep Id", partnerIdentifierType.getValue());
                           assertEquals("SalesRep Name", partnerInfo.getPartnerName().get(0));
                            AddressInformationType address = partnerInfo.getAddressInformation();
                            assertEquals("SalesRep Address", address.getAddressLine().get(0));
                            assertEquals("SalesRep City", address.getCityName());
                            assertEquals("SalesRep State", address.getStateOrProvince());
                           count++;
                        }
                    }
                }

            }
            assertEquals(1, count);
            assertEquals(salesOrderReportPropertiesType.getSalesOrderTypeCode().getValue(), GPOS_ORDER_TYPE);
            SalesOrderTransactionDetailsType salesOrderTransactionDetailsType=salesOrderReportDetailsType.getSalesOrderTransactionDetails();
            List<SalesOrderLineItemType> salesOrderLinetItemList=salesOrderTransactionDetailsType.getSalesOrderLineItem();

            SalesOrderLineItemType salesOrderLineItemType1=salesOrderLinetItemList.get(0);
            DeliveryQuantityType deliveryQuantityType1=salesOrderLineItemType1.getDeliveredQuantity();
            assertEquals(1, salesOrderLineItemType1.getLineNumber());
            assertEquals(deliveryQuantityType1.getMeasurement().getMeasurementValue(),101.0);
            assertEquals(deliveryQuantityType1.getMeasurement().getUnitOfMeasureCode().getValue(),"UN");
            DeliveryQuantityEquivalentType deliveryQuantityEquivalentType1=salesOrderLineItemType1.getDeliveredQuantityEquivalent();
            assertEquals(deliveryQuantityEquivalentType1.getMeasurement().getMeasurementValue(),100.0);
            assertEquals(deliveryQuantityEquivalentType1.getMeasurement().getUnitOfMeasureCode().getValue(),"BG");

            assertEquals("Manual",salesOrderLineItemType1.getOrderTransactionType());

            SalesOrderLineItemType salesOrderLineItemType2=salesOrderLinetItemList.get(1);
            assertEquals(2, salesOrderLineItemType2.getLineNumber());
            DeliveryQuantityType deliveryQuantityType2=salesOrderLineItemType2.getDeliveredQuantity();
            assertEquals(deliveryQuantityType2.getMeasurement().getMeasurementValue(),201.0);
            assertEquals(deliveryQuantityType2.getMeasurement().getUnitOfMeasureCode().getValue(),"UN");
            DeliveryQuantityEquivalentType deliveryQuantityEquivalentType2=salesOrderLineItemType2.getDeliveredQuantityEquivalent();
            assertEquals(deliveryQuantityEquivalentType2.getMeasurement().getMeasurementValue(),200.0);
            assertEquals(deliveryQuantityEquivalentType2.getMeasurement().getUnitOfMeasureCode().getValue(),"BG");
            assertNull(salesOrderLineItemType2.getOrderTransactionType());


            SalesOrderLineItemType salesOrderLineItemType3=salesOrderLinetItemList.get(2);
            assertEquals(3, salesOrderLineItemType3.getLineNumber());
            DeliveryQuantityType deliveryQuantityType3=salesOrderLineItemType3.getDeliveredQuantity();
            assertEquals(deliveryQuantityType3.getMeasurement().getMeasurementValue(),0.0);
            assertEquals(deliveryQuantityType3.getMeasurement().getUnitOfMeasureCode().getValue(),"UN");
            DeliveryQuantityEquivalentType deliveryQuantityEquivalentType3=salesOrderLineItemType3.getDeliveredQuantityEquivalent();
            assertEquals(deliveryQuantityEquivalentType3.getMeasurement().getMeasurementValue(),0.0);
            assertEquals(deliveryQuantityEquivalentType3.getMeasurement().getUnitOfMeasureCode().getValue(),"BG");
            assertNull(salesOrderLineItemType3.getOrderTransactionType());

            SalesOrderLineItemType salesOrderLineItemType4=salesOrderLinetItemList.get(3);
            assertEquals(4, salesOrderLineItemType4.getLineNumber());
            DeliveryQuantityType deliveryQuantityType4=salesOrderLineItemType4.getDeliveredQuantity();
            assertEquals(deliveryQuantityType4.getMeasurement().getMeasurementValue(),0.0);
            assertEquals(deliveryQuantityType4.getMeasurement().getUnitOfMeasureCode().getValue(),"UN");
            DeliveryQuantityEquivalentType deliveryQuantityEquivalentType4=salesOrderLineItemType4.getDeliveredQuantityEquivalent();
            assertEquals(deliveryQuantityEquivalentType4.getMeasurement().getMeasurementValue(),0.0);
            assertEquals(deliveryQuantityEquivalentType4.getMeasurement().getUnitOfMeasureCode().getValue(),"BG");
            assertNull(salesOrderLineItemType4.getOrderTransactionType());
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
        PartnerInfo winfieldSalesRep = getPartnerInfo("SalesRep");
        winfieldSalesRep.setBuyerId("SalesRep Id");
        gposOrderInfo.setSalesRepWinfield(winfieldSalesRep);
        gposOrderInfo.getLineItems().add(getLineItemInfo("1", "Product 1", "GTIN 1", "UPC 1", "100", "BG", "101", "UN", getPartnerInfo("SalesRep1 "), "Y"));
        gposOrderInfo.getLineItems().add(getLineItemInfo("2", "Product 2", "GTIN 2", "UPC 2", "200", "BG", "201", "UN", getPartnerInfo("SalesRep2 "), "N"));
        gposOrderInfo.getLineItems().add(getLineItemInfo("3", "Product 3", "GTIN 3", "UPC 3", null, "BG", null, "UN", getPartnerInfo("SalesRep3 "), "N"));
        gposOrderInfo.getLineItems().add(getLineItemInfo("4", "Product 4", "GTIN 4", "UPC 4", "w", "BG", "w", "UN", getPartnerInfo("SalesRep4 "), "N"));
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
        transactionInfo.setTransactionType(DBConstants.GPOS_AGRIMINE_TRAN_TYPE);
        transactionInfo.setDataSourceType(DBConstants.AGRIMINE_DATA_SOURCE_TYPE);
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

    private LineItemInfo getLineItemInfo(String itemNumber, String productName, String productGtin, String productUpc, String equivalentQuantity, String equivalentQuantityUom, String salesQuantity, String salesQuantityUom, PartnerInfo salesRep, String touchedUntouched) {
        LineItemInfo lineItemInfo = new LineItemInfo();
        lineItemInfo.setItemNumber(itemNumber);
        lineItemInfo.setProductName(productName);
        lineItemInfo.setProductGtin(productGtin);
        lineItemInfo.setProductUpc(productUpc);
        lineItemInfo.getEquivalentQuantity().setQtyValue(equivalentQuantity);
        lineItemInfo.getEquivalentQuantity().setQtyUom(equivalentQuantityUom);
        lineItemInfo.getSalesQuantity().setQtyValue(salesQuantity);
        lineItemInfo.getSalesQuantity().setQtyUom(salesQuantityUom);
        lineItemInfo.setOrderTransactionType(touchedUntouched);
        salesRep.setBuyerId(itemNumber);
        lineItemInfo.setSalesRep(salesRep);
        return lineItemInfo;
    }

}

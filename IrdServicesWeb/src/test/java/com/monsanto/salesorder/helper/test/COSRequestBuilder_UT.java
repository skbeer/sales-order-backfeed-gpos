package com.monsanto.salesorder.helper.test;

import junit.framework.TestCase;
import com.monsanto.irdsoapservices.salesorder.helper.COSRequestBuilder;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.domain.PartnerInfo;
import com.monsanto.irdsoapservices.salesorder.domain.COSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.LineItemInfo;
import com.monsanto.irdsoapservices.salesorder.schema.SalesOrderReport;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Aug 24, 2010
 * Time: 10:20:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class COSRequestBuilder_UT extends TestCase {

    COSRequestBuilder requestBuilder = new COSRequestBuilder();

    public void testBuildCosRequest() throws Exception {
        SalesOrderReport salesOrderReport = requestBuilder.buildCOSRequest(getCosOrders(3), getTransactionInfo());
        assertNotNull(salesOrderReport);
        assertEquals("1", salesOrderReport.getHeader().getSalesOrderReportSequenceNumber());
        assertEquals("Company Name", salesOrderReport.getHeader().getTo().getPartnerInformation().getPartnerName().get(0));
        assertEquals("1001", salesOrderReport.getHeader().getTo().getPartnerInformation().getPartnerIdentifier().get(0).getValue());
        assertEquals(3, salesOrderReport.getSalesOrderReportBody().getSalesOrderReportDetails().size());
        assertEquals("1 Name", salesOrderReport.getSalesOrderReportBody().getSalesOrderReportDetails().get(0).getSalesOrderPartners().getShipTo().getPartnerInformation().getPartnerName().get(0));
    }

    private List<COSOrderInfo> getCosOrders(int count) {
        List<COSOrderInfo> cosOrders = new ArrayList<COSOrderInfo>();
        for (int index = 0; index < count; index++) {
            COSOrderInfo cosOrderInfo =  new COSOrderInfo();
            cosOrderInfo.setDealerInfo(getPartnerInfo("1"));
            cosOrderInfo.setOrderNumber("1001"+index);
            cosOrderInfo.getLineItems().add(getLineItem(index));
            cosOrders.add(cosOrderInfo);
        }
        return cosOrders;
    }

    private TransactionInfo getTransactionInfo() {
        TransactionInfo transactionInfo = new TransactionInfo();
        transactionInfo.setCompanyCode("1001");
        transactionInfo.setGroupCode("XA");
        transactionInfo.setName("Company Name");
        transactionInfo.setLastTransactionNumber(0);
        transactionInfo.setTransactionType("COS");
        return transactionInfo;
    }

    private LineItemInfo getLineItem(int index) {
        LineItemInfo lineItemInfo = new LineItemInfo();
        lineItemInfo.setProductGtin("GTIN"+index);
        lineItemInfo.setOrderQty("10"+index);
        lineItemInfo.setPendingQty("20"+index);
        lineItemInfo.setShippedQty("30"+index);
        return lineItemInfo;
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


}

package com.monsanto.salesorder.helper.test;

import com.monsanto.irdsoapservices.salesorder.client.ClientFactory;
import com.monsanto.irdsoapservices.salesorder.dao.SalesOrderDao;
import com.monsanto.irdsoapservices.salesorder.dao.TransactionDao;
import com.monsanto.irdsoapservices.salesorder.domain.GPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.LineItemInfo;
import com.monsanto.irdsoapservices.salesorder.domain.PartnerInfo;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.exception.SalesOrderException;
import com.monsanto.irdsoapservices.salesorder.helper.GPOSWinfieldHelper;
import com.monsanto.irdsoapservices.salesorder.helper.GPOSWinfieldRequestBuilder;
import com.monsanto.irdsoapservices.salesorder.schema.*;
import junit.framework.TestCase;
import org.easymock.classextension.EasyMock;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: caggarw
 * Date: Mar 20, 2012
 * Time: 3:19:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class GPOSWinfieldHelper_UT extends TestCase {
    GPOSWinfieldHelper helper = new GPOSWinfieldHelper();
    List<GPOSOrderInfo> orderList = new ArrayList<GPOSOrderInfo>();
    SalesOrderDao salesOrderDao;
    ClientFactory clientFactory;
    GPOSWinfieldRequestBuilder requestBuilder;
    SalesOrderService salesOrderServiceClient;
    TransactionDao transactionDao;

    @Override
    protected void setUp() throws Exception {
        clientFactory = EasyMock.createMock(ClientFactory.class);
        requestBuilder = EasyMock.createMock(GPOSWinfieldRequestBuilder.class);
        salesOrderDao = org.easymock.EasyMock.createMock(SalesOrderDao.class);
        helper.setSalesOrderDao(salesOrderDao);
        helper.setClientFactory(clientFactory);
        helper.setGposWinfieldRequestBuilder(requestBuilder);
        salesOrderServiceClient = org.easymock.EasyMock.createMock(SalesOrderService.class);
        transactionDao = EasyMock.createMock(TransactionDao.class);
        helper.setTransactionDao(transactionDao);
    }

    public void testNormalizeOrders() throws Exception {
        orderList.add(getGPOSOrder("1001", "1", "1234", "456"));
        orderList.add(getGPOSOrder("1001", "2", "1234", "456"));

        orderList.add(getGPOSOrder("1002", "1", "1234", "456"));

        orderList.add(getGPOSOrder("1003", "1", "1234", "456"));
        orderList.add(getGPOSOrder("1003", "2", "1234", "456"));
        orderList.add(getGPOSOrder("1003", "3", "1234", "456"));
        orderList.add(getGPOSOrder("1003", "1", "1234", "789"));
        List<GPOSOrderInfo> normalizedOrders = helper.normalizeOrderLineItems(orderList);
        assertEquals(4, normalizedOrders.size());
        assertEquals(2, normalizedOrders.get(0).getLineItems().size());
        assertEquals(1, normalizedOrders.get(1).getLineItems().size());
        assertEquals(3, normalizedOrders.get(2).getLineItems().size());
        assertEquals(1, normalizedOrders.get(3).getLineItems().size());
    }

    public void testNormalizeOrders_scenario2() throws Exception {
        orderList.add(getGPOSOrder("1001", "1", "1234", "456"));

        orderList.add(getGPOSOrder("1002", "1", "1234", "456"));
        orderList.add(getGPOSOrder("1002", "2", "1234", "456"));
        orderList.add(getGPOSOrder("1002", "3", "1234", "456"));
        orderList.add(getGPOSOrder("1002", "3", "1234", "456"));
        orderList.add(getGPOSOrder("1002", "4", "1234", "456"));
        orderList.add(getGPOSOrder("1002", "3", "1234", "789"));
        orderList.add(getGPOSOrder("1002", "3", "3456", "789"));

        orderList.add(getGPOSOrder("1003", "3", "1234", "456"));
        List<GPOSOrderInfo> normalizedOrders = helper.normalizeOrderLineItems(orderList);
        assertEquals(5, normalizedOrders.size());
        assertEquals(1, normalizedOrders.get(0).getLineItems().size());
        assertEquals(5, normalizedOrders.get(1).getLineItems().size());
        assertEquals(1, normalizedOrders.get(2).getLineItems().size());
        assertEquals(1, normalizedOrders.get(3).getLineItems().size());
        assertEquals(1, normalizedOrders.get(3).getLineItems().size());
    }

    public void testNormalizeOrders_scenario3() throws Exception {
        orderList.add(getGPOSOrder("1001", "1", "1234", "456"));
        orderList.add(getGPOSOrder("1001", "2", "1234", "456"));
        orderList.add(getGPOSOrder("1002", "1", "1234", "456"));
        orderList.add(getGPOSOrder("1003", "1", "1234", "456"));
        orderList.add(getGPOSOrder("1004", "2", "1234", "456"));
        orderList.add(getGPOSOrder("1005", "1", "1234", "456"));
        orderList.add(getGPOSOrder("1005", "2", "1234", "456"));
        orderList.add(getGPOSOrder("1006", "2", "1234", "456"));
        orderList.add(getGPOSOrder("1007", "2", "1234", "456"));
        orderList.add(getGPOSOrder("1008", "2", "1234", "456"));
        List<GPOSOrderInfo> normalizedOrders = helper.normalizeOrderLineItems(orderList);
        assertEquals(8, normalizedOrders.size());
        assertEquals(2, normalizedOrders.get(0).getLineItems().size());
        assertEquals(1, normalizedOrders.get(1).getLineItems().size());
        assertEquals(1, normalizedOrders.get(2).getLineItems().size());
        assertEquals(1, normalizedOrders.get(3).getLineItems().size());
        assertEquals(2, normalizedOrders.get(4).getLineItems().size());
        assertEquals(1, normalizedOrders.get(5).getLineItems().size());
        assertEquals(1, normalizedOrders.get(6).getLineItems().size());
        assertEquals(1, normalizedOrders.get(7).getLineItems().size());
    }

    public void testNormalizeOrders_scenario4() throws Exception {
        orderList.add(getGPOSOrder("1001", "1", "1234", "456"));
        List<GPOSOrderInfo> normalizedOrders = helper.normalizeOrderLineItems(orderList);
        assertEquals(1, normalizedOrders.size());
        assertEquals(1, normalizedOrders.get(0).getLineItems().size());
    }

    public void testProcessGPOSOrder_noException_returnOrdersSent() throws Exception {
        Date aDate = new Date();
        List<GPOSOrderInfo> orders = new ArrayList<GPOSOrderInfo>();
        orders.add(getGPOSOrder("1001", "1", "1234", "456"));
        TransactionInfo transactionInfo = getTransactionInfo(aDate, "ABC");
        transactionInfo.setDataSourceType("ABC");
        org.easymock.EasyMock.expect(salesOrderDao.getGPOSWinfieldOrders(aDate, "ABC", "ABC")).andReturn(orders);
        EasyMock.expect(requestBuilder.buildGPOSRequest((List<GPOSOrderInfo>)EasyMock.anyObject(), (TransactionInfo)EasyMock.anyObject())).andReturn(getSalesOrderReport());
        EasyMock.expect(clientFactory.getSalesOrderClient()).andReturn(salesOrderServiceClient);
        org.easymock.EasyMock.expect(salesOrderServiceClient.getSalesOrderReport((SalesOrderReport)EasyMock.anyObject())).andReturn(new SalesOrderReportResponseType());
        EasyMock.expect(transactionDao.updateLastTransactionNumber((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.replay(requestBuilder);
        EasyMock.replay(clientFactory);
        org.easymock.EasyMock.replay(salesOrderDao);
        org.easymock.EasyMock.replay(salesOrderServiceClient);
        EasyMock.replay(transactionDao);
        assertEquals(1, helper.processGPOSOrderReport(transactionInfo));
        assertEquals("1001", transactionInfo.getDocumentIds().get(0));
        assertEquals(1, transactionInfo.getFileCount());
        EasyMock.verify(requestBuilder);
        EasyMock.verify(clientFactory);
        org.easymock.EasyMock.verify(salesOrderDao);
        org.easymock.EasyMock.verify(salesOrderServiceClient);
        EasyMock.verify(transactionDao);
    }

    public void testProcessGPOSOrder_withException_return0() throws Exception {
        Date aDate = new Date();
        List<GPOSOrderInfo> orders = new ArrayList<GPOSOrderInfo>();
        orders.add(getGPOSOrder("1001", "1", "1234", "567"));
        TransactionInfo transactionInfo = getTransactionInfo(aDate, "ABC");
        transactionInfo.setDataSourceType("ABC");
        org.easymock.EasyMock.expect(salesOrderDao.getGPOSWinfieldOrders(aDate, "ABC", "ABC")).andReturn(orders);
        EasyMock.expect(requestBuilder.buildGPOSRequest((List<GPOSOrderInfo>)EasyMock.anyObject(), (TransactionInfo)EasyMock.anyObject())).andReturn(getSalesOrderReport());
        EasyMock.expect(clientFactory.getSalesOrderClient()).andReturn(salesOrderServiceClient);
        org.easymock.EasyMock.expect(salesOrderServiceClient.getSalesOrderReport((SalesOrderReport)EasyMock.anyObject())).andThrow(new SalesOrderFault("Error Occurred", new ExceptionType()));
        EasyMock.replay(requestBuilder);
        EasyMock.replay(clientFactory);
        org.easymock.EasyMock.replay(salesOrderDao);
        org.easymock.EasyMock.replay(salesOrderServiceClient);
        try {
            helper.processGPOSOrderReport(transactionInfo);
            fail("Exception should have occurred");
        } catch (SalesOrderException e) {
            assertEquals("Error Occurred", e.getMessage());
        }
        EasyMock.verify(requestBuilder);
        EasyMock.verify(clientFactory);
        org.easymock.EasyMock.verify(salesOrderDao);
        org.easymock.EasyMock.verify(salesOrderServiceClient);
    }

    private GPOSOrderInfo getGPOSOrder(String crmOrderNumber, String lineItemNumber, String acctId, String growerAcctId) {
        GPOSOrderInfo pposOrderInfo = new GPOSOrderInfo();
        pposOrderInfo.setOrderNumber(crmOrderNumber);
        pposOrderInfo.setCrmOrderNumber(crmOrderNumber);
            LineItemInfo lineItem = new LineItemInfo();
            lineItem.setItemNumber(lineItemNumber);
            pposOrderInfo.setTempLineItem(lineItem);
        PartnerInfo dealerinfo = new PartnerInfo();
        dealerinfo.setAcctId(acctId);
        pposOrderInfo.setDealerInfo(dealerinfo);
        PartnerInfo growerInfo = new PartnerInfo();
        growerInfo.setAcctId(growerAcctId);
        pposOrderInfo.setGrowerInfo(growerInfo);
        return pposOrderInfo;
    }

    private TransactionInfo getTransactionInfo(Date lastTransactionDate, String groupCode) {
        TransactionInfo tranInfo = new TransactionInfo();
        tranInfo.setLastTransactionDate(lastTransactionDate);
        tranInfo.setGroupCode(groupCode);
        tranInfo.setMaxFileSize(500);
        return tranInfo;
    }

    private SalesOrderReport getSalesOrderReport() {
        SalesOrderReport salesOrderReport = new SalesOrderReport();
        HeaderType headerType = new HeaderType();
        ThisDocumentIdentifierType thisDocumentIdentifierType = new ThisDocumentIdentifierType();
        thisDocumentIdentifierType.setDocumentIdentifier("1001");
        headerType.setThisDocumentIdentifier(thisDocumentIdentifierType);
        salesOrderReport.setHeader(headerType);
        return salesOrderReport;
    }

}


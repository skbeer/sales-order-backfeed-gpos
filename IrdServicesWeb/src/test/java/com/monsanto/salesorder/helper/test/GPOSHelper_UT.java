package com.monsanto.salesorder.helper.test;

import com.monsanto.irdsoapservices.salesorder.client.ClientFactory;
import com.monsanto.irdsoapservices.salesorder.dao.SalesOrderDao;
import com.monsanto.irdsoapservices.salesorder.dao.TransactionDao;
import com.monsanto.irdsoapservices.salesorder.domain.LineItemInfo;
import com.monsanto.irdsoapservices.salesorder.domain.GPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.exception.SalesOrderException;
import com.monsanto.irdsoapservices.salesorder.helper.GPOSHelper;
import com.monsanto.irdsoapservices.salesorder.helper.GPOSRequestBuilder;
import com.monsanto.irdsoapservices.salesorder.schema.*;
import junit.framework.TestCase;
import org.easymock.classextension.EasyMock;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 10, 2010
 * Time: 12:10:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class GPOSHelper_UT extends TestCase {
    GPOSHelper pposHelper = new GPOSHelper();
    List<GPOSOrderInfo> pposOrderList = new ArrayList<GPOSOrderInfo>();
    SalesOrderDao salesOrderDao;
    ClientFactory clientFactory;
    GPOSRequestBuilder pposRequestBuilder;
    SalesOrderService salesOrderServiceClient;
    TransactionDao transactionDao;

    @Override
    protected void setUp() throws Exception {
        clientFactory = EasyMock.createMock(ClientFactory.class);
        pposRequestBuilder = EasyMock.createMock(GPOSRequestBuilder.class);
        salesOrderDao = org.easymock.EasyMock.createMock(SalesOrderDao.class);
        pposHelper.setSalesOrderDao(salesOrderDao);
        pposHelper.setClientFactory(clientFactory);
        pposHelper.setGposRequestBuilder(pposRequestBuilder);
        salesOrderServiceClient = org.easymock.EasyMock.createMock(SalesOrderService.class);
        transactionDao = EasyMock.createMock(TransactionDao.class);
        pposHelper.setTransactionDao(transactionDao);
    }

    public void testNormalizeOrders() throws Exception {
        pposOrderList.add(getGPOSOrder("1001", "1"));
        pposOrderList.add(getGPOSOrder("1001", "2"));
        pposOrderList.add(getGPOSOrder("1002", "1"));
        pposOrderList.add(getGPOSOrder("1003", "1"));
        pposOrderList.add(getGPOSOrder("1003", "2"));
        pposOrderList.add(getGPOSOrder("1003", "3"));
        List<GPOSOrderInfo> normalizedOrders = pposHelper.normalizeOrderLineItems(pposOrderList);
        assertEquals(3, normalizedOrders.size());
        assertEquals(2, normalizedOrders.get(0).getLineItems().size());
        assertEquals(1, normalizedOrders.get(1).getLineItems().size());
        assertEquals(3, normalizedOrders.get(2).getLineItems().size());
    }

    public void testNormalizeOrders_scenario2() throws Exception {
        pposOrderList.add(getGPOSOrder("1001", "1"));
        pposOrderList.add(getGPOSOrder("1002", "1"));
        pposOrderList.add(getGPOSOrder("1002", "2"));
        pposOrderList.add(getGPOSOrder("1002", "3"));
        pposOrderList.add(getGPOSOrder("1002", "4"));
        pposOrderList.add(getGPOSOrder("1003", "3"));
        List<GPOSOrderInfo> normalizedOrders = pposHelper.normalizeOrderLineItems(pposOrderList);
        assertEquals(3, normalizedOrders.size());
        assertEquals(1, normalizedOrders.get(0).getLineItems().size());
        assertEquals(4, normalizedOrders.get(1).getLineItems().size());
        assertEquals(1, normalizedOrders.get(2).getLineItems().size());
    }

    public void testNormalizeOrders_scenario3() throws Exception {
        pposOrderList.add(getGPOSOrder("1001", "1"));
        pposOrderList.add(getGPOSOrder("1001", "2"));
        pposOrderList.add(getGPOSOrder("1002", "1"));
        pposOrderList.add(getGPOSOrder("1003", "1"));
        pposOrderList.add(getGPOSOrder("1004", "2"));
        pposOrderList.add(getGPOSOrder("1005", "1"));
        pposOrderList.add(getGPOSOrder("1005", "2"));
        pposOrderList.add(getGPOSOrder("1006", "2"));
        pposOrderList.add(getGPOSOrder("1007", "2"));
        pposOrderList.add(getGPOSOrder("1008", "2"));
        List<GPOSOrderInfo> normalizedOrders = pposHelper.normalizeOrderLineItems(pposOrderList);
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
        pposOrderList.add(getGPOSOrder("1001", "1"));
        List<GPOSOrderInfo> normalizedOrders = pposHelper.normalizeOrderLineItems(pposOrderList);
        assertEquals(1, normalizedOrders.size());
        assertEquals(1, normalizedOrders.get(0).getLineItems().size());
    }

    public void testProcessGPOSOrder_noException_returnOrdersSent() throws Exception {
        Date aDate = new Date();
        List<GPOSOrderInfo> orders = new ArrayList<GPOSOrderInfo>();
        orders.add(getGPOSOrder("1001", "1"));
        TransactionInfo transactionInfo = getTransactionInfo(aDate, "ABC");
        org.easymock.EasyMock.expect(salesOrderDao.getGPOSOrders(aDate, "ABC")).andReturn(orders);
        EasyMock.expect(pposRequestBuilder.buildGPOSRequest((List<GPOSOrderInfo>)EasyMock.anyObject(), (TransactionInfo)EasyMock.anyObject())).andReturn(getSalesOrderReport());
        EasyMock.expect(clientFactory.getSalesOrderClient()).andReturn(salesOrderServiceClient);
        org.easymock.EasyMock.expect(salesOrderServiceClient.getSalesOrderReport((SalesOrderReport)EasyMock.anyObject())).andReturn(new SalesOrderReportResponseType());
        EasyMock.expect(transactionDao.updateLastTransactionNumber((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.replay(pposRequestBuilder);
        EasyMock.replay(clientFactory);
        org.easymock.EasyMock.replay(salesOrderDao);
        org.easymock.EasyMock.replay(salesOrderServiceClient);
        EasyMock.replay(transactionDao);
        assertEquals(1, pposHelper.processGPOSOrderReport(transactionInfo));
        EasyMock.verify(pposRequestBuilder);
        EasyMock.verify(clientFactory);
        org.easymock.EasyMock.verify(salesOrderDao);
        org.easymock.EasyMock.verify(salesOrderServiceClient);
        EasyMock.verify(transactionDao);
    }

    public void testProcessGPOSOrder_withException_return0() throws Exception {
        Date aDate = new Date();
        List<GPOSOrderInfo> orders = new ArrayList<GPOSOrderInfo>();
        orders.add(getGPOSOrder("1001", "1"));
        TransactionInfo transactionInfo = getTransactionInfo(aDate, "ABC");
        org.easymock.EasyMock.expect(salesOrderDao.getGPOSOrders(aDate, "ABC")).andReturn(orders);
        EasyMock.expect(pposRequestBuilder.buildGPOSRequest((List<GPOSOrderInfo>)EasyMock.anyObject(), (TransactionInfo)EasyMock.anyObject())).andReturn(getSalesOrderReport());
        EasyMock.expect(clientFactory.getSalesOrderClient()).andReturn(salesOrderServiceClient);
        org.easymock.EasyMock.expect(salesOrderServiceClient.getSalesOrderReport((SalesOrderReport)EasyMock.anyObject())).andThrow(new SalesOrderFault("Error Occurred", new ExceptionType()));
        EasyMock.replay(pposRequestBuilder);
        EasyMock.replay(clientFactory);
        org.easymock.EasyMock.replay(salesOrderDao);
        org.easymock.EasyMock.replay(salesOrderServiceClient);
        try {
            pposHelper.processGPOSOrderReport(transactionInfo);
            fail("Exception should have occurred");
        } catch (SalesOrderException e) {
            assertEquals("Error Occurred", e.getMessage());
        }
        EasyMock.verify(pposRequestBuilder);
        EasyMock.verify(clientFactory);
        org.easymock.EasyMock.verify(salesOrderDao);
        org.easymock.EasyMock.verify(salesOrderServiceClient);
    }

    private GPOSOrderInfo getGPOSOrder(String crmOrderNumber, String lineItemNumber) {
        GPOSOrderInfo pposOrderInfo = new GPOSOrderInfo();
        pposOrderInfo.setCrmOrderNumber(crmOrderNumber);
            LineItemInfo lineItem = new LineItemInfo();
            lineItem.setItemNumber(lineItemNumber);
            pposOrderInfo.setTempLineItem(lineItem);
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
package com.monsanto.salesorder.helper.test;

import com.monsanto.irdsoapservices.salesorder.client.ClientFactory;
import com.monsanto.irdsoapservices.salesorder.dao.SalesOrderDao;
import com.monsanto.irdsoapservices.salesorder.domain.LineItemInfo;
import com.monsanto.irdsoapservices.salesorder.domain.PPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.exception.SalesOrderException;
import com.monsanto.irdsoapservices.salesorder.helper.PPOSHelper;
import com.monsanto.irdsoapservices.salesorder.helper.PPOSRequestBuilder;
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
public class PPOSHelper_UT extends TestCase {
    PPOSHelper pposHelper = new PPOSHelper();
    List<PPOSOrderInfo> pposOrderList = new ArrayList<PPOSOrderInfo>();
    SalesOrderDao salesOrderDao;
    ClientFactory clientFactory;
    PPOSRequestBuilder pposRequestBuilder;
    SalesOrderService salesOrderServiceClient;

    @Override
    protected void setUp() throws Exception {
        clientFactory = EasyMock.createMock(ClientFactory.class);
        pposRequestBuilder = EasyMock.createMock(PPOSRequestBuilder.class);
        salesOrderDao = org.easymock.EasyMock.createMock(SalesOrderDao.class);
        pposHelper.setSalesOrderDao(salesOrderDao);
        pposHelper.setClientFactory(clientFactory);
        pposHelper.setPposRequestBuilder(pposRequestBuilder);
        salesOrderServiceClient = org.easymock.EasyMock.createMock(SalesOrderService.class);
    }



    public void testNormalizeOrders() throws Exception {
        pposOrderList.add(getPPOSOrder("1001", "1"));
        pposOrderList.add(getPPOSOrder("1001", "2"));
        pposOrderList.add(getPPOSOrder("1002", "1"));
        pposOrderList.add(getPPOSOrder("1003", "1"));
        pposOrderList.add(getPPOSOrder("1003", "2"));
        pposOrderList.add(getPPOSOrder("1003", "3"));
        List<PPOSOrderInfo> normalizedOrders = pposHelper.normalizeOrderLineItems(pposOrderList);
        assertEquals(3, normalizedOrders.size());
        assertEquals(2, normalizedOrders.get(0).getLineItems().size());
        assertEquals(1, normalizedOrders.get(1).getLineItems().size());
        assertEquals(3, normalizedOrders.get(2).getLineItems().size());
    }

    public void testNormalizeOrders_scenario2() throws Exception {
        pposOrderList.add(getPPOSOrder("1001", "1"));
        pposOrderList.add(getPPOSOrder("1002", "1"));
        pposOrderList.add(getPPOSOrder("1002", "2"));
        pposOrderList.add(getPPOSOrder("1002", "3"));
        pposOrderList.add(getPPOSOrder("1002", "4"));
        pposOrderList.add(getPPOSOrder("1003", "3"));
        List<PPOSOrderInfo> normalizedOrders = pposHelper.normalizeOrderLineItems(pposOrderList);
        assertEquals(3, normalizedOrders.size());
        assertEquals(1, normalizedOrders.get(0).getLineItems().size());
        assertEquals(4, normalizedOrders.get(1).getLineItems().size());
        assertEquals(1, normalizedOrders.get(2).getLineItems().size());
    }

    public void testNormalizeOrders_scenario3() throws Exception {
        pposOrderList.add(getPPOSOrder("1001", "1"));
        pposOrderList.add(getPPOSOrder("1001", "2"));
        pposOrderList.add(getPPOSOrder("1002", "1"));
        pposOrderList.add(getPPOSOrder("1003", "1"));
        pposOrderList.add(getPPOSOrder("1004", "2"));
        pposOrderList.add(getPPOSOrder("1005", "1"));
        pposOrderList.add(getPPOSOrder("1005", "2"));
        pposOrderList.add(getPPOSOrder("1006", "2"));
        pposOrderList.add(getPPOSOrder("1007", "2"));
        pposOrderList.add(getPPOSOrder("1008", "2"));
        List<PPOSOrderInfo> normalizedOrders = pposHelper.normalizeOrderLineItems(pposOrderList);
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
        pposOrderList.add(getPPOSOrder("1001", "1"));
        List<PPOSOrderInfo> normalizedOrders = pposHelper.normalizeOrderLineItems(pposOrderList);
        assertEquals(1, normalizedOrders.size());
        assertEquals(1, normalizedOrders.get(0).getLineItems().size());
    }

    public void testProcessPPOSOrder_noException_returnOrdersSent() throws Exception {
        Date aDate = new Date();
        List<PPOSOrderInfo> orders = new ArrayList<PPOSOrderInfo>();
        orders.add(getPPOSOrder("1001", "1"));
        TransactionInfo transactionInfo = getTransactionInfo(aDate, "ABC");
        org.easymock.EasyMock.expect(salesOrderDao.getPPOSOrders(aDate, "ABC")).andReturn(orders);
        EasyMock.expect(pposRequestBuilder.buildPPOSRequest((List<PPOSOrderInfo>)EasyMock.anyObject(), (TransactionInfo)EasyMock.anyObject())).andReturn(new SalesOrderReport());
        EasyMock.expect(clientFactory.getSalesOrderClient()).andReturn(salesOrderServiceClient);
        org.easymock.EasyMock.expect(salesOrderServiceClient.getSalesOrderReport((SalesOrderReport)EasyMock.anyObject())).andReturn(new SalesOrderReportResponseType());
        EasyMock.replay(pposRequestBuilder);
        EasyMock.replay(clientFactory);
        org.easymock.EasyMock.replay(salesOrderDao);
        org.easymock.EasyMock.replay(salesOrderServiceClient);
        assertEquals(1, pposHelper.processPPOSOrderReport(transactionInfo));
        EasyMock.verify(pposRequestBuilder);
        EasyMock.verify(clientFactory);
        org.easymock.EasyMock.verify(salesOrderDao);
        org.easymock.EasyMock.verify(salesOrderServiceClient);
    }

    public void testProcessPPOSOrder_withException_return0() throws Exception {
        Date aDate = new Date();
        List<PPOSOrderInfo> orders = new ArrayList<PPOSOrderInfo>();
        orders.add(getPPOSOrder("1001", "1"));
        TransactionInfo transactionInfo = getTransactionInfo(aDate, "ABC");
        org.easymock.EasyMock.expect(salesOrderDao.getPPOSOrders(aDate, "ABC")).andReturn(orders);
        EasyMock.expect(pposRequestBuilder.buildPPOSRequest((List<PPOSOrderInfo>)EasyMock.anyObject(), (TransactionInfo)EasyMock.anyObject())).andReturn(new SalesOrderReport());
        EasyMock.expect(clientFactory.getSalesOrderClient()).andReturn(salesOrderServiceClient);
        org.easymock.EasyMock.expect(salesOrderServiceClient.getSalesOrderReport((SalesOrderReport)EasyMock.anyObject())).andThrow(new SalesOrderFault("Error Occurred", new ExceptionType()));
        EasyMock.replay(pposRequestBuilder);
        EasyMock.replay(clientFactory);
        org.easymock.EasyMock.replay(salesOrderDao);
        org.easymock.EasyMock.replay(salesOrderServiceClient);
        try {
            pposHelper.processPPOSOrderReport(transactionInfo);
            fail("Exception should have occurred");
        } catch (SalesOrderException e) {
            assertEquals("Error Occurred", e.getMessage());
        }
        EasyMock.verify(pposRequestBuilder);
        EasyMock.verify(clientFactory);
        org.easymock.EasyMock.verify(salesOrderDao);
        org.easymock.EasyMock.verify(salesOrderServiceClient);
    }

    private PPOSOrderInfo getPPOSOrder(String crmOrderNumber, String lineItemNumber) {
        PPOSOrderInfo pposOrderInfo = new PPOSOrderInfo();
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
        return tranInfo;
    }

}

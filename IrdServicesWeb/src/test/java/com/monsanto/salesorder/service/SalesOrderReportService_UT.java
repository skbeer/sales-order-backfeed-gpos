package com.monsanto.salesorder.service;

import junit.framework.TestCase;
import com.monsanto.irdsoapservices.salesorder.service.SalesOrderReportService;
import com.monsanto.irdsoapservices.salesorder.helper.PPOSHelper;
import com.monsanto.irdsoapservices.salesorder.dao.TransactionDao;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.exception.SalesOrderException;
import org.easymock.EasyMock;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 14, 2010
 * Time: 4:12:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class SalesOrderReportService_UT extends TestCase {
    SalesOrderReportService salesOrderReportService;
    PPOSHelper pposHelper;
    TransactionDao transactionDao;

    @Override
    protected void setUp() throws Exception {
        transactionDao = EasyMock.createMock(TransactionDao.class);
        pposHelper = org.easymock.classextension.EasyMock.createMock(PPOSHelper.class);
        salesOrderReportService = new SalesOrderReportService();
        salesOrderReportService.setTransactionDao(transactionDao);
        salesOrderReportService.setPposHelper(pposHelper);
    }

    public void testStartProcessing_noTransactions_doNothing() throws Exception {
        EasyMock.expect(transactionDao.getTransactionsToBeProcessed()).andReturn(getTranList(0));
        EasyMock.replay(transactionDao);
        salesOrderReportService.startProcessing();
        EasyMock.verify(transactionDao);
    }

    public void testStartProcessing_oneTransaction_existingOrders_processOrders() throws Exception {
        EasyMock.expect(transactionDao.getTransactionsToBeProcessed()).andReturn(getTranList(1));
        org.easymock.classextension.EasyMock.expect(pposHelper.processPPOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.replay(transactionDao);
        org.easymock.classextension.EasyMock.replay(pposHelper);
        salesOrderReportService.startProcessing();
        EasyMock.verify(transactionDao);
        org.easymock.classextension.EasyMock.verify(pposHelper);
    }

    public void testStartProcessing_multipleTransactions_existingOrders_processOrders() throws Exception {
        EasyMock.expect(transactionDao.getTransactionsToBeProcessed()).andReturn(getTranList(2));
        org.easymock.classextension.EasyMock.expect(pposHelper.processPPOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        org.easymock.classextension.EasyMock.expect(pposHelper.processPPOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(0);
        EasyMock.replay(transactionDao);
        org.easymock.classextension.EasyMock.replay(pposHelper);
        salesOrderReportService.startProcessing();
        EasyMock.verify(transactionDao);
        org.easymock.classextension.EasyMock.verify(pposHelper);
    }

    public void testStartProcessing_multipleTransactions_withError_processTransactionsWithoutError() throws Exception {
        EasyMock.expect(transactionDao.getTransactionsToBeProcessed()).andReturn(getTranList(2));
        org.easymock.classextension.EasyMock.expect(pposHelper.processPPOSOrderReport((TransactionInfo)EasyMock.anyObject())).andThrow(new SalesOrderException("Test Exception"));
        org.easymock.classextension.EasyMock.expect(pposHelper.processPPOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.replay(transactionDao);
        org.easymock.classextension.EasyMock.replay(pposHelper);
        salesOrderReportService.startProcessing();
        EasyMock.verify(transactionDao);
        org.easymock.classextension.EasyMock.verify(pposHelper);
    }



    private List<TransactionInfo> getTranList(int count) {
        List<TransactionInfo> list = new ArrayList<TransactionInfo>();
        for (int index = 0; index < count; index++) {
            TransactionInfo transactionInfo =  new TransactionInfo();
            transactionInfo.setName("Name "+index);
            transactionInfo.setTransactionType("PPOS");
            list.add(transactionInfo);
        }
        return list;
    }


}

package com.monsanto.salesorder.service;

import com.monsanto.irdsoapservices.salesorder.dao.TransactionDao;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.exception.SalesOrderException;
import com.monsanto.irdsoapservices.salesorder.helper.*;
import com.monsanto.irdsoapservices.salesorder.service.SalesOrderReportService;
import junit.framework.TestCase;
import org.easymock.EasyMock;

import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

import static org.easymock.EasyMock.expectLastCall;

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
    COSHelper cosHelper;
    GPOSHelper gposHelper;
    GPOSWinfieldHelper gposWinfieldHelper;
    DataSummaryHelper dataSummaryHelper;

    @Override
    protected void setUp() throws Exception {
        transactionDao = EasyMock.createMock(TransactionDao.class);
        pposHelper = org.easymock.classextension.EasyMock.createMock(PPOSHelper.class);
        cosHelper = org.easymock.classextension.EasyMock.createMock(COSHelper.class);
        gposHelper = org.easymock.classextension.EasyMock.createMock(GPOSHelper.class);
        gposWinfieldHelper = org.easymock.classextension.EasyMock.createMock(GPOSWinfieldHelper.class);
        dataSummaryHelper =  org.easymock.classextension.EasyMock.createMock(DataSummaryHelper.class);
        salesOrderReportService = new SalesOrderReportService();
        salesOrderReportService.setTransactionDao(transactionDao);
        salesOrderReportService.setPposHelper(pposHelper);
        salesOrderReportService.setCosHelper(cosHelper);
        salesOrderReportService.setGposHelper(gposHelper);
        salesOrderReportService.setGposWinfieldHelper(gposWinfieldHelper);
        salesOrderReportService.setDataSummaryHelper(dataSummaryHelper);
    }

    public void testStartProcessing_noTransactions_doNothing() throws Exception {
        EasyMock.expect(transactionDao.getTransactionsToBeProcessed()).andReturn(getTranList(0));
        EasyMock.replay(transactionDao);
        salesOrderReportService.startProcessing();
        EasyMock.verify(transactionDao);
    }

    public void testStartProcessing_oneTransaction_foundOrders_processOrders() throws Exception {
        EasyMock.expect(transactionDao.getTransactionsToBeProcessed()).andReturn(getTranList(1));
        org.easymock.classextension.EasyMock.expect(pposHelper.processPPOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.replay(transactionDao);
        org.easymock.classextension.EasyMock.replay(pposHelper);
        salesOrderReportService.startProcessing();
        EasyMock.verify(transactionDao);
        org.easymock.classextension.EasyMock.verify(pposHelper);
    }

    public void testStartProcessing_oneTransaction_ordersNotFound_doNotUpdateTransactionStats() throws Exception {
        EasyMock.expect(transactionDao.getTransactionsToBeProcessed()).andReturn(getTranList(1));
        org.easymock.classextension.EasyMock.expect(pposHelper.processPPOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(0);
        EasyMock.replay(transactionDao);
        org.easymock.classextension.EasyMock.replay(pposHelper);
        salesOrderReportService.startProcessing();
        EasyMock.verify(transactionDao);
        org.easymock.classextension.EasyMock.verify(pposHelper);
    }

    public void testStartProcessing_multipleTransactions_foundOrders_processOrders() throws Exception {
        EasyMock.expect(transactionDao.getTransactionsToBeProcessed()).andReturn(getTranList(2));
        org.easymock.classextension.EasyMock.expect(pposHelper.processPPOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        org.easymock.classextension.EasyMock.expect(cosHelper.processCOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.replay(transactionDao);
        org.easymock.classextension.EasyMock.replay(pposHelper);
        org.easymock.classextension.EasyMock.replay(cosHelper);
        salesOrderReportService.startProcessing();
        EasyMock.verify(transactionDao);
        org.easymock.classextension.EasyMock.verify(pposHelper);
        org.easymock.classextension.EasyMock.verify(cosHelper);
    }

    public void testStartProcessing_AllTypesTransactions_foundOrders_processOrders() throws Exception {
        EasyMock.expect(transactionDao.getTransactionsToBeProcessed()).andReturn(getTranList(6));
        org.easymock.classextension.EasyMock.expect(pposHelper.processPPOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        org.easymock.classextension.EasyMock.expect(cosHelper.processCOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        org.easymock.classextension.EasyMock.expect(gposHelper.processGPOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        org.easymock.classextension.EasyMock.expect(gposWinfieldHelper.processGPOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        dataSummaryHelper.processDataSummaryReport((TransactionInfo)EasyMock.anyObject());
        org.easymock.classextension.EasyMock.expect(gposWinfieldHelper.processGPOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        dataSummaryHelper.processDataSummaryReport((TransactionInfo)EasyMock.anyObject());
        org.easymock.classextension.EasyMock.expect(gposWinfieldHelper.processGPOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        dataSummaryHelper.processDataSummaryReport((TransactionInfo)EasyMock.anyObject());
        EasyMock.replay(transactionDao);
        org.easymock.classextension.EasyMock.replay(pposHelper);
        org.easymock.classextension.EasyMock.replay(cosHelper);
        org.easymock.classextension.EasyMock.replay(gposHelper);
        org.easymock.classextension.EasyMock.replay(gposWinfieldHelper);
        org.easymock.classextension.EasyMock.replay(dataSummaryHelper);
        salesOrderReportService.startProcessing();
        EasyMock.verify(transactionDao);
        org.easymock.classextension.EasyMock.verify(pposHelper);
        org.easymock.classextension.EasyMock.verify(cosHelper);
        org.easymock.classextension.EasyMock.verify(gposHelper);
        org.easymock.classextension.EasyMock.verify(gposWinfieldHelper);
        org.easymock.classextension.EasyMock.verify(dataSummaryHelper);
    }

    public void testStartProcessing_AllTypesTransactions_foundOrders_processOrdersNoDataSummary() throws Exception {
        List<TransactionInfo> list =getTranList(6);
        for (TransactionInfo t : list){
            t.setCompanyCode(null);
        }
        EasyMock.expect(transactionDao.getTransactionsToBeProcessed()).andReturn(list);
        org.easymock.classextension.EasyMock.expect(pposHelper.processPPOSOrderReport((TransactionInfo) EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo) EasyMock.anyObject())).andReturn(1);
        org.easymock.classextension.EasyMock.expect(cosHelper.processCOSOrderReport((TransactionInfo) EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo) EasyMock.anyObject())).andReturn(1);
        org.easymock.classextension.EasyMock.expect(gposHelper.processGPOSOrderReport((TransactionInfo) EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo) EasyMock.anyObject())).andReturn(1);
        org.easymock.classextension.EasyMock.expect(gposWinfieldHelper.processGPOSOrderReport((TransactionInfo) EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        dataSummaryHelper.processDataSummaryReport((TransactionInfo) EasyMock.anyObject());
        org.easymock.classextension.EasyMock.expect(gposWinfieldHelper.processGPOSOrderReport((TransactionInfo) EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);

        org.easymock.classextension.EasyMock.expect(gposWinfieldHelper.processGPOSOrderReport((TransactionInfo) EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);

        EasyMock.replay(transactionDao);
        org.easymock.classextension.EasyMock.replay(pposHelper);
        org.easymock.classextension.EasyMock.replay(cosHelper);
        org.easymock.classextension.EasyMock.replay(gposHelper);
        org.easymock.classextension.EasyMock.replay(gposWinfieldHelper);
        org.easymock.classextension.EasyMock.replay(dataSummaryHelper);
        salesOrderReportService.startProcessing();
        EasyMock.verify(transactionDao);
        org.easymock.classextension.EasyMock.verify(pposHelper);
        org.easymock.classextension.EasyMock.verify(cosHelper);
        org.easymock.classextension.EasyMock.verify(gposHelper);
        org.easymock.classextension.EasyMock.verify(gposWinfieldHelper);
        org.easymock.classextension.EasyMock.verify(dataSummaryHelper);


    }

public void testStartProcessing_AllTypesTransactions_NoOrders_processOrders() throws Exception {
        EasyMock.expect(transactionDao.getTransactionsToBeProcessed()).andReturn(getTranList(6));
        org.easymock.classextension.EasyMock.expect(pposHelper.processPPOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        org.easymock.classextension.EasyMock.expect(cosHelper.processCOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        org.easymock.classextension.EasyMock.expect(gposHelper.processGPOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        org.easymock.classextension.EasyMock.expect(gposWinfieldHelper.processGPOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(0);
        org.easymock.classextension.EasyMock.expect(gposWinfieldHelper.processGPOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(0);
        org.easymock.classextension.EasyMock.expect(gposWinfieldHelper.processGPOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);

        EasyMock.replay(transactionDao);
        org.easymock.classextension.EasyMock.replay(pposHelper);
        org.easymock.classextension.EasyMock.replay(cosHelper);
        org.easymock.classextension.EasyMock.replay(gposHelper);
        org.easymock.classextension.EasyMock.replay(gposWinfieldHelper);

        salesOrderReportService.startProcessing();
        EasyMock.verify(transactionDao);
        org.easymock.classextension.EasyMock.verify(pposHelper);
        org.easymock.classextension.EasyMock.verify(cosHelper);
        org.easymock.classextension.EasyMock.verify(gposHelper);
        org.easymock.classextension.EasyMock.verify(gposWinfieldHelper);

    }


    public void testStartProcessing_multipleTransactions_withError_processRemainingTransactions() throws Exception {
        EasyMock.expect(transactionDao.getTransactionsToBeProcessed()).andReturn(getTranList(2));
        org.easymock.classextension.EasyMock.expect(pposHelper.processPPOSOrderReport((TransactionInfo)EasyMock.anyObject())).andThrow(new SalesOrderException("Test Exception"));
        org.easymock.classextension.EasyMock.expect(cosHelper.processCOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.replay(transactionDao);
        org.easymock.classextension.EasyMock.replay(pposHelper);
        org.easymock.classextension.EasyMock.replay(cosHelper);
        salesOrderReportService.startProcessing();
        EasyMock.verify(transactionDao);
        org.easymock.classextension.EasyMock.verify(pposHelper);
        org.easymock.classextension.EasyMock.verify(cosHelper);
    }

    public void testStartProcessing_multipleTransactions_withDBUpdateError_processRemainingTransactions() throws Exception {
        EasyMock.expect(transactionDao.getTransactionsToBeProcessed()).andReturn(getTranList(2));
        org.easymock.classextension.EasyMock.expect(pposHelper.processPPOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andThrow(new SQLException("SQL Error Occurred"));
        org.easymock.classextension.EasyMock.expect(cosHelper.processCOSOrderReport((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(transactionDao.updateLastTransactionStats((TransactionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.replay(transactionDao);
        org.easymock.classextension.EasyMock.replay(pposHelper);
        org.easymock.classextension.EasyMock.replay(cosHelper);
        salesOrderReportService.startProcessing();
        EasyMock.verify(transactionDao);
        org.easymock.classextension.EasyMock.verify(pposHelper);
        org.easymock.classextension.EasyMock.verify(cosHelper);
    }

    public void testStartProcessing_multipleTransactions_withDBSelectError_throwSalesOrderException() throws Exception {
        EasyMock.expect(transactionDao.getTransactionsToBeProcessed()).andThrow(new Exception("Error Occurred"));
        EasyMock.replay(transactionDao);
        try {
            salesOrderReportService.startProcessing();
            fail("Exception should occur");
        } catch (SalesOrderException e) {
            assertEquals("Error Occurred", e.getMessage());
        }
        EasyMock.verify(transactionDao);
    }



    private List<TransactionInfo> getTranList(int count) {
        List<TransactionInfo> list = new ArrayList<TransactionInfo>();
        for (int index = 0; index < count; index++) {
            TransactionInfo transactionInfo =  new TransactionInfo();
            transactionInfo.setName("Name "+index);
            if(index == 0)
            transactionInfo.setTransactionType("PPOS");
            else if(index == 1)
                    transactionInfo.setTransactionType("DOS");
            else if(index == 2)
                    transactionInfo.setTransactionType("GPOS");
            else if(index == 3) {
                transactionInfo.setTransactionType("GPOS;DIRECT");
                transactionInfo.setCompanyCode("0527346750000");
            }
            else if(index == 4) {
                    transactionInfo.setTransactionType("GPOS;CLASSIC");
                    transactionInfo.setCompanyCode("0527346750000");
            }
            else if(index == 5)
                    transactionInfo.setTransactionType("GPOS;AGRIMINE");
            list.add(transactionInfo);
        }
        return list;
    }


}

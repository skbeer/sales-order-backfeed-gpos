package com.monsanto.creditlist;

import junit.framework.TestCase;
import com.monsanto.irdsoapservices.creditlist.CreditListBatchJob;
import com.monsanto.irdsoapservices.creditlist.CreditListHelper;
import com.monsanto.irdsoapservices.salesorder.dao.TransactionDao;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.constants.DBConstants;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Aug 20, 2012
 * Time: 10:22:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class CreditListBatchJob_UT extends TestCase {
    CreditListBatchJob creditListBatchJob;
    TransactionDao transactionDao;
    CreditListHelper creditListHelper;
    TransactionInfo transactionInfo;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        creditListBatchJob = new CreditListBatchJob();
        transactionDao = mock(TransactionDao.class);
        creditListHelper = mock(CreditListHelper.class);
        creditListBatchJob.setCreditListHelper(creditListHelper);
        creditListBatchJob.setTransactionDao(transactionDao);
        transactionInfo = new TransactionInfo();
        transactionInfo.setGroupCode("V9");
        transactionInfo.setName("SSC Compamy");
        transactionInfo.setCompanyCode("101");
        transactionInfo.setTransactionType(DBConstants.FPOS_CREDITLIST_TYPE);
        transactionInfo.setLastTransactionNumber(1);
    }

    public void testStartProcessing_noJobs() throws Exception {
        when(transactionDao.getTransactionsByType(DBConstants.FPOS_CREDITLIST_TYPE)).thenReturn(new ArrayList<TransactionInfo>());
        creditListBatchJob.startProcessing();
        verifyNoMoreInteractions(creditListHelper);
    }

    public void testStartProcessing_withJobs_ordersSent() throws Exception {
        when(transactionDao.getTransactionsByType(DBConstants.FPOS_CREDITLIST_TYPE)).thenReturn(Arrays.asList(new TransactionInfo[]{transactionInfo}));
        when(creditListHelper.processCreditListTransaction(transactionInfo)).thenReturn(5);
        when(transactionDao.updateLastTransactionStats((TransactionInfo) anyObject())).thenReturn(1);
        creditListBatchJob.startProcessing();
        verify(transactionDao).getTransactionsByType(DBConstants.FPOS_CREDITLIST_TYPE);
        verify(transactionDao).updateLastTransactionStats((TransactionInfo) anyObject());
    }

    public void testStartProcessing_withJobs_noOrdersSent() throws Exception {
        when(transactionDao.getTransactionsByType(DBConstants.FPOS_CREDITLIST_TYPE)).thenReturn(Arrays.asList(new TransactionInfo[]{transactionInfo}));
        when(creditListHelper.processCreditListTransaction(transactionInfo)).thenReturn(0);
        creditListBatchJob.startProcessing();
        verify(transactionDao).getTransactionsByType(DBConstants.FPOS_CREDITLIST_TYPE);
        verifyNoMoreInteractions(transactionDao);
    }

}

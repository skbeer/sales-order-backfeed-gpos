package com.monsanto.salesorder.dao.test;

import com.monsanto.irdsoapservices.salesorder.dao.TransactionDao;
import com.monsanto.irdsoapservices.salesorder.dao.TransactionDaoImpl;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.constants.DBConstants;
import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Jun 7, 2010
 * Time: 10:57:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class TransactionDaoImpl_UT extends AbstractTransactionalDataSourceSpringContextTests {
    TransactionDao transactionDao;

    @Override
    protected void onSetUp() throws Exception {
        super.onSetUp();
        transactionDao = (TransactionDaoImpl)getApplicationContext().getBean("transactionDao");
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[] { "test-backfeed-beans.xml" };
    }

    public void testGetPartnersWithTransactions() throws Exception {
        List<TransactionInfo> infoList = transactionDao.getTransactionsToBeProcessed();
        System.out.println("infoList.size() = " + infoList.size());
        for(TransactionInfo tranInfo : infoList) {
            System.out.println(tranInfo);
        }
        assertTrue(infoList.size()>0);
    }

    public void testGetTransactionsByType() throws Exception {
        List<TransactionInfo> infoList = transactionDao.getTransactionsByType(DBConstants.FPOS_CREDITLIST_TYPE);
        System.out.println("infoList.size() = " + infoList.size());
        for(TransactionInfo tranInfo : infoList) {
            System.out.println(tranInfo);
        }
        assertTrue(infoList.size()>0);
    }

    public void testGetTransactionsByType_noData() throws Exception {
        List<TransactionInfo> infoList = transactionDao.getTransactionsByType("some_random");
        System.out.println("infoList.size() = " + infoList.size());
        for(TransactionInfo tranInfo : infoList) {
            System.out.println(tranInfo);
        }
        assertTrue(infoList.size()==0);
    }

    public void testUpdateTransactionStats() throws Exception {
        TransactionInfo transactionInfo = transactionDao.getTransactionsToBeProcessed().get(0);
        assertNotNull(transactionInfo);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Yesterday = "+cal.getTime().toString());
        transactionInfo.setLastTransactionDate(dateFormat.parse(dateFormat.format(cal.getTime())));
        assertEquals(1, transactionDao.updateLastTransactionStats(transactionInfo));
        transactionInfo = transactionDao.getTransactionsToBeProcessed().get(0);
        assertEquals(dateFormat.parse(dateFormat.format(cal.getTime())).getTime(), transactionInfo.getLastTransactionDate().getTime());
        //assertEquals(expectedLastTranNumber, transactionInfo.getLastTransactionNumber());
    }

    public void testUpdateTransactionNumber() throws Exception {
        TransactionInfo transactionInfo = transactionDao.getTransactionsToBeProcessed().get(0);
        assertNotNull(transactionInfo);
        long expectedLastTranNumber = transactionInfo.getLastTransactionNumber()+1;
        transactionInfo.setLastTransactionNumber(expectedLastTranNumber);
        assertEquals(1, transactionDao.updateLastTransactionNumber(transactionInfo));
        transactionInfo = transactionDao.getTransactionsToBeProcessed().get(0);
        assertEquals(expectedLastTranNumber, transactionInfo.getLastTransactionNumber());
    }

}

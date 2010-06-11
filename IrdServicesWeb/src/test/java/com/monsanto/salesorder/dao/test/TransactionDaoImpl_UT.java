package com.monsanto.salesorder.dao.test;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;
import com.monsanto.irdsoapservices.salesorder.dao.TransactionDao;
import com.monsanto.irdsoapservices.salesorder.dao.TransactionDaoImpl;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

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
        assertTrue(transactionDao.getTransactionsToBeProcessed().size()>0);
    }

    public void testUpdateTransactionStats() throws Exception {
        TransactionInfo transactionInfo = transactionDao.getTransactionsToBeProcessed().get(0);
        assertNotNull(transactionInfo);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Yesterday = "+cal.getTime().toString());
        long expectedLastTranNumber = transactionInfo.getLastTransactionNumber()+1;
        transactionInfo.setLastTransactionDate(dateFormat.parse(dateFormat.format(cal.getTime())));
        transactionInfo.setLastTransactionNumber(expectedLastTranNumber);
        assertEquals(1, transactionDao.updateLastTransactionStats(transactionInfo));
        transactionInfo = transactionDao.getTransactionsToBeProcessed().get(0);
        assertEquals(dateFormat.parse(dateFormat.format(cal.getTime())).getTime(), transactionInfo.getLastTransactionDate().getTime());
        assertEquals(expectedLastTranNumber, transactionInfo.getLastTransactionNumber());
    }

}

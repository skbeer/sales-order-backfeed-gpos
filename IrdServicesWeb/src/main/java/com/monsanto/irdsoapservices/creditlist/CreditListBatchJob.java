package com.monsanto.irdsoapservices.creditlist;

import com.monsanto.irdsoapservices.salesorder.dao.TransactionDao;
import com.monsanto.irdsoapservices.salesorder.exception.SalesOrderException;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.constants.DBConstants;
import com.monsanto.irdsoapservices.utils.ErrorEmailer;
import org.apache.log4j.Logger;

import java.util.Date;
import java.util.List;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Aug 17, 2012
 * Time: 10:04:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class CreditListBatchJob {

    private TransactionDao transactionDao;
    private CreditListHelper creditListHelper;
    Logger logger = Logger.getLogger(this.getClass());

    public void startProcessing() throws SalesOrderException {
        TransactionInfo transaction = null;
        try {
            logger.info("Starting Credit List Job v20150617 @ "+new Date());
            List<TransactionInfo> transactionsToBeProcessed = transactionDao.getTransactionsByType(DBConstants.FPOS_CREDITLIST_TYPE);
            logger.info("Found "+transactionsToBeProcessed.size()+" Transactions to be Processed.");
            int ordersSent;
            for(int index=0; index < transactionsToBeProcessed.size(); index++) {
                try {
                    ordersSent = 0;
                    transaction = transactionsToBeProcessed.get(index);
                    logger.info("Processing '"+transaction.getTransactionType()+"' Transaction For Customer:"+transaction.getName());
                    if(transaction.getTransactionType().equalsIgnoreCase(DBConstants.FPOS_CREDITLIST_TYPE)) {
                        ordersSent = creditListHelper.processCreditListTransaction(transaction);
                    }
                    updateTransaction(transaction, ordersSent);
                } catch(Exception e) {
                    logger.error(e,e);
                    new ErrorEmailer().sendErrorEmail(e, "Exception occurred while processing CreditList Transaction. Transaction: "+transaction);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new SalesOrderException(e.getMessage());
        }
    }

    private void updateTransaction(TransactionInfo transaction, int ordersSent) throws Exception {
        if(ordersSent > 0) {
            logger.info("Sent CreditList with "+ordersSent+" Growers. Updating Last Transaction Date for this Partner.");
            updateLastTransactionStats(transaction);
        } else {
            logger.info("No Credit List information found. Last Transaction Stats for this Partner will NOT be updated.");
        }
    }

    private void updateLastTransactionStats(TransactionInfo transactionInfo) throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        transactionInfo.setLastTransactionDate(dateFormat.parse(dateFormat.format(cal.getTime())));
        transactionInfo.setLastTransactionNumber(transactionInfo.getLastTransactionNumber()+1);
        transactionDao.updateLastTransactionStats(transactionInfo);
    }

    public void setTransactionDao(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }

    public void setCreditListHelper(CreditListHelper creditListHelper) {
        this.creditListHelper = creditListHelper;
    }
}

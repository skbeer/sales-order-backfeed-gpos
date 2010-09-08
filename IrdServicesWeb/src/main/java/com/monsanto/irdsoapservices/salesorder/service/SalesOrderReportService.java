package com.monsanto.irdsoapservices.salesorder.service;

import com.monsanto.irdsoapservices.salesorder.dao.TransactionDao;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.exception.SalesOrderException;
import com.monsanto.irdsoapservices.salesorder.helper.COSHelper;
import com.monsanto.irdsoapservices.salesorder.helper.PPOSHelper;
import com.monsanto.irdsoapservices.utils.ErrorEmailer;
import com.monsanto.irdsoapservices.constants.DBConstants;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 8, 2010
 * Time: 9:42:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class SalesOrderReportService {
    private TransactionDao transactionDao;
    private PPOSHelper pposHelper;
    private COSHelper cosHelper;
    Logger logger = Logger.getLogger(this.getClass());

    public void startProcessing() throws SalesOrderException {
        TransactionInfo transaction = null;
        try {
            logger.info("Starting Sales Order Report Job @ "+new Date());
            List<TransactionInfo> transactionsToBeProcessed = transactionDao.getTransactionsToBeProcessed();
            logger.info("Found "+transactionsToBeProcessed.size()+" Transactions to be Processed.");
            int ordersSent;
            for(int index=0; index < transactionsToBeProcessed.size(); index++) {
                try {
                    ordersSent = 0;
                    transaction = transactionsToBeProcessed.get(index);
                    logger.info("Processing '"+transaction.getTransactionType()+"' Transaction For Customer:"+transaction.getName());
                    if(transaction.getTransactionType().equalsIgnoreCase(DBConstants.PPOS_TRAN_TYPE)) {
                        ordersSent = pposHelper.processPPOSOrderReport(transaction);
                    } else if(transaction.getTransactionType().equalsIgnoreCase(DBConstants.COS_TRAN_TYPE)) {
                        ordersSent = cosHelper.processCOSOrderReport(transaction);
                    }
                    updateTransaction(transaction, ordersSent);
                } catch (SalesOrderException e) {
                    logger.error(e);
                } catch(Exception e) {
                    logger.error(e);
                    new ErrorEmailer().sendErrorEmail(e, "Exception occurred while Reading/Updating Back Feed Control Table. SalesOrder data may have been sent successfully. Transaction: "+transaction);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new SalesOrderException(e.getMessage());
        }
    }

    private void updateTransaction(TransactionInfo transaction, int ordersSent) throws Exception {
        if(ordersSent > 0) {
            logger.info("Sent "+ordersSent+" Orders. Updating Last Transaction Date for this Partner.");
            updateLastTransactionStats(transaction);
        } else {
            logger.info("No Orders Found since Last Transaction Date:"+transaction.getLastTransactionDate()+". Last Transaction Stats for this Partner will NOT be updated.");
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

    public void setPposHelper(PPOSHelper pposHelper) {
        this.pposHelper = pposHelper;
    }

    public void setCosHelper(COSHelper cosHelper) {
        this.cosHelper = cosHelper;
    }
}

package com.monsanto.irdsoapservices.salesorder.helper;

import com.monsanto.irdsoapservices.constants.DBConstants;
import com.monsanto.irdsoapservices.salesorder.dao.DataSummaryDao;
import com.monsanto.irdsoapservices.salesorder.dao.SalesOrderDao;
import com.monsanto.irdsoapservices.salesorder.domain.DataSummaryInfo;
import com.monsanto.irdsoapservices.salesorder.domain.DataSummaryTotals;
import com.monsanto.irdsoapservices.salesorder.domain.GPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.exception.SalesOrderException;
import com.monsanto.irdsoapservices.utils.ErrorEmailer;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: caggarw
 * Date: Apr 3, 2012
 * Time: 10:05:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class DataSummaryHelper {

    DataSummaryDao dataSummaryDao;
    Logger logger = Logger.getLogger(this.getClass());
    DataSummaryRequestBuilder dataSummaryRequestBuilder;

    public void processDataSummaryReport(TransactionInfo transaction) throws SalesOrderException {
        DataSummaryInfo dataSummaryInfo;
        DataSummaryTotals dataSummaryTotals;
        try {
            logger.info("Initiating DataSummaryReport for Partner:"+transaction.getName());
            if (DBConstants.DIRECT_DATA_SOURCE_TYPE.equalsIgnoreCase(transaction.getDataSourceType())) {
                dataSummaryInfo = dataSummaryDao.getDataSummaryInfoDirect(transaction.getLastTransactionDate(), transaction.getGroupCode());
                dataSummaryTotals = dataSummaryDao.getDataSummaryTotalsDirect(transaction.getLastTransactionDate(), transaction.getGroupCode());
            }
            else {
                dataSummaryInfo = dataSummaryDao.getDataSummaryInfoWinfield(transaction.getLastTransactionDate(), transaction.getGroupCode(), transaction.getDataSourceType());
                dataSummaryTotals = dataSummaryDao.getDataSummaryTotalsWinfield(transaction.getLastTransactionDate(), transaction.getGroupCode(), transaction.getDataSourceType());

            }
            sendDataSummary(dataSummaryInfo, dataSummaryTotals, transaction);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
            new ErrorEmailer().sendErrorEmail(e, "Exception occurred while running DataSummaryReport for Partner:"+transaction.getName());
            throw new SalesOrderException(e.getMessage());
        }
    }

    private void sendDataSummary(DataSummaryInfo dataSummaryInfo, DataSummaryTotals dataSummaryTotals, TransactionInfo transactionInfo) {
        //To change body of created methods use File | Settings | File Templates.
    }

    public DataSummaryRequestBuilder getDataSummaryRequestBuilder() {
        return dataSummaryRequestBuilder;
    }

    public void setDataSummaryRequestBuilder(DataSummaryRequestBuilder dataSummaryRequestBuilder) {
        this.dataSummaryRequestBuilder = dataSummaryRequestBuilder;
    }

    public DataSummaryDao getDataSummaryDao() {
        return dataSummaryDao;
    }

    public void setDataSummaryDao(DataSummaryDao dataSummaryDao) {
        this.dataSummaryDao = dataSummaryDao;
    }
}

package com.monsanto.irdsoapservices.salesorder.helper;

import com.monsanto.irdsoapservices.constants.DBConstants;
import com.monsanto.irdsoapservices.salesorder.client.ClientFactory;
import com.monsanto.irdsoapservices.salesorder.dao.DataSummaryDao;
import com.monsanto.irdsoapservices.salesorder.domain.DataSummaryInfo;
import com.monsanto.irdsoapservices.salesorder.domain.DataSummaryTotals;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.exception.SalesOrderException;
import com.monsanto.irdsoapservices.utils.ErrorEmailer;
import org.apache.log4j.Logger;

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
    ClientFactory clientFactory;

    public void processDataSummaryReport(TransactionInfo transaction) throws SalesOrderException {
        DataSummaryInfo dataSummaryInfo = new DataSummaryInfo();
        DataSummaryTotals dataSummaryTotals = new DataSummaryTotals();
        try {
            logger.info("Initiating DataSummaryReport for Partner:"+transaction.getName());
            if (DBConstants.DIRECT_DATA_SOURCE_TYPE.equalsIgnoreCase(transaction.getDataSourceType())) {
                dataSummaryInfo = dataSummaryDao.getDataSummaryInfoDirect(transaction.getLastTransactionDate(), transaction.getGroupCode());
                dataSummaryTotals = dataSummaryDao.getDataSummaryTotalsDirect(transaction.getLastTransactionDate(), transaction.getGroupCode());
            }
            //CUSTPLT-632 - Introducing new Partner Agdata
            else if(DBConstants.GPOS_AGDATA_SOURCE_TYPE.equalsIgnoreCase(transaction.getDataSourceType())) {
                dataSummaryInfo = dataSummaryDao.getDataSummaryInfoAgdata(transaction.getLastTransactionDate(), transaction.getGroupCode());
                dataSummaryTotals = dataSummaryDao.getDataSummaryTotalsAgdata(transaction.getLastTransactionDate(), transaction.getGroupCode());
            }
            //OTT 92172 - Seed GPOS Interface to Agdata for  Bayer  - Introducing new Partner Agdata2021
            else if(DBConstants.GPOS_AGDATA_SOURCE_TYPE_2021.equalsIgnoreCase(transaction.getDataSourceType())) {
                dataSummaryInfo = dataSummaryDao.getDataSummaryInfoAgdata2021(transaction.getLastTransactionDate(), transaction.getGroupCode());
                dataSummaryTotals = dataSummaryDao.getDataSummaryTotalsAgdata2021(transaction.getLastTransactionDate(), transaction.getGroupCode());
            }
            else  if (DBConstants.XML_DATA_SOURCE_TYPE.equalsIgnoreCase(transaction.getDataSourceType())) {
                dataSummaryInfo = dataSummaryDao.getDataSummaryInfoXML(transaction.getLastTransactionDate(), transaction.getGroupCode());
                dataSummaryTotals = dataSummaryDao.getDataSummaryTotalsXML(transaction.getLastTransactionDate(), transaction.getGroupCode());
            }
             else  if (DBConstants.AGRIMINE_DATA_SOURCE_TYPE.equalsIgnoreCase(transaction.getDataSourceType())) {
                dataSummaryInfo = dataSummaryDao.getDataSummaryInfoAgrmine(transaction.getLastTransactionDate(), transaction.getGroupCode());
                dataSummaryTotals = dataSummaryDao.getDataSummaryTotalsAgrimine(transaction.getLastTransactionDate(), transaction.getGroupCode());
            }
            clientFactory.getSalesOrderClient().getDataSummaryReport(dataSummaryRequestBuilder.buildDataSummaryReportRequest(dataSummaryInfo, dataSummaryTotals, transaction));
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
            new ErrorEmailer().sendErrorEmail(e, "Exception occurred while running DataSummaryReport for Partner:"+transaction.getName());
            throw new SalesOrderException(e.getMessage());
        }
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

    public void setClientFactory(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }
}

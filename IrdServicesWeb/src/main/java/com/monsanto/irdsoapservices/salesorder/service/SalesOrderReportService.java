package com.monsanto.irdsoapservices.salesorder.service;

import com.monsanto.irdsoapservices.salesorder.constants.XmlConstants;
import com.monsanto.irdsoapservices.salesorder.dao.TransactionDao;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.exception.SalesOrderException;
import com.monsanto.irdsoapservices.salesorder.helper.*;
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
    private GPOSHelper gposHelper;
    private GPOSWinfieldHelper gposWinfieldHelper;
    private DataSummaryHelper dataSummaryHelper;
    Logger logger = Logger.getLogger(this.getClass());

    public void startProcessing() throws SalesOrderException {
        TransactionInfo transaction = null;
        try {
            logger.info("Starting Sales Order Report Job v20160330 @ "+new Date());
            List<TransactionInfo> transactionsToBeProcessed = transactionDao.getTransactionsToBeProcessed();
            logger.info("Found "+transactionsToBeProcessed.size()+" Transactions to be Processed.");
            int ordersSent;
            for(int index=0; index < transactionsToBeProcessed.size(); index++) {
                try {
                    ordersSent = 0;
                    transaction = transactionsToBeProcessed.get(index);
                    logger.info("Processing2021 '"+transaction.getTransactionType()+"' Transaction For Customer:"+transaction.getName());
                    if(transaction.getTransactionType().equalsIgnoreCase(DBConstants.PPOS_TRAN_TYPE)) {
                        ordersSent = pposHelper.processPPOSOrderReport(transaction);
                    } else if(transaction.getTransactionType().equalsIgnoreCase(DBConstants.COS_TRAN_TYPE)) {
                        ordersSent = cosHelper.processCOSOrderReport(transaction);
                    } else if(transaction.getTransactionType().equalsIgnoreCase(DBConstants.GPOS_TRAN_TYPE)) {
                        ordersSent = gposHelper.processGPOSOrderReport(transaction);
                    }
                      else if(transaction.getTransactionType().equalsIgnoreCase(DBConstants.GPOS_AGRIMINE_TRAN_TYPE)) {
                        transaction.setDataSourceType(DBConstants.AGRIMINE_DATA_SOURCE_TYPE);
                        //TODO add tests for file  type
                        transaction.setFileType(XmlConstants.FILE_TYPE_MANUAL);
                        ordersSent = gposWinfieldHelper.processGPOSOrderReport(transaction);
                        if(ordersSent > 0) {
                            dataSummaryHelper.processDataSummaryReport(transaction);
                        }
                    }
                    else if(transaction.getTransactionType().equalsIgnoreCase(DBConstants.GPOS_CLASSIC_TRAN_TYPE)) {
                        transaction.setDataSourceType(DBConstants.XML_DATA_SOURCE_TYPE);
                        transaction.setFileType(XmlConstants.FILE_TYPE_AGRIMINE);
                        ordersSent = gposWinfieldHelper.processGPOSOrderReport(transaction);
                        if(ordersSent > 0 && GPOSWinfieldHelper.isWinfield(transaction.getCompanyCode())) {
                            dataSummaryHelper.processDataSummaryReport(transaction);
                        }
                    }
                    else if(transaction.getTransactionType().equalsIgnoreCase(DBConstants.GPOS_DIRECT_TRAN_TYPE)) {
                        transaction.setDataSourceType(DBConstants.DIRECT_DATA_SOURCE_TYPE);
                        transaction.setFileType(XmlConstants.FILE_TYPE_EXTERNAL);
                        ordersSent = gposWinfieldHelper.processGPOSOrderReport(transaction);
                        if(ordersSent > 0 && GPOSWinfieldHelper.isWinfield(transaction.getCompanyCode())) {
                            dataSummaryHelper.processDataSummaryReport(transaction);
                        }
                    }
                    //CUSTPLT-632 - Introducing new Partner Agdata
                    else if(transaction.getTransactionType().equalsIgnoreCase(DBConstants.GPOS_AGDATA_TRAN_TYPE)) {
                        logger.info("Inside GPOS AGData");
                        transaction.setDataSourceType(DBConstants.GPOS_AGDATA_SOURCE_TYPE);
                        transaction.setFileType(XmlConstants.FILE_TYPE_EXTERNAL);
                        ordersSent = gposWinfieldHelper.processGPOSOrderReport(transaction);
                        if(ordersSent > 0 && GPOSWinfieldHelper.isWinfield(transaction.getCompanyCode())) {
                            dataSummaryHelper.processDataSummaryReport(transaction);
                        }
                    }

                    //OTT 92172 - Seed GPOS Interface to Agdata for Bayer  - Introducing new Partner Agdata2021
                    else if(transaction.getTransactionType().equalsIgnoreCase(DBConstants.GPOS_AGDATA_TRAN_TYPE_2021)) {
                        logger.info("Inside GPOS AGData 2021");
                        transaction.setDataSourceType(DBConstants.GPOS_AGDATA_SOURCE_TYPE_2021);
                        transaction.setFileType(XmlConstants.FILE_TYPE_EXTERNAL);
                        ordersSent = gposWinfieldHelper.processGPOSOrderReport(transaction);
                        if (ordersSent > 0 && GPOSWinfieldHelper.isWinfield(transaction.getCompanyCode())) {
                            dataSummaryHelper.processDataSummaryReport(transaction);
                        }
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

    public void setGposHelper(GPOSHelper gposHelper) {
        this.gposHelper = gposHelper;
    }

    public void setGposWinfieldHelper(GPOSWinfieldHelper gposWinfieldHelper) {
        this.gposWinfieldHelper = gposWinfieldHelper;
    }

    public void setDataSummaryHelper(DataSummaryHelper dataSummaryHelper) {
        this.dataSummaryHelper = dataSummaryHelper;
    }
}

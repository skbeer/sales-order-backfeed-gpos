package com.monsanto.irdsoapservices.salesorder.helper;

import com.monsanto.irdsoapservices.constants.DBConstants;
import com.monsanto.irdsoapservices.salesorder.client.ClientFactory;
import com.monsanto.irdsoapservices.salesorder.dao.SalesOrderDao;
import com.monsanto.irdsoapservices.salesorder.dao.TransactionDao;
import com.monsanto.irdsoapservices.salesorder.domain.GPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.OrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.exception.SalesOrderException;
import com.monsanto.irdsoapservices.salesorder.schema.SalesOrderReport;
import com.monsanto.irdsoapservices.utils.ErrorEmailer;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: caggarw
 * Date: Mar 20, 2012
 * Time: 3:17:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class GPOSWinfieldHelper extends AbstractSalesOrderHelper<GPOSOrderInfo> {
    private static final String WINFIELD_COMPANY_CODE = "0527346750000";
    SalesOrderDao salesOrderDao;
    Logger logger = Logger.getLogger(this.getClass());
    GPOSWinfieldRequestBuilder gposWinfieldRequestBuilder;

    public int processGPOSOrderReport(TransactionInfo transaction) throws SalesOrderException {
        int ordersSent = 0;
        try {
            logger.info("Initiating GPOS SalesOrderReport for PARTNER2021:"+transaction.getName());
            logger.info("DataSourceType 2021:"+transaction.getDataSourceType());
            List<GPOSOrderInfo> deNormalizedOrders = new ArrayList<GPOSOrderInfo>();
            if (DBConstants.DIRECT_DATA_SOURCE_TYPE.equalsIgnoreCase(transaction.getDataSourceType())) {
                if(GPOSWinfieldHelper.isWinfield(transaction.getCompanyCode())) {
                    deNormalizedOrders = salesOrderDao.getGPOSDirectOrders(transaction.getLastTransactionDate(), transaction.getGroupCode());
                }
                else{
                    deNormalizedOrders = salesOrderDao.getGPOSDirectOrders(transaction.getLastTransactionDate(), transaction.getGroupCode(),transaction.getCompanyCode());
                }
            }

            //CUSTPLT-632 - Introducing new Partner Agdata
            else if (DBConstants.GPOS_AGDATA_SOURCE_TYPE.equalsIgnoreCase(transaction.getDataSourceType()))
            {
                if(GPOSWinfieldHelper.isWinfield(transaction.getCompanyCode())){
                    deNormalizedOrders = salesOrderDao.getGPOSAgDataOrders(transaction.getLastTransactionDate(), transaction.getGroupCode());
                }
                else{
                    deNormalizedOrders = salesOrderDao.getGPOSAgDataOrders(transaction.getLastTransactionDate(), transaction.getGroupCode(),transaction.getCompanyCode());
                    System.out.println("AGdata Company Code"+transaction.getCompanyCode());
                }
            }

            //OTT 92172 - Seed GPOS Interface to Agdata for Bayer  - Introducing new Partner Agdata2021
            else if (DBConstants.GPOS_AGDATA_SOURCE_TYPE_2021.equalsIgnoreCase(transaction.getDataSourceType()))
            {
                if(GPOSWinfieldHelper.isWinfield(transaction.getCompanyCode())){
                    deNormalizedOrders = salesOrderDao.getGPOSAgDataOrders2021(transaction.getLastTransactionDate(), transaction.getGroupCode());
                }
                else{
                    deNormalizedOrders = salesOrderDao.getGPOSAgDataOrders2021(transaction.getLastTransactionDate(), transaction.getGroupCode(),transaction.getCompanyCode());
                    System.out.println("AGdata Company Code 2021"+transaction.getCompanyCode());
                }
            }

            else if (DBConstants.XML_DATA_SOURCE_TYPE.equalsIgnoreCase(transaction.getDataSourceType())) {
               if(GPOSWinfieldHelper.isWinfield(transaction.getCompanyCode())){
                   deNormalizedOrders = salesOrderDao.getGPOSXMLOrders(transaction.getLastTransactionDate(), transaction.getGroupCode());
               }
               else{
                   deNormalizedOrders = salesOrderDao.getGPOSXMLOrders(transaction.getLastTransactionDate(), transaction.getGroupCode(),transaction.getCompanyCode());
               }
            }
            else if (DBConstants.AGRIMINE_DATA_SOURCE_TYPE.equalsIgnoreCase(transaction.getDataSourceType())) {
               deNormalizedOrders = salesOrderDao.getGPOSAgrimineOrders(transaction.getLastTransactionDate(), transaction.getGroupCode());
            }
            logger.info("Total number of GPOS Line Items2021-02:"+deNormalizedOrders.size());
            List<GPOSOrderInfo> normalizedOrders = normalizeOrderLineItems(deNormalizedOrders);
            ordersSent = normalizedOrders.size();
            logger.info("Total number of GPOS Orders:"+normalizedOrders.size());
            if(normalizedOrders.size() > 0) {
                sendFragmentedOrders(normalizedOrders, transaction);
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
            new ErrorEmailer().sendErrorEmail(e, "Exception occurred while running GPOS SalesOrderReport for Partner:"+transaction.getName());
            throw new SalesOrderException(e.getMessage());
        }
        return ordersSent;
    }


    // method is public only to be tested separately

    @Override
    public List<GPOSOrderInfo> normalizeOrderLineItems(List<GPOSOrderInfo> deNormalizedOrders) {
        List<GPOSOrderInfo> normalizedOrders = new ArrayList<GPOSOrderInfo>();
        if(deNormalizedOrders!= null && deNormalizedOrders.size() > 0) {
            GPOSOrderInfo prevNormalizedReport = deNormalizedOrders.get(0);
            prevNormalizedReport.getLineItems().add(prevNormalizedReport.getTempLineItem());
            if(deNormalizedOrders.size() == 1) {
                normalizedOrders.add(prevNormalizedReport);
            }
            GPOSOrderInfo currentNormalizedReport = null;
            for(int index = 1; index < deNormalizedOrders.size(); index++) {
                currentNormalizedReport = deNormalizedOrders.get(index);
                if(!isSameOrderGPOSWinfield(currentNormalizedReport, prevNormalizedReport)) {
                    normalizedOrders.add(prevNormalizedReport);
                    prevNormalizedReport = currentNormalizedReport;
                }
                prevNormalizedReport.getLineItems().add(currentNormalizedReport.getTempLineItem());
                if(index ==(deNormalizedOrders.size()-1)) {
                    normalizedOrders.add(prevNormalizedReport);
                }
            }
        }
        return normalizedOrders;
    }

    protected boolean isSameOrderGPOSWinfield(GPOSOrderInfo firstOrder, GPOSOrderInfo secondOrder) {
        String firstOrderKey=getKey(firstOrder);
        String secondOrderKey=getKey(secondOrder);
        return firstOrderKey.equals(secondOrderKey);
    }

    private String getKey(GPOSOrderInfo orderInfo) {
       String acctId="";
        String growerAcctId="";
        if(orderInfo.getDealerInfo()!=null){
            acctId=orderInfo.getDealerInfo().getAcctId();
        }
        if (orderInfo.getGrowerInfo() != null) {
            growerAcctId=orderInfo.getGrowerInfo().getAcctId();
        }
       return orderInfo.getOrderNumber()+"-"+acctId+"-"+growerAcctId;
    }

    @Override
    protected boolean isSameOrder(OrderInfo firstOrder, OrderInfo secondOrder) {
        return false;
    }

    protected SalesOrderReport getSalesOrderRequest(List<GPOSOrderInfo> orderReport, TransactionInfo transactionInfo) throws Exception {
        return gposWinfieldRequestBuilder.buildGPOSRequest(orderReport, transactionInfo);
    }

    public void setSalesOrderDao(SalesOrderDao salesOrderDao) {
        this.salesOrderDao = salesOrderDao;
    }

    public GPOSWinfieldRequestBuilder getGposWinfieldRequestBuilder() {
        return gposWinfieldRequestBuilder;
    }

    public void setGposWinfieldRequestBuilder(GPOSWinfieldRequestBuilder gposWinfieldRequestBuilder) {
        this.gposWinfieldRequestBuilder = gposWinfieldRequestBuilder;
    }

    public void setClientFactory(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    public void setTransactionDao(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }

    public static boolean isWinfield(String companyCode){
        return WINFIELD_COMPANY_CODE.equals(companyCode);
    }
}


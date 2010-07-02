package com.monsanto.irdsoapservices.salesorder.helper;

import com.monsanto.irdsoapservices.salesorder.dao.SalesOrderDao;
import com.monsanto.irdsoapservices.salesorder.client.ClientFactory;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.domain.PPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.COSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.exception.SalesOrderException;
import com.monsanto.irdsoapservices.salesorder.schema.SalesOrderReportResponseType;
import com.monsanto.irdsoapservices.utils.ErrorEmailer;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 22, 2010
 * Time: 1:43:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class COSHelper {
    SalesOrderDao salesOrderDao;
    Logger logger = Logger.getLogger(this.getClass());
    COSRequestBuilder cosRequestBuilder;
    ClientFactory clientFactory;

    public int processCOSOrderReport(TransactionInfo transaction) throws SalesOrderException {
        int ordersSent = 0;
        try {
            logger.info("Initiating COS SalesOrderReport for Partner:"+transaction.getName());
            List<COSOrderInfo> deNormalizedOrders = salesOrderDao.getCOSOrders(transaction.getLastTransactionDate(), transaction.getGroupCode());
            logger.info("Total number of COS Line Items:"+deNormalizedOrders.size());
            List<COSOrderInfo> normalizedOrders = normalizeOrderLineItems(deNormalizedOrders);
            logger.info("Total number of COS Orders:"+normalizedOrders.size());
            if(normalizedOrders.size() > 0) {
                logger.info("Calling the Sales Order Service");
                SalesOrderReportResponseType response = clientFactory.getSalesOrderClient().getSalesOrderReport(cosRequestBuilder.buildCOSRequest(normalizedOrders.subList(0, 1), transaction));
                logger.info("Received Response from Service:"+response.getStatus());
            }
            ordersSent = normalizedOrders.size();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
            new ErrorEmailer().sendErrorEmail(e, "Exception occurred while running PPOS SalesOrderReport for Partner:"+transaction.getName());
            throw new SalesOrderException(e.getMessage());
        }
        return ordersSent;
    }

    public List<COSOrderInfo> normalizeOrderLineItems(List<COSOrderInfo> deNormalizedOrders) {
        List<COSOrderInfo> normalizedOrders = new ArrayList<COSOrderInfo>();
        if(deNormalizedOrders!= null && deNormalizedOrders.size() > 0) {
            COSOrderInfo prevNormalizedReport = deNormalizedOrders.get(0);
            prevNormalizedReport.getLineItems().add(prevNormalizedReport.getTempLineItem());
            if(deNormalizedOrders.size() == 1) {
                normalizedOrders.add(prevNormalizedReport);
            }
            COSOrderInfo currentNormalizedReport = null;
            for(int index = 1; index < deNormalizedOrders.size(); index++) {
                currentNormalizedReport = deNormalizedOrders.get(index);
                if(!currentNormalizedReport.getOrderNumber().equals(prevNormalizedReport.getOrderNumber())) {
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

    public void setSalesOrderDao(SalesOrderDao salesOrderDao) {
        this.salesOrderDao = salesOrderDao;
    }

    public void setCosRequestBuilder(COSRequestBuilder pposRequestBuilder) {
        this.cosRequestBuilder = pposRequestBuilder;
    }

    public void setClientFactory(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }
}

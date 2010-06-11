package com.monsanto.irdsoapservices.salesorder.helper;

import com.monsanto.irdsoapservices.salesorder.dao.SalesOrderDao;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.domain.PPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.exception.SalesOrderException;
import com.monsanto.irdsoapservices.salesorder.schema.SalesOrderService;
import com.monsanto.irdsoapservices.salesorder.schema.SalesOrderService_Service;
import com.monsanto.irdsoapservices.salesorder.schema.SalesOrderReportResponseType;
import com.monsanto.irdsoapservices.salesorder.client.ClientFactory;
import com.monsanto.irdsoapservices.utils.ErrorEmailer;

import java.util.List;
import java.util.ArrayList;

import org.apache.log4j.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 8, 2010
 * Time: 3:10:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class PPOSHelper {
    SalesOrderDao salesOrderDao;
    Logger logger = Logger.getLogger(this.getClass());
    PPOSRequestBuilder pposRequestBuilder;
    ClientFactory clientFactory;

    public int processPPOSOrderReport(TransactionInfo transaction) throws SalesOrderException {
        int ordersSent = 0;
        try {
            logger.info("Initiating PPOS SalesOrderReport for Partner:"+transaction.getName());
            List<PPOSOrderInfo> deNormalizedOrders = salesOrderDao.getPPOSOrderInfo(transaction.getLastTransactionDate(), transaction.getGroupCode());
            logger.info("Total number of Line Items:"+deNormalizedOrders.size());
            List<PPOSOrderInfo> normalizedOrders = normalizeOrderLineItems(deNormalizedOrders);
            logger.info("Total number of Orders:"+normalizedOrders.size());
            logger.info("Calling the Sales Order Service");
            SalesOrderReportResponseType response = clientFactory.getSalesOrderClient().getSalesOrderReport(pposRequestBuilder.buildPPOSRequest(normalizedOrders.subList(0,1), transaction));
            logger.info("Received Response from Service:"+response.getStatus());
            ordersSent = normalizedOrders.size();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
            new ErrorEmailer().sendErrorEmail(e, "Exception occurred while running PPOS SalesOrderReport for Partner:"+transaction.getName());
            throw new SalesOrderException(e.getMessage());
        }
        return ordersSent;
    }

    public List<PPOSOrderInfo> normalizeOrderLineItems(List<PPOSOrderInfo> deNormalizedOrders) {
        List<PPOSOrderInfo> normalizedOrders = new ArrayList<PPOSOrderInfo>();
        if(deNormalizedOrders!= null && deNormalizedOrders.size() > 0) {
            PPOSOrderInfo prevNormalizedReport = deNormalizedOrders.get(0);
            prevNormalizedReport.getLineItems().add(prevNormalizedReport.getTempLineItem());
            PPOSOrderInfo currentNormalizedReport = null;
            for(int index = 1; index < deNormalizedOrders.size(); index++) {
                currentNormalizedReport = deNormalizedOrders.get(index);
                if(!currentNormalizedReport.getCrmOrderNumber().equals(prevNormalizedReport.getCrmOrderNumber())) {
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

    public void setPposRequestBuilder(PPOSRequestBuilder pposRequestBuilder) {
        this.pposRequestBuilder = pposRequestBuilder;
    }

    public void setClientFactory(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }
}

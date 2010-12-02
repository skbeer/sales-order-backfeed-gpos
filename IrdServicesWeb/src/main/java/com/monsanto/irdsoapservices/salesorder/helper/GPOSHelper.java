package com.monsanto.irdsoapservices.salesorder.helper;

import com.monsanto.irdsoapservices.salesorder.client.ClientFactory;
import com.monsanto.irdsoapservices.salesorder.dao.SalesOrderDao;
import com.monsanto.irdsoapservices.salesorder.dao.TransactionDao;
import com.monsanto.irdsoapservices.salesorder.domain.GPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.OrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.PPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.exception.SalesOrderException;
import com.monsanto.irdsoapservices.salesorder.schema.SalesOrderReport;
import com.monsanto.irdsoapservices.utils.ErrorEmailer;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 8, 2010
 * Time: 3:10:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class GPOSHelper extends AbstractSalesOrderHelper<GPOSOrderInfo> {
    SalesOrderDao salesOrderDao;
    Logger logger = Logger.getLogger(this.getClass());
    GPOSRequestBuilder gposRequestBuilder;

    public int processGPOSOrderReport(TransactionInfo transaction) throws SalesOrderException {
        int ordersSent = 0;
        try {
            logger.info("Initiating GPOS SalesOrderReport for Partner:"+transaction.getName());
            List<GPOSOrderInfo> deNormalizedOrders = salesOrderDao.getGPOSOrders(transaction.getLastTransactionDate(), transaction.getGroupCode());
            logger.info("Total number of GPOS Line Items:"+deNormalizedOrders.size());
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

    protected boolean isSameOrder(OrderInfo firstOrder, OrderInfo secondOrder) {
        return firstOrder.getCrmOrderNumber().equals(secondOrder.getCrmOrderNumber());
    }

    protected SalesOrderReport getSalesOrderRequest(List<GPOSOrderInfo> orderReport, TransactionInfo transactionInfo) throws Exception {
        return gposRequestBuilder.buildGPOSRequest(orderReport, transactionInfo);
    }

    public void setSalesOrderDao(SalesOrderDao salesOrderDao) {
        this.salesOrderDao = salesOrderDao;
    }

    public void setGposRequestBuilder(GPOSRequestBuilder gposRequestBuilder) {
        this.gposRequestBuilder = gposRequestBuilder;
    }

    public void setClientFactory(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    public void setTransactionDao(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }
}

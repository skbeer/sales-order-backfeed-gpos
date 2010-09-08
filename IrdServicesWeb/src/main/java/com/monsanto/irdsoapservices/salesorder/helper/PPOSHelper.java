package com.monsanto.irdsoapservices.salesorder.helper;

import com.monsanto.irdsoapservices.salesorder.client.ClientFactory;
import com.monsanto.irdsoapservices.salesorder.dao.SalesOrderDao;
import com.monsanto.irdsoapservices.salesorder.dao.TransactionDao;
import com.monsanto.irdsoapservices.salesorder.domain.PPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.domain.OrderInfo;
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
public class PPOSHelper extends AbstractSalesOrderHelper<PPOSOrderInfo> {
    SalesOrderDao salesOrderDao;
    Logger logger = Logger.getLogger(this.getClass());
    PPOSRequestBuilder pposRequestBuilder;

    public int processPPOSOrderReport(TransactionInfo transaction) throws SalesOrderException {
        int ordersSent = 0;
        try {
            logger.info("Initiating PPOS SalesOrderReport for Partner:"+transaction.getName());
            List<PPOSOrderInfo> deNormalizedOrders = salesOrderDao.getPPOSOrders(transaction.getLastTransactionDate(), transaction.getGroupCode());
            logger.info("Total number of PPOS Line Items:"+deNormalizedOrders.size());
            List<PPOSOrderInfo> normalizedOrders = normalizeOrderLineItems(deNormalizedOrders);
            ordersSent = normalizedOrders.size();
            logger.info("Total number of PPOS Orders:"+normalizedOrders.size());
            if(normalizedOrders.size() > 0) {
                sendFragmentedOrders(normalizedOrders, transaction);
            }            
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
            new ErrorEmailer().sendErrorEmail(e, "Exception occurred while running PPOS SalesOrderReport for Partner:"+transaction.getName());
            throw new SalesOrderException(e.getMessage());
        }
        return ordersSent;
    }

    protected boolean isSameOrder(OrderInfo firstOrder, OrderInfo secondOrder) {
        return firstOrder.getCrmOrderNumber().equals(secondOrder.getCrmOrderNumber());
    }

    protected SalesOrderReport getSalesOrderRequest(List<PPOSOrderInfo> orderReport, TransactionInfo transactionInfo) throws Exception {
        return pposRequestBuilder.buildPPOSRequest(orderReport, transactionInfo);
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

    public void setTransactionDao(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }
}

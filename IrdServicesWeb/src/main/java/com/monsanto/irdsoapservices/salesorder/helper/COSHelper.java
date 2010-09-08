package com.monsanto.irdsoapservices.salesorder.helper;

import com.monsanto.irdsoapservices.salesorder.client.ClientFactory;
import com.monsanto.irdsoapservices.salesorder.dao.SalesOrderDao;
import com.monsanto.irdsoapservices.salesorder.dao.TransactionDao;
import com.monsanto.irdsoapservices.salesorder.domain.COSOrderInfo;
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
 * Date: Jun 22, 2010
 * Time: 1:43:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class COSHelper extends AbstractSalesOrderHelper<COSOrderInfo> {
    SalesOrderDao salesOrderDao;
    Logger logger = Logger.getLogger(this.getClass());
    COSRequestBuilder cosRequestBuilder;
    
    public int processCOSOrderReport(TransactionInfo transaction) throws SalesOrderException {
        int ordersSent = 0;
        try {
            logger.info("Initiating COS SalesOrderReport for Partner:"+transaction.getName());
            List<COSOrderInfo> denormalizedCosOrders = salesOrderDao.getCOSOrders(transaction.getLastTransactionDate(), transaction.getGroupCode());
            logger.info("Total number of COS Line Items: "+denormalizedCosOrders.size());
            List<COSOrderInfo> normalizedCosOrders = normalizeOrderLineItems(denormalizedCosOrders);
            logger.info("Total number of COS Orders: "+normalizedCosOrders.size());
            ordersSent = normalizedCosOrders.size();
            if(normalizedCosOrders.size() > 0) {
                sendFragmentedOrders(normalizedCosOrders, transaction);
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
            new ErrorEmailer().sendErrorEmail(e, "Exception occurred while running COS SalesOrderReport for Partner:"+transaction.getName());
            throw new SalesOrderException(e.getMessage());
        }
        return ordersSent;
    }

    protected boolean isSameOrder(OrderInfo firstOrder, OrderInfo secondOrder) {
        return firstOrder.getDealerInfo().getAcctId().equals(secondOrder.getDealerInfo().getAcctId());
    }

    protected SalesOrderReport getSalesOrderRequest(List<COSOrderInfo> orderReport, TransactionInfo transactionInfo) throws Exception {
        return cosRequestBuilder.buildCOSRequest(orderReport, transactionInfo);
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

    public void setTransactionDao(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }
}

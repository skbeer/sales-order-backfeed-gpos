package com.monsanto.irdsoapservices.salesorder.helper;

import com.monsanto.irdsoapservices.salesorder.domain.GPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.OrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.schema.SalesOrderReportResponseType;
import com.monsanto.irdsoapservices.salesorder.schema.SalesOrderReport;
import com.monsanto.irdsoapservices.salesorder.client.ClientFactory;
import com.monsanto.irdsoapservices.salesorder.dao.TransactionDao;

import java.util.List;
import java.util.ArrayList;

import org.apache.log4j.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Aug 30, 2010
 * Time: 3:48:23 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractSalesOrderHelper<T extends OrderInfo> {
    ClientFactory clientFactory;
    TransactionDao transactionDao;
    public static final String AgdataCompanyCode = "1661352510000";
    Logger logger = Logger.getLogger(this.getClass());

    // method is public only to be tested separately
    public List<T> normalizeOrderLineItems(List<T> deNormalizedOrders) {
        List<T> normalizedOrders = new ArrayList<T>();
        if(deNormalizedOrders!= null && deNormalizedOrders.size() > 0) {
            T prevNormalizedReport = deNormalizedOrders.get(0);
            prevNormalizedReport.getLineItems().add(prevNormalizedReport.getTempLineItem());
            if(deNormalizedOrders.size() == 1) {
                normalizedOrders.add(prevNormalizedReport);
            }
            T currentNormalizedReport = null;
            for(int index = 1; index < deNormalizedOrders.size(); index++) {
                currentNormalizedReport = deNormalizedOrders.get(index);
                if(!isSameOrder(currentNormalizedReport, prevNormalizedReport)) {
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

    protected abstract boolean isSameOrder(OrderInfo firstOrder, OrderInfo secondOrder);
    protected abstract SalesOrderReport getSalesOrderRequest(List<T> orderReport, TransactionInfo transactionInfo) throws Exception;

    protected List<T> subList(List<T> originalList, int start, int end) {
        List secondPart = originalList.subList(start, end);
        ArrayList<T> returnValue = new ArrayList(secondPart);
        secondPart.clear();
        return returnValue;
    }

    protected void sendFragmentedOrders(List<T> originalOrders, TransactionInfo transactionInfo) throws Exception {
        int endPos = transactionInfo.getMaxFileSize();
        int totalOrders = originalOrders.size();
        int totalBatches = (totalOrders/endPos)+(totalOrders%endPos >0?1:0);
        transactionInfo.setFileCount(totalBatches);
        logger.info("Sending Orders in Batches of size "+transactionInfo.getMaxFileSize());
        int count = 0;
        while(originalOrders.size() > 0) {
            if(endPos > originalOrders.size()) {
                endPos = originalOrders.size();
            }
            logger.info("Sending Batch # "+(++count));
            try {
                List<T> orders=subList(originalOrders, 0, endPos);
                SalesOrderReport salesOrderRequest = getSalesOrderRequest(orders, transactionInfo);
                //logger.info("Agdata Updation: ..inside AbstractSalesOrderHelper.sendFragmentedOrders method...");
                logger.info("Built sales order request for batch Batch # " + count);
                updateDocumentIdentifierAndAddToDataSummaryDetails(salesOrderRequest, count, totalBatches, transactionInfo);
                SalesOrderReportResponseType response = clientFactory.getSalesOrderClient().getSalesOrderReport(salesOrderRequest);
                //logger.info("Agdata Updation...");
                for(T order:orders) {
                    if(order instanceof GPOSOrderInfo && (transactionInfo.getCompanyCode().equals(AgdataCompanyCode))){
                        //logger.info("Partner name-- "+transactionInfo.getName()+"  Company code-- "+transactionInfo.getCompanyCode());
                        //logger.info("Agdata Updation: TranID -- "+order.getTempLineItem().getLineIdentifier());
                        transactionDao.updateSentToAgdata(order.getTempLineItem().getLineIdentifier());
                    }
                }
            } catch (Exception se) {
                logger.error("Error occurred while trying to send Batch # "+count);
                logger.error(se,se);
                throw se;
            }
            logger.info("Batch sent Successfully. Updating Last_Transaction_Number to: "+(transactionInfo.getLastTransactionNumber()+1));
            transactionInfo.setLastTransactionNumber(transactionInfo.getLastTransactionNumber()+1);
            transactionDao.updateLastTransactionNumber(transactionInfo);
            logger.info("Remaining Orders to be sent: "+originalOrders.size());
        }
        logger.info("Completed sending Orders.");
    }

    private void updateDocumentIdentifierAndAddToDataSummaryDetails(SalesOrderReport salesOrderReport, int fileNumber, int totalFiles, TransactionInfo transactionInfo) {
        String docId = salesOrderReport.getHeader().getThisDocumentIdentifier().getDocumentIdentifier();
        docId = docId.replaceFirst("SEQUENCE", fileNumber+"_OF_"+totalFiles);
        salesOrderReport.getHeader().getThisDocumentIdentifier().setDocumentIdentifier(docId);
        transactionInfo.getDocumentIds().add(docId);
    }
}

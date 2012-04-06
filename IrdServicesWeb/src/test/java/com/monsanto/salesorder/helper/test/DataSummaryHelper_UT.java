package com.monsanto.salesorder.helper.test;

import com.monsanto.irdsoapservices.datasummary.schema.DataSummaryReport;
import com.monsanto.irdsoapservices.datasummary.schema.HeaderType;
import com.monsanto.irdsoapservices.datasummary.schema.ThisDocumentIdentifierType;
import com.monsanto.irdsoapservices.salesorder.client.ClientFactory;
import com.monsanto.irdsoapservices.salesorder.dao.DataSummaryDao;
import com.monsanto.irdsoapservices.salesorder.domain.DataSummaryInfo;
import com.monsanto.irdsoapservices.salesorder.domain.DataSummaryTotals;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.helper.DataSummaryHelper;
import com.monsanto.irdsoapservices.salesorder.helper.DataSummaryRequestBuilder;
import com.monsanto.irdsoapservices.salesorder.schema.SalesOrderService;
import junit.framework.TestCase;
import org.easymock.classextension.EasyMock;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: caggarw
 * Date: Apr 3, 2012
 * Time: 9:54:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class DataSummaryHelper_UT extends TestCase {

    private DataSummaryHelper helper = new DataSummaryHelper();
    DataSummaryDao dataSummaryDao;
    DataSummaryRequestBuilder requestBuilder;
    SalesOrderService salesOrderServiceClient;
    ClientFactory clientFactory;

    @Override
    protected void setUp() throws Exception {
        dataSummaryDao = EasyMock.createMock(DataSummaryDao.class);
        requestBuilder = EasyMock.createMock(DataSummaryRequestBuilder.class);
        helper.setDataSummaryDao(dataSummaryDao);
        helper.setDataSummaryRequestBuilder(requestBuilder);
        salesOrderServiceClient = org.easymock.EasyMock.createMock(SalesOrderService.class);
        clientFactory = EasyMock.createMock(ClientFactory.class);
        helper.setClientFactory(clientFactory);
    }

    public void testProcessDataSummaryReport() throws Exception {
        Date aDate = new Date();
        TransactionInfo transactionInfo = getTransactionInfo(aDate, "ABC");
        transactionInfo.setDataSourceType("DIRECT");
        DataSummaryInfo dataSummaryInfo = new DataSummaryInfo();
        dataSummaryInfo.setTotalLineItems(2000);
        dataSummaryInfo.setTotalDealers(234);
        dataSummaryInfo.setTotalGrowers(3456);
        dataSummaryInfo.setTotalEquivalentQuantity(new BigDecimal(23456.35));
        dataSummaryInfo.setTotalInvoices(25);

        DataSummaryTotals dataSummaryTotals = new DataSummaryTotals();
        dataSummaryTotals.setTotalDailyOpenInvoices("2345");
        dataSummaryTotals.setTotalOpenInvoices("2445");
        org.easymock.EasyMock.expect(dataSummaryDao.getDataSummaryInfoDirect(aDate, "ABC")).andReturn(dataSummaryInfo);
        org.easymock.EasyMock.expect(dataSummaryDao.getDataSummaryTotalsDirect(aDate, "ABC")).andReturn(dataSummaryTotals);

        DataSummaryReport summaryReport = getDataSummaryReport();
        EasyMock.expect(requestBuilder.buildDataSummaryReportRequest((DataSummaryInfo) EasyMock.anyObject(), (DataSummaryTotals) EasyMock.anyObject(), (TransactionInfo) EasyMock.anyObject())).andReturn(summaryReport);
        EasyMock.expect(clientFactory.getSalesOrderClient()).andReturn(salesOrderServiceClient);
        salesOrderServiceClient.getDataSummaryReport(((DataSummaryReport) EasyMock.anyObject()));
        EasyMock.replay(requestBuilder);
        EasyMock.replay(clientFactory);
        org.easymock.EasyMock.replay(dataSummaryDao);
        org.easymock.EasyMock.replay(salesOrderServiceClient);
        helper.processDataSummaryReport(transactionInfo);

        EasyMock.verify(requestBuilder);
        EasyMock.verify(clientFactory);
        org.easymock.EasyMock.verify(dataSummaryDao);
        org.easymock.EasyMock.verify(salesOrderServiceClient);
    }

    private DataSummaryReport getDataSummaryReport() {
        DataSummaryReport report = new DataSummaryReport();
        HeaderType headerType = new HeaderType();
        ThisDocumentIdentifierType thisDocumentIdentifierType = new ThisDocumentIdentifierType();
        thisDocumentIdentifierType.setDocumentIdentifier("1001");
        headerType.setThisDocumentIdentifier(thisDocumentIdentifierType);
        report.setHeader(headerType);
        return report;
    }

    private TransactionInfo getTransactionInfo(Date lastTransactionDate, String groupCode) {
        TransactionInfo tranInfo = new TransactionInfo();
        tranInfo.setLastTransactionDate(lastTransactionDate);
        tranInfo.setGroupCode(groupCode);
        tranInfo.setMaxFileSize(500);
        return tranInfo;
    }

}

package com.monsanto.salesorder.helper.test;

import junit.framework.TestCase;
import com.monsanto.irdsoapservices.salesorder.helper.COSHelper;
import com.monsanto.irdsoapservices.salesorder.helper.COSRequestBuilder;
import com.monsanto.irdsoapservices.salesorder.dao.SalesOrderDao;
import com.monsanto.irdsoapservices.salesorder.dao.TransactionDao;
import com.monsanto.irdsoapservices.salesorder.client.ClientFactory;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.domain.COSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.PartnerInfo;
import com.monsanto.irdsoapservices.salesorder.schema.*;
import com.monsanto.irdsoapservices.salesorder.exception.SalesOrderException;
import static org.mockito.Mockito.*;
import org.mockito.ArgumentMatcher;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Aug 24, 2010
 * Time: 10:36:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class COSHelper_UT extends TestCase {
    COSHelper cosHelper;
    SalesOrderDao salesOrderDao;
    ClientFactory clientFactory;
    COSRequestBuilder cosRequestBuilder;
    SalesOrderService salesOrderService;
    SalesOrderReport salesOrderReport;
    TransactionDao transactionDao;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        salesOrderDao = mock(SalesOrderDao.class);
        clientFactory = mock(ClientFactory.class);
        cosRequestBuilder = mock(COSRequestBuilder.class);
        salesOrderService = mock(SalesOrderService.class);
        transactionDao = mock(TransactionDao.class);
        cosHelper = new COSHelper();
        cosHelper.setSalesOrderDao(salesOrderDao);
        cosHelper.setClientFactory(clientFactory);
        cosHelper.setCosRequestBuilder(cosRequestBuilder);
        cosHelper.setTransactionDao(transactionDao);
        salesOrderReport = getSalesOrderReport();
    }

    public void testProcessCOSOrders_noOrdersToProcess_doNotCallTheService() throws Exception {
        when(salesOrderDao.getCOSOrders(null, "XA")).thenReturn(getCosOrders(0));
        assertEquals(0, cosHelper.processCOSOrderReport(getTransactionInfo()));
        verify(salesOrderDao).getCOSOrders(null, "XA");
        verifyZeroInteractions(clientFactory);
        verifyZeroInteractions(cosRequestBuilder);
    }

    public void testProcessCOSOrders_withOrdersToProcess_createRequest_callTheService() throws Exception {
        when(salesOrderDao.getCOSOrders(null, "XA")).thenReturn(getCosOrders(4));
        when(cosRequestBuilder.buildCOSRequest(argThat(new IsListOfFourElements()), (TransactionInfo)anyObject())).thenReturn(salesOrderReport);
        when(clientFactory.getSalesOrderClient()).thenReturn(salesOrderService);
        when(salesOrderService.getSalesOrderReport(salesOrderReport)).thenReturn(new SalesOrderReportResponseType());
        assertEquals(4, cosHelper.processCOSOrderReport(getTransactionInfo()));
        verify(salesOrderDao).getCOSOrders(null, "XA");
        verify(cosRequestBuilder).buildCOSRequest(argThat(new IsListOfFourElements()), (TransactionInfo)anyObject());
        verify(salesOrderService).getSalesOrderReport(salesOrderReport);
    }

    public void testProcessCOSOrders_withOrdersToProcess_serviceReturnsSoapFault_returnException() throws Exception {
        when(salesOrderDao.getCOSOrders(null, "XA")).thenReturn(getCosOrders(4));
        when(cosRequestBuilder.buildCOSRequest(argThat(new IsListOfFourElements()), (TransactionInfo)anyObject())).thenReturn(salesOrderReport);
        when(clientFactory.getSalesOrderClient()).thenReturn(salesOrderService);
        when(salesOrderService.getSalesOrderReport(salesOrderReport)).thenThrow(new SalesOrderFault("Service Exception", new ExceptionType()));
        try {
            cosHelper.processCOSOrderReport(getTransactionInfo());
            fail("Exception should have occurred");
        } catch (SalesOrderException e) {
            assertEquals("Service Exception", e.getMessage());
        }
        verify(salesOrderDao).getCOSOrders(null, "XA");
        verify(cosRequestBuilder).buildCOSRequest(argThat(new IsListOfFourElements()), (TransactionInfo)anyObject());
        verify(salesOrderService).getSalesOrderReport(salesOrderReport);
    }



    private List<COSOrderInfo> getCosOrders(int count) {
        List<COSOrderInfo> cosOrders = new ArrayList<COSOrderInfo>();
        for (int index = 0; index < count; index++) {
            COSOrderInfo cosOrderInfo =  new COSOrderInfo();
            cosOrderInfo.setOrderNumber("1001"+index);
            PartnerInfo dealerInfo = new PartnerInfo();
            dealerInfo.setEbid("1001"+index);
            dealerInfo.setAcctId("10"+index);
            cosOrderInfo.setDealerInfo(dealerInfo);
            cosOrders.add(cosOrderInfo);
        }
        return cosOrders;
    }

    private TransactionInfo getTransactionInfo() {
        TransactionInfo transactionInfo = new TransactionInfo();
        transactionInfo.setGroupCode("XA");
        transactionInfo.setMaxFileSize(500);
        return transactionInfo;
    }

    private SalesOrderReport getSalesOrderReport() {
        SalesOrderReport salesOrderReport = new SalesOrderReport();
        HeaderType headerType = new HeaderType();
        ThisDocumentIdentifierType thisDocumentIdentifierType = new ThisDocumentIdentifierType();
        thisDocumentIdentifierType.setDocumentIdentifier("1001");
        headerType.setThisDocumentIdentifier(thisDocumentIdentifierType);
        salesOrderReport.setHeader(headerType);
        return salesOrderReport;
    }

    class IsListOfFourElements extends ArgumentMatcher<List> {
      public boolean matches(Object list) {
          return ((List) list).size() == 4;
      }
   }

}

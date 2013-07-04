package com.monsanto.salesorder.dao.test;

import com.monsanto.irdsoapservices.constants.DBConstants;
import com.monsanto.irdsoapservices.salesorder.dao.SalesOrderDao;
import com.monsanto.irdsoapservices.salesorder.dao.SalesOrderDaoImpl;
import com.monsanto.irdsoapservices.salesorder.domain.COSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.GPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.PPOSOrderInfo;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

import java.util.Calendar;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 8, 2010
 * Time: 2:21:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class SalesOrderDaoImpl_UT extends AbstractTransactionalDataSourceSpringContextTests {

    private SalesOrderDao salesOrderDao;

    @Override
    protected void onSetUp() throws Exception {
        super.onSetUp();
        salesOrderDao = (SalesOrderDaoImpl)getApplicationContext().getBean("salesOrderDao");
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[] { "test-irdpos-beans.xml" };
    }

    public void testGetPPOSOrders() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2013, 05, 02);
        List<PPOSOrderInfo> pposOrders = salesOrderDao.getPPOSOrders(calendar.getTime(), "XA");
        System.out.println("No of Rows = "+pposOrders.size());
        assertTrue(pposOrders.size() >= 0);
//        List<PPOSOrderInfo> someOrders = new ArrayList<PPOSOrderInfo>(4);
//        someOrders.add(pposOrders.get(0));
//        someOrders.add(pposOrders.get(1));
//        someOrders.add(pposOrders.get(2));
//        someOrders.add(pposOrders.get(3));
//        PPOSHelper helper = new PPOSHelper();
//        TransactionInfo tran = new TransactionInfo();
//        tran.setCompanyCode("0062538350000");
//        tran.setName("WINFIELD SOLUTIONS LLC ");
//        tran.setGroupCode("XA");
//        tran.setStartDate(null);
//        tran.setLastTransactionDate(new SimpleDateFormat("MM/dd/yyyy").parse("05/20/2010"));
//        tran.setLastTransactionNumber(0);
//        helper.setSalesOrderDao(salesOrderDao);
//        helper.setPposRequestBuilder(new PPOSRequestBuilder());
//        helper.setClientFactory(new ClientFactory());
//        helper.processCOSOrderReport(tran);
    }

    public void testGetCOSOrders() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2013, 05, 02);
        List<COSOrderInfo> cosOrders = salesOrderDao.getCOSOrders(calendar.getTime(), "XA");
        System.out.println("No of Rows = "+cosOrders.size());
        assertTrue(cosOrders.size() >= 0);
    }
    public void testGetGPOSOrders() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2010, 9, 2);
        List<GPOSOrderInfo> gposOrders = salesOrderDao.getGPOSOrders(calendar.getTime(), "XA");
        System.out.println("No of Rows = "+gposOrders.size());
        assertTrue(gposOrders.size() >= 0);
    }

    public void testGetGPOSDirectOrders() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2013, 05, 02);
        List<GPOSOrderInfo> gposDirectOrders= salesOrderDao.getGPOSDirectOrders(calendar.getTime(), DBConstants.DIRECT_DATA_SOURCE_TYPE);
        System.out.println("No of Rows = "+gposDirectOrders.size());
        assertTrue(gposDirectOrders.size() >= 0);
    }

    public void testGetGPOSXMLOrders() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2013, 05, 02);
        List<GPOSOrderInfo> gposDirectOrders= salesOrderDao.getGPOSXMLOrders(calendar.getTime(), "XA");
        System.out.println("No of Rows = "+gposDirectOrders.size());
        assertTrue(gposDirectOrders.size() >= 0);
    }

    public void testGetGPOSAgrimineOrders() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2013, 04, 02);
        List<GPOSOrderInfo> gposDirectOrders= salesOrderDao.getGPOSAgrimineOrders(calendar.getTime(), "XA");
        System.out.println("No of Rows = "+gposDirectOrders.size());
        assertTrue(gposDirectOrders.size() >= 0);
    }
}

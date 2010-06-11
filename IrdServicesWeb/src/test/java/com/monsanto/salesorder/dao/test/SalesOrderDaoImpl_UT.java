package com.monsanto.salesorder.dao.test;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;
import com.monsanto.irdsoapservices.salesorder.dao.SalesOrderDao;
import com.monsanto.irdsoapservices.salesorder.dao.TransactionDaoImpl;
import com.monsanto.irdsoapservices.salesorder.dao.SalesOrderDaoImpl;
import com.monsanto.irdsoapservices.salesorder.domain.PPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.helper.PPOSHelper;
import com.monsanto.irdsoapservices.salesorder.helper.PPOSRequestBuilder;
import com.monsanto.irdsoapservices.salesorder.client.ClientFactory;

import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 8, 2010
 * Time: 2:21:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class SalesOrderDaoImpl_UT extends AbstractTransactionalDataSourceSpringContextTests {

    SalesOrderDao salesOrderDao;

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
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(2010, 04, 20);
//        List<PPOSOrderInfo> pposOrders = salesOrderDao.getPPOSOrderInfo(calendar.getTime(), "XA");
//        System.out.println("No of Rows = "+pposOrders.size());
//        assertTrue(pposOrders.size() > 0);
//        List<PPOSOrderInfo> someOrders = new ArrayList<PPOSOrderInfo>(4);
//        someOrders.add(pposOrders.get(0));
//        someOrders.add(pposOrders.get(1));
//        someOrders.add(pposOrders.get(2));
//        someOrders.add(pposOrders.get(3));
        PPOSHelper helper = new PPOSHelper();
        TransactionInfo tran = new TransactionInfo();
        tran.setCompanyCode("0062538350000");
        tran.setName("WINFIELD SOLUTIONS LLC ");
        tran.setGroupCode("XA");
        tran.setStartDate(null);
        tran.setLastTransactionDate(new SimpleDateFormat("MM/dd/yyyy").parse("05/20/2010"));
        tran.setLastTransactionNumber(0);
        helper.setSalesOrderDao(salesOrderDao);
        helper.setPposRequestBuilder(new PPOSRequestBuilder());
        helper.setClientFactory(new ClientFactory());
        helper.processPPOSOrderReport(tran);
    }

}

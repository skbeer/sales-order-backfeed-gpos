package com.monsanto.salesorder.dao.test;

import com.monsanto.irdsoapservices.salesorder.dao.DataSummaryDao;
import com.monsanto.irdsoapservices.salesorder.dao.DataSummaryDaoImpl;
import com.monsanto.irdsoapservices.salesorder.dao.SalesOrderDaoImpl;
import com.monsanto.irdsoapservices.salesorder.domain.DataSummaryInfo;
import com.monsanto.irdsoapservices.salesorder.domain.DataSummaryTotals;
import com.monsanto.irdsoapservices.salesorder.domain.GPOSOrderInfo;
import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

import java.util.Calendar;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: caggarw
 * Date: Mar 30, 2012
 * Time: 1:45:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class DataSummaryDaoImpl_UT extends AbstractTransactionalDataSourceSpringContextTests {

    private DataSummaryDao dataSummaryDao;

    @Override
    protected void onSetUp() throws Exception {
        super.onSetUp();
        dataSummaryDao = (DataSummaryDaoImpl)getApplicationContext().getBean("dataSummaryDao");
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[] { "test-irdpos-beans.xml" };
    }

    public void testGetGPOSWinfieldOrdersSalesOrderCount() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2011, 9, 1);
        DataSummaryInfo dataSummaryInfo = dataSummaryDao.getDataSummaryInfoWinfield(calendar.getTime(), "XML", "XML");
        assertTrue(dataSummaryInfo.getTotalLineItems() >= 0);
    }

    public void testGetGPOSDirectOrdersSalesOrderCount() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2011, 9, 1);
        DataSummaryInfo dataSummaryInfo = dataSummaryDao.getDataSummaryInfoDirect(calendar.getTime(), "XML");
        assertTrue(dataSummaryInfo.getTotalLineItems() >= 0);
    }

    public void testGetGPOSWinfieldOrdersTotals() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2011, 9, 1);
        DataSummaryTotals dataSummaryTotals = dataSummaryDao.getDataSummaryTotalsWinfield(calendar.getTime(), "XML", "XML");
        assertNotNull(dataSummaryTotals);
    }

    public void testGetGPOSDirectOrdersTotals() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2011, 9, 1);
        DataSummaryTotals dataSummaryTotals = dataSummaryDao.getDataSummaryTotalsDirect(calendar.getTime(), "XML");
        assertNotNull(dataSummaryTotals);
    }
    
}

package com.monsanto.salesorder.dao.test;

import com.monsanto.irdsoapservices.constants.DBConstants;
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

    public static final int YEAR = 2016;
    public static final int MONTH = 10;
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

    public void testGetGPOSDirectOrdersSalesOrderCount() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR, MONTH, 2);
        DataSummaryInfo dataSummaryInfo = dataSummaryDao.getDataSummaryInfoDirect(calendar.getTime(), "XML");
        assertTrue(dataSummaryInfo.getTotalLineItems() >= 0);
    }

    public void testGetGPOSXMLOrdersSalesOrderCount() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR, MONTH, 2);
        DataSummaryInfo dataSummaryInfo = dataSummaryDao.getDataSummaryInfoXML(calendar.getTime(), "XML");
        assertTrue(dataSummaryInfo.getTotalLineItems() >= 0);
    }

    public void testGetGPOSAgrimineOrdersSalesOrderCount() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR, MONTH, 2);
        DataSummaryInfo dataSummaryInfo = dataSummaryDao.getDataSummaryInfoAgrmine(calendar.getTime(), DBConstants.AGRIMINE_DATA_SOURCE_TYPE);
        assertTrue(dataSummaryInfo.getTotalLineItems() >= 0);
    }

    public void testGetGPOSDirectOrdersTotals() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR, MONTH, 2);
        DataSummaryTotals dataSummaryTotals = dataSummaryDao.getDataSummaryTotalsDirect(calendar.getTime(), "XML");
        assertNotNull(dataSummaryTotals);
    }

    public void testGetGPOSXMLOrdersTotals() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR, MONTH, 2);
        DataSummaryTotals dataSummaryTotals = dataSummaryDao.getDataSummaryTotalsXML(calendar.getTime(), "XML");
        assertNotNull(dataSummaryTotals);
    }

    public void testGetGPOSAgrimineOrdersTotals() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR, MONTH, 2);
        DataSummaryTotals dataSummaryTotals = dataSummaryDao.getDataSummaryTotalsAgrimine(calendar.getTime(), DBConstants.AGRIMINE_DATA_SOURCE_TYPE);
        assertNotNull(dataSummaryTotals);
    }

}

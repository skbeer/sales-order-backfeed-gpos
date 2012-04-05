package com.monsanto.salesorder.helper.test;

import com.monsanto.irdsoapservices.salesorder.dao.DataSummaryDao;
import com.monsanto.irdsoapservices.salesorder.helper.DataSummaryHelper;
import com.monsanto.irdsoapservices.salesorder.helper.DataSummaryRequestBuilder;
import junit.framework.TestCase;
import org.apache.log4j.Logger;
import org.easymock.classextension.EasyMock;

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
    DataSummaryRequestBuilder dataSummaryRequestBuilder;

    @Override
    protected void setUp() throws Exception {
        dataSummaryDao = EasyMock.createMock(DataSummaryDao.class);
        dataSummaryRequestBuilder= EasyMock.createMock(DataSummaryRequestBuilder.class);
        helper.setDataSummaryDao(dataSummaryDao);
        helper.setDataSummaryRequestBuilder(dataSummaryRequestBuilder);
    }

    public void testProcessDataSummaryReport() throws Exception {

    }

    
}

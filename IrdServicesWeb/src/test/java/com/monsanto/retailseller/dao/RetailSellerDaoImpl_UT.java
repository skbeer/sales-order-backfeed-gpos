package com.monsanto.retailseller.dao;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;
import com.monsanto.irdsoapservices.retailseller.dao.RetailSellerDao;
import com.monsanto.irdsoapservices.retailseller.domain.SellerInfo;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 28, 2010
 * Time: 11:19:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class RetailSellerDaoImpl_UT extends AbstractTransactionalDataSourceSpringContextTests {

    RetailSellerDao retailSellerDao;
    TestDataDaoImpl testDataDao;

    @Override
    protected void onSetUp() throws Exception {
        super.onSetUp();
        retailSellerDao = (RetailSellerDao)getApplicationContext().getBean("retailSellerDao");
        testDataDao = (TestDataDaoImpl) getApplicationContext().getBean("testDataDao");
    }

    public void testInsertSellers() throws Exception {
        assertEquals(0, testDataDao.getSellerCount("ABZ"));
        retailSellerDao.insertSellers(getSellerData("ABZ", 2));
        assertEquals(2, testDataDao.getSellerCount("ABZ"));
    }

    private List<SellerInfo> getSellerData(String prefix, int count) {
        List<SellerInfo> sellers = new ArrayList<SellerInfo>();
        for (int index = 0; index < count; index++) {
            SellerInfo sellerInfo =  new SellerInfo();
            sellerInfo.setAliasCode(prefix +index);
            sellerInfo.setRowTaskId("Test");
            sellers.add(sellerInfo);            
        }
        return sellers;
    }


    @Override
    protected String[] getConfigLocations() {
        return new String[] { "test-irdpos-beans.xml" };
    }


}

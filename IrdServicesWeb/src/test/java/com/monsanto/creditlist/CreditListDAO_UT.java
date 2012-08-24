package com.monsanto.creditlist;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;
import com.monsanto.irdsoapservices.creditlist.CreditListDAO;
import com.monsanto.commercial.growercreditlist.domain.GrowerInfo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Aug 7, 2012
 * Time: 10:44:58 AM
 * To change this template use File | Settings | File Templates.
 */
public class CreditListDAO_UT extends AbstractTransactionalDataSourceSpringContextTests {
    CreditListDAO creditListDAO;

    @Override
    protected void onSetUp() throws Exception {
        super.onSetUp();
        creditListDAO = (CreditListDAO) getApplicationContext().getBean("creditListDAO");   
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[] { "test-backfeed-beans.xml" };
    }

    public void testGetGrowerInfo() throws Exception {
        List<GrowerInfo> growerList = creditListDAO.getGrowerList("V9");
        System.out.println("growerList.size() = " + growerList.size());
        assertNotNull(growerList);
    }
}

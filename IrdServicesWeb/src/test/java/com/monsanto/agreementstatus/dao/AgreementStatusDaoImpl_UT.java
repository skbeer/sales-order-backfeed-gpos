package com.monsanto.agreementstatus.dao;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;
import com.monsanto.irdsoapservices.agreementstatus.dao.AgreementStatusDao;
import com.monsanto.irdsoapservices.agreementstatus.domain.AgreementStatusInfo;

import java.util.List;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jul 9, 2010
 * Time: 2:47:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class AgreementStatusDaoImpl_UT extends AbstractTransactionalDataSourceSpringContextTests {
    AgreementStatusDao dao;

    @Override
    protected void onSetUp() throws Exception {
        super.onSetUp();
        dao = (AgreementStatusDao) getApplicationContext().getBean("agreementStatusDao");
    }

    public void testGetAgreementStatus_noData_returnEmptyList() throws Exception {
        List<AgreementStatusInfo> agrStatusList = dao.getAgreementStatusInfo(Arrays.asList(new String[]{"101010"}));
        assertEquals(0, agrStatusList.size());
    }

    public void testGetAgreementStatus_withData_returnList() throws Exception {
        List<AgreementStatusInfo> agrStatusList = dao.getAgreementStatusInfo(Arrays.asList(new String[]{"101010", "216520"}));
        assertTrue(agrStatusList.size()>0);
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[]{"test-backfeed-beans.xml"};
    }
}

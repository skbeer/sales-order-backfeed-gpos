package com.monsanto.agreementstatus.dao;

import com.monsanto.irdsoapservices.agreementstatus.dao.AgreementStatusDao;
import com.monsanto.irdsoapservices.agreementstatus.domain.AgreementStatusInfo;
import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public void testGetAgreementStatus_noData_bigRequest_returnEmptyList() throws Exception {
        List<String> glnList = new ArrayList<String>();
        for (int index = 0; index < 1989; index++) {
            glnList.add(index+"");
        }
        List<AgreementStatusInfo> agrStatusList = dao.getAgreementStatusInfo(glnList);
        assertEquals(0, agrStatusList.size());
    }

    public void testGetAgreementStatus_withData_returnList() throws Exception {
        List<AgreementStatusInfo> agrStatusList = dao.getAgreementStatusInfo(Arrays.asList(new String[]{"101010", "0629245000011"}));
        assertTrue(agrStatusList.size()>0);
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[]{"test-backfeed-beans.xml"};
    }
}

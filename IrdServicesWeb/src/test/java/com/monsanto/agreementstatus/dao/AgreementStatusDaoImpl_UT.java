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
    public void testGetAgreementStatus_emptyData_returnEmptyList() throws Exception {
        List<AgreementStatusInfo> agrStatusList = dao.getAgreementStatusInfo(Arrays.asList(new String[]{}), Arrays.asList(new String[]{}));
        assertEquals(0, agrStatusList.size());
    }
    public void testGetAgreementStatus_noData_returnEmptyList() throws Exception {
        List<AgreementStatusInfo> agrStatusList = dao.getAgreementStatusInfo(Arrays.asList(new String[]{"101010"}), Arrays.asList(new String[]{"101010"}));
        assertEquals(0, agrStatusList.size());
    }

    public void testGetAgreementStatus_noData_bigRequest_returnEmptyList() throws Exception {
        List<String> glnList = new ArrayList<String>();
        for (int index = 0; index < 1989; index++) {
            glnList.add(index+"");
        }
        List<String> absList = new ArrayList<String>();
        for (int index = 0; index < 5032; index++) {
            absList.add("00000");
        }
        List<AgreementStatusInfo> agrStatusList = dao.getAgreementStatusInfo(glnList, absList);
        assertEquals(0, agrStatusList.size());
    }

    public void testGetAgreementStatus_withData_returnList() throws Exception {
        List<AgreementStatusInfo> agrStatusList = dao.getAgreementStatusInfo(Arrays.asList(new String[]{"101010", "0629245000011"}), new ArrayList<String>());
        assertTrue(agrStatusList.size()>0);
    }
    public void testGetAgreementStatus_withData_returnListByABS() throws Exception {
        List<AgreementStatusInfo> agrStatusList = dao.getAgreementStatusInfo(Arrays.asList(new String[]{"101010"}), Arrays.asList(new String[]{"196873"}));
        assertTrue(agrStatusList.size()>0);
    }
    public void testGetAgreementStatus_withData_returnListMAXLOAD() throws Exception {
        List<String> glnList = new ArrayList<String>();
        for (int index = 0; index < 10000; index++) {
            glnList.add("0629245000011");
        }
        List<String> absList = new ArrayList<String>();
        for (int index = 0; index < 10000; index++) {
            absList.add("196873");
        }
        List<AgreementStatusInfo> agrStatusList = dao.getAgreementStatusInfo(glnList, absList);
        assertTrue(agrStatusList.size()>0);
    }
    @Override
    protected String[] getConfigLocations() {
        return new String[]{"test-backfeed-beans.xml"};
    }
}

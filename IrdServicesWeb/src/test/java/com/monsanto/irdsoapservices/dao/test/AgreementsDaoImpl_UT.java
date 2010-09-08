package com.monsanto.irdsoapservices.dao.test;

import com.monsanto.irdsoapservices.dao.AgreementsDao;
import com.monsanto.irdsoapservices.dao.impl.AgreementsDaoImpl;
import com.monsanto.irdsoapservices.schema.AccountTypeAttribute;
import com.monsanto.irdsoapservices.to.AgreementHierarchyInfo;
import com.monsanto.irdsoapservices.to.AgreementInfo;
import com.monsanto.irdsoapservices.to.SignerInformation;
import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 30, 2009
 * Time: 4:31:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class AgreementsDaoImpl_UT extends AbstractTransactionalDataSourceSpringContextTests {
    private AgreementsDao agreementDao;

    public void testGetAgreementsByAccountId_returnAcctId() throws Exception {
        List<AgreementInfo> agreements = agreementDao.getAgreementsByAccountId(2, "ADDM", AccountTypeAttribute.ACCTID.toString());
        assertEquals(1, agreements.size());
        assertAgreementInfo(agreements, 0, 2, 2, "ADDM", "01/01/2010", "12/31/2010", "RVVAMS", "01/14/2008", null, null);
    }

    public void testGetAgreementsByAccountId_returnSAPId() throws Exception {
        List<AgreementInfo> agreements = agreementDao.getAgreementsByAccountId(2, "ADDM", AccountTypeAttribute.SAP.toString());
        assertEquals(1, agreements.size());
        assertAgreementInfo(agreements, 0, 2, 2, "ADDM", "01/01/2010", "12/31/2010", "RVVAMS", "01/14/2008", "0001696477", "0001696477");
    }

    public void testGetAgreementsBySigner_returnAcctId() throws Exception {
        List<AgreementInfo> agreements = agreementDao.getAgreementsBySignerAccountId(5180, "APIT", AccountTypeAttribute.ACCTID.toString());
        assertEquals(1, agreements.size());
        assertAgreementInfo(agreements, 0, 5180, 5180, "APIT", "04/26/2007", "12/31/4712", "AKJACOB", "01/01/2007", null, null);
    }

    public void testGetAgreementsBySigner_returnGLN() throws Exception {
        List<AgreementInfo> agreements = agreementDao.getAgreementsBySignerAccountId(5180, "APIT", AccountTypeAttribute.GLN.toString());
        assertEquals(1, agreements.size());
        assertAgreementInfo(agreements, 0, 5180, 5180, "APIT", "04/26/2007", "12/31/4712", "AKJACOB", "01/01/2007", "0629245000011", "0629245000011");
    }

    public void testUpdateAgreement() throws Exception {
        List<AgreementInfo> agreements = getSALEAgreement("12/31/4712", false);
        AgreementInfo agreementInfo = createUpdateAgreement(agreements, "01/01/2015");
        int updateCount = agreementDao.updateAgreement(agreementInfo);
        assertEquals(1, updateCount);
        agreements = getSALEAgreement("01/01/2015", true);
        agreementInfo = createUpdateAgreement(agreements, "12/31/4712");
        updateCount = agreementDao.updateAgreement(agreementInfo);
        assertEquals(1, updateCount);
        agreements = getSALEAgreement("12/31/4712", true);
    }

    public void testGetAgreementHierarchy_noAgreements_returnBlankList() throws Exception {
        List<AgreementHierarchyInfo> agrHierarchy = agreementDao.getAgreementHierarchy(5180, "MON");
        assertNotNull(agrHierarchy);
        assertEquals(0, agrHierarchy.size());
    }

    public void testGetAgreementHierarchy_withAgreements_returnValidData() throws Exception {
        List<AgreementHierarchyInfo> agrHierarchy = agreementDao.getAgreementHierarchy(1836, "CS");
        assertNotNull(agrHierarchy);
        assertEquals(3, agrHierarchy.size());
        assertAgrementHierarchyInfo(agrHierarchy, 0, "RRSN", "RRSN-Soybean", null, "C08", "N", "Y");
        assertAgrementHierarchyInfo(agrHierarchy, 1, "Z051", "Bean Commercial", "Z05", null, "N", "Y");
        assertAgrementHierarchyInfo(agrHierarchy, 2, "Z052", "Bean Testing", "Z05", null, "N", "Y");
//        assertAgrementHierarchyInfo(agrHierarchy, 0, "RRSN", "RRSN-Soybean", null, "C08", "N", "Y");
//        assertAgrementHierarchyInfo(agrHierarchy, 1, "Z051", "Bean Commercial", "Z05", null, "N", "Y");
//        assertAgrementHierarchyInfo(agrHierarchy, 2, "Z052", "Bean Testing", "Z05", null, "N", "Y");
    }

    public void testGetSignersByAgreementsUnexpiredOnly() throws Exception {
        List<SignerInformation> signers = agreementDao.getSignersByAgreementCode("STA", true);
        assertTrue(signers.size() > 0);
    }

    public void testGetSignersByAgreementsExpiredIncluded() throws Exception {
        List<SignerInformation> signers = agreementDao.getSignersByAgreementCode("STA", false);
        assertTrue(signers.size() > 0);
    }

    public void testGetSignersByAgreementsNoAgreementCodeExpiredIncludedthrowsException() throws Exception {
        try {
        List<SignerInformation> signers = agreementDao.getSignersByAgreementCode(null, false);
        assertTrue(signers.size() > 0);
        fail("Exception should have occurred");
        } catch(Exception e) {
            assertNotNull(e);
        }
    }

    public void testGetSignersByAgreementCodeForExpiredAgreements() throws Exception {
     List<SignerInformation> signers = agreementDao.getSignersByAgreementCodeForExpiredAgreements("STA", new SimpleDateFormat("MM/dd/yyyy").parse("06/11/2003"), new Date());
     assertTrue(signers.size() > 0);
    }

    public void testGetSignersByAgreementCodeForExpiredAgreementsDateInFarFuture() throws Exception {
     List<SignerInformation> signers = agreementDao.getSignersByAgreementCodeForExpiredAgreements("STA", new SimpleDateFormat("MM/dd/yyyy").parse("06/11/9999"), new Date());
     assertTrue(signers.size() == 0);
    }

    public void testGetSignersByAgreementCodeForExpiredAgreementsEmptyAgreementCode() throws Exception {
     List<SignerInformation> signers = agreementDao.getSignersByAgreementCodeForExpiredAgreements("", new SimpleDateFormat("MM/dd/yyyy").parse("06/11/9999"), new Date());
     assertTrue(signers.size() == 0);
    }

    public void testGetSignersByAgreementCodeForExpiredAgreementsNoAgreementCodeThrowsException() throws Exception {
     try {
        List<SignerInformation> signers = agreementDao.getSignersByAgreementCodeForExpiredAgreements(null, new SimpleDateFormat("MM/dd/yyyy").parse("06/11/9999"), new Date());
        assertTrue(signers.size() == 0);
        fail("Exception should have occurred");
        } catch(Exception e) {
            assertNotNull(e);
        }
    }

    private void assertAgrementHierarchyInfo(List<AgreementHierarchyInfo> agrHierarchy, int index, String agrCode, String agrDescr, Object commercialAgr, String monTraitAgr, String cornFlag, String soyFlag) {
        AgreementHierarchyInfo agrInfo = agrHierarchy.get(index);
        assertNotNull(agrInfo);
        assertEquals(agrCode, agrInfo.getAgreementCode());
        assertEquals(agrDescr, agrInfo.getAgreementDescr());
        assertEquals(commercialAgr, agrInfo.getCommercialAgreement());
        assertEquals(monTraitAgr, agrInfo.getMonsantoTraitAgreement());
        assertEquals(cornFlag, agrInfo.getCornAgreementFlag());
        assertEquals(soyFlag, agrInfo.getSoybeanAgreementFlag());
    }

    private List<AgreementInfo> getSALEAgreement(String endDate, boolean assertEndDate) throws Exception {
        List<AgreementInfo> agreements = agreementDao.getAgreementsByAccountId(5180, "SALE", AccountTypeAttribute.ACCTID.toString());
        assertEquals(1, agreements.size());
        if(assertEndDate) {
            assertAgreementInfo(agreements, 0, 5180, 5180, "SALE", "06/11/2003", endDate, "IRDPOS_USER", "04/15/2009", null, null);
        }
        return agreements;
    }

    private AgreementInfo createUpdateAgreement(List<AgreementInfo> agreements, String endDate) throws ParseException {
        AgreementInfo agreementInfo = agreements.get(0);
        agreementInfo.setEndDate(new SimpleDateFormat("MM/dd/yyyy").parse(endDate));
        agreementInfo.setRowUserId("IRDPOS_USER");
        agreementInfo.setRowTaskId("IrdSoapServices");
        agreementInfo.setRowModifyDate(new Date());
        return agreementInfo;
    }

    private void assertAgreementInfo(List<AgreementInfo> agreements, int index, int accountId, int signerAcctId, String agrCode, String beginDate, String endDate, String rowUserId, String lastModifyDate, Object acctAliasId, Object signerAliasId) throws Exception {
        String dateFormat = "MM/dd/yyyy";
        AgreementInfo agrInfo = agreements.get(index);
        assertNotNull(agrInfo);
        System.out.println(agrInfo);
        assertEquals(accountId, agrInfo.getAccountId());
        assertEquals(signerAcctId, agrInfo.getSignerAccountId());
        assertEquals(agrCode, agrInfo.getAgreementCode());
        assertEquals(endDate, new SimpleDateFormat(dateFormat).format(agrInfo.getEndDate()));
        assertEquals(rowUserId, agrInfo.getRowUserId());
        assertTrue(new SimpleDateFormat(dateFormat).parse(lastModifyDate).compareTo(agrInfo.getRowModifyDate())<=0);
        assertEquals(acctAliasId, agrInfo.getAccountAliasId());
        assertEquals(signerAliasId, agrInfo.getSignerAliasId());        
    }

    @Override
    protected void onSetUp() throws Exception {
        super.onSetUp();
        agreementDao = (AgreementsDaoImpl)getApplicationContext().getBean("agreementDao");
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[] { "test-irdpos-beans.xml" };
    }
    
}

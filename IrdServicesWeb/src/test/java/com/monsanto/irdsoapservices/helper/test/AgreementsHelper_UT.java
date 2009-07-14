package com.monsanto.irdsoapservices.helper.test;

import com.monsanto.irdsoapservices.dao.AgreementsDao;
import com.monsanto.irdsoapservices.to.AgreementInfo;
import com.monsanto.irdsoapservices.to.AgreementHierarchyInfo;
import com.monsanto.irdsoapservices.helper.AgreementsHelper;
import com.monsanto.irdsoapservices.agreements.schema.*;
import com.monsanto.irdsoapservices.test.BaseTestCase;
import com.monsanto.irdsoapservices.service.AccountAgreementsFault;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Mar 31, 2009
 * Time: 2:19:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class AgreementsHelper_UT extends BaseTestCase {
    AgreementsHelper helper = new AgreementsHelper();
    GetAgreementsRequestType request = new GetAgreementsRequestType();
    MockAgreementsDao agrDao = null;

    @Override
    protected void doSetUp() throws Exception {
        agrDao = new MockAgreementsDao();
        helper.setAgreementsDao(agrDao);
        GetAgreementsRequestBodyType requestBody = new GetAgreementsRequestBodyType();
        requestBody.setAgreementCode("ABC");
        requestBody.setAccountIdentifier(getAccountIdentifier(new Long(123)));
        request.setHeader(getValidHeader("ABC123", "A_PARTNER"));
        request.setGetAgreementsRequestBody(requestBody);
    }

    public void testGetAgreements_invalidRequest_throwError() {
        request.getGetAgreementsRequestBody().setAccountIdentifier(null);
        try {
            helper.getAgreements(request);
            fail("exception shoudl have occurred");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void testGetAgreements_invalidRequest_badHeader_throwError() {
        request.getHeader().setDocumentIdentifier(null);
        try {
            helper.getAgreements(request);
            fail("exception shoudl have occurred");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void testGetAgreements_byAccountId() throws Exception {
        GetAgreementsResponseType response = helper.getAgreements(request);
        assertNotNull(response);
        assertNotNull(response.getGetAgreementsResponseBody().getAgreementInformation());
        assertHeader(response.getHeader(), "ABC123", "A_PARTNER");
        assertTrue(agrDao.isGetByAccountIdCalled);
        assertFalse(agrDao.isGetBySignerAccountIdCalled);        
    }

    public void testGetAgreements_bySignerAccountId() throws Exception {
        request.getGetAgreementsRequestBody().setAccountIdentifier(null);
        request.getGetAgreementsRequestBody().setSignerAccountIdentifier(getAccountIdentifier(new Long(123)));
        GetAgreementsResponseType response = helper.getAgreements(request);
        assertNotNull(response);
        assertNotNull(response.getGetAgreementsResponseBody().getAgreementInformation());
        assertHeader(response.getHeader(), "ABC123", "A_PARTNER");
        assertTrue(agrDao.isGetBySignerAccountIdCalled);
        assertFalse(agrDao.isGetByAccountIdCalled);        
    }

    public void testGetAgreementHierarchy_invalidRequest_returnFault() {
        try {
            GetAgreementHierarchyResponseType response = helper.getAgreementHierarchy(getAgreementHierarchyRequest(false));
            fail("Exception should have occurred");
        } catch (Exception e) {
            assertTrue(e instanceof AccountAgreementsFault);
            assertEquals("Error occurred during operation: getAgreementHierarchy", e.getMessage());
            assertTrue(e.getCause().toString().endsWith("Received in-complete GetAgreementHierarchyRequest object"));
        }
    }

    public void testGetAgreementHierarchy_noData_returnBlankResponse() throws Exception {
        agrDao.returnHierarchyData = false;
        GetAgreementHierarchyResponseType response = helper.getAgreementHierarchy(getAgreementHierarchyRequest(true));
        assertHierarchyResponse(response, 0);
    }

    public void testGetAgreementHierarchy_withData_returnValidResponse() throws Exception {
        GetAgreementHierarchyResponseType response = helper.getAgreementHierarchy(getAgreementHierarchyRequest(true));
        assertHierarchyResponse(response, 2);
        List<AgreementCategoryType> categories = response.getGetAgreementHierarchyResponseBody().getAgreementCategory();
        assertAgrCategories(categories, 0, "MONSANTO_TRAIT_AGREEMENT", "MT01", "MT02");
        assertAgrCategories(categories, 1, "COMMERCIAL_AGREEMENT", "CM01", "CM02");
    }

    private void assertAgrCategories(List<AgreementCategoryType> categories, int categoryIndex, String categoryName, String cornAgrCode, String soyAgrCode) {
        AgreementCategoryType commCategory = categories.get(categoryIndex);
        assertEquals(categoryName, commCategory.getCategoryName().toString());
        List<AgreementsBySpecieType> agrsBySpecie = commCategory.getAgreementsBySpecie();
        assertEquals(2, agrsBySpecie.size());
        assertAgrBySpecie(agrsBySpecie, 0, "CORN", cornAgrCode);
        assertAgrBySpecie(agrsBySpecie, 1, "SOYBEAN", soyAgrCode);
    }

    private void assertAgrBySpecie(List<AgreementsBySpecieType> agrsBySpecie, int agrBySpecieIndex, String specieName, String firstAgrCode) {
        assertEquals(specieName, agrsBySpecie.get(agrBySpecieIndex).getSpecieName().toString());
        assertAgreementList(agrsBySpecie, agrBySpecieIndex, 1, 0, firstAgrCode, "Agreement "+firstAgrCode);
    }

    private void assertAgreementList(List<AgreementsBySpecieType> agrsBySpecie, int specieIndex, int agrCount, int agrIndex, String agrCode, String agrDescr) {
        List<AgreementType> agrList = agrsBySpecie.get(specieIndex).getAgreement();
        assertEquals(agrCount, agrList.size());
        assertEquals(agrCode, agrList.get(agrIndex).getAgreementCode());
        assertEquals(agrDescr, agrList.get(agrIndex).getAgreementDescr());
    }

    private AccountIdentifierType getAccountIdentifier(Long number) {
        AccountIdentifierType acctIdentifier = null;
        if(number != null) {
            acctIdentifier = new AccountIdentifierType();
            acctIdentifier.setType(AccountTypeAttribute.ACCTID);
            acctIdentifier.setValue(number.toString());
        }
        return acctIdentifier;
    }


    private void assertHierarchyResponse(GetAgreementHierarchyResponseType response, int expectedSize) {
        assertNotNull(response);
        assertNotNull(response.getHeader());
        assertNotNull(response.getGetAgreementHierarchyResponseBody());
        assertNotNull(response.getGetAgreementHierarchyResponseBody().getAgreementCategory());
        assertEquals(expectedSize, response.getGetAgreementHierarchyResponseBody().getAgreementCategory().size());
    }

    private GetAgreementHierarchyRequestType getAgreementHierarchyRequest(boolean isValid) throws Exception {
        GetAgreementHierarchyRequestType request = new GetAgreementHierarchyRequestType();
        GetAgreementHierarchyRequestBodyType requestBody = new GetAgreementHierarchyRequestBodyType();
        requestBody.setAccountId(1010);
        if(isValid) {
            requestBody.setAgreementLicensedBy(LicensedByType.CS);
        }
        request.setGetAgreementHierarchyRequestBody(requestBody);
        request.setHeader(getValidHeader("1010", "CS"));
        return request;
    }

    class MockAgreementsDao implements AgreementsDao {
        public boolean isGetByAccountIdCalled = false;
        public boolean isGetBySignerAccountIdCalled = false;
        public boolean isGetAgrHierarchyCalled = false;
        public boolean returnHierarchyData = true;

        public List<AgreementInfo> getAgreementsByAccountId(long acctId, String agreementCode, String accountType) throws Exception {
            isGetByAccountIdCalled = true;
            return new ArrayList<AgreementInfo>();
        }

        public List<AgreementInfo> getAgreementsBySignerAccountId(long signerAcctId, String agreementCode, String accountType) throws Exception {
            isGetBySignerAccountIdCalled = true;
            return new ArrayList<AgreementInfo>();
        }

        public int updateAgreement(AgreementInfo agreementInfo) throws Exception {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }

        public long getAccountIdByAlias(String aliasType, String aliasId) throws Exception {
            return 0;  //To change body of implemented methods use File | Settings | File Templates.
        }

        public List<AgreementHierarchyInfo> getAgreementHierarchy(long accountId, String licensedBy) throws Exception {
            List<AgreementHierarchyInfo> agrs = new ArrayList<AgreementHierarchyInfo>();
            if(returnHierarchyData) {
                agrs.add(getAgrInfo("CM01", "Z01", null, "Y", "N"));
                agrs.add(getAgrInfo("CM02", "Z01", null, "N", "Y"));
                agrs.add(getAgrInfo("MT01", null, "Y01", "Y", "N"));
                agrs.add(getAgrInfo("MT02", null, "Y02", "N", "Y"));
            }
            return agrs;
        }

        private AgreementHierarchyInfo getAgrInfo(String agreementCode, String commercialAgreement, String monsantoTraitAgreement, String cornAgreementFlag, String soybeanAgreementFlag) {
            AgreementHierarchyInfo agrInfo = new AgreementHierarchyInfo();
            agrInfo.setAgreementCode(agreementCode);
            agrInfo.setAgreementDescr("Agreement "+agreementCode);
            agrInfo.setCommercialAgreement(commercialAgreement);
            agrInfo.setMonsantoTraitAgreement(monsantoTraitAgreement);
            agrInfo.setCornAgreementFlag(cornAgreementFlag);
            agrInfo.setSoybeanAgreementFlag(soybeanAgreementFlag);
            return agrInfo;
        }
    }


}
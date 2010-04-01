package com.monsanto.irdsoapservices.helper.test;

import com.monsanto.irdsoapservices.agreements.schema.*;
import com.monsanto.irdsoapservices.dao.AgreementsDao;
import com.monsanto.irdsoapservices.dao.IrdDao;
import com.monsanto.irdsoapservices.helper.AgreementsHelper;
import com.monsanto.irdsoapservices.service.AccountAgreementsFault;
import com.monsanto.irdsoapservices.test.BaseTestCase;
import com.monsanto.irdsoapservices.to.AgreementHierarchyInfo;
import com.monsanto.irdsoapservices.to.AgreementInfo;
import com.monsanto.irdsoapservices.to.SignerInformation;
import com.monsanto.irdsoapservices.utils.XmlDateTimeUtil;
import com.monsanto.isdcommon.header.schema.HeaderType;
import com.monsanto.isdcommon.header.schema.PartnerIdentifierType;
import com.monsanto.isdcommon.header.schema.PartnerTypeAttribute;
import org.easymock.EasyMock;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    // Some of the UTs in this class were written without Easymock.
    // Below are new instances of AgreementsHelper and the DAO classes using EasyMock.
    AgreementsHelper agreementsHelper = null;
    AgreementsDao agreementsDao = null;
    IrdDao irdDao = null;

    @Override
    protected void doSetUp() throws Exception {
        agrDao = new MockAgreementsDao();
        helper.setAgreementsDao(agrDao);
        GetAgreementsRequestBodyType requestBody = new GetAgreementsRequestBodyType();
        requestBody.setAgreementCode("ABC");
        requestBody.setAccountIdentifier(getAccountIdentifier(new Long(123)));
        request.setHeader(getValidHeader("ABC123", "A_PARTNER"));
        request.setGetAgreementsRequestBody(requestBody);
        // init EasyMock classes
        agreementsHelper = new AgreementsHelper();
        agreementsDao = EasyMock.createMock(AgreementsDao.class);
        irdDao = EasyMock.createMock(IrdDao.class);
        agreementsHelper.setAgreementsDao(agreementsDao);
        agreementsHelper.setIrdDao(irdDao);
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
//
//    public void testGetAgreements_byAccountId() throws Exception {
//        GetAgreementsResponseType response = helper.getAgreements(request);
//        assertNotNull(response);
//        assertNotNull(response.getGetAgreementsResponseBody().getAgreementInformation());
//        assertHeader(response.getHeader(), "ABC123", "A_PARTNER");
//        assertTrue(agrDao.isGetByAccountIdCalled);
//        assertFalse(agrDao.isGetBySignerAccountIdCalled);
//    }
//
//    public void testGetAgreements_bySignerAccountId() throws Exception {
//        request.getGetAgreementsRequestBody().setAccountIdentifier(null);
//        request.getGetAgreementsRequestBody().setSignerAccountIdentifier(getAccountIdentifier(new Long(123)));
//        GetAgreementsResponseType response = helper.getAgreements(request);
//        assertNotNull(response);
//        assertNotNull(response.getGetAgreementsResponseBody().getAgreementInformation());
//        assertHeader(response.getHeader(), "ABC123", "A_PARTNER");
//        assertTrue(agrDao.isGetBySignerAccountIdCalled);
//        assertFalse(agrDao.isGetByAccountIdCalled);
//    }

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

    public void testUpdateAgreements_invalidRequest_throwException() {
        try {
            agreementsHelper.updateAgreement(new UpdateAgreementRequestType());
            fail("Exception should have occurred");
        } catch (AccountAgreementsFault accountAgreementsFault) {
            System.out.println(accountAgreementsFault.getMessage());
        }
    }

    public void testUpdateAgreements_missingEndDateInRequest_throwException() {
        try {
            agreementsHelper.updateAgreement(getUpdateAgreementRequestType(false, AccountTypeAttribute.ACCTID, "1234", new Date()));
            fail("Exception should have occurred");
        } catch (Exception accountAgreementsFault) {
            System.out.println(accountAgreementsFault.getMessage());
        }
    }

    public void testUpdateAgreements_withAcctId_callUpdateMethod() throws Exception {
        Date endDate = new Date();
        EasyMock.expect(agreementsDao.updateAgreement((AgreementInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.replay(agreementsDao);
        UpdateAgreementResponseType response = agreementsHelper.updateAgreement(getUpdateAgreementRequestType(true, AccountTypeAttribute.ACCTID, "1234", endDate));
        EasyMock.verify(agreementsDao);
        assertNotNull(response);
        assertNotNull(response.getHeader());
        assertEquals("Success", response.getUpdateAgreementResponseBody().getStatus());
    }

    public void testUpdateAgreements_withSapId_maptoAcctId_and_callUpdateMethod() throws Exception {
        Date endDate = new Date();
        EasyMock.expect(irdDao.getAccountIdByAlias("SAP", "1234")).andReturn(1234L);
        EasyMock.expect(agreementsDao.updateAgreement((AgreementInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.replay(agreementsDao);
        EasyMock.replay(irdDao);
        UpdateAgreementResponseType response = agreementsHelper.updateAgreement(getUpdateAgreementRequestType(true, AccountTypeAttribute.SAP, "1234", endDate));
        EasyMock.verify(agreementsDao);
        EasyMock.verify(irdDao);
        assertNotNull(response);
        assertNotNull(response.getHeader());
        assertEquals("Success", response.getUpdateAgreementResponseBody().getStatus());
    }

    public void testUpdateAgreements_withSapId_cannotFindMatchingAcctId_throwException() throws Exception {
        Date endDate = new Date();
        EasyMock.expect(irdDao.getAccountIdByAlias("SAP", "1234")).andReturn(0L);
        EasyMock.replay(irdDao);
        UpdateAgreementResponseType response = null;
        try {
            response = agreementsHelper.updateAgreement(getUpdateAgreementRequestType(true, AccountTypeAttribute.SAP, "1234", endDate));
            fail("Exception should have occurred");
        } catch (Exception e) {
            assertEquals("Error occurred during operation: updateAgreement", e.getMessage());
        }
        EasyMock.verify(irdDao);
    }

    public void testGetAgreements_byAccount_ACCTID_returnValidResponse() throws Exception {
        EasyMock.expect(agreementsDao.getAgreementsByAccountId(1234, "STA", "ACCTID")).andReturn(getExpectedAgreements());
        EasyMock.replay(agreementsDao);
        GetAgreementsResponseType responseType = agreementsHelper.getAgreements(getAgreementRequest(true, AccountTypeAttribute.ACCTID));
        EasyMock.verify(agreementsDao);
        assertNotNull(responseType.getHeader());
        assertEquals(1, responseType.getGetAgreementsResponseBody().getAgreementInformation().size());
        assertEquals("ACCTID", responseType.getGetAgreementsResponseBody().getAgreementInformation().get(0).getAccountIdentifier().getType().toString());
        assertEquals("1234", responseType.getGetAgreementsResponseBody().getAgreementInformation().get(0).getAccountIdentifier().getValue());
    }

    public void testGetAgreements_byAccount_SAPID_returnValidResponse() throws Exception {
        EasyMock.expect(irdDao.getAccountIdByAlias("SAP", "1234")).andReturn(5678L);
        EasyMock.expect(agreementsDao.getAgreementsByAccountId(5678, "STA", "SAP")).andReturn(getExpectedAgreements());
        EasyMock.replay(agreementsDao);
        EasyMock.replay(irdDao);
        GetAgreementsResponseType responseType = agreementsHelper.getAgreements(getAgreementRequest(true, AccountTypeAttribute.SAP));
        EasyMock.verify(irdDao);
        EasyMock.verify(agreementsDao);
        assertNotNull(responseType.getHeader());
        assertEquals(1, responseType.getGetAgreementsResponseBody().getAgreementInformation().size());
        assertEquals("SAP", responseType.getGetAgreementsResponseBody().getAgreementInformation().get(0).getAccountIdentifier().getType().toString());
        assertEquals("5678", responseType.getGetAgreementsResponseBody().getAgreementInformation().get(0).getAccountIdentifier().getValue());
    }

    public void testGetAgreements_bySignerAccount_ACCTID_returnValidResponse() throws Exception {
        EasyMock.expect(agreementsDao.getAgreementsBySignerAccountId(1234, "STA", "ACCTID")).andReturn(getExpectedAgreements());
        EasyMock.replay(agreementsDao);
        GetAgreementsResponseType responseType = agreementsHelper.getAgreements(getAgreementRequest(false, AccountTypeAttribute.ACCTID));
        EasyMock.verify(agreementsDao);
        assertNotNull(responseType.getHeader());
        assertEquals(1, responseType.getGetAgreementsResponseBody().getAgreementInformation().size());
        assertEquals("ACCTID", responseType.getGetAgreementsResponseBody().getAgreementInformation().get(0).getAccountIdentifier().getType().toString());
        assertEquals("1234", responseType.getGetAgreementsResponseBody().getAgreementInformation().get(0).getAccountIdentifier().getValue());
    }

    public void testGetAgreements_bySignerAccount_SAPID_returnValidResponse() throws Exception {
        EasyMock.expect(irdDao.getAccountIdByAlias("SAP", "1234")).andReturn(5678L);
        EasyMock.expect(agreementsDao.getAgreementsBySignerAccountId(5678, "STA", "SAP")).andReturn(getExpectedAgreements());
        EasyMock.replay(agreementsDao);
        EasyMock.replay(irdDao);
        GetAgreementsResponseType responseType = agreementsHelper.getAgreements(getAgreementRequest(false, AccountTypeAttribute.SAP));
        EasyMock.verify(irdDao);
        EasyMock.verify(agreementsDao);
        assertNotNull(responseType.getHeader());
        assertEquals(1, responseType.getGetAgreementsResponseBody().getAgreementInformation().size());
        assertEquals("SAP", responseType.getGetAgreementsResponseBody().getAgreementInformation().get(0).getAccountIdentifier().getType().toString());
        assertEquals("5678", responseType.getGetAgreementsResponseBody().getAgreementInformation().get(0).getAccountIdentifier().getValue());
    }

    public void testGetSignersByAgreements_invalidRequest_throwError() throws Exception {
        GetSignersForAgreementsRequestType signersRequest = new GetSignersForAgreementsRequestType();
        GetSignersForAgreementsRequestBodyType  signersRequestBody = new GetSignersForAgreementsRequestBodyType();
        signersRequestBody.setAgreementCode(null);
        signersRequest.setGetSignersForAgreementsRequestBody(signersRequestBody);

        signersRequest.setHeader(getValidHeader("ABC123", "A_PARTNER"));

        // init EasyMock classes
        agreementsHelper = new AgreementsHelper();
        agreementsDao = EasyMock.createMock(AgreementsDao.class);
        irdDao = EasyMock.createMock(IrdDao.class);
        agreementsHelper.setAgreementsDao(agreementsDao);
        agreementsHelper.setIrdDao(irdDao);

        try {
            helper.getSignersForAgreements(signersRequest);
            fail("exception shoudl have occurred");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void testGetSignersByAgreements_invalidRequest_badHeader_throwError() throws Exception{

        GetSignersForAgreementsRequestType signersRequest = new GetSignersForAgreementsRequestType();
        GetSignersForAgreementsRequestBodyType  signersRequestBody = new GetSignersForAgreementsRequestBodyType();
        signersRequestBody.setAgreementCode(null);
        signersRequest.setGetSignersForAgreementsRequestBody(signersRequestBody);

        signersRequest.setHeader(getValidHeader("ABC123", "A_PARTNER"));
        signersRequest.getHeader().setDocumentIdentifier(null);
        // init EasyMock classes
        agreementsHelper = new AgreementsHelper();
        agreementsDao = EasyMock.createMock(AgreementsDao.class);
        irdDao = EasyMock.createMock(IrdDao.class);
        agreementsHelper.setAgreementsDao(agreementsDao);
        agreementsHelper.setIrdDao(irdDao);

        try {
            helper.getSignersForAgreements(signersRequest);
            fail("exception shoudl have occurred");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void testGetSignersByAgreements_ValidRequest() throws Exception{

        GetSignersForAgreementsRequestType signersRequest = new GetSignersForAgreementsRequestType();
        GetSignersForAgreementsRequestBodyType  signersRequestBody = new GetSignersForAgreementsRequestBodyType();
        signersRequestBody.setAgreementCode("STA");
        signersRequest.setGetSignersForAgreementsRequestBody(signersRequestBody);

        signersRequest.setHeader(getValidHeader("ABC123", "A_PARTNER"));
        // init EasyMock classes
        agreementsHelper = new AgreementsHelper();
        agreementsDao = EasyMock.createMock(AgreementsDao.class);
        irdDao = EasyMock.createMock(IrdDao.class);
        agreementsHelper.setAgreementsDao(agreementsDao);
        agreementsHelper.setIrdDao(irdDao);

        GetSignersForAgreementsResponseType signersWithAgreements = helper.getSignersForAgreements(signersRequest);
        List<SignerInformationType> signersInformation = signersWithAgreements.getGetSignersForAgreementsResponseBody().getSignerInformation();
        SignerInformationType signer = signersInformation.get(0);
        assertEquals("Joe Signer", signer.getSignerAccountName());
        assertEquals("1234", signer.getSignerAccountIdentifier().getValue());
        assertEquals("0001234000", signer.getSignerAliasIdentifier().getValue());
        AddressInformationType address = signer.getAddressInformation();
        assertEquals("123 Main Street", address.getAddressLine().get(0));
        assertEquals("Rolla", address.getCityName());
        assertEquals("56780", address.getPostalCode());
        assertEquals("MO", address.getStateOrProvince());
    }

    public void testGetSignersByAgreements_ValidRequestUnexpiredAgreementsOnly() throws Exception{

        GetSignersForAgreementsRequestType signersRequest = new GetSignersForAgreementsRequestType();
        GetSignersForAgreementsRequestBodyType  signersRequestBody = new GetSignersForAgreementsRequestBodyType();
        signersRequestBody.setAgreementCode("STA");
        signersRequestBody.setSendOnlyUnexpiredAgreement(true);
        signersRequest.setGetSignersForAgreementsRequestBody(signersRequestBody);

        signersRequest.setHeader(getValidHeader("ABC123", "A_PARTNER"));
        // init EasyMock classes
        agreementsHelper = new AgreementsHelper();
        agreementsDao = EasyMock.createMock(AgreementsDao.class);
        irdDao = EasyMock.createMock(IrdDao.class);
        agreementsHelper.setAgreementsDao(agreementsDao);
        agreementsHelper.setIrdDao(irdDao);

        GetSignersForAgreementsResponseType signersWithAgreements = helper.getSignersForAgreements(signersRequest);
        List<SignerInformationType> signersInformation = signersWithAgreements.getGetSignersForAgreementsResponseBody().getSignerInformation();
        assertTrue(signersInformation.isEmpty());
    }


    public void testGetSignersForExpiredAgreements_invalidRequest_throwsError() throws Exception {
        GetSignersForExpiredAgreementsRequestType signersRequest = new GetSignersForExpiredAgreementsRequestType();
        GetSignersForExpiredAgreementsRequestBodyType  signersRequestBody = new GetSignersForExpiredAgreementsRequestBodyType();
        signersRequestBody.setAgreementCode(null);
        signersRequestBody.setBeginDate(null);
        signersRequestBody.setEndDate(null);
        signersRequest.setGetSignersForExpiredAgreementsRequestBody(signersRequestBody);

        signersRequest.setHeader(getValidHeader("ABC123", "A_PARTNER"));

        // init EasyMock classes
        agreementsHelper = new AgreementsHelper();
        agreementsDao = EasyMock.createMock(AgreementsDao.class);
        irdDao = EasyMock.createMock(IrdDao.class);
        agreementsHelper.setAgreementsDao(agreementsDao);
        agreementsHelper.setIrdDao(irdDao);

        try {
            helper.getSignersForExpiredAgreements(signersRequest);
            fail("exception should have occurred");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void testGetSignersForExpiredAgreements_invalidRequest_BadHeader_throwsError() throws Exception {
        GetSignersForExpiredAgreementsRequestType signersRequest = new GetSignersForExpiredAgreementsRequestType();
        GetSignersForExpiredAgreementsRequestBodyType  signersRequestBody = new GetSignersForExpiredAgreementsRequestBodyType();
        signersRequestBody.setAgreementCode(null);
        signersRequestBody.setBeginDate(null);
        signersRequestBody.setEndDate(null);
        signersRequest.setGetSignersForExpiredAgreementsRequestBody(signersRequestBody);

        signersRequest.setHeader(getValidHeader("ABC123", "A_PARTNER"));
        signersRequest.getHeader().setDocumentIdentifier(null);

        // init EasyMock classes
        agreementsHelper = new AgreementsHelper();
        agreementsDao = EasyMock.createMock(AgreementsDao.class);
        irdDao = EasyMock.createMock(IrdDao.class);
        agreementsHelper.setAgreementsDao(agreementsDao);
        agreementsHelper.setIrdDao(irdDao);

        try {
            helper.getSignersForExpiredAgreements(signersRequest);
            fail("exception should have occurred");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void testGetSignersForExpiredAgreements_ValidRequest() throws Exception {
        GetSignersForExpiredAgreementsRequestType signersRequest = new GetSignersForExpiredAgreementsRequestType();
        GetSignersForExpiredAgreementsRequestBodyType  signersRequestBody = new GetSignersForExpiredAgreementsRequestBodyType();
        signersRequestBody.setAgreementCode("STA");
        signersRequestBody.setBeginDate(XmlDateTimeUtil.transformToXmlGregorianCalendar(new SimpleDateFormat("MM/dd/yyyy").parse("06/11/2003")));
        signersRequestBody.setEndDate(XmlDateTimeUtil.transformToXmlGregorianCalendar(new Date()));
        signersRequest.setGetSignersForExpiredAgreementsRequestBody(signersRequestBody);

        signersRequest.setHeader(getValidHeader("ABC123", "A_PARTNER"));

        // init EasyMock classes
        agreementsHelper = new AgreementsHelper();
        agreementsDao = EasyMock.createMock(AgreementsDao.class);
        irdDao = EasyMock.createMock(IrdDao.class);
        agreementsHelper.setAgreementsDao(agreementsDao);
        agreementsHelper.setIrdDao(irdDao);

        GetSignersForExpiredAgreementsResponseType signersWithAgreements = helper.getSignersForExpiredAgreements(signersRequest);
        List<SignerInformationType> signersInformation = signersWithAgreements.getGetSignersForExpiredAgreementsResponseBody().getSignerInformation();
        SignerInformationType signer = signersInformation.get(0);
        assertEquals("Joe Signer", signer.getSignerAccountName());
        assertEquals("1234", signer.getSignerAccountIdentifier().getValue());
        assertEquals("0001234000", signer.getSignerAliasIdentifier().getValue());
        AddressInformationType address = signer.getAddressInformation();
        assertEquals("123 Main Street", address.getAddressLine().get(0));
        assertEquals("Rolla", address.getCityName());
        assertEquals("56780", address.getPostalCode());
        assertEquals("MO", address.getStateOrProvince());
    }

    private List<AgreementInfo> getExpectedAgreements() {
        List<AgreementInfo> agreementList = new ArrayList<AgreementInfo>();
        AgreementInfo agreementInfo = new AgreementInfo();
        agreementInfo.setAccountId(1234);
        agreementInfo.setAccountAliasId("5678");
        agreementInfo.setAgreementCode("STA");
        agreementInfo.setBeginDate(new Date());
        agreementInfo.setEndDate(new Date());
        agreementList.add(agreementInfo);
        return agreementList;
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

    private UpdateAgreementRequestType getUpdateAgreementRequestType(boolean isValid, AccountTypeAttribute idType, String idValue, Date endDate) throws Exception {
        UpdateAgreementRequestType updateRequest = new UpdateAgreementRequestType();
        UpdateAgreementRequestBodyType requestBody = new UpdateAgreementRequestBodyType();
        AccountIdentifierType acctIdentifier = new AccountIdentifierType();
        acctIdentifier.setType(idType);
        acctIdentifier.setValue(idValue);
        requestBody.setAccountIdentifier(acctIdentifier);
        requestBody.setAgreementCode("STA");
        if(isValid) {
            requestBody.setEndDate(XmlDateTimeUtil.transformToXmlGregorianCalendar(endDate));
        }
        HeaderType header = getValidHeader("1010", "IRDServices_Test");
        PartnerIdentifierType fromPartner = new PartnerIdentifierType();
        fromPartner.setType(PartnerTypeAttribute.USER_ID);
        fromPartner.setValue("MKUCHIP");
        header.getFrom().setPartnerIdentifier(fromPartner);
        updateRequest.setHeader(header);
        updateRequest.setUpdateAgreementRequestBody(requestBody);
        return updateRequest;
    }

    public GetAgreementsRequestType getAgreementRequest(boolean byAccountId, AccountTypeAttribute identifierType) throws Exception {
        GetAgreementsRequestType request = new GetAgreementsRequestType();
        GetAgreementsRequestBodyType requestBody = new GetAgreementsRequestBodyType();
        requestBody.setAgreementCode("STA");
        AccountIdentifierType acctIdentifier = new AccountIdentifierType();
        acctIdentifier.setType(identifierType);
        acctIdentifier.setValue("1234");
        if(byAccountId) {
            requestBody.setAccountIdentifier(acctIdentifier);
        } else {
            requestBody.setSignerAccountIdentifier(acctIdentifier);
        }
        request.setHeader(getValidHeader("1010", "Test"));
        request.setGetAgreementsRequestBody(requestBody);
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

        public List<SignerInformation> getSignersByAgreementCode(String agreementCode, boolean unexpiredAgreementsOnly) throws Exception {
            List<SignerInformation> signers = new ArrayList<SignerInformation>();
            if("STA".equalsIgnoreCase(agreementCode) && !unexpiredAgreementsOnly) {
                SignerInformation signerOne = new SignerInformation();
                signerOne.setSignerAccountId(1234);
                signerOne.setSignerAccountName("Joe Signer");
                signerOne.setAddressLine("123 Main Street");
                signerOne.setCityName("Rolla");
                signerOne.setPostalCode("56780");
                signerOne.setSignerAliasId("0001234000");
                signerOne.setStateOrProvince("MO");
                signers.add(signerOne);
            }
            return signers;
        }

        public List<SignerInformation> getSignersByAgreementCodeForExpiredAgreements(String agreementCode, Date fromDate, Date toDate) throws Exception {
            List<SignerInformation> signers = new ArrayList<SignerInformation>();
            if("STA".equalsIgnoreCase(agreementCode) && fromDate.before(new Date())) {
                SignerInformation signerOne = new SignerInformation();
                signerOne.setSignerAccountId(1234);
                signerOne.setSignerAccountName("Joe Signer");
                signerOne.setAddressLine("123 Main Street");
                signerOne.setCityName("Rolla");
                signerOne.setPostalCode("56780");
                signerOne.setSignerAliasId("0001234000");
                signerOne.setStateOrProvince("MO");
                signers.add(signerOne);
            }
            return signers;
        }
    }
}
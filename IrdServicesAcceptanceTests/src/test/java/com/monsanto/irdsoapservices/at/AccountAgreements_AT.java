package com.monsanto.irdsoapservices.at;

import com.monsanto.irdsoapservices.agreements.client.*;
import com.monsanto.irdsoapservices.clientutil.ClientFactory;
import com.monsanto.irdsoapservices.clientutil.EnvironmentEnum;
import com.monsanto.irdsoapservices.at.AbstractAcceptanceTestCase;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Mar 31, 2009
 * Time: 5:41:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class AccountAgreements_AT extends AbstractAcceptanceTestCase {

    private AccountAgreementService_Service acctAgreementService = null;
    protected AccountAgreementService acctAgreementClient = null;

    @Override
    protected void doSetUp() throws Exception {
        acctAgreementService = ClientFactory.getAccountAgreementClient(EnvironmentEnum.DEV_EXT, USER_NAME, PASSWORD);
        acctAgreementClient = acctAgreementService.getAccountAgreementServicePort();
        setUpSALEAgreementFor5180();
    }

    public void testGetAgreements_invalidRequest_throwError() {
        try {
            acctAgreementClient.getAgreements(createGetRequest(false));
            fail("exception should have occurred");
        } catch (Exception e) {
            assertValidationSoapFault(e);
        }
    }

    public void testGetAgreements() throws Exception {
        assertSALEAgreementFor5180(5180, 5180, "SALE", "06/11/2003", "12/31/4712");    
    }

    public void testUpdateAgreement_byACCTID() throws Exception {
        GetAgreementsResponseType response = acctAgreementClient.getAgreements(createGetRequest(true));
        assertSALEAgreementFor5180(5180, 5180, "SALE", "06/11/2003", "12/31/4712");

        UpdateAgreementRequestType updateRequest = createUpdateAgreementRequest(AccountTypeAttribute.ACCTID, "5180", "SALE", "01/01/2015");
        assertUpdateResponse(updateRequest);
        assertSALEAgreementFor5180(5180, 5180, "SALE", "06/11/2003", "01/01/2015");

        updateRequest = createUpdateAgreementRequest(AccountTypeAttribute.ACCTID, "5180", "SALE", "12/31/4712");
        assertUpdateResponse(updateRequest);
        assertSALEAgreementFor5180(5180, 5180, "SALE", "06/11/2003", "12/31/4712");
    }

    public void testUpdateAgreement_bySAPID() throws Exception {
        GetAgreementsResponseType response = acctAgreementClient.getAgreements(createGetRequest(true));
        assertSALEAgreementFor5180(5180, 5180, "SALE", "06/11/2003", "12/31/4712");

        UpdateAgreementRequestType updateRequest = createUpdateAgreementRequest(AccountTypeAttribute.SAP, "0001013083", "SALE", "08/09/2010");
        assertUpdateResponse(updateRequest);
        assertSALEAgreementFor5180(5180, 5180, "SALE", "06/11/2003", "08/09/2010");

        updateRequest = createUpdateAgreementRequest(AccountTypeAttribute.SAP, "0001013083", "SALE", "12/31/4712");
        assertUpdateResponse(updateRequest);
        assertSALEAgreementFor5180(5180, 5180, "SALE", "06/11/2003", "12/31/4712");
    }

    public void testGetAgreementHierarchy_invalidRequest_throwFault() {
        try {
            acctAgreementClient.getAgreementHierarchy(createGetAgreementHierarchyRequest(false, 5180, LicensedByType.CS));
        } catch (Exception e) {
            assertValidationSoapFault(e);
        }
    }

    public void testGetAgreementHierarchy_noData_returnBlankResponse() throws Exception {
        GetAgreementHierarchyResponseType response = acctAgreementClient.getAgreementHierarchy(createGetAgreementHierarchyRequest(true, 5180, LicensedByType.MON));
        assertValidHierarchyResponse(response, 0);
    }

    public void testGetAgreementHierarchy_withData_returnValidResponse() throws Exception {
        GetAgreementHierarchyResponseType response = acctAgreementClient.getAgreementHierarchy(createGetAgreementHierarchyRequest(true, 1836, LicensedByType.CS));
        assertValidHierarchyResponse(response, 2);
        List<AgreementCategoryType> categories = response.getGetAgreementHierarchyResponseBody().getAgreementCategory();
        assertAgrCategories(categories, 0, "MONSANTO_TRAIT_AGREEMENT", new AgreementType[]{}, new AgreementType[]{createAgreementType("RRSN", "RRSN-Soybean")});
        assertAgrCategories(categories, 1, "COMMERCIAL_AGREEMENT", new AgreementType[]{}, new AgreementType[]{createAgreementType("Z051", "Bean Commercial"), createAgreementType("Z052", "Bean Testing")});
    }

    private void assertAgrCategories(List<AgreementCategoryType> categories, int categoryIndex, String categoryName, AgreementType[] cornAgrCodes, AgreementType[] soyAgrCodes) {
        AgreementCategoryType commCategory = categories.get(categoryIndex);
        assertEquals(categoryName, commCategory.getCategoryName().toString());
        List<AgreementsBySpecieType> agrsBySpecie = commCategory.getAgreementsBySpecie();
        assertEquals(2, agrsBySpecie.size());
        assertAgrBySpecie(agrsBySpecie.get(0), "CORN", cornAgrCodes);
        assertAgrBySpecie(agrsBySpecie.get(1), "SOYBEAN", soyAgrCodes);
    }

    private void assertAgrBySpecie(AgreementsBySpecieType agrsBySpecie, String specieName, AgreementType[] agrCodes) {
        assertEquals(specieName, agrsBySpecie.getSpecieName().toString());
        assertAgreementList(agrsBySpecie.getAgreement(), agrCodes);
    }

    private void assertAgreementList(List<AgreementType> agreementTypeList, AgreementType[] agrCodes) {
        assertEquals(agrCodes.length, agreementTypeList.size());
        for (int index = 0; index < agreementTypeList.size(); index++) {
            AgreementType agreementType =  agreementTypeList.get(index);
            assertEquals(agrCodes[index].getAgreementCode(), agreementType.getAgreementCode());
            assertEquals(agrCodes[index].getAgreementDescr(), agreementType.getAgreementDescr());
        }
    }

    private AgreementType createAgreementType(String agrCode, String descr) throws Exception {
        AgreementType agrType = new AgreementType();
        agrType.setAgreementCode(agrCode);
        agrType.setAgreementDescr(descr);
        return agrType;
    }

    private void assertValidHierarchyResponse(GetAgreementHierarchyResponseType response, int expectedCount) {
        assertNotNull(response);
        assertNotNull(response.getHeader());
        assertNotNull(response.getGetAgreementHierarchyResponseBody());
        assertNotNull(response.getGetAgreementHierarchyResponseBody().getAgreementCategory());
        assertEquals(expectedCount, response.getGetAgreementHierarchyResponseBody().getAgreementCategory().size());
    }

    private void setUpSALEAgreementFor5180() throws Exception {
        UpdateAgreementRequestType updateRequest = createUpdateAgreementRequest(AccountTypeAttribute.ACCTID, "5180", "SALE", "12/31/4712");
        assertUpdateResponse(updateRequest);
    }

    private void assertUpdateResponse(UpdateAgreementRequestType updateRequest) throws AccountAgreementsFault {
        UpdateAgreementResponseType updateResponse = acctAgreementClient.updateAgreement(updateRequest);
        assertNotNull(updateResponse);
        assertNotNull(updateResponse.getHeader());
        assertNotNull(updateResponse.getUpdateAgreementResponseBody());
        assertEquals("Success", updateResponse.getUpdateAgreementResponseBody().getStatus());
    }

    private void assertSALEAgreementFor5180(int acctId, int signer, String agrCode, String beginDate, String endDate) throws Exception {
        GetAgreementsResponseType response = acctAgreementClient.getAgreements(createGetRequest(true));
        assertNotNull(response);
        assertNotNull(response.getGetAgreementsResponseBody());
        assertEquals(1, response.getGetAgreementsResponseBody().getAgreementInformation().size());
        assertAgreementInfo(response, 0, acctId+"", signer+"", agrCode, beginDate, endDate);
    }

    private void assertAgreementInfo(GetAgreementsResponseType response, int index, String acctId, String signer, String agrCode, String beginDate, String endDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        AgreementInformationType agrInfo = response.getGetAgreementsResponseBody().getAgreementInformation().get(index);
        assertEquals(acctId, agrInfo.getAccountIdentifier().getValue());
        assertEquals(signer, agrInfo.getSignerAccountIdentifier().getValue());
        assertEquals(agrCode, agrInfo.getAgreementCode());
        assertEquals(beginDate, dateFormat.format(agrInfo.getBeginDate().toGregorianCalendar().getTime()));
        assertEquals(endDate, dateFormat.format(agrInfo.getEndDate().toGregorianCalendar().getTime()));
    }

    private UpdateAgreementRequestType createUpdateAgreementRequest(AccountTypeAttribute idType, String value, String agrCode, String endDate) throws Exception {
        UpdateAgreementRequestType request = new UpdateAgreementRequestType();
        UpdateAgreementRequestBodyType requestBody = new UpdateAgreementRequestBodyType();
        AccountIdentifierType acctIdentfier = new AccountIdentifierType();
        acctIdentfier.setType(idType);
        acctIdentfier.setValue(value);
        requestBody.setAccountIdentifier(acctIdentfier);
        requestBody.setAgreementCode(agrCode);
        Date date = new SimpleDateFormat("MM/dd/yyyy").parse(endDate);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        requestBody.setEndDate(transformToXmlGregorianCalendar(cal));
        request.setHeader(getHeaderType());
        request.setUpdateAgreementRequestBody(requestBody);
        return request;
    }

    private GetAgreementsRequestType createGetRequest(boolean isValid) throws Exception {
        GetAgreementsRequestType requestType = new GetAgreementsRequestType();
        requestType.setHeader(getHeaderType());
        GetAgreementsRequestBodyType requestBody = new GetAgreementsRequestBodyType();
        AccountIdentifierType acctIdentifier = new AccountIdentifierType();
        acctIdentifier.setType(AccountTypeAttribute.ACCTID);
        acctIdentifier.setValue("5180");
        requestBody.setAccountIdentifier(acctIdentifier);
        if(isValid) {
            requestBody.setAgreementCode("SALE");
        }
        requestType.setGetAgreementsRequestBody(requestBody);
        return requestType;
    }

    private GetAgreementHierarchyRequestType createGetAgreementHierarchyRequest(boolean isValid, long accountId, LicensedByType licensedBy) throws Exception {
        GetAgreementHierarchyRequestType request = new GetAgreementHierarchyRequestType();
        request.setHeader(getHeaderType());
        GetAgreementHierarchyRequestBodyType requestBody = new GetAgreementHierarchyRequestBodyType();
        requestBody.setAccountId(accountId);
        if(isValid) {
            requestBody.setAgreementLicensedBy(licensedBy);
        }
        request.setGetAgreementHierarchyRequestBody(requestBody);
        return request;
    }
}

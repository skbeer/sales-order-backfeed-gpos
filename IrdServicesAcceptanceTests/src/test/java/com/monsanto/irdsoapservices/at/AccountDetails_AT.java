package com.monsanto.irdsoapservices.at;

import com.monsanto.irdsoapservices.client.*;
import com.monsanto.irdsoapservices.clientutil.ClientFactory;
import com.monsanto.irdsoapservices.clientutil.EnvironmentEnum;
import com.monsanto.irdsoapservices.at.AbstractAcceptanceTestCase;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 25, 2009
 * Time: 1:56:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class AccountDetails_AT extends AbstractAcceptanceTestCase {

    private AccountInformationService_Service acctInfoService = null;
    protected AccountInformationService acctInfoClient = null;

    @Override
    protected void doSetUp() throws Exception {
        acctInfoService = ClientFactory.getAccountInformationClient(EnvironmentEnum.DEV_EXT, USER_NAME, PASSWORD);
        acctInfoClient = acctInfoService.getAccountInformationServicePort();
    }
    
    private boolean EMPTY_RESPONSE = false;
    private boolean NON_EMPTY_RESPONSE = true;

    public void testGetAccountDetails_invalidRequest_throwError() {
        try {
            acctInfoClient.getAccountDetails(createGetAccountDetailsRequest(false, GROWER_ACCT_ID));
            fail("Exception should have occurrred");
        } catch (Exception e) {
            assertSoapException(e, "Schema validation errors");
        }
    }

    public void testGetAccountDetails_validRequest_invalidGrowerAccountId_throwError() {
        try {
            acctInfoClient.getAccountDetails(createGetAccountDetailsRequest(true, 0));
            fail("Exception should have occurrred");
        } catch (Exception e) {
            assertSoapException(e, "An error occurred");
        }
    }

    public void testAccountDetails_Add_Update_Delete() throws Exception {
        removeTestDataForAccount10();
        assertGetAccountDetailsResponse(EMPTY_RESPONSE, null);

        performSaveAccountDetailsOperation(GROWER_ACCT_ID, DatabaseActionType.ADD, "chem", "family", "hobbies", "org", "otherChem", "spouse");
        assertGetAccountDetailsResponse(NON_EMPTY_RESPONSE, new String[]{"10", "chem", "family", "hobbies", "org", "otherChem", "spouse"});

        performSaveAccountDetailsOperation(GROWER_ACCT_ID, DatabaseActionType.UPDATE, "chem_1", "family_1", "hobbies_1", "org_1", "otherChem_1", "spouse_1");
        assertGetAccountDetailsResponse(NON_EMPTY_RESPONSE, new String[]{"10", "chem_1", "family_1", "hobbies_1", "org_1", "otherChem_1", "spouse_1"});

        performSaveAccountDetailsOperation(GROWER_ACCT_ID, DatabaseActionType.DELETE, null, null, null, null, null, null);
        assertGetAccountDetailsResponse(EMPTY_RESPONSE, null);
    }

    public void testGetAssociatedEmployees_invalidRequest_throwFault() {
        try {
            acctInfoClient.getAssociatedEmployees(createGetAssociatedEmployeesRequest(false, AccountTypeAttribute.ACCTID, "5180"));
        } catch (Exception e) {
            assertSoapException(e, "Schema validation errors");
        }
    }

    public void testGetAssociatedEmployees_noData_returnBlankResponse() throws Exception {
        GetAssociatedEmployeesResponseType response = acctInfoClient.getAssociatedEmployees(createGetAssociatedEmployeesRequest(true, AccountTypeAttribute.ACCTID, "5180"));
        assertAssociatedEmployeeResponse(response, 0);
    }

    public void testGetAssociatedEmployees_withACCTID_returnValidResponse() throws Exception {
        GetAssociatedEmployeesResponseType response = acctInfoClient.getAssociatedEmployees(createGetAssociatedEmployeesRequest(true, AccountTypeAttribute.ACCTID, "5188"));
        assertAssociatedEmployeeResponse(response, 1);
        List<EmployeeType> employeeList = response.getGetAssociatedEmployeesResponseBody().getEmployee();
        assertEmployeeType(employeeList, 0, "CMLUELF", "SAM", "Christine", "Luelf", "christine.m.luelf@monsanto.com");
    }

    public void testGetAssociatedEmployees_withSAPID_returnValidResponse() throws Exception {
        GetAssociatedEmployeesResponseType response = acctInfoClient.getAssociatedEmployees(createGetAssociatedEmployeesRequest(true, AccountTypeAttribute.SAP, "0001697871"));
        assertAssociatedEmployeeResponse(response, 1);
        List<EmployeeType> employeeList = response.getGetAssociatedEmployeesResponseBody().getEmployee();
        assertEmployeeType(employeeList, 0, "CMLUELF", "SAM", "Christine", "Luelf", "christine.m.luelf@monsanto.com");
    }

    private void assertEmployeeType(List<EmployeeType> employeeList, int index, String userId, String roleCode, String firstname, String lastName, String email) {
        EmployeeType empType = employeeList.get(index);
        assertNotNull(empType);
        assertEquals(userId, empType.getUserId());
        assertEquals(roleCode, empType.getRoleCode());
        assertEquals(firstname, empType.getFirstName());
        assertEquals(lastName, empType.getLastName());
        assertEquals(email, empType.getEmailAddress());
    }


    private void assertAssociatedEmployeeResponse(GetAssociatedEmployeesResponseType response, int count) {
        assertNotNull(response);
        assertNotNull(response.getHeader());
        assertNotNull(response.getGetAssociatedEmployeesResponseBody());
        assertEquals(count, response.getGetAssociatedEmployeesResponseBody().getEmployee().size());
    }


    private void assertGetAccountDetailsResponse(boolean validData, String[] details) throws Exception {
        GetAccountDetailsResponseType response = acctInfoClient.getAccountDetails(createGetAccountDetailsRequest(true, GROWER_ACCT_ID));
        assertNotNull(response);
        assertNotNull(response.getHeader());
        AccountDetailsType acctDetails = response.getGetAccountDetailsResponseBody().getAccountDetails();
        if(validData) {
            assertNotNull(acctDetails);
            assertEquals(Long.parseLong(details[0]), acctDetails.getGrowerAcctId());
            assertEquals(details[1], acctDetails.getChemistryComments());
            assertEquals(details[2], acctDetails.getFamily());
            assertEquals(details[3], acctDetails.getInterestsHobbies());
            assertEquals(details[4], acctDetails.getOrganizations());
            assertEquals(details[5], acctDetails.getOtherChemistryDescr());
            assertEquals(details[6], acctDetails.getSpouse());
        }
    }

    private void performSaveAccountDetailsOperation(long growerAccountId, DatabaseActionType dbAction, String chemComments, String family, String hobbies, String org, String otherChem, String spouse) throws Exception {
        SaveAccountDetailsResponseType response = acctInfoClient.saveAccountDetails(createSaveAcoountDetailsRequest(dbAction, chemComments, family, hobbies, org, otherChem, spouse, growerAccountId));
        assertNotNull(response);
        assertEquals("Success", response.getSaveAccountDetailsResponseBody().getStatus());
        assertNotNull(response.getSaveAccountDetailsResponseBody().getLastModifiedDate());
    }

    private void removeTestDataForAccount10() throws Exception {
        performSaveAccountDetailsOperation(10, DatabaseActionType.DELETE, null, null, null, null, null, null);
    }

    private SaveAccountDetailsRequestType createSaveAcoountDetailsRequest(DatabaseActionType dbAction, String chemComments, String family, String hobbies, String org, String otherChem, String spouse, long growerAcctId) throws Exception {
        SaveAccountDetailsRequestType request = new SaveAccountDetailsRequestType();
        SaveAccountDetailsRequestBodyType requestBody = new SaveAccountDetailsRequestBodyType();
        requestBody.setDatabaseAction(dbAction);
        AccountDetailsType acctDetails = new AccountDetailsType();
        acctDetails.setGrowerAcctId(growerAcctId);
        acctDetails.setChemistryComments(chemComments);
        acctDetails.setFamily(family);
        acctDetails.setInterestsHobbies(hobbies);
        acctDetails.setOrganizations(org);
        acctDetails.setOtherChemistryDescr(otherChem);
        acctDetails.setSpouse(spouse);
        requestBody.setAccountDetails(acctDetails);
        request.setHeader(getHeaderType());
        request.setSaveAccountDetailsRequestBody(requestBody);
        return request;
    }

    private GetAccountDetailsRequestType createGetAccountDetailsRequest(boolean isValid, int accountId) throws Exception {
        GetAccountDetailsRequestType request = new GetAccountDetailsRequestType();
        GetAccountDetailsRequestBodyType requestBody = new GetAccountDetailsRequestBodyType();
        requestBody.setGrowerAccountId(accountId);
        if(isValid) {
            request.setHeader(getHeaderType());
        }
        request.setGetAccountDetailsRequestBody(requestBody);
        return request;
    }

    private GetAssociatedEmployeesRequestType createGetAssociatedEmployeesRequest(boolean isValid, AccountTypeAttribute acctType, String value) throws Exception {
        GetAssociatedEmployeesRequestType request = new GetAssociatedEmployeesRequestType();
        GetAssociatedEmployeesRequestBodyType requestBody = new GetAssociatedEmployeesRequestBodyType();
        AccountIdentifierType acctIdentifierType = new AccountIdentifierType();
        acctIdentifierType.setType(acctType);
        acctIdentifierType.setValue(value);
        requestBody.setAccountIdentifier(acctIdentifierType);
        if(isValid) {
            request.setHeader(getHeaderType());
        }
        request.setGetAssociatedEmployeesRequestBody(requestBody);
        return request;
    }

}

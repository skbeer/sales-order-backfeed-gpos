package com.monsanto.irdsoapservices.helper.test;

import com.monsanto.irdsoapservices.test.BaseTestCase;
import com.monsanto.irdsoapservices.helper.AccountDetailsHelper;
import com.monsanto.irdsoapservices.dao.IrdDao;
import com.monsanto.irdsoapservices.schema.*;
import com.monsanto.irdsoapservices.to.LfaGrowerDetails;
import com.monsanto.irdsoapservices.to.EmployeeInfo;
import org.easymock.EasyMock;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 30, 2009
 * Time: 1:22:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class AccountDetailsHelper_UT extends BaseTestCase {
    AccountDetailsHelper helper = null;
    IrdDao irdDao = null;

    protected void doSetUp() throws Exception {
        helper = new AccountDetailsHelper();
        irdDao = EasyMock.createMock(IrdDao.class);
        helper.setDao(irdDao);
    }

    public void testGetAccountDetails_invalidRequest_throwException() {
        try {
            helper.getAccountDetails(getGetAccountDetailRequest(false));
            fail("Exception should occur");
        } catch (Exception e) {
        }
    }

    public void testGetAccountDetails_callDAO_returnResponseType() throws Exception {
        EasyMock.expect(irdDao.getAccountDetails(1234)).andReturn(getExpectedGrowerDetails());
        EasyMock.replay(irdDao);
        GetAccountDetailsResponseType responseType = helper.getAccountDetails(getGetAccountDetailRequest(true));
        EasyMock.verify(irdDao);
        assertNotNull(responseType);
        assertNotNull(responseType.getHeader());
        AccountDetailsType detailsType = responseType.getGetAccountDetailsResponseBody().getAccountDetails();
        assertNotNull(detailsType);
        assertEquals(1234, detailsType.getGrowerAcctId());
        assertEquals("family", detailsType.getFamily());
        assertEquals("hobbies", detailsType.getInterestsHobbies());
        assertEquals("chem", detailsType.getChemistryComments());
        assertEquals("other-chem", detailsType.getOtherChemistryDescr());
        assertEquals("org", detailsType.getOrganizations());
        assertEquals("spouse", detailsType.getSpouse());
    }

    public void testSaveAccountDetails_update_returnResponseTpe() throws Exception {
        EasyMock.expect(irdDao.saveAccountDetails((LfaGrowerDetails)EasyMock.anyObject())).andReturn(1);
        EasyMock.replay(irdDao);
        SaveAccountDetailsResponseType response = helper.saveAccountDetails(getSaveAccountDetailsType(DatabaseActionType.UPDATE));
        EasyMock.verify(irdDao);
        assertNotNull(response);
        assertNotNull(response.getHeader());
        assertNotNull(response.getSaveAccountDetailsResponseBody());
        assertEquals("Success", response.getSaveAccountDetailsResponseBody().getStatus());
    }

    public void testSaveAccountDetails_delete_returnResponseTpe() throws Exception {
        EasyMock.expect(irdDao.deleteAccountDetails(1234)).andReturn(1);
        EasyMock.replay(irdDao);
        SaveAccountDetailsResponseType response = helper.saveAccountDetails(getSaveAccountDetailsType(DatabaseActionType.DELETE));
        EasyMock.verify(irdDao);
        assertNotNull(response);
        assertNotNull(response.getHeader());
        assertNotNull(response.getSaveAccountDetailsResponseBody());
        assertEquals("Success", response.getSaveAccountDetailsResponseBody().getStatus());
    }

    public void testGetAssociatedEmployees_invalidRequest_throwException() {
        try {
            helper.getAssociatedEmployees(getAssociatedEmployeeRequest(false, AccountTypeAttribute.ACCTID));
            fail("Exception should occur");
        } catch (Exception e) {
        }
    }

    public void testgetAssociatedEmployees_withAcctId_callDAO_returnResponseType() throws Exception {
        EasyMock.expect(irdDao.getAssociatedEmployees(1234)).andReturn(getExpectecEmployeeInfo());
        EasyMock.replay(irdDao);
        GetAssociatedEmployeesResponseType response = helper.getAssociatedEmployees(getAssociatedEmployeeRequest(true, AccountTypeAttribute.ACCTID));
        EasyMock.verify(irdDao);
        assertNotNull(response.getHeader());
        assertEquals(1, response.getGetAssociatedEmployeesResponseBody().getEmployee().size());
    }

    public void testgetAssociatedEmployees_withSapId_callDAO_findMatchinAccountId_returnResponseType() throws Exception {
        EasyMock.expect(irdDao.getAccountIdByAlias("SAP", "1234")).andReturn(5678L);
        EasyMock.expect(irdDao.getAssociatedEmployees(5678)).andReturn(getExpectecEmployeeInfo());
        EasyMock.replay(irdDao);
        GetAssociatedEmployeesResponseType response = helper.getAssociatedEmployees(getAssociatedEmployeeRequest(true, AccountTypeAttribute.SAP));
        EasyMock.verify(irdDao);
        assertNotNull(response.getHeader());
        assertEquals(1, response.getGetAssociatedEmployeesResponseBody().getEmployee().size());
    }

    private LfaGrowerDetails getExpectedGrowerDetails() {
        LfaGrowerDetails details = new LfaGrowerDetails();
        details.setAccountId(1234);
        details.setFamily("family");
        details.setHobbies("hobbies");
        details.setOrganizations("org");
        details.setChemistryComments("chem");
        details.setOtherChem("other-chem");
        details.setSpouse("spouse");
        return details;
    }


    private GetAccountDetailsRequestType getGetAccountDetailRequest(boolean isValid) throws Exception {
        GetAccountDetailsRequestType request = new GetAccountDetailsRequestType();
        GetAccountDetailsRequestBodyType requestBody =new GetAccountDetailsRequestBodyType();
        if(isValid) {
            requestBody.setGrowerAccountId(1234);
        }
        request.setHeader(getValidHeader("1010", "Test"));
        request.setGetAccountDetailsRequestBody(requestBody);
        return request;
    }

    private SaveAccountDetailsRequestType getSaveAccountDetailsType(DatabaseActionType dbAction) throws Exception {
        SaveAccountDetailsRequestType requestType = new SaveAccountDetailsRequestType();
        SaveAccountDetailsRequestBodyType requestBody = new SaveAccountDetailsRequestBodyType();
        requestBody.setDatabaseAction(dbAction);
        AccountDetailsType acctType = new AccountDetailsType();
        acctType.setGrowerAcctId(1234);
        requestBody.setAccountDetails(acctType);
        requestType.setHeader(getValidHeader("1010", "Test"));
        requestType.setSaveAccountDetailsRequestBody(requestBody);
        return requestType;
    }

    private GetAssociatedEmployeesRequestType getAssociatedEmployeeRequest(boolean isvalid, AccountTypeAttribute acctIdType) throws Exception {
        GetAssociatedEmployeesRequestType request = new GetAssociatedEmployeesRequestType();
        GetAssociatedEmployeesRequestBodyType requestBody = new GetAssociatedEmployeesRequestBodyType();
        AccountIdentifierType acctIdentifier = new AccountIdentifierType();
        acctIdentifier.setType(acctIdType);
        acctIdentifier.setValue("1234");
        if(isvalid) {
            requestBody.setAccountIdentifier(acctIdentifier);
        }
        request.setHeader(getValidHeader("1010", "Test"));
        request.setGetAssociatedEmployeesRequestBody(requestBody);
        return request;
    }

    private List<EmployeeInfo> getExpectecEmployeeInfo() throws Exception {
        List<EmployeeInfo> employees = new ArrayList<EmployeeInfo>();
        EmployeeInfo employee = new EmployeeInfo();
        employee.setAccountId(1234);
        employee.setEmailAddress("1@2.com");
        employee.setFirstName("first");
        employee.setLastName("last");
        employee.setRoleCode("SAM");
        employee.setUserId("mkuchip");
        employees.add(employee);
        return employees;

    }
}

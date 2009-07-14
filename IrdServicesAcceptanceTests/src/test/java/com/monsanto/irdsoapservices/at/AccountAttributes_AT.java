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
 * Time: 9:37:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class AccountAttributes_AT extends AbstractAcceptanceTestCase {

    private AccountInformationService_Service acctInfoService = null;
    protected AccountInformationService acctInfoClient = null;

    @Override
    protected void doSetUp() throws Exception {
        acctInfoService = ClientFactory.getAccountInformationClient(EnvironmentEnum.DEV_EXT, USER_NAME, PASSWORD);
        acctInfoClient = acctInfoService.getAccountInformationServicePort();                
    }

    private boolean CHECK_VALUES = true;
    private boolean DONT_CHECK_VALUES = false;

    public void testGetAccountAttributes_invalidRequest_throwError() {
        try {
            acctInfoClient.getAccountAttributes(createGetRequest(false, 0));
            fail("Exception should have occurred");
        } catch (Exception e) {
            assertSoapException(e, "Schema validation errors");
        }
    }

    public void testGetAccountAttributes_validRequest_InvalidData_throwError() {
        try {
            acctInfoClient.getAccountAttributes(createGetRequest(true, 0));
            fail("Exception should have occurred");
        } catch (Exception e) {
            assertSoapException(e, "An error occurred");
        }
    }

    public void testAccountAttributes_Add_Delete() throws Exception {
        removeTestDataForAccount10();
        assertGetAttributesResponseForAccount10(0, DONT_CHECK_VALUES, null);
        invokeSaveAttributesOperation(DatabaseActionType.ADD);
        assertGetAttributesResponseForAccount10(2, CHECK_VALUES, new String[]{"DD", "DL"});
        invokeSaveAttributesOperation(DatabaseActionType.DELETE);
        assertGetAttributesResponseForAccount10(0, DONT_CHECK_VALUES, null);        
    }

    public void testAccountAttributes_Update_InvalidOperation_throwError() {
        try {
            invokeSaveAttributesOperation(DatabaseActionType.UPDATE);
            fail("Exception should have occurred");
        } catch (Exception e) {
            assertSoapException(e, "An error occurred");
        }
    }

    private void invokeSaveAttributesOperation(DatabaseActionType dbAction) throws Exception {
        SaveAccountAttributesResponseType saveResponse = acctInfoClient.saveAccountAttributes(createSaveRequest(dbAction));
        assertSuccessfulSaveResponse(saveResponse);
    }

    private void removeTestDataForAccount10() throws Exception {
        invokeSaveAttributesOperation(DatabaseActionType.DELETE);
    }

    private void assertGetAttributesResponseForAccount10(int attrListSize, boolean isCheckValues, String[] values) throws Exception {
        GetAccountAttributesResponseType response = acctInfoClient.getAccountAttributes(createGetRequest(true, GROWER_ACCT_ID));
        assertNotNull(response);
        List<String> attrList = response.getGetAccountAttributesResponseBody().getAttributeCode();
        assertEquals(attrListSize, attrList.size());
        if(isCheckValues) {
            for (int index = 0; index < values.length; index++) {
                assertEquals(values[index], attrList.get(index));
            }
        }
    }

    private void assertSuccessfulSaveResponse(SaveAccountAttributesResponseType saveResponse) {
        assertEquals("Success", saveResponse.getSaveAccountAttributesResponseBody().getStatus());
        assertNotNull(saveResponse.getSaveAccountAttributesResponseBody().getLastModifiedDate());
    }

    private GetAccountAttributesRequestType createGetRequest(boolean isValid, long accountId) throws Exception {
        GetAccountAttributesRequestType requestType = new GetAccountAttributesRequestType();
        GetAccountAttributesRequestBodyType requestBody = new GetAccountAttributesRequestBodyType();
        requestBody.setGrowerAccountId(accountId);
        if(isValid) {
            requestType.setHeader(getHeaderType());
        }
        requestType.setGetAccountAttributesRequestBody(requestBody);
        return requestType;
    }

    private SaveAccountAttributesRequestType createSaveRequest(DatabaseActionType dbAction) throws Exception {
        SaveAccountAttributesRequestType request = new SaveAccountAttributesRequestType();
        SaveAccountAttributesRequestBodyType requestBody = new SaveAccountAttributesRequestBodyType();
        requestBody.setGrowerAccountId(GROWER_ACCT_ID);
        requestBody.getPersistableAttributeInfo().add(createPersistableAttribute(dbAction, "DD"));
        requestBody.getPersistableAttributeInfo().add(createPersistableAttribute(dbAction, "DL"));
        request.setHeader(getHeaderType());
        request.setSaveAccountAttributesRequestBody(requestBody);
        return request;
    }

    private PersistableAttributeInfoType createPersistableAttribute(DatabaseActionType action, String attrCode) {
        PersistableAttributeInfoType attr = new PersistableAttributeInfoType();
        attr.setDatabaseAction(action);
        attr.setAttributeCode(attrCode);
        return attr;
    }

    private GetAssociatedEmployeesRequestType createGetAssociatedEmployeesRequest() throws Exception {
        GetAssociatedEmployeesRequestType request = new GetAssociatedEmployeesRequestType();
        GetAssociatedEmployeesRequestBodyType requestBody = new GetAssociatedEmployeesRequestBodyType();
        AccountIdentifierType acctIdentifierType = new AccountIdentifierType();
        acctIdentifierType.setType(AccountTypeAttribute.ACCTID);
        acctIdentifierType.setValue("5180");
        requestBody.setAccountIdentifier(acctIdentifierType);
        request.setHeader(getHeaderType());
        request.setGetAssociatedEmployeesRequestBody(requestBody);
        return request;
    }

}

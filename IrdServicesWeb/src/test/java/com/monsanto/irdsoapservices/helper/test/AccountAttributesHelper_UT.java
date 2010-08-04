package com.monsanto.irdsoapservices.helper.test;

import com.monsanto.irdsoapservices.dao.IrdDao;
import com.monsanto.irdsoapservices.helper.AccountAttributesHelper;
import com.monsanto.irdsoapservices.schema.*;
import com.monsanto.irdsoapservices.service.AccountInformationFault;
import com.monsanto.irdsoapservices.test.BaseTestCase;
import com.monsanto.irdsoapservices.to.AcctToAttr;
import org.easymock.EasyMock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 30, 2009
 * Time: 10:45:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class AccountAttributesHelper_UT extends BaseTestCase {

    AccountAttributesHelper helper = null;
    IrdDao irdDao = null;

    @Override
    protected void doSetUp() throws Exception {
        helper = new AccountAttributesHelper();
        irdDao = EasyMock.createMock(IrdDao.class);
        helper.setDao(irdDao);
    }

    public void testGetAccountAttributes_invalidRequest_throwException() throws Exception {
        try {
            helper.getAccountAttributes(getGetAttrRequest(false));
            fail("Exception should occur");
        } catch (AccountInformationFault accountInformationFault) {
        }
    }

    public void testGetAccountAttributes_returnAttributes() throws Exception {
        GetAccountAttributesRequestType request = getGetAttrRequest(true);
        EasyMock.expect(irdDao.getAttributesByAcctId(1234)).andReturn(getAttrList(2));
        EasyMock.replay(irdDao);
        GetAccountAttributesResponseType response = helper.getAccountAttributes(request);
        EasyMock.verify(irdDao);
        assertNotNull(response);
        assertEquals(2, response.getGetAccountAttributesResponseBody().getAttributeCode().size());
        List<String> attrs = response.getGetAccountAttributesResponseBody().getAttributeCode();
        assertTrue(attrs.contains("ATTR0"));
        assertTrue(attrs.contains("ATTR1"));        
    }

    public void testGetAccountAttributes_daoThrowsError_throwException() throws Exception {
        GetAccountAttributesRequestType request = getGetAttrRequest(true);
        EasyMock.expect(irdDao.getAttributesByAcctId(1234)).andThrow(new Exception("Some Error"));
        EasyMock.replay(irdDao);
        try {
            GetAccountAttributesResponseType response = helper.getAccountAttributes(request);
            fail("Exception should occur");
        } catch (AccountInformationFault accountInformationFault) {
        }
        EasyMock.verify(irdDao);
    }

    public void testSaveAccountAttributes_invalidRequest_throwError() {
        try {
            helper.saveAccountAttributes(getSaveAttrRequest(false, true));
            fail("Exception should occur");
        } catch (Exception e) {
        }
    }

    public void testSaveAccountAttributes_unSupportedOperation_throwError() {
        try {
            helper.saveAccountAttributes(getSaveAttrRequest(true, false));
            fail("Exception should occur");
        } catch (Exception e) {
        }
    }

    public void testSaveAccountAttributes_callDaoMethods() throws Exception {
        EasyMock.expect(irdDao.insertAccountAttribute((AcctToAttr)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(irdDao.deleteAccountAttribute((AcctToAttr)EasyMock.anyObject())).andReturn(1);
        EasyMock.replay(irdDao);
        SaveAccountAttributesResponseType response = helper.saveAccountAttributes(getSaveAttrRequest(true, true));
        assertNotNull(response);
        assertNotNull(response.getHeader());
        assertEquals("Success", response.getSaveAccountAttributesResponseBody().getStatus());
    }


    private GetAccountAttributesRequestType getGetAttrRequest(boolean isValid) throws Exception {
        GetAccountAttributesRequestType request = new GetAccountAttributesRequestType();
        GetAccountAttributesRequestBodyType requestBody = new GetAccountAttributesRequestBodyType();
        if(isValid) {
            requestBody.setGrowerAccountId(1234);
        }
        request.setHeader(getValidHeader("1010", "IRDServices_Test"));
        request.setGetAccountAttributesRequestBody(requestBody);
        return request;
    }

    public SaveAccountAttributesRequestType getSaveAttrRequest(boolean isValid, boolean isValidOperation) throws Exception {
        SaveAccountAttributesRequestType request = new SaveAccountAttributesRequestType();
        SaveAccountAttributesRequestBodyType requestBody = new SaveAccountAttributesRequestBodyType();
        PersistableAttributeInfoType persistableAttribute = new PersistableAttributeInfoType();
        if(isValidOperation) {
            persistableAttribute.setDatabaseAction(DatabaseActionType.ADD);
        } else {
            persistableAttribute.setDatabaseAction(DatabaseActionType.UPDATE);
        }
        persistableAttribute.setAttributeCode("CM");
        requestBody.getPersistableAttributeInfo().add(persistableAttribute);
        persistableAttribute = new PersistableAttributeInfoType();
        if(isValidOperation) {
            persistableAttribute.setDatabaseAction(DatabaseActionType.DELETE);
        } else {
            persistableAttribute.setDatabaseAction(DatabaseActionType.UPDATE);
        }
        persistableAttribute.setAttributeCode("DM");
        requestBody.getPersistableAttributeInfo().add(persistableAttribute);
        if(isValid) {
            requestBody.setGrowerAccountId(1234);
        }
        request.setHeader(getValidHeader("1010", "IRDServices_Test"));
        request.setSaveAccountAttributesRequestBody(requestBody);
        return request;
    }


    private List<AcctToAttr> getAttrList(int count) {
        List<AcctToAttr> attrList = new ArrayList<AcctToAttr>();
        for (int index = 0; index < count; index++) {
            AcctToAttr acctToAttr = new AcctToAttr();
            acctToAttr.setAttrCode("ATTR"+index);
            attrList.add(acctToAttr);
        }
        return attrList;
    }
}

package com.monsanto.irdsoapservices.helper.test;

import com.monsanto.irdsoapservices.test.BaseTestCase;
import com.monsanto.irdsoapservices.dao.ContactDao;
import com.monsanto.irdsoapservices.contacts.schema.*;
import com.monsanto.irdsoapservices.helper.ContactsHelper;
import com.monsanto.irdsoapservices.service.ContactsFault;
import com.monsanto.irdsoapservices.to.ContactInfo;
import com.monsanto.irdsoapservices.to.ContactEmailInfo;
import com.monsanto.irdsoapservices.to.ContactPhoneInfo;
import com.monsanto.irdsoapservices.to.ContactFunctionInfo;
import org.easymock.EasyMock;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Nov 9, 2009
 * Time: 2:27:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class ContactsHelper_UT extends BaseTestCase {
    ContactDao contactDao = null;
    ContactsHelper helper = null;
    protected void doSetUp() throws Exception {
        contactDao = EasyMock.createMock(ContactDao.class);
        helper = new ContactsHelper();
        helper.setDao(contactDao);
    }

    public void testGetContacts_invalidRequest_throwError() throws Exception {
        GetContactsRequestType request = getContactsRequestType(false, 0, 0, false);
        try {
            helper.getContacts(request);
            fail("Exception should have occurred");
        } catch (ContactsFault contactsFault) {
        }
    }

    public void testGetContacts_noAccountIdAndContactId_throwError() throws Exception {
        GetContactsRequestType request = getContactsRequestType(true, 0L, 0L, false);
        try {
            helper.getContacts(request);
            fail("Exception should have occurred");
        } catch (ContactsFault contactsFault) {
        }
    }

    public void testGetContacts_byAccountId_returnValidResponse() throws Exception {
        GetContactsRequestType request = getContactsRequestType(true, 5180L, 0L, false);
        EasyMock.expect(contactDao.getContacts(5180, 0, null)).andReturn(getMockContactList(1));
        EasyMock.replay(contactDao);
        GetContactsResponseType response = helper.getContacts(request);
        EasyMock.verify(contactDao);
        assertGetContactResponse(response);
    }

    public void testGetContacts_byContactId_returnValidResponse() throws Exception {
        GetContactsRequestType request = getContactsRequestType(true, 0L, 100L, false);
        EasyMock.expect(contactDao.getContacts(0, 100, null)).andReturn(getMockContactList(1));
        EasyMock.replay(contactDao);
        GetContactsResponseType response = helper.getContacts(request);
        EasyMock.verify(contactDao);
        assertGetContactResponse(response);
    }
    
    public void testGetContacts_byAccountIdAndContactFunction_returnValidResponse() throws Exception {
        GetContactsRequestType request = getContactsRequestType(true, 5180L, 0L, true);
        List<String> contactTypes = new ArrayList<String>();
        contactTypes.add("OWNEROP");
        EasyMock.expect(contactDao.getContacts(5180, 0, contactTypes)).andReturn(getMockContactList(1));
        EasyMock.replay(contactDao);
        GetContactsResponseType response = helper.getContacts(request);
        EasyMock.verify(contactDao);
        assertGetContactResponse(response);
    }

    public void testInsertContacts_invalidAccountId_throwError() throws Exception {
        InsertContactRequestType requestType = getInsertContactRequestType(0, 1, true);
        try {
            helper.insertContacts(requestType);
            fail("Exception should have occurred");
        } catch (ContactsFault contactsFault) {
            System.out.println(contactsFault.getFaultInfo().getFaultCode());            
        }
    }

    public void testInsertContacts_noContactInformation_throwError() throws Exception {
        InsertContactRequestType requestType = getInsertContactRequestType(100, 0, true);
        try {
            helper.insertContacts(requestType);
            fail("Exception should have occurred");
        } catch (ContactsFault contactsFault) {
            System.out.println(contactsFault.getFaultInfo().getFaultCode());
        }
    }

    public void testInsertContacts_missingDetailsInContactInformation_throwError() throws Exception {
        InsertContactRequestType requestType = getInsertContactRequestType(100, 1, false);
        try {
            helper.insertContacts(requestType);
            fail("Exception should have occurred");
        } catch (ContactsFault contactsFault) {
            System.out.println(contactsFault.getFaultInfo().getFaultCode());
        }
    }

    public void testInsertContact_validRequest_InsertFailed_throwError() throws Exception {
        InsertContactRequestType requestType = getInsertContactRequestType(100, 1, true);
        EasyMock.expect(contactDao.insertContact((ContactInfo)EasyMock.anyObject())).andReturn(0l);
        EasyMock.replay(contactDao);
        try {
            helper.insertContacts(requestType);
            fail("Exception should have ccurred");
        } catch (ContactsFault contactsFault) {
            System.out.println(contactsFault.getFaultInfo().getFaultCode());
        }
        EasyMock.verify(contactDao);
    }

    public void testInsertContact_validRequest_singleContact_returnValidResponse() throws Exception {
        InsertContactRequestType requestType = getInsertContactRequestType(100, 1, true);
        EasyMock.expect(contactDao.insertContact((ContactInfo)EasyMock.anyObject())).andReturn(1010L);
        EasyMock.replay(contactDao);
        InsertContactResponseType response = helper.insertContacts(requestType);
        EasyMock.verify(contactDao);
        assertNotNull(response);
        assertHeader(response.getHeader(), "TEST-123", "MKUCHIP-TEST");
        assertEquals(100, response.getInsertContactResponseBody().getAccountId());
        assertEquals(1, response.getInsertContactResponseBody().getContactList().getContactInfo().size());
        ContactInfoType contactInfo = response.getInsertContactResponseBody().getContactList().getContactInfo().get(0);
        assertContactInfoType(contactInfo, 1010, "first0", "last0", "title0", 1, 1, 1);
        assertContactFunction(contactInfo.getContactFunctionList().getContactFunction(), "OWNEROP");
        assertContactPhoneNumber(contactInfo, 0, PhoneNumberEnumType.BUSINESS, "3146942000", "0");
        assertContactEmail(contactInfo, 0, EmailEnumType.BUSINESS, "mon0@monsanto.com");        
    }

    public void testInsertContact_validRequest_multipleContacts_returnValidResponse() throws Exception {
        InsertContactRequestType requestType = getInsertContactRequestType(100, 2, true);
        EasyMock.expect(contactDao.insertContact((ContactInfo)EasyMock.anyObject())).andReturn(1010L);
        EasyMock.expect(contactDao.insertContact((ContactInfo)EasyMock.anyObject())).andReturn(1011L);
        EasyMock.replay(contactDao);
        InsertContactResponseType response = helper.insertContacts(requestType);
        EasyMock.verify(contactDao);
        assertNotNull(response);
        assertHeader(response.getHeader(), "TEST-123", "MKUCHIP-TEST");
        assertEquals(100, response.getInsertContactResponseBody().getAccountId());
        assertEquals(2, response.getInsertContactResponseBody().getContactList().getContactInfo().size());
        
        ContactInfoType contactInfo = response.getInsertContactResponseBody().getContactList().getContactInfo().get(0);
        assertContactInfoType(contactInfo, 1010, "first0", "last0", "title0", 1, 2, 2);
        assertContactFunction(contactInfo.getContactFunctionList().getContactFunction(), "OWNEROP");
        assertContactPhoneNumber(contactInfo, 0, PhoneNumberEnumType.BUSINESS, "3146942000", "0");
        assertContactEmail(contactInfo, 0, EmailEnumType.BUSINESS, "mon0@monsanto.com");
        assertContactPhoneNumber(contactInfo, 1, PhoneNumberEnumType.CELL, "3146942001", "1");
        assertContactEmail(contactInfo, 1, EmailEnumType.ELEVATOR, "mon1@monsanto.com");

        contactInfo = response.getInsertContactResponseBody().getContactList().getContactInfo().get(1);
        assertContactInfoType(contactInfo, 1011, "first1", "last1", "title1", 1, 2, 2);
        assertContactFunction(contactInfo.getContactFunctionList().getContactFunction(), "GPOS");
        assertContactPhoneNumber(contactInfo, 0, PhoneNumberEnumType.BUSINESS, "3146942000", "0");
        assertContactEmail(contactInfo, 0, EmailEnumType.BUSINESS, "mon0@monsanto.com");
        assertContactPhoneNumber(contactInfo, 1, PhoneNumberEnumType.CELL, "3146942001", "1");
        assertContactEmail(contactInfo, 1, EmailEnumType.ELEVATOR, "mon1@monsanto.com");
    }

    public void testUpdateContacts_invalidRequest_throwError() throws Exception {
        UpdateContactsRequestType request = getUpdateContactRequestType(100, 1, false);
        try {
            helper.updateContacts(request);
            fail("Exception should have occurred");
        } catch (ContactsFault contactsFault) {
            System.out.println(contactsFault.getFaultInfo().getFaultCode());
        }
    }

    public void testUpdateContacts_oneContact_callDaoForUpdates() throws Exception {
        UpdateContactsRequestType request = getUpdateContactRequestType(100, 1, true);
        EasyMock.expect(contactDao.updateContact((ContactInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.replay(contactDao);
        UpdateContactsResponseType response = helper.updateContacts(request);
        EasyMock.verify(contactDao);
        assertNotNull(response);
        assertHeader(response.getHeader(), "TEST-123", "MKUCHIP-TEST");
        assertEquals("Success", response.getUpdateContactsResponseBody().getStatus());
    }

    public void testUpdateContacts_multipleContacts_callDaoForUpdates() throws Exception {
        UpdateContactsRequestType request = getUpdateContactRequestType(100, 2, true);
        EasyMock.expect(contactDao.updateContact((ContactInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(contactDao.updateContact((ContactInfo)EasyMock.anyObject())).andReturn(2);
        EasyMock.replay(contactDao);
        UpdateContactsResponseType response = helper.updateContacts(request);
        EasyMock.verify(contactDao);
        assertNotNull(response);
        assertHeader(response.getHeader(), "TEST-123", "MKUCHIP-TEST");
        assertEquals("Success", response.getUpdateContactsResponseBody().getStatus());
    }

    public void testAddContactFunction_invalidRequest_throwError() throws Exception {
        try {
            helper.addContactFunction(getAddContactFunctionRequest(false, 100, 1010, 1));
            fail("Exception should have occurred");
        } catch (ContactsFault e) {
            System.out.println(e.getFaultInfo().getFaultCode());
        }
    }

    public void testRemoveContactFunction_invalidAccountId_throwError() throws Exception {
        try {
            helper.removeContactFunction(getRemoveContactFunctionRequest(true, 0, 1010, 1));
            fail("Exception should have occurred");
        } catch (ContactsFault e) {
            System.out.println(e.getFaultInfo().getFaultCode());
        }
    }

    public void testRemoveContactFunction_missingContactFunction_throwError() throws Exception {
        try {
            helper.removeContactFunction(getRemoveContactFunctionRequest(true, 100, 1010, 0));
            fail("Exception should have occurred");
        } catch (ContactsFault e) {
            System.out.println(e.getFaultInfo().getFaultCode());
        }
    }

    public void testRemoveContactFunction_inputDoNotMatch_throwError() throws Exception {
        EasyMock.expect(contactDao.isContactExisting(100, 1010)).andReturn(false);
        EasyMock.replay(contactDao);
        try {
            helper.removeContactFunction(getRemoveContactFunctionRequest(true, 100, 1010, 1));
            fail("Exception should have occurred");
        } catch (ContactsFault e) {
            System.out.println(e.getFaultInfo().getFaultCode());
        }
        EasyMock.verify(contactDao);
    }

    public void testRemoveContactFunction_oneValidFunction_callDaoForDelete() throws Exception {
        EasyMock.expect(contactDao.isContactExisting(100, 1010)).andReturn(true);
        EasyMock.expect(contactDao.deleteContactFunction((ContactFunctionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.replay(contactDao);
        RemoveContactFunctionResponseType response = helper.removeContactFunction(getRemoveContactFunctionRequest(true, 100, 1010, 1));
        EasyMock.verify(contactDao);
        assertNotNull(response);
        assertHeader(response.getHeader(), "TEST-123", "MKUCHIP-123");
        assertEquals("Success", response.getRemoveContactFunctionResponseBody().getStatus());
    }

    public void testRemoveContactFunction_multipleValidFunctions_multipleCallsToDaoForDelete() throws Exception {
        EasyMock.expect(contactDao.isContactExisting(100, 1010)).andReturn(true);
        EasyMock.expect(contactDao.deleteContactFunction((ContactFunctionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(contactDao.deleteContactFunction((ContactFunctionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.replay(contactDao);
        RemoveContactFunctionResponseType response = helper.removeContactFunction(getRemoveContactFunctionRequest(true, 100, 1010, 2));
        EasyMock.verify(contactDao);
        assertNotNull(response);
        assertHeader(response.getHeader(), "TEST-123", "MKUCHIP-123");
        assertEquals("Success", response.getRemoveContactFunctionResponseBody().getStatus());
    }

    public void testAddContactFunction_invalidAccountId_throwError() throws Exception {
        try {
            helper.addContactFunction(getAddContactFunctionRequest(true, 0, 1010, 1));
            fail("Exception should have occurred");
        } catch (ContactsFault e) {
            System.out.println(e.getFaultInfo().getFaultCode());
        }
    }

    public void testAddContactFunction_missingContactFunction_throwError() throws Exception {
        try {
            helper.addContactFunction(getAddContactFunctionRequest(true, 100, 1010, 0));
            fail("Exception should have occurred");
        } catch (ContactsFault e) {
            System.out.println(e.getFaultInfo().getFaultCode());
        }
    }

    public void testAddContactFunction_inputDoNotMatch_throwError() throws Exception {
        EasyMock.expect(contactDao.isContactExisting(100, 1010)).andReturn(false);
        EasyMock.replay(contactDao);
        try {
            helper.addContactFunction(getAddContactFunctionRequest(true, 100, 1010, 1));
            fail("Exception should have occurred");
        } catch (ContactsFault e) {
            System.out.println(e.getFaultInfo().getFaultCode());
        }
        EasyMock.verify(contactDao);
    }

    public void testAddContactFunction_oneValidFunction_callDaoForInsert() throws Exception {
        EasyMock.expect(contactDao.isContactExisting(100, 1010)).andReturn(true);
        EasyMock.expect(contactDao.insertContactFunction((ContactFunctionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.replay(contactDao);
        AddContactFunctionResponseType response = helper.addContactFunction(getAddContactFunctionRequest(true, 100, 1010, 1));
        EasyMock.verify(contactDao);
        assertNotNull(response);
        assertHeader(response.getHeader(), "TEST-123", "MKUCHIP-123");
        assertEquals("Success", response.getAddContactFunctionResponseBody().getStatus());
    }

    public void testAddContactFunction_multipleValidFunction_multipleCallsToDaoForInsert() throws Exception {
        EasyMock.expect(contactDao.isContactExisting(100, 1010)).andReturn(true);
        EasyMock.expect(contactDao.insertContactFunction((ContactFunctionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.expect(contactDao.insertContactFunction((ContactFunctionInfo)EasyMock.anyObject())).andReturn(1);
        EasyMock.replay(contactDao);
        AddContactFunctionResponseType response = helper.addContactFunction(getAddContactFunctionRequest(true, 100, 1010, 2));
        EasyMock.verify(contactDao);
        assertNotNull(response);
        assertHeader(response.getHeader(), "TEST-123", "MKUCHIP-123");
        assertEquals("Success", response.getAddContactFunctionResponseBody().getStatus());
    }

    public void testDeleteContact_invalidRequest_throwError() throws Exception {
        try {
            helper.deleteContacts(getDeleteContactRequest(0, 10, false));
            fail("Exception should have occurred");
        } catch (ContactsFault e) {
            System.out.println(e.getFaultInfo().getFaultCode());
        }
    }

    public void testDeleteContact_invalidAcountId_throwError() throws Exception {
        try {
            helper.deleteContacts(getDeleteContactRequest(0, 0, true));
            fail("Exception should have occurred");
        } catch (ContactsFault e) {
            System.out.println(e.getFaultInfo().getFaultCode());
        }
    }

    public void testDeleteContact_noContactIds_throwError() throws Exception {
        try {
            helper.deleteContacts(getDeleteContactRequest(0, 10, true));
            fail("Exception should have occurred");
        } catch (ContactsFault e) {
            System.out.println(e.getFaultInfo().getFaultCode());
        }
    }

    public void testDeleteContact_validRequest_contactNotExisting_throwError() throws Exception {
        EasyMock.expect(contactDao.isContactExisting(10, 1)).andReturn(false);
        EasyMock.replay(contactDao);
        try {
            helper.deleteContacts(getDeleteContactRequest(1, 10, true));
            fail("Exception should have occurred");
        } catch (ContactsFault e) {
            System.out.println(e.getFaultInfo().getFaultCode());
        }
        EasyMock.verify(contactDao);
    }

    public void testDeleteContact_validRequest_contactHasExistingFunctions_throwError() throws Exception {
        List<String> functions = new ArrayList<String>();
        functions.add("SOME");
        EasyMock.expect(contactDao.isContactExisting(10, 1)).andReturn(true);
        EasyMock.expect(contactDao.getContactFunctions(1)).andReturn(functions);
        EasyMock.replay(contactDao);
        try {
            helper.deleteContacts(getDeleteContactRequest(1, 10, true));
            fail("Exception should have occurred");
        } catch (ContactsFault e) {
            System.out.println(e.getFaultInfo().getFaultCode());
        }
        EasyMock.verify(contactDao);
    }

    public void testDeleteContact_validRequest_oneContactId_callDaoForDelete_Once() throws Exception {
        EasyMock.expect(contactDao.isContactExisting(10, 1)).andReturn(true);
        EasyMock.expect(contactDao.getContactFunctions(1)).andReturn(new ArrayList<String>());
        EasyMock.expect(contactDao.deleteContact(1)).andReturn(1);
        EasyMock.replay(contactDao);
        DeleteContactResponseType response = helper.deleteContacts(getDeleteContactRequest(1, 10, true));
        assertNotNull(response);
        assertHeader(response.getHeader(), "TEST-123", "MKUCHIP-TEST");
        assertEquals("Success", response.getDeleteContactResponseBody().getStatus());
        EasyMock.verify(contactDao);
    }

    public void testDeleteContact_validRequest_multipleContactIds_callDaoForDelete_multipleTimes() throws Exception {
        EasyMock.expect(contactDao.isContactExisting(10, 1)).andReturn(true);
        EasyMock.expect(contactDao.getContactFunctions(1)).andReturn(new ArrayList<String>());
        EasyMock.expect(contactDao.deleteContact(1)).andReturn(1);
        EasyMock.expect(contactDao.isContactExisting(10, 2)).andReturn(true);
        EasyMock.expect(contactDao.getContactFunctions(2)).andReturn(new ArrayList<String>());
        EasyMock.expect(contactDao.deleteContact(2)).andReturn(1);
        EasyMock.replay(contactDao);
        DeleteContactResponseType response = helper.deleteContacts(getDeleteContactRequest(2, 10, true));
        assertNotNull(response);
        assertHeader(response.getHeader(), "TEST-123", "MKUCHIP-TEST");
        assertEquals("Success", response.getDeleteContactResponseBody().getStatus());
        EasyMock.verify(contactDao);
    }

    private DeleteContactRequestType getDeleteContactRequest(int count, int accountId, boolean isValid) throws Exception {
        DeleteContactRequestType request = new DeleteContactRequestType();
        request.setHeader(getValidHeader("TEST-123", "MKUCHIP-TEST"));
        DeleteContactRequestBodyType requestBody = new DeleteContactRequestBodyType();
        requestBody.setAccountId(accountId);
        for (int index = 0; index < count; index++) {
            requestBody.getContactId().add(new Long(index+1));
        }
        if(isValid) {
            request.setDeleteContactRequestBody(requestBody);
        }
        return request;
    }

    private AddContactFunctionRequestType getAddContactFunctionRequest(boolean isValid, int accountId, int contactId, int functionCount) throws Exception {
        AddContactFunctionRequestType request = new AddContactFunctionRequestType();
        AddContactFunctionRequestBodyType requestBody = new AddContactFunctionRequestBodyType();
        requestBody.setAccountId(accountId);
        requestBody.setContactId(contactId);
        ContactFunctionListType contactFunctions = new ContactFunctionListType();
        for (int index = 0; index < functionCount; index++) {
            contactFunctions.getContactFunction().add("FUN"+index);
        }
        requestBody.setContactFunctionList(contactFunctions);
        if(isValid) {
            request.setAddContactFunctionRequestBody(requestBody);
        }
        request.setHeader(getValidHeader("TEST-123", "MKUCHIP-123"));
        return request;
    }

    private RemoveContactFunctionRequestType getRemoveContactFunctionRequest(boolean isValid, int accountId, int contactId, int functionCount) throws Exception {
        RemoveContactFunctionRequestType request = new RemoveContactFunctionRequestType();
        RemoveContactFunctionRequestBodyType requestBody = new RemoveContactFunctionRequestBodyType();
        requestBody.setAccountId(accountId);
        requestBody.setContactId(contactId);
        ContactFunctionListType contactFunctions = new ContactFunctionListType();
        for (int index = 0; index < functionCount; index++) {
            contactFunctions.getContactFunction().add("FUN"+index);
        }
        requestBody.setContactFunctionList(contactFunctions);
        if(isValid) {
            request.setRemoveContactFunctionRequestBody(requestBody);
        }
        request.setHeader(getValidHeader("TEST-123", "MKUCHIP-123"));
        return request;
    }

    private InsertContactRequestType getInsertContactRequestType(int accountId, int contactCount, boolean isValid) throws Exception {
        InsertContactRequestType request = new InsertContactRequestType();
        request.setHeader(getValidHeader("TEST-123", "MKUCHIP-TEST"));
        InsertContactRequestBodyType requestBody = new InsertContactRequestBodyType();
        requestBody.setAccountId(accountId);
        InsertContactListType contactListType = new InsertContactListType();
        for (int index = 0; index < contactCount; index++) {
            contactListType.getContactInfo().add(getInsertContactInfo(isValid ?"first"+index:null, "last"+index, "title"+index, index==0?"OWNEROP":"GPOS", contactCount, contactCount));
        }
        requestBody.setContactList(contactListType);
        request.setInsertContactRequestBody(requestBody);
        return request;
    }

    private void assertGetContactResponse(GetContactsResponseType response) throws Exception {
        assertNotNull(response);
        assertNotNull(response.getGetContactsResponseBody());
        assertHeader(response.getHeader(), "TEST_123", "MKUCHIP_TEST");
        assertEquals(1, response.getGetContactsResponseBody().getContactList().getContactInfo().size());
        ContactInfoType contactInfo = response.getGetContactsResponseBody().getContactList().getContactInfo().get(0);
        assertContactInfoType(contactInfo, 100, "first0", "last0", "title0", 1, 1, 1);
        assertContactFunction(contactInfo.getContactFunctionList().getContactFunction(), "OWNEROP");
        assertContactPhoneNumber(contactInfo, 0, PhoneNumberEnumType.BUSINESS, "3146942000", "0");
        assertContactEmail(contactInfo, 0, EmailEnumType.BUSINESS, "mon0@monsanto.com");
    }

    private void assertContactInfoType(ContactInfoType contactInfo, int contactId, String firstname, String lastname, String title, int contactFunctionCount, int phoneCount, int emailCount) {
        assertEquals(contactId, contactInfo.getContactId());
        assertEquals(firstname, contactInfo.getFirstName());
        assertEquals(lastname, contactInfo.getLastName());
        assertEquals(title, contactInfo.getJobTitle());
        assertEquals(contactFunctionCount, contactInfo.getContactFunctionList().getContactFunction().size());
        assertEquals(phoneCount, contactInfo.getPhoneNumberList().getContactPhoneNumber().size());
        assertEquals(emailCount, contactInfo.getEmailAddressList().getEmailAddress().size());
    }

    private void assertContactPhoneNumber(ContactInfoType contactInfo, int index, PhoneNumberEnumType phType, String phNumber, String phExt) {
        ContactPhoneNumberType contactPhone = contactInfo.getPhoneNumberList().getContactPhoneNumber().get(index);
        assertEquals(phType, contactPhone.getType());
        assertEquals(phNumber, contactPhone.getPhoneNumber());
        assertEquals(phExt, contactPhone.getExtension());
    }

    private void assertContactEmail(ContactInfoType contactInfo, int index, EmailEnumType emailType, String emailAddr) {
        ContactEmailType contactEmail = contactInfo.getEmailAddressList().getEmailAddress().get(index);
        assertEquals(emailType, contactEmail.getType());
        assertEquals(emailAddr, contactEmail.getValue());
    }

    private void assertContactFunction(List<String> contactFunctionList, String contactFunction) {
        assertTrue(contactFunctionList.contains(contactFunction));
    }

    private GetContactsRequestType getContactsRequestType(boolean isValid, long accountId, long contactId, boolean populateContactFunctions) throws Exception {
        GetContactsRequestType request = new GetContactsRequestType();
        request.setHeader(getValidHeader("TEST_123", "MKUCHIP_TEST"));
        GetContactsRequestBodyType requestBody = new GetContactsRequestBodyType();
        requestBody.setAccountId(accountId);
        requestBody.setContactId(contactId);
        if(isValid) {
            request.setGetContactsRequestBody(requestBody);
        }
        ContactFunctionListType functinoList = new ContactFunctionListType();
        functinoList.getContactFunction().add("OWNEROP");
        if(populateContactFunctions) {
            requestBody.setContactFunctionList(functinoList);
        }
        return request;
    }

    private List<ContactInfo> getMockContactList(int count) throws Exception {
        List<ContactInfo> contactlist = new ArrayList<ContactInfo>();
        for (int index = 0; index < count; index++) {
            contactlist.add(getMockContactInfo(1, "OWNEROP", "first"+index, "last"+index, "title"+index, index+1, 100+index, true));
        }
        return contactlist;
    }

    private InsertContactInfoType getInsertContactInfo(String firstN, String lastN, String title, String contactFunction, int phCount, int emailCount) throws Exception {
        InsertContactInfoType contactInfo = new InsertContactInfoType();
        contactInfo.setFirstName(firstN);
        contactInfo.setLastName(lastN);
        contactInfo.setJobTitle(title);
        contactInfo.setContactFunction(contactFunction);
        ContactPhoneNumberListType phoneList = new ContactPhoneNumberListType();
        EmailAddressListType emailList = new EmailAddressListType();
        for (int index = 0; index < phCount; index++) {
            phoneList.getContactPhoneNumber().add(getContactPhoneNumberType(index==0?PhoneNumberEnumType.BUSINESS:PhoneNumberEnumType.CELL, "314694200"+index, index+""));
        }
        for (int index = 0; index < emailCount; index++) {
            emailList.getEmailAddress().add(getContactEmailType(index==0?EmailEnumType.BUSINESS:EmailEnumType.ELEVATOR, "mon"+index+"@monsanto.com"));            
        }
        contactInfo.setPhoneNumberList(phoneList);
        contactInfo.setEmailAddressList(emailList);
        return contactInfo;
    }

    private ContactInfo getMockContactInfo(int count, String contactType, String firstName, String lastName, String jobTitle, int accountId, int contactId, boolean populateContactFunctionList) {
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setAccountId(accountId);
        contactInfo.setContactId(contactId);
        if(populateContactFunctionList) {
            List<String> contactFunctions = new ArrayList<String>();
            contactFunctions.add(contactType);
            contactInfo.setContactFunctions(contactFunctions);
        } else {
            contactInfo.setContactType(contactType);
        }
        contactInfo.setFirstName(firstName);
        contactInfo.setLastName(lastName);
        contactInfo.setJobTitle(jobTitle);
        for (int ind = 0; ind < count; ind++) {
            contactInfo.getPhoneNumbers().add(getContactPhone(ind==0?"BUSINESS":"FAX", "314694200"+ind, ind+"", 0, null));
        }
        for (int ind = 0; ind < count; ind++) {
            contactInfo.getEmailAddresses().add(getContactEmail(ind==0?"BUSINESS":"ELEVATOR", "mon"+ind+"@monsanto.com", 0, null));
        }
        return contactInfo;
    }

    private ContactInfo getMockUpdateContactInfo(long contactId, String firstName, String lastName, String title) {
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setContactId(contactId);
        contactInfo.setFirstName(firstName);
        contactInfo.setLastName(lastName);
        contactInfo.setJobTitle(title);
        return contactInfo;
    }

    private ContactEmailInfo getContactEmail(String emType, String emAddress, long contactId, String databaseAction) {
        ContactEmailInfo emailInfo = new ContactEmailInfo();
        emailInfo.setEmailType(emType);
        emailInfo.setEmailAddress(emAddress);
        emailInfo.setContactId(contactId);
        emailInfo.setDatabaseAction(databaseAction);
        return emailInfo;
    }

    private ContactPhoneInfo getContactPhone(String phType, String phNumber, String phExt, long contactId, String databaseAction) {
        ContactPhoneInfo phoneInfo = new ContactPhoneInfo();
        phoneInfo.setPhoneType(phType);
        phoneInfo.setPhoneNumber(phNumber);
        phoneInfo.setPhoneExtension(phExt);
        phoneInfo.setContactId(contactId);
        phoneInfo.setDatabaseAction(databaseAction);
        return phoneInfo;
    }

    private ContactPhoneNumberType getContactPhoneNumberType(PhoneNumberEnumType phType, String phNumber, String phExt) throws Exception {
        ContactPhoneNumberType contactPhone = new ContactPhoneNumberType();
        contactPhone.setType(phType);
        contactPhone.setPhoneNumber(phNumber);
        contactPhone.setExtension(phExt);
        return contactPhone;
    }

    private ContactEmailType getContactEmailType(EmailEnumType emType, String emailAddr) throws Exception {
        ContactEmailType contactEmail = new ContactEmailType();
        contactEmail.setType(emType);
        contactEmail.setValue(emailAddr);
        return contactEmail;
    }

    private UpdateContactsRequestType getUpdateContactRequestType(int accountId, int contactCount, boolean isValid) throws Exception {
        UpdateContactsRequestType updateRequest = new UpdateContactsRequestType();
        updateRequest.setHeader(getValidHeader("TEST-123", "MKUCHIP-TEST"));
        UpdateContactsRequestBodyType requestBody = new UpdateContactsRequestBodyType();
        requestBody.setAccountId(accountId);
        PersistableContactListType contactList = new PersistableContactListType();
        for (int index = 0; index < contactCount; index++) {
            contactList.getContactInfo().add(getPersistableContactInfo("first"+index, "last"+index, "title"+index, 110+index, 1, 1));
        }
        if(isValid) {
            requestBody.setContactList(contactList);
        }
        updateRequest.setUpdateContactsRequestBody(requestBody);
        return updateRequest;
    }

    private PersistableContactInfoType getPersistableContactInfo(String fName, String last, String title, int contactId, int phCount, int emailCount) throws Exception {
        PersistableContactInfoType contactInfo = new PersistableContactInfoType();
        contactInfo.setFirstName(fName);
        contactInfo.setLastName(last);
        contactInfo.setJobTitle(title);
        contactInfo.setContactId(contactId);
        PersistableContactPhoneNumberListType phoneList = new PersistableContactPhoneNumberListType();
        for (int index = 0; index < phCount; index++) {
            phoneList.getContactPhoneNumber().add(getPersistableContactPhone(index==0?DatabaseActionType.INSERT:DatabaseActionType.UPDATE, index==0?PhoneNumberEnumType.BUSINESS:PhoneNumberEnumType.CELL, "3146942000", "0"));
        }
        PersistableEmailAddressListType emailList = new PersistableEmailAddressListType();
        for (int index = 0; index < emailCount; index++) {
            emailList.getEmailAddress().add(getPersistableContactEmail(index==0?DatabaseActionType.INSERT:DatabaseActionType.UPDATE, index==0?EmailEnumType.BUSINESS:EmailEnumType.ELEVATOR, "mon"+index+"@monsanto.com"));
        }
        contactInfo.setPhoneNumberList(phoneList);
        contactInfo.setEmailAddressList(emailList);
        return contactInfo;
    }
    
    private PersistableContactPhoneNumberType getPersistableContactPhone(DatabaseActionType action, PhoneNumberEnumType phType, String phNum, String phExt) throws Exception {
        PersistableContactPhoneNumberType phoneNumber = new PersistableContactPhoneNumberType();
        phoneNumber.setAction(action);
        phoneNumber.setPhoneNumber(phNum);
        phoneNumber.setType(phType);
        phoneNumber.setExtension(phExt);
        return phoneNumber;
    }
    
    private PersistableContactEmailType getPersistableContactEmail(DatabaseActionType action, EmailEnumType emType, String emailAddr) throws Exception {
        PersistableContactEmailType contactEmail = new PersistableContactEmailType();
        contactEmail.setAction(action);
        contactEmail.setType(emType);
        contactEmail.setValue(emailAddr);
        return contactEmail;
    }


    



}

package com.monsanto.irdsoapservices.at;

import com.monsanto.irdsoapservices.client.*;
import com.monsanto.irdsoapservices.clientutil.ClientFactory;
import com.monsanto.irdsoapservices.clientutil.EnvironmentEnum;
import com.monsanto.irdsoapservices.at.AbstractAcceptanceTestCase;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 25, 2009
 * Time: 3:39:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Contacts_AT extends AbstractAcceptanceTestCase {

    private AccountInformationService_Service acctInfoService = null;
    protected AccountInformationService acctInfoClient = null;

    @Override
    protected void doSetUp() throws Exception {
        acctInfoService = ClientFactory.getAccountInformationClient(EnvironmentEnum.DEV_EXT, USER_NAME, PASSWORD);
        acctInfoClient = acctInfoService.getAccountInformationServicePort();
    }
        
    public void testGetContacts_invalidRequest_throwError() {
        try {
            acctInfoClient.getContacts(createGetContactsRequest(false, GROWER_ACCT_ID));
            fail("Exception should have occurrred");
        } catch (Exception e) {
            assertSoapException(e, "Schema validation errors");
        }
    }

//    public void testGetContacts_validRequest_invalidGrowerAccountId_throwError() {
//        try {
//            acctInfoClient.getContacts(createGetContactsRequest(true, 0));
//            fail("Exception should have occurrred");
//        } catch (Exception e) {
//            assertSoapException(e, "An error occurred");
//        }
//    }


    private void removeContactsForAccount10() throws Exception {
//        GetContactsResponseType response = acctInfoClient.getContacts(createGetContactsRequest(true, GROWER_ACCT_ID));
//        for (int index = 0; index < response.getGetContactsResponseBody().getContactInfo().size(); index++) {
//            ContactInfoType contact =  response.getGetContactsResponseBody().getContactInfo().get(index);
//            SaveContactsResponseType saveResponse = acctInfoClient.saveContacts(createSaveContactsRequest(GROWER_ACCT_ID, DatabaseActionType.DELETE, contact.getContactId(), ))
//
//        }
    }



    private SaveContactsRequestType createSaveContactsRequest(long growerAcctId, DatabaseActionType dbAction, long contactId, String contactType, String firstName, String lastName, String jobTitle) throws Exception {
        SaveContactsRequestType request = new SaveContactsRequestType();
        SaveContactsRequestBodyType requestBody = new SaveContactsRequestBodyType();
        requestBody.setGrowerAccountId(growerAcctId);
        PersistableContactInfoType contact = new PersistableContactInfoType();
        contact.setDatabaseAction(dbAction);
        ContactInfoType contactInfo = new ContactInfoType();
        contactInfo.setContactId(contactId);
        contactInfo.setContactType(contactType);
        contactInfo.setFirstName(firstName);
        contactInfo.setLastName(lastName);
        contactInfo.setJobTitle(jobTitle);
        contactInfo.setPhoneNumberList(getPhoneNumbers(1, new PhoneNumberType[]{PhoneNumberType.BUSINESS}));
        contactInfo.setEmailAddressList(getEmails(1, new EmailType[]{EmailType.BUSINESS}));
        contact.setContactInfo(contactInfo);
        requestBody.getPersistableContact().add(contact);
        request.setHeader(getHeaderType());
        request.setSaveContactsRequestBody(requestBody);
        return request;
    }

    private ContactPhoneNumberListType getPhoneNumbers(int count, PhoneNumberType[] types) throws Exception {
        ContactPhoneNumberListType phList = new ContactPhoneNumberListType();
        for (int index = 0; index < count; index++) {
            ContactPhoneNumberType phone = new ContactPhoneNumberType();
            phone.setType(types[index]);
            phone.setPhoneNumber("314694205"+index);
            phone.setExtension("12"+index);
            phList.getContactPhoneNumber().add(phone);
        }
        return phList;
    }

    private EmailAddressListType getEmails(int count, EmailType[] types) throws Exception {
        EmailAddressListType emailList = new EmailAddressListType();
        for (int index = 0; index < count; index++) {
            EmailAddressType email = new EmailAddressType();
            email.setType(types[index]);
            email.setValue("mkuchip@monsanto.com"+index);
        }
        return emailList;
    }


    private GetContactsRequestType createGetContactsRequest(boolean isValid, long accountId) throws Exception {
        GetContactsRequestType request = new GetContactsRequestType();
        GetContactsRequestBodyType requestBody = new GetContactsRequestBodyType();
        requestBody.setGrowerAccountId(accountId);
        requestBody.setContactType("INFLUEN");
        if(isValid) {
            request.setHeader(getHeaderType());
        }
        request.setGetContactsRequestBody(requestBody);
        return request;
    }

}

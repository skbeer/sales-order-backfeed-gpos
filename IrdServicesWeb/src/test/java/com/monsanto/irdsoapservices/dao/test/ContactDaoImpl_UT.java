package com.monsanto.irdsoapservices.dao.test;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;
import com.monsanto.irdsoapservices.dao.ContactDao;
import com.monsanto.irdsoapservices.to.ContactInfo;
import com.monsanto.irdsoapservices.to.ContactPhoneInfo;
import com.monsanto.irdsoapservices.to.ContactEmailInfo;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Nov 3, 2009
 * Time: 3:29:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class ContactDaoImpl_UT extends AbstractTransactionalDataSourceSpringContextTests {
    ContactDao contactDao = null;
    long testContactId = 0;
    ContactInfo testContactInfo = null;
    List<String> contactFunctions = new ArrayList<String>();

    public void testGetContacts_byAccountId_noData() throws Exception {
        insertTestContacts(102030);
        contactFunctions.add("GPOS");
        List<ContactInfo> contacts = contactDao.getContacts(102030, 0, contactFunctions);
        assertEquals(0, contacts.size());
    }

    public void testGetContacts_byAccountId_withData() throws Exception {
        insertTestContacts(102030);
        contactFunctions.add("SDTRT");
        List<ContactInfo> contacts = contactDao.getContacts(102030, 0, contactFunctions);
        assertEquals(1, contacts.size());
        ContactInfo contactInfo = contacts.get(0);
        assertTestContactInfo(contactInfo);
    }

    public void testGetContacts_byContactId_withData() throws Exception {
        insertTestContacts(102030);
        contactFunctions.add("SDTRT");
        List<ContactInfo> contacts = contactDao.getContacts(0, testContactId, contactFunctions);
        assertEquals(1, contacts.size());
        ContactInfo contactInfo = contacts.get(0);
        assertTestContactInfo(contactInfo);
    }

    public void testInsertContact_noPhoneorEmail() throws Exception {
        testContactId = setUpTestContact(0);
        assertContactInfo(testContactId, testContactInfo, 5180, "John", "Smith", "Manager", 1, "OWNEROP", 0, 0);
    }

    public void testInsertContact_1_Phone_and_Email() throws Exception {
        testContactId = setUpTestContact(1);
        assertContactInfo(testContactId, testContactInfo, 5180, "John", "Smith", "Manager", 1, "OWNEROP", 1, 1);
        assertPhoneNumberInfo(testContactInfo, 0, "BUSINESS", "0", "3146942000");
        assertEmailInfo(testContactInfo, 0, "BUSINESS", "mon0@monsanto.com");
    }
    
    public void testInsertContact_2_Phone_and_Email() throws Exception {
        testContactId = setUpTestContact(2);
        assertContactInfo(testContactId, testContactInfo, 5180, "John", "Smith", "Manager", 1, "OWNEROP", 2, 2);
        assertPhoneNumberInfo(testContactInfo, 0, "BUSINESS", "0", "3146942000");
        assertPhoneNumberInfo(testContactInfo, 1, "FAX", "1", "3146942001");
        assertEmailInfo(testContactInfo, 0, "BUSINESS", "mon0@monsanto.com");
        assertEmailInfo(testContactInfo, 1, "ELEVATOR", "mon1@monsanto.com");
    }

    public void testUpdateContactInfo_without_PhoneNumbersAndEmailAddresses() throws Exception {
        testContactId = setUpTestContact(0);
        assertContactInfo(testContactId, testContactInfo, 5180, "John", "Smith", "Manager", 1, "OWNEROP", 0, 0);
        ContactInfo newContactInfo = getMockUpdateContactInfo(testContactId, "Jason", "Bourne", "Spy");
        contactDao.updateContactInfo(newContactInfo);
        testContactInfo = contactDao.getContacts(0, testContactId, null).get(0);
        assertNotNull(testContactInfo);
        assertContactInfo(testContactId, testContactInfo, 5180, "Jason", "Bourne", "Spy", 1, "OWNEROP", 0, 0);
    }

    public void testUpdateContactInfo_Insert_PhoneNumbersAndEmailAddresses() throws Exception {
        testContactId = setUpTestContact(0);
        assertContactInfo(testContactId, testContactInfo, 5180, "John", "Smith", "Manager", 1, "OWNEROP", 0, 0);
        ContactInfo newContactInfo = getMockUpdateContactInfo(testContactId, "Jason", "Bourne", "Spy");
        newContactInfo.getPhoneNumbers().add(getContactPhone("BUSINESS", "3146942000", "0", testContactId, "INSERT"));
        newContactInfo.getEmailAddresses().add(getContactEmail("BUSINESS", "mon0@monsanto.com", testContactId, "INSERT"));
        contactDao.updateContactInfo(newContactInfo);
        testContactInfo = contactDao.getContacts(0, testContactId, null).get(0);
        assertNotNull(testContactInfo);
        assertContactInfo(testContactId, testContactInfo, 5180, "Jason", "Bourne", "Spy", 1, "OWNEROP", 1, 1);
        assertPhoneNumberInfo(testContactInfo, 0, "BUSINESS", "0", "3146942000");
        assertEmailInfo(testContactInfo, 0, "BUSINESS", "mon0@monsanto.com");
    }

    public void testUpdateContactInfo_Update_PhoneNumbersAndEmailAddresses() throws Exception {
        testContactId = setUpTestContact(1);
        assertContactInfo(testContactId, testContactInfo, 5180, "John", "Smith", "Manager", 1, "OWNEROP", 1, 1);
        assertPhoneNumberInfo(testContactInfo, 0, "BUSINESS", "0", "3146942000");
        assertEmailInfo(testContactInfo, 0, "BUSINESS", "mon0@monsanto.com");
        
        ContactInfo newContactInfo = getMockUpdateContactInfo(testContactId, "Jason", "Bourne", "Spy");
        newContactInfo.getPhoneNumbers().add(getContactPhone("BUSINESS", "3146942053", "1", testContactId, "UPDATE"));
        newContactInfo.getEmailAddresses().add(getContactEmail("BUSINESS", "mkuchip@monsanto.com", testContactId, "UPDATE"));
        contactDao.updateContactInfo(newContactInfo);
        testContactInfo = contactDao.getContacts(0, testContactId, null).get(0);
        assertNotNull(testContactInfo);
        assertContactInfo(testContactId, testContactInfo, 5180, "Jason", "Bourne", "Spy", 1, "OWNEROP", 1, 1);
        assertPhoneNumberInfo(testContactInfo, 0, "BUSINESS", "1", "3146942053");
        assertEmailInfo(testContactInfo, 0, "BUSINESS", "mkuchip@monsanto.com");
    }

    public void testUpdateContactInfo_Delete_PhoneNumbersAndEmailAddresses() throws Exception {
        testContactId = setUpTestContact(1);
        assertContactInfo(testContactId, testContactInfo, 5180, "John", "Smith", "Manager", 1, "OWNEROP", 1, 1);
        assertPhoneNumberInfo(testContactInfo, 0, "BUSINESS", "0", "3146942000");
        assertEmailInfo(testContactInfo, 0, "BUSINESS", "mon0@monsanto.com");
        
        ContactInfo newContactInfo = getMockUpdateContactInfo(testContactId, "Jason", "Bourne", "Spy");
        newContactInfo.getPhoneNumbers().add(getContactPhone("BUSINESS", "3146942053", "1", testContactId, "DELETE"));
        newContactInfo.getEmailAddresses().add(getContactEmail("BUSINESS", "mkuchip@monsanto.com", testContactId, "DELETE"));
        contactDao.updateContactInfo(newContactInfo);
        testContactInfo = contactDao.getContacts(0, testContactId, null).get(0);
        assertNotNull(testContactInfo);
        assertContactInfo(testContactId, testContactInfo, 5180, "Jason", "Bourne", "Spy", 1, "OWNEROP", 0, 0);

    }

    public void testUpdateContactInfo_Insert_Update_and_Delete_PhoneNumbersAndEmailAddresses() throws Exception {
        testContactId = setUpTestContact(2);
        assertContactInfo(testContactId, testContactInfo, 5180, "John", "Smith", "Manager", 1, "OWNEROP", 2, 2);
        assertPhoneNumberInfo(testContactInfo, 0, "BUSINESS", "0", "3146942000");
        assertPhoneNumberInfo(testContactInfo, 1, "FAX", "1", "3146942001");
        assertEmailInfo(testContactInfo, 0, "BUSINESS", "mon0@monsanto.com");
        assertEmailInfo(testContactInfo, 1, "ELEVATOR", "mon1@monsanto.com");

        ContactInfo newContactInfo = getMockUpdateContactInfo(testContactId, "Jason", "Bourne", "Spy");
        newContactInfo.getPhoneNumbers().add(getContactPhone("BUSINESS", "3146942053", "1", testContactId, "UPDATE"));
        newContactInfo.getPhoneNumbers().add(getContactPhone("CELL", "6366942053", "2", testContactId, "INSERT"));
        newContactInfo.getPhoneNumbers().add(getContactPhone("FAX", "", "1", testContactId, "DELETE"));
        newContactInfo.getEmailAddresses().add(getContactEmail("BUSINESS", "mkuchip@monsanto.com", testContactId, "UPDATE"));
        newContactInfo.getEmailAddresses().add(getContactEmail("ELEVATOR", "", testContactId, "DELETE"));
        contactDao.updateContactInfo(newContactInfo);
        testContactInfo = contactDao.getContacts(0, testContactId, null).get(0);
        assertNotNull(testContactInfo);
        assertContactInfo(testContactId, testContactInfo, 5180, "Jason", "Bourne", "Spy", 1, "OWNEROP", 2, 1);
        assertPhoneNumberInfo(testContactInfo, 0, "BUSINESS", "1", "3146942053");
        assertPhoneNumberInfo(testContactInfo, 1, "CELL", "2", "6366942053");
        assertEmailInfo(testContactInfo, 0, "BUSINESS", "mkuchip@monsanto.com");
    }

    public void testUpdateContact_Insert_duplicatePhoneNumber_throwError() throws Exception {
        testContactId = setUpTestContact(1);
        assertContactInfo(testContactId, testContactInfo, 5180, "John", "Smith", "Manager", 1, "OWNEROP", 1, 1);
        assertPhoneNumberInfo(testContactInfo, 0, "BUSINESS", "0", "3146942000");

        ContactInfo newContactInfo = getMockUpdateContactInfo(testContactId, "Jason", "Bourne", "Spy");
        newContactInfo.getPhoneNumbers().add(getContactPhone("BUSINESS", "3146942053", "1", testContactId, "INSERT"));

        try {
            contactDao.updateContactInfo(newContactInfo);
            fail("Exception should have occurred");
        } catch (Exception e) {
            assertEquals("BUSINESS PhoneNumber already exists for ContactId:"+testContactId, e.getMessage());
        }
    }

    public void testUpdateContact_Update_nonExistingPhoneType_throwError() throws Exception {
        testContactId = setUpTestContact(1);
        assertContactInfo(testContactId, testContactInfo, 5180, "John", "Smith", "Manager", 1, "OWNEROP", 1, 1);
        assertPhoneNumberInfo(testContactInfo, 0, "BUSINESS", "0", "3146942000");

        ContactInfo newContactInfo = getMockUpdateContactInfo(testContactId, "Jason", "Bourne", "Spy");
        newContactInfo.getPhoneNumbers().add(getContactPhone("CELL", "3146942053", "1", testContactId, "UPDATE"));

        try {
            contactDao.updateContactInfo(newContactInfo);
            fail("Exception should have occurred");
        } catch (Exception e) {
            assertEquals("Unable to find CELL PhoneNumber for ContactId:"+testContactId, e.getMessage());
        }
    }

    public void testUpdateContact_Insert_duplicateEmailAddress_throwError() throws Exception {
        testContactId = setUpTestContact(1);
        assertContactInfo(testContactId, testContactInfo, 5180, "John", "Smith", "Manager", 1, "OWNEROP", 1, 1);
        assertEmailInfo(testContactInfo, 0, "BUSINESS", "mon0@monsanto.com");

        ContactInfo newContactInfo = getMockUpdateContactInfo(testContactId, "Jason", "Bourne", "Spy");
        newContactInfo.getEmailAddresses().add(getContactEmail("BUSINESS", "mkuchip@monsanto.com", testContactId, "INSERT"));

        try {
            contactDao.updateContactInfo(newContactInfo);
            fail("Exception should have occurred");
        } catch (Exception e) {
            assertEquals("BUSINESS EmailAddress already exists for ContactId:"+testContactId, e.getMessage());
        }
    }

    public void testUpdateContact_Update_nonExistingEmailAddress_throwError() throws Exception {
        testContactId = setUpTestContact(1);
        assertContactInfo(testContactId, testContactInfo, 5180, "John", "Smith", "Manager", 1, "OWNEROP", 1, 1);
        assertEmailInfo(testContactInfo, 0, "BUSINESS", "mon0@monsanto.com");

        ContactInfo newContactInfo = getMockUpdateContactInfo(testContactId, "Jason", "Bourne", "Spy");
        newContactInfo.getEmailAddresses().add(getContactEmail("ELEVATOR", "mkuchip@monsanto.com", testContactId, "UPDATE"));

        try {
            contactDao.updateContactInfo(newContactInfo);
            fail("Exception should have occurred");
        } catch (Exception e) {
            assertEquals("Unable to find ELEVATOR EmailAddress for ContactId:"+testContactId, e.getMessage());
        }
    }

    private long setUpTestContact(int numberOfPhonesEmails) throws Exception {
        long contactId = contactDao.insertContactInfo(getMockContactInfo(numberOfPhonesEmails, "OWNEROP", "John", "Smith", "Manager", 5180));
        assertTrue(contactId > 0);
        testContactInfo = contactDao.getContacts(0, contactId, null).get(0);
        assertNotNull(testContactInfo);
        return contactId;
    }

    private void insertTestContacts(int accountId) throws Exception {
        testContactId = contactDao.insertContactInfo(getMockContactInfo(2, "SDTRT", "John", "Smith", "Officer", accountId));
    }

    private void assertTestContactInfo(ContactInfo contactInfo) {
        assertContactInfo(testContactId, contactInfo, 102030, "John", "Smith", "Officer", 1, "SDTRT", 2, 2);
        assertPhoneNumberInfo(contactInfo, 0, "BUSINESS", "0", "3146942000");
        assertPhoneNumberInfo(contactInfo, 1, "FAX", "1", "3146942001");
        assertEmailInfo(contactInfo, 0, "BUSINESS", "mon0@monsanto.com");
        assertEmailInfo(contactInfo, 1, "ELEVATOR", "mon1@monsanto.com");
    }

    private void assertEmailInfo(ContactInfo contactInfo, int index, String type, String email) {
        assertEquals(type, contactInfo.getEmailAddresses().get(index).getEmailType());
        assertEquals(email, contactInfo.getEmailAddresses().get(index).getEmailAddress());
    }

    private void assertPhoneNumberInfo(ContactInfo contactInfo, int index, String type, String extension, String number) {
        assertEquals(type, contactInfo.getPhoneNumbers().get(index).getPhoneType());
        assertEquals(extension, contactInfo.getPhoneNumbers().get(index).getPhoneExtension());
        assertEquals(number, contactInfo.getPhoneNumbers().get(index).getPhoneNumber());
    }

    private void assertContactInfo(long contactId, ContactInfo contactInfo, long accountId, String firsName, String lastname, String title, int functionCount, String firstFunction, int phoneCount, int emailCount) {
        assertEquals(accountId, contactInfo.getAccountId());
        assertEquals(contactId, contactInfo.getContactId());
        assertEquals(firsName, contactInfo.getFirstName());
        assertEquals(lastname, contactInfo.getLastName());
        assertEquals(title, contactInfo.getJobTitle());
        assertEquals(functionCount, contactInfo.getContactFunctions().size());
        assertEquals(firstFunction, contactInfo.getContactFunctions().get(0));
        assertEquals(phoneCount, contactInfo.getPhoneNumbers().size());
        assertEquals(emailCount, contactInfo.getEmailAddresses().size());
    }

    private ContactInfo getMockContactInfo(int count, String contactType, String firstName, String lastName, String jobTitle, int accountId) {
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setAccountId(accountId);
        contactInfo.setContactType(contactType);
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



    @Override
    protected void onSetUp() throws Exception {
        super.onSetUp();
        contactDao = (ContactDao)getApplicationContext().getBean("contactsDao");
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[] { "test-irdpos-beans.xml" };
    }


}

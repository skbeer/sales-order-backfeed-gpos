package com.monsanto.irdsoapservices.dao.test;

import com.monsanto.irdsoapservices.dao.impl.IrdDaoImpl;
import com.monsanto.irdsoapservices.to.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 17, 2009
 * To change this template use File | Settings | File Templates.
 */
public class IrdDaoImpl_UT extends AbstractTransactionalDataSourceSpringContextTests {
	Resource resource = null;
	BeanFactory beanFactory = null;
	IrdDaoImpl irdDao = null;

	public void testGetAttributes_notFound_returnEmptyList() throws Exception {
		List<AcctToAttr> flags = irdDao.getAttributesByAcctId(10);
		assertNotNull(flags);
		assertEquals(0, flags.size());
	}

	public void testGetAttributes_happyPath() throws Exception {
		List<AcctToAttr> attrs = irdDao.getAttributesByAcctId(10);
		assertEquals(0, attrs.size());
		AcctToAttr acctAttr = getSampleAcctToAttr("ASI", 10);
		irdDao.insertAccountAttribute(acctAttr);
		attrs = irdDao.getAttributesByAcctId(10);
		assertEquals(1, attrs.size());
		assertEquals("ASI", attrs.get(0).getAttrCode());
		assertEquals(10, attrs.get(0).getAccountId());

		irdDao.deleteAccountAttribute(acctAttr);
		attrs = irdDao.getAttributesByAcctId(10);
		assertEquals(0, attrs.size());
	}

    public void testAccoutByAlias() throws Exception {
        assertEquals(5180, irdDao.getAccountIdByAlias("SAP", "0001013083"));
        assertEquals(5180, irdDao.getAccountIdByAlias("IC", "0576403930000"));
        assertEquals(5180, irdDao.getAccountIdByAlias("GLN", "0629245000011"));
        assertEquals(0, irdDao.getAccountIdByAlias("IC", "9999999"));
    }    

	public void testGetGrowerContacts_ByAcctId() throws Exception {
		ContactInfo contact = getSampleContactInfo("INFLUEN", 10);
		contact.getPhoneNumbers().add(getContactPhone("BUSINESS", "3146942053", "123", 0));
		contact.getEmailAddresses().add(getContactEmail("BUSINESS", "abc@xyz.com", 0));
		irdDao.insertContactInfo(contact);
		ContactInfo cInfo = irdDao.getContactsByAcctId(10, "INFLUEN").get(0);
		assertNotNull(cInfo);
		assertEquals("INFLUEN", cInfo.getContactType());
		assertEquals("John", cInfo.getFirstName());
		assertEquals("Smith", cInfo.getLastName());
		assertEquals("Locksmith", cInfo.getJobTitle());
		assertEquals(10, cInfo.getGrowerAccountId());
		assertEquals(1, cInfo.getPhoneNumbers().size());
		assertEquals(1, cInfo.getEmailAddresses().size());
		assertEquals("3146942053", cInfo.getPhoneNumbers().get(0).getPhoneNumber());
		assertEquals("123", cInfo.getPhoneNumbers().get(0).getPhoneExtension());
		assertEquals("abc@xyz.com", cInfo.getEmailAddresses().get(0).getEmailAddress());
		irdDao.deleteContactInfo(contact);
		assertEquals(0, irdDao.getContactsByAcctId(10, "INFLUEN").size());
	}

	public void testInsertContactInfo() throws Exception {
		ContactInfo contact = getSampleContactInfo("INFLUEN", 10);
		contact.getPhoneNumbers().add(getContactPhone("BUSINESS", "3146942053", "123", 0));
		contact.getEmailAddresses().add(getContactEmail("BUSINESS", "abc@xyz.com", 0));
		irdDao.insertContactInfo(contact);
		ContactInfo cInfo = irdDao.getContactsByAcctId(10, "INFLUEN").get(0);
		assertNotNull(cInfo);
		System.out.println(cInfo);
		assertNotNull(cInfo.getContactId());
		assertContact(cInfo, "INFLUEN", "John", "Smith", "Locksmith");
		assertEquals(1, cInfo.getPhoneNumbers().size());
		assertEquals(1, cInfo.getEmailAddresses().size());
		assertPhoneInfo(cInfo, 0, "BUSINESS", "3146942053", "123");
		assertEmailInfo(cInfo, 0, "BUSINESS", "abc@xyz.com");
	}

	public void testGetContactsByContactId() throws Exception {
		ContactInfo contact = getSampleContactInfo("INFLUEN", 10);
		contact.getPhoneNumbers().add(getContactPhone("BUSINESS", "3146942053", "123", 0));
		contact.getEmailAddresses().add(getContactEmail("BUSINESS", "abc@xyz.com", 0));
		irdDao.insertContactInfo(contact);
		ContactInfo cInfo = irdDao.getContactByContactId(contact.getContactId(), "INFLUEN");
		assertNotNull(cInfo);
		System.out.println(cInfo);
		assertNotNull(cInfo.getContactId());
		assertContact(cInfo, "INFLUEN", "John", "Smith", "Locksmith");
		assertEquals(1, cInfo.getPhoneNumbers().size());
		assertEquals(1, cInfo.getEmailAddresses().size());
		assertPhoneInfo(cInfo, 0, "BUSINESS", "3146942053", "123");
		assertEmailInfo(cInfo, 0, "BUSINESS", "abc@xyz.com");
	}

	public void testUpdateContactInfo_Influencer_updatePhoneNumber() throws Exception {
		ContactInfo contact = getSampleContactInfo("INFLUEN", 10);
		contact.getPhoneNumbers().add(getContactPhone("BUSINESS", "3146942053", "123", 0));
		contact.getEmailAddresses().add(getContactEmail("BUSINESS", "abc@xyz.com", 0));
		irdDao.insertContactInfo(contact);
		contact = irdDao.getContactsByAcctId(10, "INFLUEN").get(0);
		ContactPhoneInfo phInfo = contact.getPhoneNumbers().get(0);
		phInfo.setPhoneNumber("4136943502");
		phInfo.setPhoneExtension("321");
		contact.setFirstName("Daniel");
		irdDao.updateContactInfo(contact, contact.getContactType());
		ContactInfo cInfo = irdDao.getContactsByAcctId(10, "INFLUEN").get(0);
		System.out.println(cInfo);
		assertNotNull(cInfo.getContactId());
		assertContact(cInfo, "INFLUEN", "Daniel", "Smith", "Locksmith");
		assertEquals(1, cInfo.getPhoneNumbers().size());
		assertEquals(1, cInfo.getEmailAddresses().size());
		assertPhoneInfo(cInfo, 0, "BUSINESS", "4136943502", "321");
		assertEmailInfo(cInfo, 0, "BUSINESS", "abc@xyz.com");
	}

	public void testUpdateContactInfo_Primary_updatePhoneNumber() throws Exception {
		ContactInfo contact = getSampleContactInfo("PRIMARY", 10);
		contact.getPhoneNumbers().add(getContactPhone("BUSINESS", "3146942053", "123", 0));
		contact.getEmailAddresses().add(getContactEmail("BUSINESS", "abc@xyz.com", 0));
		irdDao.insertContactInfo(contact);
		contact = irdDao.getContactsByAcctId(10, "PRIMARY").get(0);
		ContactPhoneInfo phInfo = contact.getPhoneNumbers().get(0);
		phInfo.setPhoneNumber("4136943555");
		phInfo.setPhoneExtension("321");
		contact.setFirstName("Daniel");
		irdDao.updateContactInfo(contact, contact.getContactType());
		ContactInfo cInfo = irdDao.getContactsByAcctId(10, "PRIMARY").get(0);
		System.out.println(cInfo);
		assertNotNull(cInfo.getContactId());
		assertContact(cInfo, "PRIMARY", "John", "Smith", "Locksmith");
		assertEquals(1, cInfo.getPhoneNumbers().size());
		assertEquals(1, cInfo.getEmailAddresses().size());
		assertPhoneInfo(cInfo, 0, "BUSINESS", "4136943555", "321");
		assertEmailInfo(cInfo, 0, "BUSINESS", "abc@xyz.com");
	}

	public void testUpdateContactInfo_Influencer_updateEmail() throws Exception {
		ContactInfo contact = getSampleContactInfo("INFLUEN", 10);
		contact.getPhoneNumbers().add(getContactPhone("BUSINESS", "3146942053", "123", 0));
		contact.getEmailAddresses().add(getContactEmail("BUSINESS", "abc@xyz.com", 0));
		irdDao.insertContactInfo(contact);
		contact = irdDao.getContactsByAcctId(10, "INFLUEN").get(0);
		ContactEmailInfo phInfo = contact.getEmailAddresses().get(0);
		phInfo.setEmailAddress("def@xyz.com");
		contact.setFirstName("Daniel");
		irdDao.updateContactInfo(contact, contact.getContactType());
		ContactInfo cInfo = irdDao.getContactsByAcctId(10, "INFLUEN").get(0);
		System.out.println(cInfo);
		assertNotNull(cInfo.getContactId());
		assertContact(cInfo, "INFLUEN", "Daniel", "Smith", "Locksmith");
		assertEquals(1, cInfo.getPhoneNumbers().size());
		assertEquals(1, cInfo.getEmailAddresses().size());
		assertPhoneInfo(cInfo, 0, "BUSINESS", "3146942053", "123");
		assertEmailInfo(cInfo, 0, "BUSINESS", "def@xyz.com");
	}

	public void testUpdateContactInfo_addNewPhoneAndEmail() throws Exception {
		ContactInfo contact = getSampleContactInfo("INFLUEN", 10);
		contact.getPhoneNumbers().add(getContactPhone("BUSINESS", "3146942053", "123", 0));
		contact.getEmailAddresses().add(getContactEmail("BUSINESS", "abc@xyz.com", 0));
		irdDao.insertContactInfo(contact);
		contact = irdDao.getContactsByAcctId(10, "INFLUEN").get(0);
		contact.setFirstName("Daniel");
		contact.setLastName("Ocean");
		contact.setJobTitle("Cop");
		contact.getPhoneNumbers().add(getContactPhone("CELL", "3106589874", null, contact.getContactId()));
		contact.getEmailAddresses().add(getContactEmail("ELEVATOR", "elevator@xyz.com", contact.getContactId()));
		irdDao.updateContactInfo(contact, contact.getContactType());
		ContactInfo cInfo = irdDao.getContactsByAcctId(10, "INFLUEN").get(0);
		System.out.println(cInfo);
		assertNotNull(cInfo.getContactId());
		assertContact(cInfo, "INFLUEN", "Daniel", "Ocean", "Cop");
		assertEquals(2, cInfo.getPhoneNumbers().size());
		assertEquals(2, cInfo.getEmailAddresses().size());
		assertPhoneInfo(cInfo, 0, "BUSINESS", "3146942053", "123");
		assertPhoneInfo(cInfo, 1, "CELL", "3106589874", null);
		assertEmailInfo(cInfo, 0, "BUSINESS", "abc@xyz.com");
		assertEmailInfo(cInfo, 1, "ELEVATOR", "elevator@xyz.com");
	}

	public void testUpdateContactInfo_deletePhoneAndEmail() throws Exception {
		ContactInfo contact = getSampleContactInfo("INFLUEN", 10);
		contact.getPhoneNumbers().add(getContactPhone("BUSINESS", "3146942053", "123", 0));
		contact.getEmailAddresses().add(getContactEmail("BUSINESS", "abc@xyz.com", 0));
		irdDao.insertContactInfo(contact);
		contact = irdDao.getContactsByAcctId(10, "INFLUEN").get(0);
		contact.setFirstName("Daniel");
		contact.setLastName("Ocean");
		contact.setJobTitle("Cop");
		contact.getPhoneNumbers().get(0).setPhoneNumber(null);
		contact.getEmailAddresses().get(0).setEmailAddress(null);
		irdDao.updateContactInfo(contact, contact.getContactType());
		ContactInfo cInfo = irdDao.getContactsByAcctId(10, "INFLUEN").get(0);
		System.out.println(cInfo);
		assertNotNull(cInfo.getContactId());
		assertContact(cInfo, "INFLUEN", "Daniel", "Ocean", "Cop");
		assertEquals(0, cInfo.getPhoneNumbers().size());
		assertEquals(0, cInfo.getEmailAddresses().size());
	}

	public void testDeleteContactInfo() throws Exception {
		ContactInfo contact = getSampleContactInfo("INFLUEN", 10);
		contact.getPhoneNumbers().add(getContactPhone("BUSINESS", "3146942053", "123", 0));
		contact.getEmailAddresses().add(getContactEmail("BUSINESS", "abc@xyz.com", 0));
		irdDao.insertContactInfo(contact);
		ContactInfo cInfo = irdDao.getContactsByAcctId(10, "INFLUEN").get(0);
		assertNotNull(cInfo);
		irdDao.deleteContactInfo(contact);
		assertEquals(0, irdDao.getContactsByAcctId(10, "INFLUEN").size());
	}

	public void testInsertAttributes_valid_insertAttribute() throws Exception {
		List<AcctToAttr> flags = irdDao.getAttributesByAcctId(10);
		assertEquals(0, flags.size());
		AcctToAttr acctAttr = getSampleAcctToAttr("ASI", 10);
		assertEquals(1, irdDao.insertAccountAttribute(acctAttr));
		flags = irdDao.getAttributesByAcctId(10);
		assertEquals(1, flags.size());
		assertEquals("ASI", flags.get(0).getAttrCode());
		assertEquals(10, flags.get(0).getAccountId());
	}

	public void testInsertAttributes_invalidAttrCode_throwException() {
		AcctToAttr acctAttr = getSampleAcctToAttr("GPOS", new Long(10));
		try {
			irdDao.insertAccountAttribute(acctAttr);
			fail("Exception should have occurred");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void testDeleteAttribute() throws Exception {
		AcctToAttr acctAttr = getSampleAcctToAttr("ASI", new Long(10));
		irdDao.insertAccountAttribute(acctAttr);
		List<AcctToAttr> flags = irdDao.getAttributesByAcctId(10);
		assertEquals(1, flags.size());
		irdDao.deleteAccountAttribute(acctAttr);
		flags = irdDao.getAttributesByAcctId(10);
		assertEquals(0, flags.size());
	}

	public void testGetAccountDetails_notFound_returnNull() throws Exception {
		LfaGrowerDetails details = irdDao.getAccountDetails(10);
		assertNull(details);
	}

	public void testGetAccountDetails_happyPath() throws Exception {
		LfaGrowerDetails details = irdDao.getAccountDetails(52827);
		assertNotNull(details);
		assertEquals("Fly Fishing", details.getHobbies());
		assertEquals("FFA", details.getOrganizations());
	}

	public void testSaveAccountDetails_insert() throws Exception {
		LfaGrowerDetails details = irdDao.getAccountDetails(10);
		assertNull(details);
		assertEquals(1, irdDao.saveAccountDetails(getSampleDetails()));
		details = irdDao.getAccountDetails(10);
		assertNotNull(details);
		assertLfaDetails(details, "Spouse_10", "Org_10");
	}

	public void testSaveAccountDetails_update() throws Exception {
		assertEquals(1, irdDao.saveAccountDetails(getSampleDetails()));
		LfaGrowerDetails details = irdDao.getAccountDetails(10);
		assertNotNull(details);
		assertLfaDetails(details, "Spouse_10", "Org_10");
		details = getSampleDetails();
		details.setSpouse("Spouse_10_New");
		details.setOrganizations("Org_10_New");
		assertEquals(1, irdDao.saveAccountDetails(details));
		details = irdDao.getAccountDetails(10);
		assertNotNull(details);
		assertLfaDetails(details, "Spouse_10_New", "Org_10_New");
	}

	public void testDeleteAccountDetails() throws Exception {
		irdDao.saveAccountDetails(getSampleDetails());
		LfaGrowerDetails details = irdDao.getAccountDetails(10);
		assertNotNull(details);

		irdDao.deleteAccountDetails(10);
		details = irdDao.getAccountDetails(10);
		assertNull(details);
	}

    public void testGetAssEmployees_noData_returnBlankList() throws Exception {
        List<EmployeeInfo> employees = irdDao.getAssociatedEmployees(5180);
        assertNotNull(employees);
        assertEquals(0, employees.size());
    }

    public void testGetAssocEmployees_withData_returnEmployeeList() throws Exception {
        List<EmployeeInfo> employees = irdDao.getAssociatedEmployees(5188);
        assertNotNull(employees);
        assertEquals(1, employees.size());
        EmployeeInfo empInfo = employees.get(0);
        assertEquals(5188 ,empInfo.getAccountId());
        assertEquals("CMLUELF", empInfo.getUserId());
        assertEquals("SAM", empInfo.getRoleCode());
        assertEquals("Christine", empInfo.getFirstName());
        assertEquals("Luelf", empInfo.getLastName());
        assertEquals("christine.m.luelf@monsanto.com", empInfo.getEmailAddress());
    }

	private ContactEmailInfo getContactEmail(String emType, String emAddress, long contactId) {
		ContactEmailInfo emailInfo = new ContactEmailInfo();
		emailInfo.setEmailType(emType);
		emailInfo.setEmailAddress(emAddress);
		emailInfo.setContactId(contactId);
		return emailInfo;
	}

	private ContactPhoneInfo getContactPhone(String phType, String phNumber, String phExt, long contactId) {
		ContactPhoneInfo phoneInfo = new ContactPhoneInfo();
		phoneInfo.setPhoneType(phType);
		phoneInfo.setPhoneNumber(phNumber);
		phoneInfo.setPhoneExtension(phExt);
		phoneInfo.setContactId(contactId);
		return phoneInfo;
	}

	private void assertPhoneInfo(ContactInfo cInfo, int index, String phoneType, String phoneNumber, String extension) {
		ContactPhoneInfo phoneInfo = cInfo.getPhoneNumbers().get(index);
		assertNotNull(phoneInfo);
		assertNotNull(phoneInfo.getContactPhoneId());
		assertEquals(phoneType, phoneInfo.getPhoneType());
		assertEquals(phoneNumber, phoneInfo.getPhoneNumber());
		assertEquals(extension, phoneInfo.getPhoneExtension());
	}

	private void assertEmailInfo(ContactInfo cInfo, int index, String emailType, String emailAddress) {
		ContactEmailInfo email = cInfo.getEmailAddresses().get(index);
		assertNotNull(email);
		assertNotNull(email.getContactEmailId());
		assertEquals(emailType, email.getEmailType());
		assertEquals(emailAddress, email.getEmailAddress());
	}

	private void assertContact(ContactInfo cInfo, String contactType, String firstName, String lastName, String jobTitle) {
		assertEquals(contactType, cInfo.getContactType());
		assertEquals(firstName, cInfo.getFirstName());
		assertEquals(lastName, cInfo.getLastName());
		assertEquals(jobTitle, cInfo.getJobTitle());
	}

	private void assertLfaDetails(LfaGrowerDetails details, String spouse, String organizations) {
		assertEquals(10, details.getAccountId());
		assertEquals(spouse, details.getSpouse());
		assertEquals("Family_10", details.getFamily());
		assertEquals("Hobbies_10", details.getHobbies());
		assertEquals(organizations, details.getOrganizations());
		assertEquals("CHEM_Comments_10", details.getChemistryComments());
		assertEquals("Other_Chem_10", details.getOtherChem());
	}

	private AcctToAttr getSampleAcctToAttr(String attrCode, long acctId) {
		AcctToAttr acctAttr = new AcctToAttr();
		acctAttr.setAccountId(acctId);
		acctAttr.setAttrCode(attrCode);
		acctAttr.setOriginalAccountId(acctId);
		acctAttr.setRowEntryDate(new Date());
		acctAttr.setRowModifyDate(new Date());
		acctAttr.setRowTaskId("IRDSoapServices");
		acctAttr.setRowUserId("IRDPOS_USER");
		return acctAttr;
	}

	private LfaGrowerDetails getSampleDetails() {
		LfaGrowerDetails details = new LfaGrowerDetails();
		details.setAccountId(10);
		details.setSpouse("Spouse_10");
		details.setFamily("Family_10");
		details.setHobbies("Hobbies_10");
		details.setOrganizations("Org_10");
		details.setChemistryComments("CHEM_Comments_10");
		details.setOtherChem("Other_Chem_10");
		return details;
	}

	private ContactInfo getSampleContactInfo(String contactType, int accountId) {
		ContactInfo contact = new ContactInfo();
		contact.setGrowerAccountId(accountId);
		contact.setFirstName("John");
		contact.setLastName("Smith");
		contact.setJobTitle("Locksmith");
		contact.setMonsantoOwnedFlag("Y");
		contact.setContactType(contactType);
		return contact;
	}

	@Override
	protected void onSetUp() throws Exception {
		super.onSetUp();
		irdDao = (IrdDaoImpl)getApplicationContext().getBean("irdDao");
	}

	@Override
	protected String[] getConfigLocations() {
		return new String[] { "test-irdpos-beans.xml" };
	}
}
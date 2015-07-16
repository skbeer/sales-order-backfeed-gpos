package com.monsanto.irdsoapservices.dao.test;

import com.monsanto.irdsoapservices.dao.impl.IrdDaoImpl;
import com.monsanto.irdsoapservices.to.AcctToAttr;
import com.monsanto.irdsoapservices.to.ContactInfo;
import com.monsanto.irdsoapservices.to.EmployeeInfo;
import com.monsanto.irdsoapservices.to.LfaGrowerDetails;
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
        List<EmployeeInfo> employees = irdDao.getAssociatedEmployees(6180);
        assertNotNull(employees);
        assertEquals(0, employees.size());
    }

    public void testGetAssocEmployees_withData_returnEmployeeList() throws Exception {
        List<EmployeeInfo> employees = irdDao.getAssociatedEmployees(5180);
        assertNotNull(employees);
        assertEquals(3, employees.size());
        EmployeeInfo empInfo = employees.get(0);
        assertEquals(5180 ,empInfo.getAccountId());
        assertEquals("JASCHUT", empInfo.getUserId());
        assertEquals("STO", empInfo.getRoleCode());
        assertEquals("Jackie", empInfo.getFirstName());
        assertEquals("Costello", empInfo.getLastName());
        assertEquals("jackie.a.costello@monsanto.com", empInfo.getEmailAddress());
    }

    public void testGetAssocEmployees_withData_returnEmployeeList_WithSTO() throws Exception {
        List<EmployeeInfo> employees = irdDao.getAssociatedEmployees(50420039);
        assertNotNull(employees);
        assertEquals(1, employees.size());
        EmployeeInfo empInfo = employees.get(0);
        assertEquals(50420039 ,empInfo.getAccountId());
        assertEquals("ALGALL", empInfo.getUserId());
        assertEquals("STO", empInfo.getRoleCode());
        assertEquals("Amy", empInfo.getFirstName());
        assertEquals("Gallatin", empInfo.getLastName());
        assertEquals("amy.l.gallatin@monsanto.com", empInfo.getEmailAddress());
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
        contact.setAccountId(accountId);
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
package com.monsanto.irdsoapservices.dao.impl;

import com.monsanto.irdsoapservices.to.ContactInfo;
import com.monsanto.irdsoapservices.to.ContactFunctionInfo;
import com.monsanto.irdsoapservices.to.ContactPhoneInfo;
import com.monsanto.irdsoapservices.to.ContactEmailInfo;
import com.monsanto.irdsoapservices.utils.StringUtils;
import com.monsanto.irdsoapservices.dao.ContactDao;
import com.monsanto.irdsoapservices.constants.DBConstants;
import com.monsanto.irdsoapservices.exception.IrdSoapServicesException;

import java.util.*;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.apache.commons.beanutils.BeanUtils;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Nov 3, 2009
 * Time: 3:08:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class ContactsDaoImpl extends SqlMapClientDaoSupport implements ContactDao {


    public List<ContactInfo> getContacts(long acctId, long contactId, List<String> contactFunctions) throws Exception {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("acctId", acctId>0 ? acctId+"" : null);
        params.put("contactId",	contactId>0 ? contactId+"" : null);
        params.put("contactFunctions", ((contactFunctions!=null)&&(contactFunctions.size()>0))?contactFunctions : null);
        return (List<ContactInfo>)getSqlMapClientTemplate().queryForList("IrdContact.getContacts", params);
    }

    public long insertContact(ContactInfo contactInfo) throws Exception {
        setAuditFields(contactInfo, true);
        long contactId = insertContactInfo(contactInfo);
        insertContactFunction(new ContactFunctionInfo(contactInfo));
		for(ContactPhoneInfo phoneInfo: contactInfo.getPhoneNumbers()) {
			phoneInfo.setContactId(contactId);
			insertContactPhone(phoneInfo);
		}
		for(ContactEmailInfo emailInfo: contactInfo.getEmailAddresses()) {
			emailInfo.setContactId(contactId);
			insertContactEmail(emailInfo);
		}
        return contactId;
    }

    public int updateContact(ContactInfo contactInfo) throws Exception {
        int rowCount = 0;
        if(!StringUtils.isNullOrEmpty(contactInfo.getFirstName()) && !StringUtils.isNullOrEmpty(contactInfo.getLastName())) {
            rowCount+= updateContactInfo(contactInfo);
        }
        rowCount += updateContactPhoneNumbers(contactInfo, rowCount);
        rowCount += updateContactEmailAddresses(contactInfo, rowCount);
        return rowCount;
    }

    public int insertContactFunction(ContactFunctionInfo contactFunction) throws Exception {
        setAuditFields(contactFunction, true);
        getSqlMapClientTemplate().insert("IrdContact.insertContactFunction", contactFunction);
        return 1;
    }

    public boolean isContactExisting(long accountId, long contactId) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("accountId", accountId+"");
        map.put("contactId", contactId+"");
        return ((Long)getSqlMapClientTemplate().queryForObject("IrdContact.getContactCount", map)).longValue()==1;
    }

    public int deleteContactFunction(ContactFunctionInfo contactFunction) throws Exception {
        return getSqlMapClientTemplate().delete("IrdContact.deleteContactFunction", contactFunction);
    }

    public List<String> getContactFunctions(long contactId) throws Exception {
        return (List<String>)getSqlMapClientTemplate().queryForList("IrdContact.getContactFunctions", contactId);
    }

    public int deleteContact(long contactId) throws Exception {
        int rowCount = 0;
        rowCount+= getSqlMapClientTemplate().delete("IrdContact.deleteAllContactPhones", contactId);
        rowCount+= getSqlMapClientTemplate().delete("IrdContact.deleteAllContactEmails", contactId);
        rowCount+= getSqlMapClientTemplate().delete("IrdContact.deleteContact", contactId);
        return rowCount;
    }

    private int updateContactEmailAddresses(ContactInfo contactInfo, int rowCount) throws Exception {
        for(ContactEmailInfo contactEmailInfo : contactInfo.getEmailAddresses()) {
             if(contactEmailInfo.getDatabaseAction().equalsIgnoreCase(DBConstants.INSERT_ACTION_TYPE)) {
                setAuditFields(contactEmailInfo, true);
                insertContactEmail(contactEmailInfo);
            } else if(contactEmailInfo.getDatabaseAction().equalsIgnoreCase(DBConstants.UPDATE_ACTION_TYPE)) {
                setAuditFields(contactEmailInfo, false);
                int updateCount = updateContactEmail(contactEmailInfo);
                if(updateCount <=0) {
                    throw new IrdSoapServicesException("Unable to find "+contactEmailInfo.getEmailType()+" EmailAddress for ContactId:"+contactEmailInfo.getContactId());
                } else {
                    rowCount+= updateCount;
                }
            } else {
                deleteContactEmail(contactEmailInfo);
            }
        }
        return rowCount;
    }

    private int updateContactPhoneNumbers(ContactInfo contactInfo, int rowCount) throws Exception {
        for(ContactPhoneInfo contactPhoneInfo : contactInfo.getPhoneNumbers()) {
            if(contactPhoneInfo.getDatabaseAction().equalsIgnoreCase(DBConstants.INSERT_ACTION_TYPE)) {
                setAuditFields(contactPhoneInfo, true);
                insertContactPhone(contactPhoneInfo);
            } else if(contactPhoneInfo.getDatabaseAction().equalsIgnoreCase(DBConstants.UPDATE_ACTION_TYPE)) {
                setAuditFields(contactPhoneInfo, false);
                int updateCount = updateContactPhone(contactPhoneInfo);
                if(updateCount <=0) {
                    throw new IrdSoapServicesException("Unable to find "+contactPhoneInfo.getPhoneType()+" PhoneNumber for ContactId:"+contactPhoneInfo.getContactId());
                } else {
                    rowCount+= updateCount;
                }
            } else {
                deleteContactPhone(contactPhoneInfo);
            }
        }
        return rowCount;
    }

    protected ContactPhoneInfo getContactPhoneByType(long contactId, String phoneType) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("contactId", contactId+"");
        map.put("phoneType", phoneType);
        return (ContactPhoneInfo)getSqlMapClientTemplate().queryForObject("IrdContact.getContactPhoneByType", map);
    }

    protected ContactEmailInfo getContactEmailByType(long contactId, String emailType) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("contactId", contactId+"");
        map.put("emailType", emailType);
        return (ContactEmailInfo)getSqlMapClientTemplate().queryForObject("IrdContact.getContactEmailByType", map);
    }

    protected long insertContactInfo(ContactInfo contactInfo) throws Exception {
        setAuditFields(contactInfo, true);
        return (Long)getSqlMapClientTemplate().insert("IrdContact.insertContact", contactInfo);
    }

    protected int insertContactPhone(ContactPhoneInfo contactPhone) throws Exception {
        int rowCount = 0;
        ContactPhoneInfo existingPhone = getContactPhoneByType(contactPhone.getContactId(), contactPhone.getPhoneType());
        if(existingPhone!= null) {
            throw new IrdSoapServicesException(contactPhone.getPhoneType()+" PhoneNumber already exists for ContactId:"+contactPhone.getContactId());
        }
        setAuditFields(contactPhone, true);
        getSqlMapClientTemplate().insert("IrdContact.insertContactPhone", contactPhone);
        rowCount++;
        return rowCount;
    }

    protected int insertContactEmail(ContactEmailInfo contactEmail) throws Exception {
        int rowCount = 0;
        ContactEmailInfo existingEmail = getContactEmailByType(contactEmail.getContactId(), contactEmail.getEmailType());
        if(existingEmail!= null) {
            throw new IrdSoapServicesException(contactEmail.getEmailType()+" EmailAddress already exists for ContactId:"+contactEmail.getContactId());
        }
        setAuditFields(contactEmail, true);
        getSqlMapClientTemplate().insert("IrdContact.insertContactEmail", contactEmail);
        rowCount++;
        return rowCount;
    }

    protected int updateContactInfo(ContactInfo contactInfo) throws Exception {
        setAuditFields(contactInfo, false);
        return getSqlMapClientTemplate().update("IrdContact.updateContact", contactInfo);
    }
    protected int updateContactPhone(ContactPhoneInfo contactPhone) throws Exception {
        setAuditFields(contactPhone, false);
        return getSqlMapClientTemplate().update("IrdContact.updateContactPhone", contactPhone);
    }
    protected int updateContactEmail(ContactEmailInfo contactEmail) throws Exception {
        setAuditFields(contactEmail, false);
        return getSqlMapClientTemplate().update("IrdContact.updateContactEmail", contactEmail);
    }

    protected int deleteContactPhone(ContactPhoneInfo contactPhoneInfo) throws Exception {
        return getSqlMapClientTemplate().delete("IrdContact.deleteContactPhoneNumber", contactPhoneInfo);
    }

    protected int deleteContactEmail(ContactEmailInfo contactEmailInfo) throws Exception {
        return getSqlMapClientTemplate().delete("IrdContact.deleteContactEmailAddress", contactEmailInfo);
    }

    private void setAuditFields(Object auditableObject, boolean setRowEntryDate) throws RuntimeException {
        if (auditableObject == null) {return;}
        Date timestamp = Calendar.getInstance().getTime();
        try {
            BeanUtils.setProperty(auditableObject, "rowModifyDate", timestamp);
            BeanUtils.setProperty(auditableObject, "rowTaskId", DBConstants.ROW_TASK_ID);
            if(StringUtils.isNullOrEmpty(BeanUtils.getProperty(auditableObject, "rowUserId"))) {
                BeanUtils.setProperty(auditableObject, "rowUserId", DBConstants.ROW_USER_ID);
            }
            if(setRowEntryDate) {
            	BeanUtils.setProperty(auditableObject, "rowEntryDate", timestamp);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}

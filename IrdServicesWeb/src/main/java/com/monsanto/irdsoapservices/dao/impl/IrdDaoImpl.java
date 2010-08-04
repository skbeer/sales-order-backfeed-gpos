package com.monsanto.irdsoapservices.dao.impl;

import com.monsanto.irdsoapservices.constants.DBConstants;
import com.monsanto.irdsoapservices.dao.IrdDao;
import com.monsanto.irdsoapservices.to.*;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 17, 2009
 * To change this template use File | Settings | File Templates.
 */
public class IrdDaoImpl extends SqlMapClientDaoSupport implements IrdDao {

	public List<AcctToAttr> getAttributesByAcctId(long acctId) throws Exception {
		return (List<AcctToAttr>)getSqlMapClientTemplate().queryForList("AcctToAttr.getFlags", acctId);
	}
		
	public int insertAccountAttribute(AcctToAttr acctToAttr) throws Exception {
		setAuditFields(acctToAttr, true);
		getSqlMapClientTemplate().insert("AcctToAttr.insertAttribute", acctToAttr);
		return 1;
	}

	public int deleteAccountAttribute(AcctToAttr acctToAttr) throws Exception {
		getSqlMapClientTemplate().insert("AcctToAttr.deleteAttribute", acctToAttr);
		return 1;
	}

	public LfaGrowerDetails getAccountDetails(long growerAccountId) throws Exception {
		return (LfaGrowerDetails)getSqlMapClientTemplate().queryForObject("LfaGrowerDetails.getDetails", growerAccountId);
	}

	public int saveAccountDetails(LfaGrowerDetails lfaDetails) throws Exception {
		long growerAccountId = lfaDetails.getAccountId();
		LfaGrowerDetails currentDetails = getAccountDetails(growerAccountId);
		if(currentDetails == null) {
			getSqlMapClientTemplate().insert("LfaGrowerDetails.insertDetails", lfaDetails);
		} else {
			getSqlMapClientTemplate().update("LfaGrowerDetails.updateDetails", lfaDetails);
		}
		return 1;
	}

	public int deleteAccountDetails(long growerAccountId) throws Exception {
		getSqlMapClientTemplate().delete("LfaGrowerDetails.deleteDetails", growerAccountId);
		return 1;
	}

	public int deleteContactInfo(ContactInfo contactInfo) throws Exception {
		long contactId = contactInfo.getContactId();
		ContactFunctionInfo contactFunction = new ContactFunctionInfo(contactInfo);
		contactFunction.setFunctionTypeCode(contactInfo.getContactType());
		int deletedRows = getSqlMapClientTemplate().delete("Contact.deleteAllContactPhones", contactId);
		deletedRows+= getSqlMapClientTemplate().delete("Contact.deleteAllContactEmails", contactId);
		deletedRows+= getSqlMapClientTemplate().delete("Contact.deleteContactFunction", contactFunction);
		deletedRows+= getSqlMapClientTemplate().delete("Contact.deleteContact", contactId);
		return deletedRows;
	}

    public List<EmployeeInfo> getAssociatedEmployees(long accountId) throws Exception {
        return (List<EmployeeInfo>)getSqlMapClientTemplate().queryForList("Employee.getAssociatedEmployees", accountId);
    }

    public long getAccountIdByAlias(String aliasType, String aliasId) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("systemTypeCode", aliasType);
        map.put("aliasId", aliasId);
        Object acctIdObj = getSqlMapClientTemplate().queryForObject("AcctToAgreements.getAcctIdByAlias", map);
        return (acctIdObj == null ? 0: ((java.lang.Long)acctIdObj).longValue());
    }
    
//	protected long insertContactInfo(ContactInfo contactInfo) throws Exception {
//		setAuditFields(contactInfo, true);
//		return (Long)getSqlMapClientTemplate().insert("Contact.insertContactInfo", contactInfo);
//	}
//	protected int insertContactFunction(ContactFunctionInfo contactFunction) throws Exception {
//		setAuditFields(contactFunction, true);
//		getSqlMapClientTemplate().insert("Contact.insertContactFunction", contactFunction);
//		return 1;
//	}
//	protected int insertContactPhone(ContactPhoneInfo contactPhone) throws Exception {
//		int rowCount = 0;
//		if(!StringUtils.isNullOrEmpty(contactPhone.getPhoneNumber())) {
//			setAuditFields(contactPhone, true);
//			getSqlMapClientTemplate().insert("Contact.insertContactPhone", contactPhone);
//			rowCount++;
//		}
//		return rowCount;
//	}
//	protected int insertContactEmail(ContactEmailInfo contactEmail) throws Exception {
//		int rowCount = 0;
//		if(!StringUtils.isNullOrEmpty(contactEmail.getEmailAddress())) {
//			setAuditFields(contactEmail, true);
//			getSqlMapClientTemplate().insert("Contact.insertContactEmail", contactEmail);
//			rowCount++;
//		}
//		return rowCount;
//	}
//
//	protected int updateContactInfo(ContactInfo contactInfo) throws Exception {
//		setAuditFields(contactInfo, false);
//		return getSqlMapClientTemplate().update("Contact.updateContactInfo", contactInfo);
//	}
//	protected int updateContactPhone(ContactPhoneInfo contactPhone) throws Exception {
//		setAuditFields(contactPhone, false);
//		return getSqlMapClientTemplate().update("Contact.updateContactPhone", contactPhone);
//	}
//	protected int updateContactEmail(ContactEmailInfo contactEmail) throws Exception {
//		setAuditFields(contactEmail, false);
//		return getSqlMapClientTemplate().update("Contact.updateContactEmail", contactEmail);
//	}
//
//	protected int deleteContactPhone(long contactPhoneId) throws Exception {
//		return getSqlMapClientTemplate().delete("Contact.deleteContactPhoneNumber", contactPhoneId);
//	}
//
//	protected int deleteContactEmail(long contactEmailId) throws Exception {
//		return getSqlMapClientTemplate().delete("Contact.deleteContactEmailAddress", contactEmailId);
//	}

	protected String getFunctionTypeCode(String description) throws Exception {
		return (String)getSqlMapClientTemplate().queryForObject("Contact.getFunctionTypeCode", description);
	}

    private void setAuditFields(Object auditableObject, boolean setRowEntryDate) throws RuntimeException {
        if (auditableObject == null) {return;}
        Date timestamp = Calendar.getInstance().getTime();
        try {
            BeanUtils.setProperty(auditableObject, "rowModifyDate", timestamp);
            BeanUtils.setProperty(auditableObject, "rowTaskId", DBConstants.ROW_TASK_ID);
            BeanUtils.setProperty(auditableObject, "rowUserId", DBConstants.ROW_USER_ID);
            if(setRowEntryDate) {
            	BeanUtils.setProperty(auditableObject, "rowEntryDate", timestamp);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}

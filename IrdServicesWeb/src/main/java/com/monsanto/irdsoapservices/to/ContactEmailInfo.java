package com.monsanto.irdsoapservices.to;


import com.monsanto.irdsoapservices.contacts.schema.ContactEmailType;
import com.monsanto.irdsoapservices.contacts.schema.EmailEnumType;
import com.monsanto.irdsoapservices.contacts.schema.PersistableContactEmailType;
import com.monsanto.irdsoapservices.utils.StringUtils;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 17, 2009
 * To change this template use File | Settings | File Templates.
 */
public class ContactEmailInfo {
	private String emailType;
	private String emailAddress;
	private long contactId;
	private Long contactEmailId = null;
	private int emailTypeId;
	private Date rowEntryDate;
    private Date rowModifyDate;
    private String rowTaskId;
    private String rowUserId;
    private String databaseAction;

    public String getDatabaseAction() {
        return databaseAction;
    }

    public void setDatabaseAction(String databaseAction) {
        this.databaseAction = databaseAction;
    }

    public Long getContactEmailId() {
		return contactEmailId;
	}
	public void setContactEmailId(Long contactEmailId) {
		this.contactEmailId = contactEmailId;
	}
	public int getEmailTypeId() {
		return emailTypeId;
	}
	public void setEmailTypeId(int contactEmailTypeId) {
		this.emailTypeId = contactEmailTypeId;
	}
	public long getContactId() {
		return contactId;
	}
	public void setContactId(long contactId) {
		this.contactId = contactId;
	}
	public Date getRowEntryDate() {
		return rowEntryDate;
	}
	public void setRowEntryDate(Date rowEntryDate) {
		this.rowEntryDate = rowEntryDate;
	}
	public Date getRowModifyDate() {
		return rowModifyDate;
	}
	public void setRowModifyDate(Date rowModifyDate) {
		this.rowModifyDate = rowModifyDate;
	}
	public String getRowTaskId() {
		return rowTaskId;
	}
	public void setRowTaskId(String rowTaskId) {
		this.rowTaskId = rowTaskId;
	}
	public String getRowUserId() {
		return rowUserId;
	}
	public void setRowUserId(String rowUserId) {
		this.rowUserId = rowUserId;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getEmailType() {
		return emailType;
	}
	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}
	
	@Override
	public String toString() {
		return "EMAIL [Email_Type:"+getEmailType()+" EmailAddress: "+getEmailAddress()+"]";
	}

	public ContactEmailType extractTypeObject() {
		ContactEmailType emailType = new ContactEmailType();
		emailType.setType(EmailEnumType.fromValue(getEmailType()));
		emailType.setValue(getEmailAddress());
		return emailType;
	}
	
	public static ContactEmailInfo parse(ContactEmailType xmlEmailAddress, long contactId, String rowUserId) throws Exception {
		ContactEmailInfo emailInfo = new ContactEmailInfo();
		if(xmlEmailAddress == null) {
			throw new Exception("Invalid EmailAddressType Recieved");
		}
		emailInfo.setEmailType(xmlEmailAddress.getType().toString());
		emailInfo.setEmailAddress(xmlEmailAddress.getValue());
		emailInfo.setContactId(contactId);
        if(!StringUtils.isNullOrEmpty(rowUserId)) {
            emailInfo.setRowUserId(rowUserId);
        }
		return emailInfo;
	}

    public static ContactEmailInfo parse(PersistableContactEmailType xmlEmailAddress, long contactId, String rowUserId) throws Exception {
		ContactEmailInfo emailInfo = new ContactEmailInfo();
		if(xmlEmailAddress == null) {
			throw new Exception("Invalid EmailAddressType Recieved");
		}
        emailInfo.setDatabaseAction(xmlEmailAddress.getAction().toString());
		emailInfo.setEmailType(xmlEmailAddress.getType().toString());
		emailInfo.setEmailAddress(xmlEmailAddress.getValue());
		emailInfo.setContactId(contactId);
        if(!StringUtils.isNullOrEmpty(rowUserId)) {
            emailInfo.setRowUserId(rowUserId);
        }
		return emailInfo;
	}
	
}

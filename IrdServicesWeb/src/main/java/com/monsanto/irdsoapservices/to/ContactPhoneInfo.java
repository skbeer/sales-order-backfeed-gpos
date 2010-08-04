package com.monsanto.irdsoapservices.to;


import com.monsanto.irdsoapservices.contacts.schema.ContactPhoneNumberType;
import com.monsanto.irdsoapservices.contacts.schema.PersistableContactPhoneNumberType;
import com.monsanto.irdsoapservices.contacts.schema.PhoneNumberEnumType;
import com.monsanto.irdsoapservices.utils.StringUtils;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 17, 2009
 * To change this template use File | Settings | File Templates.
 */
public class ContactPhoneInfo {
	private String phoneType;
	private String phoneNumber;
	private String phoneExtension;
	private int phoneTypeId;
	private Long contactPhoneId = null;
	private long contactId;
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
	public long getContactId() {
		return contactId;
	}
	public void setContactId(long contactId) {
		this.contactId = contactId;
	}
	public Long getContactPhoneId() {
		return contactPhoneId;
	}
	public void setContactPhoneId(Long contactPhoneId) {
		this.contactPhoneId = contactPhoneId;
	}
	public int getPhoneTypeId() {
		return phoneTypeId;
	}
	public void setPhoneTypeId(int phoneTypeId) {
		this.phoneTypeId = phoneTypeId;
	}
	public String getPhoneExtension() {
		return phoneExtension;
	}
	public void setPhoneExtension(String phoneExtension) {
		this.phoneExtension = phoneExtension;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	
	@Override
	public String toString() {
		return "PHONE [ ContactId:"+getContactId()+" Phone_Type: "+getPhoneType()+" Ph#:"+getPhoneNumber()+" Ext:"+getPhoneExtension()+"]";
	}
	
	public ContactPhoneNumberType extractTypeObject() {
		ContactPhoneNumberType phNumberType = new ContactPhoneNumberType();
		phNumberType.setType(PhoneNumberEnumType.fromValue(getPhoneType()));
		phNumberType.setPhoneNumber(getPhoneNumber());
		phNumberType.setExtension(getPhoneExtension());
		return phNumberType;
	}
	
	public static ContactPhoneInfo parse(ContactPhoneNumberType xmlPhoneNumber, long contactId, String rowUserId) throws Exception {
		ContactPhoneInfo phoneInfo = new ContactPhoneInfo();
		if(xmlPhoneNumber == null) {
			throw new Exception("Invalid ContactPhoneNumberType Recieved");
		}
		phoneInfo.setPhoneType(xmlPhoneNumber.getType().toString());
		phoneInfo.setPhoneNumber(xmlPhoneNumber.getPhoneNumber());
		phoneInfo.setPhoneExtension(xmlPhoneNumber.getExtension());
        phoneInfo.setContactId(contactId);
        if(!StringUtils.isNullOrEmpty(rowUserId)) {
            phoneInfo.setRowUserId(rowUserId);
        }
		return phoneInfo;
	}

    public static ContactPhoneInfo parse(PersistableContactPhoneNumberType xmlPhoneNumber, long contactId, String rowUserId) throws Exception {
        ContactPhoneInfo phoneInfo = new ContactPhoneInfo();
        if(xmlPhoneNumber == null) {
			throw new Exception("Invalid ContactPhoneNumberType Recieved");
		}
        phoneInfo.setDatabaseAction(xmlPhoneNumber.getAction().toString());
		phoneInfo.setPhoneType(xmlPhoneNumber.getType().toString());
		phoneInfo.setPhoneNumber(xmlPhoneNumber.getPhoneNumber());
		phoneInfo.setPhoneExtension(xmlPhoneNumber.getExtension());
        phoneInfo.setContactId(contactId);
        if(!StringUtils.isNullOrEmpty(rowUserId)) {
            phoneInfo.setRowUserId(rowUserId);
        }
		return phoneInfo;
    }
	
}

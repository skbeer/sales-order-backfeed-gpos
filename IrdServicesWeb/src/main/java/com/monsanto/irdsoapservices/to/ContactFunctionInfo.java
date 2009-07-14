package com.monsanto.irdsoapservices.to;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 17, 2009
 * To change this template use File | Settings | File Templates.
 */
public class ContactFunctionInfo {

	private long contactId;
	private String functionTypeCode;
	private Date rowEntryDate;
    private Date rowModifyDate;
    private String rowTaskId;
    private String rowUserId;
    private String contactType;
    
	public ContactFunctionInfo() {		
	}
	public ContactFunctionInfo(ContactInfo contactInfo) {
		if(contactInfo != null) {
			this.contactId = contactInfo.getContactId();
			this.contactType = contactInfo.getContactType();
		}
	}
	
	public String getContactType() {
		return contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	public long getContactId() {
		return contactId;
	}
	public void setContactId(long contactId) {
		this.contactId = contactId;
	}
	public String getFunctionTypeCode() {
		return functionTypeCode;
	}
	public void setFunctionTypeCode(String functionTypeCode) {
		this.functionTypeCode = functionTypeCode;
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

    
    
}

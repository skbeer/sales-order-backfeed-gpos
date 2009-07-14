package com.monsanto.irdsoapservices.to;

import com.monsanto.irdsoapservices.schema.*;
import com.monsanto.irdsoapservices.utils.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 17, 2009
 * To change this template use File | Settings | File Templates.
 */
public class ContactInfo {
    private long contactId;
    private long growerAccountId;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String contactType;
    private List<ContactPhoneInfo> phoneNumbers = new ArrayList<ContactPhoneInfo>();
    private List<ContactEmailInfo> emailAddresses = new ArrayList<ContactEmailInfo>();
    private String monsantoOwnedFlag = "Y";
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

	public String getMonsantoOwnedFlag() {
		return monsantoOwnedFlag;
	}

	public void setMonsantoOwnedFlag(String monsantoOwnedFlag) {
		this.monsantoOwnedFlag = monsantoOwnedFlag;
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

	public long getGrowerAccountId() {
		return growerAccountId;
	}

	public void setGrowerAccountId(long growerAccountId) {
		this.growerAccountId = growerAccountId;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private boolean checkForNullOrBlank(String value) {
        return value == null || value.trim().equals("");
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    
	public List<ContactPhoneInfo> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<ContactPhoneInfo> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
	public List<ContactEmailInfo> getEmailAddresses() {
		return emailAddresses;
	}

	public void setEmailAddresses(List<ContactEmailInfo> emailAddresses) {
		this.emailAddresses = emailAddresses;
	}

	@Override
	public String toString() {
		StringBuffer sBuffer = new StringBuffer("\n"+"--CONTACT INFO--\n");
		sBuffer.append("DBAction:"+getDatabaseAction()+" GrowerAccountId:"+getGrowerAccountId()+" ContactId:"+getContactId()+" ContactType:"+getContactType()+" Name"+getFirstName()+" "+getLastName()+" Job:"+getJobTitle());
		for(ContactPhoneInfo phone: getPhoneNumbers()) {
			sBuffer.append("\n"+phone.toString());			
		}
		for(ContactEmailInfo email: getEmailAddresses()) {
			sBuffer.append("\n"+email.toString());			
		}
		sBuffer.append("\n----------\n");
		return sBuffer.toString();
	}
	
	public ContactInfoType extractTypeObject() {
		ContactInfoType contactInfoType = new ContactInfoType();
		contactInfoType.setContactId(getContactId());
		contactInfoType.setContactType(StringUtils.isNullOrEmpty(getContactType())?null:getContactType().trim().toUpperCase());
		contactInfoType.setFirstName(getFirstName());
		contactInfoType.setLastName(getLastName());
		contactInfoType.setJobTitle(getJobTitle());
		
		ContactPhoneNumberListType phoneNumbersListType = new ContactPhoneNumberListType();
		List<ContactPhoneNumberType> phTypeList = new ArrayList<ContactPhoneNumberType>();
		for(ContactPhoneInfo phInfo: getPhoneNumbers()) {
			if(phInfo != null) {
				phTypeList.add(phInfo.extractTypeObject());
			}
		}
		phoneNumbersListType.getContactPhoneNumber().addAll(phTypeList);
		contactInfoType.setPhoneNumberList(phoneNumbersListType);
		
		EmailAddressListType emailAddressListType = new EmailAddressListType();
		List<EmailAddressType> emailList = new ArrayList<EmailAddressType>();
		for(ContactEmailInfo emailInfo: getEmailAddresses()) {
			if(emailInfo != null) {
				emailList.add(emailInfo.extractTypeObject());
			}
		}
		emailAddressListType.getEmailAddress().addAll(emailList);
		contactInfoType.setEmailAddressList(emailAddressListType);
		
		return contactInfoType;
	}
	
	public static ContactInfo parse(PersistableContactInfoType persistableContactInfoType, long growerAccountId) throws Exception {
		ContactInfo contactInfo = new ContactInfo();
		if((persistableContactInfoType == null) || (persistableContactInfoType.getContactInfo() == null)) {
			throw new Exception("Invalid PersistableContactInfoType Recieved.");
		}
		contactInfo.setDatabaseAction(persistableContactInfoType.getDatabaseAction().toString());
		ContactInfoType xmlContactInfo = persistableContactInfoType.getContactInfo();
		if((xmlContactInfo==null) || StringUtils.isNullOrEmpty(xmlContactInfo.getContactType())) {
			throw new Exception("Invalid PersistableContactInfoType Recieved. Invalid ContactType: "+xmlContactInfo);
		}
		contactInfo.setContactId(xmlContactInfo.getContactId());
		contactInfo.setContactType(xmlContactInfo.getContactType().trim().toUpperCase());
		contactInfo.setFirstName(xmlContactInfo.getFirstName());
		contactInfo.setLastName(xmlContactInfo.getLastName());
		contactInfo.setJobTitle(xmlContactInfo.getJobTitle());
		contactInfo.setGrowerAccountId(growerAccountId);
		if((persistableContactInfoType.getContactInfo().getPhoneNumberList()!= null) && 
				(persistableContactInfoType.getContactInfo().getPhoneNumberList().getContactPhoneNumber() != null)) {
			List<ContactPhoneNumberType> xmlPhoneNumberList = persistableContactInfoType.getContactInfo().getPhoneNumberList().getContactPhoneNumber();
			for(ContactPhoneNumberType xmlPhoneNumber: xmlPhoneNumberList) {
				contactInfo.getPhoneNumbers().add(ContactPhoneInfo.parse(xmlPhoneNumber, xmlContactInfo.getContactId()));
			}			
		}
		if((persistableContactInfoType.getContactInfo().getEmailAddressList()!= null) && 
				(persistableContactInfoType.getContactInfo().getEmailAddressList().getEmailAddress() != null)) {
			List<EmailAddressType> xmlEmailAddressList = persistableContactInfoType.getContactInfo().getEmailAddressList().getEmailAddress();
			for(EmailAddressType xmlEmailAddress: xmlEmailAddressList) {
				contactInfo.getEmailAddresses().add(ContactEmailInfo.parse(xmlEmailAddress, xmlContactInfo.getContactId()));
			}			
		}
		return contactInfo;
	}
    
}

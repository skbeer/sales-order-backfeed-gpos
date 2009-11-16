package com.monsanto.irdsoapservices.to;

import com.monsanto.irdsoapservices.contacts.schema.*;
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
    private long accountId;
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
    private List<String> contactFunctions = new ArrayList<String>();

    public List<String> getContactFunctions() {
        return contactFunctions;
    }

    public void setContactFunctions(List<String> contactFunctions) {
        this.contactFunctions = contactFunctions;
    }

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

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
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
		sBuffer.append("AccountId:"+ getAccountId()+" ContactId:"+getContactId()+" Name"+getFirstName()+" "+getLastName()+" Job:"+getJobTitle());
        sBuffer.append("\n Contact Functions \n");
        for(String phone: getContactFunctions()) {
			sBuffer.append(" "+phone);			
		}
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
		List<ContactEmailType> emailList = new ArrayList<ContactEmailType>();
		for(ContactEmailInfo emailInfo: getEmailAddresses()) {
			if(emailInfo != null) {
				emailList.add(emailInfo.extractTypeObject());
			}
		}
		emailAddressListType.getEmailAddress().addAll(emailList);
		contactInfoType.setEmailAddressList(emailAddressListType);
        ContactFunctionListType contactFunctionList = new ContactFunctionListType();
        if(getContactFunctions().size()>0) {
            contactFunctionList.getContactFunction().addAll(getContactFunctions());
        } else if(!StringUtils.isNullOrEmpty(getContactType())) {
            contactFunctionList.getContactFunction().add(getContactType());
        }
        contactInfoType.setContactFunctionList(contactFunctionList);

		return contactInfoType;
	}

	public static ContactInfo parse(InsertContactInfoType insertContactInfoType, long accountId, String rowUserId) throws Exception {
		ContactInfo contactInfo = new ContactInfo();
		if(insertContactInfoType == null) {
			throw new Exception("Invalid InsertContactInfoType Recieved.");
		}
		if(StringUtils.isNullOrEmpty(insertContactInfoType.getContactFunction())) {
			throw new Exception("Invalid InsertContactInfoType Recieved. Invalid ContactFunction: "+insertContactInfoType.getContactFunction());
		}
		contactInfo.setContactType(insertContactInfoType.getContactFunction().trim().toUpperCase());
		contactInfo.setFirstName(insertContactInfoType.getFirstName());
		contactInfo.setLastName(insertContactInfoType.getLastName());
		contactInfo.setJobTitle(insertContactInfoType.getJobTitle());
		contactInfo.setAccountId(accountId);
		if((insertContactInfoType.getPhoneNumberList()!= null) &&
				(insertContactInfoType.getPhoneNumberList().getContactPhoneNumber() != null)) {
			List<ContactPhoneNumberType> xmlPhoneNumberList = insertContactInfoType.getPhoneNumberList().getContactPhoneNumber();
			for(ContactPhoneNumberType xmlPhoneNumber: xmlPhoneNumberList) {
				contactInfo.getPhoneNumbers().add(ContactPhoneInfo.parse(xmlPhoneNumber, 0, rowUserId));
			}
		}
		if((insertContactInfoType.getEmailAddressList()!= null) &&
				(insertContactInfoType.getEmailAddressList().getEmailAddress() != null)) {
			List<ContactEmailType> xmlEmailAddressList = insertContactInfoType.getEmailAddressList().getEmailAddress();
			for(ContactEmailType xmlEmailAddress: xmlEmailAddressList) {
				contactInfo.getEmailAddresses().add(ContactEmailInfo.parse(xmlEmailAddress, 0, rowUserId));
			}
		}
        if(!StringUtils.isNullOrEmpty(rowUserId)) {
            contactInfo.setRowUserId(rowUserId);
        }
		return contactInfo;
	}

    public static ContactInfo parse(PersistableContactInfoType persistableContactInfoType, long accountId, String rowUserId) throws Exception {
		ContactInfo contactInfo = new ContactInfo();
		if(persistableContactInfoType == null) {
			throw new Exception("Invalid PersistableContactInfoType Recieved.");
		}
        long contactId = persistableContactInfoType.getContactId();
        contactInfo.setAccountId(accountId);
        contactInfo.setContactId(contactId);
		contactInfo.setFirstName(persistableContactInfoType.getFirstName());
		contactInfo.setLastName(persistableContactInfoType.getLastName());
		contactInfo.setJobTitle(persistableContactInfoType.getJobTitle());
		if((persistableContactInfoType.getPhoneNumberList()!= null) &&
				(persistableContactInfoType.getPhoneNumberList().getContactPhoneNumber() != null)) {
			List<PersistableContactPhoneNumberType> xmlPhoneNumberList = persistableContactInfoType.getPhoneNumberList().getContactPhoneNumber();
			for(PersistableContactPhoneNumberType xmlPhoneNumber: xmlPhoneNumberList) {
				contactInfo.getPhoneNumbers().add(ContactPhoneInfo.parse(xmlPhoneNumber, contactId, rowUserId));
			}
		}
		if((persistableContactInfoType.getEmailAddressList()!= null) &&
				(persistableContactInfoType.getEmailAddressList().getEmailAddress() != null)) {
			List<PersistableContactEmailType> xmlEmailAddressList = persistableContactInfoType.getEmailAddressList().getEmailAddress();
			for(PersistableContactEmailType xmlEmailAddress: xmlEmailAddressList) {
				contactInfo.getEmailAddresses().add(ContactEmailInfo.parse(xmlEmailAddress, contactId, rowUserId));
			}
		}
        if(!StringUtils.isNullOrEmpty(rowUserId)) {
            contactInfo.setRowUserId(rowUserId);
        }
		return contactInfo;
	}

}

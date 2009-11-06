package com.monsanto.irdsoapservices.utils;

import com.monsanto.irdsoapservices.contacts.schema.*;
import com.monsanto.irdsoapservices.to.ContactInfo;
import com.monsanto.irdsoapservices.to.ContactEmailInfo;
import com.monsanto.irdsoapservices.to.ContactPhoneInfo;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Nov 4, 2009
 * Time: 9:45:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class JaxbTypeConverter {

    public static ContactInfoType convertToJaxbContactInfoType(ContactInfo contactInfo) throws Exception {
        ContactInfoType contactInfoType = new ContactInfoType();
		contactInfoType.setContactId(contactInfo.getContactId());
		contactInfoType.setFirstName(contactInfo.getFirstName());
		contactInfoType.setLastName(contactInfo.getLastName());
		contactInfoType.setJobTitle(contactInfo.getJobTitle());

		ContactPhoneNumberListType phoneNumbersListType = new ContactPhoneNumberListType();
		List<ContactPhoneNumberType> phTypeList = new ArrayList<ContactPhoneNumberType>();
		for(ContactPhoneInfo phInfo: contactInfo.getPhoneNumbers()) {
			if(phInfo != null) {
				phTypeList.add(JaxbTypeConverter.convertToJaxbPhoneNumberType(phInfo));
			}
		}
		phoneNumbersListType.getContactPhoneNumber().addAll(phTypeList);
		contactInfoType.setPhoneNumberList(phoneNumbersListType);

		EmailAddressListType emailAddressListType = new EmailAddressListType();
		List<ContactEmailType> emailList = new ArrayList<ContactEmailType>();
		for(ContactEmailInfo emailInfo: contactInfo.getEmailAddresses()) {
			if(emailInfo != null) {
				emailList.add(JaxbTypeConverter.convertToJaxbEmailType(emailInfo));
			}
		}
		emailAddressListType.getEmailAddress().addAll(emailList);
		contactInfoType.setEmailAddressList(emailAddressListType);
        ContactFunctionListType contactFunctionList = new ContactFunctionListType();
        contactFunctionList.getContactFunction().addAll(contactInfo.getContactFunctions());
        contactInfoType.setContactFunctionList(contactFunctionList);

		return contactInfoType;
    }

    public static ContactEmailType convertToJaxbEmailType(ContactEmailInfo emailInfo) throws Exception {
        ContactEmailType jaxbEmailType = new ContactEmailType();
        jaxbEmailType.setType(EmailEnumType.fromValue(emailInfo.getEmailType()));
        jaxbEmailType.setValue(emailInfo.getEmailAddress());
        return jaxbEmailType;
    }

    public static ContactPhoneNumberType convertToJaxbPhoneNumberType(ContactPhoneInfo phoneInfo) throws Exception {
        ContactPhoneNumberType jaxbPhoneType = new ContactPhoneNumberType();
        jaxbPhoneType.setType(PhoneNumberEnumType.fromValue(phoneInfo.getPhoneType()));
        jaxbPhoneType.setPhoneNumber(phoneInfo.getPhoneNumber());
        jaxbPhoneType.setExtension(phoneInfo.getPhoneExtension());
        return jaxbPhoneType;
    }
}

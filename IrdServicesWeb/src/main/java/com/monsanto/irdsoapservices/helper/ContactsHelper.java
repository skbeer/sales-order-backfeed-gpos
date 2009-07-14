package com.monsanto.irdsoapservices.helper;

import com.monsanto.irdsoapservices.constants.DBConstants;
import com.monsanto.irdsoapservices.dao.IrdDao;
import com.monsanto.irdsoapservices.exception.IrdSoapServicesException;
import com.monsanto.irdsoapservices.schema.*;
import com.monsanto.irdsoapservices.service.AccountInformationFault;
import com.monsanto.irdsoapservices.to.ContactEmailInfo;
import com.monsanto.irdsoapservices.to.ContactInfo;
import com.monsanto.irdsoapservices.to.ContactPhoneInfo;
import com.monsanto.irdsoapservices.utils.StringUtils;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 17, 2009
 * To change this template use File | Settings | File Templates.
 */
public class ContactsHelper extends AbstractHelper {
    private IrdDao dao = null;
    Logger logger = Logger.getLogger(this.getClass());

    public GetContactsResponseType getContacts(GetContactsRequestType request) throws AccountInformationFault {
        GetContactsResponseType contactsResponse = null;
        try {
            validateGetContactsRequest(request);
            String contactType = StringUtils.isNullOrEmpty(request.getGetContactsRequestBody().getContactType())? null: request.getGetContactsRequestBody().getContactType().trim().toUpperCase();
            long accountId = extractGrowerAccountId(request);
            long contactId = extractContactId(request);
            logger.info("Retrieving contacts for Grower w/AcctId: "+accountId+" and ContactId: "+contactId);
            List<ContactInfo> contacts = dao.getContacts(accountId, contactId, contactType);
            logger.info("Returning "+contacts.size()+" contacts for Grower w/AcctId: "+accountId+" and ContactId: "+contactId);
            contactsResponse = new GetContactsResponseType();
            contactsResponse.setGetContactsResponseBody(new GetContactsResponseBodyType());
            List<ContactInfoType> contactsList = new ArrayList<ContactInfoType>();
            for (ContactInfo contactInfo : contacts) {
                if (contactInfo != null) {
                    contactsList.add(contactInfo.extractTypeObject());
                }
            }
            contactsResponse.getGetContactsResponseBody().getContactInfo().addAll(contactsList);
            contactsResponse.setHeader(getResponseHeader(request.getHeader()));
            logger.info("Returning " + contacts.size() + " contacts for Grower w/ AcctId: " + accountId);
        } catch (Throwable e) {
            throwAccountInformationFault(e, logger, "getContacts");
        }
        logger.debug("End: getContacts()");
        return contactsResponse;
    }

    public SaveContactsResponseType saveContacts(SaveContactsRequestType request) throws AccountInformationFault {
        SaveContactsResponseType response = new SaveContactsResponseType();
        long growerAccountId = 0;
        try {
            growerAccountId = getValidatedGrowerAccountId(request);
            List<PersistableContactInfoType> persistableXmlContacts = request.getSaveContactsRequestBody().getPersistableContact();
            logger.info("Recieved " + persistableXmlContacts.size() + " Contacts to persist");
            for (PersistableContactInfoType xmlContactInfo : persistableXmlContacts) {
                ContactInfo contactInfo = ContactInfo.parse(xmlContactInfo, growerAccountId);
                logger.info(contactInfo.toString());
                if (contactInfo.getDatabaseAction().equalsIgnoreCase(DBConstants.ADD_ACTION_TYPE)) {
                    if (contactInfo.getContactType().equalsIgnoreCase(GrowerContactType.PRIMARY.toString())) {
                        throw new IrdSoapServicesException("Operation: " + DBConstants.ADD_ACTION_TYPE + " is currently un-supported for Contact Type: " + contactInfo.getContactType());
                    } else {
                        logger.info("Inserting Contact w/ ACCT_ID: " + contactInfo.getGrowerAccountId());
                        dao.insertContactInfo(contactInfo);
                    }
                } else if (contactInfo.getDatabaseAction().equalsIgnoreCase(DBConstants.UPDATE_ACTION_TYPE)) {
                    ContactInfo mergedContactInfo = mergeSuppliedContactInfoWithExisting(contactInfo);
                    logger.info("Updating Contact_Id: " + contactInfo.getContactId());
                    dao.updateContactInfo(mergedContactInfo, contactInfo.getContactType());
                } else if (contactInfo.getDatabaseAction().equalsIgnoreCase(DBConstants.DELETE_ACTION_TYPE)) {
                    logger.info("Deleting all details for Contact_Id: " + contactInfo.getContactId());
                    dao.deleteContactInfo(contactInfo);
                }
            }
            response.setHeader(getResponseHeader(request.getHeader()));
            response.setSaveContactsResponseBody(getSuccessResponse());
        } catch (Throwable e) {
            throwAccountInformationFault(e, logger, "saveContacts");
        }
        logger.debug("End: saveContacts()");
        return response;
    }

    private ContactInfo mergeSuppliedContactInfoWithExisting(ContactInfo newContactInfo) throws Exception {
        ContactInfo currentContact = dao.getContactByContactId(newContactInfo.getContactId(), newContactInfo.getContactType());
        if (currentContact == null) {
            throw new IrdSoapServicesException("Unable to find existing Contact w/ ContactId: " + newContactInfo.getContactId());
        }
        mergePhoneAndEmailInfo(newContactInfo, currentContact);
        return newContactInfo;
    }

    private void mergePhoneAndEmailInfo(ContactInfo newContactInfo, ContactInfo currentContact) throws Exception {
        if ((newContactInfo.getGrowerAccountId() != currentContact.getGrowerAccountId()) ||
                (newContactInfo.getContactId() != currentContact.getContactId())) {
            logger.error("Supplied Grower_Account_Id/Contact_Id conflicts with an existing Contact. Supplied Contact " + newContactInfo + " Existing Contact:" + currentContact);
            throw new IrdSoapServicesException("Supplied Contact_Id/Grower_Account_Id conflicts with an existing Contact. Supplied Contact " + newContactInfo + " Existing Contact:" + currentContact);
        }
        Map<String, Long> currentPhoneNumbersMap = extractContactPhoneIds(currentContact);
        for (ContactPhoneInfo newPhoneInfo : newContactInfo.getPhoneNumbers()) {
            if (newPhoneInfo != null) {
                if (currentPhoneNumbersMap.get(newPhoneInfo.getPhoneType()) != null) {
                    newPhoneInfo.setContactPhoneId(currentPhoneNumbersMap.get(newPhoneInfo.getPhoneType()));
                }
            }
        }
        Map<String, Long> currentEmailsMap = extractContactEmailIds(currentContact);
        for (ContactEmailInfo newEmailInfo : newContactInfo.getEmailAddresses()) {
            if (newEmailInfo != null) {
                if (currentEmailsMap.get(newEmailInfo.getEmailType()) != null) {
                    newEmailInfo.setContactEmailId(currentEmailsMap.get(newEmailInfo.getEmailType()));
                }
            }
        }
    }

    private Map<String, Long> extractContactPhoneIds(ContactInfo currentContact) throws Exception {
        Map<String, Long> currentPhoneNumbersMap = new HashMap<String, Long>();
        for (ContactPhoneInfo currentPhone : currentContact.getPhoneNumbers()) {
            if (currentPhone != null) {
                if (currentPhone.getContactPhoneId() == null) {
                    throw new IrdSoapServicesException("Exception merging exiting ContactPhoneInfo with Supplied. " + currentPhone.getPhoneType() + " Phone #" + currentPhone.getPhoneNumber() + " is missing the surrogate Id COBNTACT_PHONE_ID.");
                }
                if (currentPhone.getPhoneType() == null) {
                    throw new IrdSoapServicesException("Exception merging exiting ContactPhoneInfo with Supplied. Existing Phone Number has invalid PHONE_TYPE " + currentPhone.getPhoneType());
                } else {
                    currentPhoneNumbersMap.put(currentPhone.getPhoneType(), currentPhone.getContactPhoneId());
                }
            }
        }
        return currentPhoneNumbersMap;
    }

    private Map<String, Long> extractContactEmailIds(ContactInfo currentContact) throws Exception {
        Map<String, Long> currentEmailsMap = new HashMap<String, Long>();
        for (ContactEmailInfo currentEmail : currentContact.getEmailAddresses()) {
            if (currentEmail != null) {
                if (currentEmail.getEmailType() == null) {
                    throw new IrdSoapServicesException("Exception merging exiting ContactEmailInfo with Supplied. Existing EmailAddress has invalid EMAIL_TYPE " + currentEmail.getEmailType());
                }
                if (currentEmail.getContactEmailId() == null) {
                    throw new IrdSoapServicesException("Exception merging exiting ContactEmailInfo with Supplied. " + currentEmail.getEmailType() + " Email: " + currentEmail.getEmailAddress() + " is missing the surrogate Id CONTACT_EMAIL_ID.");
                }
                currentEmailsMap.put(currentEmail.getEmailType(), currentEmail.getContactEmailId());

            }
        }
        return currentEmailsMap;
    }

    public void setDao(IrdDao dao) {
        this.dao = dao;
    }

    protected long getValidatedGrowerAccountId(SaveContactsRequestType request) throws Exception {
        if (request == null || request.getSaveContactsRequestBody().getGrowerAccountId() <= 0) {
            throw new IrdSoapServicesException("Recieved in-valid Request for operation: saveContacts");
        }
        return request.getSaveContactsRequestBody().getGrowerAccountId();
    }

    protected void validateGetContactsRequest(GetContactsRequestType request) throws Exception {
        if(request == null || request.getGetContactsRequestBody() == null) {
            throw new IrdSoapServicesException("Recieved in-valid Request for operation: getContacts");
        }
        if((request.getGetContactsRequestBody().getGrowerAccountId()==null) &&
                (request.getGetContactsRequestBody().getContactId()==null)) {
            throw new IrdSoapServicesException("Recieved in-valid Request for operation: getContacts. Either GrowerAccountId or ContactId must be provided");
        }
        if(extractGrowerAccountId(request)+extractContactId(request)<= 0) {
            throw new IrdSoapServicesException("Recieved in-valid Request for operation: getContacts. Either GrowerAccountId or ContactId must be provided");            
        }
    }

    private long extractGrowerAccountId(GetContactsRequestType request) throws Exception {
        long accountId = 0;
        if(request.getGetContactsRequestBody().getGrowerAccountId()!= null) {
            accountId = request.getGetContactsRequestBody().getGrowerAccountId().longValue();
        }
        return accountId;
    }

    private long extractContactId(GetContactsRequestType request) throws Exception {
        long contactId = 0;
        if(request.getGetContactsRequestBody().getContactId()!= null) {
            contactId = request.getGetContactsRequestBody().getContactId().longValue();
        }
        return contactId;
    }


}

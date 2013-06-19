package com.monsanto.irdsoapservices.helper;

import com.monsanto.irdsoapservices.constants.DBConstants;
import com.monsanto.irdsoapservices.contacts.schema.*;
import com.monsanto.irdsoapservices.dao.ContactDao;
import com.monsanto.irdsoapservices.exception.IrdSoapServicesException;
import com.monsanto.irdsoapservices.service.ContactsFault;
import com.monsanto.irdsoapservices.to.ContactFunctionInfo;
import com.monsanto.irdsoapservices.to.ContactInfo;
import com.monsanto.irdsoapservices.utils.ErrorEmailer;
import com.monsanto.irdsoapservices.utils.StringUtils;
import com.monsanto.irdsoapservices.utils.XmlDateTimeUtil;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 17, 2009
 * To change this template use File | Settings | File Templates.
 */
public class ContactsHelper extends AbstractHelper {
    private ContactDao dao = null;
    Logger logger = Logger.getLogger(this.getClass());

    public GetContactsResponseType getContacts(GetContactsRequestType request) throws ContactsFault {
        GetContactsResponseType contactsResponse = null;
        long accountId=0;
        long contactId=0;
        List<ContactInfo> contacts= new ArrayList<ContactInfo>();
        try {
            validateGetContactsRequest(request);
            accountId = extractAccountId(request);
            contactId = extractContactId(request);
            List<String> contactFunctions = request.getGetContactsRequestBody().getContactFunctionList()==null?null:request.getGetContactsRequestBody().getContactFunctionList().getContactFunction();
            contacts = dao.getContacts(accountId, contactId, contactFunctions);
            contactsResponse = new GetContactsResponseType();
            contactsResponse.setGetContactsResponseBody(new GetContactsResponseBodyType());
            ContactListType contactsListType = new ContactListType();
            for (ContactInfo contactInfo : contacts) {
                if (contactInfo != null) {
                    contactsListType.getContactInfo().add(contactInfo.extractTypeObject());
                }
            }
            contactsResponse.getGetContactsResponseBody().setContactList(contactsListType);
            contactsResponse.setHeader(getResponseHeader(request.getHeader()));
        } catch (Throwable e) {
            logger.info("Retrieving contacts for AccountId: "+accountId+" and ContactId: "+contactId);
            logger.info("Returning "+contacts.size()+" contacts for AccountId: "+accountId+" and ContactId: "+contactId);
            throwContactsFault(e, logger, "getContacts");
        }
        logger.debug("End: getContacts()");
        return contactsResponse;
    }

    public InsertContactResponseType insertContacts(InsertContactRequestType request) throws ContactsFault {
        InsertContactResponseType response = null;
        try {
            validateInsertContactRequest(request);
            response = new InsertContactResponseType();
            long accountId = request.getInsertContactRequestBody().getAccountId();
            response.setHeader(getResponseHeader(request.getHeader()));
            List<InsertContactInfoType> insertContactInfoList = request.getInsertContactRequestBody().getContactList().getContactInfo();
            ContactListType contactList = new ContactListType();
            logger.info("Starting Inserts for "+insertContactInfoList.size()+" Contact(s) for AccountId:"+accountId);                                    
            for (InsertContactInfoType insertContactInfo : insertContactInfoList) {
                ContactInfo contactInfo = ContactInfo.parse(insertContactInfo, accountId, getRequestingPartnerUserId(request.getHeader()));
                validateInsertContactInfo(contactInfo);
                logger.info("Inserting Contact for AccountId:"+accountId+" w/ FirstName:"+contactInfo.getFirstName()+" LastName:"+contactInfo.getLastName());
                long contactId = dao.insertContact(contactInfo);
                if(contactId <= 0) {
                    throw new IrdSoapServicesException("Invalid ContactId returned from insertContacts() operation. ContactId: "+contactId);
                } else {
                    logger.info("Created new ContactId:"+contactId+" for AccountId:"+accountId);
                    contactInfo.setContactId(contactId);
                    contactList.getContactInfo().add(contactInfo.extractTypeObject());
                }
            }
            InsertContactResponseBodyType responseBody = new InsertContactResponseBodyType();
            responseBody.setAccountId(accountId);
            responseBody.setContactList(contactList);
            response.setInsertContactResponseBody(responseBody);
        } catch (Throwable e) {
            throwContactsFault(e, logger, "insertContacts");
        }
        logger.debug("End: insertContacts()");
        return response;
    }

    public UpdateContactsResponseType updateContacts(UpdateContactsRequestType request) throws ContactsFault {
        UpdateContactsResponseType response = null;
        try {
            validateUpdateContactRequest(request);
            long accountId = request.getUpdateContactsRequestBody().getAccountId();
            logger.info("Initiating UPDATE for Contacts with AccountId:"+accountId);
            response = new UpdateContactsResponseType();
            response.setHeader(getResponseHeader(request.getHeader()));
            List<PersistableContactInfoType> persistableContactList = request.getUpdateContactsRequestBody().getContactList().getContactInfo();
            for(PersistableContactInfoType persistableContact : persistableContactList) {
                logger.info("Updating Contact with ContactId:"+persistableContact.getContactId());
                ContactInfo contactInfo = ContactInfo.parse(persistableContact, accountId, getRequestingPartnerUserId(request.getHeader()));
                int rows = dao.updateContact(contactInfo);
                logger.info("Updated "+rows+" Rows.");
            }
            response.setUpdateContactsResponseBody(getSuccessResponseType());
        } catch (Throwable e) {
            throwContactsFault(e, logger, "updateContacts");
        }
        logger.debug("End: updateContacts()");
        return response;

    }

    public AddContactFunctionResponseType addContactFunction(AddContactFunctionRequestType request) throws ContactsFault {
        AddContactFunctionResponseType response = null;
        try {
            validateAddContactFunctionRequest(request);
            long accountId = request.getAddContactFunctionRequestBody().getAccountId();
            long contactId = request.getAddContactFunctionRequestBody().getContactId();
            logger.info("Adding Contact Functions for AccountId:"+accountId+" and ContactId:"+contactId);
            response = new AddContactFunctionResponseType();
            response.setHeader(getResponseHeader(request.getHeader()));
            if(!dao.isContactExisting(accountId, contactId)) {
                throw new IrdSoapServicesException("Unable to Add Contact Functions. Provided AccountId and ContactId do not match.");
            }
            int count = 0;
            String endUserId = getRequestingPartnerUserId(request.getHeader());
            for(String contactFunction : request.getAddContactFunctionRequestBody().getContactFunctionList().getContactFunction()) {
                logger.info("Adding "+contactFunction+" Function for ContactId:"+contactId);
                ContactFunctionInfo contactFunctionInfo = new ContactFunctionInfo(contactId, contactFunction);
                contactFunctionInfo.setRowUserId(endUserId);
                count+= dao.insertContactFunction(contactFunctionInfo);
            }
            logger.info("Finished adding "+count+" functions");
            response.setAddContactFunctionResponseBody(getSuccessResponseType());
        } catch (Throwable e) {
            throwContactsFault(e, logger, "addContactFunction");
        }
        logger.debug("End: addContactFunction()");
        return response;
    }

    public RemoveContactFunctionResponseType removeContactFunction(RemoveContactFunctionRequestType request) throws ContactsFault {
        RemoveContactFunctionResponseType response = null;
        try {
            validateRemoveContactFunctionRequest(request);
            long accountId = request.getRemoveContactFunctionRequestBody().getAccountId();
            long contactId = request.getRemoveContactFunctionRequestBody().getContactId();
            logger.info("Removing Contact Functions for AccountId:"+accountId+" and ContactId:"+contactId);
            response = new RemoveContactFunctionResponseType();
            response.setHeader(getResponseHeader(request.getHeader()));
            if(!dao.isContactExisting(accountId, contactId)) {
                throw new IrdSoapServicesException("Unable to Remove Contact Functions. Provided AccountId and ContactId do not match.");
            }
            int count = 0;
            for(String contactFunction : request.getRemoveContactFunctionRequestBody().getContactFunctionList().getContactFunction()) {
                logger.info("Removing "+contactFunction+" Function for ContactId:"+contactId);
                count+= dao.deleteContactFunction(new ContactFunctionInfo(contactId, contactFunction));
            }
            logger.info("Finished removing "+count+" functions");
            response.setRemoveContactFunctionResponseBody(getSuccessResponseType());
        } catch (Throwable e) {
            throwContactsFault(e, logger, "removeContactFunction");
        }
        logger.debug("End: removeContactFunction()");
        return response;
    }

    public DeleteContactResponseType deleteContacts(DeleteContactRequestType request) throws ContactsFault {
        DeleteContactResponseType response = null;
        try {
            validateDeleteContactRequest(request);
            long accountId = request.getDeleteContactRequestBody().getAccountId();
            logger.info("Deleting Contacts for AccountId:"+accountId);
            response = new DeleteContactResponseType();
            response.setHeader(getResponseHeader(request.getHeader()));
            int count = 0;
            for(Long lContactId : request.getDeleteContactRequestBody().getContactId()) {
                long contactId = (lContactId == null) ? 0: lContactId.longValue();
                if(!dao.isContactExisting(accountId, contactId)) {
                    throw new IrdSoapServicesException("Unable to Delete Contact. Provided AccountId and ContactId do not match.");
                }
                int functionCount = dao.getContactFunctions(contactId).size();
                if( functionCount > 0) {
                    throw new IrdSoapServicesException("There are "+functionCount+" ContactFunction(s) attached to ContactId:"+lContactId+". Contacts with existing ContactFunctions cannot be Deleted.");
                }
                logger.info("Deleting ContactId:"+contactId+" and all associated data.");
                count+= dao.deleteContact(contactId);
            }
            logger.info("Deleted a total of "+count+" Rows");
            response.setDeleteContactResponseBody(getSuccessResponseType());
        } catch (Throwable e) {
            throwContactsFault(e, logger, "deleteContacts");
        }
        logger.debug("End: deleteContacts()");
        return response;
    }

    private SuccessResponseType getSuccessResponseType() throws Exception {
        SuccessResponseType successResponse = new SuccessResponseType();
        successResponse.setStatus(DBConstants.SUCCESS);
        successResponse.setLastModifiedDate(XmlDateTimeUtil.transformToXmlGregorianCalendar(Calendar.getInstance()));
        return successResponse;
    }

    protected void throwContactsFault(Throwable error, Logger logger, String operationName) throws ContactsFault {
        logger.error(error,error);
        new ErrorEmailer().sendErrorEmail(error, "Error occurred during operation: " + operationName);
        ExceptionType exception = new ExceptionType();
        exception.setFaultCode(error.getMessage());
        exception.setFaultMessage(getStackTrace(error));
        throw new ContactsFault("Error occurred during operation: " + operationName+". "+error.getMessage(), exception, error);
    }


    public void setDao(ContactDao dao) {
        this.dao = dao;
    }

    protected void validateGetContactsRequest(GetContactsRequestType request) throws Exception {
        if(request == null || request.getGetContactsRequestBody() == null) {
            throw new IrdSoapServicesException("Recieved in-valid Request for operation: getContacts");
        }
        if((request.getGetContactsRequestBody().getAccountId()==null) &&
                (request.getGetContactsRequestBody().getContactId()==null)) {
            throw new IrdSoapServicesException("Recieved in-valid Request for operation: getContacts. Either GrowerAccountId or ContactId must be provided");
        }
        if(extractAccountId(request)+extractContactId(request)<= 0) {
            throw new IrdSoapServicesException("Recieved in-valid Request for operation: getContacts. Either GrowerAccountId or ContactId must be provided");            
        }
    }

    private void validateAddContactFunctionRequest(AddContactFunctionRequestType request) throws Exception {
        if(request == null || request.getAddContactFunctionRequestBody() == null) {
            throw new IrdSoapServicesException("Received in-valid request for operation: addContactFunction()");
        }
        if((request.getAddContactFunctionRequestBody().getAccountId()<=0) ||
                (request.getAddContactFunctionRequestBody().getContactId()<=0) ||
                (request.getAddContactFunctionRequestBody().getContactFunctionList().getContactFunction()==null)||
                (request.getAddContactFunctionRequestBody().getContactFunctionList().getContactFunction().size()<1)) {
            throw new IrdSoapServicesException("Received in-valid Request for operation: addContactFunction(). A valid AccountId, ContactId and at least one ContactFunction are required.");
        }
    }

    private void validateRemoveContactFunctionRequest(RemoveContactFunctionRequestType request) throws Exception {
        if(request == null || request.getRemoveContactFunctionRequestBody() == null) {
            throw new IrdSoapServicesException("Received in-valid request for operation: addContactFunction()");
        }
        if((request.getRemoveContactFunctionRequestBody().getAccountId()<=0) ||
                (request.getRemoveContactFunctionRequestBody().getContactId()<=0) ||
                (request.getRemoveContactFunctionRequestBody().getContactFunctionList().getContactFunction()==null)||
                (request.getRemoveContactFunctionRequestBody().getContactFunctionList().getContactFunction().size()<1)) {
            throw new IrdSoapServicesException("Received in-valid Request for operation: removeContactFunction(). A valid AccountId, ContactId and at least one ContactFunction are required.");
        }
    }

    private void validateDeleteContactRequest(DeleteContactRequestType request) throws Exception {
        if(request == null || request.getDeleteContactRequestBody() == null) {
            throw new IrdSoapServicesException("Received in-valid request for operation: deleteContact()");
        }
        if((request.getDeleteContactRequestBody().getAccountId()<=0) ||
                (request.getDeleteContactRequestBody().getContactId()==null) ||
                (request.getDeleteContactRequestBody().getContactId().size()<1)) {
            throw new IrdSoapServicesException("Received in-valid Request for operation: deleteContact(). A valid AccountId and at least one ContactId are required.");
        }
    }

    private long extractAccountId(GetContactsRequestType request) throws Exception {
        long accountId = 0;
        if(request.getGetContactsRequestBody().getAccountId()!= null) {
            accountId = request.getGetContactsRequestBody().getAccountId().longValue();
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

    protected void validateInsertContactRequest(InsertContactRequestType request) throws Exception {
        if((request==null) ||
                (request.getInsertContactRequestBody().getAccountId()<=0) ||
                (request.getInsertContactRequestBody().getContactList().getContactInfo()==null)||
                (request.getInsertContactRequestBody().getContactList().getContactInfo().size()<1)) {
            throw new IrdSoapServicesException("Received in-valid Request for Operation: insertContacts. A valid AccountId and at least one ContactInfo are required");
        }
    }
    
    protected void validateUpdateContactRequest(UpdateContactsRequestType request) throws Exception {
         if((request==null) || (request.getUpdateContactsRequestBody()==null) ||
                (request.getUpdateContactsRequestBody().getAccountId()<=0) ||
                (request.getUpdateContactsRequestBody().getContactList()==null) || 
                (request.getUpdateContactsRequestBody().getContactList().getContactInfo()==null)) {
            throw new IrdSoapServicesException("Received in-valid Request for Operation: updateContacts. A valid AccountId and at least one ContactInfo are required");
        }
    }

    protected void validateInsertContactInfo(ContactInfo contactInfo) throws Exception {
        if((contactInfo == null)||
                (StringUtils.isNullOrEmpty(contactInfo.getFirstName()))||
                (StringUtils.isNullOrEmpty(contactInfo.getLastName()))||
                (StringUtils.isNullOrEmpty(contactInfo.getContactType()))) {
            throw new IrdSoapServicesException("Received in-valid ContactInfo element for Operation: insertContacts. FirstName, LastName and ContactFunction are all required.");            
        }
    }

    protected void validateUpdateContactInfo(ContactInfo contactInfo) throws Exception {
        if((contactInfo == null)||
                (contactInfo.getContactId()<=0)||
                ((contactInfo.getLastName()!=null) && StringUtils.isNullOrEmpty(contactInfo.getLastName()))||
                ((contactInfo.getFirstName()!=null) && StringUtils.isNullOrEmpty(contactInfo.getFirstName()))) {
            throw new IrdSoapServicesException("Received in-valid ContactInfo element for Operation: updateContacts. Valid ContactId is required and FirstName/LastName cannot be blank.");
        }
    }


}

package com.monsanto.irdsoapservices.service.impl;

import com.monsanto.irdsoapservices.service.ContactService;
import com.monsanto.irdsoapservices.service.ContactsFault;
import com.monsanto.irdsoapservices.contacts.schema.*;
import com.monsanto.irdsoapservices.helper.ContactsHelper;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Nov 3, 2009
 * Time: 2:21:04 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "com.monsanto.irdsoapservices.service.ContactService")
public class ContactServiceImpl implements ContactService {
    Logger logger = Logger.getLogger(this.getClass());
    ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    public GetContactsResponseType getContacts(@WebParam(name = "GetContactsRequest", targetNamespace = "urn:monsanto:ird:services:contacts", partName = "getContactsRequest") GetContactsRequestType getContactsRequest) throws ContactsFault {
        logger.debug("Begin: getContacts()");
        ContactsHelper contactsHelper = (ContactsHelper) appContext.getBean("contactsHelper");
        return contactsHelper.getContacts(getContactsRequest);
    }

    public InsertContactResponseType insertContacts(@WebParam(name = "InsertContactRequest", targetNamespace = "urn:monsanto:ird:services:contacts", partName = "insertContactsRequest") InsertContactRequestType insertContactsRequest) throws ContactsFault {
        logger.debug("Begin: insertContacts()");
        ContactsHelper contactsHelper = (ContactsHelper) appContext.getBean("contactsHelper");
        return contactsHelper.insertContacts(insertContactsRequest);
    }

    public UpdateContactsResponseType updateContacts(@WebParam(name = "UpdateContactsRequest", targetNamespace = "urn:monsanto:ird:services:contacts", partName = "updateContactsRequest") UpdateContactsRequestType updateContactsRequest) throws ContactsFault {
        logger.debug("Begin: updateContacts()");
        ContactsHelper contactsHelper = (ContactsHelper) appContext.getBean("contactsHelper");
        return contactsHelper.updateContacts(updateContactsRequest);
    }

    public DeleteContactResponseType deleteContact(@WebParam(name = "DeleteContactRequest", targetNamespace = "urn:monsanto:ird:services:contacts", partName = "deleteContactRequest") DeleteContactRequestType deleteContactRequest) throws ContactsFault {
        logger.debug("Begin: deleteContacts()");
        ContactsHelper contactsHelper = (ContactsHelper) appContext.getBean("contactsHelper");
        return contactsHelper.deleteContacts(deleteContactRequest);
    }

    public AddContactFunctionResponseType addContactFunction(@WebParam(name = "AddContactFunctionRequest", targetNamespace = "urn:monsanto:ird:services:contacts", partName = "addContactFunctionRequest") AddContactFunctionRequestType addContactFunctionRequest) throws ContactsFault {
        logger.debug("Begin: addContactFunction()");
        ContactsHelper contactsHelper = (ContactsHelper) appContext.getBean("contactsHelper");
        return contactsHelper.addContactFunction(addContactFunctionRequest);
    }

    public RemoveContactFunctionResponseType removeContactFunction(@WebParam(name = "RemoveContactFunctionRequest", targetNamespace = "urn:monsanto:ird:services:contacts", partName = "removeContactFunctionRequest") RemoveContactFunctionRequestType removeContactFunctionRequest) throws ContactsFault {
        logger.debug("Begin: removeContactFunction()");
        ContactsHelper contactsHelper = (ContactsHelper) appContext.getBean("contactsHelper");
        return contactsHelper.removeContactFunction(removeContactFunctionRequest);
    }
}

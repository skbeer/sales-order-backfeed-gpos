package com.monsanto.irdsoapservices.service.impl;

import com.monsanto.irdsoapservices.helper.AccountAttributesHelper;
import com.monsanto.irdsoapservices.helper.AccountDetailsHelper;
import com.monsanto.irdsoapservices.helper.ContactsHelper;
import com.monsanto.irdsoapservices.schema.*;
import com.monsanto.irdsoapservices.service.AccountInformationFault;
import com.monsanto.irdsoapservices.service.AccountInformationService;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 17, 2009
 * Time: 2:46:39 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "com.monsanto.irdsoapservices.service.AccountInformationService")
public class AccountInformationServiceImpl implements AccountInformationService {
    Logger logger = Logger.getLogger(this.getClass());
    ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//    public GetContactsResponseType getContacts(@WebParam(name = "GetContactsRequest", targetNamespace = "urn:monsanto:ird:services:account:information", partName = "request") GetContactsRequestType request)
//            throws AccountInformationFault {
//        logger.debug("Begin: getContacts()");
//        ContactsHelper contactsHelper = (ContactsHelper) appContext.getBean("contactsHelper");
//        return contactsHelper.getContacts(request);
//    }

    public GetAccountAttributesResponseType getAccountAttributes(@WebParam(name = "GetAccountAttributesRequest", targetNamespace = "urn:monsanto:ird:services:account:information", partName = "request") GetAccountAttributesRequestType request)
            throws AccountInformationFault {
        logger.debug("Begin: getAccountAttributes()");
        AccountAttributesHelper accountAttributesHelper = (AccountAttributesHelper) appContext.getBean("accountAttributesHelper");
        return accountAttributesHelper.getAccountAttributes(request);
    }

    public SaveAccountDetailsResponseType saveAccountDetails(@WebParam(name = "SaveAccountDetailsRequest", targetNamespace = "urn:monsanto:ird:services:account:information", partName = "request") SaveAccountDetailsRequestType request)
            throws AccountInformationFault {
        logger.debug("Begin: saveAccountDetails()");
        AccountDetailsHelper accountDetailsHelper = (AccountDetailsHelper) appContext.getBean("accountDetailsHelper");
        return accountDetailsHelper.saveAccountDetails(request);
    }

    public SaveAccountAttributesResponseType saveAccountAttributes(@WebParam(name = "SaveAccountAttributesRequest", targetNamespace = "urn:monsanto:ird:services:account:information", partName = "request") SaveAccountAttributesRequestType request)
            throws AccountInformationFault {
        logger.debug("Begin: saveAccountAttributes()");
        AccountAttributesHelper accountAttributesHelper = (AccountAttributesHelper) appContext.getBean("accountAttributesHelper");
        return accountAttributesHelper.saveAccountAttributes(request);
    }

    public GetAccountDetailsResponseType getAccountDetails(@WebParam(name = "GetAccountDetailsRequest", targetNamespace = "urn:monsanto:ird:services:account:information", partName = "request") GetAccountDetailsRequestType request)
            throws AccountInformationFault {
        logger.debug("Begin: getAccountDetails()");
        AccountDetailsHelper accountDetailsHelper = (AccountDetailsHelper) appContext.getBean("accountDetailsHelper");
        return accountDetailsHelper.getAccountDetails(request);
    }

//    public SaveContactsResponseType saveContacts(@WebParam(name = "SaveContactsRequest", targetNamespace = "urn:monsanto:ird:services:account:information", partName = "request") SaveContactsRequestType request)
//            throws AccountInformationFault {
//        logger.debug("Begin: saveContacts()");
//        ContactsHelper contactsHelper = (ContactsHelper) appContext.getBean("contactsHelper");
//        return contactsHelper.saveContacts(request);
//    }

    public GetAssociatedEmployeesResponseType getAssociatedEmployees(@WebParam(name = "GetAssociatedEmployeesRequest", targetNamespace = "urn:monsanto:ird:services:account:information", partName = "request") GetAssociatedEmployeesRequestType request) throws AccountInformationFault {
        logger.debug("Begin: getAssociatedEmployees()");
        AccountDetailsHelper accountDetailsHelper = (AccountDetailsHelper) appContext.getBean("accountDetailsHelper");
        return accountDetailsHelper.getAssociatedEmployees(request);
    }
}

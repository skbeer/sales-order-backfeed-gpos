package com.monsanto.irdsoapservices.service.impl;

import com.monsanto.irdsoapservices.agreements.schema.*;
import com.monsanto.irdsoapservices.helper.AgreementsHelper;
import com.monsanto.irdsoapservices.service.AccountAgreementService;
import com.monsanto.irdsoapservices.service.AccountAgreementsFault;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 30, 2009
 * Time: 4:04:56 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "com.monsanto.irdsoapservices.service.AccountAgreementService")
public class AccountAgreementsServiceImpl implements AccountAgreementService {
    Logger logger = Logger.getLogger(this.getClass());
    ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    public GetAgreementsResponseType getAgreements(@WebParam(name = "GetAgreementsRequest", targetNamespace = "urn:monsanto:ird:services:account:agreement", partName = "request") GetAgreementsRequestType request) throws AccountAgreementsFault {
        AgreementsHelper helper = (AgreementsHelper)appContext.getBean("agreementsHelper");
        logger.debug("Begin: getAgreements()");
        return helper.getAgreements(request);
    }

    public UpdateAgreementResponseType updateAgreement(@WebParam(name = "UpdateAgreementRequest", targetNamespace = "urn:monsanto:ird:services:account:agreement", partName = "request") UpdateAgreementRequestType request) throws AccountAgreementsFault {
        AgreementsHelper helper = (AgreementsHelper)appContext.getBean("agreementsHelper");
        logger.debug("Begin: updateAgreement()");
        return helper.updateAgreement(request);
    }

    public GetAgreementHierarchyResponseType getAgreementHierarchy(@WebParam(name = "GetAgreementHierarchyRequest", targetNamespace = "urn:monsanto:ird:services:account:agreement", partName = "request") GetAgreementHierarchyRequestType request) throws AccountAgreementsFault {
        AgreementsHelper helper = (AgreementsHelper)appContext.getBean("agreementsHelper");
        logger.debug("Begin: getAgreementHierarchy()");
        return helper.getAgreementHierarchy(request);
    }

    public GetSignersForAgreementsResponseType getSignersForAgreements(@WebParam(name = "GetSignersForAgreementsRequest", targetNamespace = "urn:monsanto:ird:services:account:agreement", partName = "request") GetSignersForAgreementsRequestType request) throws AccountAgreementsFault {
        AgreementsHelper helper = (AgreementsHelper)appContext.getBean("agreementsHelper");
        logger.debug("Begin: GetSignersForAgreements()");
        return helper.getSignersForAgreements(request);
    }
}

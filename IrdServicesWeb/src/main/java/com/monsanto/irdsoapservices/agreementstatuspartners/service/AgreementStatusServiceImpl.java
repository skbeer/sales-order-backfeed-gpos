package com.monsanto.irdsoapservices.agreementstatuspartners.service;



import com.monsanto.irdsoapservices.agreementstatuspartners.helper.AgreementStatusHelper;
import com.monsanto.irdsoapservices.agreementstatuspartners.schema.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "com.monsanto.irdsoapservices.agreementstatuspartners.schema.AgreementStatusService")
public class AgreementStatusServiceImpl implements AgreementStatusService {
    ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Override
    public AgreementStatusResponseType getAgreementStatus(
            @WebParam(name = "AgreementStatusRequest", targetNamespace = "urn:cidx:names:specification:ces:schema:all:5:3", partName = "request") AgreementStatusRequestType request) throws AgreementStatusFault {
        AgreementStatusHelper helper = (AgreementStatusHelper) appContext.getBean("agreementStatusPartnersHelper");
        return helper.getAgreementStatus(request);
    }



}

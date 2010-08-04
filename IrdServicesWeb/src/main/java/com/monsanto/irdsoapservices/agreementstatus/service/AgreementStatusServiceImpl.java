package com.monsanto.irdsoapservices.agreementstatus.service;

import com.monsanto.irdsoapservices.agreementstatus.helper.AgreementStatusHelper;
import com.monsanto.irdsoapservices.agreementstatus.schema.AgreementStatusService;
import com.monsanto.irdsoapservices.agreementstatus.schema.AgreementStatusFault;
import com.monsanto.irdsoapservices.agreementstatus.schema.request.AgreementStatusRequest;
import com.monsanto.irdsoapservices.agreementstatus.schema.response.AgreementStatusResponseType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jul 12, 2010
 * Time: 4:00:52 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "com.monsanto.irdsoapservices.agreementstatus.schema.AgreementStatusService")
public class AgreementStatusServiceImpl implements AgreementStatusService {
    ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    public AgreementStatusResponseType getAgreementStatus(@WebParam(name = "AgreementStatusRequest", targetNamespace = "urn:ecms:schema:agreement:request:2:0", partName = "request") AgreementStatusRequest request) throws AgreementStatusFault {
        AgreementStatusHelper helper = (AgreementStatusHelper) appContext.getBean("agreementStatusHelper");
        return helper.getAgreementStatus(request);
    }
}

package com.monsanto.irdsoapservices.retailseller.service;

import com.monsanto.irdsoapservices.retailseller.schema.RetailSellerInformationService;
import com.monsanto.irdsoapservices.retailseller.schema.RetailSellerResponseType;
import com.monsanto.irdsoapservices.retailseller.schema.RetailSellerInformationType;
import com.monsanto.irdsoapservices.retailseller.schema.RetailSellerFault;
import com.monsanto.irdsoapservices.retailseller.helper.RetailSellerHelper;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 29, 2010
 * Time: 12:21:30 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "com.monsanto.irdsoapservices.retailseller.schema.RetailSellerInformationService")
public class RetailSellerInformationServiceImpl implements RetailSellerInformationService {
    ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    public RetailSellerResponseType saveRetailSellerInformation(@WebParam(name = "RetailSellerInformation", targetNamespace = "urn:ecms:schema:retailsellerinformation:request:1:0", partName = "request") RetailSellerInformationType request) throws RetailSellerFault {
        RetailSellerHelper helper = (RetailSellerHelper) appContext.getBean("retailSellerHelper");
        return helper.insertRetailSellerInformation(request);
    }
}

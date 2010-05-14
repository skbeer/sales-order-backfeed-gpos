package com.monsanto.irdsoapservices.service.impl;

import com.monsanto.irdsoapservices.service.VistiveProcessorListService;
import com.monsanto.irdsoapservices.service.VistiveProcessorListFault;
import com.monsanto.irdsoapservices.vistiveprocessorlist.schema.VistiveProcessorListType;
import com.monsanto.irdsoapservices.vistiveprocessorlist.schema.VistiveProcessorListRequestType;
import com.monsanto.irdsoapservices.vistiveprocessorlist.schema.VistiveProcessorListFaultType;
import com.monsanto.irdsoapservices.helper.VistiveProcessorHelper;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: svadlam
 * Date: Apr 28, 2010
 * Time: 10:24:02 AM
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "com.monsanto.irdsoapservices.service.VistiveProcessorListService")
public class VistiveProcessorListServiceImpl implements VistiveProcessorListService{
     Logger logger = Logger.getLogger(this.getClass());
    ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    public VistiveProcessorListType getVistiveProcessorList(@WebParam(name = "VistiveProcessorListRequest", targetNamespace = "urn:ecms:schema:vistiveprocessorlist:1:0", partName = "request") VistiveProcessorListRequestType request) throws VistiveProcessorListFault {
        logger.info("calling VistiveProcessorListService");
        VistiveProcessorHelper helper = (VistiveProcessorHelper)appContext.getBean("visitveProcessorHelper");
        return helper.getVistiveProcessorList(request); 
    }
}

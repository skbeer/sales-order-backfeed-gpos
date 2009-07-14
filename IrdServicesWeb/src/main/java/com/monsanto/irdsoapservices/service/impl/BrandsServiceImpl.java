package com.monsanto.irdsoapservices.service.impl;

import com.monsanto.irdsoapservices.brands.schema.GetBrandsRequestType;
import com.monsanto.irdsoapservices.brands.schema.GetBrandsResponseType;
import com.monsanto.irdsoapservices.helper.BrandsHelper;
import com.monsanto.irdsoapservices.service.BrandsFault;
import com.monsanto.irdsoapservices.service.BrandsService;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Apr 1, 2009
 * Time: 3:28:46 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "com.monsanto.irdsoapservices.service.BrandsService")
public class BrandsServiceImpl implements BrandsService {
    Logger logger = Logger.getLogger(this.getClass());
    ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    public GetBrandsResponseType getBrands(@WebParam(name = "GetBrandsRequest", targetNamespace = "urn:monsanto:ird:services:brands", partName = "request") GetBrandsRequestType request) throws BrandsFault {
        logger.debug("Begin: getBrands()");
        BrandsHelper helper = (BrandsHelper)appContext.getBean("brandsHelper");
        return helper.getBrands(request);
    }
}

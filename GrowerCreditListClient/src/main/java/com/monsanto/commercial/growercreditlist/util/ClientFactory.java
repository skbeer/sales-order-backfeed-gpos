package com.monsanto.commercial.growercreditlist.util;

import javax.xml.namespace.QName;
import java.net.URL;

import org.apache.log4j.Logger;
import com.monsanto.commercial.growercreditlist.exception.ServiceInitializationException;
import com.monsanto.commercial.growercreditlist.gen.creditinfo.service.GrowerCredit_Service;
import com.monsanto.commercial.growercreditlist.gen.creditlist.service.GrowerCreditList_Service;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Oct 5, 2011
 * Time: 1:07:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClientFactory {
    private Logger logger = Logger.getLogger(this.getClass());

    public GrowerCredit_Service getCreditInfoService(EnvironmentEnum environment) throws ServiceInitializationException {
        GrowerCredit_Service service = null;
        try {
            URL url = getWsdlLocation(environment, "creditinfo");
            QName qName = new QName("Monsanto:Service:GrowerCredit", "GrowerCredit");
            service = new GrowerCredit_Service(url, qName);
            service.setHandlerResolver(getServiceAccountSecurityHandler());
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceInitializationException("Exception initializing CreditInfo service", e);
        }
        return service;
    }

    public GrowerCreditList_Service getGrowerCreditListService(EnvironmentEnum environment) throws ServiceInitializationException {
        GrowerCreditList_Service service = null;
        try {
            URL url = getWsdlLocation(environment, "creditlist");
            QName qName = new QName("Monsanto:Service:GrowerCreditList", "GrowerCreditList");
            service = new GrowerCreditList_Service(url, qName);
            service.setHandlerResolver(getServiceAccountSecurityHandler());
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceInitializationException("Exception initializing GrowerCreditList service", e);
        }
        return service;
    }

    private URL getWsdlLocation(EnvironmentEnum environment, String serviceName) throws Exception {
        String wsdlLocation = URLProperties.getInstance().getWsdlLocation(environment, serviceName);
        logger.info("Returning Client for WSDL: "+wsdlLocation);
        return new URL(wsdlLocation);
    }

    private SecurityHandlerResolver getServiceAccountSecurityHandler() throws Exception {
        EncryptionUtil encryptionUtil = EncryptionUtil.getInstance();
        return new SecurityHandlerResolver(encryptionUtil.getUserName(), encryptionUtil.getPassword());
    }

}

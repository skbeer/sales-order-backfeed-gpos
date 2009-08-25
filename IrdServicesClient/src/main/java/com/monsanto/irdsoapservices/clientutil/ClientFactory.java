package com.monsanto.irdsoapservices.clientutil;

import com.monsanto.irdsoapservices.agreements.client.AccountAgreementService_Service;
import com.monsanto.irdsoapservices.brands.client.BrandsService_Service;
import com.monsanto.irdsoapservices.client.AccountInformationService_Service;
import org.apache.log4j.Logger;

import javax.xml.namespace.QName;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: mkuchip
 * Date: Mar 25, 2009
 * Time: 9:31:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class ClientFactory {
    static Logger logger = Logger.getLogger(ClientFactory.class);

    public static QName ACCT_INFORMATION_QNAME = new QName("urn:monsanto:ird:services:wsdl:account:information:1:0", "AccountInformationService");
    public static QName ACCT_AGREEMENTS_QNAME = new QName("urn:monsanto:ird:services:wsdl:account:agreement:1:0", "AccountAgreementService");
    public static QName BRANDS_QNAME = new QName("urn:monsanto:ird:services:wsdl:brands:1:0", "BrandsService");

    public static AccountInformationService_Service getAccountInformationClient(EnvironmentEnum environment, String username, String password) throws Exception {
        String wsdlLocation = Configuration.getInstance().getWsdlLocation(environment, Configuration.ACCOUNT_INFORMATION_SERVICE);
        logger.info("ClientFactory:: Creating new Service Stub using WSDL - " + wsdlLocation);
        URL url = new URL(wsdlLocation);
        AccountInformationService_Service acctInfoService = new AccountInformationService_Service(url, ACCT_INFORMATION_QNAME);
        if(!isNullOrEmpty(username) || !isNullOrEmpty(password)) {
            acctInfoService.setHandlerResolver(new SecurityHandlerResolver(username, password));
        }
        return acctInfoService;
    }
    
    public static AccountAgreementService_Service getAccountAgreementClient(EnvironmentEnum environment, String username, String password) throws Exception {
        String wsdlLocation = Configuration.getInstance().getWsdlLocation(environment, Configuration.ACCOUNT_AGREEMENTS_SERVICE);
        logger.info("ClientFactory:: Creating new Service Stub using WSDL - " + wsdlLocation);
        URL url = new URL(wsdlLocation);
        AccountAgreementService_Service acctAgrService = new AccountAgreementService_Service(url, ACCT_AGREEMENTS_QNAME);
        if(!isNullOrEmpty(username) || !isNullOrEmpty(password)) {
            acctAgrService.setHandlerResolver(new SecurityHandlerResolver(username, password));
        }
        return acctAgrService;
    }

    public static BrandsService_Service getBrandsClient(EnvironmentEnum environment, String username, String password) throws Exception  {
        String wsdlLocation = Configuration.getInstance().getWsdlLocation(environment, Configuration.BRANDS_SERVICE);
        logger.info("ClientFactory:: Creating new Service Stub using WSDL - " + wsdlLocation);
        URL url =  new URL(wsdlLocation);
        BrandsService_Service brandsService = new BrandsService_Service(url, BRANDS_QNAME);
        if(!isNullOrEmpty(username) || !isNullOrEmpty(password)) {
            brandsService.setHandlerResolver(new SecurityHandlerResolver(username, password));
        }
        return brandsService;
    }
    
    private static boolean isNullOrEmpty(String str) {
        return (str==null)||(str.trim().length()==0);
    }

}

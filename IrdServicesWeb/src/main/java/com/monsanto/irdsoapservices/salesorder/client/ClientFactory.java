package com.monsanto.irdsoapservices.salesorder.client;

import com.monsanto.irdsoapservices.salesorder.schema.SalesOrderService;
import com.monsanto.irdsoapservices.salesorder.schema.SalesOrderService_Service;
import com.monsanto.irdsoapservices.utils.Configuration;

import java.net.URL;

import org.apache.log4j.Logger;

import javax.xml.namespace.QName;


/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 10, 2010
 * Time: 2:24:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClientFactory {
    static Logger logger = Logger.getLogger(ClientFactory.class);
    public final QName SALES_ORDER_QNAME = new QName("urn:monsanto:services:wsdl:salesorder:1:0", "SalesOrderService");

    public SalesOrderService getSalesOrderClient() throws Exception {
        String wsdlLocation = Configuration.getInstance().getProperty("osb.url")+Configuration.getInstance().getProperty("salesorder.uri");
        logger.info("ClientFactory:: Creating client for WSDL - " + wsdlLocation);
        URL url = new URL(wsdlLocation);
        SalesOrderService_Service salesOrder = new SalesOrderService_Service(url, SALES_ORDER_QNAME);
        return salesOrder.getSalesOrderServicePort();
    }
}

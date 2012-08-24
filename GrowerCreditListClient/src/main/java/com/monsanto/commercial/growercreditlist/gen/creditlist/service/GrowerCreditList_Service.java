
package com.monsanto.commercial.growercreditlist.gen.creditlist.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.2-b05-RC1
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "GrowerCreditList", targetNamespace = "Monsanto:Service:GrowerCreditList", wsdlLocation = "http://services-dint.monsanto.com/USST_SouthernStates/GrowerCreditList?wsdl")
public class GrowerCreditList_Service
    extends Service
{

    private final static URL GROWERCREDITLIST_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.monsanto.commercial.growercreditlist.gen.creditlist.service.GrowerCreditList_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.monsanto.commercial.growercreditlist.gen.creditlist.service.GrowerCreditList_Service.class.getResource(".");
            url = new URL(baseUrl, "http://services-dint.monsanto.com/USST_SouthernStates/GrowerCreditList?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://services-dint.monsanto.com/USST_SouthernStates/GrowerCreditList?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        GROWERCREDITLIST_WSDL_LOCATION = url;
    }

    public GrowerCreditList_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GrowerCreditList_Service() {
        super(GROWERCREDITLIST_WSDL_LOCATION, new QName("Monsanto:Service:GrowerCreditList", "GrowerCreditList"));
    }

    /**
     * 
     * @return
     *     returns GrowerCreditList
     */
    @WebEndpoint(name = "GrowerCreditList_Port")
    public GrowerCreditList getGrowerCreditListPort() {
        return super.getPort(new QName("Monsanto:Service:GrowerCreditList", "GrowerCreditList_Port"), GrowerCreditList.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GrowerCreditList
     */
    @WebEndpoint(name = "GrowerCreditList_Port")
    public GrowerCreditList getGrowerCreditListPort(WebServiceFeature... features) {
        return super.getPort(new QName("Monsanto:Service:GrowerCreditList", "GrowerCreditList_Port"), GrowerCreditList.class, features);
    }

}
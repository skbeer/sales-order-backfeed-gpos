
package com.monsanto.irdsoapservices.retailseller.schema;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.2-b05-RC1
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "RetailSellerFault", targetNamespace = "urn:ecms:schema:retailsellerinformation:request:1:0")
public class RetailSellerFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ExceptionType faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public RetailSellerFault(String message, ExceptionType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public RetailSellerFault(String message, ExceptionType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.monsanto.irdsoapservices.retailseller.schema.ExceptionType
     */
    public ExceptionType getFaultInfo() {
        return faultInfo;
    }

}

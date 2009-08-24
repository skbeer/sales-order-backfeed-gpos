
package com.monsanto.irdsoapservices.service;

import javax.xml.ws.WebFault;
import com.monsanto.irdsoapservices.brands.schema.ExceptionType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.2-b05-RC1
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "BrandsFault", targetNamespace = "urn:monsanto:ird:services:brands")
public class BrandsFault
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
    public BrandsFault(String message, ExceptionType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public BrandsFault(String message, ExceptionType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.monsanto.irdsoapservices.brands.schema.ExceptionType
     */
    public ExceptionType getFaultInfo() {
        return faultInfo;
    }

}

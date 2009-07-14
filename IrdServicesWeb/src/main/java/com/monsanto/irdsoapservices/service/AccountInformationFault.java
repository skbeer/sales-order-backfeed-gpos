
package com.monsanto.irdsoapservices.service;

import com.monsanto.irdsoapservices.schema.ExceptionType;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.2-b05-RC1
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "AccountInformationFault", targetNamespace = "urn:monsanto:ird:services:account:information")
public class AccountInformationFault
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
    public AccountInformationFault(String message, ExceptionType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public AccountInformationFault(String message, ExceptionType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.monsanto.irdsoapservices.schema.ExceptionType
     */
    public ExceptionType getFaultInfo() {
        return faultInfo;
    }

}

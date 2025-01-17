
package com.monsanto.irdsoapservices.agreementstatus.schema;

import javax.xml.ws.WebFault;
import com.monsanto.irdsoapservices.agreementstatus.schema.response.ExceptionType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.2-b05-RC1
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "AgreementStatusFault", targetNamespace = "urn:ecms:schema:agreement:response:2:0")
public class AgreementStatusFault
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
    public AgreementStatusFault(String message, ExceptionType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public AgreementStatusFault(String message, ExceptionType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.monsanto.irdsoapservices.agreementstatus.schema.response.ExceptionType
     */
    public ExceptionType getFaultInfo() {
        return faultInfo;
    }

}

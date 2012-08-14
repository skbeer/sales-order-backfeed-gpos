
package com.monsanto.commercial.growercreditlist.gen.creditlist.service;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.monsanto.commercial.growercreditlist.gen.creditlist.schema.GrowerCreditListListType;
import com.monsanto.commercial.growercreditlist.gen.creditlist.schema.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.2-b05-RC1
 * Generated source version: 2.1
 * 
 */
@WebService(name = "GrowerCreditList", targetNamespace = "Monsanto:Service:GrowerCreditList")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GrowerCreditList {


    /**
     * 
     * @param parameters
     */
    @WebMethod(operationName = "GrowerCreditList", action = "urn:sap-com:document:sap:soap:functions:mc-style/GrowerCreditList")
    @Oneway
    public void growerCreditList(
        @WebParam(name = "GrowerCreditList", targetNamespace = "Monsanto:Service:GrowerCreditList", partName = "parameters")
        GrowerCreditListListType parameters);

}

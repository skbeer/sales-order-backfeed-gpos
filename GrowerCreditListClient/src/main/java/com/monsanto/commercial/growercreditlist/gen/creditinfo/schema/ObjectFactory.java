
package com.monsanto.commercial.growercreditlist.gen.creditinfo.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.monsanto.commercial.growercreditlist.gen.creditinfo.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GrowerCreditRequest_QNAME = new QName("Monsanto:Service:GrowerCredit", "GrowerCreditRequest");
    private final static QName _GrowerCreditFault_QNAME = new QName("Monsanto:Service:GrowerCredit", "GrowerCreditFault");
    private final static QName _GrowerIdentification_QNAME = new QName("Monsanto:Service:GrowerCredit", "GrowerIdentification");
    private final static QName _GrowerCreditResponse_QNAME = new QName("Monsanto:Service:GrowerCredit", "GrowerCreditResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.monsanto.commercial.growercreditlist.gen.creditinfo.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GrowerCreditFaultType }
     * 
     */
    public GrowerCreditFaultType createGrowerCreditFaultType() {
        return new GrowerCreditFaultType();
    }

    /**
     * Create an instance of {@link GrowerCreditResponseDetailsType }
     * 
     */
    public GrowerCreditResponseDetailsType createGrowerCreditResponseDetailsType() {
        return new GrowerCreditResponseDetailsType();
    }

    /**
     * Create an instance of {@link GrowerCreditResponseType }
     * 
     */
    public GrowerCreditResponseType createGrowerCreditResponseType() {
        return new GrowerCreditResponseType();
    }

    /**
     * Create an instance of {@link GrowerListType }
     * 
     */
    public GrowerListType createGrowerListType() {
        return new GrowerListType();
    }

    /**
     * Create an instance of {@link GrowerCreditResponseBodyType }
     * 
     */
    public GrowerCreditResponseBodyType createGrowerCreditResponseBodyType() {
        return new GrowerCreditResponseBodyType();
    }

    /**
     * Create an instance of {@link GrowerCreditRequestType }
     * 
     */
    public GrowerCreditRequestType createGrowerCreditRequestType() {
        return new GrowerCreditRequestType();
    }

    /**
     * Create an instance of {@link GrowerCreditRequestBodyType }
     * 
     */
    public GrowerCreditRequestBodyType createGrowerCreditRequestBodyType() {
        return new GrowerCreditRequestBodyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrowerCreditRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCredit", name = "GrowerCreditRequest")
    public JAXBElement<GrowerCreditRequestType> createGrowerCreditRequest(GrowerCreditRequestType value) {
        return new JAXBElement<GrowerCreditRequestType>(_GrowerCreditRequest_QNAME, GrowerCreditRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrowerCreditFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCredit", name = "GrowerCreditFault")
    public JAXBElement<GrowerCreditFaultType> createGrowerCreditFault(GrowerCreditFaultType value) {
        return new JAXBElement<GrowerCreditFaultType>(_GrowerCreditFault_QNAME, GrowerCreditFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCredit", name = "GrowerIdentification")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGrowerIdentification(String value) {
        return new JAXBElement<String>(_GrowerIdentification_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrowerCreditResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCredit", name = "GrowerCreditResponse")
    public JAXBElement<GrowerCreditResponseType> createGrowerCreditResponse(GrowerCreditResponseType value) {
        return new JAXBElement<GrowerCreditResponseType>(_GrowerCreditResponse_QNAME, GrowerCreditResponseType.class, null, value);
    }

}

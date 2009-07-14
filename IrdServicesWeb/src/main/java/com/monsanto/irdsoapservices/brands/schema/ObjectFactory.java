
package com.monsanto.irdsoapservices.brands.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.monsanto.irdsoapservices.brands.schema package. 
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

    private final static QName _BrandsFault_QNAME = new QName("urn:monsanto:ird:services:brands", "BrandsFault");
    private final static QName _GetBrandsRequest_QNAME = new QName("urn:monsanto:ird:services:brands", "GetBrandsRequest");
    private final static QName _GetBrandsResponse_QNAME = new QName("urn:monsanto:ird:services:brands", "GetBrandsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.monsanto.irdsoapservices.brands.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BrandType }
     * 
     */
    public BrandType createBrandType() {
        return new BrandType();
    }

    /**
     * Create an instance of {@link ExceptionType }
     * 
     */
    public ExceptionType createExceptionType() {
        return new ExceptionType();
    }

    /**
     * Create an instance of {@link BrandsForSpecieType }
     * 
     */
    public BrandsForSpecieType createBrandsForSpecieType() {
        return new BrandsForSpecieType();
    }

    /**
     * Create an instance of {@link GetBrandsResponseType }
     * 
     */
    public GetBrandsResponseType createGetBrandsResponseType() {
        return new GetBrandsResponseType();
    }

    /**
     * Create an instance of {@link GetBrandsRequestType }
     * 
     */
    public GetBrandsRequestType createGetBrandsRequestType() {
        return new GetBrandsRequestType();
    }

    /**
     * Create an instance of {@link GetBrandsResponseBodyType }
     * 
     */
    public GetBrandsResponseBodyType createGetBrandsResponseBodyType() {
        return new GetBrandsResponseBodyType();
    }

    /**
     * Create an instance of {@link GetBrandsRequestBodyType }
     * 
     */
    public GetBrandsRequestBodyType createGetBrandsRequestBodyType() {
        return new GetBrandsRequestBodyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:brands", name = "BrandsFault")
    public JAXBElement<ExceptionType> createBrandsFault(ExceptionType value) {
        return new JAXBElement<ExceptionType>(_BrandsFault_QNAME, ExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBrandsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:brands", name = "GetBrandsRequest")
    public JAXBElement<GetBrandsRequestType> createGetBrandsRequest(GetBrandsRequestType value) {
        return new JAXBElement<GetBrandsRequestType>(_GetBrandsRequest_QNAME, GetBrandsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBrandsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:brands", name = "GetBrandsResponse")
    public JAXBElement<GetBrandsResponseType> createGetBrandsResponse(GetBrandsResponseType value) {
        return new JAXBElement<GetBrandsResponseType>(_GetBrandsResponse_QNAME, GetBrandsResponseType.class, null, value);
    }

}

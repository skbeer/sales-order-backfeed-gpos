
package com.monsanto.irdsoapservices.agreements.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.monsanto.irdsoapservices.agreements.schema package. 
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

    private final static QName _AccountAgreementsFault_QNAME = new QName("urn:monsanto:ird:services:account:agreement", "AccountAgreementsFault");
    private final static QName _GetAgreementsResponse_QNAME = new QName("urn:monsanto:ird:services:account:agreement", "GetAgreementsResponse");
    private final static QName _GetAgreementsRequest_QNAME = new QName("urn:monsanto:ird:services:account:agreement", "GetAgreementsRequest");
    private final static QName _UpdateAgreementRequest_QNAME = new QName("urn:monsanto:ird:services:account:agreement", "UpdateAgreementRequest");
    private final static QName _GetAgreementHierarchyResponse_QNAME = new QName("urn:monsanto:ird:services:account:agreement", "GetAgreementHierarchyResponse");
    private final static QName _UpdateAgreementResponse_QNAME = new QName("urn:monsanto:ird:services:account:agreement", "UpdateAgreementResponse");
    private final static QName _GetAgreementHierarchyRequest_QNAME = new QName("urn:monsanto:ird:services:account:agreement", "GetAgreementHierarchyRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.monsanto.irdsoapservices.agreements.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateAgreementRequestType }
     * 
     */
    public UpdateAgreementRequestType createUpdateAgreementRequestType() {
        return new UpdateAgreementRequestType();
    }

    /**
     * Create an instance of {@link GetAgreementsRequestBodyType }
     * 
     */
    public GetAgreementsRequestBodyType createGetAgreementsRequestBodyType() {
        return new GetAgreementsRequestBodyType();
    }

    /**
     * Create an instance of {@link SuccessResponseType }
     * 
     */
    public SuccessResponseType createSuccessResponseType() {
        return new SuccessResponseType();
    }

    /**
     * Create an instance of {@link GetAgreementHierarchyResponseType }
     * 
     */
    public GetAgreementHierarchyResponseType createGetAgreementHierarchyResponseType() {
        return new GetAgreementHierarchyResponseType();
    }

    /**
     * Create an instance of {@link ExceptionType }
     * 
     */
    public ExceptionType createExceptionType() {
        return new ExceptionType();
    }

    /**
     * Create an instance of {@link GetAgreementHierarchyResponseBodyType }
     * 
     */
    public GetAgreementHierarchyResponseBodyType createGetAgreementHierarchyResponseBodyType() {
        return new GetAgreementHierarchyResponseBodyType();
    }

    /**
     * Create an instance of {@link UpdateAgreementResponseType }
     * 
     */
    public UpdateAgreementResponseType createUpdateAgreementResponseType() {
        return new UpdateAgreementResponseType();
    }

    /**
     * Create an instance of {@link AgreementCategoryType }
     * 
     */
    public AgreementCategoryType createAgreementCategoryType() {
        return new AgreementCategoryType();
    }

    /**
     * Create an instance of {@link GetAgreementsResponseBodyType }
     * 
     */
    public GetAgreementsResponseBodyType createGetAgreementsResponseBodyType() {
        return new GetAgreementsResponseBodyType();
    }

    /**
     * Create an instance of {@link AgreementType }
     * 
     */
    public AgreementType createAgreementType() {
        return new AgreementType();
    }

    /**
     * Create an instance of {@link GetAgreementsResponseType }
     * 
     */
    public GetAgreementsResponseType createGetAgreementsResponseType() {
        return new GetAgreementsResponseType();
    }

    /**
     * Create an instance of {@link GetAgreementHierarchyRequestType }
     * 
     */
    public GetAgreementHierarchyRequestType createGetAgreementHierarchyRequestType() {
        return new GetAgreementHierarchyRequestType();
    }

    /**
     * Create an instance of {@link AccountIdentifierType }
     * 
     */
    public AccountIdentifierType createAccountIdentifierType() {
        return new AccountIdentifierType();
    }

    /**
     * Create an instance of {@link GetAgreementHierarchyRequestBodyType }
     * 
     */
    public GetAgreementHierarchyRequestBodyType createGetAgreementHierarchyRequestBodyType() {
        return new GetAgreementHierarchyRequestBodyType();
    }

    /**
     * Create an instance of {@link GetAgreementsRequestType }
     * 
     */
    public GetAgreementsRequestType createGetAgreementsRequestType() {
        return new GetAgreementsRequestType();
    }

    /**
     * Create an instance of {@link UpdateAgreementRequestBodyType }
     * 
     */
    public UpdateAgreementRequestBodyType createUpdateAgreementRequestBodyType() {
        return new UpdateAgreementRequestBodyType();
    }

    /**
     * Create an instance of {@link AgreementsBySpecieType }
     * 
     */
    public AgreementsBySpecieType createAgreementsBySpecieType() {
        return new AgreementsBySpecieType();
    }

    /**
     * Create an instance of {@link AgreementInformationType }
     * 
     */
    public AgreementInformationType createAgreementInformationType() {
        return new AgreementInformationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:account:agreement", name = "AccountAgreementsFault")
    public JAXBElement<ExceptionType> createAccountAgreementsFault(ExceptionType value) {
        return new JAXBElement<ExceptionType>(_AccountAgreementsFault_QNAME, ExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgreementsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:account:agreement", name = "GetAgreementsResponse")
    public JAXBElement<GetAgreementsResponseType> createGetAgreementsResponse(GetAgreementsResponseType value) {
        return new JAXBElement<GetAgreementsResponseType>(_GetAgreementsResponse_QNAME, GetAgreementsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgreementsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:account:agreement", name = "GetAgreementsRequest")
    public JAXBElement<GetAgreementsRequestType> createGetAgreementsRequest(GetAgreementsRequestType value) {
        return new JAXBElement<GetAgreementsRequestType>(_GetAgreementsRequest_QNAME, GetAgreementsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAgreementRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:account:agreement", name = "UpdateAgreementRequest")
    public JAXBElement<UpdateAgreementRequestType> createUpdateAgreementRequest(UpdateAgreementRequestType value) {
        return new JAXBElement<UpdateAgreementRequestType>(_UpdateAgreementRequest_QNAME, UpdateAgreementRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgreementHierarchyResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:account:agreement", name = "GetAgreementHierarchyResponse")
    public JAXBElement<GetAgreementHierarchyResponseType> createGetAgreementHierarchyResponse(GetAgreementHierarchyResponseType value) {
        return new JAXBElement<GetAgreementHierarchyResponseType>(_GetAgreementHierarchyResponse_QNAME, GetAgreementHierarchyResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAgreementResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:account:agreement", name = "UpdateAgreementResponse")
    public JAXBElement<UpdateAgreementResponseType> createUpdateAgreementResponse(UpdateAgreementResponseType value) {
        return new JAXBElement<UpdateAgreementResponseType>(_UpdateAgreementResponse_QNAME, UpdateAgreementResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgreementHierarchyRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:ird:services:account:agreement", name = "GetAgreementHierarchyRequest")
    public JAXBElement<GetAgreementHierarchyRequestType> createGetAgreementHierarchyRequest(GetAgreementHierarchyRequestType value) {
        return new JAXBElement<GetAgreementHierarchyRequestType>(_GetAgreementHierarchyRequest_QNAME, GetAgreementHierarchyRequestType.class, null, value);
    }

}

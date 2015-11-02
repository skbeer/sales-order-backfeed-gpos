
package com.monsanto.irdsoapservices.agreementstatuspartners.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.monsanto.irdsoapservices.agreementstatuspartners.schema package. 
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

    private final static QName _AgreementStatusResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:3", "AgreementStatusResponse");
    private final static QName _AgreementStatus_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:3", "AgreementStatus");
    private final static QName _AgreementStatusRequestBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:3", "AgreementStatusRequestBody");
    private final static QName _AgreementName_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:3", "AgreementName");
    private final static QName _ZoneName_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:3", "ZoneName");
    private final static QName _AgreementStatusResponseBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:3", "AgreementStatusResponseBody");
    private final static QName _PartnerIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:3", "PartnerIdentifier");
    private final static QName _ErrorDescription_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:3", "ErrorDescription");
    private final static QName _AgreementStatusList_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:3", "AgreementStatusList");
    private final static QName _Header_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:3", "Header");
    private final static QName _ErrorMessage_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:3", "ErrorMessage");
    private final static QName _AgreementStatusFault_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:3", "AgreementStatusFault");
    private final static QName _ZoneID_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:3", "ZoneID");
    private final static QName _AgreementStatusRequest_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:3", "AgreementStatusRequest");
    private final static QName _ZoneType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:3", "ZoneType");
    private final static QName _ErrorResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:3", "ErrorResponse");
    private final static QName _Zone_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:3", "Zone");
    private final static QName _PartnerInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:3", "PartnerInformation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.monsanto.irdsoapservices.agreementstatuspartners.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuyerType }
     * 
     */
    public BuyerType createBuyerType() {
        return new BuyerType();
    }

    /**
     * Create an instance of {@link AgreementStatusResponsePartnersType }
     * 
     */
    public AgreementStatusResponsePartnersType createAgreementStatusResponsePartnersType() {
        return new AgreementStatusResponsePartnersType();
    }

    /**
     * Create an instance of {@link ContactInformationType }
     * 
     */
    public ContactInformationType createContactInformationType() {
        return new ContactInformationType();
    }

    /**
     * Create an instance of {@link ZoneType }
     * 
     */
    public ZoneType createZoneType() {
        return new ZoneType();
    }

    /**
     * Create an instance of {@link ToType }
     * 
     */
    public ToType createToType() {
        return new ToType();
    }

    /**
     * Create an instance of {@link AgreementStatusRequestPartnersType }
     * 
     */
    public AgreementStatusRequestPartnersType createAgreementStatusRequestPartnersType() {
        return new AgreementStatusRequestPartnersType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link ErrorResponseType }
     * 
     */
    public ErrorResponseType createErrorResponseType() {
        return new ErrorResponseType();
    }

    /**
     * Create an instance of {@link PartnerInformationType }
     * 
     */
    public PartnerInformationType createPartnerInformationType() {
        return new PartnerInformationType();
    }

    /**
     * Create an instance of {@link SellerType }
     * 
     */
    public SellerType createSellerType() {
        return new SellerType();
    }

    /**
     * Create an instance of {@link PartnerIdentifierType }
     * 
     */
    public PartnerIdentifierType createPartnerIdentifierType() {
        return new PartnerIdentifierType();
    }

    /**
     * Create an instance of {@link AgreementStatusRequestBodyType }
     * 
     */
    public AgreementStatusRequestBodyType createAgreementStatusRequestBodyType() {
        return new AgreementStatusRequestBodyType();
    }

    /**
     * Create an instance of {@link AgreementStatusResponseBodyType }
     * 
     */
    public AgreementStatusResponseBodyType createAgreementStatusResponseBodyType() {
        return new AgreementStatusResponseBodyType();
    }

    /**
     * Create an instance of {@link AgreementStatusResponseType }
     * 
     */
    public AgreementStatusResponseType createAgreementStatusResponseType() {
        return new AgreementStatusResponseType();
    }

    /**
     * Create an instance of {@link ShipToType }
     * 
     */
    public ShipToType createShipToType() {
        return new ShipToType();
    }

    /**
     * Create an instance of {@link AddressInformationType }
     * 
     */
    public AddressInformationType createAddressInformationType() {
        return new AddressInformationType();
    }

    /**
     * Create an instance of {@link AgreementStatusRequestType }
     * 
     */
    public AgreementStatusRequestType createAgreementStatusRequestType() {
        return new AgreementStatusRequestType();
    }

    /**
     * Create an instance of {@link DateTimeType }
     * 
     */
    public DateTimeType createDateTimeType() {
        return new DateTimeType();
    }

    /**
     * Create an instance of {@link AgreementStatusListType }
     * 
     */
    public AgreementStatusListType createAgreementStatusListType() {
        return new AgreementStatusListType();
    }

    /**
     * Create an instance of {@link ThisDocumentIdentifierType }
     * 
     */
    public ThisDocumentIdentifierType createThisDocumentIdentifierType() {
        return new ThisDocumentIdentifierType();
    }

    /**
     * Create an instance of {@link ExceptionType }
     * 
     */
    public ExceptionType createExceptionType() {
        return new ExceptionType();
    }

    /**
     * Create an instance of {@link ThisDocumentDateTimeType }
     * 
     */
    public ThisDocumentDateTimeType createThisDocumentDateTimeType() {
        return new ThisDocumentDateTimeType();
    }

    /**
     * Create an instance of {@link AlternateCommunicationMethodType }
     * 
     */
    public AlternateCommunicationMethodType createAlternateCommunicationMethodType() {
        return new AlternateCommunicationMethodType();
    }

    /**
     * Create an instance of {@link AgreementStatusResponsePropertiesType }
     * 
     */
    public AgreementStatusResponsePropertiesType createAgreementStatusResponsePropertiesType() {
        return new AgreementStatusResponsePropertiesType();
    }

    /**
     * Create an instance of {@link FromType }
     * 
     */
    public FromType createFromType() {
        return new FromType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgreementStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:3", name = "AgreementStatusResponse")
    public JAXBElement<AgreementStatusResponseType> createAgreementStatusResponse(AgreementStatusResponseType value) {
        return new JAXBElement<AgreementStatusResponseType>(_AgreementStatusResponse_QNAME, AgreementStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:3", name = "AgreementStatus")
    public JAXBElement<String> createAgreementStatus(String value) {
        return new JAXBElement<String>(_AgreementStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgreementStatusRequestBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:3", name = "AgreementStatusRequestBody")
    public JAXBElement<AgreementStatusRequestBodyType> createAgreementStatusRequestBody(AgreementStatusRequestBodyType value) {
        return new JAXBElement<AgreementStatusRequestBodyType>(_AgreementStatusRequestBody_QNAME, AgreementStatusRequestBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:3", name = "AgreementName")
    public JAXBElement<String> createAgreementName(String value) {
        return new JAXBElement<String>(_AgreementName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:3", name = "ZoneName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createZoneName(String value) {
        return new JAXBElement<String>(_ZoneName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgreementStatusResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:3", name = "AgreementStatusResponseBody")
    public JAXBElement<AgreementStatusResponseBodyType> createAgreementStatusResponseBody(AgreementStatusResponseBodyType value) {
        return new JAXBElement<AgreementStatusResponseBodyType>(_AgreementStatusResponseBody_QNAME, AgreementStatusResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:3", name = "PartnerIdentifier")
    public JAXBElement<PartnerIdentifierType> createPartnerIdentifier(PartnerIdentifierType value) {
        return new JAXBElement<PartnerIdentifierType>(_PartnerIdentifier_QNAME, PartnerIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:3", name = "ErrorDescription")
    public JAXBElement<String> createErrorDescription(String value) {
        return new JAXBElement<String>(_ErrorDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgreementStatusListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:3", name = "AgreementStatusList")
    public JAXBElement<AgreementStatusListType> createAgreementStatusList(AgreementStatusListType value) {
        return new JAXBElement<AgreementStatusListType>(_AgreementStatusList_QNAME, AgreementStatusListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:3", name = "Header")
    public JAXBElement<HeaderType> createHeader(HeaderType value) {
        return new JAXBElement<HeaderType>(_Header_QNAME, HeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:3", name = "ErrorMessage")
    public JAXBElement<String> createErrorMessage(String value) {
        return new JAXBElement<String>(_ErrorMessage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:3", name = "AgreementStatusFault")
    public JAXBElement<ExceptionType> createAgreementStatusFault(ExceptionType value) {
        return new JAXBElement<ExceptionType>(_AgreementStatusFault_QNAME, ExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:3", name = "ZoneID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createZoneID(String value) {
        return new JAXBElement<String>(_ZoneID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgreementStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:3", name = "AgreementStatusRequest")
    public JAXBElement<AgreementStatusRequestType> createAgreementStatusRequest(AgreementStatusRequestType value) {
        return new JAXBElement<AgreementStatusRequestType>(_AgreementStatusRequest_QNAME, AgreementStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:3", name = "ZoneType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createZoneType(String value) {
        return new JAXBElement<String>(_ZoneType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:3", name = "ErrorResponse")
    public JAXBElement<ErrorResponseType> createErrorResponse(ErrorResponseType value) {
        return new JAXBElement<ErrorResponseType>(_ErrorResponse_QNAME, ErrorResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:3", name = "Zone")
    public JAXBElement<ZoneType> createZone(ZoneType value) {
        return new JAXBElement<ZoneType>(_Zone_QNAME, ZoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:3", name = "PartnerInformation")
    public JAXBElement<PartnerInformationType> createPartnerInformation(PartnerInformationType value) {
        return new JAXBElement<PartnerInformationType>(_PartnerInformation_QNAME, PartnerInformationType.class, null, value);
    }

}

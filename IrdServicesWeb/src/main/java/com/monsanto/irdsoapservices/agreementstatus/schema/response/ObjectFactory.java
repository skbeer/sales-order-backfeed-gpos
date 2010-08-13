
package com.monsanto.irdsoapservices.agreementstatus.schema.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.monsanto.irdsoapservices.agreementstatus.schema.response package. 
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

    private final static QName _PartnerIdentifier_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "PartnerIdentifier");
    private final static QName _AgreementDescription_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "AgreementDescription");
    private final static QName _AgreementStatus_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "AgreementStatus");
    private final static QName _AgreementName_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "AgreementName");
    private final static QName _PartnerDetail_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "PartnerDetail");
    private final static QName _Zone_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "Zone");
    private final static QName _AgreementStatusResponseProperties_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "AgreementStatusResponseProperties");
    private final static QName _ErrorResponse_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "ErrorResponse");
    private final static QName _ZoneID_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "ZoneID");
    private final static QName _ContactInformation_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "ContactInformation");
    private final static QName _DocumentIdentifier_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "DocumentIdentifier");
    private final static QName _DateTime_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "DateTime");
    private final static QName _Header_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "Header");
    private final static QName _Action_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "Action");
    private final static QName _AgreementStatusResponseBody_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "AgreementStatusResponseBody");
    private final static QName _Comments_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "Comments");
    private final static QName _ZoneName_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "ZoneName");
    private final static QName _AgreementMessageType_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "AgreementMessageType");
    private final static QName _AgreementStatusResponse_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "AgreementStatusResponse");
    private final static QName _RequestedPartnerIdentifier_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "RequestedPartnerIdentifier");
    private final static QName _PartnerInformation_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "PartnerInformation");
    private final static QName _AgreementStatusFault_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "AgreementStatusFault");
    private final static QName _AddressInformation_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "AddressInformation");
    private final static QName _ZoneType_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "ZoneType");
    private final static QName _ErrorDescription_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "ErrorDescription");
    private final static QName _Agreement_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "Agreement");
    private final static QName _AgreementStatusList_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "AgreementStatusList");
    private final static QName _ErrorMessage_QNAME = new QName("urn:ecms:schema:agreement:response:2:0", "ErrorMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.monsanto.irdsoapservices.agreementstatus.schema.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgreementStatusResponseDetails }
     * 
     */
    public AgreementStatusResponseDetails createAgreementStatusResponseDetails() {
        return new AgreementStatusResponseDetails();
    }

    /**
     * Create an instance of {@link ThisDocumentDateTimeType }
     * 
     */
    public ThisDocumentDateTimeType createThisDocumentDateTimeType() {
        return new ThisDocumentDateTimeType();
    }

    /**
     * Create an instance of {@link ZoneType }
     * 
     */
    public ZoneType createZoneType() {
        return new ZoneType();
    }

    /**
     * Create an instance of {@link ErrorResponseType }
     * 
     */
    public ErrorResponseType createErrorResponseType() {
        return new ErrorResponseType();
    }

    /**
     * Create an instance of {@link AgreementStatusResponsePropertiesType }
     * 
     */
    public AgreementStatusResponsePropertiesType createAgreementStatusResponsePropertiesType() {
        return new AgreementStatusResponsePropertiesType();
    }

    /**
     * Create an instance of {@link AlternateCommunicationMethodType }
     * 
     */
    public AlternateCommunicationMethodType createAlternateCommunicationMethodType() {
        return new AlternateCommunicationMethodType();
    }

    /**
     * Create an instance of {@link FromType }
     * 
     */
    public FromType createFromType() {
        return new FromType();
    }

    /**
     * Create an instance of {@link ToType }
     * 
     */
    public ToType createToType() {
        return new ToType();
    }

    /**
     * Create an instance of {@link PartnerInformationType }
     * 
     */
    public PartnerInformationType createPartnerInformationType() {
        return new PartnerInformationType();
    }

    /**
     * Create an instance of {@link DateTimeType }
     * 
     */
    public DateTimeType createDateTimeType() {
        return new DateTimeType();
    }

    /**
     * Create an instance of {@link ContactInformationType }
     * 
     */
    public ContactInformationType createContactInformationType() {
        return new ContactInformationType();
    }

    /**
     * Create an instance of {@link PartnerDetailType }
     * 
     */
    public PartnerDetailType createPartnerDetailType() {
        return new PartnerDetailType();
    }

    /**
     * Create an instance of {@link PartnerIdentifierType }
     * 
     */
    public PartnerIdentifierType createPartnerIdentifierType() {
        return new PartnerIdentifierType();
    }

    /**
     * Create an instance of {@link AgreementStatusResponseBodyType }
     * 
     */
    public AgreementStatusResponseBodyType createAgreementStatusResponseBodyType() {
        return new AgreementStatusResponseBodyType();
    }

    /**
     * Create an instance of {@link AgreementType }
     * 
     */
    public AgreementType createAgreementType() {
        return new AgreementType();
    }

    /**
     * Create an instance of {@link ExceptionType }
     * 
     */
    public ExceptionType createExceptionType() {
        return new ExceptionType();
    }

    /**
     * Create an instance of {@link AgreementStatusResponseType }
     * 
     */
    public AgreementStatusResponseType createAgreementStatusResponseType() {
        return new AgreementStatusResponseType();
    }

    /**
     * Create an instance of {@link AddressInformationType }
     * 
     */
    public AddressInformationType createAddressInformationType() {
        return new AddressInformationType();
    }

    /**
     * Create an instance of {@link ThisDocumentIdentifierType }
     * 
     */
    public ThisDocumentIdentifierType createThisDocumentIdentifierType() {
        return new ThisDocumentIdentifierType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link AgreementStatusListType }
     * 
     */
    public AgreementStatusListType createAgreementStatusListType() {
        return new AgreementStatusListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "PartnerIdentifier")
    public JAXBElement<PartnerIdentifierType> createPartnerIdentifier(PartnerIdentifierType value) {
        return new JAXBElement<PartnerIdentifierType>(_PartnerIdentifier_QNAME, PartnerIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "AgreementDescription")
    public JAXBElement<String> createAgreementDescription(String value) {
        return new JAXBElement<String>(_AgreementDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "AgreementStatus")
    public JAXBElement<String> createAgreementStatus(String value) {
        return new JAXBElement<String>(_AgreementStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "AgreementName")
    public JAXBElement<String> createAgreementName(String value) {
        return new JAXBElement<String>(_AgreementName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "PartnerDetail")
    public JAXBElement<PartnerDetailType> createPartnerDetail(PartnerDetailType value) {
        return new JAXBElement<PartnerDetailType>(_PartnerDetail_QNAME, PartnerDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "Zone")
    public JAXBElement<ZoneType> createZone(ZoneType value) {
        return new JAXBElement<ZoneType>(_Zone_QNAME, ZoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgreementStatusResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "AgreementStatusResponseProperties")
    public JAXBElement<AgreementStatusResponsePropertiesType> createAgreementStatusResponseProperties(AgreementStatusResponsePropertiesType value) {
        return new JAXBElement<AgreementStatusResponsePropertiesType>(_AgreementStatusResponseProperties_QNAME, AgreementStatusResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "ErrorResponse")
    public JAXBElement<ErrorResponseType> createErrorResponse(ErrorResponseType value) {
        return new JAXBElement<ErrorResponseType>(_ErrorResponse_QNAME, ErrorResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "ZoneID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createZoneID(String value) {
        return new JAXBElement<String>(_ZoneID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "ContactInformation")
    public JAXBElement<ContactInformationType> createContactInformation(ContactInformationType value) {
        return new JAXBElement<ContactInformationType>(_ContactInformation_QNAME, ContactInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "DocumentIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocumentIdentifier(String value) {
        return new JAXBElement<String>(_DocumentIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "DateTime")
    public JAXBElement<DateTimeType> createDateTime(DateTimeType value) {
        return new JAXBElement<DateTimeType>(_DateTime_QNAME, DateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "Header")
    public JAXBElement<HeaderType> createHeader(HeaderType value) {
        return new JAXBElement<HeaderType>(_Header_QNAME, HeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "Action")
    public JAXBElement<ActionType> createAction(ActionType value) {
        return new JAXBElement<ActionType>(_Action_QNAME, ActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgreementStatusResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "AgreementStatusResponseBody")
    public JAXBElement<AgreementStatusResponseBodyType> createAgreementStatusResponseBody(AgreementStatusResponseBodyType value) {
        return new JAXBElement<AgreementStatusResponseBodyType>(_AgreementStatusResponseBody_QNAME, AgreementStatusResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "Comments")
    public JAXBElement<String> createComments(String value) {
        return new JAXBElement<String>(_Comments_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "ZoneName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createZoneName(String value) {
        return new JAXBElement<String>(_ZoneName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "AgreementMessageType")
    public JAXBElement<String> createAgreementMessageType(String value) {
        return new JAXBElement<String>(_AgreementMessageType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgreementStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "AgreementStatusResponse")
    public JAXBElement<AgreementStatusResponseType> createAgreementStatusResponse(AgreementStatusResponseType value) {
        return new JAXBElement<AgreementStatusResponseType>(_AgreementStatusResponse_QNAME, AgreementStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "RequestedPartnerIdentifier")
    public JAXBElement<PartnerIdentifierType> createRequestedPartnerIdentifier(PartnerIdentifierType value) {
        return new JAXBElement<PartnerIdentifierType>(_RequestedPartnerIdentifier_QNAME, PartnerIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "PartnerInformation")
    public JAXBElement<PartnerInformationType> createPartnerInformation(PartnerInformationType value) {
        return new JAXBElement<PartnerInformationType>(_PartnerInformation_QNAME, PartnerInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "AgreementStatusFault")
    public JAXBElement<ExceptionType> createAgreementStatusFault(ExceptionType value) {
        return new JAXBElement<ExceptionType>(_AgreementStatusFault_QNAME, ExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "AddressInformation")
    public JAXBElement<AddressInformationType> createAddressInformation(AddressInformationType value) {
        return new JAXBElement<AddressInformationType>(_AddressInformation_QNAME, AddressInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "ZoneType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createZoneType(String value) {
        return new JAXBElement<String>(_ZoneType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "ErrorDescription")
    public JAXBElement<String> createErrorDescription(String value) {
        return new JAXBElement<String>(_ErrorDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgreementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "Agreement")
    public JAXBElement<AgreementType> createAgreement(AgreementType value) {
        return new JAXBElement<AgreementType>(_Agreement_QNAME, AgreementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgreementStatusListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "AgreementStatusList")
    public JAXBElement<AgreementStatusListType> createAgreementStatusList(AgreementStatusListType value) {
        return new JAXBElement<AgreementStatusListType>(_AgreementStatusList_QNAME, AgreementStatusListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:agreement:response:2:0", name = "ErrorMessage")
    public JAXBElement<String> createErrorMessage(String value) {
        return new JAXBElement<String>(_ErrorMessage_QNAME, String.class, null, value);
    }

}

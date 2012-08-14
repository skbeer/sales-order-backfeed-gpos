
package com.monsanto.commercial.growercreditlist.gen.creditlist.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.monsanto.commercial.growercreditlist.gen.creditlist.schema package. 
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

    private final static QName _AddressInformation_QNAME = new QName("Monsanto:Service:GrowerCreditList", "AddressInformation");
    private final static QName _AmountApproved_QNAME = new QName("Monsanto:Service:GrowerCreditList", "AmountApproved");
    private final static QName _ContactInformation_QNAME = new QName("Monsanto:Service:GrowerCreditList", "ContactInformation");
    private final static QName _DocumentIdentifier_QNAME = new QName("Monsanto:Service:GrowerCreditList", "DocumentIdentifier");
    private final static QName _DateTime_QNAME = new QName("Monsanto:Service:GrowerCreditList", "DateTime");
    private final static QName _Header_QNAME = new QName("Monsanto:Service:GrowerCreditList", "Header");
    private final static QName _GrowerCreditList_QNAME = new QName("Monsanto:Service:GrowerCreditList", "GrowerCreditList");
    private final static QName _PartnerIdentifier_QNAME = new QName("Monsanto:Service:GrowerCreditList", "PartnerIdentifier");
    private final static QName _PartnerInformation_QNAME = new QName("Monsanto:Service:GrowerCreditList", "PartnerInformation");
    private final static QName _GrowerCreditListProperties_QNAME = new QName("Monsanto:Service:GrowerCreditList", "GrowerCreditListProperties");
    private final static QName _GrowerCreditListPropertiesTypeCreditType_QNAME = new QName("Monsanto:Service:GrowerCreditList", "CreditType");
    private final static QName _GrowerCreditListPropertiesTypeAmountAvailable_QNAME = new QName("Monsanto:Service:GrowerCreditList", "AmountAvailable");
    private final static QName _GrowerCreditListPropertiesTypeCreditIdentifier_QNAME = new QName("Monsanto:Service:GrowerCreditList", "CreditIdentifier");
    private final static QName _GrowerCreditListPropertiesTypeZone_QNAME = new QName("Monsanto:Service:GrowerCreditList", "Zone");
    private final static QName _GrowerCreditListPropertiesTypeDateApproved_QNAME = new QName("Monsanto:Service:GrowerCreditList", "DateApproved");
    private final static QName _GrowerCreditListPropertiesTypeCreditStatus_QNAME = new QName("Monsanto:Service:GrowerCreditList", "CreditStatus");
    private final static QName _GrowerCreditListPropertiesTypeLicenseStatus_QNAME = new QName("Monsanto:Service:GrowerCreditList", "LicenseStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.monsanto.commercial.growercreditlist.gen.creditlist.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MonetaryAmountType }
     * 
     */
    public MonetaryAmountType createMonetaryAmountType() {
        return new MonetaryAmountType();
    }

    /**
     * Create an instance of {@link ThisDocumentDateTimeType }
     * 
     */
    public ThisDocumentDateTimeType createThisDocumentDateTimeType() {
        return new ThisDocumentDateTimeType();
    }

    /**
     * Create an instance of {@link DateTimeType }
     * 
     */
    public DateTimeType createDateTimeType() {
        return new DateTimeType();
    }

    /**
     * Create an instance of {@link AmountAvailableType }
     * 
     */
    public AmountAvailableType createAmountAvailableType() {
        return new AmountAvailableType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link GrowerCreditListListDetailsType }
     * 
     */
    public GrowerCreditListListDetailsType createGrowerCreditListListDetailsType() {
        return new GrowerCreditListListDetailsType();
    }

    /**
     * Create an instance of {@link FromType }
     * 
     */
    public FromType createFromType() {
        return new FromType();
    }

    /**
     * Create an instance of {@link GrowerCreditListListType }
     * 
     */
    public GrowerCreditListListType createGrowerCreditListListType() {
        return new GrowerCreditListListType();
    }

    /**
     * Create an instance of {@link GrowerCreditListListBodyType }
     * 
     */
    public GrowerCreditListListBodyType createGrowerCreditListListBodyType() {
        return new GrowerCreditListListBodyType();
    }

    /**
     * Create an instance of {@link GrowerCreditListPropertiesType.DateApproved }
     * 
     */
    public GrowerCreditListPropertiesType.DateApproved createGrowerCreditListPropertiesTypeDateApproved() {
        return new GrowerCreditListPropertiesType.DateApproved();
    }

    /**
     * Create an instance of {@link ThisDocumentIdentifierType }
     * 
     */
    public ThisDocumentIdentifierType createThisDocumentIdentifierType() {
        return new ThisDocumentIdentifierType();
    }

    /**
     * Create an instance of {@link GrowerCreditListPropertiesType }
     * 
     */
    public GrowerCreditListPropertiesType createGrowerCreditListPropertiesType() {
        return new GrowerCreditListPropertiesType();
    }

    /**
     * Create an instance of {@link AlternateCommunicationMethodType }
     * 
     */
    public AlternateCommunicationMethodType createAlternateCommunicationMethodType() {
        return new AlternateCommunicationMethodType();
    }

    /**
     * Create an instance of {@link GrowerCreditListPropertiesType.AmountApproved }
     * 
     */
    public GrowerCreditListPropertiesType.AmountApproved createGrowerCreditListPropertiesTypeAmountApproved() {
        return new GrowerCreditListPropertiesType.AmountApproved();
    }

    /**
     * Create an instance of {@link GrowerCreditListPropertiesType.AmountAvailable }
     * 
     */
    public GrowerCreditListPropertiesType.AmountAvailable createGrowerCreditListPropertiesTypeAmountAvailable() {
        return new GrowerCreditListPropertiesType.AmountAvailable();
    }

    /**
     * Create an instance of {@link ZoneType }
     * 
     */
    public ZoneType createZoneType() {
        return new ZoneType();
    }

    /**
     * Create an instance of {@link PartnerIdentifierType }
     * 
     */
    public PartnerIdentifierType createPartnerIdentifierType() {
        return new PartnerIdentifierType();
    }

    /**
     * Create an instance of {@link ContactInformationType }
     * 
     */
    public ContactInformationType createContactInformationType() {
        return new ContactInformationType();
    }

    /**
     * Create an instance of {@link PartnerInformationType }
     * 
     */
    public PartnerInformationType createPartnerInformationType() {
        return new PartnerInformationType();
    }

    /**
     * Create an instance of {@link AmountApprovedType }
     * 
     */
    public AmountApprovedType createAmountApprovedType() {
        return new AmountApprovedType();
    }

    /**
     * Create an instance of {@link GrowerCreditListListBodyType.GrowerCreditListDetails }
     * 
     */
    public GrowerCreditListListBodyType.GrowerCreditListDetails createGrowerCreditListListBodyTypeGrowerCreditListDetails() {
        return new GrowerCreditListListBodyType.GrowerCreditListDetails();
    }

    /**
     * Create an instance of {@link ToType }
     * 
     */
    public ToType createToType() {
        return new ToType();
    }

    /**
     * Create an instance of {@link AddressInformationType }
     * 
     */
    public AddressInformationType createAddressInformationType() {
        return new AddressInformationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCreditList", name = "AddressInformation")
    public JAXBElement<AddressInformationType> createAddressInformation(AddressInformationType value) {
        return new JAXBElement<AddressInformationType>(_AddressInformation_QNAME, AddressInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountApprovedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCreditList", name = "AmountApproved")
    public JAXBElement<AmountApprovedType> createAmountApproved(AmountApprovedType value) {
        return new JAXBElement<AmountApprovedType>(_AmountApproved_QNAME, AmountApprovedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCreditList", name = "ContactInformation")
    public JAXBElement<ContactInformationType> createContactInformation(ContactInformationType value) {
        return new JAXBElement<ContactInformationType>(_ContactInformation_QNAME, ContactInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCreditList", name = "DocumentIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocumentIdentifier(String value) {
        return new JAXBElement<String>(_DocumentIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCreditList", name = "DateTime")
    public JAXBElement<DateTimeType> createDateTime(DateTimeType value) {
        return new JAXBElement<DateTimeType>(_DateTime_QNAME, DateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCreditList", name = "Header")
    public JAXBElement<HeaderType> createHeader(HeaderType value) {
        return new JAXBElement<HeaderType>(_Header_QNAME, HeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrowerCreditListListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCreditList", name = "GrowerCreditList")
    public JAXBElement<GrowerCreditListListType> createGrowerCreditList(GrowerCreditListListType value) {
        return new JAXBElement<GrowerCreditListListType>(_GrowerCreditList_QNAME, GrowerCreditListListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCreditList", name = "PartnerIdentifier")
    public JAXBElement<PartnerIdentifierType> createPartnerIdentifier(PartnerIdentifierType value) {
        return new JAXBElement<PartnerIdentifierType>(_PartnerIdentifier_QNAME, PartnerIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCreditList", name = "PartnerInformation")
    public JAXBElement<PartnerInformationType> createPartnerInformation(PartnerInformationType value) {
        return new JAXBElement<PartnerInformationType>(_PartnerInformation_QNAME, PartnerInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrowerCreditListPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCreditList", name = "GrowerCreditListProperties")
    public JAXBElement<GrowerCreditListPropertiesType> createGrowerCreditListProperties(GrowerCreditListPropertiesType value) {
        return new JAXBElement<GrowerCreditListPropertiesType>(_GrowerCreditListProperties_QNAME, GrowerCreditListPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrowerCreditListPropertiesType.AmountApproved }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCreditList", name = "AmountApproved", scope = GrowerCreditListPropertiesType.class)
    public JAXBElement<GrowerCreditListPropertiesType.AmountApproved> createGrowerCreditListPropertiesTypeAmountApproved(GrowerCreditListPropertiesType.AmountApproved value) {
        return new JAXBElement<GrowerCreditListPropertiesType.AmountApproved>(_AmountApproved_QNAME, GrowerCreditListPropertiesType.AmountApproved.class, GrowerCreditListPropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCreditList", name = "CreditType", scope = GrowerCreditListPropertiesType.class)
    public JAXBElement<String> createGrowerCreditListPropertiesTypeCreditType(String value) {
        return new JAXBElement<String>(_GrowerCreditListPropertiesTypeCreditType_QNAME, String.class, GrowerCreditListPropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrowerCreditListPropertiesType.AmountAvailable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCreditList", name = "AmountAvailable", scope = GrowerCreditListPropertiesType.class)
    public JAXBElement<GrowerCreditListPropertiesType.AmountAvailable> createGrowerCreditListPropertiesTypeAmountAvailable(GrowerCreditListPropertiesType.AmountAvailable value) {
        return new JAXBElement<GrowerCreditListPropertiesType.AmountAvailable>(_GrowerCreditListPropertiesTypeAmountAvailable_QNAME, GrowerCreditListPropertiesType.AmountAvailable.class, GrowerCreditListPropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCreditList", name = "CreditIdentifier", scope = GrowerCreditListPropertiesType.class)
    public JAXBElement<String> createGrowerCreditListPropertiesTypeCreditIdentifier(String value) {
        return new JAXBElement<String>(_GrowerCreditListPropertiesTypeCreditIdentifier_QNAME, String.class, GrowerCreditListPropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCreditList", name = "Zone", scope = GrowerCreditListPropertiesType.class)
    public JAXBElement<ZoneType> createGrowerCreditListPropertiesTypeZone(ZoneType value) {
        return new JAXBElement<ZoneType>(_GrowerCreditListPropertiesTypeZone_QNAME, ZoneType.class, GrowerCreditListPropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrowerCreditListPropertiesType.DateApproved }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCreditList", name = "DateApproved", scope = GrowerCreditListPropertiesType.class)
    public JAXBElement<GrowerCreditListPropertiesType.DateApproved> createGrowerCreditListPropertiesTypeDateApproved(GrowerCreditListPropertiesType.DateApproved value) {
        return new JAXBElement<GrowerCreditListPropertiesType.DateApproved>(_GrowerCreditListPropertiesTypeDateApproved_QNAME, GrowerCreditListPropertiesType.DateApproved.class, GrowerCreditListPropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCreditList", name = "CreditStatus", scope = GrowerCreditListPropertiesType.class)
    public JAXBElement<String> createGrowerCreditListPropertiesTypeCreditStatus(String value) {
        return new JAXBElement<String>(_GrowerCreditListPropertiesTypeCreditStatus_QNAME, String.class, GrowerCreditListPropertiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Monsanto:Service:GrowerCreditList", name = "LicenseStatus", scope = GrowerCreditListPropertiesType.class)
    public JAXBElement<String> createGrowerCreditListPropertiesTypeLicenseStatus(String value) {
        return new JAXBElement<String>(_GrowerCreditListPropertiesTypeLicenseStatus_QNAME, String.class, GrowerCreditListPropertiesType.class, value);
    }

}

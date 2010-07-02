
package com.monsanto.irdsoapservices.retailseller.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.monsanto.irdsoapservices.retailseller.schema package. 
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

    private final static QName _RetailSellerInformation_QNAME = new QName("urn:ecms:schema:retailsellerinformation:request:1:0", "RetailSellerInformation");
    private final static QName _PartnerInformation_QNAME = new QName("urn:ecms:schema:retailsellerinformation:request:1:0", "PartnerInformation");
    private final static QName _StateOrProvince_QNAME = new QName("urn:ecms:schema:retailsellerinformation:request:1:0", "StateOrProvince");
    private final static QName _County_QNAME = new QName("urn:ecms:schema:retailsellerinformation:request:1:0", "County");
    private final static QName _PostalCode_QNAME = new QName("urn:ecms:schema:retailsellerinformation:request:1:0", "PostalCode");
    private final static QName _PostBoxNumber_QNAME = new QName("urn:ecms:schema:retailsellerinformation:request:1:0", "PostBoxNumber");
    private final static QName _DocumentIdentifier_QNAME = new QName("urn:ecms:schema:retailsellerinformation:request:1:0", "DocumentIdentifier");
    private final static QName _RetailSellerFault_QNAME = new QName("urn:ecms:schema:retailsellerinformation:request:1:0", "RetailSellerFault");
    private final static QName _DateTime_QNAME = new QName("urn:ecms:schema:retailsellerinformation:request:1:0", "DateTime");
    private final static QName _RetailSellerResponse_QNAME = new QName("urn:ecms:schema:retailsellerinformation:request:1:0", "RetailSellerResponse");
    private final static QName _AddressLine_QNAME = new QName("urn:ecms:schema:retailsellerinformation:request:1:0", "AddressLine");
    private final static QName _CityName_QNAME = new QName("urn:ecms:schema:retailsellerinformation:request:1:0", "CityName");
    private final static QName _PostalCountry_QNAME = new QName("urn:ecms:schema:retailsellerinformation:request:1:0", "PostalCountry");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.monsanto.irdsoapservices.retailseller.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetailSellerInformationType }
     * 
     */
    public RetailSellerInformationType createRetailSellerInformationType() {
        return new RetailSellerInformationType();
    }

    /**
     * Create an instance of {@link DealerType }
     * 
     */
    public DealerType createDealerType() {
        return new DealerType();
    }

    /**
     * Create an instance of {@link ToType }
     * 
     */
    public ToType createToType() {
        return new ToType();
    }

    /**
     * Create an instance of {@link AlternateCommunicationMethodType }
     * 
     */
    public AlternateCommunicationMethodType createAlternateCommunicationMethodType() {
        return new AlternateCommunicationMethodType();
    }

    /**
     * Create an instance of {@link RetailSellerInformationBodyType }
     * 
     */
    public RetailSellerInformationBodyType createRetailSellerInformationBodyType() {
        return new RetailSellerInformationBodyType();
    }

    /**
     * Create an instance of {@link ThisDocumentIdentifierType }
     * 
     */
    public ThisDocumentIdentifierType createThisDocumentIdentifierType() {
        return new ThisDocumentIdentifierType();
    }

    /**
     * Create an instance of {@link SellerType }
     * 
     */
    public SellerType createSellerType() {
        return new SellerType();
    }

    /**
     * Create an instance of {@link SalespersonType }
     * 
     */
    public SalespersonType createSalespersonType() {
        return new SalespersonType();
    }

    /**
     * Create an instance of {@link ExceptionType }
     * 
     */
    public ExceptionType createExceptionType() {
        return new ExceptionType();
    }

    /**
     * Create an instance of {@link RetailSellerInformationPartnersType }
     * 
     */
    public RetailSellerInformationPartnersType createRetailSellerInformationPartnersType() {
        return new RetailSellerInformationPartnersType();
    }

    /**
     * Create an instance of {@link DateTimeType }
     * 
     */
    public DateTimeType createDateTimeType() {
        return new DateTimeType();
    }

    /**
     * Create an instance of {@link PartnerInformationType }
     * 
     */
    public PartnerInformationType createPartnerInformationType() {
        return new PartnerInformationType();
    }

    /**
     * Create an instance of {@link AddressInformationTypeII }
     * 
     */
    public AddressInformationTypeII createAddressInformationTypeII() {
        return new AddressInformationTypeII();
    }

    /**
     * Create an instance of {@link ThisDocumentDateTimeType }
     * 
     */
    public ThisDocumentDateTimeType createThisDocumentDateTimeType() {
        return new ThisDocumentDateTimeType();
    }

    /**
     * Create an instance of {@link RetailSellerResponseType }
     * 
     */
    public RetailSellerResponseType createRetailSellerResponseType() {
        return new RetailSellerResponseType();
    }

    /**
     * Create an instance of {@link AddressInformationType }
     * 
     */
    public AddressInformationType createAddressInformationType() {
        return new AddressInformationType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link BuyerType }
     * 
     */
    public BuyerType createBuyerType() {
        return new BuyerType();
    }

    /**
     * Create an instance of {@link PartnerIdentifierType }
     * 
     */
    public PartnerIdentifierType createPartnerIdentifierType() {
        return new PartnerIdentifierType();
    }

    /**
     * Create an instance of {@link FromType }
     * 
     */
    public FromType createFromType() {
        return new FromType();
    }

    /**
     * Create an instance of {@link RetailSellerInformationDetailsType }
     * 
     */
    public RetailSellerInformationDetailsType createRetailSellerInformationDetailsType() {
        return new RetailSellerInformationDetailsType();
    }

    /**
     * Create an instance of {@link ContactInformationType }
     * 
     */
    public ContactInformationType createContactInformationType() {
        return new ContactInformationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailSellerInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:retailsellerinformation:request:1:0", name = "RetailSellerInformation")
    public JAXBElement<RetailSellerInformationType> createRetailSellerInformation(RetailSellerInformationType value) {
        return new JAXBElement<RetailSellerInformationType>(_RetailSellerInformation_QNAME, RetailSellerInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:retailsellerinformation:request:1:0", name = "PartnerInformation")
    public JAXBElement<PartnerInformationType> createPartnerInformation(PartnerInformationType value) {
        return new JAXBElement<PartnerInformationType>(_PartnerInformation_QNAME, PartnerInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:retailsellerinformation:request:1:0", name = "StateOrProvince")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStateOrProvince(String value) {
        return new JAXBElement<String>(_StateOrProvince_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:retailsellerinformation:request:1:0", name = "County")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCounty(String value) {
        return new JAXBElement<String>(_County_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:retailsellerinformation:request:1:0", name = "PostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPostalCode(String value) {
        return new JAXBElement<String>(_PostalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:retailsellerinformation:request:1:0", name = "PostBoxNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPostBoxNumber(String value) {
        return new JAXBElement<String>(_PostBoxNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:retailsellerinformation:request:1:0", name = "DocumentIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocumentIdentifier(String value) {
        return new JAXBElement<String>(_DocumentIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:retailsellerinformation:request:1:0", name = "RetailSellerFault")
    public JAXBElement<ExceptionType> createRetailSellerFault(ExceptionType value) {
        return new JAXBElement<ExceptionType>(_RetailSellerFault_QNAME, ExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:retailsellerinformation:request:1:0", name = "DateTime")
    public JAXBElement<DateTimeType> createDateTime(DateTimeType value) {
        return new JAXBElement<DateTimeType>(_DateTime_QNAME, DateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailSellerResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:retailsellerinformation:request:1:0", name = "RetailSellerResponse")
    public JAXBElement<RetailSellerResponseType> createRetailSellerResponse(RetailSellerResponseType value) {
        return new JAXBElement<RetailSellerResponseType>(_RetailSellerResponse_QNAME, RetailSellerResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:retailsellerinformation:request:1:0", name = "AddressLine")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAddressLine(String value) {
        return new JAXBElement<String>(_AddressLine_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:retailsellerinformation:request:1:0", name = "CityName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCityName(String value) {
        return new JAXBElement<String>(_CityName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:retailsellerinformation:request:1:0", name = "PostalCountry")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPostalCountry(String value) {
        return new JAXBElement<String>(_PostalCountry_QNAME, String.class, null, value);
    }

}

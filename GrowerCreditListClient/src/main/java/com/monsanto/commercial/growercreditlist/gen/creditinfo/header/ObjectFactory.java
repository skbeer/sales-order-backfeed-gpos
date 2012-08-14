
package com.monsanto.commercial.growercreditlist.gen.creditinfo.header;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.monsanto.commercial.growercreditlist.gen.creditinfo.header package. 
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

    private final static QName _EmailAddress_QNAME = new QName("urn:monsanto:uscomm:service:header", "EmailAddress");
    private final static QName _From_QNAME = new QName("urn:monsanto:uscomm:service:header", "From");
    private final static QName _ContactInformation_QNAME = new QName("urn:monsanto:uscomm:service:header", "ContactInformation");
    private final static QName _DataSource_QNAME = new QName("urn:monsanto:uscomm:service:header", "DataSource");
    private final static QName _SoftwareVersion_QNAME = new QName("urn:monsanto:uscomm:service:header", "SoftwareVersion");
    private final static QName _DocumentIdentifier_QNAME = new QName("urn:monsanto:uscomm:service:header", "DocumentIdentifier");
    private final static QName _Header_QNAME = new QName("urn:monsanto:uscomm:service:header", "Header");
    private final static QName _DocumentDateTime_QNAME = new QName("urn:monsanto:uscomm:service:header", "DocumentDateTime");
    private final static QName _PartnerIdentifier_QNAME = new QName("urn:monsanto:uscomm:service:header", "PartnerIdentifier");
    private final static QName _PartnerName_QNAME = new QName("urn:monsanto:uscomm:service:header", "PartnerName");
    private final static QName _ContactName_QNAME = new QName("urn:monsanto:uscomm:service:header", "ContactName");
    private final static QName _ContactPhoneNumber_QNAME = new QName("urn:monsanto:uscomm:service:header", "ContactPhoneNumber");
    private final static QName _To_QNAME = new QName("urn:monsanto:uscomm:service:header", "To");
    private final static QName _ContactDescription_QNAME = new QName("urn:monsanto:uscomm:service:header", "ContactDescription");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.monsanto.commercial.growercreditlist.gen.creditinfo.header
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PartnerIdentifierType }
     * 
     */
    public PartnerIdentifierType createPartnerIdentifierType() {
        return new PartnerIdentifierType();
    }

    /**
     * Create an instance of {@link PartnerInformationType }
     * 
     */
    public PartnerInformationType createPartnerInformationType() {
        return new PartnerInformationType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link ContactInformationType }
     * 
     */
    public ContactInformationType createContactInformationType() {
        return new ContactInformationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:uscomm:service:header", name = "EmailAddress")
    public JAXBElement<String> createEmailAddress(String value) {
        return new JAXBElement<String>(_EmailAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:uscomm:service:header", name = "From")
    public JAXBElement<PartnerInformationType> createFrom(PartnerInformationType value) {
        return new JAXBElement<PartnerInformationType>(_From_QNAME, PartnerInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:uscomm:service:header", name = "ContactInformation")
    public JAXBElement<ContactInformationType> createContactInformation(ContactInformationType value) {
        return new JAXBElement<ContactInformationType>(_ContactInformation_QNAME, ContactInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:uscomm:service:header", name = "DataSource")
    public JAXBElement<String> createDataSource(String value) {
        return new JAXBElement<String>(_DataSource_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:uscomm:service:header", name = "SoftwareVersion")
    public JAXBElement<String> createSoftwareVersion(String value) {
        return new JAXBElement<String>(_SoftwareVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:uscomm:service:header", name = "DocumentIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocumentIdentifier(String value) {
        return new JAXBElement<String>(_DocumentIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:uscomm:service:header", name = "Header")
    public JAXBElement<HeaderType> createHeader(HeaderType value) {
        return new JAXBElement<HeaderType>(_Header_QNAME, HeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:uscomm:service:header", name = "DocumentDateTime")
    public JAXBElement<XMLGregorianCalendar> createDocumentDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocumentDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:uscomm:service:header", name = "PartnerIdentifier")
    public JAXBElement<PartnerIdentifierType> createPartnerIdentifier(PartnerIdentifierType value) {
        return new JAXBElement<PartnerIdentifierType>(_PartnerIdentifier_QNAME, PartnerIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:uscomm:service:header", name = "PartnerName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPartnerName(String value) {
        return new JAXBElement<String>(_PartnerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:uscomm:service:header", name = "ContactName")
    public JAXBElement<String> createContactName(String value) {
        return new JAXBElement<String>(_ContactName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:uscomm:service:header", name = "ContactPhoneNumber")
    public JAXBElement<String> createContactPhoneNumber(String value) {
        return new JAXBElement<String>(_ContactPhoneNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:uscomm:service:header", name = "To")
    public JAXBElement<PartnerInformationType> createTo(PartnerInformationType value) {
        return new JAXBElement<PartnerInformationType>(_To_QNAME, PartnerInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:monsanto:uscomm:service:header", name = "ContactDescription")
    public JAXBElement<String> createContactDescription(String value) {
        return new JAXBElement<String>(_ContactDescription_QNAME, String.class, null, value);
    }

}

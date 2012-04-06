
package com.monsanto.irdsoapservices.datasummary.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.monsanto.irdsoapservices.datasummary.schema package. 
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

    private final static QName _DocumentIdentifier_QNAME = new QName("urn:ecms:schema:datasummaryreport:response:1:0", "DocumentIdentifier");
    private final static QName _DateTime_QNAME = new QName("urn:ecms:schema:datasummaryreport:response:1:0", "DateTime");
    private final static QName _PartnerInformation_QNAME = new QName("urn:ecms:schema:datasummaryreport:response:1:0", "PartnerInformation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.monsanto.irdsoapservices.datasummary.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PartnerInformationType }
     * 
     */
    public PartnerInformationType createPartnerInformationType() {
        return new PartnerInformationType();
    }

    /**
     * Create an instance of {@link ToType }
     * 
     */
    public ToType createToType() {
        return new ToType();
    }

    /**
     * Create an instance of {@link ThisDocumentDateTimeType }
     * 
     */
    public ThisDocumentDateTimeType createThisDocumentDateTimeType() {
        return new ThisDocumentDateTimeType();
    }

    /**
     * Create an instance of {@link DataSummaryReport }
     * 
     */
    public DataSummaryReport createDataSummaryReport() {
        return new DataSummaryReport();
    }

    /**
     * Create an instance of {@link DataSummaryReportBodyType }
     * 
     */
    public DataSummaryReportBodyType createDataSummaryReportBodyType() {
        return new DataSummaryReportBodyType();
    }

    /**
     * Create an instance of {@link AddressInformationType }
     * 
     */
    public AddressInformationType createAddressInformationType() {
        return new AddressInformationType();
    }

    /**
     * Create an instance of {@link FromType }
     * 
     */
    public FromType createFromType() {
        return new FromType();
    }

    /**
     * Create an instance of {@link AlternateCommunicationMethodType }
     * 
     */
    public AlternateCommunicationMethodType createAlternateCommunicationMethodType() {
        return new AlternateCommunicationMethodType();
    }

    /**
     * Create an instance of {@link DataVerificationCheckpointType }
     * 
     */
    public DataVerificationCheckpointType createDataVerificationCheckpointType() {
        return new DataVerificationCheckpointType();
    }

    /**
     * Create an instance of {@link ContactInformationType }
     * 
     */
    public ContactInformationType createContactInformationType() {
        return new ContactInformationType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link ReportFileListType }
     * 
     */
    public ReportFileListType createReportFileListType() {
        return new ReportFileListType();
    }

    /**
     * Create an instance of {@link ReportDataVerificationType }
     * 
     */
    public ReportDataVerificationType createReportDataVerificationType() {
        return new ReportDataVerificationType();
    }

    /**
     * Create an instance of {@link ReportFileType }
     * 
     */
    public ReportFileType createReportFileType() {
        return new ReportFileType();
    }

    /**
     * Create an instance of {@link ThisDocumentIdentifierType }
     * 
     */
    public ThisDocumentIdentifierType createThisDocumentIdentifierType() {
        return new ThisDocumentIdentifierType();
    }

    /**
     * Create an instance of {@link DataSummaryReportType }
     * 
     */
    public DataSummaryReportType createDataSummaryReportType() {
        return new DataSummaryReportType();
    }

    /**
     * Create an instance of {@link DateTimeType }
     * 
     */
    public DateTimeType createDateTimeType() {
        return new DateTimeType();
    }

    /**
     * Create an instance of {@link PartnerIdentifierType }
     * 
     */
    public PartnerIdentifierType createPartnerIdentifierType() {
        return new PartnerIdentifierType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:datasummaryreport:response:1:0", name = "DocumentIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocumentIdentifier(String value) {
        return new JAXBElement<String>(_DocumentIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:datasummaryreport:response:1:0", name = "DateTime")
    public JAXBElement<DateTimeType> createDateTime(DateTimeType value) {
        return new JAXBElement<DateTimeType>(_DateTime_QNAME, DateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:datasummaryreport:response:1:0", name = "PartnerInformation")
    public JAXBElement<PartnerInformationType> createPartnerInformation(PartnerInformationType value) {
        return new JAXBElement<PartnerInformationType>(_PartnerInformation_QNAME, PartnerInformationType.class, null, value);
    }

}

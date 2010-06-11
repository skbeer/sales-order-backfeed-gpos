
package com.monsanto.irdsoapservices.salesorder.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.monsanto.irdsoapservices.salesorder.schema package. 
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

    private final static QName _DocumentIdentifier_QNAME = new QName("urn:ecms:schema:salesorderreport:response:1:0", "DocumentIdentifier");
    private final static QName _DateTime_QNAME = new QName("urn:ecms:schema:salesorderreport:response:1:0", "DateTime");
    private final static QName _Buyer_QNAME = new QName("urn:ecms:schema:salesorderreport:response:1:0", "Buyer");
    private final static QName _Measurement_QNAME = new QName("urn:ecms:schema:salesorderreport:response:1:0", "Measurement");
    private final static QName _SalesOrderFault_QNAME = new QName("urn:ecms:schema:salesorderreport:response:1:0", "SalesOrderFault");
    private final static QName _ShipTo_QNAME = new QName("urn:ecms:schema:salesorderreport:response:1:0", "ShipTo");
    private final static QName _Seller_QNAME = new QName("urn:ecms:schema:salesorderreport:response:1:0", "Seller");
    private final static QName _SalesOrderReportResponse_QNAME = new QName("urn:ecms:schema:salesorderreport:response:1:0", "SalesOrderReportResponse");
    private final static QName _PartnerInformation_QNAME = new QName("urn:ecms:schema:salesorderreport:response:1:0", "PartnerInformation");
    private final static QName _OtherPartner_QNAME = new QName("urn:ecms:schema:salesorderreport:response:1:0", "OtherPartner");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.monsanto.irdsoapservices.salesorder.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SalesOrderLineItemType.DeliveredQuantity }
     * 
     */
    public SalesOrderLineItemType.DeliveredQuantity createSalesOrderLineItemTypeDeliveredQuantity() {
        return new SalesOrderLineItemType.DeliveredQuantity();
    }

    /**
     * Create an instance of {@link SalesOrderLineItemType.RejectReason }
     * 
     */
    public SalesOrderLineItemType.RejectReason createSalesOrderLineItemTypeRejectReason() {
        return new SalesOrderLineItemType.RejectReason();
    }

    /**
     * Create an instance of {@link ProductQuantityType_0020 }
     * 
     */
    public ProductQuantityType_0020 createProductQuantityType_0020() {
        return new ProductQuantityType_0020();
    }

    /**
     * Create an instance of {@link SalesOrderReportPropertiesType }
     * 
     */
    public SalesOrderReportPropertiesType createSalesOrderReportPropertiesType() {
        return new SalesOrderReportPropertiesType();
    }

    /**
     * Create an instance of {@link SalesOrderReportResponseType }
     * 
     */
    public SalesOrderReportResponseType createSalesOrderReportResponseType() {
        return new SalesOrderReportResponseType();
    }

    /**
     * Create an instance of {@link PartnerIdentifierType }
     * 
     */
    public PartnerIdentifierType createPartnerIdentifierType() {
        return new PartnerIdentifierType();
    }

    /**
     * Create an instance of {@link OtherPartnerTypeOld }
     * 
     */
    public OtherPartnerTypeOld createOtherPartnerTypeOld() {
        return new OtherPartnerTypeOld();
    }

    /**
     * Create an instance of {@link AlternateCommunicationMethodType }
     * 
     */
    public AlternateCommunicationMethodType createAlternateCommunicationMethodType() {
        return new AlternateCommunicationMethodType();
    }

    /**
     * Create an instance of {@link SalesOrderReport }
     * 
     */
    public SalesOrderReport createSalesOrderReport() {
        return new SalesOrderReport();
    }

    /**
     * Create an instance of {@link SalesOrderReportBodyType }
     * 
     */
    public SalesOrderReportBodyType createSalesOrderReportBodyType() {
        return new SalesOrderReportBodyType();
    }

    /**
     * Create an instance of {@link SalesOrderTypeCodeType }
     * 
     */
    public SalesOrderTypeCodeType createSalesOrderTypeCodeType() {
        return new SalesOrderTypeCodeType();
    }

    /**
     * Create an instance of {@link FromType }
     * 
     */
    public FromType createFromType() {
        return new FromType();
    }

    /**
     * Create an instance of {@link ShippedQuantityType }
     * 
     */
    public ShippedQuantityType createShippedQuantityType() {
        return new ShippedQuantityType();
    }

    /**
     * Create an instance of {@link OrderDateType }
     * 
     */
    public OrderDateType createOrderDateType() {
        return new OrderDateType();
    }

    /**
     * Create an instance of {@link PendingQuantityType }
     * 
     */
    public PendingQuantityType createPendingQuantityType() {
        return new PendingQuantityType();
    }

    /**
     * Create an instance of {@link RejectReasonType }
     * 
     */
    public RejectReasonType createRejectReasonType() {
        return new RejectReasonType();
    }

    /**
     * Create an instance of {@link MeasurementType }
     * 
     */
    public MeasurementType createMeasurementType() {
        return new MeasurementType();
    }

    /**
     * Create an instance of {@link ExceptionType }
     * 
     */
    public ExceptionType createExceptionType() {
        return new ExceptionType();
    }

    /**
     * Create an instance of {@link SalesOrderNumberType }
     * 
     */
    public SalesOrderNumberType createSalesOrderNumberType() {
        return new SalesOrderNumberType();
    }

    /**
     * Create an instance of {@link ChangeDate }
     * 
     */
    public ChangeDate createChangeDate() {
        return new ChangeDate();
    }

    /**
     * Create an instance of {@link UnitOfMeasureCodeType }
     * 
     */
    public UnitOfMeasureCodeType createUnitOfMeasureCodeType() {
        return new UnitOfMeasureCodeType();
    }

    /**
     * Create an instance of {@link AddressInformationType }
     * 
     */
    public AddressInformationType createAddressInformationType() {
        return new AddressInformationType();
    }

    /**
     * Create an instance of {@link PendingQuantityEquivalentType }
     * 
     */
    public PendingQuantityEquivalentType createPendingQuantityEquivalentType() {
        return new PendingQuantityEquivalentType();
    }

    /**
     * Create an instance of {@link ShipToType }
     * 
     */
    public ShipToType createShipToType() {
        return new ShipToType();
    }

    /**
     * Create an instance of {@link SellerType }
     * 
     */
    public SellerType createSellerType() {
        return new SellerType();
    }

    /**
     * Create an instance of {@link AlternativeCommunicationMethodType }
     * 
     */
    public AlternativeCommunicationMethodType createAlternativeCommunicationMethodType() {
        return new AlternativeCommunicationMethodType();
    }

    /**
     * Create an instance of {@link SalesPersonType }
     * 
     */
    public SalesPersonType createSalesPersonType() {
        return new SalesPersonType();
    }

    /**
     * Create an instance of {@link OtherPartnerType }
     * 
     */
    public OtherPartnerType createOtherPartnerType() {
        return new OtherPartnerType();
    }

    /**
     * Create an instance of {@link ChangeDateType }
     * 
     */
    public ChangeDateType createChangeDateType() {
        return new ChangeDateType();
    }

    /**
     * Create an instance of {@link SalesOrderPartnersType }
     * 
     */
    public SalesOrderPartnersType createSalesOrderPartnersType() {
        return new SalesOrderPartnersType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link ProductIdentifierType }
     * 
     */
    public ProductIdentifierType createProductIdentifierType() {
        return new ProductIdentifierType();
    }

    /**
     * Create an instance of {@link SalesOrderReportDetailsType }
     * 
     */
    public SalesOrderReportDetailsType createSalesOrderReportDetailsType() {
        return new SalesOrderReportDetailsType();
    }

    /**
     * Create an instance of {@link ThisDocumentIdentifierType }
     * 
     */
    public ThisDocumentIdentifierType createThisDocumentIdentifierType() {
        return new ThisDocumentIdentifierType();
    }

    /**
     * Create an instance of {@link DateTimeType }
     * 
     */
    public DateTimeType createDateTimeType() {
        return new DateTimeType();
    }

    /**
     * Create an instance of {@link ProductQuantityEquivalentType }
     * 
     */
    public ProductQuantityEquivalentType createProductQuantityEquivalentType() {
        return new ProductQuantityEquivalentType();
    }

    /**
     * Create an instance of {@link ProductidentificationType }
     * 
     */
    public ProductidentificationType createProductidentificationType() {
        return new ProductidentificationType();
    }

    /**
     * Create an instance of {@link ShippedQuantityEquivalentType }
     * 
     */
    public ShippedQuantityEquivalentType createShippedQuantityEquivalentType() {
        return new ShippedQuantityEquivalentType();
    }

    /**
     * Create an instance of {@link BuyerType }
     * 
     */
    public BuyerType createBuyerType() {
        return new BuyerType();
    }

    /**
     * Create an instance of {@link DeliveryQuantityEquivalentType }
     * 
     */
    public DeliveryQuantityEquivalentType createDeliveryQuantityEquivalentType() {
        return new DeliveryQuantityEquivalentType();
    }

    /**
     * Create an instance of {@link SalesOrderLineItemType }
     * 
     */
    public SalesOrderLineItemType createSalesOrderLineItemType() {
        return new SalesOrderLineItemType();
    }

    /**
     * Create an instance of {@link ContactInformationType }
     * 
     */
    public ContactInformationType createContactInformationType() {
        return new ContactInformationType();
    }

    /**
     * Create an instance of {@link SalesOrderIssuedDateType }
     * 
     */
    public SalesOrderIssuedDateType createSalesOrderIssuedDateType() {
        return new SalesOrderIssuedDateType();
    }

    /**
     * Create an instance of {@link PartnerInformationType }
     * 
     */
    public PartnerInformationType createPartnerInformationType() {
        return new PartnerInformationType();
    }

    /**
     * Create an instance of {@link ThisDocumentDateTimeType }
     * 
     */
    public ThisDocumentDateTimeType createThisDocumentDateTimeType() {
        return new ThisDocumentDateTimeType();
    }

    /**
     * Create an instance of {@link SalesOrderTransactionDetailsType }
     * 
     */
    public SalesOrderTransactionDetailsType createSalesOrderTransactionDetailsType() {
        return new SalesOrderTransactionDetailsType();
    }

    /**
     * Create an instance of {@link ToType }
     * 
     */
    public ToType createToType() {
        return new ToType();
    }

    /**
     * Create an instance of {@link SalesOrderReportType }
     * 
     */
    public SalesOrderReportType createSalesOrderReportType() {
        return new SalesOrderReportType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:salesorderreport:response:1:0", name = "DocumentIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocumentIdentifier(String value) {
        return new JAXBElement<String>(_DocumentIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:salesorderreport:response:1:0", name = "DateTime")
    public JAXBElement<DateTimeType> createDateTime(DateTimeType value) {
        return new JAXBElement<DateTimeType>(_DateTime_QNAME, DateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:salesorderreport:response:1:0", name = "Buyer")
    public JAXBElement<BuyerType> createBuyer(BuyerType value) {
        return new JAXBElement<BuyerType>(_Buyer_QNAME, BuyerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:salesorderreport:response:1:0", name = "Measurement")
    public JAXBElement<MeasurementType> createMeasurement(MeasurementType value) {
        return new JAXBElement<MeasurementType>(_Measurement_QNAME, MeasurementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:salesorderreport:response:1:0", name = "SalesOrderFault")
    public JAXBElement<ExceptionType> createSalesOrderFault(ExceptionType value) {
        return new JAXBElement<ExceptionType>(_SalesOrderFault_QNAME, ExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipToType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:salesorderreport:response:1:0", name = "ShipTo")
    public JAXBElement<ShipToType> createShipTo(ShipToType value) {
        return new JAXBElement<ShipToType>(_ShipTo_QNAME, ShipToType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:salesorderreport:response:1:0", name = "Seller")
    public JAXBElement<SellerType> createSeller(SellerType value) {
        return new JAXBElement<SellerType>(_Seller_QNAME, SellerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesOrderReportResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:salesorderreport:response:1:0", name = "SalesOrderReportResponse")
    public JAXBElement<SalesOrderReportResponseType> createSalesOrderReportResponse(SalesOrderReportResponseType value) {
        return new JAXBElement<SalesOrderReportResponseType>(_SalesOrderReportResponse_QNAME, SalesOrderReportResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:salesorderreport:response:1:0", name = "PartnerInformation")
    public JAXBElement<PartnerInformationType> createPartnerInformation(PartnerInformationType value) {
        return new JAXBElement<PartnerInformationType>(_PartnerInformation_QNAME, PartnerInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherPartnerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ecms:schema:salesorderreport:response:1:0", name = "OtherPartner")
    public JAXBElement<OtherPartnerType> createOtherPartner(OtherPartnerType value) {
        return new JAXBElement<OtherPartnerType>(_OtherPartner_QNAME, OtherPartnerType.class, null, value);
    }

}

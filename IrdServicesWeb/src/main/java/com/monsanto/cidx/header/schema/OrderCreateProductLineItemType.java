
package com.monsanto.cidx.header.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for OrderCreateProductLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderCreateProductLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineItemType" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PurchaseOrderLineItemNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReleaseNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductIdentification" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductQuantity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BatchNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CountryOfOriginCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ScheduleDateTimeInformation" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OtherPartner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTolerances" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentMethodOfPaymentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedPrice" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxableFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedDocument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Routing" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BalanceItemFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DutyStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ImportLicenseNeededFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ImportLicenseAvailableFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SecondWeightFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CustomerRequestedDeliveryHoldFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AccompanyingSampleIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialFulfillmentRequestCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CountryOfFinalDestinationCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryGroup" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCreateProductLineItemType", propOrder = {
    "lineNumber",
    "lineItemType",
    "purchaseOrderLineItemNumber",
    "releaseNumber",
    "productIdentification",
    "referenceInformation",
    "productQuantity",
    "packagingQuantity",
    "batchNumber",
    "countryOfOriginCode",
    "scheduleDateTimeInformation",
    "otherPartner",
    "deliveryTolerances",
    "deliveryTerms",
    "shipmentMethodOfPaymentCode",
    "transportInformation",
    "requestedPrice",
    "paymentTerms",
    "taxableFlag",
    "requestedDocument",
    "routing",
    "balanceItemFlag",
    "dutyStatus",
    "importLicenseNeededFlag",
    "importLicenseAvailableFlag",
    "secondWeightFlag",
    "customerRequestedDeliveryHoldFlag",
    "accompanyingSampleIndicator",
    "specialFulfillmentRequestCode",
    "countryOfFinalDestinationCode",
    "deliveryGroup",
    "specialInstructions"
})
public class OrderCreateProductLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "LineItemType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lineItemType;
    @XmlElement(name = "PurchaseOrderLineItemNumber", required = true)
    protected BigInteger purchaseOrderLineItemNumber;
    @XmlElement(name = "ReleaseNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String releaseNumber;
    @XmlElement(name = "ProductIdentification", required = true)
    protected List<ProductIdentificationType> productIdentification;
    @XmlElement(name = "ReferenceInformation")
    protected List<ReferenceInformationType> referenceInformation;
    @XmlElement(name = "ProductQuantity", required = true)
    protected ProductQuantityType productQuantity;
    @XmlElement(name = "PackagingQuantity")
    protected PackagingQuantityType packagingQuantity;
    @XmlElement(name = "BatchNumber")
    protected List<BatchNumberType> batchNumber;
    @XmlElement(name = "CountryOfOriginCode")
    protected CountryOfOriginCodeType countryOfOriginCode;
    @XmlElement(name = "ScheduleDateTimeInformation", required = true)
    protected List<ScheduleDateTimeInformationType> scheduleDateTimeInformation;
    @XmlElement(name = "OtherPartner")
    protected List<OtherPartnerType> otherPartner;
    @XmlElement(name = "DeliveryTolerances")
    protected DeliveryTolerancesType deliveryTolerances;
    @XmlElement(name = "DeliveryTerms")
    protected DeliveryTermsType deliveryTerms;
    @XmlElement(name = "ShipmentMethodOfPaymentCode")
    protected ShipmentMethodOfPaymentCodeType shipmentMethodOfPaymentCode;
    @XmlElement(name = "TransportInformation")
    protected List<TransportInformationType> transportInformation;
    @XmlElement(name = "RequestedPrice")
    protected RequestedPriceType requestedPrice;
    @XmlElement(name = "PaymentTerms")
    protected PaymentTermsType paymentTerms;
    @XmlElement(name = "TaxableFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String taxableFlag;
    @XmlElement(name = "RequestedDocument")
    protected List<RequestedDocumentType> requestedDocument;
    @XmlElement(name = "Routing")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String routing;
    @XmlElement(name = "BalanceItemFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String balanceItemFlag;
    @XmlElement(name = "DutyStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dutyStatus;
    @XmlElement(name = "ImportLicenseNeededFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String importLicenseNeededFlag;
    @XmlElement(name = "ImportLicenseAvailableFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String importLicenseAvailableFlag;
    @XmlElement(name = "SecondWeightFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String secondWeightFlag;
    @XmlElement(name = "CustomerRequestedDeliveryHoldFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String customerRequestedDeliveryHoldFlag;
    @XmlElement(name = "AccompanyingSampleIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String accompanyingSampleIndicator;
    @XmlElement(name = "SpecialFulfillmentRequestCode")
    protected List<SpecialFulfillmentRequestCodeType> specialFulfillmentRequestCode;
    @XmlElement(name = "CountryOfFinalDestinationCode")
    protected CountryOfFinalDestinationCodeType countryOfFinalDestinationCode;
    @XmlElement(name = "DeliveryGroup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deliveryGroup;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;

    /**
     * Gets the value of the lineNumber property.
     * 
     */
    public long getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     */
    public void setLineNumber(long value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the lineItemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItemType() {
        return lineItemType;
    }

    /**
     * Sets the value of the lineItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItemType(String value) {
        this.lineItemType = value;
    }

    /**
     * Gets the value of the purchaseOrderLineItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPurchaseOrderLineItemNumber() {
        return purchaseOrderLineItemNumber;
    }

    /**
     * Sets the value of the purchaseOrderLineItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPurchaseOrderLineItemNumber(BigInteger value) {
        this.purchaseOrderLineItemNumber = value;
    }

    /**
     * Gets the value of the releaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseNumber() {
        return releaseNumber;
    }

    /**
     * Sets the value of the releaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseNumber(String value) {
        this.releaseNumber = value;
    }

    /**
     * Gets the value of the productIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentificationType }
     * 
     * 
     */
    public List<ProductIdentificationType> getProductIdentification() {
        if (productIdentification == null) {
            productIdentification = new ArrayList<ProductIdentificationType>();
        }
        return this.productIdentification;
    }

    /**
     * Gets the value of the referenceInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInformationType }
     * 
     * 
     */
    public List<ReferenceInformationType> getReferenceInformation() {
        if (referenceInformation == null) {
            referenceInformation = new ArrayList<ReferenceInformationType>();
        }
        return this.referenceInformation;
    }

    /**
     * Gets the value of the productQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantityType }
     *     
     */
    public ProductQuantityType getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantityType }
     *     
     */
    public void setProductQuantity(ProductQuantityType value) {
        this.productQuantity = value;
    }

    /**
     * Gets the value of the packagingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingQuantityType }
     *     
     */
    public PackagingQuantityType getPackagingQuantity() {
        return packagingQuantity;
    }

    /**
     * Sets the value of the packagingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingQuantityType }
     *     
     */
    public void setPackagingQuantity(PackagingQuantityType value) {
        this.packagingQuantity = value;
    }

    /**
     * Gets the value of the batchNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchNumberType }
     * 
     * 
     */
    public List<BatchNumberType> getBatchNumber() {
        if (batchNumber == null) {
            batchNumber = new ArrayList<BatchNumberType>();
        }
        return this.batchNumber;
    }

    /**
     * Gets the value of the countryOfOriginCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryOfOriginCodeType }
     *     
     */
    public CountryOfOriginCodeType getCountryOfOriginCode() {
        return countryOfOriginCode;
    }

    /**
     * Sets the value of the countryOfOriginCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryOfOriginCodeType }
     *     
     */
    public void setCountryOfOriginCode(CountryOfOriginCodeType value) {
        this.countryOfOriginCode = value;
    }

    /**
     * Gets the value of the scheduleDateTimeInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleDateTimeInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleDateTimeInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleDateTimeInformationType }
     * 
     * 
     */
    public List<ScheduleDateTimeInformationType> getScheduleDateTimeInformation() {
        if (scheduleDateTimeInformation == null) {
            scheduleDateTimeInformation = new ArrayList<ScheduleDateTimeInformationType>();
        }
        return this.scheduleDateTimeInformation;
    }

    /**
     * Gets the value of the otherPartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherPartnerType }
     * 
     * 
     */
    public List<OtherPartnerType> getOtherPartner() {
        if (otherPartner == null) {
            otherPartner = new ArrayList<OtherPartnerType>();
        }
        return this.otherPartner;
    }

    /**
     * Gets the value of the deliveryTolerances property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryTolerancesType }
     *     
     */
    public DeliveryTolerancesType getDeliveryTolerances() {
        return deliveryTolerances;
    }

    /**
     * Sets the value of the deliveryTolerances property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryTolerancesType }
     *     
     */
    public void setDeliveryTolerances(DeliveryTolerancesType value) {
        this.deliveryTolerances = value;
    }

    /**
     * Gets the value of the deliveryTerms property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryTermsType }
     *     
     */
    public DeliveryTermsType getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * Sets the value of the deliveryTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryTermsType }
     *     
     */
    public void setDeliveryTerms(DeliveryTermsType value) {
        this.deliveryTerms = value;
    }

    /**
     * Gets the value of the shipmentMethodOfPaymentCode property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentMethodOfPaymentCodeType }
     *     
     */
    public ShipmentMethodOfPaymentCodeType getShipmentMethodOfPaymentCode() {
        return shipmentMethodOfPaymentCode;
    }

    /**
     * Sets the value of the shipmentMethodOfPaymentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentMethodOfPaymentCodeType }
     *     
     */
    public void setShipmentMethodOfPaymentCode(ShipmentMethodOfPaymentCodeType value) {
        this.shipmentMethodOfPaymentCode = value;
    }

    /**
     * Gets the value of the transportInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportInformationType }
     * 
     * 
     */
    public List<TransportInformationType> getTransportInformation() {
        if (transportInformation == null) {
            transportInformation = new ArrayList<TransportInformationType>();
        }
        return this.transportInformation;
    }

    /**
     * Gets the value of the requestedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedPriceType }
     *     
     */
    public RequestedPriceType getRequestedPrice() {
        return requestedPrice;
    }

    /**
     * Sets the value of the requestedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedPriceType }
     *     
     */
    public void setRequestedPrice(RequestedPriceType value) {
        this.requestedPrice = value;
    }

    /**
     * Gets the value of the paymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Sets the value of the paymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setPaymentTerms(PaymentTermsType value) {
        this.paymentTerms = value;
    }

    /**
     * Gets the value of the taxableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxableFlag() {
        return taxableFlag;
    }

    /**
     * Sets the value of the taxableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxableFlag(String value) {
        this.taxableFlag = value;
    }

    /**
     * Gets the value of the requestedDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedDocumentType }
     * 
     * 
     */
    public List<RequestedDocumentType> getRequestedDocument() {
        if (requestedDocument == null) {
            requestedDocument = new ArrayList<RequestedDocumentType>();
        }
        return this.requestedDocument;
    }

    /**
     * Gets the value of the routing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouting() {
        return routing;
    }

    /**
     * Sets the value of the routing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouting(String value) {
        this.routing = value;
    }

    /**
     * Gets the value of the balanceItemFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceItemFlag() {
        return balanceItemFlag;
    }

    /**
     * Sets the value of the balanceItemFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceItemFlag(String value) {
        this.balanceItemFlag = value;
    }

    /**
     * Gets the value of the dutyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyStatus() {
        return dutyStatus;
    }

    /**
     * Sets the value of the dutyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyStatus(String value) {
        this.dutyStatus = value;
    }

    /**
     * Gets the value of the importLicenseNeededFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportLicenseNeededFlag() {
        return importLicenseNeededFlag;
    }

    /**
     * Sets the value of the importLicenseNeededFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportLicenseNeededFlag(String value) {
        this.importLicenseNeededFlag = value;
    }

    /**
     * Gets the value of the importLicenseAvailableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportLicenseAvailableFlag() {
        return importLicenseAvailableFlag;
    }

    /**
     * Sets the value of the importLicenseAvailableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportLicenseAvailableFlag(String value) {
        this.importLicenseAvailableFlag = value;
    }

    /**
     * Gets the value of the secondWeightFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondWeightFlag() {
        return secondWeightFlag;
    }

    /**
     * Sets the value of the secondWeightFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondWeightFlag(String value) {
        this.secondWeightFlag = value;
    }

    /**
     * Gets the value of the customerRequestedDeliveryHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerRequestedDeliveryHoldFlag() {
        return customerRequestedDeliveryHoldFlag;
    }

    /**
     * Sets the value of the customerRequestedDeliveryHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerRequestedDeliveryHoldFlag(String value) {
        this.customerRequestedDeliveryHoldFlag = value;
    }

    /**
     * Gets the value of the accompanyingSampleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccompanyingSampleIndicator() {
        return accompanyingSampleIndicator;
    }

    /**
     * Sets the value of the accompanyingSampleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccompanyingSampleIndicator(String value) {
        this.accompanyingSampleIndicator = value;
    }

    /**
     * Gets the value of the specialFulfillmentRequestCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialFulfillmentRequestCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialFulfillmentRequestCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialFulfillmentRequestCodeType }
     * 
     * 
     */
    public List<SpecialFulfillmentRequestCodeType> getSpecialFulfillmentRequestCode() {
        if (specialFulfillmentRequestCode == null) {
            specialFulfillmentRequestCode = new ArrayList<SpecialFulfillmentRequestCodeType>();
        }
        return this.specialFulfillmentRequestCode;
    }

    /**
     * Gets the value of the countryOfFinalDestinationCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryOfFinalDestinationCodeType }
     *     
     */
    public CountryOfFinalDestinationCodeType getCountryOfFinalDestinationCode() {
        return countryOfFinalDestinationCode;
    }

    /**
     * Sets the value of the countryOfFinalDestinationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryOfFinalDestinationCodeType }
     *     
     */
    public void setCountryOfFinalDestinationCode(CountryOfFinalDestinationCodeType value) {
        this.countryOfFinalDestinationCode = value;
    }

    /**
     * Gets the value of the deliveryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryGroup() {
        return deliveryGroup;
    }

    /**
     * Sets the value of the deliveryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryGroup(String value) {
        this.deliveryGroup = value;
    }

    /**
     * Gets the value of the specialInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialInstructionsType }
     * 
     * 
     */
    public List<SpecialInstructionsType> getSpecialInstructions() {
        if (specialInstructions == null) {
            specialInstructions = new ArrayList<SpecialInstructionsType>();
        }
        return this.specialInstructions;
    }

}


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
 * <p>Java class for OrderStatusResponseProductLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderStatusResponseProductLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineItemType" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PurchaseOrderLineItemNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReleaseNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductIdentification" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SalesOrderIdentifier" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductQuantity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineOrderStatusCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BatchNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CountryOfOriginCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ScheduleDateTimeInformation" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OtherPartner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentMethodOfPaymentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ConfirmedPrice" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Routing" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CustomerRequestedDeliveryHoldFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipDate" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShippedQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CountryOfFinalDestinationCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryGroup" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProprietaryShipmentTrackingIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ChangesAllowed"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatusResponseProductLineItemType", propOrder = {
    "lineNumber",
    "lineItemType",
    "purchaseOrderLineItemNumber",
    "releaseNumber",
    "productIdentification",
    "referenceInformation",
    "salesOrderIdentifier",
    "productQuantity",
    "packagingQuantity",
    "lineOrderStatusCode",
    "batchNumber",
    "countryOfOriginCode",
    "scheduleDateTimeInformation",
    "otherPartner",
    "deliveryTerms",
    "shipmentMethodOfPaymentCode",
    "transportInformation",
    "confirmedPrice",
    "routing",
    "customerRequestedDeliveryHoldFlag",
    "shipDate",
    "shippedQuantity",
    "countryOfFinalDestinationCode",
    "deliveryGroup",
    "specialInstructions",
    "proprietaryShipmentTrackingIdentifier",
    "changesAllowed"
})
public class OrderStatusResponseProductLineItemType {

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
    @XmlElement(name = "SalesOrderIdentifier")
    protected SalesOrderIdentifierType salesOrderIdentifier;
    @XmlElement(name = "ProductQuantity", required = true)
    protected ProductQuantityType productQuantity;
    @XmlElement(name = "PackagingQuantity")
    protected PackagingQuantityType packagingQuantity;
    @XmlElement(name = "LineOrderStatusCode", required = true)
    protected LineOrderStatusCodeType lineOrderStatusCode;
    @XmlElement(name = "BatchNumber")
    protected List<BatchNumberType> batchNumber;
    @XmlElement(name = "CountryOfOriginCode")
    protected CountryOfOriginCodeType countryOfOriginCode;
    @XmlElement(name = "ScheduleDateTimeInformation", required = true)
    protected List<ScheduleDateTimeInformationType> scheduleDateTimeInformation;
    @XmlElement(name = "OtherPartner")
    protected List<OtherPartnerType> otherPartner;
    @XmlElement(name = "DeliveryTerms")
    protected DeliveryTermsType deliveryTerms;
    @XmlElement(name = "ShipmentMethodOfPaymentCode")
    protected ShipmentMethodOfPaymentCodeType shipmentMethodOfPaymentCode;
    @XmlElement(name = "TransportInformation")
    protected List<TransportInformationType> transportInformation;
    @XmlElement(name = "ConfirmedPrice")
    protected ConfirmedPriceType confirmedPrice;
    @XmlElement(name = "Routing")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String routing;
    @XmlElement(name = "CustomerRequestedDeliveryHoldFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String customerRequestedDeliveryHoldFlag;
    @XmlElement(name = "ShipDate")
    protected ShipDateType shipDate;
    @XmlElement(name = "ShippedQuantity")
    protected ShippedQuantityType shippedQuantity;
    @XmlElement(name = "CountryOfFinalDestinationCode")
    protected CountryOfFinalDestinationCodeType countryOfFinalDestinationCode;
    @XmlElement(name = "DeliveryGroup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deliveryGroup;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "ProprietaryShipmentTrackingIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> proprietaryShipmentTrackingIdentifier;
    @XmlElement(name = "ChangesAllowed", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String changesAllowed;

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
     * Gets the value of the salesOrderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderIdentifierType }
     *     
     */
    public SalesOrderIdentifierType getSalesOrderIdentifier() {
        return salesOrderIdentifier;
    }

    /**
     * Sets the value of the salesOrderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderIdentifierType }
     *     
     */
    public void setSalesOrderIdentifier(SalesOrderIdentifierType value) {
        this.salesOrderIdentifier = value;
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
     * Gets the value of the lineOrderStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link LineOrderStatusCodeType }
     *     
     */
    public LineOrderStatusCodeType getLineOrderStatusCode() {
        return lineOrderStatusCode;
    }

    /**
     * Sets the value of the lineOrderStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineOrderStatusCodeType }
     *     
     */
    public void setLineOrderStatusCode(LineOrderStatusCodeType value) {
        this.lineOrderStatusCode = value;
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
     * Gets the value of the confirmedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmedPriceType }
     *     
     */
    public ConfirmedPriceType getConfirmedPrice() {
        return confirmedPrice;
    }

    /**
     * Sets the value of the confirmedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmedPriceType }
     *     
     */
    public void setConfirmedPrice(ConfirmedPriceType value) {
        this.confirmedPrice = value;
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
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link ShipDateType }
     *     
     */
    public ShipDateType getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipDateType }
     *     
     */
    public void setShipDate(ShipDateType value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the shippedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ShippedQuantityType }
     *     
     */
    public ShippedQuantityType getShippedQuantity() {
        return shippedQuantity;
    }

    /**
     * Sets the value of the shippedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippedQuantityType }
     *     
     */
    public void setShippedQuantity(ShippedQuantityType value) {
        this.shippedQuantity = value;
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

    /**
     * Gets the value of the proprietaryShipmentTrackingIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proprietaryShipmentTrackingIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProprietaryShipmentTrackingIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProprietaryShipmentTrackingIdentifier() {
        if (proprietaryShipmentTrackingIdentifier == null) {
            proprietaryShipmentTrackingIdentifier = new ArrayList<String>();
        }
        return this.proprietaryShipmentTrackingIdentifier;
    }

    /**
     * Gets the value of the changesAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangesAllowed() {
        return changesAllowed;
    }

    /**
     * Sets the value of the changesAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangesAllowed(String value) {
        this.changesAllowed = value;
    }

}

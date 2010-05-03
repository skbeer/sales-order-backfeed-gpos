
package com.monsanto.cidx.header.schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ShipNoticeProductLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipNoticeProductLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EquipmentDetailsLineNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductIdentification" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShippedQuantity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InvoiceQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PurchaseOrderInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CumulativeTotalQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentMethodOfPaymentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentIndicatorCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PercentActive" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryLocation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductSubLineItems" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShippingServiceLevelCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HazmatData" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CustomsInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LadingIdentification" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShelfLifeDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipNoticeProductLineItemType", propOrder = {
    "lineNumber",
    "equipmentDetailsLineNumber",
    "productIdentification",
    "shippedQuantity",
    "invoiceQuantity",
    "purchaseOrderInformation",
    "cumulativeTotalQuantity",
    "shipmentMethodOfPaymentCode",
    "deliveryTerms",
    "referenceInformation",
    "shipmentIndicatorCode",
    "percentActive",
    "specialInstructions",
    "inventoryLocation",
    "productSubLineItems",
    "shippingServiceLevelCode",
    "hazmatData",
    "customsInformation",
    "ladingIdentification",
    "shelfLifeDate"
})
public class ShipNoticeProductLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "EquipmentDetailsLineNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> equipmentDetailsLineNumber;
    @XmlElement(name = "ProductIdentification", required = true)
    protected List<ProductIdentificationType> productIdentification;
    @XmlElement(name = "ShippedQuantity", required = true)
    protected ShippedQuantityType shippedQuantity;
    @XmlElement(name = "InvoiceQuantity")
    protected InvoiceQuantityType invoiceQuantity;
    @XmlElement(name = "PurchaseOrderInformation")
    protected PurchaseOrderInformationType purchaseOrderInformation;
    @XmlElement(name = "CumulativeTotalQuantity")
    protected CumulativeTotalQuantityType cumulativeTotalQuantity;
    @XmlElement(name = "ShipmentMethodOfPaymentCode")
    protected ShipmentMethodOfPaymentCodeType shipmentMethodOfPaymentCode;
    @XmlElement(name = "DeliveryTerms")
    protected DeliveryTermsType deliveryTerms;
    @XmlElement(name = "ReferenceInformation")
    protected List<ReferenceInformationType> referenceInformation;
    @XmlElement(name = "ShipmentIndicatorCode")
    protected ShipmentIndicatorCodeType shipmentIndicatorCode;
    @XmlElement(name = "PercentActive")
    protected BigDecimal percentActive;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "InventoryLocation")
    protected InventoryLocationType inventoryLocation;
    @XmlElement(name = "ProductSubLineItems")
    protected List<ProductSubLineItemsType> productSubLineItems;
    @XmlElement(name = "ShippingServiceLevelCode")
    protected ShippingServiceLevelCodeType shippingServiceLevelCode;
    @XmlElement(name = "HazmatData")
    protected HazmatDataType hazmatData;
    @XmlElement(name = "CustomsInformation")
    protected List<CustomsInformationType> customsInformation;
    @XmlElement(name = "LadingIdentification")
    protected LadingIdentificationType ladingIdentification;
    @XmlElement(name = "ShelfLifeDate")
    protected ShelfLifeDateType shelfLifeDate;

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
     * Gets the value of the equipmentDetailsLineNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentDetailsLineNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentDetailsLineNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEquipmentDetailsLineNumber() {
        if (equipmentDetailsLineNumber == null) {
            equipmentDetailsLineNumber = new ArrayList<String>();
        }
        return this.equipmentDetailsLineNumber;
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
     * Gets the value of the invoiceQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceQuantityType }
     *     
     */
    public InvoiceQuantityType getInvoiceQuantity() {
        return invoiceQuantity;
    }

    /**
     * Sets the value of the invoiceQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceQuantityType }
     *     
     */
    public void setInvoiceQuantity(InvoiceQuantityType value) {
        this.invoiceQuantity = value;
    }

    /**
     * Gets the value of the purchaseOrderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderInformationType }
     *     
     */
    public PurchaseOrderInformationType getPurchaseOrderInformation() {
        return purchaseOrderInformation;
    }

    /**
     * Sets the value of the purchaseOrderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderInformationType }
     *     
     */
    public void setPurchaseOrderInformation(PurchaseOrderInformationType value) {
        this.purchaseOrderInformation = value;
    }

    /**
     * Gets the value of the cumulativeTotalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link CumulativeTotalQuantityType }
     *     
     */
    public CumulativeTotalQuantityType getCumulativeTotalQuantity() {
        return cumulativeTotalQuantity;
    }

    /**
     * Sets the value of the cumulativeTotalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CumulativeTotalQuantityType }
     *     
     */
    public void setCumulativeTotalQuantity(CumulativeTotalQuantityType value) {
        this.cumulativeTotalQuantity = value;
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
     * Gets the value of the shipmentIndicatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentIndicatorCodeType }
     *     
     */
    public ShipmentIndicatorCodeType getShipmentIndicatorCode() {
        return shipmentIndicatorCode;
    }

    /**
     * Sets the value of the shipmentIndicatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentIndicatorCodeType }
     *     
     */
    public void setShipmentIndicatorCode(ShipmentIndicatorCodeType value) {
        this.shipmentIndicatorCode = value;
    }

    /**
     * Gets the value of the percentActive property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentActive() {
        return percentActive;
    }

    /**
     * Sets the value of the percentActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentActive(BigDecimal value) {
        this.percentActive = value;
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
     * Gets the value of the inventoryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryLocationType }
     *     
     */
    public InventoryLocationType getInventoryLocation() {
        return inventoryLocation;
    }

    /**
     * Sets the value of the inventoryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryLocationType }
     *     
     */
    public void setInventoryLocation(InventoryLocationType value) {
        this.inventoryLocation = value;
    }

    /**
     * Gets the value of the productSubLineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSubLineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSubLineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSubLineItemsType }
     * 
     * 
     */
    public List<ProductSubLineItemsType> getProductSubLineItems() {
        if (productSubLineItems == null) {
            productSubLineItems = new ArrayList<ProductSubLineItemsType>();
        }
        return this.productSubLineItems;
    }

    /**
     * Gets the value of the shippingServiceLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingServiceLevelCodeType }
     *     
     */
    public ShippingServiceLevelCodeType getShippingServiceLevelCode() {
        return shippingServiceLevelCode;
    }

    /**
     * Sets the value of the shippingServiceLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceLevelCodeType }
     *     
     */
    public void setShippingServiceLevelCode(ShippingServiceLevelCodeType value) {
        this.shippingServiceLevelCode = value;
    }

    /**
     * Gets the value of the hazmatData property.
     * 
     * @return
     *     possible object is
     *     {@link HazmatDataType }
     *     
     */
    public HazmatDataType getHazmatData() {
        return hazmatData;
    }

    /**
     * Sets the value of the hazmatData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazmatDataType }
     *     
     */
    public void setHazmatData(HazmatDataType value) {
        this.hazmatData = value;
    }

    /**
     * Gets the value of the customsInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customsInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsInformationType }
     * 
     * 
     */
    public List<CustomsInformationType> getCustomsInformation() {
        if (customsInformation == null) {
            customsInformation = new ArrayList<CustomsInformationType>();
        }
        return this.customsInformation;
    }

    /**
     * Gets the value of the ladingIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link LadingIdentificationType }
     *     
     */
    public LadingIdentificationType getLadingIdentification() {
        return ladingIdentification;
    }

    /**
     * Sets the value of the ladingIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LadingIdentificationType }
     *     
     */
    public void setLadingIdentification(LadingIdentificationType value) {
        this.ladingIdentification = value;
    }

    /**
     * Gets the value of the shelfLifeDate property.
     * 
     * @return
     *     possible object is
     *     {@link ShelfLifeDateType }
     *     
     */
    public ShelfLifeDateType getShelfLifeDate() {
        return shelfLifeDate;
    }

    /**
     * Sets the value of the shelfLifeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShelfLifeDateType }
     *     
     */
    public void setShelfLifeDate(ShelfLifeDateType value) {
        this.shelfLifeDate = value;
    }

}

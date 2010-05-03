
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
 * <p>Java class for ReceiptNoticeProductLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiptNoticeProductLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EquipmentDetailsLineNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductIdentification" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShippedQuantity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReceivedQuantity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReceiptCondition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PurchaseOrderInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CumulativeTotalQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentIndicatorCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PercentActive" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryLocation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductSubLineItems" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiptNoticeProductLineItemType", propOrder = {
    "lineNumber",
    "equipmentDetailsLineNumber",
    "productIdentification",
    "shippedQuantity",
    "receivedQuantity",
    "receiptCondition",
    "purchaseOrderInformation",
    "cumulativeTotalQuantity",
    "referenceInformation",
    "shipmentIndicatorCode",
    "percentActive",
    "specialInstructions",
    "inventoryLocation",
    "productSubLineItems"
})
public class ReceiptNoticeProductLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "EquipmentDetailsLineNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> equipmentDetailsLineNumber;
    @XmlElement(name = "ProductIdentification", required = true)
    protected List<ProductIdentificationType> productIdentification;
    @XmlElement(name = "ShippedQuantity", required = true)
    protected ShippedQuantityType shippedQuantity;
    @XmlElement(name = "ReceivedQuantity", required = true)
    protected ReceivedQuantityType receivedQuantity;
    @XmlElement(name = "ReceiptCondition")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> receiptCondition;
    @XmlElement(name = "PurchaseOrderInformation")
    protected PurchaseOrderInformationType purchaseOrderInformation;
    @XmlElement(name = "CumulativeTotalQuantity")
    protected CumulativeTotalQuantityType cumulativeTotalQuantity;
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
     * Gets the value of the receivedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedQuantityType }
     *     
     */
    public ReceivedQuantityType getReceivedQuantity() {
        return receivedQuantity;
    }

    /**
     * Sets the value of the receivedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedQuantityType }
     *     
     */
    public void setReceivedQuantity(ReceivedQuantityType value) {
        this.receivedQuantity = value;
    }

    /**
     * Gets the value of the receiptCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiptCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiptCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReceiptCondition() {
        if (receiptCondition == null) {
            receiptCondition = new ArrayList<String>();
        }
        return this.receiptCondition;
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

}

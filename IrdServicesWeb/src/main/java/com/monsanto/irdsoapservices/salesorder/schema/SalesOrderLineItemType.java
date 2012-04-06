
package com.monsanto.irdsoapservices.salesorder.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesOrderLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="ProductIdentification" type="{urn:ecms:schema:salesorderreport:response:1:0}ProductidentificationType" maxOccurs="unbounded"/>
 *         &lt;element name="ProductQuantity" type="{urn:ecms:schema:salesorderreport:response:1:0}ProductQuantityType" minOccurs="0"/>
 *         &lt;element name="ProductQuantityEquivalent" type="{urn:ecms:schema:salesorderreport:response:1:0}ProductQuantityEquivalentType" minOccurs="0"/>
 *         &lt;element name="ShippedQuantity" type="{urn:ecms:schema:salesorderreport:response:1:0}ShippedQuantityType" minOccurs="0"/>
 *         &lt;element name="ShippedQuantityEquivalent" type="{urn:ecms:schema:salesorderreport:response:1:0}ShippedQuantityEquivalentType" minOccurs="0"/>
 *         &lt;element name="SalesPerson" type="{urn:ecms:schema:salesorderreport:response:1:0}SalesPersonType" minOccurs="0"/>
 *         &lt;element name="RejectReason" type="{urn:ecms:schema:salesorderreport:response:1:0}RejectReasonType" minOccurs="0"/>
 *         &lt;element name="PendingQuantity" type="{urn:ecms:schema:salesorderreport:response:1:0}PendingQuantityType" minOccurs="0"/>
 *         &lt;element name="PendingQuantityEquivalent" type="{urn:ecms:schema:salesorderreport:response:1:0}PendingQuantityEquivalentType" minOccurs="0"/>
 *         &lt;element name="DeliveredQuantity" type="{urn:ecms:schema:salesorderreport:response:1:0}DeliveryQuantityType" minOccurs="0"/>
 *         &lt;element name="DeliveredQuantityEquivalent" type="{urn:ecms:schema:salesorderreport:response:1:0}DeliveryQuantityEquivalentType" minOccurs="0"/>
 *         &lt;element name="OrderDate" type="{urn:ecms:schema:salesorderreport:response:1:0}OrderDateType" minOccurs="0"/>
 *         &lt;element name="ChangeDate" type="{urn:ecms:schema:salesorderreport:response:1:0}ChangeDateType" minOccurs="0"/>
 *         &lt;element name="OrderTransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseOrderQuantity" type="{urn:ecms:schema:salesorderreport:response:1:0}BaseOrderQuantityType" minOccurs="0"/>
 *         &lt;element name="BaseOrderQuantityEquivalent" type="{urn:ecms:schema:salesorderreport:response:1:0}BaseOrderQuantityEquivalentType" minOccurs="0"/>
 *         &lt;element name="PrepositionOrderQuantity" type="{urn:ecms:schema:salesorderreport:response:1:0}PrepositionOrderQuantityType" minOccurs="0"/>
 *         &lt;element name="PrepositionOrderQuantityEquivalent" type="{urn:ecms:schema:salesorderreport:response:1:0}PrepositionOrderQuantityEquivalentType" minOccurs="0"/>
 *         &lt;element name="DirectShipmentsQuantity" type="{urn:ecms:schema:salesorderreport:response:1:0}DirectShipmentsQuantityType" minOccurs="0"/>
 *         &lt;element name="DirectShipmentsQuantityEquivalent" type="{urn:ecms:schema:salesorderreport:response:1:0}DirectShipmentsQuantityEquivalentType" minOccurs="0"/>
 *         &lt;element name="TransfersInQuantity" type="{urn:ecms:schema:salesorderreport:response:1:0}TransfersInQuantityType" minOccurs="0"/>
 *         &lt;element name="TransfersInQuantityEquivalent" type="{urn:ecms:schema:salesorderreport:response:1:0}TransfersInQuantityEquivalentType" minOccurs="0"/>
 *         &lt;element name="TransfersOutQuantity" type="{urn:ecms:schema:salesorderreport:response:1:0}TransfersOutQuantityType" minOccurs="0"/>
 *         &lt;element name="TransfersOutQuantityEquivalent" type="{urn:ecms:schema:salesorderreport:response:1:0}TransfersOutQuantityEquivalentType" minOccurs="0"/>
 *         &lt;element name="ReturnsQuantity" type="{urn:ecms:schema:salesorderreport:response:1:0}ReturnsQuantityType" minOccurs="0"/>
 *         &lt;element name="ReturnsQuantityEquivalent" type="{urn:ecms:schema:salesorderreport:response:1:0}ReturnsQuantityEquivalentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderLineItemType", propOrder = {
    "lineNumber",
    "productIdentification",
    "productQuantity",
    "productQuantityEquivalent",
    "shippedQuantity",
    "shippedQuantityEquivalent",
    "salesPerson",
    "rejectReason",
    "pendingQuantity",
    "pendingQuantityEquivalent",
    "deliveredQuantity",
    "deliveredQuantityEquivalent",
    "orderDate",
    "changeDate",
    "orderTransactionType",
    "baseOrderQuantity",
    "baseOrderQuantityEquivalent",
    "prepositionOrderQuantity",
    "prepositionOrderQuantityEquivalent",
    "directShipmentsQuantity",
    "directShipmentsQuantityEquivalent",
    "transfersInQuantity",
    "transfersInQuantityEquivalent",
    "transfersOutQuantity",
    "transfersOutQuantityEquivalent",
    "returnsQuantity",
    "returnsQuantityEquivalent"
})
public class SalesOrderLineItemType {

    @XmlElement(name = "LineNumber")
    @XmlSchemaType(name = "unsignedInt")
    protected long lineNumber;
    @XmlElement(name = "ProductIdentification", required = true)
    protected List<ProductidentificationType> productIdentification;
    @XmlElement(name = "ProductQuantity")
    protected ProductQuantityType productQuantity;
    @XmlElement(name = "ProductQuantityEquivalent")
    protected ProductQuantityEquivalentType productQuantityEquivalent;
    @XmlElement(name = "ShippedQuantity")
    protected ShippedQuantityType shippedQuantity;
    @XmlElement(name = "ShippedQuantityEquivalent")
    protected ShippedQuantityEquivalentType shippedQuantityEquivalent;
    @XmlElement(name = "SalesPerson")
    protected SalesPersonType salesPerson;
    @XmlElement(name = "RejectReason")
    protected RejectReasonType rejectReason;
    @XmlElement(name = "PendingQuantity")
    protected PendingQuantityType pendingQuantity;
    @XmlElement(name = "PendingQuantityEquivalent")
    protected PendingQuantityEquivalentType pendingQuantityEquivalent;
    @XmlElement(name = "DeliveredQuantity")
    protected DeliveryQuantityType deliveredQuantity;
    @XmlElement(name = "DeliveredQuantityEquivalent")
    protected DeliveryQuantityEquivalentType deliveredQuantityEquivalent;
    @XmlElement(name = "OrderDate")
    protected OrderDateType orderDate;
    @XmlElement(name = "ChangeDate")
    protected ChangeDateType changeDate;
    @XmlElement(name = "OrderTransactionType")
    protected String orderTransactionType;
    @XmlElement(name = "BaseOrderQuantity")
    protected BaseOrderQuantityType baseOrderQuantity;
    @XmlElement(name = "BaseOrderQuantityEquivalent")
    protected BaseOrderQuantityEquivalentType baseOrderQuantityEquivalent;
    @XmlElement(name = "PrepositionOrderQuantity")
    protected PrepositionOrderQuantityType prepositionOrderQuantity;
    @XmlElement(name = "PrepositionOrderQuantityEquivalent")
    protected PrepositionOrderQuantityEquivalentType prepositionOrderQuantityEquivalent;
    @XmlElement(name = "DirectShipmentsQuantity")
    protected DirectShipmentsQuantityType directShipmentsQuantity;
    @XmlElement(name = "DirectShipmentsQuantityEquivalent")
    protected DirectShipmentsQuantityEquivalentType directShipmentsQuantityEquivalent;
    @XmlElement(name = "TransfersInQuantity")
    protected TransfersInQuantityType transfersInQuantity;
    @XmlElement(name = "TransfersInQuantityEquivalent")
    protected TransfersInQuantityEquivalentType transfersInQuantityEquivalent;
    @XmlElement(name = "TransfersOutQuantity")
    protected TransfersOutQuantityType transfersOutQuantity;
    @XmlElement(name = "TransfersOutQuantityEquivalent")
    protected TransfersOutQuantityEquivalentType transfersOutQuantityEquivalent;
    @XmlElement(name = "ReturnsQuantity")
    protected ReturnsQuantityType returnsQuantity;
    @XmlElement(name = "ReturnsQuantityEquivalent")
    protected ReturnsQuantityEquivalentType returnsQuantityEquivalent;

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
     * {@link ProductidentificationType }
     * 
     * 
     */
    public List<ProductidentificationType> getProductIdentification() {
        if (productIdentification == null) {
            productIdentification = new ArrayList<ProductidentificationType>();
        }
        return this.productIdentification;
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
     * Gets the value of the productQuantityEquivalent property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantityEquivalentType }
     *     
     */
    public ProductQuantityEquivalentType getProductQuantityEquivalent() {
        return productQuantityEquivalent;
    }

    /**
     * Sets the value of the productQuantityEquivalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantityEquivalentType }
     *     
     */
    public void setProductQuantityEquivalent(ProductQuantityEquivalentType value) {
        this.productQuantityEquivalent = value;
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
     * Gets the value of the shippedQuantityEquivalent property.
     * 
     * @return
     *     possible object is
     *     {@link ShippedQuantityEquivalentType }
     *     
     */
    public ShippedQuantityEquivalentType getShippedQuantityEquivalent() {
        return shippedQuantityEquivalent;
    }

    /**
     * Sets the value of the shippedQuantityEquivalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippedQuantityEquivalentType }
     *     
     */
    public void setShippedQuantityEquivalent(ShippedQuantityEquivalentType value) {
        this.shippedQuantityEquivalent = value;
    }

    /**
     * Gets the value of the salesPerson property.
     * 
     * @return
     *     possible object is
     *     {@link SalesPersonType }
     *     
     */
    public SalesPersonType getSalesPerson() {
        return salesPerson;
    }

    /**
     * Sets the value of the salesPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesPersonType }
     *     
     */
    public void setSalesPerson(SalesPersonType value) {
        this.salesPerson = value;
    }

    /**
     * Gets the value of the rejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link RejectReasonType }
     *     
     */
    public RejectReasonType getRejectReason() {
        return rejectReason;
    }

    /**
     * Sets the value of the rejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectReasonType }
     *     
     */
    public void setRejectReason(RejectReasonType value) {
        this.rejectReason = value;
    }

    /**
     * Gets the value of the pendingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PendingQuantityType }
     *     
     */
    public PendingQuantityType getPendingQuantity() {
        return pendingQuantity;
    }

    /**
     * Sets the value of the pendingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingQuantityType }
     *     
     */
    public void setPendingQuantity(PendingQuantityType value) {
        this.pendingQuantity = value;
    }

    /**
     * Gets the value of the pendingQuantityEquivalent property.
     * 
     * @return
     *     possible object is
     *     {@link PendingQuantityEquivalentType }
     *     
     */
    public PendingQuantityEquivalentType getPendingQuantityEquivalent() {
        return pendingQuantityEquivalent;
    }

    /**
     * Sets the value of the pendingQuantityEquivalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingQuantityEquivalentType }
     *     
     */
    public void setPendingQuantityEquivalent(PendingQuantityEquivalentType value) {
        this.pendingQuantityEquivalent = value;
    }

    /**
     * Gets the value of the deliveredQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryQuantityType }
     *     
     */
    public DeliveryQuantityType getDeliveredQuantity() {
        return deliveredQuantity;
    }

    /**
     * Sets the value of the deliveredQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryQuantityType }
     *     
     */
    public void setDeliveredQuantity(DeliveryQuantityType value) {
        this.deliveredQuantity = value;
    }

    /**
     * Gets the value of the deliveredQuantityEquivalent property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryQuantityEquivalentType }
     *     
     */
    public DeliveryQuantityEquivalentType getDeliveredQuantityEquivalent() {
        return deliveredQuantityEquivalent;
    }

    /**
     * Sets the value of the deliveredQuantityEquivalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryQuantityEquivalentType }
     *     
     */
    public void setDeliveredQuantityEquivalent(DeliveryQuantityEquivalentType value) {
        this.deliveredQuantityEquivalent = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDateType }
     *     
     */
    public OrderDateType getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDateType }
     *     
     */
    public void setOrderDate(OrderDateType value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the changeDate property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeDateType }
     *     
     */
    public ChangeDateType getChangeDate() {
        return changeDate;
    }

    /**
     * Sets the value of the changeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeDateType }
     *     
     */
    public void setChangeDate(ChangeDateType value) {
        this.changeDate = value;
    }

    /**
     * Gets the value of the orderTransactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderTransactionType() {
        return orderTransactionType;
    }

    /**
     * Sets the value of the orderTransactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderTransactionType(String value) {
        this.orderTransactionType = value;
    }

    /**
     * Gets the value of the baseOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BaseOrderQuantityType }
     *     
     */
    public BaseOrderQuantityType getBaseOrderQuantity() {
        return baseOrderQuantity;
    }

    /**
     * Sets the value of the baseOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseOrderQuantityType }
     *     
     */
    public void setBaseOrderQuantity(BaseOrderQuantityType value) {
        this.baseOrderQuantity = value;
    }

    /**
     * Gets the value of the baseOrderQuantityEquivalent property.
     * 
     * @return
     *     possible object is
     *     {@link BaseOrderQuantityEquivalentType }
     *     
     */
    public BaseOrderQuantityEquivalentType getBaseOrderQuantityEquivalent() {
        return baseOrderQuantityEquivalent;
    }

    /**
     * Sets the value of the baseOrderQuantityEquivalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseOrderQuantityEquivalentType }
     *     
     */
    public void setBaseOrderQuantityEquivalent(BaseOrderQuantityEquivalentType value) {
        this.baseOrderQuantityEquivalent = value;
    }

    /**
     * Gets the value of the prepositionOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PrepositionOrderQuantityType }
     *     
     */
    public PrepositionOrderQuantityType getPrepositionOrderQuantity() {
        return prepositionOrderQuantity;
    }

    /**
     * Sets the value of the prepositionOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepositionOrderQuantityType }
     *     
     */
    public void setPrepositionOrderQuantity(PrepositionOrderQuantityType value) {
        this.prepositionOrderQuantity = value;
    }

    /**
     * Gets the value of the prepositionOrderQuantityEquivalent property.
     * 
     * @return
     *     possible object is
     *     {@link PrepositionOrderQuantityEquivalentType }
     *     
     */
    public PrepositionOrderQuantityEquivalentType getPrepositionOrderQuantityEquivalent() {
        return prepositionOrderQuantityEquivalent;
    }

    /**
     * Sets the value of the prepositionOrderQuantityEquivalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepositionOrderQuantityEquivalentType }
     *     
     */
    public void setPrepositionOrderQuantityEquivalent(PrepositionOrderQuantityEquivalentType value) {
        this.prepositionOrderQuantityEquivalent = value;
    }

    /**
     * Gets the value of the directShipmentsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link DirectShipmentsQuantityType }
     *     
     */
    public DirectShipmentsQuantityType getDirectShipmentsQuantity() {
        return directShipmentsQuantity;
    }

    /**
     * Sets the value of the directShipmentsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectShipmentsQuantityType }
     *     
     */
    public void setDirectShipmentsQuantity(DirectShipmentsQuantityType value) {
        this.directShipmentsQuantity = value;
    }

    /**
     * Gets the value of the directShipmentsQuantityEquivalent property.
     * 
     * @return
     *     possible object is
     *     {@link DirectShipmentsQuantityEquivalentType }
     *     
     */
    public DirectShipmentsQuantityEquivalentType getDirectShipmentsQuantityEquivalent() {
        return directShipmentsQuantityEquivalent;
    }

    /**
     * Sets the value of the directShipmentsQuantityEquivalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectShipmentsQuantityEquivalentType }
     *     
     */
    public void setDirectShipmentsQuantityEquivalent(DirectShipmentsQuantityEquivalentType value) {
        this.directShipmentsQuantityEquivalent = value;
    }

    /**
     * Gets the value of the transfersInQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link TransfersInQuantityType }
     *     
     */
    public TransfersInQuantityType getTransfersInQuantity() {
        return transfersInQuantity;
    }

    /**
     * Sets the value of the transfersInQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransfersInQuantityType }
     *     
     */
    public void setTransfersInQuantity(TransfersInQuantityType value) {
        this.transfersInQuantity = value;
    }

    /**
     * Gets the value of the transfersInQuantityEquivalent property.
     * 
     * @return
     *     possible object is
     *     {@link TransfersInQuantityEquivalentType }
     *     
     */
    public TransfersInQuantityEquivalentType getTransfersInQuantityEquivalent() {
        return transfersInQuantityEquivalent;
    }

    /**
     * Sets the value of the transfersInQuantityEquivalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransfersInQuantityEquivalentType }
     *     
     */
    public void setTransfersInQuantityEquivalent(TransfersInQuantityEquivalentType value) {
        this.transfersInQuantityEquivalent = value;
    }

    /**
     * Gets the value of the transfersOutQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link TransfersOutQuantityType }
     *     
     */
    public TransfersOutQuantityType getTransfersOutQuantity() {
        return transfersOutQuantity;
    }

    /**
     * Sets the value of the transfersOutQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransfersOutQuantityType }
     *     
     */
    public void setTransfersOutQuantity(TransfersOutQuantityType value) {
        this.transfersOutQuantity = value;
    }

    /**
     * Gets the value of the transfersOutQuantityEquivalent property.
     * 
     * @return
     *     possible object is
     *     {@link TransfersOutQuantityEquivalentType }
     *     
     */
    public TransfersOutQuantityEquivalentType getTransfersOutQuantityEquivalent() {
        return transfersOutQuantityEquivalent;
    }

    /**
     * Sets the value of the transfersOutQuantityEquivalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransfersOutQuantityEquivalentType }
     *     
     */
    public void setTransfersOutQuantityEquivalent(TransfersOutQuantityEquivalentType value) {
        this.transfersOutQuantityEquivalent = value;
    }

    /**
     * Gets the value of the returnsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnsQuantityType }
     *     
     */
    public ReturnsQuantityType getReturnsQuantity() {
        return returnsQuantity;
    }

    /**
     * Sets the value of the returnsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnsQuantityType }
     *     
     */
    public void setReturnsQuantity(ReturnsQuantityType value) {
        this.returnsQuantity = value;
    }

    /**
     * Gets the value of the returnsQuantityEquivalent property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnsQuantityEquivalentType }
     *     
     */
    public ReturnsQuantityEquivalentType getReturnsQuantityEquivalent() {
        return returnsQuantityEquivalent;
    }

    /**
     * Sets the value of the returnsQuantityEquivalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnsQuantityEquivalentType }
     *     
     */
    public void setReturnsQuantityEquivalent(ReturnsQuantityEquivalentType value) {
        this.returnsQuantityEquivalent = value;
    }

}

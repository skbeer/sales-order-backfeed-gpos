
package com.monsanto.irdsoapservices.salesorder.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="ProductQuantity" type="{urn:ecms:schema:salesorderreport:response:1:0}ProductQuantityType "/>
 *         &lt;element name="ProductQuantityEquivalent" type="{urn:ecms:schema:salesorderreport:response:1:0}ProductQuantityEquivalentType" minOccurs="0"/>
 *         &lt;element name="ShippedQuantity" type="{urn:ecms:schema:salesorderreport:response:1:0}ShippedQuantityType" minOccurs="0"/>
 *         &lt;element name="ShippedQuantityEquivalent" type="{urn:ecms:schema:salesorderreport:response:1:0}ShippedQuantityEquivalentType" minOccurs="0"/>
 *         &lt;element name="SalesPerson" type="{urn:ecms:schema:salesorderreport:response:1:0}SalesPersonType" minOccurs="0"/>
 *         &lt;element name="RejectReason" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RejectReason" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *                   &lt;element name="RejectReasonDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PendingQuantity" type="{urn:ecms:schema:salesorderreport:response:1:0}PendingQuantityType" minOccurs="0"/>
 *         &lt;element name="PendingQuantityEquivalent" type="{urn:ecms:schema:salesorderreport:response:1:0}PendingQuantityEquivalentType" minOccurs="0"/>
 *         &lt;element name="DeliveredQuantity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{urn:ecms:schema:salesorderreport:response:1:0}Measurement"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DeliveredQuantityEquivalent" type="{urn:ecms:schema:salesorderreport:response:1:0}DeliveryQuantityEquivalentType" minOccurs="0"/>
 *         &lt;element name="OrderDate" type="{urn:ecms:schema:salesorderreport:response:1:0}OrderDateType" minOccurs="0"/>
 *         &lt;element name="ChangeDate" type="{urn:ecms:schema:salesorderreport:response:1:0}ChangeDateType" minOccurs="0"/>
 *         &lt;element name="OrderTransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "orderTransactionType"
})
public class SalesOrderLineItemType {

    @XmlElement(name = "LineNumber")
    @XmlSchemaType(name = "unsignedInt")
    protected long lineNumber;
    @XmlElement(name = "ProductIdentification", required = true)
    protected List<ProductidentificationType> productIdentification;
    @XmlElement(name = "ProductQuantity", required = true)
    protected ProductQuantityType_0020 productQuantity;
    @XmlElement(name = "ProductQuantityEquivalent")
    protected ProductQuantityEquivalentType productQuantityEquivalent;
    @XmlElement(name = "ShippedQuantity")
    protected ShippedQuantityType shippedQuantity;
    @XmlElement(name = "ShippedQuantityEquivalent")
    protected ShippedQuantityEquivalentType shippedQuantityEquivalent;
    @XmlElement(name = "SalesPerson")
    protected SalesPersonType salesPerson;
    @XmlElement(name = "RejectReason")
    protected SalesOrderLineItemType.RejectReason rejectReason;
    @XmlElement(name = "PendingQuantity")
    protected PendingQuantityType pendingQuantity;
    @XmlElement(name = "PendingQuantityEquivalent")
    protected PendingQuantityEquivalentType pendingQuantityEquivalent;
    @XmlElement(name = "DeliveredQuantity")
    protected SalesOrderLineItemType.DeliveredQuantity deliveredQuantity;
    @XmlElement(name = "DeliveredQuantityEquivalent")
    protected DeliveryQuantityEquivalentType deliveredQuantityEquivalent;
    @XmlElement(name = "OrderDate")
    protected OrderDateType orderDate;
    @XmlElement(name = "ChangeDate")
    protected ChangeDateType changeDate;
    @XmlElement(name = "OrderTransactionType")
    protected String orderTransactionType;

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
     *     {@link ProductQuantityType_0020 }
     *     
     */
    public ProductQuantityType_0020 getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantityType_0020 }
     *     
     */
    public void setProductQuantity(ProductQuantityType_0020 value) {
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
     *     {@link SalesOrderLineItemType.RejectReason }
     *     
     */
    public SalesOrderLineItemType.RejectReason getRejectReason() {
        return rejectReason;
    }

    /**
     * Sets the value of the rejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderLineItemType.RejectReason }
     *     
     */
    public void setRejectReason(SalesOrderLineItemType.RejectReason value) {
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
     *     {@link SalesOrderLineItemType.DeliveredQuantity }
     *     
     */
    public SalesOrderLineItemType.DeliveredQuantity getDeliveredQuantity() {
        return deliveredQuantity;
    }

    /**
     * Sets the value of the deliveredQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderLineItemType.DeliveredQuantity }
     *     
     */
    public void setDeliveredQuantity(SalesOrderLineItemType.DeliveredQuantity value) {
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{urn:ecms:schema:salesorderreport:response:1:0}Measurement"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "measurement"
    })
    public static class DeliveredQuantity {

        @XmlElement(name = "Measurement", required = true)
        protected MeasurementType measurement;

        /**
         * Gets the value of the measurement property.
         * 
         * @return
         *     possible object is
         *     {@link MeasurementType }
         *     
         */
        public MeasurementType getMeasurement() {
            return measurement;
        }

        /**
         * Sets the value of the measurement property.
         * 
         * @param value
         *     allowed object is
         *     {@link MeasurementType }
         *     
         */
        public void setMeasurement(MeasurementType value) {
            this.measurement = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RejectReason" type="{http://www.w3.org/2001/XMLSchema}token"/>
     *         &lt;element name="RejectReasonDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rejectReason",
        "rejectReasonDescription"
    })
    public static class RejectReason {

        @XmlElement(name = "RejectReason", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String rejectReason;
        @XmlElement(name = "RejectReasonDescription", required = true)
        protected String rejectReasonDescription;

        /**
         * Gets the value of the rejectReason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRejectReason() {
            return rejectReason;
        }

        /**
         * Sets the value of the rejectReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRejectReason(String value) {
            this.rejectReason = value;
        }

        /**
         * Gets the value of the rejectReasonDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRejectReasonDescription() {
            return rejectReasonDescription;
        }

        /**
         * Sets the value of the rejectReasonDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRejectReasonDescription(String value) {
            this.rejectReasonDescription = value;
        }

    }

}

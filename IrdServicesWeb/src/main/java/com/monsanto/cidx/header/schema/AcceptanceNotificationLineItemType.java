
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AcceptanceNotificationLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcceptanceNotificationLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReceivingCondition"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AcceptanceNotificationLocation"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryProduct"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}StorageTankIdentifier" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderedProductQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShippedQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReceiptSummary"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PayableQuantity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Pricing" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxableFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineItemTotal" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineItemTaxableTotal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptanceNotificationLineItemType", propOrder = {
    "lineNumber",
    "receivingCondition",
    "acceptanceNotificationLocation",
    "deliveryProduct",
    "storageTankIdentifier",
    "orderedProductQuantity",
    "shippedQuantity",
    "receiptSummary",
    "payableQuantity",
    "pricing",
    "taxableFlag",
    "lineItemTotal",
    "paymentTerms",
    "specialInstructions",
    "lineItemTaxableTotal"
})
public class AcceptanceNotificationLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "ReceivingCondition", required = true)
    protected ReceivingConditionType receivingCondition;
    @XmlElement(name = "AcceptanceNotificationLocation", required = true)
    protected AcceptanceNotificationLocationType acceptanceNotificationLocation;
    @XmlElement(name = "DeliveryProduct", required = true)
    protected DeliveryProductType deliveryProduct;
    @XmlElement(name = "StorageTankIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String storageTankIdentifier;
    @XmlElement(name = "OrderedProductQuantity")
    protected OrderedProductQuantityType orderedProductQuantity;
    @XmlElement(name = "ShippedQuantity")
    protected ShippedQuantityType shippedQuantity;
    @XmlElement(name = "ReceiptSummary", required = true)
    protected ReceiptSummaryType receiptSummary;
    @XmlElement(name = "PayableQuantity", required = true)
    protected PayableQuantityType payableQuantity;
    @XmlElement(name = "Pricing", required = true)
    protected List<PricingType> pricing;
    @XmlElement(name = "TaxableFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String taxableFlag;
    @XmlElement(name = "LineItemTotal")
    protected LineItemTotalType lineItemTotal;
    @XmlElement(name = "PaymentTerms")
    protected PaymentTermsType paymentTerms;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "LineItemTaxableTotal")
    protected LineItemTaxableTotalType lineItemTaxableTotal;

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
     * Gets the value of the receivingCondition property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingConditionType }
     *     
     */
    public ReceivingConditionType getReceivingCondition() {
        return receivingCondition;
    }

    /**
     * Sets the value of the receivingCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingConditionType }
     *     
     */
    public void setReceivingCondition(ReceivingConditionType value) {
        this.receivingCondition = value;
    }

    /**
     * Gets the value of the acceptanceNotificationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptanceNotificationLocationType }
     *     
     */
    public AcceptanceNotificationLocationType getAcceptanceNotificationLocation() {
        return acceptanceNotificationLocation;
    }

    /**
     * Sets the value of the acceptanceNotificationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptanceNotificationLocationType }
     *     
     */
    public void setAcceptanceNotificationLocation(AcceptanceNotificationLocationType value) {
        this.acceptanceNotificationLocation = value;
    }

    /**
     * Gets the value of the deliveryProduct property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryProductType }
     *     
     */
    public DeliveryProductType getDeliveryProduct() {
        return deliveryProduct;
    }

    /**
     * Sets the value of the deliveryProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryProductType }
     *     
     */
    public void setDeliveryProduct(DeliveryProductType value) {
        this.deliveryProduct = value;
    }

    /**
     * Gets the value of the storageTankIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageTankIdentifier() {
        return storageTankIdentifier;
    }

    /**
     * Sets the value of the storageTankIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageTankIdentifier(String value) {
        this.storageTankIdentifier = value;
    }

    /**
     * Gets the value of the orderedProductQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link OrderedProductQuantityType }
     *     
     */
    public OrderedProductQuantityType getOrderedProductQuantity() {
        return orderedProductQuantity;
    }

    /**
     * Sets the value of the orderedProductQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderedProductQuantityType }
     *     
     */
    public void setOrderedProductQuantity(OrderedProductQuantityType value) {
        this.orderedProductQuantity = value;
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
     * Gets the value of the receiptSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptSummaryType }
     *     
     */
    public ReceiptSummaryType getReceiptSummary() {
        return receiptSummary;
    }

    /**
     * Sets the value of the receiptSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptSummaryType }
     *     
     */
    public void setReceiptSummary(ReceiptSummaryType value) {
        this.receiptSummary = value;
    }

    /**
     * Gets the value of the payableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PayableQuantityType }
     *     
     */
    public PayableQuantityType getPayableQuantity() {
        return payableQuantity;
    }

    /**
     * Sets the value of the payableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayableQuantityType }
     *     
     */
    public void setPayableQuantity(PayableQuantityType value) {
        this.payableQuantity = value;
    }

    /**
     * Gets the value of the pricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingType }
     * 
     * 
     */
    public List<PricingType> getPricing() {
        if (pricing == null) {
            pricing = new ArrayList<PricingType>();
        }
        return this.pricing;
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
     * Gets the value of the lineItemTotal property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemTotalType }
     *     
     */
    public LineItemTotalType getLineItemTotal() {
        return lineItemTotal;
    }

    /**
     * Sets the value of the lineItemTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemTotalType }
     *     
     */
    public void setLineItemTotal(LineItemTotalType value) {
        this.lineItemTotal = value;
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
     * Gets the value of the lineItemTaxableTotal property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemTaxableTotalType }
     *     
     */
    public LineItemTaxableTotalType getLineItemTaxableTotal() {
        return lineItemTaxableTotal;
    }

    /**
     * Sets the value of the lineItemTaxableTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemTaxableTotalType }
     *     
     */
    public void setLineItemTaxableTotal(LineItemTaxableTotalType value) {
        this.lineItemTaxableTotal = value;
    }

}

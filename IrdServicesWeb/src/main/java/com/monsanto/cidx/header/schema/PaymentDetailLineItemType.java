
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
 * <p>Java class for PaymentDetailLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BuyerTransactionNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReconciliationNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InvoiceType" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineItemDebitCreditIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductIdentification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductQuantity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Pricing"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PurchaseOrderNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxableFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentMethodOfPaymentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}FreightIncludedFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Shipping" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Adjustment" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DiscountAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineItemTotal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailLineItemType", propOrder = {
    "lineNumber",
    "buyerTransactionNumber",
    "reconciliationNumber",
    "invoiceType",
    "lineItemDebitCreditIndicator",
    "productIdentification",
    "productQuantity",
    "pricing",
    "purchaseOrderNumber",
    "taxableFlag",
    "deliveryTerms",
    "shipmentMethodOfPaymentCode",
    "freightIncludedFlag",
    "shipping",
    "adjustment",
    "discountAmount",
    "lineItemTotal"
})
public class PaymentDetailLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "BuyerTransactionNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String buyerTransactionNumber;
    @XmlElement(name = "ReconciliationNumber", required = true)
    protected ReconciliationNumberType reconciliationNumber;
    @XmlElement(name = "InvoiceType")
    protected InvoiceTypeType invoiceType;
    @XmlElement(name = "LineItemDebitCreditIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lineItemDebitCreditIndicator;
    @XmlElement(name = "ProductIdentification")
    protected List<ProductIdentificationType> productIdentification;
    @XmlElement(name = "ProductQuantity", required = true)
    protected ProductQuantityType productQuantity;
    @XmlElement(name = "Pricing", required = true)
    protected PricingType pricing;
    @XmlElement(name = "PurchaseOrderNumber")
    protected PurchaseOrderNumberType purchaseOrderNumber;
    @XmlElement(name = "TaxableFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String taxableFlag;
    @XmlElement(name = "DeliveryTerms")
    protected DeliveryTermsType deliveryTerms;
    @XmlElement(name = "ShipmentMethodOfPaymentCode")
    protected ShipmentMethodOfPaymentCodeType shipmentMethodOfPaymentCode;
    @XmlElement(name = "FreightIncludedFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String freightIncludedFlag;
    @XmlElement(name = "Shipping")
    protected ShippingType shipping;
    @XmlElement(name = "Adjustment")
    protected AdjustmentType adjustment;
    @XmlElement(name = "DiscountAmount")
    protected DiscountAmountType discountAmount;
    @XmlElement(name = "LineItemTotal", required = true)
    protected LineItemTotalType lineItemTotal;

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
     * Gets the value of the buyerTransactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerTransactionNumber() {
        return buyerTransactionNumber;
    }

    /**
     * Sets the value of the buyerTransactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerTransactionNumber(String value) {
        this.buyerTransactionNumber = value;
    }

    /**
     * Gets the value of the reconciliationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationNumberType }
     *     
     */
    public ReconciliationNumberType getReconciliationNumber() {
        return reconciliationNumber;
    }

    /**
     * Sets the value of the reconciliationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationNumberType }
     *     
     */
    public void setReconciliationNumber(ReconciliationNumberType value) {
        this.reconciliationNumber = value;
    }

    /**
     * Gets the value of the invoiceType property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTypeType }
     *     
     */
    public InvoiceTypeType getInvoiceType() {
        return invoiceType;
    }

    /**
     * Sets the value of the invoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTypeType }
     *     
     */
    public void setInvoiceType(InvoiceTypeType value) {
        this.invoiceType = value;
    }

    /**
     * Gets the value of the lineItemDebitCreditIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItemDebitCreditIndicator() {
        return lineItemDebitCreditIndicator;
    }

    /**
     * Sets the value of the lineItemDebitCreditIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItemDebitCreditIndicator(String value) {
        this.lineItemDebitCreditIndicator = value;
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
     * Gets the value of the pricing property.
     * 
     * @return
     *     possible object is
     *     {@link PricingType }
     *     
     */
    public PricingType getPricing() {
        return pricing;
    }

    /**
     * Sets the value of the pricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingType }
     *     
     */
    public void setPricing(PricingType value) {
        this.pricing = value;
    }

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderNumberType }
     *     
     */
    public PurchaseOrderNumberType getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Sets the value of the purchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderNumberType }
     *     
     */
    public void setPurchaseOrderNumber(PurchaseOrderNumberType value) {
        this.purchaseOrderNumber = value;
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
     * Gets the value of the freightIncludedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightIncludedFlag() {
        return freightIncludedFlag;
    }

    /**
     * Sets the value of the freightIncludedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightIncludedFlag(String value) {
        this.freightIncludedFlag = value;
    }

    /**
     * Gets the value of the shipping property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingType }
     *     
     */
    public ShippingType getShipping() {
        return shipping;
    }

    /**
     * Sets the value of the shipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingType }
     *     
     */
    public void setShipping(ShippingType value) {
        this.shipping = value;
    }

    /**
     * Gets the value of the adjustment property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentType }
     *     
     */
    public AdjustmentType getAdjustment() {
        return adjustment;
    }

    /**
     * Sets the value of the adjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentType }
     *     
     */
    public void setAdjustment(AdjustmentType value) {
        this.adjustment = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountAmountType }
     *     
     */
    public DiscountAmountType getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountAmountType }
     *     
     */
    public void setDiscountAmount(DiscountAmountType value) {
        this.discountAmount = value;
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

}

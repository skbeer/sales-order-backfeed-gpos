
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InvoiceLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipDate" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SupplyDate" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductIdentification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductQuantity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Pricing" maxOccurs="unbounded"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation"/>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PurchaseOrderInformation"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Allowances" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxableFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentMethodOfPaymentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}FreightIncludedFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Shipping" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportMethodCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OtherPartner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineItemTaxableTotal" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineItemTotal" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CountryOfOriginCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductSubLineItems" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductFamilyName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceLineItemType", propOrder = {
    "lineNumber",
    "shipDate",
    "supplyDate",
    "productIdentification",
    "productQuantity",
    "pricing",
    "referenceInformationOrPurchaseOrderInformation",
    "allowances",
    "taxableFlag",
    "deliveryTerms",
    "shipmentMethodOfPaymentCode",
    "freightIncludedFlag",
    "shipping",
    "transportMethodCode",
    "otherPartner",
    "specialInstructions",
    "lineItemTaxableTotal",
    "lineItemTotal",
    "packagingQuantity",
    "paymentTerms",
    "countryOfOriginCode",
    "productSubLineItems",
    "productFamilyName"
})
public class InvoiceLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "ShipDate")
    protected ShipDateType shipDate;
    @XmlElement(name = "SupplyDate")
    protected SupplyDateType supplyDate;
    @XmlElement(name = "ProductIdentification")
    protected List<ProductIdentificationType> productIdentification;
    @XmlElement(name = "ProductQuantity", required = true)
    protected ProductQuantityType productQuantity;
    @XmlElement(name = "Pricing", required = true)
    protected List<PricingType> pricing;
    @XmlElements({
        @XmlElement(name = "PurchaseOrderInformation", type = PurchaseOrderInformationType.class),
        @XmlElement(name = "ReferenceInformation", type = ReferenceInformationType.class)
    })
    protected List<Object> referenceInformationOrPurchaseOrderInformation;
    @XmlElement(name = "Allowances")
    protected List<AllowancesType> allowances;
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
    @XmlElement(name = "TransportMethodCode")
    protected TransportMethodCodeType transportMethodCode;
    @XmlElement(name = "OtherPartner")
    protected List<OtherPartnerType> otherPartner;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "LineItemTaxableTotal")
    protected LineItemTaxableTotalType lineItemTaxableTotal;
    @XmlElement(name = "LineItemTotal")
    protected LineItemTotalType lineItemTotal;
    @XmlElement(name = "PackagingQuantity")
    protected PackagingQuantityType packagingQuantity;
    @XmlElement(name = "PaymentTerms")
    protected PaymentTermsType paymentTerms;
    @XmlElement(name = "CountryOfOriginCode")
    protected CountryOfOriginCodeType countryOfOriginCode;
    @XmlElement(name = "ProductSubLineItems")
    protected List<ProductSubLineItemsType> productSubLineItems;
    @XmlElement(name = "ProductFamilyName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String productFamilyName;

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
     * Gets the value of the supplyDate property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyDateType }
     *     
     */
    public SupplyDateType getSupplyDate() {
        return supplyDate;
    }

    /**
     * Sets the value of the supplyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyDateType }
     *     
     */
    public void setSupplyDate(SupplyDateType value) {
        this.supplyDate = value;
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
     * Gets the value of the referenceInformationOrPurchaseOrderInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceInformationOrPurchaseOrderInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceInformationOrPurchaseOrderInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseOrderInformationType }
     * {@link ReferenceInformationType }
     * 
     * 
     */
    public List<Object> getReferenceInformationOrPurchaseOrderInformation() {
        if (referenceInformationOrPurchaseOrderInformation == null) {
            referenceInformationOrPurchaseOrderInformation = new ArrayList<Object>();
        }
        return this.referenceInformationOrPurchaseOrderInformation;
    }

    /**
     * Gets the value of the allowances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowancesType }
     * 
     * 
     */
    public List<AllowancesType> getAllowances() {
        if (allowances == null) {
            allowances = new ArrayList<AllowancesType>();
        }
        return this.allowances;
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
     * Gets the value of the transportMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransportMethodCodeType }
     *     
     */
    public TransportMethodCodeType getTransportMethodCode() {
        return transportMethodCode;
    }

    /**
     * Sets the value of the transportMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMethodCodeType }
     *     
     */
    public void setTransportMethodCode(TransportMethodCodeType value) {
        this.transportMethodCode = value;
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
     * Gets the value of the productFamilyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductFamilyName() {
        return productFamilyName;
    }

    /**
     * Sets the value of the productFamilyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductFamilyName(String value) {
        this.productFamilyName = value;
    }

}

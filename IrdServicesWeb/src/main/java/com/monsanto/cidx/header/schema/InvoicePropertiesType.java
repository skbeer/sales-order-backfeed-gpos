
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
 * <p>Java class for InvoicePropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoicePropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InvoiceNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InvoiceType"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InvoiceDate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InvoiceIssueDate" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}GrossInvoiceAmount"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipDate" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReverseChargeFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LanguageCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PrimaryCurrency"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SecondCurrency" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CurrencyRate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarketPlaceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OtherPartner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InvoiceTotals"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentTerms"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentMethodOfPaymentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportMethodCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SelfBillingFlag" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoicePropertiesType", propOrder = {
    "invoiceNumber",
    "invoiceType",
    "invoiceDate",
    "invoiceIssueDate",
    "grossInvoiceAmount",
    "referenceInformation",
    "shipDate",
    "reverseChargeFlag",
    "languageCode",
    "primaryCurrency",
    "secondCurrency",
    "currencyRate",
    "marketPlaceInformation",
    "specialInstructions",
    "otherPartner",
    "invoiceTotals",
    "paymentTerms",
    "deliveryTerms",
    "shipmentMethodOfPaymentCode",
    "transportMethodCode",
    "selfBillingFlag"
})
public class InvoicePropertiesType {

    @XmlElement(name = "InvoiceNumber", required = true)
    protected InvoiceNumberType invoiceNumber;
    @XmlElement(name = "InvoiceType", required = true)
    protected InvoiceTypeType invoiceType;
    @XmlElement(name = "InvoiceDate", required = true)
    protected InvoiceDateType invoiceDate;
    @XmlElement(name = "InvoiceIssueDate")
    protected InvoiceIssueDateType invoiceIssueDate;
    @XmlElement(name = "GrossInvoiceAmount", required = true)
    protected GrossInvoiceAmountType grossInvoiceAmount;
    @XmlElement(name = "ReferenceInformation")
    protected List<ReferenceInformationType> referenceInformation;
    @XmlElement(name = "ShipDate")
    protected ShipDateType shipDate;
    @XmlElement(name = "ReverseChargeFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String reverseChargeFlag;
    @XmlElement(name = "LanguageCode")
    protected LanguageCodeType languageCode;
    @XmlElement(name = "PrimaryCurrency", required = true)
    protected PrimaryCurrencyType primaryCurrency;
    @XmlElement(name = "SecondCurrency")
    protected SecondCurrencyType secondCurrency;
    @XmlElement(name = "CurrencyRate")
    protected List<CurrencyRateType> currencyRate;
    @XmlElement(name = "MarketPlaceInformation")
    protected List<MarketPlaceInformationType> marketPlaceInformation;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "OtherPartner")
    protected List<OtherPartnerType> otherPartner;
    @XmlElement(name = "InvoiceTotals", required = true)
    protected InvoiceTotalsType invoiceTotals;
    @XmlElement(name = "PaymentTerms", required = true)
    protected PaymentTermsType paymentTerms;
    @XmlElement(name = "DeliveryTerms")
    protected DeliveryTermsType deliveryTerms;
    @XmlElement(name = "ShipmentMethodOfPaymentCode")
    protected ShipmentMethodOfPaymentCodeType shipmentMethodOfPaymentCode;
    @XmlElement(name = "TransportMethodCode")
    protected TransportMethodCodeType transportMethodCode;
    @XmlElement(name = "SelfBillingFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String selfBillingFlag;

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceNumberType }
     *     
     */
    public InvoiceNumberType getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceNumberType }
     *     
     */
    public void setInvoiceNumber(InvoiceNumberType value) {
        this.invoiceNumber = value;
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
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDateType }
     *     
     */
    public InvoiceDateType getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDateType }
     *     
     */
    public void setInvoiceDate(InvoiceDateType value) {
        this.invoiceDate = value;
    }

    /**
     * Gets the value of the invoiceIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceIssueDateType }
     *     
     */
    public InvoiceIssueDateType getInvoiceIssueDate() {
        return invoiceIssueDate;
    }

    /**
     * Sets the value of the invoiceIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceIssueDateType }
     *     
     */
    public void setInvoiceIssueDate(InvoiceIssueDateType value) {
        this.invoiceIssueDate = value;
    }

    /**
     * Gets the value of the grossInvoiceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link GrossInvoiceAmountType }
     *     
     */
    public GrossInvoiceAmountType getGrossInvoiceAmount() {
        return grossInvoiceAmount;
    }

    /**
     * Sets the value of the grossInvoiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossInvoiceAmountType }
     *     
     */
    public void setGrossInvoiceAmount(GrossInvoiceAmountType value) {
        this.grossInvoiceAmount = value;
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
     * Gets the value of the reverseChargeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReverseChargeFlag() {
        return reverseChargeFlag;
    }

    /**
     * Sets the value of the reverseChargeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReverseChargeFlag(String value) {
        this.reverseChargeFlag = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setLanguageCode(LanguageCodeType value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the primaryCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryCurrencyType }
     *     
     */
    public PrimaryCurrencyType getPrimaryCurrency() {
        return primaryCurrency;
    }

    /**
     * Sets the value of the primaryCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryCurrencyType }
     *     
     */
    public void setPrimaryCurrency(PrimaryCurrencyType value) {
        this.primaryCurrency = value;
    }

    /**
     * Gets the value of the secondCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link SecondCurrencyType }
     *     
     */
    public SecondCurrencyType getSecondCurrency() {
        return secondCurrency;
    }

    /**
     * Sets the value of the secondCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondCurrencyType }
     *     
     */
    public void setSecondCurrency(SecondCurrencyType value) {
        this.secondCurrency = value;
    }

    /**
     * Gets the value of the currencyRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyRateType }
     * 
     * 
     */
    public List<CurrencyRateType> getCurrencyRate() {
        if (currencyRate == null) {
            currencyRate = new ArrayList<CurrencyRateType>();
        }
        return this.currencyRate;
    }

    /**
     * Gets the value of the marketPlaceInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketPlaceInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketPlaceInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketPlaceInformationType }
     * 
     * 
     */
    public List<MarketPlaceInformationType> getMarketPlaceInformation() {
        if (marketPlaceInformation == null) {
            marketPlaceInformation = new ArrayList<MarketPlaceInformationType>();
        }
        return this.marketPlaceInformation;
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
     * Gets the value of the invoiceTotals property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTotalsType }
     *     
     */
    public InvoiceTotalsType getInvoiceTotals() {
        return invoiceTotals;
    }

    /**
     * Sets the value of the invoiceTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTotalsType }
     *     
     */
    public void setInvoiceTotals(InvoiceTotalsType value) {
        this.invoiceTotals = value;
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
     * Gets the value of the selfBillingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfBillingFlag() {
        return selfBillingFlag;
    }

    /**
     * Sets the value of the selfBillingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfBillingFlag(String value) {
        this.selfBillingFlag = value;
    }

}

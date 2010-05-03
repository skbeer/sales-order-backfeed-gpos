
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
 * <p>Java class for FreightBillPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightBillPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}FreightBillNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}FreightBillDateTime"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}FreightBillIssueDate" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReverseChargeFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}FreightBillType"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}FreightBillStatus"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportMethodCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentMethodOfPaymentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadTenderInformation"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarketPlaceInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipDate" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LanguageCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PrimaryCurrency"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SecondCurrency" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CurrencyRate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RoutingInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedDocument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OtherPartner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}FreightBillTotals"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentTerms" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightBillPropertiesType", propOrder = {
    "freightBillNumber",
    "freightBillDateTime",
    "freightBillIssueDate",
    "reverseChargeFlag",
    "freightBillType",
    "freightBillStatus",
    "transportMethodCode",
    "shipmentMethodOfPaymentCode",
    "loadTenderInformation",
    "marketPlaceInformation",
    "referenceInformation",
    "shipDate",
    "languageCode",
    "primaryCurrency",
    "secondCurrency",
    "currencyRate",
    "routingInstructions",
    "requestedDocument",
    "deliveryTerms",
    "otherPartner",
    "freightBillTotals",
    "paymentTerms"
})
public class FreightBillPropertiesType {

    @XmlElement(name = "FreightBillNumber", required = true)
    protected FreightBillNumberType freightBillNumber;
    @XmlElement(name = "FreightBillDateTime", required = true)
    protected FreightBillDateTimeType freightBillDateTime;
    @XmlElement(name = "FreightBillIssueDate")
    protected FreightBillIssueDateType freightBillIssueDate;
    @XmlElement(name = "ReverseChargeFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String reverseChargeFlag;
    @XmlElement(name = "FreightBillType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String freightBillType;
    @XmlElement(name = "FreightBillStatus", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String freightBillStatus;
    @XmlElement(name = "TransportMethodCode", required = true)
    protected TransportMethodCodeType transportMethodCode;
    @XmlElement(name = "ShipmentMethodOfPaymentCode")
    protected ShipmentMethodOfPaymentCodeType shipmentMethodOfPaymentCode;
    @XmlElement(name = "LoadTenderInformation", required = true)
    protected LoadTenderInformationType loadTenderInformation;
    @XmlElement(name = "MarketPlaceInformation")
    protected MarketPlaceInformationType marketPlaceInformation;
    @XmlElement(name = "ReferenceInformation")
    protected List<ReferenceInformationType> referenceInformation;
    @XmlElement(name = "ShipDate")
    protected ShipDateType shipDate;
    @XmlElement(name = "LanguageCode")
    protected LanguageCodeType languageCode;
    @XmlElement(name = "PrimaryCurrency", required = true)
    protected PrimaryCurrencyType primaryCurrency;
    @XmlElement(name = "SecondCurrency")
    protected SecondCurrencyType secondCurrency;
    @XmlElement(name = "CurrencyRate")
    protected List<CurrencyRateType> currencyRate;
    @XmlElement(name = "RoutingInstructions")
    protected List<RoutingInstructionsType> routingInstructions;
    @XmlElement(name = "RequestedDocument")
    protected List<RequestedDocumentType> requestedDocument;
    @XmlElement(name = "DeliveryTerms")
    protected DeliveryTermsType deliveryTerms;
    @XmlElement(name = "OtherPartner")
    protected List<OtherPartnerType> otherPartner;
    @XmlElement(name = "FreightBillTotals", required = true)
    protected FreightBillTotalsType freightBillTotals;
    @XmlElement(name = "PaymentTerms")
    protected PaymentTermsType paymentTerms;

    /**
     * Gets the value of the freightBillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link FreightBillNumberType }
     *     
     */
    public FreightBillNumberType getFreightBillNumber() {
        return freightBillNumber;
    }

    /**
     * Sets the value of the freightBillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightBillNumberType }
     *     
     */
    public void setFreightBillNumber(FreightBillNumberType value) {
        this.freightBillNumber = value;
    }

    /**
     * Gets the value of the freightBillDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link FreightBillDateTimeType }
     *     
     */
    public FreightBillDateTimeType getFreightBillDateTime() {
        return freightBillDateTime;
    }

    /**
     * Sets the value of the freightBillDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightBillDateTimeType }
     *     
     */
    public void setFreightBillDateTime(FreightBillDateTimeType value) {
        this.freightBillDateTime = value;
    }

    /**
     * Gets the value of the freightBillIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link FreightBillIssueDateType }
     *     
     */
    public FreightBillIssueDateType getFreightBillIssueDate() {
        return freightBillIssueDate;
    }

    /**
     * Sets the value of the freightBillIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightBillIssueDateType }
     *     
     */
    public void setFreightBillIssueDate(FreightBillIssueDateType value) {
        this.freightBillIssueDate = value;
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
     * Gets the value of the freightBillType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightBillType() {
        return freightBillType;
    }

    /**
     * Sets the value of the freightBillType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightBillType(String value) {
        this.freightBillType = value;
    }

    /**
     * Gets the value of the freightBillStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightBillStatus() {
        return freightBillStatus;
    }

    /**
     * Sets the value of the freightBillStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightBillStatus(String value) {
        this.freightBillStatus = value;
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
     * Gets the value of the loadTenderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTenderInformationType }
     *     
     */
    public LoadTenderInformationType getLoadTenderInformation() {
        return loadTenderInformation;
    }

    /**
     * Sets the value of the loadTenderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTenderInformationType }
     *     
     */
    public void setLoadTenderInformation(LoadTenderInformationType value) {
        this.loadTenderInformation = value;
    }

    /**
     * Gets the value of the marketPlaceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MarketPlaceInformationType }
     *     
     */
    public MarketPlaceInformationType getMarketPlaceInformation() {
        return marketPlaceInformation;
    }

    /**
     * Sets the value of the marketPlaceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketPlaceInformationType }
     *     
     */
    public void setMarketPlaceInformation(MarketPlaceInformationType value) {
        this.marketPlaceInformation = value;
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
     * Gets the value of the routingInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingInstructionsType }
     * 
     * 
     */
    public List<RoutingInstructionsType> getRoutingInstructions() {
        if (routingInstructions == null) {
            routingInstructions = new ArrayList<RoutingInstructionsType>();
        }
        return this.routingInstructions;
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
     * Gets the value of the freightBillTotals property.
     * 
     * @return
     *     possible object is
     *     {@link FreightBillTotalsType }
     *     
     */
    public FreightBillTotalsType getFreightBillTotals() {
        return freightBillTotals;
    }

    /**
     * Sets the value of the freightBillTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightBillTotalsType }
     *     
     */
    public void setFreightBillTotals(FreightBillTotalsType value) {
        this.freightBillTotals = value;
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

}


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
 * <p>Java class for PaymentDetailPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BuyerTransactionNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LanguageCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PrimaryCurrency"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SecondCurrency" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CurrencyRate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarketPlaceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DiscountAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TotalAmountPaid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailPropertiesType", propOrder = {
    "buyerTransactionNumber",
    "languageCode",
    "primaryCurrency",
    "secondCurrency",
    "currencyRate",
    "marketPlaceInformation",
    "discountAmount",
    "totalAmountPaid"
})
public class PaymentDetailPropertiesType {

    @XmlElement(name = "BuyerTransactionNumber", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String buyerTransactionNumber;
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
    @XmlElement(name = "DiscountAmount")
    protected DiscountAmountType discountAmount;
    @XmlElement(name = "TotalAmountPaid", required = true)
    protected TotalAmountPaidType totalAmountPaid;

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
     * Gets the value of the totalAmountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmountPaidType }
     *     
     */
    public TotalAmountPaidType getTotalAmountPaid() {
        return totalAmountPaid;
    }

    /**
     * Sets the value of the totalAmountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmountPaidType }
     *     
     */
    public void setTotalAmountPaid(TotalAmountPaidType value) {
        this.totalAmountPaid = value;
    }

}


package com.monsanto.cidx.header.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyRateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SourceCurrency"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TargetCurrency"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ExchangeOperator"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ExchangeRate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ExchangeRateDate"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyRateType", propOrder = {
    "sourceCurrency",
    "targetCurrency",
    "exchangeOperator",
    "exchangeRate",
    "exchangeRateDate"
})
public class CurrencyRateType {

    @XmlElement(name = "SourceCurrency", required = true)
    protected SourceCurrencyType sourceCurrency;
    @XmlElement(name = "TargetCurrency", required = true)
    protected TargetCurrencyType targetCurrency;
    @XmlElement(name = "ExchangeOperator", required = true)
    protected CidxListOperator exchangeOperator;
    @XmlElement(name = "ExchangeRate", required = true)
    protected BigDecimal exchangeRate;
    @XmlElement(name = "ExchangeRateDate", required = true)
    protected ExchangeRateDateType exchangeRateDate;

    /**
     * Gets the value of the sourceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link SourceCurrencyType }
     *     
     */
    public SourceCurrencyType getSourceCurrency() {
        return sourceCurrency;
    }

    /**
     * Sets the value of the sourceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceCurrencyType }
     *     
     */
    public void setSourceCurrency(SourceCurrencyType value) {
        this.sourceCurrency = value;
    }

    /**
     * Gets the value of the targetCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link TargetCurrencyType }
     *     
     */
    public TargetCurrencyType getTargetCurrency() {
        return targetCurrency;
    }

    /**
     * Sets the value of the targetCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetCurrencyType }
     *     
     */
    public void setTargetCurrency(TargetCurrencyType value) {
        this.targetCurrency = value;
    }

    /**
     * Gets the value of the exchangeOperator property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListOperator }
     *     
     */
    public CidxListOperator getExchangeOperator() {
        return exchangeOperator;
    }

    /**
     * Sets the value of the exchangeOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListOperator }
     *     
     */
    public void setExchangeOperator(CidxListOperator value) {
        this.exchangeOperator = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the exchangeRateDate property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateDateType }
     *     
     */
    public ExchangeRateDateType getExchangeRateDate() {
        return exchangeRateDate;
    }

    /**
     * Sets the value of the exchangeRateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateDateType }
     *     
     */
    public void setExchangeRateDate(ExchangeRateDateType value) {
        this.exchangeRateDate = value;
    }

}

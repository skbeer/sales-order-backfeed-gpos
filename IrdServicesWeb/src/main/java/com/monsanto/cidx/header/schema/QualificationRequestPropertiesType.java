
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualificationRequestPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualificationRequestPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LanguageCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CurrencyCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarketPlaceInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualificationRequestPropertiesType", propOrder = {
    "languageCode",
    "currencyCode",
    "marketPlaceInformation"
})
public class QualificationRequestPropertiesType {

    @XmlElement(name = "LanguageCode", required = true)
    protected LanguageCodeType languageCode;
    @XmlElement(name = "CurrencyCode", required = true)
    protected CurrencyCodeType currencyCode;
    @XmlElement(name = "MarketPlaceInformation")
    protected MarketPlaceInformationType marketPlaceInformation;

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
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyCode(CurrencyCodeType value) {
        this.currencyCode = value;
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

}

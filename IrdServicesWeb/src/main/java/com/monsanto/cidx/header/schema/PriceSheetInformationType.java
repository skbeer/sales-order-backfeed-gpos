
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PriceSheetInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceSheetInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceSheetIdentifier" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceSheetDescription" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceSheetEffectiveDate"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceSheetInformationType", propOrder = {
    "priceSheetIdentifier",
    "priceSheetDescription",
    "priceSheetEffectiveDate"
})
public class PriceSheetInformationType {

    @XmlElement(name = "PriceSheetIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String priceSheetIdentifier;
    @XmlElement(name = "PriceSheetDescription")
    protected String priceSheetDescription;
    @XmlElement(name = "PriceSheetEffectiveDate", required = true)
    protected PriceSheetEffectiveDateType priceSheetEffectiveDate;

    /**
     * Gets the value of the priceSheetIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceSheetIdentifier() {
        return priceSheetIdentifier;
    }

    /**
     * Sets the value of the priceSheetIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceSheetIdentifier(String value) {
        this.priceSheetIdentifier = value;
    }

    /**
     * Gets the value of the priceSheetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceSheetDescription() {
        return priceSheetDescription;
    }

    /**
     * Sets the value of the priceSheetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceSheetDescription(String value) {
        this.priceSheetDescription = value;
    }

    /**
     * Gets the value of the priceSheetEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSheetEffectiveDateType }
     *     
     */
    public PriceSheetEffectiveDateType getPriceSheetEffectiveDate() {
        return priceSheetEffectiveDate;
    }

    /**
     * Sets the value of the priceSheetEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSheetEffectiveDateType }
     *     
     */
    public void setPriceSheetEffectiveDate(PriceSheetEffectiveDateType value) {
        this.priceSheetEffectiveDate = value;
    }

}

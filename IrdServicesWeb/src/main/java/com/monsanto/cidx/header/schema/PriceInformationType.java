
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}UnitPrice"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceShippingTerms"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceInformationType", propOrder = {
    "unitPrice",
    "priceShippingTerms"
})
public class PriceInformationType {

    @XmlElement(name = "UnitPrice", required = true)
    protected UnitPriceType unitPrice;
    @XmlElement(name = "PriceShippingTerms", required = true)
    protected PriceShippingTermsType priceShippingTerms;

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPriceType }
     *     
     */
    public UnitPriceType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPriceType }
     *     
     */
    public void setUnitPrice(UnitPriceType value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the priceShippingTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PriceShippingTermsType }
     *     
     */
    public PriceShippingTermsType getPriceShippingTerms() {
        return priceShippingTerms;
    }

    /**
     * Sets the value of the priceShippingTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceShippingTermsType }
     *     
     */
    public void setPriceShippingTerms(PriceShippingTermsType value) {
        this.priceShippingTerms = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostSupportPerUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostSupportPerUnitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MonetaryAmount"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceBasis"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostSupportPerUnitType", propOrder = {
    "monetaryAmount",
    "priceBasis"
})
public class CostSupportPerUnitType {

    @XmlElement(name = "MonetaryAmount", required = true)
    protected MonetaryAmountType monetaryAmount;
    @XmlElement(name = "PriceBasis", required = true)
    protected PriceBasisType priceBasis;

    /**
     * Gets the value of the monetaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getMonetaryAmount() {
        return monetaryAmount;
    }

    /**
     * Sets the value of the monetaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setMonetaryAmount(MonetaryAmountType value) {
        this.monetaryAmount = value;
    }

    /**
     * Gets the value of the priceBasis property.
     * 
     * @return
     *     possible object is
     *     {@link PriceBasisType }
     *     
     */
    public PriceBasisType getPriceBasis() {
        return priceBasis;
    }

    /**
     * Sets the value of the priceBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceBasisType }
     *     
     */
    public void setPriceBasis(PriceBasisType value) {
        this.priceBasis = value;
    }

}

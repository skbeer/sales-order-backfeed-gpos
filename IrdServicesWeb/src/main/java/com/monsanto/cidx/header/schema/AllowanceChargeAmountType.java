
package com.monsanto.cidx.header.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllowanceChargeAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllowanceChargeAmountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PricingLumpSum"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PricingPerUnit"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PricingPercentage"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllowanceChargeAmountType", propOrder = {
    "pricingLumpSum",
    "pricingPerUnit",
    "pricingPercentage"
})
public class AllowanceChargeAmountType {

    @XmlElement(name = "PricingLumpSum")
    protected PricingLumpSumType pricingLumpSum;
    @XmlElement(name = "PricingPerUnit")
    protected PricingPerUnitType pricingPerUnit;
    @XmlElement(name = "PricingPercentage")
    protected BigDecimal pricingPercentage;

    /**
     * Gets the value of the pricingLumpSum property.
     * 
     * @return
     *     possible object is
     *     {@link PricingLumpSumType }
     *     
     */
    public PricingLumpSumType getPricingLumpSum() {
        return pricingLumpSum;
    }

    /**
     * Sets the value of the pricingLumpSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingLumpSumType }
     *     
     */
    public void setPricingLumpSum(PricingLumpSumType value) {
        this.pricingLumpSum = value;
    }

    /**
     * Gets the value of the pricingPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link PricingPerUnitType }
     *     
     */
    public PricingPerUnitType getPricingPerUnit() {
        return pricingPerUnit;
    }

    /**
     * Sets the value of the pricingPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingPerUnitType }
     *     
     */
    public void setPricingPerUnit(PricingPerUnitType value) {
        this.pricingPerUnit = value;
    }

    /**
     * Gets the value of the pricingPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricingPercentage() {
        return pricingPercentage;
    }

    /**
     * Sets the value of the pricingPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricingPercentage(BigDecimal value) {
        this.pricingPercentage = value;
    }

}

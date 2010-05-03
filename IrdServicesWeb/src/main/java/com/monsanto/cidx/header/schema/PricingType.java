
package com.monsanto.cidx.header.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PricingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PricingLumpSum"/>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PricingPerUnit"/>
 *           &lt;sequence>
 *             &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PricingPercentage"/>
 *             &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PercentageBasis"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceReason" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PriceType" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListPriceType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingType", propOrder = {
    "pricingLumpSum",
    "pricingPerUnit",
    "pricingPercentage",
    "percentageBasis",
    "priceReason"
})
public class PricingType {

    @XmlElement(name = "PricingLumpSum")
    protected PricingLumpSumType pricingLumpSum;
    @XmlElement(name = "PricingPerUnit")
    protected PricingPerUnitType pricingPerUnit;
    @XmlElement(name = "PricingPercentage")
    protected BigDecimal pricingPercentage;
    @XmlElement(name = "PercentageBasis")
    protected PercentageBasisType percentageBasis;
    @XmlElement(name = "PriceReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String priceReason;
    @XmlAttribute(name = "PriceType", required = true)
    protected CidxListPriceType priceType;

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

    /**
     * Gets the value of the percentageBasis property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageBasisType }
     *     
     */
    public PercentageBasisType getPercentageBasis() {
        return percentageBasis;
    }

    /**
     * Sets the value of the percentageBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageBasisType }
     *     
     */
    public void setPercentageBasis(PercentageBasisType value) {
        this.percentageBasis = value;
    }

    /**
     * Gets the value of the priceReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceReason() {
        return priceReason;
    }

    /**
     * Sets the value of the priceReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceReason(String value) {
        this.priceReason = value;
    }

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListPriceType }
     *     
     */
    public CidxListPriceType getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListPriceType }
     *     
     */
    public void setPriceType(CidxListPriceType value) {
        this.priceType = value;
    }

}

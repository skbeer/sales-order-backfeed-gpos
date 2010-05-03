
package com.monsanto.cidx.header.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for NonExemptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonExemptType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxRate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NonExemptionReason" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxableAmount"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxAmount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonExemptType", propOrder = {
    "taxRate",
    "nonExemptionReason",
    "taxableAmount",
    "taxAmount"
})
public class NonExemptType {

    @XmlElement(name = "TaxRate", required = true)
    protected BigDecimal taxRate;
    @XmlElement(name = "NonExemptionReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nonExemptionReason;
    @XmlElement(name = "TaxableAmount", required = true)
    protected TaxableAmountType taxableAmount;
    @XmlElement(name = "TaxAmount", required = true)
    protected TaxAmountType taxAmount;

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxRate(BigDecimal value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the nonExemptionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonExemptionReason() {
        return nonExemptionReason;
    }

    /**
     * Sets the value of the nonExemptionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonExemptionReason(String value) {
        this.nonExemptionReason = value;
    }

    /**
     * Gets the value of the taxableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxableAmountType }
     *     
     */
    public TaxableAmountType getTaxableAmount() {
        return taxableAmount;
    }

    /**
     * Sets the value of the taxableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableAmountType }
     *     
     */
    public void setTaxableAmount(TaxableAmountType value) {
        this.taxableAmount = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxAmountType }
     *     
     */
    public TaxAmountType getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAmountType }
     *     
     */
    public void setTaxAmount(TaxAmountType value) {
        this.taxAmount = value;
    }

}

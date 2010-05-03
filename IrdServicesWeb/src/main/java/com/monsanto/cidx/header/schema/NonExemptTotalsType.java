
package com.monsanto.cidx.header.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for NonExemptTotalsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonExemptTotalsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxRate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NonExemptionReason" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxTypeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxLocation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxableAmountTotal"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxAmountTotal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonExemptTotalsType", propOrder = {
    "taxRate",
    "nonExemptionReason",
    "taxTypeCode",
    "taxLocation",
    "taxableAmountTotal",
    "taxAmountTotal"
})
public class NonExemptTotalsType {

    @XmlElement(name = "TaxRate", required = true)
    protected BigDecimal taxRate;
    @XmlElement(name = "NonExemptionReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nonExemptionReason;
    @XmlElement(name = "TaxTypeCode")
    protected TaxTypeCodeType taxTypeCode;
    @XmlElement(name = "TaxLocation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String taxLocation;
    @XmlElement(name = "TaxableAmountTotal", required = true)
    protected TaxableAmountTotalType taxableAmountTotal;
    @XmlElement(name = "TaxAmountTotal", required = true)
    protected TaxAmountTotalType taxAmountTotal;

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
     * Gets the value of the taxTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeCodeType }
     *     
     */
    public TaxTypeCodeType getTaxTypeCode() {
        return taxTypeCode;
    }

    /**
     * Sets the value of the taxTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeCodeType }
     *     
     */
    public void setTaxTypeCode(TaxTypeCodeType value) {
        this.taxTypeCode = value;
    }

    /**
     * Gets the value of the taxLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxLocation() {
        return taxLocation;
    }

    /**
     * Sets the value of the taxLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxLocation(String value) {
        this.taxLocation = value;
    }

    /**
     * Gets the value of the taxableAmountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link TaxableAmountTotalType }
     *     
     */
    public TaxableAmountTotalType getTaxableAmountTotal() {
        return taxableAmountTotal;
    }

    /**
     * Sets the value of the taxableAmountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableAmountTotalType }
     *     
     */
    public void setTaxableAmountTotal(TaxableAmountTotalType value) {
        this.taxableAmountTotal = value;
    }

    /**
     * Gets the value of the taxAmountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link TaxAmountTotalType }
     *     
     */
    public TaxAmountTotalType getTaxAmountTotal() {
        return taxAmountTotal;
    }

    /**
     * Sets the value of the taxAmountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAmountTotalType }
     *     
     */
    public void setTaxAmountTotal(TaxAmountTotalType value) {
        this.taxAmountTotal = value;
    }

}

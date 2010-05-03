
package com.monsanto.cidx.header.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TaxInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxIdentifierNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Jurisdiction" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxCertificateType" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxCertificateNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxBasis" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxRate" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EffectiveDates" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInformationType", propOrder = {
    "taxIdentifierNumber",
    "jurisdiction",
    "taxCertificateType",
    "taxCertificateNumber",
    "taxBasis",
    "taxRate",
    "effectiveDates"
})
public class TaxInformationType {

    @XmlElement(name = "TaxIdentifierNumber", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String taxIdentifierNumber;
    @XmlElement(name = "Jurisdiction")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String jurisdiction;
    @XmlElement(name = "TaxCertificateType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String taxCertificateType;
    @XmlElement(name = "TaxCertificateNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String taxCertificateNumber;
    @XmlElement(name = "TaxBasis")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String taxBasis;
    @XmlElement(name = "TaxRate")
    protected BigDecimal taxRate;
    @XmlElement(name = "EffectiveDates")
    protected EffectiveDatesType effectiveDates;

    /**
     * Gets the value of the taxIdentifierNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdentifierNumber() {
        return taxIdentifierNumber;
    }

    /**
     * Sets the value of the taxIdentifierNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdentifierNumber(String value) {
        this.taxIdentifierNumber = value;
    }

    /**
     * Gets the value of the jurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdiction() {
        return jurisdiction;
    }

    /**
     * Sets the value of the jurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdiction(String value) {
        this.jurisdiction = value;
    }

    /**
     * Gets the value of the taxCertificateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCertificateType() {
        return taxCertificateType;
    }

    /**
     * Sets the value of the taxCertificateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCertificateType(String value) {
        this.taxCertificateType = value;
    }

    /**
     * Gets the value of the taxCertificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCertificateNumber() {
        return taxCertificateNumber;
    }

    /**
     * Sets the value of the taxCertificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCertificateNumber(String value) {
        this.taxCertificateNumber = value;
    }

    /**
     * Gets the value of the taxBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxBasis() {
        return taxBasis;
    }

    /**
     * Sets the value of the taxBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxBasis(String value) {
        this.taxBasis = value;
    }

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
     * Gets the value of the effectiveDates property.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveDatesType }
     *     
     */
    public EffectiveDatesType getEffectiveDates() {
        return effectiveDates;
    }

    /**
     * Sets the value of the effectiveDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveDatesType }
     *     
     */
    public void setEffectiveDates(EffectiveDatesType value) {
        this.effectiveDates = value;
    }

}

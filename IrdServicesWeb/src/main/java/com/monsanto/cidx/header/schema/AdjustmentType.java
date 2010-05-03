
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AdjustmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AdjustmentCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AdjustmentAmount"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustmentType", propOrder = {
    "adjustmentCode",
    "adjustmentAmount",
    "referenceIdentifier"
})
public class AdjustmentType {

    @XmlElement(name = "AdjustmentCode", required = true)
    protected AdjustmentCodeType adjustmentCode;
    @XmlElement(name = "AdjustmentAmount", required = true)
    protected AdjustmentAmountType adjustmentAmount;
    @XmlElement(name = "ReferenceIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String referenceIdentifier;

    /**
     * Gets the value of the adjustmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentCodeType }
     *     
     */
    public AdjustmentCodeType getAdjustmentCode() {
        return adjustmentCode;
    }

    /**
     * Sets the value of the adjustmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentCodeType }
     *     
     */
    public void setAdjustmentCode(AdjustmentCodeType value) {
        this.adjustmentCode = value;
    }

    /**
     * Gets the value of the adjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentAmountType }
     *     
     */
    public AdjustmentAmountType getAdjustmentAmount() {
        return adjustmentAmount;
    }

    /**
     * Sets the value of the adjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentAmountType }
     *     
     */
    public void setAdjustmentAmount(AdjustmentAmountType value) {
        this.adjustmentAmount = value;
    }

    /**
     * Gets the value of the referenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceIdentifier() {
        return referenceIdentifier;
    }

    /**
     * Sets the value of the referenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceIdentifier(String value) {
        this.referenceIdentifier = value;
    }

}

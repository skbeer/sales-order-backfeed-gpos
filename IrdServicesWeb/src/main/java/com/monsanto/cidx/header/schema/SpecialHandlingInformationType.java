
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialHandlingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialHandlingInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AllowanceChargeCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MonetaryAmount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialHandlingInformationType", propOrder = {
    "allowanceChargeCode",
    "monetaryAmount"
})
public class SpecialHandlingInformationType {

    @XmlElement(name = "AllowanceChargeCode", required = true)
    protected AllowanceChargeCodeType allowanceChargeCode;
    @XmlElement(name = "MonetaryAmount", required = true)
    protected MonetaryAmountType monetaryAmount;

    /**
     * Gets the value of the allowanceChargeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AllowanceChargeCodeType }
     *     
     */
    public AllowanceChargeCodeType getAllowanceChargeCode() {
        return allowanceChargeCode;
    }

    /**
     * Sets the value of the allowanceChargeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceChargeCodeType }
     *     
     */
    public void setAllowanceChargeCode(AllowanceChargeCodeType value) {
        this.allowanceChargeCode = value;
    }

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

}

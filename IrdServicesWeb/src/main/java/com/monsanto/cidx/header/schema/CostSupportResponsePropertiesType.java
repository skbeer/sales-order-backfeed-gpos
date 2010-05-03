
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostSupportResponsePropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostSupportResponsePropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportRequestNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LanguageCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostSupportResponsePropertiesType", propOrder = {
    "costSupportRequestNumber",
    "languageCode"
})
public class CostSupportResponsePropertiesType {

    @XmlElement(name = "CostSupportRequestNumber", required = true)
    protected CostSupportRequestNumberType costSupportRequestNumber;
    @XmlElement(name = "LanguageCode", required = true)
    protected LanguageCodeType languageCode;

    /**
     * Gets the value of the costSupportRequestNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportRequestNumberType }
     *     
     */
    public CostSupportRequestNumberType getCostSupportRequestNumber() {
        return costSupportRequestNumber;
    }

    /**
     * Sets the value of the costSupportRequestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportRequestNumberType }
     *     
     */
    public void setCostSupportRequestNumber(CostSupportRequestNumberType value) {
        this.costSupportRequestNumber = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setLanguageCode(LanguageCodeType value) {
        this.languageCode = value;
    }

}

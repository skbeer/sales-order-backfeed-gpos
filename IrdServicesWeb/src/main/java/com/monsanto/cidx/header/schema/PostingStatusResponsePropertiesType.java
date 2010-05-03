
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PostingStatusResponsePropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingStatusResponsePropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingStatusResponseIdentifier"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EffectiveDates" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LanguageCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingStatusResponsePropertiesType", propOrder = {
    "postingNumber",
    "postingStatusResponseIdentifier",
    "effectiveDates",
    "languageCode"
})
public class PostingStatusResponsePropertiesType {

    @XmlElement(name = "PostingNumber", required = true)
    protected PostingNumberType postingNumber;
    @XmlElement(name = "PostingStatusResponseIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String postingStatusResponseIdentifier;
    @XmlElement(name = "EffectiveDates")
    protected EffectiveDatesType effectiveDates;
    @XmlElement(name = "LanguageCode")
    protected LanguageCodeType languageCode;

    /**
     * Gets the value of the postingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link PostingNumberType }
     *     
     */
    public PostingNumberType getPostingNumber() {
        return postingNumber;
    }

    /**
     * Sets the value of the postingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingNumberType }
     *     
     */
    public void setPostingNumber(PostingNumberType value) {
        this.postingNumber = value;
    }

    /**
     * Gets the value of the postingStatusResponseIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingStatusResponseIdentifier() {
        return postingStatusResponseIdentifier;
    }

    /**
     * Sets the value of the postingStatusResponseIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingStatusResponseIdentifier(String value) {
        this.postingStatusResponseIdentifier = value;
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

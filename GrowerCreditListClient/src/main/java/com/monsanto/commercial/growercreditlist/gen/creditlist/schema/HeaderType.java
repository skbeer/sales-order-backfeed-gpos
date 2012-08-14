
package com.monsanto.commercial.growercreditlist.gen.creditlist.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ThisDocumentIdentifier" type="{Monsanto:Service:GrowerCreditList}ThisDocumentIdentifierType"/>
 *         &lt;element name="ThisDocumentDateTime" type="{Monsanto:Service:GrowerCreditList}ThisDocumentDateTimeType"/>
 *         &lt;element name="From" type="{Monsanto:Service:GrowerCreditList}FromType"/>
 *         &lt;element name="To" type="{Monsanto:Service:GrowerCreditList}ToType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderType", propOrder = {
    "thisDocumentIdentifier",
    "thisDocumentDateTime",
    "from",
    "to"
})
public class HeaderType {

    @XmlElement(name = "ThisDocumentIdentifier", required = true)
    protected ThisDocumentIdentifierType thisDocumentIdentifier;
    @XmlElement(name = "ThisDocumentDateTime", required = true)
    protected ThisDocumentDateTimeType thisDocumentDateTime;
    @XmlElement(name = "From", required = true)
    protected FromType from;
    @XmlElement(name = "To", required = true)
    protected ToType to;

    /**
     * Gets the value of the thisDocumentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ThisDocumentIdentifierType }
     *     
     */
    public ThisDocumentIdentifierType getThisDocumentIdentifier() {
        return thisDocumentIdentifier;
    }

    /**
     * Sets the value of the thisDocumentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThisDocumentIdentifierType }
     *     
     */
    public void setThisDocumentIdentifier(ThisDocumentIdentifierType value) {
        this.thisDocumentIdentifier = value;
    }

    /**
     * Gets the value of the thisDocumentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link ThisDocumentDateTimeType }
     *     
     */
    public ThisDocumentDateTimeType getThisDocumentDateTime() {
        return thisDocumentDateTime;
    }

    /**
     * Sets the value of the thisDocumentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThisDocumentDateTimeType }
     *     
     */
    public void setThisDocumentDateTime(ThisDocumentDateTimeType value) {
        this.thisDocumentDateTime = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link FromType }
     *     
     */
    public FromType getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromType }
     *     
     */
    public void setFrom(FromType value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link ToType }
     *     
     */
    public ToType getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToType }
     *     
     */
    public void setTo(ToType value) {
        this.to = value;
    }

}

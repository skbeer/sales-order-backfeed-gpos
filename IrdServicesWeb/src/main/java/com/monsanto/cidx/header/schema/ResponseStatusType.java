
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ResponseStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ResponseStatusReasonIdentifier" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ResponseStatusReasonDescription" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ResponseStatusComments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseStatusType", propOrder = {
    "responseStatusReasonIdentifier",
    "responseStatusReasonDescription",
    "responseStatusComments"
})
public class ResponseStatusType {

    @XmlElement(name = "ResponseStatusReasonIdentifier")
    protected ResponseStatusReasonIdentifierType responseStatusReasonIdentifier;
    @XmlElement(name = "ResponseStatusReasonDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String responseStatusReasonDescription;
    @XmlElement(name = "ResponseStatusComments")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String responseStatusComments;

    /**
     * Gets the value of the responseStatusReasonIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatusReasonIdentifierType }
     *     
     */
    public ResponseStatusReasonIdentifierType getResponseStatusReasonIdentifier() {
        return responseStatusReasonIdentifier;
    }

    /**
     * Sets the value of the responseStatusReasonIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatusReasonIdentifierType }
     *     
     */
    public void setResponseStatusReasonIdentifier(ResponseStatusReasonIdentifierType value) {
        this.responseStatusReasonIdentifier = value;
    }

    /**
     * Gets the value of the responseStatusReasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseStatusReasonDescription() {
        return responseStatusReasonDescription;
    }

    /**
     * Sets the value of the responseStatusReasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseStatusReasonDescription(String value) {
        this.responseStatusReasonDescription = value;
    }

    /**
     * Gets the value of the responseStatusComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseStatusComments() {
        return responseStatusComments;
    }

    /**
     * Sets the value of the responseStatusComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseStatusComments(String value) {
        this.responseStatusComments = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingResponseDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingResponseBodyType", propOrder = {
    "postingResponseProperties",
    "postingResponseDetails"
})
public class PostingResponseBodyType {

    @XmlElement(name = "PostingResponseProperties", required = true)
    protected PostingResponsePropertiesType postingResponseProperties;
    @XmlElement(name = "PostingResponseDetails")
    protected PostingResponseDetailsType postingResponseDetails;

    /**
     * Gets the value of the postingResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PostingResponsePropertiesType }
     *     
     */
    public PostingResponsePropertiesType getPostingResponseProperties() {
        return postingResponseProperties;
    }

    /**
     * Sets the value of the postingResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingResponsePropertiesType }
     *     
     */
    public void setPostingResponseProperties(PostingResponsePropertiesType value) {
        this.postingResponseProperties = value;
    }

    /**
     * Gets the value of the postingResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PostingResponseDetailsType }
     *     
     */
    public PostingResponseDetailsType getPostingResponseDetails() {
        return postingResponseDetails;
    }

    /**
     * Sets the value of the postingResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingResponseDetailsType }
     *     
     */
    public void setPostingResponseDetails(PostingResponseDetailsType value) {
        this.postingResponseDetails = value;
    }

}

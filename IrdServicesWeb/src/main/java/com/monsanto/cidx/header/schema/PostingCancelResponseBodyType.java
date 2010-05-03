
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingCancelResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingCancelResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingCancelResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingCancelResponseDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingCancelResponseBodyType", propOrder = {
    "postingCancelResponseProperties",
    "postingCancelResponseDetails"
})
public class PostingCancelResponseBodyType {

    @XmlElement(name = "PostingCancelResponseProperties", required = true)
    protected PostingCancelResponsePropertiesType postingCancelResponseProperties;
    @XmlElement(name = "PostingCancelResponseDetails")
    protected PostingCancelResponseDetailsType postingCancelResponseDetails;

    /**
     * Gets the value of the postingCancelResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PostingCancelResponsePropertiesType }
     *     
     */
    public PostingCancelResponsePropertiesType getPostingCancelResponseProperties() {
        return postingCancelResponseProperties;
    }

    /**
     * Sets the value of the postingCancelResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingCancelResponsePropertiesType }
     *     
     */
    public void setPostingCancelResponseProperties(PostingCancelResponsePropertiesType value) {
        this.postingCancelResponseProperties = value;
    }

    /**
     * Gets the value of the postingCancelResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PostingCancelResponseDetailsType }
     *     
     */
    public PostingCancelResponseDetailsType getPostingCancelResponseDetails() {
        return postingCancelResponseDetails;
    }

    /**
     * Sets the value of the postingCancelResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingCancelResponseDetailsType }
     *     
     */
    public void setPostingCancelResponseDetails(PostingCancelResponseDetailsType value) {
        this.postingCancelResponseDetails = value;
    }

}

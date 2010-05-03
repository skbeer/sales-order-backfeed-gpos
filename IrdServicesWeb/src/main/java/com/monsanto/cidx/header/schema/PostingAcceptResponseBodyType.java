
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingAcceptResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingAcceptResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingAcceptResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingAcceptResponsePartners" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingAcceptResponseDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingAcceptResponseBodyType", propOrder = {
    "postingAcceptResponseProperties",
    "postingAcceptResponsePartners",
    "postingAcceptResponseDetails"
})
public class PostingAcceptResponseBodyType {

    @XmlElement(name = "PostingAcceptResponseProperties", required = true)
    protected PostingAcceptResponsePropertiesType postingAcceptResponseProperties;
    @XmlElement(name = "PostingAcceptResponsePartners")
    protected PostingAcceptResponsePartnersType postingAcceptResponsePartners;
    @XmlElement(name = "PostingAcceptResponseDetails")
    protected PostingAcceptResponseDetailsType postingAcceptResponseDetails;

    /**
     * Gets the value of the postingAcceptResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PostingAcceptResponsePropertiesType }
     *     
     */
    public PostingAcceptResponsePropertiesType getPostingAcceptResponseProperties() {
        return postingAcceptResponseProperties;
    }

    /**
     * Sets the value of the postingAcceptResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingAcceptResponsePropertiesType }
     *     
     */
    public void setPostingAcceptResponseProperties(PostingAcceptResponsePropertiesType value) {
        this.postingAcceptResponseProperties = value;
    }

    /**
     * Gets the value of the postingAcceptResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link PostingAcceptResponsePartnersType }
     *     
     */
    public PostingAcceptResponsePartnersType getPostingAcceptResponsePartners() {
        return postingAcceptResponsePartners;
    }

    /**
     * Sets the value of the postingAcceptResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingAcceptResponsePartnersType }
     *     
     */
    public void setPostingAcceptResponsePartners(PostingAcceptResponsePartnersType value) {
        this.postingAcceptResponsePartners = value;
    }

    /**
     * Gets the value of the postingAcceptResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PostingAcceptResponseDetailsType }
     *     
     */
    public PostingAcceptResponseDetailsType getPostingAcceptResponseDetails() {
        return postingAcceptResponseDetails;
    }

    /**
     * Sets the value of the postingAcceptResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingAcceptResponseDetailsType }
     *     
     */
    public void setPostingAcceptResponseDetails(PostingAcceptResponseDetailsType value) {
        this.postingAcceptResponseDetails = value;
    }

}

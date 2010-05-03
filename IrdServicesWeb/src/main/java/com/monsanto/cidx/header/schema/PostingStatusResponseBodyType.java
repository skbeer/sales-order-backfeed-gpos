
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingStatusResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingStatusResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingStatusResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingStatusResponsePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingStatusResponseDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingStatusResponseBodyType", propOrder = {
    "postingStatusResponseProperties",
    "postingStatusResponsePartners",
    "postingStatusResponseDetails"
})
public class PostingStatusResponseBodyType {

    @XmlElement(name = "PostingStatusResponseProperties", required = true)
    protected PostingStatusResponsePropertiesType postingStatusResponseProperties;
    @XmlElement(name = "PostingStatusResponsePartners", required = true)
    protected PostingStatusResponsePartnersType postingStatusResponsePartners;
    @XmlElement(name = "PostingStatusResponseDetails")
    protected PostingStatusResponseDetailsType postingStatusResponseDetails;

    /**
     * Gets the value of the postingStatusResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PostingStatusResponsePropertiesType }
     *     
     */
    public PostingStatusResponsePropertiesType getPostingStatusResponseProperties() {
        return postingStatusResponseProperties;
    }

    /**
     * Sets the value of the postingStatusResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingStatusResponsePropertiesType }
     *     
     */
    public void setPostingStatusResponseProperties(PostingStatusResponsePropertiesType value) {
        this.postingStatusResponseProperties = value;
    }

    /**
     * Gets the value of the postingStatusResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link PostingStatusResponsePartnersType }
     *     
     */
    public PostingStatusResponsePartnersType getPostingStatusResponsePartners() {
        return postingStatusResponsePartners;
    }

    /**
     * Sets the value of the postingStatusResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingStatusResponsePartnersType }
     *     
     */
    public void setPostingStatusResponsePartners(PostingStatusResponsePartnersType value) {
        this.postingStatusResponsePartners = value;
    }

    /**
     * Gets the value of the postingStatusResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PostingStatusResponseDetailsType }
     *     
     */
    public PostingStatusResponseDetailsType getPostingStatusResponseDetails() {
        return postingStatusResponseDetails;
    }

    /**
     * Sets the value of the postingStatusResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingStatusResponseDetailsType }
     *     
     */
    public void setPostingStatusResponseDetails(PostingStatusResponseDetailsType value) {
        this.postingStatusResponseDetails = value;
    }

}

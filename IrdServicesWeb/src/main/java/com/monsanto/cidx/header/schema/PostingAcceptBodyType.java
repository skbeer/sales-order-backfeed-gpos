
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingAcceptBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingAcceptBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingAcceptProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingAcceptPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingAcceptDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingAcceptBodyType", propOrder = {
    "postingAcceptProperties",
    "postingAcceptPartners",
    "postingAcceptDetails"
})
public class PostingAcceptBodyType {

    @XmlElement(name = "PostingAcceptProperties", required = true)
    protected PostingAcceptPropertiesType postingAcceptProperties;
    @XmlElement(name = "PostingAcceptPartners", required = true)
    protected PostingAcceptPartnersType postingAcceptPartners;
    @XmlElement(name = "PostingAcceptDetails", required = true)
    protected PostingAcceptDetailsType postingAcceptDetails;

    /**
     * Gets the value of the postingAcceptProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PostingAcceptPropertiesType }
     *     
     */
    public PostingAcceptPropertiesType getPostingAcceptProperties() {
        return postingAcceptProperties;
    }

    /**
     * Sets the value of the postingAcceptProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingAcceptPropertiesType }
     *     
     */
    public void setPostingAcceptProperties(PostingAcceptPropertiesType value) {
        this.postingAcceptProperties = value;
    }

    /**
     * Gets the value of the postingAcceptPartners property.
     * 
     * @return
     *     possible object is
     *     {@link PostingAcceptPartnersType }
     *     
     */
    public PostingAcceptPartnersType getPostingAcceptPartners() {
        return postingAcceptPartners;
    }

    /**
     * Sets the value of the postingAcceptPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingAcceptPartnersType }
     *     
     */
    public void setPostingAcceptPartners(PostingAcceptPartnersType value) {
        this.postingAcceptPartners = value;
    }

    /**
     * Gets the value of the postingAcceptDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PostingAcceptDetailsType }
     *     
     */
    public PostingAcceptDetailsType getPostingAcceptDetails() {
        return postingAcceptDetails;
    }

    /**
     * Sets the value of the postingAcceptDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingAcceptDetailsType }
     *     
     */
    public void setPostingAcceptDetails(PostingAcceptDetailsType value) {
        this.postingAcceptDetails = value;
    }

}

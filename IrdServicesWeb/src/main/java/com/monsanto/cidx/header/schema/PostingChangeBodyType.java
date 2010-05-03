
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingChangeBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingChangeBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingChangeProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingChangePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingChangeDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingChangeBodyType", propOrder = {
    "postingChangeProperties",
    "postingChangePartners",
    "postingChangeDetails"
})
public class PostingChangeBodyType {

    @XmlElement(name = "PostingChangeProperties", required = true)
    protected PostingChangePropertiesType postingChangeProperties;
    @XmlElement(name = "PostingChangePartners", required = true)
    protected PostingChangePartnersType postingChangePartners;
    @XmlElement(name = "PostingChangeDetails", required = true)
    protected PostingChangeDetailsType postingChangeDetails;

    /**
     * Gets the value of the postingChangeProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PostingChangePropertiesType }
     *     
     */
    public PostingChangePropertiesType getPostingChangeProperties() {
        return postingChangeProperties;
    }

    /**
     * Sets the value of the postingChangeProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingChangePropertiesType }
     *     
     */
    public void setPostingChangeProperties(PostingChangePropertiesType value) {
        this.postingChangeProperties = value;
    }

    /**
     * Gets the value of the postingChangePartners property.
     * 
     * @return
     *     possible object is
     *     {@link PostingChangePartnersType }
     *     
     */
    public PostingChangePartnersType getPostingChangePartners() {
        return postingChangePartners;
    }

    /**
     * Sets the value of the postingChangePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingChangePartnersType }
     *     
     */
    public void setPostingChangePartners(PostingChangePartnersType value) {
        this.postingChangePartners = value;
    }

    /**
     * Gets the value of the postingChangeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PostingChangeDetailsType }
     *     
     */
    public PostingChangeDetailsType getPostingChangeDetails() {
        return postingChangeDetails;
    }

    /**
     * Sets the value of the postingChangeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingChangeDetailsType }
     *     
     */
    public void setPostingChangeDetails(PostingChangeDetailsType value) {
        this.postingChangeDetails = value;
    }

}

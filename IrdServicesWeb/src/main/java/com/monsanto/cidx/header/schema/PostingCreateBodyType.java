
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingCreateBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingCreateBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingCreateProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingCreatePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostingCreateDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingCreateBodyType", propOrder = {
    "postingCreateProperties",
    "postingCreatePartners",
    "postingCreateDetails"
})
public class PostingCreateBodyType {

    @XmlElement(name = "PostingCreateProperties", required = true)
    protected PostingCreatePropertiesType postingCreateProperties;
    @XmlElement(name = "PostingCreatePartners", required = true)
    protected PostingCreatePartnersType postingCreatePartners;
    @XmlElement(name = "PostingCreateDetails", required = true)
    protected PostingCreateDetailsType postingCreateDetails;

    /**
     * Gets the value of the postingCreateProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PostingCreatePropertiesType }
     *     
     */
    public PostingCreatePropertiesType getPostingCreateProperties() {
        return postingCreateProperties;
    }

    /**
     * Sets the value of the postingCreateProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingCreatePropertiesType }
     *     
     */
    public void setPostingCreateProperties(PostingCreatePropertiesType value) {
        this.postingCreateProperties = value;
    }

    /**
     * Gets the value of the postingCreatePartners property.
     * 
     * @return
     *     possible object is
     *     {@link PostingCreatePartnersType }
     *     
     */
    public PostingCreatePartnersType getPostingCreatePartners() {
        return postingCreatePartners;
    }

    /**
     * Sets the value of the postingCreatePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingCreatePartnersType }
     *     
     */
    public void setPostingCreatePartners(PostingCreatePartnersType value) {
        this.postingCreatePartners = value;
    }

    /**
     * Gets the value of the postingCreateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PostingCreateDetailsType }
     *     
     */
    public PostingCreateDetailsType getPostingCreateDetails() {
        return postingCreateDetails;
    }

    /**
     * Sets the value of the postingCreateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingCreateDetailsType }
     *     
     */
    public void setPostingCreateDetails(PostingCreateDetailsType value) {
        this.postingCreateDetails = value;
    }

}

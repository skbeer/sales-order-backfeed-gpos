
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceAndAvailabilityResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceAndAvailabilityResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceAndAvailabilityResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceAndAvailabilityResponsePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceAndAvailabilityResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceAndAvailabilityResponseBodyType", propOrder = {
    "priceAndAvailabilityResponseProperties",
    "priceAndAvailabilityResponsePartners",
    "priceAndAvailabilityResponseDetails"
})
public class PriceAndAvailabilityResponseBodyType {

    @XmlElement(name = "PriceAndAvailabilityResponseProperties", required = true)
    protected PriceAndAvailabilityResponsePropertiesType priceAndAvailabilityResponseProperties;
    @XmlElement(name = "PriceAndAvailabilityResponsePartners", required = true)
    protected PriceAndAvailabilityResponsePartnersType priceAndAvailabilityResponsePartners;
    @XmlElement(name = "PriceAndAvailabilityResponseDetails", required = true)
    protected PriceAndAvailabilityResponseDetailsType priceAndAvailabilityResponseDetails;

    /**
     * Gets the value of the priceAndAvailabilityResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PriceAndAvailabilityResponsePropertiesType }
     *     
     */
    public PriceAndAvailabilityResponsePropertiesType getPriceAndAvailabilityResponseProperties() {
        return priceAndAvailabilityResponseProperties;
    }

    /**
     * Sets the value of the priceAndAvailabilityResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAndAvailabilityResponsePropertiesType }
     *     
     */
    public void setPriceAndAvailabilityResponseProperties(PriceAndAvailabilityResponsePropertiesType value) {
        this.priceAndAvailabilityResponseProperties = value;
    }

    /**
     * Gets the value of the priceAndAvailabilityResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link PriceAndAvailabilityResponsePartnersType }
     *     
     */
    public PriceAndAvailabilityResponsePartnersType getPriceAndAvailabilityResponsePartners() {
        return priceAndAvailabilityResponsePartners;
    }

    /**
     * Sets the value of the priceAndAvailabilityResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAndAvailabilityResponsePartnersType }
     *     
     */
    public void setPriceAndAvailabilityResponsePartners(PriceAndAvailabilityResponsePartnersType value) {
        this.priceAndAvailabilityResponsePartners = value;
    }

    /**
     * Gets the value of the priceAndAvailabilityResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PriceAndAvailabilityResponseDetailsType }
     *     
     */
    public PriceAndAvailabilityResponseDetailsType getPriceAndAvailabilityResponseDetails() {
        return priceAndAvailabilityResponseDetails;
    }

    /**
     * Sets the value of the priceAndAvailabilityResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAndAvailabilityResponseDetailsType }
     *     
     */
    public void setPriceAndAvailabilityResponseDetails(PriceAndAvailabilityResponseDetailsType value) {
        this.priceAndAvailabilityResponseDetails = value;
    }

}

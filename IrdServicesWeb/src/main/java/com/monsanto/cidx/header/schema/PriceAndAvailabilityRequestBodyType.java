
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceAndAvailabilityRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceAndAvailabilityRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceAndAvailabilityRequestProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceAndAvailabilityRequestPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceAndAvailabilityRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceAndAvailabilityRequestBodyType", propOrder = {
    "priceAndAvailabilityRequestProperties",
    "priceAndAvailabilityRequestPartners",
    "priceAndAvailabilityRequestDetails"
})
public class PriceAndAvailabilityRequestBodyType {

    @XmlElement(name = "PriceAndAvailabilityRequestProperties", required = true)
    protected PriceAndAvailabilityRequestPropertiesType priceAndAvailabilityRequestProperties;
    @XmlElement(name = "PriceAndAvailabilityRequestPartners", required = true)
    protected PriceAndAvailabilityRequestPartnersType priceAndAvailabilityRequestPartners;
    @XmlElement(name = "PriceAndAvailabilityRequestDetails", required = true)
    protected PriceAndAvailabilityRequestDetailsType priceAndAvailabilityRequestDetails;

    /**
     * Gets the value of the priceAndAvailabilityRequestProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PriceAndAvailabilityRequestPropertiesType }
     *     
     */
    public PriceAndAvailabilityRequestPropertiesType getPriceAndAvailabilityRequestProperties() {
        return priceAndAvailabilityRequestProperties;
    }

    /**
     * Sets the value of the priceAndAvailabilityRequestProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAndAvailabilityRequestPropertiesType }
     *     
     */
    public void setPriceAndAvailabilityRequestProperties(PriceAndAvailabilityRequestPropertiesType value) {
        this.priceAndAvailabilityRequestProperties = value;
    }

    /**
     * Gets the value of the priceAndAvailabilityRequestPartners property.
     * 
     * @return
     *     possible object is
     *     {@link PriceAndAvailabilityRequestPartnersType }
     *     
     */
    public PriceAndAvailabilityRequestPartnersType getPriceAndAvailabilityRequestPartners() {
        return priceAndAvailabilityRequestPartners;
    }

    /**
     * Sets the value of the priceAndAvailabilityRequestPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAndAvailabilityRequestPartnersType }
     *     
     */
    public void setPriceAndAvailabilityRequestPartners(PriceAndAvailabilityRequestPartnersType value) {
        this.priceAndAvailabilityRequestPartners = value;
    }

    /**
     * Gets the value of the priceAndAvailabilityRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PriceAndAvailabilityRequestDetailsType }
     *     
     */
    public PriceAndAvailabilityRequestDetailsType getPriceAndAvailabilityRequestDetails() {
        return priceAndAvailabilityRequestDetails;
    }

    /**
     * Sets the value of the priceAndAvailabilityRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAndAvailabilityRequestDetailsType }
     *     
     */
    public void setPriceAndAvailabilityRequestDetails(PriceAndAvailabilityRequestDetailsType value) {
        this.priceAndAvailabilityRequestDetails = value;
    }

}

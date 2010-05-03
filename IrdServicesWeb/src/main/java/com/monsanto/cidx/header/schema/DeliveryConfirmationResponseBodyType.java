
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryConfirmationResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryConfirmationResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryConfirmationResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryConfirmationResponsePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryConfirmationResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryConfirmationResponseBodyType", propOrder = {
    "deliveryConfirmationResponseProperties",
    "deliveryConfirmationResponsePartners",
    "deliveryConfirmationResponseDetails"
})
public class DeliveryConfirmationResponseBodyType {

    @XmlElement(name = "DeliveryConfirmationResponseProperties", required = true)
    protected DeliveryConfirmationResponsePropertiesType deliveryConfirmationResponseProperties;
    @XmlElement(name = "DeliveryConfirmationResponsePartners", required = true)
    protected DeliveryConfirmationResponsePartnersType deliveryConfirmationResponsePartners;
    @XmlElement(name = "DeliveryConfirmationResponseDetails", required = true)
    protected DeliveryConfirmationResponseDetailsType deliveryConfirmationResponseDetails;

    /**
     * Gets the value of the deliveryConfirmationResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryConfirmationResponsePropertiesType }
     *     
     */
    public DeliveryConfirmationResponsePropertiesType getDeliveryConfirmationResponseProperties() {
        return deliveryConfirmationResponseProperties;
    }

    /**
     * Sets the value of the deliveryConfirmationResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryConfirmationResponsePropertiesType }
     *     
     */
    public void setDeliveryConfirmationResponseProperties(DeliveryConfirmationResponsePropertiesType value) {
        this.deliveryConfirmationResponseProperties = value;
    }

    /**
     * Gets the value of the deliveryConfirmationResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryConfirmationResponsePartnersType }
     *     
     */
    public DeliveryConfirmationResponsePartnersType getDeliveryConfirmationResponsePartners() {
        return deliveryConfirmationResponsePartners;
    }

    /**
     * Sets the value of the deliveryConfirmationResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryConfirmationResponsePartnersType }
     *     
     */
    public void setDeliveryConfirmationResponsePartners(DeliveryConfirmationResponsePartnersType value) {
        this.deliveryConfirmationResponsePartners = value;
    }

    /**
     * Gets the value of the deliveryConfirmationResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryConfirmationResponseDetailsType }
     *     
     */
    public DeliveryConfirmationResponseDetailsType getDeliveryConfirmationResponseDetails() {
        return deliveryConfirmationResponseDetails;
    }

    /**
     * Sets the value of the deliveryConfirmationResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryConfirmationResponseDetailsType }
     *     
     */
    public void setDeliveryConfirmationResponseDetails(DeliveryConfirmationResponseDetailsType value) {
        this.deliveryConfirmationResponseDetails = value;
    }

}

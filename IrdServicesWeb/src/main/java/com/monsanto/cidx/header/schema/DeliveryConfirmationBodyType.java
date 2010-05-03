
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryConfirmationBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryConfirmationBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryConfirmationProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryConfirmationPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryConfirmationDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryConfirmationBodyType", propOrder = {
    "deliveryConfirmationProperties",
    "deliveryConfirmationPartners",
    "deliveryConfirmationDetails"
})
public class DeliveryConfirmationBodyType {

    @XmlElement(name = "DeliveryConfirmationProperties", required = true)
    protected DeliveryConfirmationPropertiesType deliveryConfirmationProperties;
    @XmlElement(name = "DeliveryConfirmationPartners", required = true)
    protected DeliveryConfirmationPartnersType deliveryConfirmationPartners;
    @XmlElement(name = "DeliveryConfirmationDetails", required = true)
    protected DeliveryConfirmationDetailsType deliveryConfirmationDetails;

    /**
     * Gets the value of the deliveryConfirmationProperties property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryConfirmationPropertiesType }
     *     
     */
    public DeliveryConfirmationPropertiesType getDeliveryConfirmationProperties() {
        return deliveryConfirmationProperties;
    }

    /**
     * Sets the value of the deliveryConfirmationProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryConfirmationPropertiesType }
     *     
     */
    public void setDeliveryConfirmationProperties(DeliveryConfirmationPropertiesType value) {
        this.deliveryConfirmationProperties = value;
    }

    /**
     * Gets the value of the deliveryConfirmationPartners property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryConfirmationPartnersType }
     *     
     */
    public DeliveryConfirmationPartnersType getDeliveryConfirmationPartners() {
        return deliveryConfirmationPartners;
    }

    /**
     * Sets the value of the deliveryConfirmationPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryConfirmationPartnersType }
     *     
     */
    public void setDeliveryConfirmationPartners(DeliveryConfirmationPartnersType value) {
        this.deliveryConfirmationPartners = value;
    }

    /**
     * Gets the value of the deliveryConfirmationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryConfirmationDetailsType }
     *     
     */
    public DeliveryConfirmationDetailsType getDeliveryConfirmationDetails() {
        return deliveryConfirmationDetails;
    }

    /**
     * Sets the value of the deliveryConfirmationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryConfirmationDetailsType }
     *     
     */
    public void setDeliveryConfirmationDetails(DeliveryConfirmationDetailsType value) {
        this.deliveryConfirmationDetails = value;
    }

}

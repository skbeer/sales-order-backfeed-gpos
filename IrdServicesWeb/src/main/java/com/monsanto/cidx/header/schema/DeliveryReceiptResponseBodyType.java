
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryReceiptResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryReceiptResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryReceiptResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryReceiptResponsePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryReceiptResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryReceiptResponseBodyType", propOrder = {
    "deliveryReceiptResponseProperties",
    "deliveryReceiptResponsePartners",
    "deliveryReceiptResponseDetails"
})
public class DeliveryReceiptResponseBodyType {

    @XmlElement(name = "DeliveryReceiptResponseProperties", required = true)
    protected DeliveryReceiptResponsePropertiesType deliveryReceiptResponseProperties;
    @XmlElement(name = "DeliveryReceiptResponsePartners", required = true)
    protected DeliveryReceiptResponsePartnersType deliveryReceiptResponsePartners;
    @XmlElement(name = "DeliveryReceiptResponseDetails", required = true)
    protected DeliveryReceiptResponseDetailsType deliveryReceiptResponseDetails;

    /**
     * Gets the value of the deliveryReceiptResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptResponsePropertiesType }
     *     
     */
    public DeliveryReceiptResponsePropertiesType getDeliveryReceiptResponseProperties() {
        return deliveryReceiptResponseProperties;
    }

    /**
     * Sets the value of the deliveryReceiptResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptResponsePropertiesType }
     *     
     */
    public void setDeliveryReceiptResponseProperties(DeliveryReceiptResponsePropertiesType value) {
        this.deliveryReceiptResponseProperties = value;
    }

    /**
     * Gets the value of the deliveryReceiptResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptResponsePartnersType }
     *     
     */
    public DeliveryReceiptResponsePartnersType getDeliveryReceiptResponsePartners() {
        return deliveryReceiptResponsePartners;
    }

    /**
     * Sets the value of the deliveryReceiptResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptResponsePartnersType }
     *     
     */
    public void setDeliveryReceiptResponsePartners(DeliveryReceiptResponsePartnersType value) {
        this.deliveryReceiptResponsePartners = value;
    }

    /**
     * Gets the value of the deliveryReceiptResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptResponseDetailsType }
     *     
     */
    public DeliveryReceiptResponseDetailsType getDeliveryReceiptResponseDetails() {
        return deliveryReceiptResponseDetails;
    }

    /**
     * Sets the value of the deliveryReceiptResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptResponseDetailsType }
     *     
     */
    public void setDeliveryReceiptResponseDetails(DeliveryReceiptResponseDetailsType value) {
        this.deliveryReceiptResponseDetails = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryReceiptBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryReceiptBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryReceiptProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryReceiptPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryReceiptDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryReceiptBodyType", propOrder = {
    "deliveryReceiptProperties",
    "deliveryReceiptPartners",
    "deliveryReceiptDetails"
})
public class DeliveryReceiptBodyType {

    @XmlElement(name = "DeliveryReceiptProperties", required = true)
    protected DeliveryReceiptPropertiesType deliveryReceiptProperties;
    @XmlElement(name = "DeliveryReceiptPartners", required = true)
    protected DeliveryReceiptPartnersType deliveryReceiptPartners;
    @XmlElement(name = "DeliveryReceiptDetails", required = true)
    protected DeliveryReceiptDetailsType deliveryReceiptDetails;

    /**
     * Gets the value of the deliveryReceiptProperties property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptPropertiesType }
     *     
     */
    public DeliveryReceiptPropertiesType getDeliveryReceiptProperties() {
        return deliveryReceiptProperties;
    }

    /**
     * Sets the value of the deliveryReceiptProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptPropertiesType }
     *     
     */
    public void setDeliveryReceiptProperties(DeliveryReceiptPropertiesType value) {
        this.deliveryReceiptProperties = value;
    }

    /**
     * Gets the value of the deliveryReceiptPartners property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptPartnersType }
     *     
     */
    public DeliveryReceiptPartnersType getDeliveryReceiptPartners() {
        return deliveryReceiptPartners;
    }

    /**
     * Sets the value of the deliveryReceiptPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptPartnersType }
     *     
     */
    public void setDeliveryReceiptPartners(DeliveryReceiptPartnersType value) {
        this.deliveryReceiptPartners = value;
    }

    /**
     * Gets the value of the deliveryReceiptDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptDetailsType }
     *     
     */
    public DeliveryReceiptDetailsType getDeliveryReceiptDetails() {
        return deliveryReceiptDetails;
    }

    /**
     * Sets the value of the deliveryReceiptDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptDetailsType }
     *     
     */
    public void setDeliveryReceiptDetails(DeliveryReceiptDetailsType value) {
        this.deliveryReceiptDetails = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortDeliveryPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortDeliveryPointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryPoint"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortDeliveryPointType", propOrder = {
    "deliveryPoint"
})
public class PortDeliveryPointType {

    @XmlElement(name = "DeliveryPoint", required = true)
    protected DeliveryPointType deliveryPoint;

    /**
     * Gets the value of the deliveryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryPointType }
     *     
     */
    public DeliveryPointType getDeliveryPoint() {
        return deliveryPoint;
    }

    /**
     * Sets the value of the deliveryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryPointType }
     *     
     */
    public void setDeliveryPoint(DeliveryPointType value) {
        this.deliveryPoint = value;
    }

}

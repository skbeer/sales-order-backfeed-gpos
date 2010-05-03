
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentInstructionsBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentInstructionsBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentInstructionsProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentInstructionsPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentInstructionsDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentInstructionsBodyType", propOrder = {
    "shipmentInstructionsProperties",
    "shipmentInstructionsPartners",
    "shipmentInstructionsDetails"
})
public class ShipmentInstructionsBodyType {

    @XmlElement(name = "ShipmentInstructionsProperties", required = true)
    protected ShipmentInstructionsPropertiesType shipmentInstructionsProperties;
    @XmlElement(name = "ShipmentInstructionsPartners", required = true)
    protected ShipmentInstructionsPartnersType shipmentInstructionsPartners;
    @XmlElement(name = "ShipmentInstructionsDetails", required = true)
    protected ShipmentInstructionsDetailsType shipmentInstructionsDetails;

    /**
     * Gets the value of the shipmentInstructionsProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentInstructionsPropertiesType }
     *     
     */
    public ShipmentInstructionsPropertiesType getShipmentInstructionsProperties() {
        return shipmentInstructionsProperties;
    }

    /**
     * Sets the value of the shipmentInstructionsProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentInstructionsPropertiesType }
     *     
     */
    public void setShipmentInstructionsProperties(ShipmentInstructionsPropertiesType value) {
        this.shipmentInstructionsProperties = value;
    }

    /**
     * Gets the value of the shipmentInstructionsPartners property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentInstructionsPartnersType }
     *     
     */
    public ShipmentInstructionsPartnersType getShipmentInstructionsPartners() {
        return shipmentInstructionsPartners;
    }

    /**
     * Sets the value of the shipmentInstructionsPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentInstructionsPartnersType }
     *     
     */
    public void setShipmentInstructionsPartners(ShipmentInstructionsPartnersType value) {
        this.shipmentInstructionsPartners = value;
    }

    /**
     * Gets the value of the shipmentInstructionsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentInstructionsDetailsType }
     *     
     */
    public ShipmentInstructionsDetailsType getShipmentInstructionsDetails() {
        return shipmentInstructionsDetails;
    }

    /**
     * Sets the value of the shipmentInstructionsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentInstructionsDetailsType }
     *     
     */
    public void setShipmentInstructionsDetails(ShipmentInstructionsDetailsType value) {
        this.shipmentInstructionsDetails = value;
    }

}


package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentStatusBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentStatusBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentStatusProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentStatusPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentStatusDetails" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentStatusBodyType", propOrder = {
    "shipmentStatusProperties",
    "shipmentStatusPartners",
    "shipmentStatusDetails"
})
public class ShipmentStatusBodyType {

    @XmlElement(name = "ShipmentStatusProperties", required = true)
    protected ShipmentStatusPropertiesType shipmentStatusProperties;
    @XmlElement(name = "ShipmentStatusPartners", required = true)
    protected ShipmentStatusPartnersType shipmentStatusPartners;
    @XmlElement(name = "ShipmentStatusDetails", required = true)
    protected List<ShipmentStatusDetailsType> shipmentStatusDetails;

    /**
     * Gets the value of the shipmentStatusProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentStatusPropertiesType }
     *     
     */
    public ShipmentStatusPropertiesType getShipmentStatusProperties() {
        return shipmentStatusProperties;
    }

    /**
     * Sets the value of the shipmentStatusProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentStatusPropertiesType }
     *     
     */
    public void setShipmentStatusProperties(ShipmentStatusPropertiesType value) {
        this.shipmentStatusProperties = value;
    }

    /**
     * Gets the value of the shipmentStatusPartners property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentStatusPartnersType }
     *     
     */
    public ShipmentStatusPartnersType getShipmentStatusPartners() {
        return shipmentStatusPartners;
    }

    /**
     * Sets the value of the shipmentStatusPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentStatusPartnersType }
     *     
     */
    public void setShipmentStatusPartners(ShipmentStatusPartnersType value) {
        this.shipmentStatusPartners = value;
    }

    /**
     * Gets the value of the shipmentStatusDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentStatusDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentStatusDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStatusDetailsType }
     * 
     * 
     */
    public List<ShipmentStatusDetailsType> getShipmentStatusDetails() {
        if (shipmentStatusDetails == null) {
            shipmentStatusDetails = new ArrayList<ShipmentStatusDetailsType>();
        }
        return this.shipmentStatusDetails;
    }

}

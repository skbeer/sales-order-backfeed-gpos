
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentStatusRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentStatusRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentStatusRequestProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentStatusRequestPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentStatusRequestDetails" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentStatusRequestBodyType", propOrder = {
    "shipmentStatusRequestProperties",
    "shipmentStatusRequestPartners",
    "shipmentStatusRequestDetails"
})
public class ShipmentStatusRequestBodyType {

    @XmlElement(name = "ShipmentStatusRequestProperties", required = true)
    protected ShipmentStatusRequestPropertiesType shipmentStatusRequestProperties;
    @XmlElement(name = "ShipmentStatusRequestPartners", required = true)
    protected ShipmentStatusRequestPartnersType shipmentStatusRequestPartners;
    @XmlElement(name = "ShipmentStatusRequestDetails", required = true)
    protected List<ShipmentStatusRequestDetailsType> shipmentStatusRequestDetails;

    /**
     * Gets the value of the shipmentStatusRequestProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentStatusRequestPropertiesType }
     *     
     */
    public ShipmentStatusRequestPropertiesType getShipmentStatusRequestProperties() {
        return shipmentStatusRequestProperties;
    }

    /**
     * Sets the value of the shipmentStatusRequestProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentStatusRequestPropertiesType }
     *     
     */
    public void setShipmentStatusRequestProperties(ShipmentStatusRequestPropertiesType value) {
        this.shipmentStatusRequestProperties = value;
    }

    /**
     * Gets the value of the shipmentStatusRequestPartners property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentStatusRequestPartnersType }
     *     
     */
    public ShipmentStatusRequestPartnersType getShipmentStatusRequestPartners() {
        return shipmentStatusRequestPartners;
    }

    /**
     * Sets the value of the shipmentStatusRequestPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentStatusRequestPartnersType }
     *     
     */
    public void setShipmentStatusRequestPartners(ShipmentStatusRequestPartnersType value) {
        this.shipmentStatusRequestPartners = value;
    }

    /**
     * Gets the value of the shipmentStatusRequestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentStatusRequestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentStatusRequestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStatusRequestDetailsType }
     * 
     * 
     */
    public List<ShipmentStatusRequestDetailsType> getShipmentStatusRequestDetails() {
        if (shipmentStatusRequestDetails == null) {
            shipmentStatusRequestDetails = new ArrayList<ShipmentStatusRequestDetailsType>();
        }
        return this.shipmentStatusRequestDetails;
    }

}

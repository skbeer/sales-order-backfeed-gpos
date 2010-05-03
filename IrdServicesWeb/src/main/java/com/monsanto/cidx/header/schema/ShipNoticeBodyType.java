
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipNoticeBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipNoticeBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipNoticeProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipNoticePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipNoticeDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipNoticeBodyType", propOrder = {
    "shipNoticeProperties",
    "shipNoticePartners",
    "shipNoticeDetails"
})
public class ShipNoticeBodyType {

    @XmlElement(name = "ShipNoticeProperties", required = true)
    protected ShipNoticePropertiesType shipNoticeProperties;
    @XmlElement(name = "ShipNoticePartners", required = true)
    protected ShipNoticePartnersType shipNoticePartners;
    @XmlElement(name = "ShipNoticeDetails", required = true)
    protected ShipNoticeDetailsType shipNoticeDetails;

    /**
     * Gets the value of the shipNoticeProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ShipNoticePropertiesType }
     *     
     */
    public ShipNoticePropertiesType getShipNoticeProperties() {
        return shipNoticeProperties;
    }

    /**
     * Sets the value of the shipNoticeProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipNoticePropertiesType }
     *     
     */
    public void setShipNoticeProperties(ShipNoticePropertiesType value) {
        this.shipNoticeProperties = value;
    }

    /**
     * Gets the value of the shipNoticePartners property.
     * 
     * @return
     *     possible object is
     *     {@link ShipNoticePartnersType }
     *     
     */
    public ShipNoticePartnersType getShipNoticePartners() {
        return shipNoticePartners;
    }

    /**
     * Sets the value of the shipNoticePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipNoticePartnersType }
     *     
     */
    public void setShipNoticePartners(ShipNoticePartnersType value) {
        this.shipNoticePartners = value;
    }

    /**
     * Gets the value of the shipNoticeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ShipNoticeDetailsType }
     *     
     */
    public ShipNoticeDetailsType getShipNoticeDetails() {
        return shipNoticeDetails;
    }

    /**
     * Sets the value of the shipNoticeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipNoticeDetailsType }
     *     
     */
    public void setShipNoticeDetails(ShipNoticeDetailsType value) {
        this.shipNoticeDetails = value;
    }

}

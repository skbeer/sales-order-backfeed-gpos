
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipNoticeListBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipNoticeListBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipNoticeListProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipNoticeListDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipNoticeListBodyType", propOrder = {
    "shipNoticeListProperties",
    "shipNoticeListDetails"
})
public class ShipNoticeListBodyType {

    @XmlElement(name = "ShipNoticeListProperties", required = true)
    protected ShipNoticeListPropertiesType shipNoticeListProperties;
    @XmlElement(name = "ShipNoticeListDetails", required = true)
    protected ShipNoticeListDetailsType shipNoticeListDetails;

    /**
     * Gets the value of the shipNoticeListProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ShipNoticeListPropertiesType }
     *     
     */
    public ShipNoticeListPropertiesType getShipNoticeListProperties() {
        return shipNoticeListProperties;
    }

    /**
     * Sets the value of the shipNoticeListProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipNoticeListPropertiesType }
     *     
     */
    public void setShipNoticeListProperties(ShipNoticeListPropertiesType value) {
        this.shipNoticeListProperties = value;
    }

    /**
     * Gets the value of the shipNoticeListDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ShipNoticeListDetailsType }
     *     
     */
    public ShipNoticeListDetailsType getShipNoticeListDetails() {
        return shipNoticeListDetails;
    }

    /**
     * Sets the value of the shipNoticeListDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipNoticeListDetailsType }
     *     
     */
    public void setShipNoticeListDetails(ShipNoticeListDetailsType value) {
        this.shipNoticeListDetails = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipNoticeListRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipNoticeListRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipNoticeListRequestProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipNoticeListRequestPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipNoticeListRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipNoticeListRequestBodyType", propOrder = {
    "shipNoticeListRequestProperties",
    "shipNoticeListRequestPartners",
    "shipNoticeListRequestDetails"
})
public class ShipNoticeListRequestBodyType {

    @XmlElement(name = "ShipNoticeListRequestProperties", required = true)
    protected ShipNoticeListRequestPropertiesType shipNoticeListRequestProperties;
    @XmlElement(name = "ShipNoticeListRequestPartners", required = true)
    protected ShipNoticeListRequestPartnersType shipNoticeListRequestPartners;
    @XmlElement(name = "ShipNoticeListRequestDetails", required = true)
    protected ShipNoticeListRequestDetailsType shipNoticeListRequestDetails;

    /**
     * Gets the value of the shipNoticeListRequestProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ShipNoticeListRequestPropertiesType }
     *     
     */
    public ShipNoticeListRequestPropertiesType getShipNoticeListRequestProperties() {
        return shipNoticeListRequestProperties;
    }

    /**
     * Sets the value of the shipNoticeListRequestProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipNoticeListRequestPropertiesType }
     *     
     */
    public void setShipNoticeListRequestProperties(ShipNoticeListRequestPropertiesType value) {
        this.shipNoticeListRequestProperties = value;
    }

    /**
     * Gets the value of the shipNoticeListRequestPartners property.
     * 
     * @return
     *     possible object is
     *     {@link ShipNoticeListRequestPartnersType }
     *     
     */
    public ShipNoticeListRequestPartnersType getShipNoticeListRequestPartners() {
        return shipNoticeListRequestPartners;
    }

    /**
     * Sets the value of the shipNoticeListRequestPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipNoticeListRequestPartnersType }
     *     
     */
    public void setShipNoticeListRequestPartners(ShipNoticeListRequestPartnersType value) {
        this.shipNoticeListRequestPartners = value;
    }

    /**
     * Gets the value of the shipNoticeListRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ShipNoticeListRequestDetailsType }
     *     
     */
    public ShipNoticeListRequestDetailsType getShipNoticeListRequestDetails() {
        return shipNoticeListRequestDetails;
    }

    /**
     * Sets the value of the shipNoticeListRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipNoticeListRequestDetailsType }
     *     
     */
    public void setShipNoticeListRequestDetails(ShipNoticeListRequestDetailsType value) {
        this.shipNoticeListRequestDetails = value;
    }

}

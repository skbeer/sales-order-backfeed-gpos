
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceZoneGeographyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceZoneGeographyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceZone"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ZoneGeographies"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceZoneGeographyType", propOrder = {
    "priceZone",
    "zoneGeographies"
})
public class PriceZoneGeographyType {

    @XmlElement(name = "PriceZone", required = true)
    protected PriceZoneType priceZone;
    @XmlElement(name = "ZoneGeographies", required = true)
    protected ZoneGeographiesType zoneGeographies;

    /**
     * Gets the value of the priceZone property.
     * 
     * @return
     *     possible object is
     *     {@link PriceZoneType }
     *     
     */
    public PriceZoneType getPriceZone() {
        return priceZone;
    }

    /**
     * Sets the value of the priceZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceZoneType }
     *     
     */
    public void setPriceZone(PriceZoneType value) {
        this.priceZone = value;
    }

    /**
     * Gets the value of the zoneGeographies property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneGeographiesType }
     *     
     */
    public ZoneGeographiesType getZoneGeographies() {
        return zoneGeographies;
    }

    /**
     * Sets the value of the zoneGeographies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneGeographiesType }
     *     
     */
    public void setZoneGeographies(ZoneGeographiesType value) {
        this.zoneGeographies = value;
    }

}

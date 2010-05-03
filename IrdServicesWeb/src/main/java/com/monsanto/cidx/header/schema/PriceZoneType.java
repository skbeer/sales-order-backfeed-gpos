
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PriceZoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceZoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ZoneID"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ZoneType"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ZoneName" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EffectiveDates" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceZoneType", propOrder = {
    "zoneID",
    "zoneType",
    "zoneName",
    "effectiveDates"
})
public class PriceZoneType {

    @XmlElement(name = "ZoneID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String zoneID;
    @XmlElement(name = "ZoneType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String zoneType;
    @XmlElement(name = "ZoneName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String zoneName;
    @XmlElement(name = "EffectiveDates")
    protected EffectiveDatesType effectiveDates;

    /**
     * Gets the value of the zoneID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneID() {
        return zoneID;
    }

    /**
     * Sets the value of the zoneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneID(String value) {
        this.zoneID = value;
    }

    /**
     * Gets the value of the zoneType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneType() {
        return zoneType;
    }

    /**
     * Sets the value of the zoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneType(String value) {
        this.zoneType = value;
    }

    /**
     * Gets the value of the zoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneName() {
        return zoneName;
    }

    /**
     * Sets the value of the zoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneName(String value) {
        this.zoneName = value;
    }

    /**
     * Gets the value of the effectiveDates property.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveDatesType }
     *     
     */
    public EffectiveDatesType getEffectiveDates() {
        return effectiveDates;
    }

    /**
     * Sets the value of the effectiveDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveDatesType }
     *     
     */
    public void setEffectiveDates(EffectiveDatesType value) {
        this.effectiveDates = value;
    }

}

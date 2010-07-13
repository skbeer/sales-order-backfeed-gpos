
package com.monsanto.irdsoapservices.agreementstatus.schema.response;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ZoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ecms:schema:agreement:response:2:0}ZoneID"/>
 *         &lt;element ref="{urn:ecms:schema:agreement:response:2:0}ZoneType" minOccurs="0"/>
 *         &lt;element ref="{urn:ecms:schema:agreement:response:2:0}ZoneName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneType", propOrder = {
    "zoneID",
    "zoneType",
    "zoneName"
})
public class ZoneType {

    @XmlElement(name = "ZoneID", namespace = "urn:ecms:schema:agreement:response:2:0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String zoneID;
    @XmlElement(name = "ZoneType", namespace = "urn:ecms:schema:agreement:response:2:0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String zoneType;
    @XmlElement(name = "ZoneName", namespace = "urn:ecms:schema:agreement:response:2:0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String zoneName;

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

}

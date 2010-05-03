
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LocationType"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PartnerInformation" maxOccurs="unbounded"/>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ZoneID" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ZoneGeography" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
    "locationType",
    "partnerInformation",
    "zoneID",
    "zoneGeography"
})
public class LocationType {

    @XmlElement(name = "LocationType", required = true)
    protected CidxListLocationType locationType;
    @XmlElement(name = "PartnerInformation")
    protected List<PartnerInformationType> partnerInformation;
    @XmlElement(name = "ZoneID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> zoneID;
    @XmlElement(name = "ZoneGeography")
    protected List<ZoneGeographyType> zoneGeography;

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListLocationType }
     *     
     */
    public CidxListLocationType getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListLocationType }
     *     
     */
    public void setLocationType(CidxListLocationType value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the partnerInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerInformationType }
     * 
     * 
     */
    public List<PartnerInformationType> getPartnerInformation() {
        if (partnerInformation == null) {
            partnerInformation = new ArrayList<PartnerInformationType>();
        }
        return this.partnerInformation;
    }

    /**
     * Gets the value of the zoneID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zoneID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZoneID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getZoneID() {
        if (zoneID == null) {
            zoneID = new ArrayList<String>();
        }
        return this.zoneID;
    }

    /**
     * Gets the value of the zoneGeography property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zoneGeography property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZoneGeography().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZoneGeographyType }
     * 
     * 
     */
    public List<ZoneGeographyType> getZoneGeography() {
        if (zoneGeography == null) {
            zoneGeography = new ArrayList<ZoneGeographyType>();
        }
        return this.zoneGeography;
    }

}


package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZoneGeographiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneGeographiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ZoneGeography" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneGeographiesType", propOrder = {
    "zoneGeography"
})
public class ZoneGeographiesType {

    @XmlElement(name = "ZoneGeography", required = true)
    protected List<ZoneGeographyType> zoneGeography;

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

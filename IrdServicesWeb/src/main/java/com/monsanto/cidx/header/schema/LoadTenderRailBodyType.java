
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadTenderRailBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadTenderRailBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadTenderRailProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadTenderRailPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadTenderRailDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadTenderRailBodyType", propOrder = {
    "loadTenderRailProperties",
    "loadTenderRailPartners",
    "loadTenderRailDetails"
})
public class LoadTenderRailBodyType {

    @XmlElement(name = "LoadTenderRailProperties", required = true)
    protected LoadTenderRailPropertiesType loadTenderRailProperties;
    @XmlElement(name = "LoadTenderRailPartners", required = true)
    protected LoadTenderRailPartnersType loadTenderRailPartners;
    @XmlElement(name = "LoadTenderRailDetails", required = true)
    protected LoadTenderRailDetailsType loadTenderRailDetails;

    /**
     * Gets the value of the loadTenderRailProperties property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTenderRailPropertiesType }
     *     
     */
    public LoadTenderRailPropertiesType getLoadTenderRailProperties() {
        return loadTenderRailProperties;
    }

    /**
     * Sets the value of the loadTenderRailProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTenderRailPropertiesType }
     *     
     */
    public void setLoadTenderRailProperties(LoadTenderRailPropertiesType value) {
        this.loadTenderRailProperties = value;
    }

    /**
     * Gets the value of the loadTenderRailPartners property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTenderRailPartnersType }
     *     
     */
    public LoadTenderRailPartnersType getLoadTenderRailPartners() {
        return loadTenderRailPartners;
    }

    /**
     * Sets the value of the loadTenderRailPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTenderRailPartnersType }
     *     
     */
    public void setLoadTenderRailPartners(LoadTenderRailPartnersType value) {
        this.loadTenderRailPartners = value;
    }

    /**
     * Gets the value of the loadTenderRailDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTenderRailDetailsType }
     *     
     */
    public LoadTenderRailDetailsType getLoadTenderRailDetails() {
        return loadTenderRailDetails;
    }

    /**
     * Sets the value of the loadTenderRailDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTenderRailDetailsType }
     *     
     */
    public void setLoadTenderRailDetails(LoadTenderRailDetailsType value) {
        this.loadTenderRailDetails = value;
    }

}

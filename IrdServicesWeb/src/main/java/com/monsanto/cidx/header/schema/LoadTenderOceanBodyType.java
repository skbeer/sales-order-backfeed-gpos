
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadTenderOceanBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadTenderOceanBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadTenderOceanProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadTenderOceanPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadTenderOceanDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadTenderOceanBodyType", propOrder = {
    "loadTenderOceanProperties",
    "loadTenderOceanPartners",
    "loadTenderOceanDetails"
})
public class LoadTenderOceanBodyType {

    @XmlElement(name = "LoadTenderOceanProperties", required = true)
    protected LoadTenderOceanPropertiesType loadTenderOceanProperties;
    @XmlElement(name = "LoadTenderOceanPartners", required = true)
    protected LoadTenderOceanPartnersType loadTenderOceanPartners;
    @XmlElement(name = "LoadTenderOceanDetails", required = true)
    protected LoadTenderOceanDetailsType loadTenderOceanDetails;

    /**
     * Gets the value of the loadTenderOceanProperties property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTenderOceanPropertiesType }
     *     
     */
    public LoadTenderOceanPropertiesType getLoadTenderOceanProperties() {
        return loadTenderOceanProperties;
    }

    /**
     * Sets the value of the loadTenderOceanProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTenderOceanPropertiesType }
     *     
     */
    public void setLoadTenderOceanProperties(LoadTenderOceanPropertiesType value) {
        this.loadTenderOceanProperties = value;
    }

    /**
     * Gets the value of the loadTenderOceanPartners property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTenderOceanPartnersType }
     *     
     */
    public LoadTenderOceanPartnersType getLoadTenderOceanPartners() {
        return loadTenderOceanPartners;
    }

    /**
     * Sets the value of the loadTenderOceanPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTenderOceanPartnersType }
     *     
     */
    public void setLoadTenderOceanPartners(LoadTenderOceanPartnersType value) {
        this.loadTenderOceanPartners = value;
    }

    /**
     * Gets the value of the loadTenderOceanDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTenderOceanDetailsType }
     *     
     */
    public LoadTenderOceanDetailsType getLoadTenderOceanDetails() {
        return loadTenderOceanDetails;
    }

    /**
     * Sets the value of the loadTenderOceanDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTenderOceanDetailsType }
     *     
     */
    public void setLoadTenderOceanDetails(LoadTenderOceanDetailsType value) {
        this.loadTenderOceanDetails = value;
    }

}

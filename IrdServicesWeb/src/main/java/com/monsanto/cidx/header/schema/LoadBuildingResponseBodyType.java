
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadBuildingResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadBuildingResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadBuildingResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadBuildingResponsePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadBuildingResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadBuildingResponseBodyType", propOrder = {
    "loadBuildingResponseProperties",
    "loadBuildingResponsePartners",
    "loadBuildingResponseDetails"
})
public class LoadBuildingResponseBodyType {

    @XmlElement(name = "LoadBuildingResponseProperties", required = true)
    protected LoadBuildingResponsePropertiesType loadBuildingResponseProperties;
    @XmlElement(name = "LoadBuildingResponsePartners", required = true)
    protected LoadBuildingResponsePartnersType loadBuildingResponsePartners;
    @XmlElement(name = "LoadBuildingResponseDetails", required = true)
    protected LoadBuildingResponseDetailsType loadBuildingResponseDetails;

    /**
     * Gets the value of the loadBuildingResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link LoadBuildingResponsePropertiesType }
     *     
     */
    public LoadBuildingResponsePropertiesType getLoadBuildingResponseProperties() {
        return loadBuildingResponseProperties;
    }

    /**
     * Sets the value of the loadBuildingResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadBuildingResponsePropertiesType }
     *     
     */
    public void setLoadBuildingResponseProperties(LoadBuildingResponsePropertiesType value) {
        this.loadBuildingResponseProperties = value;
    }

    /**
     * Gets the value of the loadBuildingResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link LoadBuildingResponsePartnersType }
     *     
     */
    public LoadBuildingResponsePartnersType getLoadBuildingResponsePartners() {
        return loadBuildingResponsePartners;
    }

    /**
     * Sets the value of the loadBuildingResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadBuildingResponsePartnersType }
     *     
     */
    public void setLoadBuildingResponsePartners(LoadBuildingResponsePartnersType value) {
        this.loadBuildingResponsePartners = value;
    }

    /**
     * Gets the value of the loadBuildingResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LoadBuildingResponseDetailsType }
     *     
     */
    public LoadBuildingResponseDetailsType getLoadBuildingResponseDetails() {
        return loadBuildingResponseDetails;
    }

    /**
     * Sets the value of the loadBuildingResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadBuildingResponseDetailsType }
     *     
     */
    public void setLoadBuildingResponseDetails(LoadBuildingResponseDetailsType value) {
        this.loadBuildingResponseDetails = value;
    }

}

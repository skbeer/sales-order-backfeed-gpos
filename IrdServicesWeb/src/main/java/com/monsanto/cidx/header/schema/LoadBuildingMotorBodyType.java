
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadBuildingMotorBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadBuildingMotorBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadBuildingMotorProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadBuildingMotorPartners" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadBuildingMotorDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadBuildingMotorBodyType", propOrder = {
    "loadBuildingMotorProperties",
    "loadBuildingMotorPartners",
    "loadBuildingMotorDetails"
})
public class LoadBuildingMotorBodyType {

    @XmlElement(name = "LoadBuildingMotorProperties", required = true)
    protected LoadBuildingMotorPropertiesType loadBuildingMotorProperties;
    @XmlElement(name = "LoadBuildingMotorPartners")
    protected LoadBuildingMotorPartnersType loadBuildingMotorPartners;
    @XmlElement(name = "LoadBuildingMotorDetails", required = true)
    protected LoadBuildingMotorDetailsType loadBuildingMotorDetails;

    /**
     * Gets the value of the loadBuildingMotorProperties property.
     * 
     * @return
     *     possible object is
     *     {@link LoadBuildingMotorPropertiesType }
     *     
     */
    public LoadBuildingMotorPropertiesType getLoadBuildingMotorProperties() {
        return loadBuildingMotorProperties;
    }

    /**
     * Sets the value of the loadBuildingMotorProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadBuildingMotorPropertiesType }
     *     
     */
    public void setLoadBuildingMotorProperties(LoadBuildingMotorPropertiesType value) {
        this.loadBuildingMotorProperties = value;
    }

    /**
     * Gets the value of the loadBuildingMotorPartners property.
     * 
     * @return
     *     possible object is
     *     {@link LoadBuildingMotorPartnersType }
     *     
     */
    public LoadBuildingMotorPartnersType getLoadBuildingMotorPartners() {
        return loadBuildingMotorPartners;
    }

    /**
     * Sets the value of the loadBuildingMotorPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadBuildingMotorPartnersType }
     *     
     */
    public void setLoadBuildingMotorPartners(LoadBuildingMotorPartnersType value) {
        this.loadBuildingMotorPartners = value;
    }

    /**
     * Gets the value of the loadBuildingMotorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LoadBuildingMotorDetailsType }
     *     
     */
    public LoadBuildingMotorDetailsType getLoadBuildingMotorDetails() {
        return loadBuildingMotorDetails;
    }

    /**
     * Sets the value of the loadBuildingMotorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadBuildingMotorDetailsType }
     *     
     */
    public void setLoadBuildingMotorDetails(LoadBuildingMotorDetailsType value) {
        this.loadBuildingMotorDetails = value;
    }

}

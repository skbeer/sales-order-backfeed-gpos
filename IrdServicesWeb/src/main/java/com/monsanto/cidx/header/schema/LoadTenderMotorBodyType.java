
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadTenderMotorBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadTenderMotorBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadTenderMotorProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadTenderMotorPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadTenderMotorDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadTenderMotorBodyType", propOrder = {
    "loadTenderMotorProperties",
    "loadTenderMotorPartners",
    "loadTenderMotorDetails"
})
public class LoadTenderMotorBodyType {

    @XmlElement(name = "LoadTenderMotorProperties", required = true)
    protected LoadTenderMotorPropertiesType loadTenderMotorProperties;
    @XmlElement(name = "LoadTenderMotorPartners", required = true)
    protected LoadTenderMotorPartnersType loadTenderMotorPartners;
    @XmlElement(name = "LoadTenderMotorDetails", required = true)
    protected LoadTenderMotorDetailsType loadTenderMotorDetails;

    /**
     * Gets the value of the loadTenderMotorProperties property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTenderMotorPropertiesType }
     *     
     */
    public LoadTenderMotorPropertiesType getLoadTenderMotorProperties() {
        return loadTenderMotorProperties;
    }

    /**
     * Sets the value of the loadTenderMotorProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTenderMotorPropertiesType }
     *     
     */
    public void setLoadTenderMotorProperties(LoadTenderMotorPropertiesType value) {
        this.loadTenderMotorProperties = value;
    }

    /**
     * Gets the value of the loadTenderMotorPartners property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTenderMotorPartnersType }
     *     
     */
    public LoadTenderMotorPartnersType getLoadTenderMotorPartners() {
        return loadTenderMotorPartners;
    }

    /**
     * Sets the value of the loadTenderMotorPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTenderMotorPartnersType }
     *     
     */
    public void setLoadTenderMotorPartners(LoadTenderMotorPartnersType value) {
        this.loadTenderMotorPartners = value;
    }

    /**
     * Gets the value of the loadTenderMotorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTenderMotorDetailsType }
     *     
     */
    public LoadTenderMotorDetailsType getLoadTenderMotorDetails() {
        return loadTenderMotorDetails;
    }

    /**
     * Sets the value of the loadTenderMotorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTenderMotorDetailsType }
     *     
     */
    public void setLoadTenderMotorDetails(LoadTenderMotorDetailsType value) {
        this.loadTenderMotorDetails = value;
    }

}

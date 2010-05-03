
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadTenderResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadTenderResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadTenderResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadTenderResponsePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadTenderResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadTenderResponseBodyType", propOrder = {
    "loadTenderResponseProperties",
    "loadTenderResponsePartners",
    "loadTenderResponseDetails"
})
public class LoadTenderResponseBodyType {

    @XmlElement(name = "LoadTenderResponseProperties", required = true)
    protected LoadTenderResponsePropertiesType loadTenderResponseProperties;
    @XmlElement(name = "LoadTenderResponsePartners", required = true)
    protected LoadTenderResponsePartnersType loadTenderResponsePartners;
    @XmlElement(name = "LoadTenderResponseDetails", required = true)
    protected LoadTenderResponseDetailsType loadTenderResponseDetails;

    /**
     * Gets the value of the loadTenderResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTenderResponsePropertiesType }
     *     
     */
    public LoadTenderResponsePropertiesType getLoadTenderResponseProperties() {
        return loadTenderResponseProperties;
    }

    /**
     * Sets the value of the loadTenderResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTenderResponsePropertiesType }
     *     
     */
    public void setLoadTenderResponseProperties(LoadTenderResponsePropertiesType value) {
        this.loadTenderResponseProperties = value;
    }

    /**
     * Gets the value of the loadTenderResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTenderResponsePartnersType }
     *     
     */
    public LoadTenderResponsePartnersType getLoadTenderResponsePartners() {
        return loadTenderResponsePartners;
    }

    /**
     * Sets the value of the loadTenderResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTenderResponsePartnersType }
     *     
     */
    public void setLoadTenderResponsePartners(LoadTenderResponsePartnersType value) {
        this.loadTenderResponsePartners = value;
    }

    /**
     * Gets the value of the loadTenderResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTenderResponseDetailsType }
     *     
     */
    public LoadTenderResponseDetailsType getLoadTenderResponseDetails() {
        return loadTenderResponseDetails;
    }

    /**
     * Sets the value of the loadTenderResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTenderResponseDetailsType }
     *     
     */
    public void setLoadTenderResponseDetails(LoadTenderResponseDetailsType value) {
        this.loadTenderResponseDetails = value;
    }

}

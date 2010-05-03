
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcceptanceNotificationBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcceptanceNotificationBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AcceptanceNotificationProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AcceptanceNotificationPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AcceptanceNotificationDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptanceNotificationBodyType", propOrder = {
    "acceptanceNotificationProperties",
    "acceptanceNotificationPartners",
    "acceptanceNotificationDetails"
})
public class AcceptanceNotificationBodyType {

    @XmlElement(name = "AcceptanceNotificationProperties", required = true)
    protected AcceptanceNotificationPropertiesType acceptanceNotificationProperties;
    @XmlElement(name = "AcceptanceNotificationPartners", required = true)
    protected AcceptanceNotificationPartnersType acceptanceNotificationPartners;
    @XmlElement(name = "AcceptanceNotificationDetails", required = true)
    protected AcceptanceNotificationDetailsType acceptanceNotificationDetails;

    /**
     * Gets the value of the acceptanceNotificationProperties property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptanceNotificationPropertiesType }
     *     
     */
    public AcceptanceNotificationPropertiesType getAcceptanceNotificationProperties() {
        return acceptanceNotificationProperties;
    }

    /**
     * Sets the value of the acceptanceNotificationProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptanceNotificationPropertiesType }
     *     
     */
    public void setAcceptanceNotificationProperties(AcceptanceNotificationPropertiesType value) {
        this.acceptanceNotificationProperties = value;
    }

    /**
     * Gets the value of the acceptanceNotificationPartners property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptanceNotificationPartnersType }
     *     
     */
    public AcceptanceNotificationPartnersType getAcceptanceNotificationPartners() {
        return acceptanceNotificationPartners;
    }

    /**
     * Sets the value of the acceptanceNotificationPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptanceNotificationPartnersType }
     *     
     */
    public void setAcceptanceNotificationPartners(AcceptanceNotificationPartnersType value) {
        this.acceptanceNotificationPartners = value;
    }

    /**
     * Gets the value of the acceptanceNotificationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptanceNotificationDetailsType }
     *     
     */
    public AcceptanceNotificationDetailsType getAcceptanceNotificationDetails() {
        return acceptanceNotificationDetails;
    }

    /**
     * Sets the value of the acceptanceNotificationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptanceNotificationDetailsType }
     *     
     */
    public void setAcceptanceNotificationDetails(AcceptanceNotificationDetailsType value) {
        this.acceptanceNotificationDetails = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentDateReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentDateReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedShipDateTime"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ScheduledShipDateTime" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ScheduledPackDateTime" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedDeliveryDateTime" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedPickupDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentDateReferenceType", propOrder = {
    "requestedShipDateTime",
    "scheduledShipDateTime",
    "scheduledPackDateTime",
    "requestedDeliveryDateTime",
    "requestedPickupDateTime"
})
public class ShipmentDateReferenceType {

    @XmlElement(name = "RequestedShipDateTime", required = true)
    protected RequestedShipDateTimeType requestedShipDateTime;
    @XmlElement(name = "ScheduledShipDateTime")
    protected ScheduledShipDateTimeType scheduledShipDateTime;
    @XmlElement(name = "ScheduledPackDateTime")
    protected ScheduledPackDateTimeType scheduledPackDateTime;
    @XmlElement(name = "RequestedDeliveryDateTime")
    protected RequestedDeliveryDateTimeType requestedDeliveryDateTime;
    @XmlElement(name = "RequestedPickupDateTime")
    protected RequestedPickupDateTimeType requestedPickupDateTime;

    /**
     * Gets the value of the requestedShipDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedShipDateTimeType }
     *     
     */
    public RequestedShipDateTimeType getRequestedShipDateTime() {
        return requestedShipDateTime;
    }

    /**
     * Sets the value of the requestedShipDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedShipDateTimeType }
     *     
     */
    public void setRequestedShipDateTime(RequestedShipDateTimeType value) {
        this.requestedShipDateTime = value;
    }

    /**
     * Gets the value of the scheduledShipDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledShipDateTimeType }
     *     
     */
    public ScheduledShipDateTimeType getScheduledShipDateTime() {
        return scheduledShipDateTime;
    }

    /**
     * Sets the value of the scheduledShipDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledShipDateTimeType }
     *     
     */
    public void setScheduledShipDateTime(ScheduledShipDateTimeType value) {
        this.scheduledShipDateTime = value;
    }

    /**
     * Gets the value of the scheduledPackDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledPackDateTimeType }
     *     
     */
    public ScheduledPackDateTimeType getScheduledPackDateTime() {
        return scheduledPackDateTime;
    }

    /**
     * Sets the value of the scheduledPackDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledPackDateTimeType }
     *     
     */
    public void setScheduledPackDateTime(ScheduledPackDateTimeType value) {
        this.scheduledPackDateTime = value;
    }

    /**
     * Gets the value of the requestedDeliveryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDeliveryDateTimeType }
     *     
     */
    public RequestedDeliveryDateTimeType getRequestedDeliveryDateTime() {
        return requestedDeliveryDateTime;
    }

    /**
     * Sets the value of the requestedDeliveryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDeliveryDateTimeType }
     *     
     */
    public void setRequestedDeliveryDateTime(RequestedDeliveryDateTimeType value) {
        this.requestedDeliveryDateTime = value;
    }

    /**
     * Gets the value of the requestedPickupDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedPickupDateTimeType }
     *     
     */
    public RequestedPickupDateTimeType getRequestedPickupDateTime() {
        return requestedPickupDateTime;
    }

    /**
     * Sets the value of the requestedPickupDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedPickupDateTimeType }
     *     
     */
    public void setRequestedPickupDateTime(RequestedPickupDateTimeType value) {
        this.requestedPickupDateTime = value;
    }

}

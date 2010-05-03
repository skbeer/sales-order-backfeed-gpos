
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
 * <p>Java class for ShipmentStatusDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentStatusDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EquipmentIdentifier"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentStatusCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentStatusCodeDescription" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentStatusReasonCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentStatusReasonCodeDescription" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentStatusDateTime"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryPerformanceIncident" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LocationCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LocationIdentifier" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RoutingInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EquipmentLoadEmptyStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentDateTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SeverityLevel" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportMethodCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HandlingInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentStatusDetailsType", propOrder = {
    "equipmentIdentifier",
    "shipmentStatusCode",
    "shipmentStatusCodeDescription",
    "shipmentStatusReasonCode",
    "shipmentStatusReasonCodeDescription",
    "shipmentStatusDateTime",
    "deliveryPerformanceIncident",
    "locationCode",
    "locationIdentifier",
    "routingInstructions",
    "comment",
    "equipmentLoadEmptyStatus",
    "shipmentDateTime",
    "severityLevel",
    "transportMethodCode",
    "handlingInformation"
})
public class ShipmentStatusDetailsType {

    @XmlElement(name = "EquipmentIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String equipmentIdentifier;
    @XmlElement(name = "ShipmentStatusCode", required = true)
    protected ShipmentStatusCodeType shipmentStatusCode;
    @XmlElement(name = "ShipmentStatusCodeDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shipmentStatusCodeDescription;
    @XmlElement(name = "ShipmentStatusReasonCode")
    protected ShipmentStatusReasonCodeType shipmentStatusReasonCode;
    @XmlElement(name = "ShipmentStatusReasonCodeDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shipmentStatusReasonCodeDescription;
    @XmlElement(name = "ShipmentStatusDateTime", required = true)
    protected ShipmentStatusDateTimeType shipmentStatusDateTime;
    @XmlElement(name = "DeliveryPerformanceIncident")
    protected List<DeliveryPerformanceIncidentType> deliveryPerformanceIncident;
    @XmlElement(name = "LocationCode")
    protected LocationCodeType locationCode;
    @XmlElement(name = "LocationIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String locationIdentifier;
    @XmlElement(name = "RoutingInstructions")
    protected List<RoutingInstructionsType> routingInstructions;
    @XmlElement(name = "Comment")
    protected List<CommentType> comment;
    @XmlElement(name = "EquipmentLoadEmptyStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String equipmentLoadEmptyStatus;
    @XmlElement(name = "ShipmentDateTime")
    protected List<ShipmentDateTimeType> shipmentDateTime;
    @XmlElement(name = "SeverityLevel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String severityLevel;
    @XmlElement(name = "TransportMethodCode")
    protected TransportMethodCodeType transportMethodCode;
    @XmlElement(name = "HandlingInformation")
    protected List<HandlingInformationType> handlingInformation;

    /**
     * Gets the value of the equipmentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentIdentifier() {
        return equipmentIdentifier;
    }

    /**
     * Sets the value of the equipmentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentIdentifier(String value) {
        this.equipmentIdentifier = value;
    }

    /**
     * Gets the value of the shipmentStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentStatusCodeType }
     *     
     */
    public ShipmentStatusCodeType getShipmentStatusCode() {
        return shipmentStatusCode;
    }

    /**
     * Sets the value of the shipmentStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentStatusCodeType }
     *     
     */
    public void setShipmentStatusCode(ShipmentStatusCodeType value) {
        this.shipmentStatusCode = value;
    }

    /**
     * Gets the value of the shipmentStatusCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentStatusCodeDescription() {
        return shipmentStatusCodeDescription;
    }

    /**
     * Sets the value of the shipmentStatusCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentStatusCodeDescription(String value) {
        this.shipmentStatusCodeDescription = value;
    }

    /**
     * Gets the value of the shipmentStatusReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentStatusReasonCodeType }
     *     
     */
    public ShipmentStatusReasonCodeType getShipmentStatusReasonCode() {
        return shipmentStatusReasonCode;
    }

    /**
     * Sets the value of the shipmentStatusReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentStatusReasonCodeType }
     *     
     */
    public void setShipmentStatusReasonCode(ShipmentStatusReasonCodeType value) {
        this.shipmentStatusReasonCode = value;
    }

    /**
     * Gets the value of the shipmentStatusReasonCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentStatusReasonCodeDescription() {
        return shipmentStatusReasonCodeDescription;
    }

    /**
     * Sets the value of the shipmentStatusReasonCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentStatusReasonCodeDescription(String value) {
        this.shipmentStatusReasonCodeDescription = value;
    }

    /**
     * Gets the value of the shipmentStatusDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentStatusDateTimeType }
     *     
     */
    public ShipmentStatusDateTimeType getShipmentStatusDateTime() {
        return shipmentStatusDateTime;
    }

    /**
     * Sets the value of the shipmentStatusDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentStatusDateTimeType }
     *     
     */
    public void setShipmentStatusDateTime(ShipmentStatusDateTimeType value) {
        this.shipmentStatusDateTime = value;
    }

    /**
     * Gets the value of the deliveryPerformanceIncident property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryPerformanceIncident property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryPerformanceIncident().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryPerformanceIncidentType }
     * 
     * 
     */
    public List<DeliveryPerformanceIncidentType> getDeliveryPerformanceIncident() {
        if (deliveryPerformanceIncident == null) {
            deliveryPerformanceIncident = new ArrayList<DeliveryPerformanceIncidentType>();
        }
        return this.deliveryPerformanceIncident;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link LocationCodeType }
     *     
     */
    public LocationCodeType getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCodeType }
     *     
     */
    public void setLocationCode(LocationCodeType value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the locationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationIdentifier() {
        return locationIdentifier;
    }

    /**
     * Sets the value of the locationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationIdentifier(String value) {
        this.locationIdentifier = value;
    }

    /**
     * Gets the value of the routingInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingInstructionsType }
     * 
     * 
     */
    public List<RoutingInstructionsType> getRoutingInstructions() {
        if (routingInstructions == null) {
            routingInstructions = new ArrayList<RoutingInstructionsType>();
        }
        return this.routingInstructions;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentType }
     * 
     * 
     */
    public List<CommentType> getComment() {
        if (comment == null) {
            comment = new ArrayList<CommentType>();
        }
        return this.comment;
    }

    /**
     * Gets the value of the equipmentLoadEmptyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentLoadEmptyStatus() {
        return equipmentLoadEmptyStatus;
    }

    /**
     * Sets the value of the equipmentLoadEmptyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentLoadEmptyStatus(String value) {
        this.equipmentLoadEmptyStatus = value;
    }

    /**
     * Gets the value of the shipmentDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentDateTimeType }
     * 
     * 
     */
    public List<ShipmentDateTimeType> getShipmentDateTime() {
        if (shipmentDateTime == null) {
            shipmentDateTime = new ArrayList<ShipmentDateTimeType>();
        }
        return this.shipmentDateTime;
    }

    /**
     * Gets the value of the severityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverityLevel() {
        return severityLevel;
    }

    /**
     * Sets the value of the severityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverityLevel(String value) {
        this.severityLevel = value;
    }

    /**
     * Gets the value of the transportMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransportMethodCodeType }
     *     
     */
    public TransportMethodCodeType getTransportMethodCode() {
        return transportMethodCode;
    }

    /**
     * Sets the value of the transportMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMethodCodeType }
     *     
     */
    public void setTransportMethodCode(TransportMethodCodeType value) {
        this.transportMethodCode = value;
    }

    /**
     * Gets the value of the handlingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HandlingInformationType }
     * 
     * 
     */
    public List<HandlingInformationType> getHandlingInformation() {
        if (handlingInformation == null) {
            handlingInformation = new ArrayList<HandlingInformationType>();
        }
        return this.handlingInformation;
    }

}

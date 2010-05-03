
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModeOfTransportationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModeOfTransportationInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RoadTransportInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarineTransportInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InlandWaterTransportInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RailTransportInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AirTransportInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModeOfTransportationInformationType", propOrder = {
    "roadTransportInformation",
    "marineTransportInformation",
    "inlandWaterTransportInformation",
    "railTransportInformation",
    "airTransportInformation"
})
public class ModeOfTransportationInformationType {

    @XmlElement(name = "RoadTransportInformation")
    protected RoadTransportInformationType roadTransportInformation;
    @XmlElement(name = "MarineTransportInformation")
    protected MarineTransportInformationType marineTransportInformation;
    @XmlElement(name = "InlandWaterTransportInformation")
    protected InlandWaterTransportInformationType inlandWaterTransportInformation;
    @XmlElement(name = "RailTransportInformation")
    protected RailTransportInformationType railTransportInformation;
    @XmlElement(name = "AirTransportInformation")
    protected AirTransportInformationType airTransportInformation;

    /**
     * Gets the value of the roadTransportInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RoadTransportInformationType }
     *     
     */
    public RoadTransportInformationType getRoadTransportInformation() {
        return roadTransportInformation;
    }

    /**
     * Sets the value of the roadTransportInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadTransportInformationType }
     *     
     */
    public void setRoadTransportInformation(RoadTransportInformationType value) {
        this.roadTransportInformation = value;
    }

    /**
     * Gets the value of the marineTransportInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MarineTransportInformationType }
     *     
     */
    public MarineTransportInformationType getMarineTransportInformation() {
        return marineTransportInformation;
    }

    /**
     * Sets the value of the marineTransportInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarineTransportInformationType }
     *     
     */
    public void setMarineTransportInformation(MarineTransportInformationType value) {
        this.marineTransportInformation = value;
    }

    /**
     * Gets the value of the inlandWaterTransportInformation property.
     * 
     * @return
     *     possible object is
     *     {@link InlandWaterTransportInformationType }
     *     
     */
    public InlandWaterTransportInformationType getInlandWaterTransportInformation() {
        return inlandWaterTransportInformation;
    }

    /**
     * Sets the value of the inlandWaterTransportInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InlandWaterTransportInformationType }
     *     
     */
    public void setInlandWaterTransportInformation(InlandWaterTransportInformationType value) {
        this.inlandWaterTransportInformation = value;
    }

    /**
     * Gets the value of the railTransportInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RailTransportInformationType }
     *     
     */
    public RailTransportInformationType getRailTransportInformation() {
        return railTransportInformation;
    }

    /**
     * Sets the value of the railTransportInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailTransportInformationType }
     *     
     */
    public void setRailTransportInformation(RailTransportInformationType value) {
        this.railTransportInformation = value;
    }

    /**
     * Gets the value of the airTransportInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AirTransportInformationType }
     *     
     */
    public AirTransportInformationType getAirTransportInformation() {
        return airTransportInformation;
    }

    /**
     * Sets the value of the airTransportInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirTransportInformationType }
     *     
     */
    public void setAirTransportInformation(AirTransportInformationType value) {
        this.airTransportInformation = value;
    }

}

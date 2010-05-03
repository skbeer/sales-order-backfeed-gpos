
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RoadTransportInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadTransportInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HazardousMarkingNotation"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TruckType" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TankType" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialRequirements" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EmptyTankClassification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadTransportInformationType", propOrder = {
    "hazardousMarkingNotation",
    "truckType",
    "tankType",
    "specialRequirements",
    "emptyTankClassification"
})
public class RoadTransportInformationType {

    @XmlElement(name = "HazardousMarkingNotation", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hazardousMarkingNotation;
    @XmlElement(name = "TruckType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String truckType;
    @XmlElement(name = "TankType")
    protected TankTypeType tankType;
    @XmlElement(name = "SpecialRequirements")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String specialRequirements;
    @XmlElement(name = "EmptyTankClassification")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String emptyTankClassification;

    /**
     * Gets the value of the hazardousMarkingNotation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardousMarkingNotation() {
        return hazardousMarkingNotation;
    }

    /**
     * Sets the value of the hazardousMarkingNotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardousMarkingNotation(String value) {
        this.hazardousMarkingNotation = value;
    }

    /**
     * Gets the value of the truckType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTruckType() {
        return truckType;
    }

    /**
     * Sets the value of the truckType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTruckType(String value) {
        this.truckType = value;
    }

    /**
     * Gets the value of the tankType property.
     * 
     * @return
     *     possible object is
     *     {@link TankTypeType }
     *     
     */
    public TankTypeType getTankType() {
        return tankType;
    }

    /**
     * Sets the value of the tankType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TankTypeType }
     *     
     */
    public void setTankType(TankTypeType value) {
        this.tankType = value;
    }

    /**
     * Gets the value of the specialRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialRequirements() {
        return specialRequirements;
    }

    /**
     * Sets the value of the specialRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialRequirements(String value) {
        this.specialRequirements = value;
    }

    /**
     * Gets the value of the emptyTankClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmptyTankClassification() {
        return emptyTankClassification;
    }

    /**
     * Sets the value of the emptyTankClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmptyTankClassification(String value) {
        this.emptyTankClassification = value;
    }

}

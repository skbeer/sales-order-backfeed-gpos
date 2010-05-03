
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RailTransportInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailTransportInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HazardousMarkingNotation"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MaximumFillingDegree" minOccurs="0"/>
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
@XmlType(name = "RailTransportInformationType", propOrder = {
    "hazardousMarkingNotation",
    "maximumFillingDegree",
    "emptyTankClassification"
})
public class RailTransportInformationType {

    @XmlElement(name = "HazardousMarkingNotation", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hazardousMarkingNotation;
    @XmlElement(name = "MaximumFillingDegree")
    protected MaximumFillingDegreeType maximumFillingDegree;
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
     * Gets the value of the maximumFillingDegree property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumFillingDegreeType }
     *     
     */
    public MaximumFillingDegreeType getMaximumFillingDegree() {
        return maximumFillingDegree;
    }

    /**
     * Sets the value of the maximumFillingDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumFillingDegreeType }
     *     
     */
    public void setMaximumFillingDegree(MaximumFillingDegreeType value) {
        this.maximumFillingDegree = value;
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

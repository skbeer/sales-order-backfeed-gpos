
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ControlledTemperatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlledTemperatureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecifiedMeasurement"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ControlPoint" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListControlPoint" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlledTemperatureType", propOrder = {
    "specifiedMeasurement"
})
public class ControlledTemperatureType {

    @XmlElement(name = "SpecifiedMeasurement", required = true)
    protected SpecifiedMeasurementType specifiedMeasurement;
    @XmlAttribute(name = "ControlPoint", required = true)
    protected CidxListControlPoint controlPoint;

    /**
     * Gets the value of the specifiedMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedMeasurementType }
     *     
     */
    public SpecifiedMeasurementType getSpecifiedMeasurement() {
        return specifiedMeasurement;
    }

    /**
     * Sets the value of the specifiedMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedMeasurementType }
     *     
     */
    public void setSpecifiedMeasurement(SpecifiedMeasurementType value) {
        this.specifiedMeasurement = value;
    }

    /**
     * Gets the value of the controlPoint property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListControlPoint }
     *     
     */
    public CidxListControlPoint getControlPoint() {
        return controlPoint;
    }

    /**
     * Sets the value of the controlPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListControlPoint }
     *     
     */
    public void setControlPoint(CidxListControlPoint value) {
        this.controlPoint = value;
    }

}

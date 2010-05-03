
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecifiedMeasurementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecifiedMeasurementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Measurement"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MeasurementQualifier" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListSpecifiedMeasurementQualifier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecifiedMeasurementType", propOrder = {
    "measurement"
})
public class SpecifiedMeasurementType {

    @XmlElement(name = "Measurement", required = true)
    protected MeasurementType measurement;
    @XmlAttribute(name = "MeasurementQualifier", required = true)
    protected CidxListSpecifiedMeasurementQualifier measurementQualifier;

    /**
     * Gets the value of the measurement property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getMeasurement() {
        return measurement;
    }

    /**
     * Sets the value of the measurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setMeasurement(MeasurementType value) {
        this.measurement = value;
    }

    /**
     * Gets the value of the measurementQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListSpecifiedMeasurementQualifier }
     *     
     */
    public CidxListSpecifiedMeasurementQualifier getMeasurementQualifier() {
        return measurementQualifier;
    }

    /**
     * Sets the value of the measurementQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListSpecifiedMeasurementQualifier }
     *     
     */
    public void setMeasurementQualifier(CidxListSpecifiedMeasurementQualifier value) {
        this.measurementQualifier = value;
    }

}

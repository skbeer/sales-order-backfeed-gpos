
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecifiedMeasurement"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MeasurementRange"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementInformationType", propOrder = {
    "specifiedMeasurement",
    "measurementRange"
})
public class MeasurementInformationType {

    @XmlElement(name = "SpecifiedMeasurement")
    protected SpecifiedMeasurementType specifiedMeasurement;
    @XmlElement(name = "MeasurementRange")
    protected MeasurementRangeType measurementRange;

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
     * Gets the value of the measurementRange property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementRangeType }
     *     
     */
    public MeasurementRangeType getMeasurementRange() {
        return measurementRange;
    }

    /**
     * Sets the value of the measurementRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementRangeType }
     *     
     */
    public void setMeasurementRange(MeasurementRangeType value) {
        this.measurementRange = value;
    }

}

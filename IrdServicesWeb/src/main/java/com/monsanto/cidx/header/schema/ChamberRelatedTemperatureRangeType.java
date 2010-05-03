
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChamberRelatedTemperatureRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChamberRelatedTemperatureRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MinimumMeasurement" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MaximumMeasurement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChamberRelatedTemperatureRangeType", propOrder = {
    "minimumMeasurement",
    "maximumMeasurement"
})
public class ChamberRelatedTemperatureRangeType {

    @XmlElement(name = "MinimumMeasurement")
    protected MinimumMeasurementType minimumMeasurement;
    @XmlElement(name = "MaximumMeasurement")
    protected MaximumMeasurementType maximumMeasurement;

    /**
     * Gets the value of the minimumMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumMeasurementType }
     *     
     */
    public MinimumMeasurementType getMinimumMeasurement() {
        return minimumMeasurement;
    }

    /**
     * Sets the value of the minimumMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumMeasurementType }
     *     
     */
    public void setMinimumMeasurement(MinimumMeasurementType value) {
        this.minimumMeasurement = value;
    }

    /**
     * Gets the value of the maximumMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumMeasurementType }
     *     
     */
    public MaximumMeasurementType getMaximumMeasurement() {
        return maximumMeasurement;
    }

    /**
     * Sets the value of the maximumMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumMeasurementType }
     *     
     */
    public void setMaximumMeasurement(MaximumMeasurementType value) {
        this.maximumMeasurement = value;
    }

}

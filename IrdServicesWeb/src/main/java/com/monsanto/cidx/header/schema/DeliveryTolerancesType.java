
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryTolerancesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryTolerancesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MeasurementRange"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryTolerancesType", propOrder = {
    "measurementRange"
})
public class DeliveryTolerancesType {

    @XmlElement(name = "MeasurementRange", required = true)
    protected MeasurementRangeType measurementRange;

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


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MeasurementValue"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}UnitOfMeasureCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementType", propOrder = {
    "measurementValue",
    "unitOfMeasureCode"
})
public class MeasurementType {

    @XmlElement(name = "MeasurementValue")
    protected double measurementValue;
    @XmlElement(name = "UnitOfMeasureCode", required = true)
    protected UnitOfMeasureCodeType unitOfMeasureCode;

    /**
     * Gets the value of the measurementValue property.
     * 
     */
    public double getMeasurementValue() {
        return measurementValue;
    }

    /**
     * Sets the value of the measurementValue property.
     * 
     */
    public void setMeasurementValue(double value) {
        this.measurementValue = value;
    }

    /**
     * Gets the value of the unitOfMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureCodeType }
     *     
     */
    public UnitOfMeasureCodeType getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * Sets the value of the unitOfMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureCodeType }
     *     
     */
    public void setUnitOfMeasureCode(UnitOfMeasureCodeType value) {
        this.unitOfMeasureCode = value;
    }

}

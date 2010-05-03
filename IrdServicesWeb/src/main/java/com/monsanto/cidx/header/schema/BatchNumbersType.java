
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchNumbersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchNumbersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Measurement"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BatchNumber"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchNumbersType", propOrder = {
    "measurement",
    "batchNumber"
})
public class BatchNumbersType {

    @XmlElement(name = "Measurement", required = true)
    protected MeasurementType measurement;
    @XmlElement(name = "BatchNumber", required = true)
    protected BatchNumberType batchNumber;

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
     * Gets the value of the batchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BatchNumberType }
     *     
     */
    public BatchNumberType getBatchNumber() {
        return batchNumber;
    }

    /**
     * Sets the value of the batchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchNumberType }
     *     
     */
    public void setBatchNumber(BatchNumberType value) {
        this.batchNumber = value;
    }

}

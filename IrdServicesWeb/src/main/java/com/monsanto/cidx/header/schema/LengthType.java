
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LengthType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LengthType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MeasurementInformation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LengthType", propOrder = {
    "measurementInformation"
})
public class LengthType {

    @XmlElement(name = "MeasurementInformation", required = true)
    protected MeasurementInformationType measurementInformation;

    /**
     * Gets the value of the measurementInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementInformationType }
     *     
     */
    public MeasurementInformationType getMeasurementInformation() {
        return measurementInformation;
    }

    /**
     * Sets the value of the measurementInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementInformationType }
     *     
     */
    public void setMeasurementInformation(MeasurementInformationType value) {
        this.measurementInformation = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeightType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecifiedMeasurement"/>
 *       &lt;/sequence>
 *       &lt;attribute name="WeightQualifier" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListWeightType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeightType", propOrder = {
    "specifiedMeasurement"
})
public class WeightType {

    @XmlElement(name = "SpecifiedMeasurement", required = true)
    protected SpecifiedMeasurementType specifiedMeasurement;
    @XmlAttribute(name = "WeightQualifier", required = true)
    protected CidxListWeightType weightQualifier;

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
     * Gets the value of the weightQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListWeightType }
     *     
     */
    public CidxListWeightType getWeightQualifier() {
        return weightQualifier;
    }

    /**
     * Sets the value of the weightQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListWeightType }
     *     
     */
    public void setWeightQualifier(CidxListWeightType value) {
        this.weightQualifier = value;
    }

}

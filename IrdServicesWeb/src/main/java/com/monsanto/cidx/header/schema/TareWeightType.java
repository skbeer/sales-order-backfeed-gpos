
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TareWeightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TareWeightType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecifiedMeasurement"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TareWeightQualifier" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListTareWtQualifier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TareWeightType", propOrder = {
    "specifiedMeasurement"
})
public class TareWeightType {

    @XmlElement(name = "SpecifiedMeasurement", required = true)
    protected SpecifiedMeasurementType specifiedMeasurement;
    @XmlAttribute(name = "TareWeightQualifier", required = true)
    protected CidxListTareWtQualifier tareWeightQualifier;

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
     * Gets the value of the tareWeightQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListTareWtQualifier }
     *     
     */
    public CidxListTareWtQualifier getTareWeightQualifier() {
        return tareWeightQualifier;
    }

    /**
     * Sets the value of the tareWeightQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListTareWtQualifier }
     *     
     */
    public void setTareWeightQualifier(CidxListTareWtQualifier value) {
        this.tareWeightQualifier = value;
    }

}

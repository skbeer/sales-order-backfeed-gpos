
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolumetricInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolumetricInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Density"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecificGravity"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumetricInformationType", propOrder = {
    "density",
    "specificGravity"
})
public class VolumetricInformationType {

    @XmlElement(name = "Density")
    protected DensityType density;
    @XmlElement(name = "SpecificGravity")
    protected SpecificGravityType specificGravity;

    /**
     * Gets the value of the density property.
     * 
     * @return
     *     possible object is
     *     {@link DensityType }
     *     
     */
    public DensityType getDensity() {
        return density;
    }

    /**
     * Sets the value of the density property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityType }
     *     
     */
    public void setDensity(DensityType value) {
        this.density = value;
    }

    /**
     * Gets the value of the specificGravity property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificGravityType }
     *     
     */
    public SpecificGravityType getSpecificGravity() {
        return specificGravity;
    }

    /**
     * Sets the value of the specificGravity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificGravityType }
     *     
     */
    public void setSpecificGravity(SpecificGravityType value) {
        this.specificGravity = value;
    }

}

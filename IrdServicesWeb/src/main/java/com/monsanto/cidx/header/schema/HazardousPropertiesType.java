
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HazardousPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazardousPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Temperature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ThresholdLimitValueSTEL"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LowerExplosionLimit"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}UpperExplosionLimit"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Density" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}KinematicViscosity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PHValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousPropertiesType", propOrder = {
    "temperature",
    "thresholdLimitValueSTEL",
    "lowerExplosionLimit",
    "upperExplosionLimit",
    "density",
    "kinematicViscosity",
    "phValue"
})
public class HazardousPropertiesType {

    @XmlElement(name = "Temperature")
    protected List<TemperatureType> temperature;
    @XmlElement(name = "ThresholdLimitValueSTEL", required = true)
    protected ThresholdLimitValueSTELType thresholdLimitValueSTEL;
    @XmlElement(name = "LowerExplosionLimit", required = true)
    protected LowerExplosionLimitType lowerExplosionLimit;
    @XmlElement(name = "UpperExplosionLimit", required = true)
    protected UpperExplosionLimitType upperExplosionLimit;
    @XmlElement(name = "Density")
    protected List<DensityType> density;
    @XmlElement(name = "KinematicViscosity")
    protected KinematicViscosityType kinematicViscosity;
    @XmlElement(name = "PHValue")
    protected PHValueType phValue;

    /**
     * Gets the value of the temperature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temperature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemperature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureType }
     * 
     * 
     */
    public List<TemperatureType> getTemperature() {
        if (temperature == null) {
            temperature = new ArrayList<TemperatureType>();
        }
        return this.temperature;
    }

    /**
     * Gets the value of the thresholdLimitValueSTEL property.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdLimitValueSTELType }
     *     
     */
    public ThresholdLimitValueSTELType getThresholdLimitValueSTEL() {
        return thresholdLimitValueSTEL;
    }

    /**
     * Sets the value of the thresholdLimitValueSTEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdLimitValueSTELType }
     *     
     */
    public void setThresholdLimitValueSTEL(ThresholdLimitValueSTELType value) {
        this.thresholdLimitValueSTEL = value;
    }

    /**
     * Gets the value of the lowerExplosionLimit property.
     * 
     * @return
     *     possible object is
     *     {@link LowerExplosionLimitType }
     *     
     */
    public LowerExplosionLimitType getLowerExplosionLimit() {
        return lowerExplosionLimit;
    }

    /**
     * Sets the value of the lowerExplosionLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LowerExplosionLimitType }
     *     
     */
    public void setLowerExplosionLimit(LowerExplosionLimitType value) {
        this.lowerExplosionLimit = value;
    }

    /**
     * Gets the value of the upperExplosionLimit property.
     * 
     * @return
     *     possible object is
     *     {@link UpperExplosionLimitType }
     *     
     */
    public UpperExplosionLimitType getUpperExplosionLimit() {
        return upperExplosionLimit;
    }

    /**
     * Sets the value of the upperExplosionLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpperExplosionLimitType }
     *     
     */
    public void setUpperExplosionLimit(UpperExplosionLimitType value) {
        this.upperExplosionLimit = value;
    }

    /**
     * Gets the value of the density property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the density property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDensity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DensityType }
     * 
     * 
     */
    public List<DensityType> getDensity() {
        if (density == null) {
            density = new ArrayList<DensityType>();
        }
        return this.density;
    }

    /**
     * Gets the value of the kinematicViscosity property.
     * 
     * @return
     *     possible object is
     *     {@link KinematicViscosityType }
     *     
     */
    public KinematicViscosityType getKinematicViscosity() {
        return kinematicViscosity;
    }

    /**
     * Sets the value of the kinematicViscosity property.
     * 
     * @param value
     *     allowed object is
     *     {@link KinematicViscosityType }
     *     
     */
    public void setKinematicViscosity(KinematicViscosityType value) {
        this.kinematicViscosity = value;
    }

    /**
     * Gets the value of the phValue property.
     * 
     * @return
     *     possible object is
     *     {@link PHValueType }
     *     
     */
    public PHValueType getPHValue() {
        return phValue;
    }

    /**
     * Sets the value of the phValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PHValueType }
     *     
     */
    public void setPHValue(PHValueType value) {
        this.phValue = value;
    }

}

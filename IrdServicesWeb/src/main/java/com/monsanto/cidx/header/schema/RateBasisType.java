
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateBasisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateBasisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RateUnitPrice"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RateDistance" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RateWeight" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RateVolume" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RateService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateBasisType", propOrder = {
    "rateUnitPrice",
    "rateDistance",
    "rateWeight",
    "rateVolume",
    "rateService"
})
public class RateBasisType {

    @XmlElement(name = "RateUnitPrice", required = true)
    protected RateUnitPriceType rateUnitPrice;
    @XmlElement(name = "RateDistance")
    protected RateDistanceType rateDistance;
    @XmlElement(name = "RateWeight")
    protected RateWeightType rateWeight;
    @XmlElement(name = "RateVolume")
    protected RateVolumeType rateVolume;
    @XmlElement(name = "RateService")
    protected RateServiceType rateService;

    /**
     * Gets the value of the rateUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link RateUnitPriceType }
     *     
     */
    public RateUnitPriceType getRateUnitPrice() {
        return rateUnitPrice;
    }

    /**
     * Sets the value of the rateUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateUnitPriceType }
     *     
     */
    public void setRateUnitPrice(RateUnitPriceType value) {
        this.rateUnitPrice = value;
    }

    /**
     * Gets the value of the rateDistance property.
     * 
     * @return
     *     possible object is
     *     {@link RateDistanceType }
     *     
     */
    public RateDistanceType getRateDistance() {
        return rateDistance;
    }

    /**
     * Sets the value of the rateDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateDistanceType }
     *     
     */
    public void setRateDistance(RateDistanceType value) {
        this.rateDistance = value;
    }

    /**
     * Gets the value of the rateWeight property.
     * 
     * @return
     *     possible object is
     *     {@link RateWeightType }
     *     
     */
    public RateWeightType getRateWeight() {
        return rateWeight;
    }

    /**
     * Sets the value of the rateWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateWeightType }
     *     
     */
    public void setRateWeight(RateWeightType value) {
        this.rateWeight = value;
    }

    /**
     * Gets the value of the rateVolume property.
     * 
     * @return
     *     possible object is
     *     {@link RateVolumeType }
     *     
     */
    public RateVolumeType getRateVolume() {
        return rateVolume;
    }

    /**
     * Sets the value of the rateVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateVolumeType }
     *     
     */
    public void setRateVolume(RateVolumeType value) {
        this.rateVolume = value;
    }

    /**
     * Gets the value of the rateService property.
     * 
     * @return
     *     possible object is
     *     {@link RateServiceType }
     *     
     */
    public RateServiceType getRateService() {
        return rateService;
    }

    /**
     * Sets the value of the rateService property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateServiceType }
     *     
     */
    public void setRateService(RateServiceType value) {
        this.rateService = value;
    }

}

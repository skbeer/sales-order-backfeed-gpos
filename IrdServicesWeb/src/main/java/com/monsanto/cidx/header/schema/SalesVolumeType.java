
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesVolumeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesVolumeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MinimumSalesVolume" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MaximumSalesVolume" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesVolumeType", propOrder = {
    "minimumSalesVolume",
    "maximumSalesVolume"
})
public class SalesVolumeType {

    @XmlElement(name = "MinimumSalesVolume")
    protected MinimumSalesVolumeType minimumSalesVolume;
    @XmlElement(name = "MaximumSalesVolume")
    protected MaximumSalesVolumeType maximumSalesVolume;

    /**
     * Gets the value of the minimumSalesVolume property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumSalesVolumeType }
     *     
     */
    public MinimumSalesVolumeType getMinimumSalesVolume() {
        return minimumSalesVolume;
    }

    /**
     * Sets the value of the minimumSalesVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumSalesVolumeType }
     *     
     */
    public void setMinimumSalesVolume(MinimumSalesVolumeType value) {
        this.minimumSalesVolume = value;
    }

    /**
     * Gets the value of the maximumSalesVolume property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumSalesVolumeType }
     *     
     */
    public MaximumSalesVolumeType getMaximumSalesVolume() {
        return maximumSalesVolume;
    }

    /**
     * Sets the value of the maximumSalesVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumSalesVolumeType }
     *     
     */
    public void setMaximumSalesVolume(MaximumSalesVolumeType value) {
        this.maximumSalesVolume = value;
    }

}

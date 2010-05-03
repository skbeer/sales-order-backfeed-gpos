
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderingInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MinimumMeasurement" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MinimumSalesVolume" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderableIncrement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderingInformationType", propOrder = {
    "minimumMeasurement",
    "minimumSalesVolume",
    "orderableIncrement"
})
public class OrderingInformationType {

    @XmlElement(name = "MinimumMeasurement")
    protected MinimumMeasurementType minimumMeasurement;
    @XmlElement(name = "MinimumSalesVolume")
    protected MinimumSalesVolumeType minimumSalesVolume;
    @XmlElement(name = "OrderableIncrement")
    protected OrderableIncrementType orderableIncrement;

    /**
     * Gets the value of the minimumMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumMeasurementType }
     *     
     */
    public MinimumMeasurementType getMinimumMeasurement() {
        return minimumMeasurement;
    }

    /**
     * Sets the value of the minimumMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumMeasurementType }
     *     
     */
    public void setMinimumMeasurement(MinimumMeasurementType value) {
        this.minimumMeasurement = value;
    }

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
     * Gets the value of the orderableIncrement property.
     * 
     * @return
     *     possible object is
     *     {@link OrderableIncrementType }
     *     
     */
    public OrderableIncrementType getOrderableIncrement() {
        return orderableIncrement;
    }

    /**
     * Sets the value of the orderableIncrement property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderableIncrementType }
     *     
     */
    public void setOrderableIncrement(OrderableIncrementType value) {
        this.orderableIncrement = value;
    }

}

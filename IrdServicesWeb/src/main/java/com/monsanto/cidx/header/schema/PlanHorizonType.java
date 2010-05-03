
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for PlanHorizonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanHorizonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DateTimeRange"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanHorizonType", propOrder = {
    "dateTimeRange",
    "duration"
})
public class PlanHorizonType {

    @XmlElement(name = "DateTimeRange", required = true)
    protected DateTimeRangeType dateTimeRange;
    @XmlElement(name = "Duration")
    protected Duration duration;

    /**
     * Gets the value of the dateTimeRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeRangeType }
     *     
     */
    public DateTimeRangeType getDateTimeRange() {
        return dateTimeRange;
    }

    /**
     * Sets the value of the dateTimeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeRangeType }
     *     
     */
    public void setDateTimeRange(DateTimeRangeType value) {
        this.dateTimeRange = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

}

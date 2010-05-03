
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventDateTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventDateTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DateTime"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EventDateType" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListEventDateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventDateTimeType", propOrder = {
    "dateTime"
})
public class EventDateTimeType {

    @XmlElement(name = "DateTime", required = true)
    protected DateTimeType dateTime;
    @XmlAttribute(name = "EventDateType", required = true)
    protected CidxListEventDateType eventDateType;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setDateTime(DateTimeType value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the eventDateType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListEventDateType }
     *     
     */
    public CidxListEventDateType getEventDateType() {
        return eventDateType;
    }

    /**
     * Sets the value of the eventDateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListEventDateType }
     *     
     */
    public void setEventDateType(CidxListEventDateType value) {
        this.eventDateType = value;
    }

}

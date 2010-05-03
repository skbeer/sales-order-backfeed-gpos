
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleDateTimeInformationRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleDateTimeInformationRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DateTimeInformation"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ScheduleType" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListScheduleDateTimeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleDateTimeInformationRangeType", propOrder = {
    "dateTimeInformation"
})
public class ScheduleDateTimeInformationRangeType {

    @XmlElement(name = "DateTimeInformation", required = true)
    protected DateTimeInformationType dateTimeInformation;
    @XmlAttribute(name = "ScheduleType", required = true)
    protected CidxListScheduleDateTimeType scheduleType;

    /**
     * Gets the value of the dateTimeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeInformationType }
     *     
     */
    public DateTimeInformationType getDateTimeInformation() {
        return dateTimeInformation;
    }

    /**
     * Sets the value of the dateTimeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeInformationType }
     *     
     */
    public void setDateTimeInformation(DateTimeInformationType value) {
        this.dateTimeInformation = value;
    }

    /**
     * Gets the value of the scheduleType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListScheduleDateTimeType }
     *     
     */
    public CidxListScheduleDateTimeType getScheduleType() {
        return scheduleType;
    }

    /**
     * Sets the value of the scheduleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListScheduleDateTimeType }
     *     
     */
    public void setScheduleType(CidxListScheduleDateTimeType value) {
        this.scheduleType = value;
    }

}

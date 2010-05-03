
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EstimatedTimeOfArrivalDateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstimatedTimeOfArrivalDateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DateTimeInformation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimatedTimeOfArrivalDateType", propOrder = {
    "dateTimeInformation"
})
public class EstimatedTimeOfArrivalDateType {

    @XmlElement(name = "DateTimeInformation", required = true)
    protected DateTimeInformationType dateTimeInformation;

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

}

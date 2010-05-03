
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentDateTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentDateTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DateTime"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShipmentDateQualifier" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListShipmentDateQualifier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentDateTimeType", propOrder = {
    "dateTime"
})
public class ShipmentDateTimeType {

    @XmlElement(name = "DateTime", required = true)
    protected DateTimeType dateTime;
    @XmlAttribute(name = "ShipmentDateQualifier", required = true)
    protected CidxListShipmentDateQualifier shipmentDateQualifier;

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
     * Gets the value of the shipmentDateQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListShipmentDateQualifier }
     *     
     */
    public CidxListShipmentDateQualifier getShipmentDateQualifier() {
        return shipmentDateQualifier;
    }

    /**
     * Sets the value of the shipmentDateQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListShipmentDateQualifier }
     *     
     */
    public void setShipmentDateQualifier(CidxListShipmentDateQualifier value) {
        this.shipmentDateQualifier = value;
    }

}

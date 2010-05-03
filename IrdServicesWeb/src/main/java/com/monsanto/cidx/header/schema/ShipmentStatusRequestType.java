
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ShipmentStatusRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentStatusRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Header"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentStatusRequestBody"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxToken" fixed="5.0" />
 *       &lt;attribute name="SelectionQualifier" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxToken" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentStatusRequestType", propOrder = {
    "header",
    "shipmentStatusRequestBody"
})
public class ShipmentStatusRequestType {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "ShipmentStatusRequestBody", required = true)
    protected ShipmentStatusRequestBodyType shipmentStatusRequestBody;
    @XmlAttribute(name = "Version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;
    @XmlAttribute(name = "SelectionQualifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String selectionQualifier;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the shipmentStatusRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentStatusRequestBodyType }
     *     
     */
    public ShipmentStatusRequestBodyType getShipmentStatusRequestBody() {
        return shipmentStatusRequestBody;
    }

    /**
     * Sets the value of the shipmentStatusRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentStatusRequestBodyType }
     *     
     */
    public void setShipmentStatusRequestBody(ShipmentStatusRequestBodyType value) {
        this.shipmentStatusRequestBody = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "5.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the selectionQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionQualifier() {
        return selectionQualifier;
    }

    /**
     * Sets the value of the selectionQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionQualifier(String value) {
        this.selectionQualifier = value;
    }

}

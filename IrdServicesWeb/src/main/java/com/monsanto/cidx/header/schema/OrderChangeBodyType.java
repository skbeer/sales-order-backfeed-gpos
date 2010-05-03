
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderChangeBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderChangeBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderChangeProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderChangePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderChangeDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderChangeBodyType", propOrder = {
    "orderChangeProperties",
    "orderChangePartners",
    "orderChangeDetails"
})
public class OrderChangeBodyType {

    @XmlElement(name = "OrderChangeProperties", required = true)
    protected OrderChangePropertiesType orderChangeProperties;
    @XmlElement(name = "OrderChangePartners", required = true)
    protected OrderChangePartnersType orderChangePartners;
    @XmlElement(name = "OrderChangeDetails", required = true)
    protected OrderChangeDetailsType orderChangeDetails;

    /**
     * Gets the value of the orderChangeProperties property.
     * 
     * @return
     *     possible object is
     *     {@link OrderChangePropertiesType }
     *     
     */
    public OrderChangePropertiesType getOrderChangeProperties() {
        return orderChangeProperties;
    }

    /**
     * Sets the value of the orderChangeProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderChangePropertiesType }
     *     
     */
    public void setOrderChangeProperties(OrderChangePropertiesType value) {
        this.orderChangeProperties = value;
    }

    /**
     * Gets the value of the orderChangePartners property.
     * 
     * @return
     *     possible object is
     *     {@link OrderChangePartnersType }
     *     
     */
    public OrderChangePartnersType getOrderChangePartners() {
        return orderChangePartners;
    }

    /**
     * Sets the value of the orderChangePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderChangePartnersType }
     *     
     */
    public void setOrderChangePartners(OrderChangePartnersType value) {
        this.orderChangePartners = value;
    }

    /**
     * Gets the value of the orderChangeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrderChangeDetailsType }
     *     
     */
    public OrderChangeDetailsType getOrderChangeDetails() {
        return orderChangeDetails;
    }

    /**
     * Sets the value of the orderChangeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderChangeDetailsType }
     *     
     */
    public void setOrderChangeDetails(OrderChangeDetailsType value) {
        this.orderChangeDetails = value;
    }

}

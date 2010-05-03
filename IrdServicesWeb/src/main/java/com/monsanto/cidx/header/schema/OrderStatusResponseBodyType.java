
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatusResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderStatusResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderStatusResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderStatusResponsePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderStatusResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatusResponseBodyType", propOrder = {
    "orderStatusResponseProperties",
    "orderStatusResponsePartners",
    "orderStatusResponseDetails"
})
public class OrderStatusResponseBodyType {

    @XmlElement(name = "OrderStatusResponseProperties", required = true)
    protected OrderStatusResponsePropertiesType orderStatusResponseProperties;
    @XmlElement(name = "OrderStatusResponsePartners", required = true)
    protected OrderStatusResponsePartnersType orderStatusResponsePartners;
    @XmlElement(name = "OrderStatusResponseDetails", required = true)
    protected OrderStatusResponseDetailsType orderStatusResponseDetails;

    /**
     * Gets the value of the orderStatusResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusResponsePropertiesType }
     *     
     */
    public OrderStatusResponsePropertiesType getOrderStatusResponseProperties() {
        return orderStatusResponseProperties;
    }

    /**
     * Sets the value of the orderStatusResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusResponsePropertiesType }
     *     
     */
    public void setOrderStatusResponseProperties(OrderStatusResponsePropertiesType value) {
        this.orderStatusResponseProperties = value;
    }

    /**
     * Gets the value of the orderStatusResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusResponsePartnersType }
     *     
     */
    public OrderStatusResponsePartnersType getOrderStatusResponsePartners() {
        return orderStatusResponsePartners;
    }

    /**
     * Sets the value of the orderStatusResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusResponsePartnersType }
     *     
     */
    public void setOrderStatusResponsePartners(OrderStatusResponsePartnersType value) {
        this.orderStatusResponsePartners = value;
    }

    /**
     * Gets the value of the orderStatusResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusResponseDetailsType }
     *     
     */
    public OrderStatusResponseDetailsType getOrderStatusResponseDetails() {
        return orderStatusResponseDetails;
    }

    /**
     * Sets the value of the orderStatusResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusResponseDetailsType }
     *     
     */
    public void setOrderStatusResponseDetails(OrderStatusResponseDetailsType value) {
        this.orderStatusResponseDetails = value;
    }

}

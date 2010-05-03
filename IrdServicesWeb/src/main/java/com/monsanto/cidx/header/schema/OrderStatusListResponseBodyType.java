
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatusListResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderStatusListResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderStatusListResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderStatusListResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatusListResponseBodyType", propOrder = {
    "orderStatusListResponseProperties",
    "orderStatusListResponseDetails"
})
public class OrderStatusListResponseBodyType {

    @XmlElement(name = "OrderStatusListResponseProperties", required = true)
    protected OrderStatusListResponsePropertiesType orderStatusListResponseProperties;
    @XmlElement(name = "OrderStatusListResponseDetails", required = true)
    protected OrderStatusListResponseDetailsType orderStatusListResponseDetails;

    /**
     * Gets the value of the orderStatusListResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusListResponsePropertiesType }
     *     
     */
    public OrderStatusListResponsePropertiesType getOrderStatusListResponseProperties() {
        return orderStatusListResponseProperties;
    }

    /**
     * Sets the value of the orderStatusListResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusListResponsePropertiesType }
     *     
     */
    public void setOrderStatusListResponseProperties(OrderStatusListResponsePropertiesType value) {
        this.orderStatusListResponseProperties = value;
    }

    /**
     * Gets the value of the orderStatusListResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusListResponseDetailsType }
     *     
     */
    public OrderStatusListResponseDetailsType getOrderStatusListResponseDetails() {
        return orderStatusListResponseDetails;
    }

    /**
     * Sets the value of the orderStatusListResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusListResponseDetailsType }
     *     
     */
    public void setOrderStatusListResponseDetails(OrderStatusListResponseDetailsType value) {
        this.orderStatusListResponseDetails = value;
    }

}

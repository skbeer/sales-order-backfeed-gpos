
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderResponsePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderResponseBodyType", propOrder = {
    "orderResponseProperties",
    "orderResponsePartners",
    "orderResponseDetails"
})
public class OrderResponseBodyType {

    @XmlElement(name = "OrderResponseProperties", required = true)
    protected OrderResponsePropertiesType orderResponseProperties;
    @XmlElement(name = "OrderResponsePartners", required = true)
    protected OrderResponsePartnersType orderResponsePartners;
    @XmlElement(name = "OrderResponseDetails", required = true)
    protected OrderResponseDetailsType orderResponseDetails;

    /**
     * Gets the value of the orderResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link OrderResponsePropertiesType }
     *     
     */
    public OrderResponsePropertiesType getOrderResponseProperties() {
        return orderResponseProperties;
    }

    /**
     * Sets the value of the orderResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderResponsePropertiesType }
     *     
     */
    public void setOrderResponseProperties(OrderResponsePropertiesType value) {
        this.orderResponseProperties = value;
    }

    /**
     * Gets the value of the orderResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link OrderResponsePartnersType }
     *     
     */
    public OrderResponsePartnersType getOrderResponsePartners() {
        return orderResponsePartners;
    }

    /**
     * Sets the value of the orderResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderResponsePartnersType }
     *     
     */
    public void setOrderResponsePartners(OrderResponsePartnersType value) {
        this.orderResponsePartners = value;
    }

    /**
     * Gets the value of the orderResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrderResponseDetailsType }
     *     
     */
    public OrderResponseDetailsType getOrderResponseDetails() {
        return orderResponseDetails;
    }

    /**
     * Sets the value of the orderResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderResponseDetailsType }
     *     
     */
    public void setOrderResponseDetails(OrderResponseDetailsType value) {
        this.orderResponseDetails = value;
    }

}

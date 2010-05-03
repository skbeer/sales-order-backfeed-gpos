
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatusRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderStatusRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderStatusRequestProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderStatusRequestPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderStatusRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatusRequestBodyType", propOrder = {
    "orderStatusRequestProperties",
    "orderStatusRequestPartners",
    "orderStatusRequestDetails"
})
public class OrderStatusRequestBodyType {

    @XmlElement(name = "OrderStatusRequestProperties", required = true)
    protected OrderStatusRequestPropertiesType orderStatusRequestProperties;
    @XmlElement(name = "OrderStatusRequestPartners", required = true)
    protected OrderStatusRequestPartnersType orderStatusRequestPartners;
    @XmlElement(name = "OrderStatusRequestDetails", required = true)
    protected OrderStatusRequestDetailsType orderStatusRequestDetails;

    /**
     * Gets the value of the orderStatusRequestProperties property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusRequestPropertiesType }
     *     
     */
    public OrderStatusRequestPropertiesType getOrderStatusRequestProperties() {
        return orderStatusRequestProperties;
    }

    /**
     * Sets the value of the orderStatusRequestProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusRequestPropertiesType }
     *     
     */
    public void setOrderStatusRequestProperties(OrderStatusRequestPropertiesType value) {
        this.orderStatusRequestProperties = value;
    }

    /**
     * Gets the value of the orderStatusRequestPartners property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusRequestPartnersType }
     *     
     */
    public OrderStatusRequestPartnersType getOrderStatusRequestPartners() {
        return orderStatusRequestPartners;
    }

    /**
     * Sets the value of the orderStatusRequestPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusRequestPartnersType }
     *     
     */
    public void setOrderStatusRequestPartners(OrderStatusRequestPartnersType value) {
        this.orderStatusRequestPartners = value;
    }

    /**
     * Gets the value of the orderStatusRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusRequestDetailsType }
     *     
     */
    public OrderStatusRequestDetailsType getOrderStatusRequestDetails() {
        return orderStatusRequestDetails;
    }

    /**
     * Sets the value of the orderStatusRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusRequestDetailsType }
     *     
     */
    public void setOrderStatusRequestDetails(OrderStatusRequestDetailsType value) {
        this.orderStatusRequestDetails = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatusListRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderStatusListRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderStatusListRequestProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderStatusListRequestPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderStatusListRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatusListRequestBodyType", propOrder = {
    "orderStatusListRequestProperties",
    "orderStatusListRequestPartners",
    "orderStatusListRequestDetails"
})
public class OrderStatusListRequestBodyType {

    @XmlElement(name = "OrderStatusListRequestProperties", required = true)
    protected OrderStatusListRequestPropertiesType orderStatusListRequestProperties;
    @XmlElement(name = "OrderStatusListRequestPartners", required = true)
    protected OrderStatusListRequestPartnersType orderStatusListRequestPartners;
    @XmlElement(name = "OrderStatusListRequestDetails", required = true)
    protected OrderStatusListRequestDetailsType orderStatusListRequestDetails;

    /**
     * Gets the value of the orderStatusListRequestProperties property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusListRequestPropertiesType }
     *     
     */
    public OrderStatusListRequestPropertiesType getOrderStatusListRequestProperties() {
        return orderStatusListRequestProperties;
    }

    /**
     * Sets the value of the orderStatusListRequestProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusListRequestPropertiesType }
     *     
     */
    public void setOrderStatusListRequestProperties(OrderStatusListRequestPropertiesType value) {
        this.orderStatusListRequestProperties = value;
    }

    /**
     * Gets the value of the orderStatusListRequestPartners property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusListRequestPartnersType }
     *     
     */
    public OrderStatusListRequestPartnersType getOrderStatusListRequestPartners() {
        return orderStatusListRequestPartners;
    }

    /**
     * Sets the value of the orderStatusListRequestPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusListRequestPartnersType }
     *     
     */
    public void setOrderStatusListRequestPartners(OrderStatusListRequestPartnersType value) {
        this.orderStatusListRequestPartners = value;
    }

    /**
     * Gets the value of the orderStatusListRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusListRequestDetailsType }
     *     
     */
    public OrderStatusListRequestDetailsType getOrderStatusListRequestDetails() {
        return orderStatusListRequestDetails;
    }

    /**
     * Sets the value of the orderStatusListRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusListRequestDetailsType }
     *     
     */
    public void setOrderStatusListRequestDetails(OrderStatusListRequestDetailsType value) {
        this.orderStatusListRequestDetails = value;
    }

}

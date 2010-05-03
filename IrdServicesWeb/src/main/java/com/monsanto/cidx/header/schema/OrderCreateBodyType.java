
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderCreateBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderCreateBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderCreateProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderCreatePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderCreateDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCreateBodyType", propOrder = {
    "orderCreateProperties",
    "orderCreatePartners",
    "orderCreateDetails"
})
public class OrderCreateBodyType {

    @XmlElement(name = "OrderCreateProperties", required = true)
    protected OrderCreatePropertiesType orderCreateProperties;
    @XmlElement(name = "OrderCreatePartners", required = true)
    protected OrderCreatePartnersType orderCreatePartners;
    @XmlElement(name = "OrderCreateDetails", required = true)
    protected OrderCreateDetailsType orderCreateDetails;

    /**
     * Gets the value of the orderCreateProperties property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCreatePropertiesType }
     *     
     */
    public OrderCreatePropertiesType getOrderCreateProperties() {
        return orderCreateProperties;
    }

    /**
     * Sets the value of the orderCreateProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCreatePropertiesType }
     *     
     */
    public void setOrderCreateProperties(OrderCreatePropertiesType value) {
        this.orderCreateProperties = value;
    }

    /**
     * Gets the value of the orderCreatePartners property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCreatePartnersType }
     *     
     */
    public OrderCreatePartnersType getOrderCreatePartners() {
        return orderCreatePartners;
    }

    /**
     * Sets the value of the orderCreatePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCreatePartnersType }
     *     
     */
    public void setOrderCreatePartners(OrderCreatePartnersType value) {
        this.orderCreatePartners = value;
    }

    /**
     * Gets the value of the orderCreateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCreateDetailsType }
     *     
     */
    public OrderCreateDetailsType getOrderCreateDetails() {
        return orderCreateDetails;
    }

    /**
     * Sets the value of the orderCreateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCreateDetailsType }
     *     
     */
    public void setOrderCreateDetails(OrderCreateDetailsType value) {
        this.orderCreateDetails = value;
    }

}

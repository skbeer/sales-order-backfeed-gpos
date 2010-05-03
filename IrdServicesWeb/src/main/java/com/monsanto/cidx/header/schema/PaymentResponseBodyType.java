
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentResponsePartners"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentResponseBodyType", propOrder = {
    "paymentResponseProperties",
    "paymentResponsePartners"
})
public class PaymentResponseBodyType {

    @XmlElement(name = "PaymentResponseProperties", required = true)
    protected PaymentResponsePropertiesType paymentResponseProperties;
    @XmlElement(name = "PaymentResponsePartners", required = true)
    protected PaymentResponsePartnersType paymentResponsePartners;

    /**
     * Gets the value of the paymentResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentResponsePropertiesType }
     *     
     */
    public PaymentResponsePropertiesType getPaymentResponseProperties() {
        return paymentResponseProperties;
    }

    /**
     * Sets the value of the paymentResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentResponsePropertiesType }
     *     
     */
    public void setPaymentResponseProperties(PaymentResponsePropertiesType value) {
        this.paymentResponseProperties = value;
    }

    /**
     * Gets the value of the paymentResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentResponsePartnersType }
     *     
     */
    public PaymentResponsePartnersType getPaymentResponsePartners() {
        return paymentResponsePartners;
    }

    /**
     * Sets the value of the paymentResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentResponsePartnersType }
     *     
     */
    public void setPaymentResponsePartners(PaymentResponsePartnersType value) {
        this.paymentResponsePartners = value;
    }

}

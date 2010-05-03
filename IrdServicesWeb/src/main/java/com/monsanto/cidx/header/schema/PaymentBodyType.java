
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentPartners"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentBodyType", propOrder = {
    "paymentProperties",
    "paymentPartners"
})
public class PaymentBodyType {

    @XmlElement(name = "PaymentProperties", required = true)
    protected PaymentPropertiesType paymentProperties;
    @XmlElement(name = "PaymentPartners", required = true)
    protected PaymentPartnersType paymentPartners;

    /**
     * Gets the value of the paymentProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPropertiesType }
     *     
     */
    public PaymentPropertiesType getPaymentProperties() {
        return paymentProperties;
    }

    /**
     * Sets the value of the paymentProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPropertiesType }
     *     
     */
    public void setPaymentProperties(PaymentPropertiesType value) {
        this.paymentProperties = value;
    }

    /**
     * Gets the value of the paymentPartners property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPartnersType }
     *     
     */
    public PaymentPartnersType getPaymentPartners() {
        return paymentPartners;
    }

    /**
     * Sets the value of the paymentPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPartnersType }
     *     
     */
    public void setPaymentPartners(PaymentPartnersType value) {
        this.paymentPartners = value;
    }

}

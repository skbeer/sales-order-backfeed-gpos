
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDetailBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentDetailProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentDetailPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentDetailDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailBodyType", propOrder = {
    "paymentDetailProperties",
    "paymentDetailPartners",
    "paymentDetailDetails"
})
public class PaymentDetailBodyType {

    @XmlElement(name = "PaymentDetailProperties", required = true)
    protected PaymentDetailPropertiesType paymentDetailProperties;
    @XmlElement(name = "PaymentDetailPartners", required = true)
    protected PaymentDetailPartnersType paymentDetailPartners;
    @XmlElement(name = "PaymentDetailDetails", required = true)
    protected PaymentDetailDetailsType paymentDetailDetails;

    /**
     * Gets the value of the paymentDetailProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetailPropertiesType }
     *     
     */
    public PaymentDetailPropertiesType getPaymentDetailProperties() {
        return paymentDetailProperties;
    }

    /**
     * Sets the value of the paymentDetailProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetailPropertiesType }
     *     
     */
    public void setPaymentDetailProperties(PaymentDetailPropertiesType value) {
        this.paymentDetailProperties = value;
    }

    /**
     * Gets the value of the paymentDetailPartners property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetailPartnersType }
     *     
     */
    public PaymentDetailPartnersType getPaymentDetailPartners() {
        return paymentDetailPartners;
    }

    /**
     * Sets the value of the paymentDetailPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetailPartnersType }
     *     
     */
    public void setPaymentDetailPartners(PaymentDetailPartnersType value) {
        this.paymentDetailPartners = value;
    }

    /**
     * Gets the value of the paymentDetailDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetailDetailsType }
     *     
     */
    public PaymentDetailDetailsType getPaymentDetailDetails() {
        return paymentDetailDetails;
    }

    /**
     * Sets the value of the paymentDetailDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetailDetailsType }
     *     
     */
    public void setPaymentDetailDetails(PaymentDetailDetailsType value) {
        this.paymentDetailDetails = value;
    }

}

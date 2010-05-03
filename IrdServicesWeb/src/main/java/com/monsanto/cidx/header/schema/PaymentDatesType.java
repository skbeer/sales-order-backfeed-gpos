
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDatesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestSentDate" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentDueDate"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDatesType", propOrder = {
    "requestSentDate",
    "paymentDueDate"
})
public class PaymentDatesType {

    @XmlElement(name = "RequestSentDate")
    protected RequestSentDateType requestSentDate;
    @XmlElement(name = "PaymentDueDate", required = true)
    protected PaymentDueDateType paymentDueDate;

    /**
     * Gets the value of the requestSentDate property.
     * 
     * @return
     *     possible object is
     *     {@link RequestSentDateType }
     *     
     */
    public RequestSentDateType getRequestSentDate() {
        return requestSentDate;
    }

    /**
     * Sets the value of the requestSentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestSentDateType }
     *     
     */
    public void setRequestSentDate(RequestSentDateType value) {
        this.requestSentDate = value;
    }

    /**
     * Gets the value of the paymentDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDueDateType }
     *     
     */
    public PaymentDueDateType getPaymentDueDate() {
        return paymentDueDate;
    }

    /**
     * Sets the value of the paymentDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDueDateType }
     *     
     */
    public void setPaymentDueDate(PaymentDueDateType value) {
        this.paymentDueDate = value;
    }

}

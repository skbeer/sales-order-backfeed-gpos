
package com.monsanto.cidx.header.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PaymentTermsOfSaleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTermsOfSaleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TermsOfSaleDescription"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NetDaysDue"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentDueDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTermsOfSaleType", propOrder = {
    "termsOfSaleDescription",
    "netDaysDue",
    "paymentDueDate"
})
public class PaymentTermsOfSaleType {

    @XmlElement(name = "TermsOfSaleDescription", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String termsOfSaleDescription;
    @XmlElement(name = "NetDaysDue", required = true)
    protected BigInteger netDaysDue;
    @XmlElement(name = "PaymentDueDate")
    protected PaymentDueDateType paymentDueDate;

    /**
     * Gets the value of the termsOfSaleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsOfSaleDescription() {
        return termsOfSaleDescription;
    }

    /**
     * Sets the value of the termsOfSaleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsOfSaleDescription(String value) {
        this.termsOfSaleDescription = value;
    }

    /**
     * Gets the value of the netDaysDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNetDaysDue() {
        return netDaysDue;
    }

    /**
     * Sets the value of the netDaysDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNetDaysDue(BigInteger value) {
        this.netDaysDue = value;
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

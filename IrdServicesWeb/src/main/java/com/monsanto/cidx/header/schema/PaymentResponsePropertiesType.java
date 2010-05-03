
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PaymentResponsePropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentResponsePropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BuyerTransactionNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentDate" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TotalPaymentAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ErrorStatus"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LanguageCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentResponsePropertiesType", propOrder = {
    "buyerTransactionNumber",
    "paymentDate",
    "totalPaymentAmount",
    "errorStatus",
    "languageCode"
})
public class PaymentResponsePropertiesType {

    @XmlElement(name = "BuyerTransactionNumber", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String buyerTransactionNumber;
    @XmlElement(name = "PaymentDate")
    protected PaymentDateType paymentDate;
    @XmlElement(name = "TotalPaymentAmount")
    protected TotalPaymentAmountType totalPaymentAmount;
    @XmlElement(name = "ErrorStatus", required = true)
    protected ErrorStatusType errorStatus;
    @XmlElement(name = "LanguageCode")
    protected LanguageCodeType languageCode;

    /**
     * Gets the value of the buyerTransactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerTransactionNumber() {
        return buyerTransactionNumber;
    }

    /**
     * Sets the value of the buyerTransactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerTransactionNumber(String value) {
        this.buyerTransactionNumber = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDateType }
     *     
     */
    public PaymentDateType getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDateType }
     *     
     */
    public void setPaymentDate(PaymentDateType value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the totalPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TotalPaymentAmountType }
     *     
     */
    public TotalPaymentAmountType getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    /**
     * Sets the value of the totalPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPaymentAmountType }
     *     
     */
    public void setTotalPaymentAmount(TotalPaymentAmountType value) {
        this.totalPaymentAmount = value;
    }

    /**
     * Gets the value of the errorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorStatusType }
     *     
     */
    public ErrorStatusType getErrorStatus() {
        return errorStatus;
    }

    /**
     * Sets the value of the errorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorStatusType }
     *     
     */
    public void setErrorStatus(ErrorStatusType value) {
        this.errorStatus = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setLanguageCode(LanguageCodeType value) {
        this.languageCode = value;
    }

}

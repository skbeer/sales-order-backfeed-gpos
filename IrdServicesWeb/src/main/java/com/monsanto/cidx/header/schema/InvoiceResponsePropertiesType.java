
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceResponsePropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceResponsePropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InvoiceNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InvoiceTotals"/>
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
@XmlType(name = "InvoiceResponsePropertiesType", propOrder = {
    "invoiceNumber",
    "invoiceTotals",
    "errorStatus",
    "languageCode"
})
public class InvoiceResponsePropertiesType {

    @XmlElement(name = "InvoiceNumber", required = true)
    protected InvoiceNumberType invoiceNumber;
    @XmlElement(name = "InvoiceTotals", required = true)
    protected InvoiceTotalsType invoiceTotals;
    @XmlElement(name = "ErrorStatus", required = true)
    protected ErrorStatusType errorStatus;
    @XmlElement(name = "LanguageCode")
    protected LanguageCodeType languageCode;

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceNumberType }
     *     
     */
    public InvoiceNumberType getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceNumberType }
     *     
     */
    public void setInvoiceNumber(InvoiceNumberType value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the invoiceTotals property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTotalsType }
     *     
     */
    public InvoiceTotalsType getInvoiceTotals() {
        return invoiceTotals;
    }

    /**
     * Sets the value of the invoiceTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTotalsType }
     *     
     */
    public void setInvoiceTotals(InvoiceTotalsType value) {
        this.invoiceTotals = value;
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

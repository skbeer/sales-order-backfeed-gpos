
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InvoiceResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InvoiceResponsePartners"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceResponseBodyType", propOrder = {
    "invoiceResponseProperties",
    "invoiceResponsePartners"
})
public class InvoiceResponseBodyType {

    @XmlElement(name = "InvoiceResponseProperties", required = true)
    protected InvoiceResponsePropertiesType invoiceResponseProperties;
    @XmlElement(name = "InvoiceResponsePartners", required = true)
    protected InvoiceResponsePartnersType invoiceResponsePartners;

    /**
     * Gets the value of the invoiceResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceResponsePropertiesType }
     *     
     */
    public InvoiceResponsePropertiesType getInvoiceResponseProperties() {
        return invoiceResponseProperties;
    }

    /**
     * Sets the value of the invoiceResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceResponsePropertiesType }
     *     
     */
    public void setInvoiceResponseProperties(InvoiceResponsePropertiesType value) {
        this.invoiceResponseProperties = value;
    }

    /**
     * Gets the value of the invoiceResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceResponsePartnersType }
     *     
     */
    public InvoiceResponsePartnersType getInvoiceResponsePartners() {
        return invoiceResponsePartners;
    }

    /**
     * Sets the value of the invoiceResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceResponsePartnersType }
     *     
     */
    public void setInvoiceResponsePartners(InvoiceResponsePartnersType value) {
        this.invoiceResponsePartners = value;
    }

}

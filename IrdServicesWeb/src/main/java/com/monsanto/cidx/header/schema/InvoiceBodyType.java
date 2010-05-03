
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InvoiceProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InvoicePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InvoiceDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceBodyType", propOrder = {
    "invoiceProperties",
    "invoicePartners",
    "invoiceDetails"
})
public class InvoiceBodyType {

    @XmlElement(name = "InvoiceProperties", required = true)
    protected InvoicePropertiesType invoiceProperties;
    @XmlElement(name = "InvoicePartners", required = true)
    protected InvoicePartnersType invoicePartners;
    @XmlElement(name = "InvoiceDetails", required = true)
    protected InvoiceDetailsType invoiceDetails;

    /**
     * Gets the value of the invoiceProperties property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicePropertiesType }
     *     
     */
    public InvoicePropertiesType getInvoiceProperties() {
        return invoiceProperties;
    }

    /**
     * Sets the value of the invoiceProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicePropertiesType }
     *     
     */
    public void setInvoiceProperties(InvoicePropertiesType value) {
        this.invoiceProperties = value;
    }

    /**
     * Gets the value of the invoicePartners property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicePartnersType }
     *     
     */
    public InvoicePartnersType getInvoicePartners() {
        return invoicePartners;
    }

    /**
     * Sets the value of the invoicePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicePartnersType }
     *     
     */
    public void setInvoicePartners(InvoicePartnersType value) {
        this.invoicePartners = value;
    }

    /**
     * Gets the value of the invoiceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailsType }
     *     
     */
    public InvoiceDetailsType getInvoiceDetails() {
        return invoiceDetails;
    }

    /**
     * Sets the value of the invoiceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailsType }
     *     
     */
    public void setInvoiceDetails(InvoiceDetailsType value) {
        this.invoiceDetails = value;
    }

}

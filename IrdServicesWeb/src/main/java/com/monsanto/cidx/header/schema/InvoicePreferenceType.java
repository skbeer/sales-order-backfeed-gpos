
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InvoicePreferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoicePreferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InvoiceMode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BillingScheduleIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoicePreferenceType", propOrder = {
    "invoiceMode",
    "billingScheduleIdentifier"
})
public class InvoicePreferenceType {

    @XmlElement(name = "InvoiceMode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String invoiceMode;
    @XmlElement(name = "BillingScheduleIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String billingScheduleIdentifier;

    /**
     * Gets the value of the invoiceMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceMode() {
        return invoiceMode;
    }

    /**
     * Sets the value of the invoiceMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceMode(String value) {
        this.invoiceMode = value;
    }

    /**
     * Gets the value of the billingScheduleIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingScheduleIdentifier() {
        return billingScheduleIdentifier;
    }

    /**
     * Sets the value of the billingScheduleIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingScheduleIdentifier(String value) {
        this.billingScheduleIdentifier = value;
    }

}

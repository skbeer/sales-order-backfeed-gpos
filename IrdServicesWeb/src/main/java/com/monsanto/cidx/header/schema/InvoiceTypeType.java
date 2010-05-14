
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InvoiceTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceTypeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:cidx:names:specification:ces:schema:all:5:0>cidxToken">
 *       &lt;attribute name="InvoiceQualifier" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListInvoiceQualifier" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceTypeType", propOrder = {
    "value"
})
public class InvoiceTypeType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "InvoiceQualifier", required = true)
    protected CidxListInvoiceQualifier invoiceQualifier;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the invoiceQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListInvoiceQualifier }
     *     
     */
    public CidxListInvoiceQualifier getInvoiceQualifier() {
        return invoiceQualifier;
    }

    /**
     * Sets the value of the invoiceQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListInvoiceQualifier }
     *     
     */
    public void setInvoiceQualifier(CidxListInvoiceQualifier value) {
        this.invoiceQualifier = value;
    }

}

package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiptSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiptSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReceiptQuantity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiptSummaryType", propOrder = {
    "receiptQuantity",
    "dateTime"
})
public class ReceiptSummaryType {

    @XmlElement(name = "ReceiptQuantity", required = true)
    protected ReceiptQuantityType receiptQuantity;
    @XmlElement(name = "DateTime", required = true)
    protected DateTimeType dateTime;

    /**
     * Gets the value of the receiptQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptQuantityType }
     *     
     */
    public ReceiptQuantityType getReceiptQuantity() {
        return receiptQuantity;
    }

    /**
     * Sets the value of the receiptQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptQuantityType }
     *     
     */
    public void setReceiptQuantity(ReceiptQuantityType value) {
        this.receiptQuantity = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setDateTime(DateTimeType value) {
        this.dateTime = value;
    }

}

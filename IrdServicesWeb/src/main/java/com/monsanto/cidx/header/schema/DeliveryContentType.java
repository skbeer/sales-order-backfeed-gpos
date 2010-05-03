
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DeliveryContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryProduct"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}StorageTankIdentifier" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReceiptSummary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryContentType", propOrder = {
    "lineNumber",
    "deliveryProduct",
    "storageTankIdentifier",
    "receiptSummary"
})
public class DeliveryContentType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "DeliveryProduct", required = true)
    protected DeliveryProductType deliveryProduct;
    @XmlElement(name = "StorageTankIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String storageTankIdentifier;
    @XmlElement(name = "ReceiptSummary", required = true)
    protected ReceiptSummaryType receiptSummary;

    /**
     * Gets the value of the lineNumber property.
     * 
     */
    public long getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     */
    public void setLineNumber(long value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the deliveryProduct property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryProductType }
     *     
     */
    public DeliveryProductType getDeliveryProduct() {
        return deliveryProduct;
    }

    /**
     * Sets the value of the deliveryProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryProductType }
     *     
     */
    public void setDeliveryProduct(DeliveryProductType value) {
        this.deliveryProduct = value;
    }

    /**
     * Gets the value of the storageTankIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageTankIdentifier() {
        return storageTankIdentifier;
    }

    /**
     * Sets the value of the storageTankIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageTankIdentifier(String value) {
        this.storageTankIdentifier = value;
    }

    /**
     * Gets the value of the receiptSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptSummaryType }
     *     
     */
    public ReceiptSummaryType getReceiptSummary() {
        return receiptSummary;
    }

    /**
     * Sets the value of the receiptSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptSummaryType }
     *     
     */
    public void setReceiptSummary(ReceiptSummaryType value) {
        this.receiptSummary = value;
    }

}

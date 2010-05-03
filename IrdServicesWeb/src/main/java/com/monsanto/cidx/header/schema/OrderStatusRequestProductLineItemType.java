
package com.monsanto.cidx.header.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for OrderStatusRequestProductLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderStatusRequestProductLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PurchaseOrderLineItemNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReleaseNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SalesOrderIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatusRequestProductLineItemType", propOrder = {
    "lineNumber",
    "purchaseOrderLineItemNumber",
    "releaseNumber",
    "salesOrderIdentifier"
})
public class OrderStatusRequestProductLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "PurchaseOrderLineItemNumber", required = true)
    protected BigInteger purchaseOrderLineItemNumber;
    @XmlElement(name = "ReleaseNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String releaseNumber;
    @XmlElement(name = "SalesOrderIdentifier")
    protected SalesOrderIdentifierType salesOrderIdentifier;

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
     * Gets the value of the purchaseOrderLineItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPurchaseOrderLineItemNumber() {
        return purchaseOrderLineItemNumber;
    }

    /**
     * Sets the value of the purchaseOrderLineItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPurchaseOrderLineItemNumber(BigInteger value) {
        this.purchaseOrderLineItemNumber = value;
    }

    /**
     * Gets the value of the releaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseNumber() {
        return releaseNumber;
    }

    /**
     * Sets the value of the releaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseNumber(String value) {
        this.releaseNumber = value;
    }

    /**
     * Gets the value of the salesOrderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderIdentifierType }
     *     
     */
    public SalesOrderIdentifierType getSalesOrderIdentifier() {
        return salesOrderIdentifier;
    }

    /**
     * Sets the value of the salesOrderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderIdentifierType }
     *     
     */
    public void setSalesOrderIdentifier(SalesOrderIdentifierType value) {
        this.salesOrderIdentifier = value;
    }

}


package com.monsanto.cidx.header.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackagingItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingItemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductLineItemLineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShippedQuantity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductSubLineItems" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingItemsType", propOrder = {
    "productLineItemLineNumber",
    "shippedQuantity",
    "productSubLineItems"
})
public class PackagingItemsType {

    @XmlElement(name = "ProductLineItemLineNumber", required = true)
    protected BigInteger productLineItemLineNumber;
    @XmlElement(name = "ShippedQuantity", required = true)
    protected ShippedQuantityType shippedQuantity;
    @XmlElement(name = "ProductSubLineItems")
    protected List<ProductSubLineItemsType> productSubLineItems;

    /**
     * Gets the value of the productLineItemLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductLineItemLineNumber() {
        return productLineItemLineNumber;
    }

    /**
     * Sets the value of the productLineItemLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductLineItemLineNumber(BigInteger value) {
        this.productLineItemLineNumber = value;
    }

    /**
     * Gets the value of the shippedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ShippedQuantityType }
     *     
     */
    public ShippedQuantityType getShippedQuantity() {
        return shippedQuantity;
    }

    /**
     * Sets the value of the shippedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippedQuantityType }
     *     
     */
    public void setShippedQuantity(ShippedQuantityType value) {
        this.shippedQuantity = value;
    }

    /**
     * Gets the value of the productSubLineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSubLineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSubLineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSubLineItemsType }
     * 
     * 
     */
    public List<ProductSubLineItemsType> getProductSubLineItems() {
        if (productSubLineItems == null) {
            productSubLineItems = new ArrayList<ProductSubLineItemsType>();
        }
        return this.productSubLineItems;
    }

}

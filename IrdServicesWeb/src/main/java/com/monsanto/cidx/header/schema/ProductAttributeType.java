
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProductAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductAttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductAttributeName"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductAttributeValue"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductAttributeType", propOrder = {
    "productAttributeName",
    "productAttributeValue"
})
public class ProductAttributeType {

    @XmlElement(name = "ProductAttributeName", required = true)
    protected ProductAttributeNameType productAttributeName;
    @XmlElement(name = "ProductAttributeValue", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String productAttributeValue;

    /**
     * Gets the value of the productAttributeName property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAttributeNameType }
     *     
     */
    public ProductAttributeNameType getProductAttributeName() {
        return productAttributeName;
    }

    /**
     * Sets the value of the productAttributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAttributeNameType }
     *     
     */
    public void setProductAttributeName(ProductAttributeNameType value) {
        this.productAttributeName = value;
    }

    /**
     * Gets the value of the productAttributeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductAttributeValue() {
        return productAttributeValue;
    }

    /**
     * Sets the value of the productAttributeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductAttributeValue(String value) {
        this.productAttributeValue = value;
    }

}

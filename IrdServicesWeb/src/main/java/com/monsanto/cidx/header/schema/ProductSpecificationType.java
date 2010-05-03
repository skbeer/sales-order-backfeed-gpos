
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProductSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductSpecificationName"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductSpecificationValue"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductSpecificationUnit"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductSpecificationMethod"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSpecificationType", propOrder = {
    "productSpecificationName",
    "productSpecificationValue",
    "productSpecificationUnit",
    "productSpecificationMethod"
})
public class ProductSpecificationType {

    @XmlElement(name = "ProductSpecificationName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String productSpecificationName;
    @XmlElement(name = "ProductSpecificationValue", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String productSpecificationValue;
    @XmlElement(name = "ProductSpecificationUnit", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String productSpecificationUnit;
    @XmlElement(name = "ProductSpecificationMethod", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String productSpecificationMethod;

    /**
     * Gets the value of the productSpecificationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSpecificationName() {
        return productSpecificationName;
    }

    /**
     * Sets the value of the productSpecificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSpecificationName(String value) {
        this.productSpecificationName = value;
    }

    /**
     * Gets the value of the productSpecificationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSpecificationValue() {
        return productSpecificationValue;
    }

    /**
     * Sets the value of the productSpecificationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSpecificationValue(String value) {
        this.productSpecificationValue = value;
    }

    /**
     * Gets the value of the productSpecificationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSpecificationUnit() {
        return productSpecificationUnit;
    }

    /**
     * Sets the value of the productSpecificationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSpecificationUnit(String value) {
        this.productSpecificationUnit = value;
    }

    /**
     * Gets the value of the productSpecificationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSpecificationMethod() {
        return productSpecificationMethod;
    }

    /**
     * Sets the value of the productSpecificationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSpecificationMethod(String value) {
        this.productSpecificationMethod = value;
    }

}

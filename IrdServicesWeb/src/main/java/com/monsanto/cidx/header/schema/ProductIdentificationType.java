
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProductIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductIdentifier"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductName" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Trademark" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductDescription" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductGradeDescription" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductClassification" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductFormula" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductIdentificationType", propOrder = {
    "productIdentifier",
    "productName",
    "trademark",
    "productDescription",
    "productGradeDescription",
    "productClassification",
    "productFormula"
})
public class ProductIdentificationType {

    @XmlElement(name = "ProductIdentifier", required = true)
    protected ProductIdentifierType productIdentifier;
    @XmlElement(name = "ProductName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String productName;
    @XmlElement(name = "Trademark")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String trademark;
    @XmlElement(name = "ProductDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String productDescription;
    @XmlElement(name = "ProductGradeDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String productGradeDescription;
    @XmlElement(name = "ProductClassification")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String productClassification;
    @XmlElement(name = "ProductFormula")
    protected ProductFormulaType productFormula;

    /**
     * Gets the value of the productIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentifierType }
     *     
     */
    public ProductIdentifierType getProductIdentifier() {
        return productIdentifier;
    }

    /**
     * Sets the value of the productIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentifierType }
     *     
     */
    public void setProductIdentifier(ProductIdentifierType value) {
        this.productIdentifier = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the trademark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrademark() {
        return trademark;
    }

    /**
     * Sets the value of the trademark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrademark(String value) {
        this.trademark = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the productGradeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductGradeDescription() {
        return productGradeDescription;
    }

    /**
     * Sets the value of the productGradeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductGradeDescription(String value) {
        this.productGradeDescription = value;
    }

    /**
     * Gets the value of the productClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductClassification() {
        return productClassification;
    }

    /**
     * Sets the value of the productClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductClassification(String value) {
        this.productClassification = value;
    }

    /**
     * Gets the value of the productFormula property.
     * 
     * @return
     *     possible object is
     *     {@link ProductFormulaType }
     *     
     */
    public ProductFormulaType getProductFormula() {
        return productFormula;
    }

    /**
     * Sets the value of the productFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFormulaType }
     *     
     */
    public void setProductFormula(ProductFormulaType value) {
        this.productFormula = value;
    }

}

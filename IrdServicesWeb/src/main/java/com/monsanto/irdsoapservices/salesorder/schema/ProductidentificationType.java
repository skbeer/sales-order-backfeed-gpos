
package com.monsanto.irdsoapservices.salesorder.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProductidentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductidentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductIdentifier" type="{urn:ecms:schema:salesorderreport:response:1:0}ProductIdentifierType"/>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductidentificationType", propOrder = {
    "productIdentifier",
    "productName",
    "productNum",
    "lineIdentifier",
    "BrandFamily",
    "BrandName"
})
public class ProductidentificationType {

    @XmlElement(name = "ProductIdentifier", required = true)
    protected ProductIdentifierType productIdentifier;
    @XmlElement(name = "ProductName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String productName;
    @XmlElement(name = "ProductNum")
    protected String productNum;
    @XmlElement(name = "LineIdentifier")
    protected String lineIdentifier;
    //CUSTPLT-632 - Introducing new Partner Agdata
    @XmlElement(name = "BrandFamily")
    protected String BrandFamily;
    @XmlElement(name = "BrandName")
    protected String BrandName;


    public String getBrandFamily() {
        return BrandFamily;
    }

    public void setBrandFamily(String brandFamily) {
        this.BrandFamily = brandFamily;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

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

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getLineIdentifier() {
        return lineIdentifier;
    }

    public void setLineIdentifier(String lineIdentifier) {
        this.lineIdentifier = lineIdentifier;
    }


}

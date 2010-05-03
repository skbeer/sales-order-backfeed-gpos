
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductCatalogUpdateBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCatalogUpdateBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductCatalogUpdateProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductCatalogUpdatePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductCatalogUpdateDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCatalogUpdateBodyType", propOrder = {
    "productCatalogUpdateProperties",
    "productCatalogUpdatePartners",
    "productCatalogUpdateDetails"
})
public class ProductCatalogUpdateBodyType {

    @XmlElement(name = "ProductCatalogUpdateProperties", required = true)
    protected ProductCatalogUpdatePropertiesType productCatalogUpdateProperties;
    @XmlElement(name = "ProductCatalogUpdatePartners", required = true)
    protected ProductCatalogUpdatePartnersType productCatalogUpdatePartners;
    @XmlElement(name = "ProductCatalogUpdateDetails", required = true)
    protected ProductCatalogUpdateDetailsType productCatalogUpdateDetails;

    /**
     * Gets the value of the productCatalogUpdateProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCatalogUpdatePropertiesType }
     *     
     */
    public ProductCatalogUpdatePropertiesType getProductCatalogUpdateProperties() {
        return productCatalogUpdateProperties;
    }

    /**
     * Sets the value of the productCatalogUpdateProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCatalogUpdatePropertiesType }
     *     
     */
    public void setProductCatalogUpdateProperties(ProductCatalogUpdatePropertiesType value) {
        this.productCatalogUpdateProperties = value;
    }

    /**
     * Gets the value of the productCatalogUpdatePartners property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCatalogUpdatePartnersType }
     *     
     */
    public ProductCatalogUpdatePartnersType getProductCatalogUpdatePartners() {
        return productCatalogUpdatePartners;
    }

    /**
     * Sets the value of the productCatalogUpdatePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCatalogUpdatePartnersType }
     *     
     */
    public void setProductCatalogUpdatePartners(ProductCatalogUpdatePartnersType value) {
        this.productCatalogUpdatePartners = value;
    }

    /**
     * Gets the value of the productCatalogUpdateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCatalogUpdateDetailsType }
     *     
     */
    public ProductCatalogUpdateDetailsType getProductCatalogUpdateDetails() {
        return productCatalogUpdateDetails;
    }

    /**
     * Sets the value of the productCatalogUpdateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCatalogUpdateDetailsType }
     *     
     */
    public void setProductCatalogUpdateDetails(ProductCatalogUpdateDetailsType value) {
        this.productCatalogUpdateDetails = value;
    }

}

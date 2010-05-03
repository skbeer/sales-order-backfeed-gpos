
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductIdentification"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductClassification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CountryOfOriginCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarketingName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ManufacturerInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInformationType", propOrder = {
    "productIdentification",
    "productSpecification",
    "productClassification",
    "packagingInformation",
    "countryOfOriginCode",
    "marketingName",
    "manufacturerInformation"
})
public class ProductInformationType {

    @XmlElement(name = "ProductIdentification", required = true)
    protected ProductIdentificationType productIdentification;
    @XmlElement(name = "ProductSpecification")
    protected List<ProductSpecificationType> productSpecification;
    @XmlElement(name = "ProductClassification")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> productClassification;
    @XmlElement(name = "PackagingInformation")
    protected PackagingInformationType packagingInformation;
    @XmlElement(name = "CountryOfOriginCode")
    protected CountryOfOriginCodeType countryOfOriginCode;
    @XmlElement(name = "MarketingName")
    protected List<MarketingNameType> marketingName;
    @XmlElement(name = "ManufacturerInformation")
    protected ManufacturerInformationType manufacturerInformation;

    /**
     * Gets the value of the productIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationType }
     *     
     */
    public ProductIdentificationType getProductIdentification() {
        return productIdentification;
    }

    /**
     * Sets the value of the productIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationType }
     *     
     */
    public void setProductIdentification(ProductIdentificationType value) {
        this.productIdentification = value;
    }

    /**
     * Gets the value of the productSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSpecificationType }
     * 
     * 
     */
    public List<ProductSpecificationType> getProductSpecification() {
        if (productSpecification == null) {
            productSpecification = new ArrayList<ProductSpecificationType>();
        }
        return this.productSpecification;
    }

    /**
     * Gets the value of the productClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductClassification() {
        if (productClassification == null) {
            productClassification = new ArrayList<String>();
        }
        return this.productClassification;
    }

    /**
     * Gets the value of the packagingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingInformationType }
     *     
     */
    public PackagingInformationType getPackagingInformation() {
        return packagingInformation;
    }

    /**
     * Sets the value of the packagingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingInformationType }
     *     
     */
    public void setPackagingInformation(PackagingInformationType value) {
        this.packagingInformation = value;
    }

    /**
     * Gets the value of the countryOfOriginCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryOfOriginCodeType }
     *     
     */
    public CountryOfOriginCodeType getCountryOfOriginCode() {
        return countryOfOriginCode;
    }

    /**
     * Sets the value of the countryOfOriginCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryOfOriginCodeType }
     *     
     */
    public void setCountryOfOriginCode(CountryOfOriginCodeType value) {
        this.countryOfOriginCode = value;
    }

    /**
     * Gets the value of the marketingName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketingName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketingNameType }
     * 
     * 
     */
    public List<MarketingNameType> getMarketingName() {
        if (marketingName == null) {
            marketingName = new ArrayList<MarketingNameType>();
        }
        return this.marketingName;
    }

    /**
     * Gets the value of the manufacturerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturerInformationType }
     *     
     */
    public ManufacturerInformationType getManufacturerInformation() {
        return manufacturerInformation;
    }

    /**
     * Sets the value of the manufacturerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturerInformationType }
     *     
     */
    public void setManufacturerInformation(ManufacturerInformationType value) {
        this.manufacturerInformation = value;
    }

}

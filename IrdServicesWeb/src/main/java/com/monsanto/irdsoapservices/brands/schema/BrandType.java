
package com.monsanto.irdsoapservices.brands.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrandType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BrandId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BrandDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SeedCompanyAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SeedCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeedCompanyAccountAttribute" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SAPBrandChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrandType", propOrder = {
    "brandId",
    "brandDescription",
    "seedCompanyAccountId",
    "seedCompanyName",
    "seedCompanyAccountAttribute",
    "sapBrandChannel"
})
public class BrandType {

    @XmlElement(name = "BrandId")
    protected long brandId;
    @XmlElement(name = "BrandDescription", required = true)
    protected String brandDescription;
    @XmlElement(name = "SeedCompanyAccountId")
    protected Long seedCompanyAccountId;
    @XmlElement(name = "SeedCompanyName")
    protected String seedCompanyName;
    @XmlElement(name = "SeedCompanyAccountAttribute", required = true)
    protected String seedCompanyAccountAttribute;
    @XmlElement(name = "SAPBrandChannel", required = true)
    protected String sapBrandChannel;

    /**
     * Gets the value of the brandId property.
     * 
     */
    public long getBrandId() {
        return brandId;
    }

    /**
     * Sets the value of the brandId property.
     * 
     */
    public void setBrandId(long value) {
        this.brandId = value;
    }

    /**
     * Gets the value of the brandDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandDescription() {
        return brandDescription;
    }

    /**
     * Sets the value of the brandDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandDescription(String value) {
        this.brandDescription = value;
    }

    /**
     * Gets the value of the seedCompanyAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeedCompanyAccountId() {
        return seedCompanyAccountId;
    }

    /**
     * Sets the value of the seedCompanyAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeedCompanyAccountId(Long value) {
        this.seedCompanyAccountId = value;
    }

    /**
     * Gets the value of the seedCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeedCompanyName() {
        return seedCompanyName;
    }

    /**
     * Sets the value of the seedCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeedCompanyName(String value) {
        this.seedCompanyName = value;
    }

    /**
     * Gets the value of the seedCompanyAccountAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeedCompanyAccountAttribute() {
        return seedCompanyAccountAttribute;
    }

    /**
     * Sets the value of the seedCompanyAccountAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeedCompanyAccountAttribute(String value) {
        this.seedCompanyAccountAttribute = value;
    }

    /**
     * Gets the value of the sapBrandChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPBrandChannel() {
        return sapBrandChannel;
    }

    /**
     * Sets the value of the sapBrandChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPBrandChannel(String value) {
        this.sapBrandChannel = value;
    }

}

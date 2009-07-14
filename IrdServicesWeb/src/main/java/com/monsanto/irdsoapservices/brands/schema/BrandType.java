
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
    "brandDescription"
})
public class BrandType {

    @XmlElement(name = "BrandId")
    protected long brandId;
    @XmlElement(name = "BrandDescription", required = true)
    protected String brandDescription;

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

}

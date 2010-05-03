
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HazmatDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazmatDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DangerousSubstanceHandling" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HazardousProperties" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HazardousGoods" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazmatDataType", propOrder = {
    "dangerousSubstanceHandling",
    "hazardousProperties",
    "hazardousGoods"
})
public class HazmatDataType {

    @XmlElement(name = "DangerousSubstanceHandling")
    protected DangerousSubstanceHandlingType dangerousSubstanceHandling;
    @XmlElement(name = "HazardousProperties")
    protected HazardousPropertiesType hazardousProperties;
    @XmlElement(name = "HazardousGoods")
    protected HazardousGoodsType hazardousGoods;

    /**
     * Gets the value of the dangerousSubstanceHandling property.
     * 
     * @return
     *     possible object is
     *     {@link DangerousSubstanceHandlingType }
     *     
     */
    public DangerousSubstanceHandlingType getDangerousSubstanceHandling() {
        return dangerousSubstanceHandling;
    }

    /**
     * Sets the value of the dangerousSubstanceHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousSubstanceHandlingType }
     *     
     */
    public void setDangerousSubstanceHandling(DangerousSubstanceHandlingType value) {
        this.dangerousSubstanceHandling = value;
    }

    /**
     * Gets the value of the hazardousProperties property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousPropertiesType }
     *     
     */
    public HazardousPropertiesType getHazardousProperties() {
        return hazardousProperties;
    }

    /**
     * Sets the value of the hazardousProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousPropertiesType }
     *     
     */
    public void setHazardousProperties(HazardousPropertiesType value) {
        this.hazardousProperties = value;
    }

    /**
     * Gets the value of the hazardousGoods property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousGoodsType }
     *     
     */
    public HazardousGoodsType getHazardousGoods() {
        return hazardousGoods;
    }

    /**
     * Sets the value of the hazardousGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousGoodsType }
     *     
     */
    public void setHazardousGoods(HazardousGoodsType value) {
        this.hazardousGoods = value;
    }

}

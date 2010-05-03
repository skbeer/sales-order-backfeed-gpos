
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ManufacturingIdentificationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManufacturingIdentificationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ManufacturingIdentificationType"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ManufacturingIdentificationNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ParentManufacturingIdentificationNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManufacturingIdentificationDetailsType", propOrder = {
    "manufacturingIdentificationType",
    "manufacturingIdentificationNumber",
    "parentManufacturingIdentificationNumber"
})
public class ManufacturingIdentificationDetailsType {

    @XmlElement(name = "ManufacturingIdentificationType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String manufacturingIdentificationType;
    @XmlElement(name = "ManufacturingIdentificationNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String manufacturingIdentificationNumber;
    @XmlElement(name = "ParentManufacturingIdentificationNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String parentManufacturingIdentificationNumber;

    /**
     * Gets the value of the manufacturingIdentificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturingIdentificationType() {
        return manufacturingIdentificationType;
    }

    /**
     * Sets the value of the manufacturingIdentificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturingIdentificationType(String value) {
        this.manufacturingIdentificationType = value;
    }

    /**
     * Gets the value of the manufacturingIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturingIdentificationNumber() {
        return manufacturingIdentificationNumber;
    }

    /**
     * Sets the value of the manufacturingIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturingIdentificationNumber(String value) {
        this.manufacturingIdentificationNumber = value;
    }

    /**
     * Gets the value of the parentManufacturingIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentManufacturingIdentificationNumber() {
        return parentManufacturingIdentificationNumber;
    }

    /**
     * Sets the value of the parentManufacturingIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentManufacturingIdentificationNumber(String value) {
        this.parentManufacturingIdentificationNumber = value;
    }

}

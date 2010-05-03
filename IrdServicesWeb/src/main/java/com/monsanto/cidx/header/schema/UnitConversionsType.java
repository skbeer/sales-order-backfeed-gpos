
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for UnitConversionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitConversionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}FromUnitOfMeasure"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ConversionFactor"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ToUnitOfMeasure"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitConversionsType", propOrder = {
    "fromUnitOfMeasure",
    "conversionFactor",
    "toUnitOfMeasure"
})
public class UnitConversionsType {

    @XmlElement(name = "FromUnitOfMeasure", required = true)
    protected FromUnitOfMeasureType fromUnitOfMeasure;
    @XmlElement(name = "ConversionFactor", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String conversionFactor;
    @XmlElement(name = "ToUnitOfMeasure", required = true)
    protected ToUnitOfMeasureType toUnitOfMeasure;

    /**
     * Gets the value of the fromUnitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link FromUnitOfMeasureType }
     *     
     */
    public FromUnitOfMeasureType getFromUnitOfMeasure() {
        return fromUnitOfMeasure;
    }

    /**
     * Sets the value of the fromUnitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromUnitOfMeasureType }
     *     
     */
    public void setFromUnitOfMeasure(FromUnitOfMeasureType value) {
        this.fromUnitOfMeasure = value;
    }

    /**
     * Gets the value of the conversionFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionFactor() {
        return conversionFactor;
    }

    /**
     * Sets the value of the conversionFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionFactor(String value) {
        this.conversionFactor = value;
    }

    /**
     * Gets the value of the toUnitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link ToUnitOfMeasureType }
     *     
     */
    public ToUnitOfMeasureType getToUnitOfMeasure() {
        return toUnitOfMeasure;
    }

    /**
     * Sets the value of the toUnitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToUnitOfMeasureType }
     *     
     */
    public void setToUnitOfMeasure(ToUnitOfMeasureType value) {
        this.toUnitOfMeasure = value;
    }

}

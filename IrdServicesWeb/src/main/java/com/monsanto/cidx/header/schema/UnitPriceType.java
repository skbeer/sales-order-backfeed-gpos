
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for UnitPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitPriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MonetaryAmount"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GlobalMaterialUnitOfMeasureCode" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxToken" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitPriceType", propOrder = {
    "monetaryAmount"
})
public class UnitPriceType {

    @XmlElement(name = "MonetaryAmount", required = true)
    protected MonetaryAmountType monetaryAmount;
    @XmlAttribute(name = "GlobalMaterialUnitOfMeasureCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String globalMaterialUnitOfMeasureCode;

    /**
     * Gets the value of the monetaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getMonetaryAmount() {
        return monetaryAmount;
    }

    /**
     * Sets the value of the monetaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setMonetaryAmount(MonetaryAmountType value) {
        this.monetaryAmount = value;
    }

    /**
     * Gets the value of the globalMaterialUnitOfMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalMaterialUnitOfMeasureCode() {
        return globalMaterialUnitOfMeasureCode;
    }

    /**
     * Sets the value of the globalMaterialUnitOfMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalMaterialUnitOfMeasureCode(String value) {
        this.globalMaterialUnitOfMeasureCode = value;
    }

}

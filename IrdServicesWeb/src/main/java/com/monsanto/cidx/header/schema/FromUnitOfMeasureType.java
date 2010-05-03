
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FromUnitOfMeasureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FromUnitOfMeasureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}UnitOfMeasureCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FromUnitOfMeasureType", propOrder = {
    "unitOfMeasureCode"
})
public class FromUnitOfMeasureType {

    @XmlElement(name = "UnitOfMeasureCode", required = true)
    protected UnitOfMeasureCodeType unitOfMeasureCode;

    /**
     * Gets the value of the unitOfMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureCodeType }
     *     
     */
    public UnitOfMeasureCodeType getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * Sets the value of the unitOfMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureCodeType }
     *     
     */
    public void setUnitOfMeasureCode(UnitOfMeasureCodeType value) {
        this.unitOfMeasureCode = value;
    }

}

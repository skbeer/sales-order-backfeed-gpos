
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for QuantitativeResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantitativeResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}UnitOfMeasureCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TestValue"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LowerLimit" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}UpperLimit" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Resolution" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantitativeResultType", propOrder = {
    "unitOfMeasureCode",
    "testValue",
    "lowerLimit",
    "upperLimit",
    "resolution"
})
public class QuantitativeResultType {

    @XmlElement(name = "UnitOfMeasureCode", required = true)
    protected UnitOfMeasureCodeType unitOfMeasureCode;
    @XmlElement(name = "TestValue", required = true)
    protected TestValueType testValue;
    @XmlElement(name = "LowerLimit")
    protected LowerLimitType lowerLimit;
    @XmlElement(name = "UpperLimit")
    protected UpperLimitType upperLimit;
    @XmlElement(name = "Resolution")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String resolution;

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

    /**
     * Gets the value of the testValue property.
     * 
     * @return
     *     possible object is
     *     {@link TestValueType }
     *     
     */
    public TestValueType getTestValue() {
        return testValue;
    }

    /**
     * Sets the value of the testValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestValueType }
     *     
     */
    public void setTestValue(TestValueType value) {
        this.testValue = value;
    }

    /**
     * Gets the value of the lowerLimit property.
     * 
     * @return
     *     possible object is
     *     {@link LowerLimitType }
     *     
     */
    public LowerLimitType getLowerLimit() {
        return lowerLimit;
    }

    /**
     * Sets the value of the lowerLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LowerLimitType }
     *     
     */
    public void setLowerLimit(LowerLimitType value) {
        this.lowerLimit = value;
    }

    /**
     * Gets the value of the upperLimit property.
     * 
     * @return
     *     possible object is
     *     {@link UpperLimitType }
     *     
     */
    public UpperLimitType getUpperLimit() {
        return upperLimit;
    }

    /**
     * Sets the value of the upperLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpperLimitType }
     *     
     */
    public void setUpperLimit(UpperLimitType value) {
        this.upperLimit = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

}

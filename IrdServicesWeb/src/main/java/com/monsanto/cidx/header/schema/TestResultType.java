
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}QualitativeResult"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}QuantitativeResult"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestResultType", propOrder = {
    "qualitativeResult",
    "quantitativeResult"
})
public class TestResultType {

    @XmlElement(name = "QualitativeResult")
    protected QualitativeResultType qualitativeResult;
    @XmlElement(name = "QuantitativeResult")
    protected QuantitativeResultType quantitativeResult;

    /**
     * Gets the value of the qualitativeResult property.
     * 
     * @return
     *     possible object is
     *     {@link QualitativeResultType }
     *     
     */
    public QualitativeResultType getQualitativeResult() {
        return qualitativeResult;
    }

    /**
     * Sets the value of the qualitativeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualitativeResultType }
     *     
     */
    public void setQualitativeResult(QualitativeResultType value) {
        this.qualitativeResult = value;
    }

    /**
     * Gets the value of the quantitativeResult property.
     * 
     * @return
     *     possible object is
     *     {@link QuantitativeResultType }
     *     
     */
    public QuantitativeResultType getQuantitativeResult() {
        return quantitativeResult;
    }

    /**
     * Sets the value of the quantitativeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantitativeResultType }
     *     
     */
    public void setQuantitativeResult(QuantitativeResultType value) {
        this.quantitativeResult = value;
    }

}

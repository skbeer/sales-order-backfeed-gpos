
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateBasisTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateBasisTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ActualValue"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RatedValue"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateBasisTypeType", propOrder = {
    "actualValue",
    "ratedValue"
})
public class RateBasisTypeType {

    @XmlElement(name = "ActualValue", required = true)
    protected ActualValueType actualValue;
    @XmlElement(name = "RatedValue", required = true)
    protected RatedValueType ratedValue;

    /**
     * Gets the value of the actualValue property.
     * 
     * @return
     *     possible object is
     *     {@link ActualValueType }
     *     
     */
    public ActualValueType getActualValue() {
        return actualValue;
    }

    /**
     * Sets the value of the actualValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualValueType }
     *     
     */
    public void setActualValue(ActualValueType value) {
        this.actualValue = value;
    }

    /**
     * Gets the value of the ratedValue property.
     * 
     * @return
     *     possible object is
     *     {@link RatedValueType }
     *     
     */
    public RatedValueType getRatedValue() {
        return ratedValue;
    }

    /**
     * Sets the value of the ratedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatedValueType }
     *     
     */
    public void setRatedValue(RatedValueType value) {
        this.ratedValue = value;
    }

}

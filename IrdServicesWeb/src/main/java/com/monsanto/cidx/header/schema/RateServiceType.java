
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RateBasisType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateServiceType", propOrder = {
    "rateBasisType"
})
public class RateServiceType {

    @XmlElement(name = "RateBasisType", required = true)
    protected RateBasisTypeType rateBasisType;

    /**
     * Gets the value of the rateBasisType property.
     * 
     * @return
     *     possible object is
     *     {@link RateBasisTypeType }
     *     
     */
    public RateBasisTypeType getRateBasisType() {
        return rateBasisType;
    }

    /**
     * Sets the value of the rateBasisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateBasisTypeType }
     *     
     */
    public void setRateBasisType(RateBasisTypeType value) {
        this.rateBasisType = value;
    }

}

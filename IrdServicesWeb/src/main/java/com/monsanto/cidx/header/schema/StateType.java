
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for StateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}StateOrProvince"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Counties" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateType", propOrder = {
    "stateOrProvince",
    "counties"
})
public class StateType {

    @XmlElement(name = "StateOrProvince", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stateOrProvince;
    @XmlElement(name = "Counties")
    protected CountiesType counties;

    /**
     * Gets the value of the stateOrProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * Sets the value of the stateOrProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrProvince(String value) {
        this.stateOrProvince = value;
    }

    /**
     * Gets the value of the counties property.
     * 
     * @return
     *     possible object is
     *     {@link CountiesType }
     *     
     */
    public CountiesType getCounties() {
        return counties;
    }

    /**
     * Sets the value of the counties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountiesType }
     *     
     */
    public void setCounties(CountiesType value) {
        this.counties = value;
    }

}

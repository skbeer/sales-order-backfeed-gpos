
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ZoneGeographyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneGeographyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostalCountry"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}States" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PostalCodes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneGeographyType", propOrder = {
    "postalCountry",
    "states",
    "postalCodes"
})
public class ZoneGeographyType {

    @XmlElement(name = "PostalCountry", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String postalCountry;
    @XmlElement(name = "States")
    protected StatesType states;
    @XmlElement(name = "PostalCodes")
    protected PostalCodesType postalCodes;

    /**
     * Gets the value of the postalCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCountry() {
        return postalCountry;
    }

    /**
     * Sets the value of the postalCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCountry(String value) {
        this.postalCountry = value;
    }

    /**
     * Gets the value of the states property.
     * 
     * @return
     *     possible object is
     *     {@link StatesType }
     *     
     */
    public StatesType getStates() {
        return states;
    }

    /**
     * Sets the value of the states property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatesType }
     *     
     */
    public void setStates(StatesType value) {
        this.states = value;
    }

    /**
     * Gets the value of the postalCodes property.
     * 
     * @return
     *     possible object is
     *     {@link PostalCodesType }
     *     
     */
    public PostalCodesType getPostalCodes() {
        return postalCodes;
    }

    /**
     * Sets the value of the postalCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalCodesType }
     *     
     */
    public void setPostalCodes(PostalCodesType value) {
        this.postalCodes = value;
    }

}

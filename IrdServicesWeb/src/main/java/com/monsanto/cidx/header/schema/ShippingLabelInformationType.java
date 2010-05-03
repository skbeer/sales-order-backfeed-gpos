
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ShippingLabelInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingLabelInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShippingLabelNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BarCodeDataIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingLabelInformationType", propOrder = {
    "shippingLabelNumber",
    "barCodeDataIdentifier"
})
public class ShippingLabelInformationType {

    @XmlElement(name = "ShippingLabelNumber")
    protected ShippingLabelNumberType shippingLabelNumber;
    @XmlElement(name = "BarCodeDataIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String barCodeDataIdentifier;

    /**
     * Gets the value of the shippingLabelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingLabelNumberType }
     *     
     */
    public ShippingLabelNumberType getShippingLabelNumber() {
        return shippingLabelNumber;
    }

    /**
     * Sets the value of the shippingLabelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingLabelNumberType }
     *     
     */
    public void setShippingLabelNumber(ShippingLabelNumberType value) {
        this.shippingLabelNumber = value;
    }

    /**
     * Gets the value of the barCodeDataIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCodeDataIdentifier() {
        return barCodeDataIdentifier;
    }

    /**
     * Sets the value of the barCodeDataIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCodeDataIdentifier(String value) {
        this.barCodeDataIdentifier = value;
    }

}

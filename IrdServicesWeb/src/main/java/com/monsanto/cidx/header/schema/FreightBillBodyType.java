
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightBillBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightBillBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}FreightBillProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}FreightBillPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}FreightBillDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightBillBodyType", propOrder = {
    "freightBillProperties",
    "freightBillPartners",
    "freightBillDetails"
})
public class FreightBillBodyType {

    @XmlElement(name = "FreightBillProperties", required = true)
    protected FreightBillPropertiesType freightBillProperties;
    @XmlElement(name = "FreightBillPartners", required = true)
    protected FreightBillPartnersType freightBillPartners;
    @XmlElement(name = "FreightBillDetails", required = true)
    protected FreightBillDetailsType freightBillDetails;

    /**
     * Gets the value of the freightBillProperties property.
     * 
     * @return
     *     possible object is
     *     {@link FreightBillPropertiesType }
     *     
     */
    public FreightBillPropertiesType getFreightBillProperties() {
        return freightBillProperties;
    }

    /**
     * Sets the value of the freightBillProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightBillPropertiesType }
     *     
     */
    public void setFreightBillProperties(FreightBillPropertiesType value) {
        this.freightBillProperties = value;
    }

    /**
     * Gets the value of the freightBillPartners property.
     * 
     * @return
     *     possible object is
     *     {@link FreightBillPartnersType }
     *     
     */
    public FreightBillPartnersType getFreightBillPartners() {
        return freightBillPartners;
    }

    /**
     * Sets the value of the freightBillPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightBillPartnersType }
     *     
     */
    public void setFreightBillPartners(FreightBillPartnersType value) {
        this.freightBillPartners = value;
    }

    /**
     * Gets the value of the freightBillDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FreightBillDetailsType }
     *     
     */
    public FreightBillDetailsType getFreightBillDetails() {
        return freightBillDetails;
    }

    /**
     * Sets the value of the freightBillDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightBillDetailsType }
     *     
     */
    public void setFreightBillDetails(FreightBillDetailsType value) {
        this.freightBillDetails = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceSheetBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceSheetBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceSheetProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceSheetPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceSheetDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceSheetBodyType", propOrder = {
    "priceSheetProperties",
    "priceSheetPartners",
    "priceSheetDetails"
})
public class PriceSheetBodyType {

    @XmlElement(name = "PriceSheetProperties", required = true)
    protected PriceSheetPropertiesType priceSheetProperties;
    @XmlElement(name = "PriceSheetPartners", required = true)
    protected PriceSheetPartnersType priceSheetPartners;
    @XmlElement(name = "PriceSheetDetails", required = true)
    protected PriceSheetDetailsType priceSheetDetails;

    /**
     * Gets the value of the priceSheetProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSheetPropertiesType }
     *     
     */
    public PriceSheetPropertiesType getPriceSheetProperties() {
        return priceSheetProperties;
    }

    /**
     * Sets the value of the priceSheetProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSheetPropertiesType }
     *     
     */
    public void setPriceSheetProperties(PriceSheetPropertiesType value) {
        this.priceSheetProperties = value;
    }

    /**
     * Gets the value of the priceSheetPartners property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSheetPartnersType }
     *     
     */
    public PriceSheetPartnersType getPriceSheetPartners() {
        return priceSheetPartners;
    }

    /**
     * Sets the value of the priceSheetPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSheetPartnersType }
     *     
     */
    public void setPriceSheetPartners(PriceSheetPartnersType value) {
        this.priceSheetPartners = value;
    }

    /**
     * Gets the value of the priceSheetDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSheetDetailsType }
     *     
     */
    public PriceSheetDetailsType getPriceSheetDetails() {
        return priceSheetDetails;
    }

    /**
     * Sets the value of the priceSheetDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSheetDetailsType }
     *     
     */
    public void setPriceSheetDetails(PriceSheetDetailsType value) {
        this.priceSheetDetails = value;
    }

}

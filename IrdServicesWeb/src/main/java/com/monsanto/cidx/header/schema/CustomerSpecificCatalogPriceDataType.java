
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CustomerSpecificCatalogPriceDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSpecificCatalogPriceDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CustomerCatalogPrice"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceEffectiveDate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceModifierDown" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceModifierUp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSpecificCatalogPriceDataType", propOrder = {
    "customerCatalogPrice",
    "priceEffectiveDate",
    "priceModifierDown",
    "priceModifierUp"
})
public class CustomerSpecificCatalogPriceDataType {

    @XmlElement(name = "CustomerCatalogPrice", required = true)
    protected CustomerCatalogPriceType customerCatalogPrice;
    @XmlElement(name = "PriceEffectiveDate", required = true)
    protected PriceEffectiveDateType priceEffectiveDate;
    @XmlElement(name = "PriceModifierDown")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String priceModifierDown;
    @XmlElement(name = "PriceModifierUp")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String priceModifierUp;

    /**
     * Gets the value of the customerCatalogPrice property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCatalogPriceType }
     *     
     */
    public CustomerCatalogPriceType getCustomerCatalogPrice() {
        return customerCatalogPrice;
    }

    /**
     * Sets the value of the customerCatalogPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCatalogPriceType }
     *     
     */
    public void setCustomerCatalogPrice(CustomerCatalogPriceType value) {
        this.customerCatalogPrice = value;
    }

    /**
     * Gets the value of the priceEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link PriceEffectiveDateType }
     *     
     */
    public PriceEffectiveDateType getPriceEffectiveDate() {
        return priceEffectiveDate;
    }

    /**
     * Sets the value of the priceEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceEffectiveDateType }
     *     
     */
    public void setPriceEffectiveDate(PriceEffectiveDateType value) {
        this.priceEffectiveDate = value;
    }

    /**
     * Gets the value of the priceModifierDown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceModifierDown() {
        return priceModifierDown;
    }

    /**
     * Sets the value of the priceModifierDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceModifierDown(String value) {
        this.priceModifierDown = value;
    }

    /**
     * Gets the value of the priceModifierUp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceModifierUp() {
        return priceModifierUp;
    }

    /**
     * Sets the value of the priceModifierUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceModifierUp(String value) {
        this.priceModifierUp = value;
    }

}

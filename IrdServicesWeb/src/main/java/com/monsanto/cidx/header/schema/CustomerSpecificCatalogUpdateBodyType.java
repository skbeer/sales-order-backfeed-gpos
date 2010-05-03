
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerSpecificCatalogUpdateBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSpecificCatalogUpdateBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CustomerSpecificCatalogUpdateProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CustomerSpecificCatalogUpdatePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CustomerSpecificCatalogUpdateDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSpecificCatalogUpdateBodyType", propOrder = {
    "customerSpecificCatalogUpdateProperties",
    "customerSpecificCatalogUpdatePartners",
    "customerSpecificCatalogUpdateDetails"
})
public class CustomerSpecificCatalogUpdateBodyType {

    @XmlElement(name = "CustomerSpecificCatalogUpdateProperties", required = true)
    protected CustomerSpecificCatalogUpdatePropertiesType customerSpecificCatalogUpdateProperties;
    @XmlElement(name = "CustomerSpecificCatalogUpdatePartners", required = true)
    protected CustomerSpecificCatalogUpdatePartnersType customerSpecificCatalogUpdatePartners;
    @XmlElement(name = "CustomerSpecificCatalogUpdateDetails", required = true)
    protected CustomerSpecificCatalogUpdateDetailsType customerSpecificCatalogUpdateDetails;

    /**
     * Gets the value of the customerSpecificCatalogUpdateProperties property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSpecificCatalogUpdatePropertiesType }
     *     
     */
    public CustomerSpecificCatalogUpdatePropertiesType getCustomerSpecificCatalogUpdateProperties() {
        return customerSpecificCatalogUpdateProperties;
    }

    /**
     * Sets the value of the customerSpecificCatalogUpdateProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSpecificCatalogUpdatePropertiesType }
     *     
     */
    public void setCustomerSpecificCatalogUpdateProperties(CustomerSpecificCatalogUpdatePropertiesType value) {
        this.customerSpecificCatalogUpdateProperties = value;
    }

    /**
     * Gets the value of the customerSpecificCatalogUpdatePartners property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSpecificCatalogUpdatePartnersType }
     *     
     */
    public CustomerSpecificCatalogUpdatePartnersType getCustomerSpecificCatalogUpdatePartners() {
        return customerSpecificCatalogUpdatePartners;
    }

    /**
     * Sets the value of the customerSpecificCatalogUpdatePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSpecificCatalogUpdatePartnersType }
     *     
     */
    public void setCustomerSpecificCatalogUpdatePartners(CustomerSpecificCatalogUpdatePartnersType value) {
        this.customerSpecificCatalogUpdatePartners = value;
    }

    /**
     * Gets the value of the customerSpecificCatalogUpdateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSpecificCatalogUpdateDetailsType }
     *     
     */
    public CustomerSpecificCatalogUpdateDetailsType getCustomerSpecificCatalogUpdateDetails() {
        return customerSpecificCatalogUpdateDetails;
    }

    /**
     * Sets the value of the customerSpecificCatalogUpdateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSpecificCatalogUpdateDetailsType }
     *     
     */
    public void setCustomerSpecificCatalogUpdateDetails(CustomerSpecificCatalogUpdateDetailsType value) {
        this.customerSpecificCatalogUpdateDetails = value;
    }

}

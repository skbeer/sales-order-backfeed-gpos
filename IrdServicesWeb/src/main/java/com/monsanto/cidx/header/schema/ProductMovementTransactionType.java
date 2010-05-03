
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductMovementTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductMovementTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductMovementTransactionProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductMovementTransactionPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductMovementTransactionDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductMovementTransactionType", propOrder = {
    "productMovementTransactionProperties",
    "productMovementTransactionPartners",
    "productMovementTransactionDetails"
})
public class ProductMovementTransactionType {

    @XmlElement(name = "ProductMovementTransactionProperties", required = true)
    protected ProductMovementTransactionPropertiesType productMovementTransactionProperties;
    @XmlElement(name = "ProductMovementTransactionPartners", required = true)
    protected ProductMovementTransactionPartnersType productMovementTransactionPartners;
    @XmlElement(name = "ProductMovementTransactionDetails", required = true)
    protected ProductMovementTransactionDetailsType productMovementTransactionDetails;

    /**
     * Gets the value of the productMovementTransactionProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ProductMovementTransactionPropertiesType }
     *     
     */
    public ProductMovementTransactionPropertiesType getProductMovementTransactionProperties() {
        return productMovementTransactionProperties;
    }

    /**
     * Sets the value of the productMovementTransactionProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductMovementTransactionPropertiesType }
     *     
     */
    public void setProductMovementTransactionProperties(ProductMovementTransactionPropertiesType value) {
        this.productMovementTransactionProperties = value;
    }

    /**
     * Gets the value of the productMovementTransactionPartners property.
     * 
     * @return
     *     possible object is
     *     {@link ProductMovementTransactionPartnersType }
     *     
     */
    public ProductMovementTransactionPartnersType getProductMovementTransactionPartners() {
        return productMovementTransactionPartners;
    }

    /**
     * Sets the value of the productMovementTransactionPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductMovementTransactionPartnersType }
     *     
     */
    public void setProductMovementTransactionPartners(ProductMovementTransactionPartnersType value) {
        this.productMovementTransactionPartners = value;
    }

    /**
     * Gets the value of the productMovementTransactionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductMovementTransactionDetailsType }
     *     
     */
    public ProductMovementTransactionDetailsType getProductMovementTransactionDetails() {
        return productMovementTransactionDetails;
    }

    /**
     * Sets the value of the productMovementTransactionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductMovementTransactionDetailsType }
     *     
     */
    public void setProductMovementTransactionDetails(ProductMovementTransactionDetailsType value) {
        this.productMovementTransactionDetails = value;
    }

}

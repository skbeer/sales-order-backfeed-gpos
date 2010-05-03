
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceSheetPartnersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceSheetPartnersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Seller"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Buyer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceSheetPartnersType", propOrder = {
    "seller",
    "buyer"
})
public class PriceSheetPartnersType {

    @XmlElement(name = "Seller", required = true)
    protected SellerType seller;
    @XmlElement(name = "Buyer")
    protected BuyerType buyer;

    /**
     * Gets the value of the seller property.
     * 
     * @return
     *     possible object is
     *     {@link SellerType }
     *     
     */
    public SellerType getSeller() {
        return seller;
    }

    /**
     * Sets the value of the seller property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerType }
     *     
     */
    public void setSeller(SellerType value) {
        this.seller = value;
    }

    /**
     * Gets the value of the buyer property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerType }
     *     
     */
    public BuyerType getBuyer() {
        return buyer;
    }

    /**
     * Sets the value of the buyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerType }
     *     
     */
    public void setBuyer(BuyerType value) {
        this.buyer = value;
    }

}

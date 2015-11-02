
package com.monsanto.irdsoapservices.agreementstatuspartners.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgreementStatusResponsePartnersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementStatusResponsePartnersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Buyer" type="{urn:cidx:names:specification:ces:schema:all:5:3}BuyerType"/>
 *         &lt;element name="Seller" type="{urn:cidx:names:specification:ces:schema:all:5:3}SellerType"/>
 *         &lt;element name="ShipTo" type="{urn:cidx:names:specification:ces:schema:all:5:3}ShipToType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementStatusResponsePartnersType", propOrder = {
    "buyer",
    "seller",
    "shipTo"
})
public class AgreementStatusResponsePartnersType {

    @XmlElement(name = "Buyer", required = true)
    protected BuyerType buyer;
    @XmlElement(name = "Seller", required = true)
    protected SellerType seller;
    @XmlElement(name = "ShipTo", required = true)
    protected ShipToType shipTo;

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
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link ShipToType }
     *     
     */
    public ShipToType getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipToType }
     *     
     */
    public void setShipTo(ShipToType value) {
        this.shipTo = value;
    }

}

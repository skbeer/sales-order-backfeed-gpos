
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplenishmentSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplenishmentSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReceiptQuantity"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipDate"/>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryDateTime"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplenishmentSummaryType", propOrder = {
    "receiptQuantity",
    "shipDate",
    "deliveryDateTime"
})
public class ReplenishmentSummaryType {

    @XmlElement(name = "ReceiptQuantity", required = true)
    protected ReceiptQuantityType receiptQuantity;
    @XmlElement(name = "ShipDate")
    protected ShipDateType shipDate;
    @XmlElement(name = "DeliveryDateTime")
    protected DeliveryDateTimeType deliveryDateTime;

    /**
     * Gets the value of the receiptQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptQuantityType }
     *     
     */
    public ReceiptQuantityType getReceiptQuantity() {
        return receiptQuantity;
    }

    /**
     * Sets the value of the receiptQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptQuantityType }
     *     
     */
    public void setReceiptQuantity(ReceiptQuantityType value) {
        this.receiptQuantity = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link ShipDateType }
     *     
     */
    public ShipDateType getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipDateType }
     *     
     */
    public void setShipDate(ShipDateType value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the deliveryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDateTimeType }
     *     
     */
    public DeliveryDateTimeType getDeliveryDateTime() {
        return deliveryDateTime;
    }

    /**
     * Sets the value of the deliveryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDateTimeType }
     *     
     */
    public void setDeliveryDateTime(DeliveryDateTimeType value) {
        this.deliveryDateTime = value;
    }

}

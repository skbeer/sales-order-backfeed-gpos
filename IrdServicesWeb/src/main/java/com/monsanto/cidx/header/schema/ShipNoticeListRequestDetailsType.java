
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipNoticeListRequestDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipNoticeListRequestDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentIdentification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipNoticeListRequestDetailsType", propOrder = {
    "shipmentIdentification",
    "shipmentDate"
})
public class ShipNoticeListRequestDetailsType {

    @XmlElement(name = "ShipmentIdentification")
    protected List<ShipmentIdentificationType> shipmentIdentification;
    @XmlElement(name = "ShipmentDate")
    protected ShipmentDateType shipmentDate;

    /**
     * Gets the value of the shipmentIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentIdentificationType }
     * 
     * 
     */
    public List<ShipmentIdentificationType> getShipmentIdentification() {
        if (shipmentIdentification == null) {
            shipmentIdentification = new ArrayList<ShipmentIdentificationType>();
        }
        return this.shipmentIdentification;
    }

    /**
     * Gets the value of the shipmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDateType }
     *     
     */
    public ShipmentDateType getShipmentDate() {
        return shipmentDate;
    }

    /**
     * Sets the value of the shipmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDateType }
     *     
     */
    public void setShipmentDate(ShipmentDateType value) {
        this.shipmentDate = value;
    }

}

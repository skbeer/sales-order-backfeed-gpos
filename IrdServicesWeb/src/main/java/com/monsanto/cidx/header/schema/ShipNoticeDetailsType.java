
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipNoticeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipNoticeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EquipmentDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipNoticeProductLineItem" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentPackaging" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipNoticeDetailsType", propOrder = {
    "equipmentDetails",
    "shipNoticeProductLineItem",
    "shipmentPackaging"
})
public class ShipNoticeDetailsType {

    @XmlElement(name = "EquipmentDetails")
    protected List<EquipmentDetailsType> equipmentDetails;
    @XmlElement(name = "ShipNoticeProductLineItem", required = true)
    protected List<ShipNoticeProductLineItemType> shipNoticeProductLineItem;
    @XmlElement(name = "ShipmentPackaging")
    protected List<ShipmentPackagingType> shipmentPackaging;

    /**
     * Gets the value of the equipmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentDetailsType }
     * 
     * 
     */
    public List<EquipmentDetailsType> getEquipmentDetails() {
        if (equipmentDetails == null) {
            equipmentDetails = new ArrayList<EquipmentDetailsType>();
        }
        return this.equipmentDetails;
    }

    /**
     * Gets the value of the shipNoticeProductLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipNoticeProductLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipNoticeProductLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipNoticeProductLineItemType }
     * 
     * 
     */
    public List<ShipNoticeProductLineItemType> getShipNoticeProductLineItem() {
        if (shipNoticeProductLineItem == null) {
            shipNoticeProductLineItem = new ArrayList<ShipNoticeProductLineItemType>();
        }
        return this.shipNoticeProductLineItem;
    }

    /**
     * Gets the value of the shipmentPackaging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentPackaging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentPackaging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentPackagingType }
     * 
     * 
     */
    public List<ShipmentPackagingType> getShipmentPackaging() {
        if (shipmentPackaging == null) {
            shipmentPackaging = new ArrayList<ShipmentPackagingType>();
        }
        return this.shipmentPackaging;
    }

}

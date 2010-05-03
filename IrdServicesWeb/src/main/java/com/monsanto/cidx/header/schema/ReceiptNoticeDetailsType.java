
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiptNoticeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiptNoticeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EquipmentDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReceiptNoticeProductLineItem" maxOccurs="unbounded"/>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentPackaging"/>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReceiptCondition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiptNoticeDetailsType", propOrder = {
    "equipmentDetails",
    "receiptNoticeProductLineItem",
    "shipmentPackagingAndReceiptCondition"
})
public class ReceiptNoticeDetailsType {

    @XmlElement(name = "EquipmentDetails")
    protected List<EquipmentDetailsType> equipmentDetails;
    @XmlElement(name = "ReceiptNoticeProductLineItem", required = true)
    protected List<ReceiptNoticeProductLineItemType> receiptNoticeProductLineItem;
    @XmlElementRefs({
        @XmlElementRef(name = "ReceiptCondition", namespace = "urn:cidx:names:specification:ces:schema:all:5:0", type = JAXBElement.class),
        @XmlElementRef(name = "ShipmentPackaging", namespace = "urn:cidx:names:specification:ces:schema:all:5:0", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> shipmentPackagingAndReceiptCondition;

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
     * Gets the value of the receiptNoticeProductLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiptNoticeProductLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiptNoticeProductLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiptNoticeProductLineItemType }
     * 
     * 
     */
    public List<ReceiptNoticeProductLineItemType> getReceiptNoticeProductLineItem() {
        if (receiptNoticeProductLineItem == null) {
            receiptNoticeProductLineItem = new ArrayList<ReceiptNoticeProductLineItemType>();
        }
        return this.receiptNoticeProductLineItem;
    }

    /**
     * Gets the value of the shipmentPackagingAndReceiptCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentPackagingAndReceiptCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentPackagingAndReceiptCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ShipmentPackagingType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getShipmentPackagingAndReceiptCondition() {
        if (shipmentPackagingAndReceiptCondition == null) {
            shipmentPackagingAndReceiptCondition = new ArrayList<JAXBElement<?>>();
        }
        return this.shipmentPackagingAndReceiptCondition;
    }

}

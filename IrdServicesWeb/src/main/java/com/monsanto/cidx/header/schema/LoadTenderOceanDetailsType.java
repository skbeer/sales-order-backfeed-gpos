
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadTenderOceanDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadTenderOceanDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EquipmentDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadTenderOceanProductLineItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadTenderOceanDetailsType", propOrder = {
    "equipmentDetails",
    "loadTenderOceanProductLineItem"
})
public class LoadTenderOceanDetailsType {

    @XmlElement(name = "EquipmentDetails")
    protected List<EquipmentDetailsType> equipmentDetails;
    @XmlElement(name = "LoadTenderOceanProductLineItem", required = true)
    protected List<LoadTenderOceanProductLineItemType> loadTenderOceanProductLineItem;

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
     * Gets the value of the loadTenderOceanProductLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loadTenderOceanProductLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoadTenderOceanProductLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoadTenderOceanProductLineItemType }
     * 
     * 
     */
    public List<LoadTenderOceanProductLineItemType> getLoadTenderOceanProductLineItem() {
        if (loadTenderOceanProductLineItem == null) {
            loadTenderOceanProductLineItem = new ArrayList<LoadTenderOceanProductLineItemType>();
        }
        return this.loadTenderOceanProductLineItem;
    }

}

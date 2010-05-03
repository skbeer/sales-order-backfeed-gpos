
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryActualUsageResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryActualUsageResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryActualUsageResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryActualUsageResponsePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryActualUsageResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryActualUsageResponseBodyType", propOrder = {
    "inventoryActualUsageResponseProperties",
    "inventoryActualUsageResponsePartners",
    "inventoryActualUsageResponseDetails"
})
public class InventoryActualUsageResponseBodyType {

    @XmlElement(name = "InventoryActualUsageResponseProperties", required = true)
    protected InventoryActualUsageResponsePropertiesType inventoryActualUsageResponseProperties;
    @XmlElement(name = "InventoryActualUsageResponsePartners", required = true)
    protected InventoryActualUsageResponsePartnersType inventoryActualUsageResponsePartners;
    @XmlElement(name = "InventoryActualUsageResponseDetails", required = true)
    protected InventoryActualUsageResponseDetailsType inventoryActualUsageResponseDetails;

    /**
     * Gets the value of the inventoryActualUsageResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryActualUsageResponsePropertiesType }
     *     
     */
    public InventoryActualUsageResponsePropertiesType getInventoryActualUsageResponseProperties() {
        return inventoryActualUsageResponseProperties;
    }

    /**
     * Sets the value of the inventoryActualUsageResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryActualUsageResponsePropertiesType }
     *     
     */
    public void setInventoryActualUsageResponseProperties(InventoryActualUsageResponsePropertiesType value) {
        this.inventoryActualUsageResponseProperties = value;
    }

    /**
     * Gets the value of the inventoryActualUsageResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryActualUsageResponsePartnersType }
     *     
     */
    public InventoryActualUsageResponsePartnersType getInventoryActualUsageResponsePartners() {
        return inventoryActualUsageResponsePartners;
    }

    /**
     * Sets the value of the inventoryActualUsageResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryActualUsageResponsePartnersType }
     *     
     */
    public void setInventoryActualUsageResponsePartners(InventoryActualUsageResponsePartnersType value) {
        this.inventoryActualUsageResponsePartners = value;
    }

    /**
     * Gets the value of the inventoryActualUsageResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryActualUsageResponseDetailsType }
     *     
     */
    public InventoryActualUsageResponseDetailsType getInventoryActualUsageResponseDetails() {
        return inventoryActualUsageResponseDetails;
    }

    /**
     * Sets the value of the inventoryActualUsageResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryActualUsageResponseDetailsType }
     *     
     */
    public void setInventoryActualUsageResponseDetails(InventoryActualUsageResponseDetailsType value) {
        this.inventoryActualUsageResponseDetails = value;
    }

}

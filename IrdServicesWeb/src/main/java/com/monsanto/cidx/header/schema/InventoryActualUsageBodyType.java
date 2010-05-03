
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryActualUsageBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryActualUsageBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryActualUsageProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryActualUsagePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryActualUsageDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryActualUsageBodyType", propOrder = {
    "inventoryActualUsageProperties",
    "inventoryActualUsagePartners",
    "inventoryActualUsageDetails"
})
public class InventoryActualUsageBodyType {

    @XmlElement(name = "InventoryActualUsageProperties", required = true)
    protected InventoryActualUsagePropertiesType inventoryActualUsageProperties;
    @XmlElement(name = "InventoryActualUsagePartners", required = true)
    protected InventoryActualUsagePartnersType inventoryActualUsagePartners;
    @XmlElement(name = "InventoryActualUsageDetails", required = true)
    protected InventoryActualUsageDetailsType inventoryActualUsageDetails;

    /**
     * Gets the value of the inventoryActualUsageProperties property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryActualUsagePropertiesType }
     *     
     */
    public InventoryActualUsagePropertiesType getInventoryActualUsageProperties() {
        return inventoryActualUsageProperties;
    }

    /**
     * Sets the value of the inventoryActualUsageProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryActualUsagePropertiesType }
     *     
     */
    public void setInventoryActualUsageProperties(InventoryActualUsagePropertiesType value) {
        this.inventoryActualUsageProperties = value;
    }

    /**
     * Gets the value of the inventoryActualUsagePartners property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryActualUsagePartnersType }
     *     
     */
    public InventoryActualUsagePartnersType getInventoryActualUsagePartners() {
        return inventoryActualUsagePartners;
    }

    /**
     * Sets the value of the inventoryActualUsagePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryActualUsagePartnersType }
     *     
     */
    public void setInventoryActualUsagePartners(InventoryActualUsagePartnersType value) {
        this.inventoryActualUsagePartners = value;
    }

    /**
     * Gets the value of the inventoryActualUsageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryActualUsageDetailsType }
     *     
     */
    public InventoryActualUsageDetailsType getInventoryActualUsageDetails() {
        return inventoryActualUsageDetails;
    }

    /**
     * Sets the value of the inventoryActualUsageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryActualUsageDetailsType }
     *     
     */
    public void setInventoryActualUsageDetails(InventoryActualUsageDetailsType value) {
        this.inventoryActualUsageDetails = value;
    }

}

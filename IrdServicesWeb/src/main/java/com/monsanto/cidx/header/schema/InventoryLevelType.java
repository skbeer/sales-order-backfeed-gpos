
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryLevelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryLevelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryOnSite"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryInTransit" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryLevelType", propOrder = {
    "inventoryOnSite",
    "inventoryInTransit",
    "dateTime"
})
public class InventoryLevelType {

    @XmlElement(name = "InventoryOnSite", required = true)
    protected InventoryOnSiteType inventoryOnSite;
    @XmlElement(name = "InventoryInTransit")
    protected InventoryInTransitType inventoryInTransit;
    @XmlElement(name = "DateTime", required = true)
    protected DateTimeType dateTime;

    /**
     * Gets the value of the inventoryOnSite property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryOnSiteType }
     *     
     */
    public InventoryOnSiteType getInventoryOnSite() {
        return inventoryOnSite;
    }

    /**
     * Sets the value of the inventoryOnSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryOnSiteType }
     *     
     */
    public void setInventoryOnSite(InventoryOnSiteType value) {
        this.inventoryOnSite = value;
    }

    /**
     * Gets the value of the inventoryInTransit property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryInTransitType }
     *     
     */
    public InventoryInTransitType getInventoryInTransit() {
        return inventoryInTransit;
    }

    /**
     * Sets the value of the inventoryInTransit property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryInTransitType }
     *     
     */
    public void setInventoryInTransit(InventoryInTransitType value) {
        this.inventoryInTransit = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setDateTime(DateTimeType value) {
        this.dateTime = value;
    }

}

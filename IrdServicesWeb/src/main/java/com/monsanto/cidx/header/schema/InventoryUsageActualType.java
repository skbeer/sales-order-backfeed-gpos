
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryUsageActualType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryUsageActualType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryUsage"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DateTimeRange"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryUsageActualType", propOrder = {
    "inventoryUsage",
    "dateTimeRange"
})
public class InventoryUsageActualType {

    @XmlElement(name = "InventoryUsage", required = true)
    protected InventoryUsageType inventoryUsage;
    @XmlElement(name = "DateTimeRange", required = true)
    protected DateTimeRangeType dateTimeRange;

    /**
     * Gets the value of the inventoryUsage property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryUsageType }
     *     
     */
    public InventoryUsageType getInventoryUsage() {
        return inventoryUsage;
    }

    /**
     * Sets the value of the inventoryUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryUsageType }
     *     
     */
    public void setInventoryUsage(InventoryUsageType value) {
        this.inventoryUsage = value;
    }

    /**
     * Gets the value of the dateTimeRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeRangeType }
     *     
     */
    public DateTimeRangeType getDateTimeRange() {
        return dateTimeRange;
    }

    /**
     * Sets the value of the dateTimeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeRangeType }
     *     
     */
    public void setDateTimeRange(DateTimeRangeType value) {
        this.dateTimeRange = value;
    }

}

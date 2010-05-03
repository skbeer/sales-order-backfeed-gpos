
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryUsageLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryUsageLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryUsageLocation"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryUsageInformation" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryUsageLineItemType", propOrder = {
    "lineNumber",
    "inventoryUsageLocation",
    "inventoryUsageInformation"
})
public class InventoryUsageLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "InventoryUsageLocation", required = true)
    protected InventoryUsageLocationType inventoryUsageLocation;
    @XmlElement(name = "InventoryUsageInformation", required = true)
    protected List<InventoryUsageInformationType> inventoryUsageInformation;

    /**
     * Gets the value of the lineNumber property.
     * 
     */
    public long getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     */
    public void setLineNumber(long value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the inventoryUsageLocation property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryUsageLocationType }
     *     
     */
    public InventoryUsageLocationType getInventoryUsageLocation() {
        return inventoryUsageLocation;
    }

    /**
     * Sets the value of the inventoryUsageLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryUsageLocationType }
     *     
     */
    public void setInventoryUsageLocation(InventoryUsageLocationType value) {
        this.inventoryUsageLocation = value;
    }

    /**
     * Gets the value of the inventoryUsageInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryUsageInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryUsageInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryUsageInformationType }
     * 
     * 
     */
    public List<InventoryUsageInformationType> getInventoryUsageInformation() {
        if (inventoryUsageInformation == null) {
            inventoryUsageInformation = new ArrayList<InventoryUsageInformationType>();
        }
        return this.inventoryUsageInformation;
    }

}

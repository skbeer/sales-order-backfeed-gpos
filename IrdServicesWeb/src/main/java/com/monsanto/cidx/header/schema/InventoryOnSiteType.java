
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryOnSiteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryOnSiteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryInTank"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryOther"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryOnSiteType", propOrder = {
    "inventoryInTankOrInventoryOther"
})
public class InventoryOnSiteType {

    @XmlElements({
        @XmlElement(name = "InventoryInTank", type = InventoryInTankType.class),
        @XmlElement(name = "InventoryOther", type = InventoryOtherType.class)
    })
    protected List<Object> inventoryInTankOrInventoryOther;

    /**
     * Gets the value of the inventoryInTankOrInventoryOther property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryInTankOrInventoryOther property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryInTankOrInventoryOther().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryInTankType }
     * {@link InventoryOtherType }
     * 
     * 
     */
    public List<Object> getInventoryInTankOrInventoryOther() {
        if (inventoryInTankOrInventoryOther == null) {
            inventoryInTankOrInventoryOther = new ArrayList<Object>();
        }
        return this.inventoryInTankOrInventoryOther;
    }

}

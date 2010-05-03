
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InventoryUsageInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryUsageInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryProduct"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}StorageTankIdentifier" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryLevel"/>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryUsageActual"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryUsageInformationType", propOrder = {
    "lineNumber",
    "inventoryProduct",
    "storageTankIdentifier",
    "inventoryLevelOrInventoryUsageActual"
})
public class InventoryUsageInformationType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "InventoryProduct", required = true)
    protected InventoryProductType inventoryProduct;
    @XmlElement(name = "StorageTankIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String storageTankIdentifier;
    @XmlElements({
        @XmlElement(name = "InventoryLevel", type = InventoryLevelType.class),
        @XmlElement(name = "InventoryUsageActual", type = InventoryUsageActualType.class)
    })
    protected List<Object> inventoryLevelOrInventoryUsageActual;

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
     * Gets the value of the inventoryProduct property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryProductType }
     *     
     */
    public InventoryProductType getInventoryProduct() {
        return inventoryProduct;
    }

    /**
     * Sets the value of the inventoryProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryProductType }
     *     
     */
    public void setInventoryProduct(InventoryProductType value) {
        this.inventoryProduct = value;
    }

    /**
     * Gets the value of the storageTankIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageTankIdentifier() {
        return storageTankIdentifier;
    }

    /**
     * Sets the value of the storageTankIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageTankIdentifier(String value) {
        this.storageTankIdentifier = value;
    }

    /**
     * Gets the value of the inventoryLevelOrInventoryUsageActual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryLevelOrInventoryUsageActual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryLevelOrInventoryUsageActual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryLevelType }
     * {@link InventoryUsageActualType }
     * 
     * 
     */
    public List<Object> getInventoryLevelOrInventoryUsageActual() {
        if (inventoryLevelOrInventoryUsageActual == null) {
            inventoryLevelOrInventoryUsageActual = new ArrayList<Object>();
        }
        return this.inventoryLevelOrInventoryUsageActual;
    }

}

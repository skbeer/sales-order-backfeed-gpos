
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InventoryActualUsageResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryActualUsageResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Header"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryActualUsageResponseBody"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxToken" fixed="5.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryActualUsageResponseType", propOrder = {
    "header",
    "inventoryActualUsageResponseBody"
})
public class InventoryActualUsageResponseType {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "InventoryActualUsageResponseBody", required = true)
    protected InventoryActualUsageResponseBodyType inventoryActualUsageResponseBody;
    @XmlAttribute(name = "Version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the inventoryActualUsageResponseBody property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryActualUsageResponseBodyType }
     *     
     */
    public InventoryActualUsageResponseBodyType getInventoryActualUsageResponseBody() {
        return inventoryActualUsageResponseBody;
    }

    /**
     * Sets the value of the inventoryActualUsageResponseBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryActualUsageResponseBodyType }
     *     
     */
    public void setInventoryActualUsageResponseBody(InventoryActualUsageResponseBodyType value) {
        this.inventoryActualUsageResponseBody = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "5.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}

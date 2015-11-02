
package com.monsanto.irdsoapservices.agreementstatuspartners.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ZoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductClassification" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="ProductDescription" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:3}ZoneID"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:3}ZoneType" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:3}ZoneName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneType", propOrder = {
    "productClassification",
    "productDescription",
    "zoneID",
    "zoneType",
    "zoneName"
})
public class ZoneType {

    @XmlElement(name = "ProductClassification", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String productClassification;
    @XmlElement(name = "ProductDescription", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String productDescription;
    @XmlElement(name = "ZoneID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String zoneID;
    @XmlElement(name = "ZoneType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String zoneType;
    @XmlElement(name = "ZoneName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String zoneName;

    /**
     * Gets the value of the productClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductClassification() {
        return productClassification;
    }

    /**
     * Sets the value of the productClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductClassification(String value) {
        this.productClassification = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the zoneID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneID() {
        return zoneID;
    }

    /**
     * Sets the value of the zoneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneID(String value) {
        this.zoneID = value;
    }

    /**
     * Gets the value of the zoneType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneType() {
        return zoneType;
    }

    /**
     * Sets the value of the zoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneType(String value) {
        this.zoneType = value;
    }

    /**
     * Gets the value of the zoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneName() {
        return zoneName;
    }

    /**
     * Sets the value of the zoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneName(String value) {
        this.zoneName = value;
    }

}

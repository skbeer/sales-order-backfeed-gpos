
package com.monsanto.commercial.growercreditlist.gen.creditlist.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ProductCropCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProductCrop">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZoneID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZoneType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZoneName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "productCropCode",
    "productCrop",
    "zoneID",
    "zoneType",
    "zoneName"
})
public class ZoneType {

    @XmlElement(name = "ProductCropCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String productCropCode;
    @XmlElement(name = "ProductCrop", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String productCrop;
    @XmlElement(name = "ZoneID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String zoneID;
    @XmlElement(name = "ZoneType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String zoneType;
    @XmlElement(name = "ZoneName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String zoneName;

    /**
     * Gets the value of the productCropCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCropCode() {
        return productCropCode;
    }

    /**
     * Sets the value of the productCropCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCropCode(String value) {
        this.productCropCode = value;
    }

    /**
     * Gets the value of the productCrop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCrop() {
        return productCrop;
    }

    /**
     * Sets the value of the productCrop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCrop(String value) {
        this.productCrop = value;
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

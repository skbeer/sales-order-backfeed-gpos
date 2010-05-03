
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductIdentification" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingTypeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentPackaging" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryProductType", propOrder = {
    "productIdentification",
    "packagingTypeCode",
    "shipmentPackaging"
})
public class DeliveryProductType {

    @XmlElement(name = "ProductIdentification", required = true)
    protected List<ProductIdentificationType> productIdentification;
    @XmlElement(name = "PackagingTypeCode")
    protected PackagingTypeCodeType packagingTypeCode;
    @XmlElement(name = "ShipmentPackaging")
    protected ShipmentPackagingType shipmentPackaging;

    /**
     * Gets the value of the productIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentificationType }
     * 
     * 
     */
    public List<ProductIdentificationType> getProductIdentification() {
        if (productIdentification == null) {
            productIdentification = new ArrayList<ProductIdentificationType>();
        }
        return this.productIdentification;
    }

    /**
     * Gets the value of the packagingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingTypeCodeType }
     *     
     */
    public PackagingTypeCodeType getPackagingTypeCode() {
        return packagingTypeCode;
    }

    /**
     * Sets the value of the packagingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingTypeCodeType }
     *     
     */
    public void setPackagingTypeCode(PackagingTypeCodeType value) {
        this.packagingTypeCode = value;
    }

    /**
     * Gets the value of the shipmentPackaging property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentPackagingType }
     *     
     */
    public ShipmentPackagingType getShipmentPackaging() {
        return shipmentPackaging;
    }

    /**
     * Sets the value of the shipmentPackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentPackagingType }
     *     
     */
    public void setShipmentPackaging(ShipmentPackagingType value) {
        this.shipmentPackaging = value;
    }

}

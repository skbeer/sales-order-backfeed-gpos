
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ShipmentPackagingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentPackagingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingItems" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingTypeCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingQuantity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingWeight"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingVolume" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingDimensions" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingDisposition" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShippingLabelInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContainerSerialInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingStackability" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentPackaging" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentPackagingType", propOrder = {
    "lineNumber",
    "packagingItems",
    "packagingTypeCode",
    "packagingQuantity",
    "packagingWeight",
    "packagingVolume",
    "packagingDimensions",
    "packagingDisposition",
    "shippingLabelInformation",
    "containerSerialInformation",
    "packagingStackability",
    "shipmentPackaging"
})
public class ShipmentPackagingType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "PackagingItems")
    protected PackagingItemsType packagingItems;
    @XmlElement(name = "PackagingTypeCode", required = true)
    protected PackagingTypeCodeType packagingTypeCode;
    @XmlElement(name = "PackagingQuantity", required = true)
    protected PackagingQuantityType packagingQuantity;
    @XmlElement(name = "PackagingWeight", required = true)
    protected PackagingWeightType packagingWeight;
    @XmlElement(name = "PackagingVolume")
    protected PackagingVolumeType packagingVolume;
    @XmlElement(name = "PackagingDimensions")
    protected PackagingDimensionsType packagingDimensions;
    @XmlElement(name = "PackagingDisposition")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String packagingDisposition;
    @XmlElement(name = "ShippingLabelInformation")
    protected ShippingLabelInformationType shippingLabelInformation;
    @XmlElement(name = "ContainerSerialInformation")
    protected ContainerSerialInformationType containerSerialInformation;
    @XmlElement(name = "PackagingStackability")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String packagingStackability;
    @XmlElement(name = "ShipmentPackaging")
    protected List<ShipmentPackagingType> shipmentPackaging;

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
     * Gets the value of the packagingItems property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingItemsType }
     *     
     */
    public PackagingItemsType getPackagingItems() {
        return packagingItems;
    }

    /**
     * Sets the value of the packagingItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingItemsType }
     *     
     */
    public void setPackagingItems(PackagingItemsType value) {
        this.packagingItems = value;
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
     * Gets the value of the packagingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingQuantityType }
     *     
     */
    public PackagingQuantityType getPackagingQuantity() {
        return packagingQuantity;
    }

    /**
     * Sets the value of the packagingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingQuantityType }
     *     
     */
    public void setPackagingQuantity(PackagingQuantityType value) {
        this.packagingQuantity = value;
    }

    /**
     * Gets the value of the packagingWeight property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingWeightType }
     *     
     */
    public PackagingWeightType getPackagingWeight() {
        return packagingWeight;
    }

    /**
     * Sets the value of the packagingWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingWeightType }
     *     
     */
    public void setPackagingWeight(PackagingWeightType value) {
        this.packagingWeight = value;
    }

    /**
     * Gets the value of the packagingVolume property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingVolumeType }
     *     
     */
    public PackagingVolumeType getPackagingVolume() {
        return packagingVolume;
    }

    /**
     * Sets the value of the packagingVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingVolumeType }
     *     
     */
    public void setPackagingVolume(PackagingVolumeType value) {
        this.packagingVolume = value;
    }

    /**
     * Gets the value of the packagingDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingDimensionsType }
     *     
     */
    public PackagingDimensionsType getPackagingDimensions() {
        return packagingDimensions;
    }

    /**
     * Sets the value of the packagingDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingDimensionsType }
     *     
     */
    public void setPackagingDimensions(PackagingDimensionsType value) {
        this.packagingDimensions = value;
    }

    /**
     * Gets the value of the packagingDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingDisposition() {
        return packagingDisposition;
    }

    /**
     * Sets the value of the packagingDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingDisposition(String value) {
        this.packagingDisposition = value;
    }

    /**
     * Gets the value of the shippingLabelInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingLabelInformationType }
     *     
     */
    public ShippingLabelInformationType getShippingLabelInformation() {
        return shippingLabelInformation;
    }

    /**
     * Sets the value of the shippingLabelInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingLabelInformationType }
     *     
     */
    public void setShippingLabelInformation(ShippingLabelInformationType value) {
        this.shippingLabelInformation = value;
    }

    /**
     * Gets the value of the containerSerialInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerSerialInformationType }
     *     
     */
    public ContainerSerialInformationType getContainerSerialInformation() {
        return containerSerialInformation;
    }

    /**
     * Sets the value of the containerSerialInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerSerialInformationType }
     *     
     */
    public void setContainerSerialInformation(ContainerSerialInformationType value) {
        this.containerSerialInformation = value;
    }

    /**
     * Gets the value of the packagingStackability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingStackability() {
        return packagingStackability;
    }

    /**
     * Sets the value of the packagingStackability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingStackability(String value) {
        this.packagingStackability = value;
    }

    /**
     * Gets the value of the shipmentPackaging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentPackaging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentPackaging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentPackagingType }
     * 
     * 
     */
    public List<ShipmentPackagingType> getShipmentPackaging() {
        if (shipmentPackaging == null) {
            shipmentPackaging = new ArrayList<ShipmentPackagingType>();
        }
        return this.shipmentPackaging;
    }

}


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
 * <p>Java class for PackagingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductIdentification" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingTypeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingWeight" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingDimensions" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingVolume" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShippingLabelInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingStackability" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingLabel" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HandlingUnitReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagingInformationType", propOrder = {
    "productIdentification",
    "packagingQuantity",
    "packagingTypeCode",
    "packagingWeight",
    "packagingDimensions",
    "packagingVolume",
    "shippingLabelInformation",
    "packagingStackability",
    "packagingLabel",
    "specialInstructions",
    "handlingUnitReference",
    "packagingInformation"
})
public class PackagingInformationType {

    @XmlElement(name = "ProductIdentification")
    protected ProductIdentificationType productIdentification;
    @XmlElement(name = "PackagingQuantity")
    protected PackagingQuantityType packagingQuantity;
    @XmlElement(name = "PackagingTypeCode")
    protected PackagingTypeCodeType packagingTypeCode;
    @XmlElement(name = "PackagingWeight")
    protected PackagingWeightType packagingWeight;
    @XmlElement(name = "PackagingDimensions")
    protected PackagingDimensionsType packagingDimensions;
    @XmlElement(name = "PackagingVolume")
    protected PackagingVolumeType packagingVolume;
    @XmlElement(name = "ShippingLabelInformation")
    protected ShippingLabelInformationType shippingLabelInformation;
    @XmlElement(name = "PackagingStackability")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String packagingStackability;
    @XmlElement(name = "PackagingLabel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String packagingLabel;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "HandlingUnitReference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> handlingUnitReference;
    @XmlElement(name = "PackagingInformation")
    protected List<PackagingInformationType> packagingInformation;

    /**
     * Gets the value of the productIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationType }
     *     
     */
    public ProductIdentificationType getProductIdentification() {
        return productIdentification;
    }

    /**
     * Sets the value of the productIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationType }
     *     
     */
    public void setProductIdentification(ProductIdentificationType value) {
        this.productIdentification = value;
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
     * Gets the value of the packagingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingLabel() {
        return packagingLabel;
    }

    /**
     * Sets the value of the packagingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingLabel(String value) {
        this.packagingLabel = value;
    }

    /**
     * Gets the value of the specialInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialInstructionsType }
     * 
     * 
     */
    public List<SpecialInstructionsType> getSpecialInstructions() {
        if (specialInstructions == null) {
            specialInstructions = new ArrayList<SpecialInstructionsType>();
        }
        return this.specialInstructions;
    }

    /**
     * Gets the value of the handlingUnitReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingUnitReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingUnitReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHandlingUnitReference() {
        if (handlingUnitReference == null) {
            handlingUnitReference = new ArrayList<String>();
        }
        return this.handlingUnitReference;
    }

    /**
     * Gets the value of the packagingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingInformationType }
     * 
     * 
     */
    public List<PackagingInformationType> getPackagingInformation() {
        if (packagingInformation == null) {
            packagingInformation = new ArrayList<PackagingInformationType>();
        }
        return this.packagingInformation;
    }

}

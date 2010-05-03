
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}GrossWeight" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}GrossVolume" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TotalNumberOfPackages" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TotalNumberOfEquipment" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TotalNumberOfHandlingUnits" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TotalWeightOfPallets" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadPropertiesType", propOrder = {
    "grossWeight",
    "grossVolume",
    "totalNumberOfPackages",
    "totalNumberOfEquipment",
    "totalNumberOfHandlingUnits",
    "totalWeightOfPallets"
})
public class LoadPropertiesType {

    @XmlElement(name = "GrossWeight")
    protected GrossWeightType grossWeight;
    @XmlElement(name = "GrossVolume")
    protected GrossVolumeType grossVolume;
    @XmlElement(name = "TotalNumberOfPackages")
    protected TotalNumberOfPackagesType totalNumberOfPackages;
    @XmlElement(name = "TotalNumberOfEquipment")
    protected TotalNumberOfEquipmentType totalNumberOfEquipment;
    @XmlElement(name = "TotalNumberOfHandlingUnits")
    protected TotalNumberOfHandlingUnitsType totalNumberOfHandlingUnits;
    @XmlElement(name = "TotalWeightOfPallets")
    protected TotalWeightOfPalletsType totalWeightOfPallets;

    /**
     * Gets the value of the grossWeight property.
     * 
     * @return
     *     possible object is
     *     {@link GrossWeightType }
     *     
     */
    public GrossWeightType getGrossWeight() {
        return grossWeight;
    }

    /**
     * Sets the value of the grossWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossWeightType }
     *     
     */
    public void setGrossWeight(GrossWeightType value) {
        this.grossWeight = value;
    }

    /**
     * Gets the value of the grossVolume property.
     * 
     * @return
     *     possible object is
     *     {@link GrossVolumeType }
     *     
     */
    public GrossVolumeType getGrossVolume() {
        return grossVolume;
    }

    /**
     * Sets the value of the grossVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossVolumeType }
     *     
     */
    public void setGrossVolume(GrossVolumeType value) {
        this.grossVolume = value;
    }

    /**
     * Gets the value of the totalNumberOfPackages property.
     * 
     * @return
     *     possible object is
     *     {@link TotalNumberOfPackagesType }
     *     
     */
    public TotalNumberOfPackagesType getTotalNumberOfPackages() {
        return totalNumberOfPackages;
    }

    /**
     * Sets the value of the totalNumberOfPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalNumberOfPackagesType }
     *     
     */
    public void setTotalNumberOfPackages(TotalNumberOfPackagesType value) {
        this.totalNumberOfPackages = value;
    }

    /**
     * Gets the value of the totalNumberOfEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link TotalNumberOfEquipmentType }
     *     
     */
    public TotalNumberOfEquipmentType getTotalNumberOfEquipment() {
        return totalNumberOfEquipment;
    }

    /**
     * Sets the value of the totalNumberOfEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalNumberOfEquipmentType }
     *     
     */
    public void setTotalNumberOfEquipment(TotalNumberOfEquipmentType value) {
        this.totalNumberOfEquipment = value;
    }

    /**
     * Gets the value of the totalNumberOfHandlingUnits property.
     * 
     * @return
     *     possible object is
     *     {@link TotalNumberOfHandlingUnitsType }
     *     
     */
    public TotalNumberOfHandlingUnitsType getTotalNumberOfHandlingUnits() {
        return totalNumberOfHandlingUnits;
    }

    /**
     * Sets the value of the totalNumberOfHandlingUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalNumberOfHandlingUnitsType }
     *     
     */
    public void setTotalNumberOfHandlingUnits(TotalNumberOfHandlingUnitsType value) {
        this.totalNumberOfHandlingUnits = value;
    }

    /**
     * Gets the value of the totalWeightOfPallets property.
     * 
     * @return
     *     possible object is
     *     {@link TotalWeightOfPalletsType }
     *     
     */
    public TotalWeightOfPalletsType getTotalWeightOfPallets() {
        return totalWeightOfPallets;
    }

    /**
     * Sets the value of the totalWeightOfPallets property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalWeightOfPalletsType }
     *     
     */
    public void setTotalWeightOfPallets(TotalWeightOfPalletsType value) {
        this.totalWeightOfPallets = value;
    }

}

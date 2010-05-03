
package com.monsanto.cidx.header.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentInstructionsSubLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentInstructionsSubLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SubLineItemNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ManufacturingIdentificationDetails" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}GrossVolume" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NetVolume" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}GrossWeight" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NetWeight" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PalletQuantityInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentInstructionsSubLineItemType", propOrder = {
    "subLineItemNumber",
    "manufacturingIdentificationDetails",
    "grossVolume",
    "netVolume",
    "grossWeight",
    "netWeight",
    "palletQuantityInformation"
})
public class ShipmentInstructionsSubLineItemType {

    @XmlElement(name = "SubLineItemNumber", required = true)
    protected BigInteger subLineItemNumber;
    @XmlElement(name = "ManufacturingIdentificationDetails")
    protected ManufacturingIdentificationDetailsType manufacturingIdentificationDetails;
    @XmlElement(name = "GrossVolume")
    protected GrossVolumeType grossVolume;
    @XmlElement(name = "NetVolume")
    protected NetVolumeType netVolume;
    @XmlElement(name = "GrossWeight")
    protected GrossWeightType grossWeight;
    @XmlElement(name = "NetWeight")
    protected NetWeightType netWeight;
    @XmlElement(name = "PalletQuantityInformation")
    protected PalletQuantityInformationType palletQuantityInformation;

    /**
     * Gets the value of the subLineItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubLineItemNumber() {
        return subLineItemNumber;
    }

    /**
     * Sets the value of the subLineItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubLineItemNumber(BigInteger value) {
        this.subLineItemNumber = value;
    }

    /**
     * Gets the value of the manufacturingIdentificationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingIdentificationDetailsType }
     *     
     */
    public ManufacturingIdentificationDetailsType getManufacturingIdentificationDetails() {
        return manufacturingIdentificationDetails;
    }

    /**
     * Sets the value of the manufacturingIdentificationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingIdentificationDetailsType }
     *     
     */
    public void setManufacturingIdentificationDetails(ManufacturingIdentificationDetailsType value) {
        this.manufacturingIdentificationDetails = value;
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
     * Gets the value of the netVolume property.
     * 
     * @return
     *     possible object is
     *     {@link NetVolumeType }
     *     
     */
    public NetVolumeType getNetVolume() {
        return netVolume;
    }

    /**
     * Sets the value of the netVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetVolumeType }
     *     
     */
    public void setNetVolume(NetVolumeType value) {
        this.netVolume = value;
    }

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
     * Gets the value of the netWeight property.
     * 
     * @return
     *     possible object is
     *     {@link NetWeightType }
     *     
     */
    public NetWeightType getNetWeight() {
        return netWeight;
    }

    /**
     * Sets the value of the netWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetWeightType }
     *     
     */
    public void setNetWeight(NetWeightType value) {
        this.netWeight = value;
    }

    /**
     * Gets the value of the palletQuantityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PalletQuantityInformationType }
     *     
     */
    public PalletQuantityInformationType getPalletQuantityInformation() {
        return palletQuantityInformation;
    }

    /**
     * Sets the value of the palletQuantityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PalletQuantityInformationType }
     *     
     */
    public void setPalletQuantityInformation(PalletQuantityInformationType value) {
        this.palletQuantityInformation = value;
    }

}

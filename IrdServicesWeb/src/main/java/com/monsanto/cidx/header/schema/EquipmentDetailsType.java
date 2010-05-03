
package com.monsanto.cidx.header.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EquipmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductLineItemLineNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EquipmentIdentifier" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CarrierEquipmentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EquipmentOwnershipCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NumberOfUnits" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Height" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Width" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Length" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NetWeight" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TareWeight" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}GrossWeight" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NetVolume" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}GrossVolume" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SealNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EquipmentLoadEmptyStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AssociatedEquipment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TotalWeightOfPallets" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EquipmentMaterialType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentDetailsType", propOrder = {
    "lineNumber",
    "productLineItemLineNumber",
    "equipmentIdentifier",
    "carrierEquipmentCode",
    "equipmentOwnershipCode",
    "numberOfUnits",
    "specialInstructions",
    "height",
    "width",
    "length",
    "netWeight",
    "tareWeight",
    "grossWeight",
    "netVolume",
    "grossVolume",
    "sealNumber",
    "equipmentLoadEmptyStatus",
    "associatedEquipment",
    "totalWeightOfPallets",
    "equipmentMaterialType"
})
public class EquipmentDetailsType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "ProductLineItemLineNumber")
    protected List<BigInteger> productLineItemLineNumber;
    @XmlElement(name = "EquipmentIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String equipmentIdentifier;
    @XmlElement(name = "CarrierEquipmentCode")
    protected CarrierEquipmentCodeType carrierEquipmentCode;
    @XmlElement(name = "EquipmentOwnershipCode")
    protected EquipmentOwnershipCodeType equipmentOwnershipCode;
    @XmlElement(name = "NumberOfUnits")
    protected NumberOfUnitsType numberOfUnits;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "Height")
    protected HeightType height;
    @XmlElement(name = "Width")
    protected WidthType width;
    @XmlElement(name = "Length")
    protected LengthType length;
    @XmlElement(name = "NetWeight")
    protected NetWeightType netWeight;
    @XmlElement(name = "TareWeight")
    protected TareWeightType tareWeight;
    @XmlElement(name = "GrossWeight")
    protected GrossWeightType grossWeight;
    @XmlElement(name = "NetVolume")
    protected NetVolumeType netVolume;
    @XmlElement(name = "GrossVolume")
    protected GrossVolumeType grossVolume;
    @XmlElement(name = "SealNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> sealNumber;
    @XmlElement(name = "EquipmentLoadEmptyStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String equipmentLoadEmptyStatus;
    @XmlElement(name = "AssociatedEquipment")
    protected List<AssociatedEquipmentType> associatedEquipment;
    @XmlElement(name = "TotalWeightOfPallets")
    protected TotalWeightOfPalletsType totalWeightOfPallets;
    @XmlElement(name = "EquipmentMaterialType")
    protected EquipmentMaterialTypeType equipmentMaterialType;

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
     * Gets the value of the productLineItemLineNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productLineItemLineNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductLineItemLineNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getProductLineItemLineNumber() {
        if (productLineItemLineNumber == null) {
            productLineItemLineNumber = new ArrayList<BigInteger>();
        }
        return this.productLineItemLineNumber;
    }

    /**
     * Gets the value of the equipmentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentIdentifier() {
        return equipmentIdentifier;
    }

    /**
     * Sets the value of the equipmentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentIdentifier(String value) {
        this.equipmentIdentifier = value;
    }

    /**
     * Gets the value of the carrierEquipmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierEquipmentCodeType }
     *     
     */
    public CarrierEquipmentCodeType getCarrierEquipmentCode() {
        return carrierEquipmentCode;
    }

    /**
     * Sets the value of the carrierEquipmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierEquipmentCodeType }
     *     
     */
    public void setCarrierEquipmentCode(CarrierEquipmentCodeType value) {
        this.carrierEquipmentCode = value;
    }

    /**
     * Gets the value of the equipmentOwnershipCode property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentOwnershipCodeType }
     *     
     */
    public EquipmentOwnershipCodeType getEquipmentOwnershipCode() {
        return equipmentOwnershipCode;
    }

    /**
     * Sets the value of the equipmentOwnershipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentOwnershipCodeType }
     *     
     */
    public void setEquipmentOwnershipCode(EquipmentOwnershipCodeType value) {
        this.equipmentOwnershipCode = value;
    }

    /**
     * Gets the value of the numberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitsType }
     *     
     */
    public NumberOfUnitsType getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Sets the value of the numberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitsType }
     *     
     */
    public void setNumberOfUnits(NumberOfUnitsType value) {
        this.numberOfUnits = value;
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
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link HeightType }
     *     
     */
    public HeightType getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeightType }
     *     
     */
    public void setHeight(HeightType value) {
        this.height = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link WidthType }
     *     
     */
    public WidthType getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link WidthType }
     *     
     */
    public void setWidth(WidthType value) {
        this.width = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setLength(LengthType value) {
        this.length = value;
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
     * Gets the value of the tareWeight property.
     * 
     * @return
     *     possible object is
     *     {@link TareWeightType }
     *     
     */
    public TareWeightType getTareWeight() {
        return tareWeight;
    }

    /**
     * Sets the value of the tareWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link TareWeightType }
     *     
     */
    public void setTareWeight(TareWeightType value) {
        this.tareWeight = value;
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
     * Gets the value of the sealNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sealNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSealNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSealNumber() {
        if (sealNumber == null) {
            sealNumber = new ArrayList<String>();
        }
        return this.sealNumber;
    }

    /**
     * Gets the value of the equipmentLoadEmptyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentLoadEmptyStatus() {
        return equipmentLoadEmptyStatus;
    }

    /**
     * Sets the value of the equipmentLoadEmptyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentLoadEmptyStatus(String value) {
        this.equipmentLoadEmptyStatus = value;
    }

    /**
     * Gets the value of the associatedEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedEquipmentType }
     * 
     * 
     */
    public List<AssociatedEquipmentType> getAssociatedEquipment() {
        if (associatedEquipment == null) {
            associatedEquipment = new ArrayList<AssociatedEquipmentType>();
        }
        return this.associatedEquipment;
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

    /**
     * Gets the value of the equipmentMaterialType property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentMaterialTypeType }
     *     
     */
    public EquipmentMaterialTypeType getEquipmentMaterialType() {
        return equipmentMaterialType;
    }

    /**
     * Sets the value of the equipmentMaterialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentMaterialTypeType }
     *     
     */
    public void setEquipmentMaterialType(EquipmentMaterialTypeType value) {
        this.equipmentMaterialType = value;
    }

}


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
 * <p>Java class for CarrierWeightsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierWeightsDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EquipmentIdentifier"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ScaleDate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Weight"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EquipmentOwnershipCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TareWeight" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}WeightAllowance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierWeightsDetailsType", propOrder = {
    "equipmentIdentifier",
    "scaleDate",
    "weight",
    "equipmentOwnershipCode",
    "tareWeight",
    "weightAllowance",
    "referenceInformation"
})
public class CarrierWeightsDetailsType {

    @XmlElement(name = "EquipmentIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String equipmentIdentifier;
    @XmlElement(name = "ScaleDate", required = true)
    protected ScaleDateType scaleDate;
    @XmlElement(name = "Weight", required = true)
    protected WeightType weight;
    @XmlElement(name = "EquipmentOwnershipCode")
    protected EquipmentOwnershipCodeType equipmentOwnershipCode;
    @XmlElement(name = "TareWeight")
    protected TareWeightType tareWeight;
    @XmlElement(name = "WeightAllowance")
    protected List<WeightAllowanceType> weightAllowance;
    @XmlElement(name = "ReferenceInformation")
    protected List<ReferenceInformationType> referenceInformation;

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
     * Gets the value of the scaleDate property.
     * 
     * @return
     *     possible object is
     *     {@link ScaleDateType }
     *     
     */
    public ScaleDateType getScaleDate() {
        return scaleDate;
    }

    /**
     * Sets the value of the scaleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleDateType }
     *     
     */
    public void setScaleDate(ScaleDateType value) {
        this.scaleDate = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link WeightType }
     *     
     */
    public WeightType getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *     
     */
    public void setWeight(WeightType value) {
        this.weight = value;
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
     * Gets the value of the weightAllowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weightAllowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeightAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeightAllowanceType }
     * 
     * 
     */
    public List<WeightAllowanceType> getWeightAllowance() {
        if (weightAllowance == null) {
            weightAllowance = new ArrayList<WeightAllowanceType>();
        }
        return this.weightAllowance;
    }

    /**
     * Gets the value of the referenceInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInformationType }
     * 
     * 
     */
    public List<ReferenceInformationType> getReferenceInformation() {
        if (referenceInformation == null) {
            referenceInformation = new ArrayList<ReferenceInformationType>();
        }
        return this.referenceInformation;
    }

}

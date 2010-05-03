
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
 * <p>Java class for AssociatedEquipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedEquipmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EquipmentIdentifier"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NumberOfUnits" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MeasurementInformation"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedEquipmentType", propOrder = {
    "equipmentIdentifier",
    "numberOfUnits",
    "measurementInformation",
    "specialInstructions"
})
public class AssociatedEquipmentType {

    @XmlElement(name = "EquipmentIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String equipmentIdentifier;
    @XmlElement(name = "NumberOfUnits")
    protected NumberOfUnitsType numberOfUnits;
    @XmlElement(name = "MeasurementInformation", required = true)
    protected MeasurementInformationType measurementInformation;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;

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
     * Gets the value of the measurementInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementInformationType }
     *     
     */
    public MeasurementInformationType getMeasurementInformation() {
        return measurementInformation;
    }

    /**
     * Sets the value of the measurementInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementInformationType }
     *     
     */
    public void setMeasurementInformation(MeasurementInformationType value) {
        this.measurementInformation = value;
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

}

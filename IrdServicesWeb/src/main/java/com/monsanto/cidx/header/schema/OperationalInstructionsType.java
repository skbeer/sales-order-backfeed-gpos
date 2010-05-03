
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for OperationalInstructionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationalInstructionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Instructions"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecifiedMeasurement" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="InstructionType" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListOperationalInstructionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationalInstructionsType", propOrder = {
    "instructions",
    "specifiedMeasurement"
})
public class OperationalInstructionsType {

    @XmlElement(name = "Instructions", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String instructions;
    @XmlElement(name = "SpecifiedMeasurement")
    protected SpecifiedMeasurementType specifiedMeasurement;
    @XmlAttribute(name = "InstructionType")
    protected CidxListOperationalInstructionType instructionType;

    /**
     * Gets the value of the instructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * Sets the value of the instructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructions(String value) {
        this.instructions = value;
    }

    /**
     * Gets the value of the specifiedMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedMeasurementType }
     *     
     */
    public SpecifiedMeasurementType getSpecifiedMeasurement() {
        return specifiedMeasurement;
    }

    /**
     * Sets the value of the specifiedMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedMeasurementType }
     *     
     */
    public void setSpecifiedMeasurement(SpecifiedMeasurementType value) {
        this.specifiedMeasurement = value;
    }

    /**
     * Gets the value of the instructionType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListOperationalInstructionType }
     *     
     */
    public CidxListOperationalInstructionType getInstructionType() {
        return instructionType;
    }

    /**
     * Sets the value of the instructionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListOperationalInstructionType }
     *     
     */
    public void setInstructionType(CidxListOperationalInstructionType value) {
        this.instructionType = value;
    }

}

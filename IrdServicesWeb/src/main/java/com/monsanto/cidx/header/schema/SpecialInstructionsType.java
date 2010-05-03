
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for SpecialInstructionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialInstructionsType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:cidx:names:specification:ces:schema:all:5:0>cidxString">
 *       &lt;attribute name="InstructionType" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListInstructionType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialInstructionsType", propOrder = {
    "value"
})
public class SpecialInstructionsType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "InstructionType", required = true)
    protected CidxListInstructionType instructionType;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the instructionType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListInstructionType }
     *     
     */
    public CidxListInstructionType getInstructionType() {
        return instructionType;
    }

    /**
     * Sets the value of the instructionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListInstructionType }
     *     
     */
    public void setInstructionType(CidxListInstructionType value) {
        this.instructionType = value;
    }

}

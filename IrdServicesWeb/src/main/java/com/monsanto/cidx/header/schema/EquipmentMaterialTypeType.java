
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EquipmentMaterialTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentMaterialTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Enclosure" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Seal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentMaterialTypeType", propOrder = {
    "enclosure",
    "seal"
})
public class EquipmentMaterialTypeType {

    @XmlElement(name = "Enclosure")
    protected CidxListEnclosureType enclosure;
    @XmlElement(name = "Seal")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String seal;

    /**
     * Gets the value of the enclosure property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListEnclosureType }
     *     
     */
    public CidxListEnclosureType getEnclosure() {
        return enclosure;
    }

    /**
     * Sets the value of the enclosure property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListEnclosureType }
     *     
     */
    public void setEnclosure(CidxListEnclosureType value) {
        this.enclosure = value;
    }

    /**
     * Gets the value of the seal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeal() {
        return seal;
    }

    /**
     * Sets the value of the seal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeal(String value) {
        this.seal = value;
    }

}

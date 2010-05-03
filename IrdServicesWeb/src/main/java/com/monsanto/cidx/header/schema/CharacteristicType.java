
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CharacteristicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacteristicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CharacteristicCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CharacteristicDescription" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SurfaceLayerPositionCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SourceSubqualifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharacteristicType", propOrder = {
    "characteristicCode",
    "characteristicDescription",
    "surfaceLayerPositionCode",
    "sourceSubqualifier"
})
public class CharacteristicType {

    @XmlElement(name = "CharacteristicCode")
    protected CharacteristicCodeType characteristicCode;
    @XmlElement(name = "CharacteristicDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String characteristicDescription;
    @XmlElement(name = "SurfaceLayerPositionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String surfaceLayerPositionCode;
    @XmlElement(name = "SourceSubqualifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sourceSubqualifier;

    /**
     * Gets the value of the characteristicCode property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicCodeType }
     *     
     */
    public CharacteristicCodeType getCharacteristicCode() {
        return characteristicCode;
    }

    /**
     * Sets the value of the characteristicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicCodeType }
     *     
     */
    public void setCharacteristicCode(CharacteristicCodeType value) {
        this.characteristicCode = value;
    }

    /**
     * Gets the value of the characteristicDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicDescription() {
        return characteristicDescription;
    }

    /**
     * Sets the value of the characteristicDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristicDescription(String value) {
        this.characteristicDescription = value;
    }

    /**
     * Gets the value of the surfaceLayerPositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurfaceLayerPositionCode() {
        return surfaceLayerPositionCode;
    }

    /**
     * Sets the value of the surfaceLayerPositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurfaceLayerPositionCode(String value) {
        this.surfaceLayerPositionCode = value;
    }

    /**
     * Gets the value of the sourceSubqualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSubqualifier() {
        return sourceSubqualifier;
    }

    /**
     * Sets the value of the sourceSubqualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSubqualifier(String value) {
        this.sourceSubqualifier = value;
    }

}

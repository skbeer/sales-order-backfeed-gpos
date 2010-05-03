
package com.monsanto.cidx.header.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LadingIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LadingIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LadingDescription"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LadingIdentifier"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LadingFreightClass" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Agency" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListLadingIdentificationAgency" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LadingIdentificationType", propOrder = {
    "ladingDescription",
    "ladingIdentifier",
    "ladingFreightClass"
})
public class LadingIdentificationType {

    @XmlElement(name = "LadingDescription", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ladingDescription;
    @XmlElement(name = "LadingIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ladingIdentifier;
    @XmlElement(name = "LadingFreightClass")
    protected BigDecimal ladingFreightClass;
    @XmlAttribute(name = "Agency", required = true)
    protected CidxListLadingIdentificationAgency agency;

    /**
     * Gets the value of the ladingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLadingDescription() {
        return ladingDescription;
    }

    /**
     * Sets the value of the ladingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLadingDescription(String value) {
        this.ladingDescription = value;
    }

    /**
     * Gets the value of the ladingIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLadingIdentifier() {
        return ladingIdentifier;
    }

    /**
     * Sets the value of the ladingIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLadingIdentifier(String value) {
        this.ladingIdentifier = value;
    }

    /**
     * Gets the value of the ladingFreightClass property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLadingFreightClass() {
        return ladingFreightClass;
    }

    /**
     * Sets the value of the ladingFreightClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLadingFreightClass(BigDecimal value) {
        this.ladingFreightClass = value;
    }

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListLadingIdentificationAgency }
     *     
     */
    public CidxListLadingIdentificationAgency getAgency() {
        return agency;
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListLadingIdentificationAgency }
     *     
     */
    public void setAgency(CidxListLadingIdentificationAgency value) {
        this.agency = value;
    }

}

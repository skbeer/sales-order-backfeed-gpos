
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
 * <p>Java class for HazardousIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazardousIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HazardousNotation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CompatibilityGroupCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CHRISCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NFPACode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EUSubstanceNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ChemicalAbstractsServiceRegistryNumber" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousIdentificationType", propOrder = {
    "hazardousNotation",
    "compatibilityGroupCode",
    "chrisCode",
    "nfpaCode",
    "euSubstanceNumber",
    "chemicalAbstractsServiceRegistryNumber"
})
public class HazardousIdentificationType {

    @XmlElement(name = "HazardousNotation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hazardousNotation;
    @XmlElement(name = "CompatibilityGroupCode")
    protected CompatibilityGroupCodeType compatibilityGroupCode;
    @XmlElement(name = "CHRISCode")
    protected CHRISCodeType chrisCode;
    @XmlElement(name = "NFPACode")
    protected NFPACodeType nfpaCode;
    @XmlElement(name = "EUSubstanceNumber")
    protected EUSubstanceNumberType euSubstanceNumber;
    @XmlElement(name = "ChemicalAbstractsServiceRegistryNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> chemicalAbstractsServiceRegistryNumber;

    /**
     * Gets the value of the hazardousNotation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardousNotation() {
        return hazardousNotation;
    }

    /**
     * Sets the value of the hazardousNotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardousNotation(String value) {
        this.hazardousNotation = value;
    }

    /**
     * Gets the value of the compatibilityGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link CompatibilityGroupCodeType }
     *     
     */
    public CompatibilityGroupCodeType getCompatibilityGroupCode() {
        return compatibilityGroupCode;
    }

    /**
     * Sets the value of the compatibilityGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompatibilityGroupCodeType }
     *     
     */
    public void setCompatibilityGroupCode(CompatibilityGroupCodeType value) {
        this.compatibilityGroupCode = value;
    }

    /**
     * Gets the value of the chrisCode property.
     * 
     * @return
     *     possible object is
     *     {@link CHRISCodeType }
     *     
     */
    public CHRISCodeType getCHRISCode() {
        return chrisCode;
    }

    /**
     * Sets the value of the chrisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CHRISCodeType }
     *     
     */
    public void setCHRISCode(CHRISCodeType value) {
        this.chrisCode = value;
    }

    /**
     * Gets the value of the nfpaCode property.
     * 
     * @return
     *     possible object is
     *     {@link NFPACodeType }
     *     
     */
    public NFPACodeType getNFPACode() {
        return nfpaCode;
    }

    /**
     * Sets the value of the nfpaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NFPACodeType }
     *     
     */
    public void setNFPACode(NFPACodeType value) {
        this.nfpaCode = value;
    }

    /**
     * Gets the value of the euSubstanceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EUSubstanceNumberType }
     *     
     */
    public EUSubstanceNumberType getEUSubstanceNumber() {
        return euSubstanceNumber;
    }

    /**
     * Sets the value of the euSubstanceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUSubstanceNumberType }
     *     
     */
    public void setEUSubstanceNumber(EUSubstanceNumberType value) {
        this.euSubstanceNumber = value;
    }

    /**
     * Gets the value of the chemicalAbstractsServiceRegistryNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemicalAbstractsServiceRegistryNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemicalAbstractsServiceRegistryNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChemicalAbstractsServiceRegistryNumber() {
        if (chemicalAbstractsServiceRegistryNumber == null) {
            chemicalAbstractsServiceRegistryNumber = new ArrayList<String>();
        }
        return this.chemicalAbstractsServiceRegistryNumber;
    }

}


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
 * <p>Java class for RegulationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RegulationCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RegulationName" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Exemption" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NonHazardousFlag"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HazmatShippingName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}UnitedNationsNorthAmericaCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HazardousClassPrimaryCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HazardousClassSubsidiaryCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackingGroupCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HazardousReportableQuantityIndicator" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EmergencyResponsePlanNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EmergencyResponseContact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ElevatedTemperatureLabel" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}UNPortableTankCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}UNSpecialRequirements" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MaximumFillingDegree" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TremcardCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ModeOfTransportationInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HazardousFormattedText" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulationType", propOrder = {
    "regulationCode",
    "regulationName",
    "exemption",
    "nonHazardousFlag",
    "hazmatShippingName",
    "unitedNationsNorthAmericaCode",
    "hazardousClassPrimaryCode",
    "hazardousClassSubsidiaryCode",
    "packingGroupCode",
    "hazardousReportableQuantityIndicator",
    "emergencyResponsePlanNumber",
    "emergencyResponseContact",
    "specialInstructions",
    "elevatedTemperatureLabel",
    "unPortableTankCode",
    "unSpecialRequirements",
    "maximumFillingDegree",
    "tremcardCode",
    "modeOfTransportationInformation",
    "hazardousFormattedText"
})
public class RegulationType {

    @XmlElement(name = "RegulationCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String regulationCode;
    @XmlElement(name = "RegulationName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String regulationName;
    @XmlElement(name = "Exemption")
    protected ExemptionType exemption;
    @XmlElement(name = "NonHazardousFlag", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nonHazardousFlag;
    @XmlElement(name = "HazmatShippingName")
    protected List<HazmatShippingNameType> hazmatShippingName;
    @XmlElement(name = "UnitedNationsNorthAmericaCode")
    protected UnitedNationsNorthAmericaCodeType unitedNationsNorthAmericaCode;
    @XmlElement(name = "HazardousClassPrimaryCode")
    protected HazardousClassPrimaryCodeType hazardousClassPrimaryCode;
    @XmlElement(name = "HazardousClassSubsidiaryCode")
    protected List<HazardousClassSubsidiaryCodeType> hazardousClassSubsidiaryCode;
    @XmlElement(name = "PackingGroupCode")
    protected PackingGroupCodeType packingGroupCode;
    @XmlElement(name = "HazardousReportableQuantityIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hazardousReportableQuantityIndicator;
    @XmlElement(name = "EmergencyResponsePlanNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String emergencyResponsePlanNumber;
    @XmlElement(name = "EmergencyResponseContact")
    protected List<EmergencyResponseContactType> emergencyResponseContact;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "ElevatedTemperatureLabel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String elevatedTemperatureLabel;
    @XmlElement(name = "UNPortableTankCode")
    protected UNPortableTankCodeType unPortableTankCode;
    @XmlElement(name = "UNSpecialRequirements")
    protected UNSpecialRequirementsType unSpecialRequirements;
    @XmlElement(name = "MaximumFillingDegree")
    protected MaximumFillingDegreeType maximumFillingDegree;
    @XmlElement(name = "TremcardCode")
    protected TremcardCodeType tremcardCode;
    @XmlElement(name = "ModeOfTransportationInformation")
    protected ModeOfTransportationInformationType modeOfTransportationInformation;
    @XmlElement(name = "HazardousFormattedText")
    protected List<HazardousFormattedTextType> hazardousFormattedText;

    /**
     * Gets the value of the regulationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationCode() {
        return regulationCode;
    }

    /**
     * Sets the value of the regulationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationCode(String value) {
        this.regulationCode = value;
    }

    /**
     * Gets the value of the regulationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationName() {
        return regulationName;
    }

    /**
     * Sets the value of the regulationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationName(String value) {
        this.regulationName = value;
    }

    /**
     * Gets the value of the exemption property.
     * 
     * @return
     *     possible object is
     *     {@link ExemptionType }
     *     
     */
    public ExemptionType getExemption() {
        return exemption;
    }

    /**
     * Sets the value of the exemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExemptionType }
     *     
     */
    public void setExemption(ExemptionType value) {
        this.exemption = value;
    }

    /**
     * Gets the value of the nonHazardousFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonHazardousFlag() {
        return nonHazardousFlag;
    }

    /**
     * Sets the value of the nonHazardousFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonHazardousFlag(String value) {
        this.nonHazardousFlag = value;
    }

    /**
     * Gets the value of the hazmatShippingName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazmatShippingName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazmatShippingName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazmatShippingNameType }
     * 
     * 
     */
    public List<HazmatShippingNameType> getHazmatShippingName() {
        if (hazmatShippingName == null) {
            hazmatShippingName = new ArrayList<HazmatShippingNameType>();
        }
        return this.hazmatShippingName;
    }

    /**
     * Gets the value of the unitedNationsNorthAmericaCode property.
     * 
     * @return
     *     possible object is
     *     {@link UnitedNationsNorthAmericaCodeType }
     *     
     */
    public UnitedNationsNorthAmericaCodeType getUnitedNationsNorthAmericaCode() {
        return unitedNationsNorthAmericaCode;
    }

    /**
     * Sets the value of the unitedNationsNorthAmericaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitedNationsNorthAmericaCodeType }
     *     
     */
    public void setUnitedNationsNorthAmericaCode(UnitedNationsNorthAmericaCodeType value) {
        this.unitedNationsNorthAmericaCode = value;
    }

    /**
     * Gets the value of the hazardousClassPrimaryCode property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousClassPrimaryCodeType }
     *     
     */
    public HazardousClassPrimaryCodeType getHazardousClassPrimaryCode() {
        return hazardousClassPrimaryCode;
    }

    /**
     * Sets the value of the hazardousClassPrimaryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousClassPrimaryCodeType }
     *     
     */
    public void setHazardousClassPrimaryCode(HazardousClassPrimaryCodeType value) {
        this.hazardousClassPrimaryCode = value;
    }

    /**
     * Gets the value of the hazardousClassSubsidiaryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousClassSubsidiaryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousClassSubsidiaryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousClassSubsidiaryCodeType }
     * 
     * 
     */
    public List<HazardousClassSubsidiaryCodeType> getHazardousClassSubsidiaryCode() {
        if (hazardousClassSubsidiaryCode == null) {
            hazardousClassSubsidiaryCode = new ArrayList<HazardousClassSubsidiaryCodeType>();
        }
        return this.hazardousClassSubsidiaryCode;
    }

    /**
     * Gets the value of the packingGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackingGroupCodeType }
     *     
     */
    public PackingGroupCodeType getPackingGroupCode() {
        return packingGroupCode;
    }

    /**
     * Sets the value of the packingGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackingGroupCodeType }
     *     
     */
    public void setPackingGroupCode(PackingGroupCodeType value) {
        this.packingGroupCode = value;
    }

    /**
     * Gets the value of the hazardousReportableQuantityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardousReportableQuantityIndicator() {
        return hazardousReportableQuantityIndicator;
    }

    /**
     * Sets the value of the hazardousReportableQuantityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardousReportableQuantityIndicator(String value) {
        this.hazardousReportableQuantityIndicator = value;
    }

    /**
     * Gets the value of the emergencyResponsePlanNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyResponsePlanNumber() {
        return emergencyResponsePlanNumber;
    }

    /**
     * Sets the value of the emergencyResponsePlanNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyResponsePlanNumber(String value) {
        this.emergencyResponsePlanNumber = value;
    }

    /**
     * Gets the value of the emergencyResponseContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emergencyResponseContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmergencyResponseContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmergencyResponseContactType }
     * 
     * 
     */
    public List<EmergencyResponseContactType> getEmergencyResponseContact() {
        if (emergencyResponseContact == null) {
            emergencyResponseContact = new ArrayList<EmergencyResponseContactType>();
        }
        return this.emergencyResponseContact;
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
     * Gets the value of the elevatedTemperatureLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElevatedTemperatureLabel() {
        return elevatedTemperatureLabel;
    }

    /**
     * Sets the value of the elevatedTemperatureLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElevatedTemperatureLabel(String value) {
        this.elevatedTemperatureLabel = value;
    }

    /**
     * Gets the value of the unPortableTankCode property.
     * 
     * @return
     *     possible object is
     *     {@link UNPortableTankCodeType }
     *     
     */
    public UNPortableTankCodeType getUNPortableTankCode() {
        return unPortableTankCode;
    }

    /**
     * Sets the value of the unPortableTankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UNPortableTankCodeType }
     *     
     */
    public void setUNPortableTankCode(UNPortableTankCodeType value) {
        this.unPortableTankCode = value;
    }

    /**
     * Gets the value of the unSpecialRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link UNSpecialRequirementsType }
     *     
     */
    public UNSpecialRequirementsType getUNSpecialRequirements() {
        return unSpecialRequirements;
    }

    /**
     * Sets the value of the unSpecialRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link UNSpecialRequirementsType }
     *     
     */
    public void setUNSpecialRequirements(UNSpecialRequirementsType value) {
        this.unSpecialRequirements = value;
    }

    /**
     * Gets the value of the maximumFillingDegree property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumFillingDegreeType }
     *     
     */
    public MaximumFillingDegreeType getMaximumFillingDegree() {
        return maximumFillingDegree;
    }

    /**
     * Sets the value of the maximumFillingDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumFillingDegreeType }
     *     
     */
    public void setMaximumFillingDegree(MaximumFillingDegreeType value) {
        this.maximumFillingDegree = value;
    }

    /**
     * Gets the value of the tremcardCode property.
     * 
     * @return
     *     possible object is
     *     {@link TremcardCodeType }
     *     
     */
    public TremcardCodeType getTremcardCode() {
        return tremcardCode;
    }

    /**
     * Sets the value of the tremcardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TremcardCodeType }
     *     
     */
    public void setTremcardCode(TremcardCodeType value) {
        this.tremcardCode = value;
    }

    /**
     * Gets the value of the modeOfTransportationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ModeOfTransportationInformationType }
     *     
     */
    public ModeOfTransportationInformationType getModeOfTransportationInformation() {
        return modeOfTransportationInformation;
    }

    /**
     * Sets the value of the modeOfTransportationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModeOfTransportationInformationType }
     *     
     */
    public void setModeOfTransportationInformation(ModeOfTransportationInformationType value) {
        this.modeOfTransportationInformation = value;
    }

    /**
     * Gets the value of the hazardousFormattedText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousFormattedText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousFormattedText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousFormattedTextType }
     * 
     * 
     */
    public List<HazardousFormattedTextType> getHazardousFormattedText() {
        if (hazardousFormattedText == null) {
            hazardousFormattedText = new ArrayList<HazardousFormattedTextType>();
        }
        return this.hazardousFormattedText;
    }

}

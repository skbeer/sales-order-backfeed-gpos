
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
 * <p>Java class for AirTransportInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirTransportInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AircraftLimitations"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialLabelsAndMarkings" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackingInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AdditionalHandlingInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialProvisionNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirTransportInformationType", propOrder = {
    "aircraftLimitations",
    "specialLabelsAndMarkings",
    "packingInstructions",
    "additionalHandlingInformation",
    "specialProvisionNumber"
})
public class AirTransportInformationType {

    @XmlElement(name = "AircraftLimitations", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String aircraftLimitations;
    @XmlElement(name = "SpecialLabelsAndMarkings")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> specialLabelsAndMarkings;
    @XmlElement(name = "PackingInstructions")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> packingInstructions;
    @XmlElement(name = "AdditionalHandlingInformation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> additionalHandlingInformation;
    @XmlElement(name = "SpecialProvisionNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String specialProvisionNumber;

    /**
     * Gets the value of the aircraftLimitations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftLimitations() {
        return aircraftLimitations;
    }

    /**
     * Sets the value of the aircraftLimitations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftLimitations(String value) {
        this.aircraftLimitations = value;
    }

    /**
     * Gets the value of the specialLabelsAndMarkings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialLabelsAndMarkings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialLabelsAndMarkings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpecialLabelsAndMarkings() {
        if (specialLabelsAndMarkings == null) {
            specialLabelsAndMarkings = new ArrayList<String>();
        }
        return this.specialLabelsAndMarkings;
    }

    /**
     * Gets the value of the packingInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packingInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackingInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPackingInstructions() {
        if (packingInstructions == null) {
            packingInstructions = new ArrayList<String>();
        }
        return this.packingInstructions;
    }

    /**
     * Gets the value of the additionalHandlingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalHandlingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalHandlingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdditionalHandlingInformation() {
        if (additionalHandlingInformation == null) {
            additionalHandlingInformation = new ArrayList<String>();
        }
        return this.additionalHandlingInformation;
    }

    /**
     * Gets the value of the specialProvisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialProvisionNumber() {
        return specialProvisionNumber;
    }

    /**
     * Sets the value of the specialProvisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialProvisionNumber(String value) {
        this.specialProvisionNumber = value;
    }

}

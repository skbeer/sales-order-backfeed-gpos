
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ThirdPartyLaboratoryDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyLaboratoryDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SampleContainer"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DateSampleTaken"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SampleDescription"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LocationSampleObtained"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyLaboratoryDetailType", propOrder = {
    "sampleContainer",
    "dateSampleTaken",
    "sampleDescription",
    "locationSampleObtained"
})
public class ThirdPartyLaboratoryDetailType {

    @XmlElement(name = "SampleContainer", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sampleContainer;
    @XmlElement(name = "DateSampleTaken", required = true)
    protected DateSampleTakenType dateSampleTaken;
    @XmlElement(name = "SampleDescription", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sampleDescription;
    @XmlElement(name = "LocationSampleObtained", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String locationSampleObtained;

    /**
     * Gets the value of the sampleContainer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleContainer() {
        return sampleContainer;
    }

    /**
     * Sets the value of the sampleContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleContainer(String value) {
        this.sampleContainer = value;
    }

    /**
     * Gets the value of the dateSampleTaken property.
     * 
     * @return
     *     possible object is
     *     {@link DateSampleTakenType }
     *     
     */
    public DateSampleTakenType getDateSampleTaken() {
        return dateSampleTaken;
    }

    /**
     * Sets the value of the dateSampleTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateSampleTakenType }
     *     
     */
    public void setDateSampleTaken(DateSampleTakenType value) {
        this.dateSampleTaken = value;
    }

    /**
     * Gets the value of the sampleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleDescription() {
        return sampleDescription;
    }

    /**
     * Sets the value of the sampleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleDescription(String value) {
        this.sampleDescription = value;
    }

    /**
     * Gets the value of the locationSampleObtained property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationSampleObtained() {
        return locationSampleObtained;
    }

    /**
     * Sets the value of the locationSampleObtained property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationSampleObtained(String value) {
        this.locationSampleObtained = value;
    }

}

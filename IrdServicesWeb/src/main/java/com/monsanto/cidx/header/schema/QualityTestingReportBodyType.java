
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualityTestingReportBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualityTestingReportBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}QualityTestingReportProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}QualityTestingReportPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}QualityTestingReportDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualityTestingReportBodyType", propOrder = {
    "qualityTestingReportProperties",
    "qualityTestingReportPartners",
    "qualityTestingReportDetails"
})
public class QualityTestingReportBodyType {

    @XmlElement(name = "QualityTestingReportProperties", required = true)
    protected QualityTestingReportPropertiesType qualityTestingReportProperties;
    @XmlElement(name = "QualityTestingReportPartners", required = true)
    protected QualityTestingReportPartnersType qualityTestingReportPartners;
    @XmlElement(name = "QualityTestingReportDetails", required = true)
    protected QualityTestingReportDetailsType qualityTestingReportDetails;

    /**
     * Gets the value of the qualityTestingReportProperties property.
     * 
     * @return
     *     possible object is
     *     {@link QualityTestingReportPropertiesType }
     *     
     */
    public QualityTestingReportPropertiesType getQualityTestingReportProperties() {
        return qualityTestingReportProperties;
    }

    /**
     * Sets the value of the qualityTestingReportProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityTestingReportPropertiesType }
     *     
     */
    public void setQualityTestingReportProperties(QualityTestingReportPropertiesType value) {
        this.qualityTestingReportProperties = value;
    }

    /**
     * Gets the value of the qualityTestingReportPartners property.
     * 
     * @return
     *     possible object is
     *     {@link QualityTestingReportPartnersType }
     *     
     */
    public QualityTestingReportPartnersType getQualityTestingReportPartners() {
        return qualityTestingReportPartners;
    }

    /**
     * Sets the value of the qualityTestingReportPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityTestingReportPartnersType }
     *     
     */
    public void setQualityTestingReportPartners(QualityTestingReportPartnersType value) {
        this.qualityTestingReportPartners = value;
    }

    /**
     * Gets the value of the qualityTestingReportDetails property.
     * 
     * @return
     *     possible object is
     *     {@link QualityTestingReportDetailsType }
     *     
     */
    public QualityTestingReportDetailsType getQualityTestingReportDetails() {
        return qualityTestingReportDetails;
    }

    /**
     * Sets the value of the qualityTestingReportDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityTestingReportDetailsType }
     *     
     */
    public void setQualityTestingReportDetails(QualityTestingReportDetailsType value) {
        this.qualityTestingReportDetails = value;
    }

}

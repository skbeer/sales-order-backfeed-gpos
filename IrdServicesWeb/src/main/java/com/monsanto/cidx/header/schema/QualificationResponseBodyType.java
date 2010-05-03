
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualificationResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualificationResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}QualificationResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}QualificationResponsePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}QualificationResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualificationResponseBodyType", propOrder = {
    "qualificationResponseProperties",
    "qualificationResponsePartners",
    "qualificationResponseDetails"
})
public class QualificationResponseBodyType {

    @XmlElement(name = "QualificationResponseProperties", required = true)
    protected QualificationResponsePropertiesType qualificationResponseProperties;
    @XmlElement(name = "QualificationResponsePartners", required = true)
    protected QualificationResponsePartnersType qualificationResponsePartners;
    @XmlElement(name = "QualificationResponseDetails", required = true)
    protected QualificationResponseDetailsType qualificationResponseDetails;

    /**
     * Gets the value of the qualificationResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link QualificationResponsePropertiesType }
     *     
     */
    public QualificationResponsePropertiesType getQualificationResponseProperties() {
        return qualificationResponseProperties;
    }

    /**
     * Sets the value of the qualificationResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualificationResponsePropertiesType }
     *     
     */
    public void setQualificationResponseProperties(QualificationResponsePropertiesType value) {
        this.qualificationResponseProperties = value;
    }

    /**
     * Gets the value of the qualificationResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link QualificationResponsePartnersType }
     *     
     */
    public QualificationResponsePartnersType getQualificationResponsePartners() {
        return qualificationResponsePartners;
    }

    /**
     * Sets the value of the qualificationResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualificationResponsePartnersType }
     *     
     */
    public void setQualificationResponsePartners(QualificationResponsePartnersType value) {
        this.qualificationResponsePartners = value;
    }

    /**
     * Gets the value of the qualificationResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link QualificationResponseDetailsType }
     *     
     */
    public QualificationResponseDetailsType getQualificationResponseDetails() {
        return qualificationResponseDetails;
    }

    /**
     * Sets the value of the qualificationResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualificationResponseDetailsType }
     *     
     */
    public void setQualificationResponseDetails(QualificationResponseDetailsType value) {
        this.qualificationResponseDetails = value;
    }

}

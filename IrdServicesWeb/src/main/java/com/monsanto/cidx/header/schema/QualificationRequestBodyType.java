
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualificationRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualificationRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}QualificationRequestProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}QualificationRequestPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}QualificationRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualificationRequestBodyType", propOrder = {
    "qualificationRequestProperties",
    "qualificationRequestPartners",
    "qualificationRequestDetails"
})
public class QualificationRequestBodyType {

    @XmlElement(name = "QualificationRequestProperties", required = true)
    protected QualificationRequestPropertiesType qualificationRequestProperties;
    @XmlElement(name = "QualificationRequestPartners", required = true)
    protected QualificationRequestPartnersType qualificationRequestPartners;
    @XmlElement(name = "QualificationRequestDetails", required = true)
    protected QualificationRequestDetailsType qualificationRequestDetails;

    /**
     * Gets the value of the qualificationRequestProperties property.
     * 
     * @return
     *     possible object is
     *     {@link QualificationRequestPropertiesType }
     *     
     */
    public QualificationRequestPropertiesType getQualificationRequestProperties() {
        return qualificationRequestProperties;
    }

    /**
     * Sets the value of the qualificationRequestProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualificationRequestPropertiesType }
     *     
     */
    public void setQualificationRequestProperties(QualificationRequestPropertiesType value) {
        this.qualificationRequestProperties = value;
    }

    /**
     * Gets the value of the qualificationRequestPartners property.
     * 
     * @return
     *     possible object is
     *     {@link QualificationRequestPartnersType }
     *     
     */
    public QualificationRequestPartnersType getQualificationRequestPartners() {
        return qualificationRequestPartners;
    }

    /**
     * Sets the value of the qualificationRequestPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualificationRequestPartnersType }
     *     
     */
    public void setQualificationRequestPartners(QualificationRequestPartnersType value) {
        this.qualificationRequestPartners = value;
    }

    /**
     * Gets the value of the qualificationRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link QualificationRequestDetailsType }
     *     
     */
    public QualificationRequestDetailsType getQualificationRequestDetails() {
        return qualificationRequestDetails;
    }

    /**
     * Sets the value of the qualificationRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualificationRequestDetailsType }
     *     
     */
    public void setQualificationRequestDetails(QualificationRequestDetailsType value) {
        this.qualificationRequestDetails = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificateOfAnalysisBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateOfAnalysisBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CertificateOfAnalysisProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CertificateOfAnalysisPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CertificateOfAnalysisDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateOfAnalysisBodyType", propOrder = {
    "certificateOfAnalysisProperties",
    "certificateOfAnalysisPartners",
    "certificateOfAnalysisDetails"
})
public class CertificateOfAnalysisBodyType {

    @XmlElement(name = "CertificateOfAnalysisProperties", required = true)
    protected CertificateOfAnalysisPropertiesType certificateOfAnalysisProperties;
    @XmlElement(name = "CertificateOfAnalysisPartners", required = true)
    protected CertificateOfAnalysisPartnersType certificateOfAnalysisPartners;
    @XmlElement(name = "CertificateOfAnalysisDetails", required = true)
    protected CertificateOfAnalysisDetailsType certificateOfAnalysisDetails;

    /**
     * Gets the value of the certificateOfAnalysisProperties property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateOfAnalysisPropertiesType }
     *     
     */
    public CertificateOfAnalysisPropertiesType getCertificateOfAnalysisProperties() {
        return certificateOfAnalysisProperties;
    }

    /**
     * Sets the value of the certificateOfAnalysisProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateOfAnalysisPropertiesType }
     *     
     */
    public void setCertificateOfAnalysisProperties(CertificateOfAnalysisPropertiesType value) {
        this.certificateOfAnalysisProperties = value;
    }

    /**
     * Gets the value of the certificateOfAnalysisPartners property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateOfAnalysisPartnersType }
     *     
     */
    public CertificateOfAnalysisPartnersType getCertificateOfAnalysisPartners() {
        return certificateOfAnalysisPartners;
    }

    /**
     * Sets the value of the certificateOfAnalysisPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateOfAnalysisPartnersType }
     *     
     */
    public void setCertificateOfAnalysisPartners(CertificateOfAnalysisPartnersType value) {
        this.certificateOfAnalysisPartners = value;
    }

    /**
     * Gets the value of the certificateOfAnalysisDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateOfAnalysisDetailsType }
     *     
     */
    public CertificateOfAnalysisDetailsType getCertificateOfAnalysisDetails() {
        return certificateOfAnalysisDetails;
    }

    /**
     * Sets the value of the certificateOfAnalysisDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateOfAnalysisDetailsType }
     *     
     */
    public void setCertificateOfAnalysisDetails(CertificateOfAnalysisDetailsType value) {
        this.certificateOfAnalysisDetails = value;
    }

}

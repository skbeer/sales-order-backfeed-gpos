
package com.monsanto.irdsoapservices.agreementstatuspartners.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgreementStatusResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementStatusResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgreementStatusResponsePartners" type="{urn:cidx:names:specification:ces:schema:all:5:3}AgreementStatusResponsePartnersType"/>
 *         &lt;element name="AgreementStatusResponseProperties" type="{urn:cidx:names:specification:ces:schema:all:5:3}AgreementStatusResponsePropertiesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementStatusResponseBodyType", propOrder = {
    "agreementStatusResponsePartners",
    "agreementStatusResponseProperties"
})
public class AgreementStatusResponseBodyType {

    @XmlElement(name = "AgreementStatusResponsePartners", required = true)
    protected AgreementStatusResponsePartnersType agreementStatusResponsePartners;
    @XmlElement(name = "AgreementStatusResponseProperties", required = true)
    protected AgreementStatusResponsePropertiesType agreementStatusResponseProperties;

    /**
     * Gets the value of the agreementStatusResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementStatusResponsePartnersType }
     *     
     */
    public AgreementStatusResponsePartnersType getAgreementStatusResponsePartners() {
        return agreementStatusResponsePartners;
    }

    /**
     * Sets the value of the agreementStatusResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementStatusResponsePartnersType }
     *     
     */
    public void setAgreementStatusResponsePartners(AgreementStatusResponsePartnersType value) {
        this.agreementStatusResponsePartners = value;
    }

    /**
     * Gets the value of the agreementStatusResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementStatusResponsePropertiesType }
     *     
     */
    public AgreementStatusResponsePropertiesType getAgreementStatusResponseProperties() {
        return agreementStatusResponseProperties;
    }

    /**
     * Sets the value of the agreementStatusResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementStatusResponsePropertiesType }
     *     
     */
    public void setAgreementStatusResponseProperties(AgreementStatusResponsePropertiesType value) {
        this.agreementStatusResponseProperties = value;
    }

}

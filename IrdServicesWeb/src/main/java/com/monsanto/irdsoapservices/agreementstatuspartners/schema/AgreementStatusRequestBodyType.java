
package com.monsanto.irdsoapservices.agreementstatuspartners.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgreementStatusRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementStatusRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgreementStatusRequestPartners" type="{urn:cidx:names:specification:ces:schema:all:5:3}AgreementStatusRequestPartnersType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementStatusRequestBodyType", propOrder = {
    "agreementStatusRequestPartners"
})
public class AgreementStatusRequestBodyType {

    @XmlElement(name = "AgreementStatusRequestPartners", required = true)
    protected AgreementStatusRequestPartnersType agreementStatusRequestPartners;

    /**
     * Gets the value of the agreementStatusRequestPartners property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementStatusRequestPartnersType }
     *     
     */
    public AgreementStatusRequestPartnersType getAgreementStatusRequestPartners() {
        return agreementStatusRequestPartners;
    }

    /**
     * Sets the value of the agreementStatusRequestPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementStatusRequestPartnersType }
     *     
     */
    public void setAgreementStatusRequestPartners(AgreementStatusRequestPartnersType value) {
        this.agreementStatusRequestPartners = value;
    }

}


package com.monsanto.irdsoapservices.agreements.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSignersForAgreementsRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSignersForAgreementsRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sendOnlyUnexpiredAgreement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AgreementCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSignersForAgreementsRequestBodyType", propOrder = {
    "sendOnlyUnexpiredAgreement",
    "agreementCode"
})
public class GetSignersForAgreementsRequestBodyType {

    protected Boolean sendOnlyUnexpiredAgreement;
    @XmlElement(name = "AgreementCode", required = true)
    protected String agreementCode;

    /**
     * Gets the value of the sendOnlyUnexpiredAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendOnlyUnexpiredAgreement() {
        return sendOnlyUnexpiredAgreement;
    }

    /**
     * Sets the value of the sendOnlyUnexpiredAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendOnlyUnexpiredAgreement(Boolean value) {
        this.sendOnlyUnexpiredAgreement = value;
    }

    /**
     * Gets the value of the agreementCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementCode() {
        return agreementCode;
    }

    /**
     * Sets the value of the agreementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementCode(String value) {
        this.agreementCode = value;
    }

}

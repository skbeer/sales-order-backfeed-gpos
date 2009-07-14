
package com.monsanto.irdsoapservices.agreements.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAgreementsRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAgreementsRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="AccountIdentifier" type="{urn:monsanto:ird:services:account:agreement}AccountIdentifierType"/>
 *           &lt;element name="SignerAccountIdentifier" type="{urn:monsanto:ird:services:account:agreement}AccountIdentifierType"/>
 *         &lt;/choice>
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
@XmlType(name = "GetAgreementsRequestBodyType", propOrder = {
    "accountIdentifier",
    "signerAccountIdentifier",
    "agreementCode"
})
public class GetAgreementsRequestBodyType {

    @XmlElement(name = "AccountIdentifier")
    protected AccountIdentifierType accountIdentifier;
    @XmlElement(name = "SignerAccountIdentifier")
    protected AccountIdentifierType signerAccountIdentifier;
    @XmlElement(name = "AgreementCode", required = true)
    protected String agreementCode;

    /**
     * Gets the value of the accountIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentifierType }
     *     
     */
    public AccountIdentifierType getAccountIdentifier() {
        return accountIdentifier;
    }

    /**
     * Sets the value of the accountIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentifierType }
     *     
     */
    public void setAccountIdentifier(AccountIdentifierType value) {
        this.accountIdentifier = value;
    }

    /**
     * Gets the value of the signerAccountIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentifierType }
     *     
     */
    public AccountIdentifierType getSignerAccountIdentifier() {
        return signerAccountIdentifier;
    }

    /**
     * Sets the value of the signerAccountIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentifierType }
     *     
     */
    public void setSignerAccountIdentifier(AccountIdentifierType value) {
        this.signerAccountIdentifier = value;
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

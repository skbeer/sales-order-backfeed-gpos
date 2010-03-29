
package com.monsanto.irdsoapservices.agreements.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignerInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignerInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignerAccountIdentifier" type="{urn:monsanto:ird:services:account:agreement}AccountIdentifierType"/>
 *         &lt;element name="SignerAliasIdentifier" type="{urn:monsanto:ird:services:account:agreement}AccountIdentifierType"/>
 *         &lt;element name="SignerAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AddressInformation" type="{urn:monsanto:ird:services:account:agreement}AddressInformationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignerInformationType", propOrder = {
    "signerAccountIdentifier",
    "signerAliasIdentifier",
    "signerAccountName",
    "addressInformation"
})
public class SignerInformationType {

    @XmlElement(name = "SignerAccountIdentifier", required = true)
    protected AccountIdentifierType signerAccountIdentifier;
    @XmlElement(name = "SignerAliasIdentifier", required = true)
    protected AccountIdentifierType signerAliasIdentifier;
    @XmlElement(name = "SignerAccountName", required = true)
    protected String signerAccountName;
    @XmlElement(name = "AddressInformation", required = true)
    protected AddressInformationType addressInformation;

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
     * Gets the value of the signerAliasIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentifierType }
     *     
     */
    public AccountIdentifierType getSignerAliasIdentifier() {
        return signerAliasIdentifier;
    }

    /**
     * Sets the value of the signerAliasIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentifierType }
     *     
     */
    public void setSignerAliasIdentifier(AccountIdentifierType value) {
        this.signerAliasIdentifier = value;
    }

    /**
     * Gets the value of the signerAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignerAccountName() {
        return signerAccountName;
    }

    /**
     * Sets the value of the signerAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignerAccountName(String value) {
        this.signerAccountName = value;
    }

    /**
     * Gets the value of the addressInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInformationType }
     *     
     */
    public AddressInformationType getAddressInformation() {
        return addressInformation;
    }

    /**
     * Sets the value of the addressInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInformationType }
     *     
     */
    public void setAddressInformation(AddressInformationType value) {
        this.addressInformation = value;
    }

}


package com.monsanto.irdsoapservices.agreements.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAgreementHierarchyRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAgreementHierarchyRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AgreementLicensedBy" type="{urn:monsanto:ird:services:account:agreement}LicensedByType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAgreementHierarchyRequestBodyType", propOrder = {
    "accountId",
    "agreementLicensedBy"
})
public class GetAgreementHierarchyRequestBodyType {

    @XmlElement(name = "AccountId")
    protected long accountId;
    @XmlElement(name = "AgreementLicensedBy", required = true)
    protected LicensedByType agreementLicensedBy;

    /**
     * Gets the value of the accountId property.
     * 
     */
    public long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     */
    public void setAccountId(long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the agreementLicensedBy property.
     * 
     * @return
     *     possible object is
     *     {@link LicensedByType }
     *     
     */
    public LicensedByType getAgreementLicensedBy() {
        return agreementLicensedBy;
    }

    /**
     * Sets the value of the agreementLicensedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicensedByType }
     *     
     */
    public void setAgreementLicensedBy(LicensedByType value) {
        this.agreementLicensedBy = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CostSupportResponseStatusInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostSupportResponseStatusInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Status"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportAgreementNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ExpirationDate" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContactInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}StatusReason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostSupportResponseStatusInformationType", propOrder = {
    "status",
    "costSupportAgreementNumber",
    "expirationDate",
    "contactInformation",
    "statusReason"
})
public class CostSupportResponseStatusInformationType {

    @XmlElement(name = "Status", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;
    @XmlElement(name = "CostSupportAgreementNumber")
    protected CostSupportAgreementNumberType costSupportAgreementNumber;
    @XmlElement(name = "ExpirationDate")
    protected ExpirationDateType expirationDate;
    @XmlElement(name = "ContactInformation")
    protected ContactInformationType contactInformation;
    @XmlElement(name = "StatusReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String statusReason;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the costSupportAgreementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportAgreementNumberType }
     *     
     */
    public CostSupportAgreementNumberType getCostSupportAgreementNumber() {
        return costSupportAgreementNumber;
    }

    /**
     * Sets the value of the costSupportAgreementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportAgreementNumberType }
     *     
     */
    public void setCostSupportAgreementNumber(CostSupportAgreementNumberType value) {
        this.costSupportAgreementNumber = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link ExpirationDateType }
     *     
     */
    public ExpirationDateType getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpirationDateType }
     *     
     */
    public void setExpirationDate(ExpirationDateType value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the contactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationType }
     *     
     */
    public ContactInformationType getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the value of the contactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationType }
     *     
     */
    public void setContactInformation(ContactInformationType value) {
        this.contactInformation = value;
    }

    /**
     * Gets the value of the statusReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * Sets the value of the statusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusReason(String value) {
        this.statusReason = value;
    }

}

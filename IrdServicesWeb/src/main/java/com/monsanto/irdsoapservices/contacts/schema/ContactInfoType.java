
package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ContactFunctionList" type="{urn:monsanto:ird:services:contacts}ContactFunctionListType" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhoneNumberList" type="{urn:monsanto:ird:services:contacts}ContactPhoneNumberListType"/>
 *         &lt;element name="EmailAddressList" type="{urn:monsanto:ird:services:contacts}EmailAddressListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoType", propOrder = {
    "contactId",
    "contactFunctionList",
    "firstName",
    "lastName",
    "jobTitle",
    "phoneNumberList",
    "emailAddressList"
})
public class ContactInfoType {

    @XmlElement(name = "ContactId")
    protected long contactId;
    @XmlElement(name = "ContactFunctionList")
    protected ContactFunctionListType contactFunctionList;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "JobTitle", required = true)
    protected String jobTitle;
    @XmlElement(name = "PhoneNumberList", required = true)
    protected ContactPhoneNumberListType phoneNumberList;
    @XmlElement(name = "EmailAddressList", required = true)
    protected EmailAddressListType emailAddressList;

    /**
     * Gets the value of the contactId property.
     * 
     */
    public long getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     */
    public void setContactId(long value) {
        this.contactId = value;
    }

    /**
     * Gets the value of the contactFunctionList property.
     * 
     * @return
     *     possible object is
     *     {@link ContactFunctionListType }
     *     
     */
    public ContactFunctionListType getContactFunctionList() {
        return contactFunctionList;
    }

    /**
     * Sets the value of the contactFunctionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactFunctionListType }
     *     
     */
    public void setContactFunctionList(ContactFunctionListType value) {
        this.contactFunctionList = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the phoneNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPhoneNumberListType }
     *     
     */
    public ContactPhoneNumberListType getPhoneNumberList() {
        return phoneNumberList;
    }

    /**
     * Sets the value of the phoneNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPhoneNumberListType }
     *     
     */
    public void setPhoneNumberList(ContactPhoneNumberListType value) {
        this.phoneNumberList = value;
    }

    /**
     * Gets the value of the emailAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressListType }
     *     
     */
    public EmailAddressListType getEmailAddressList() {
        return emailAddressList;
    }

    /**
     * Sets the value of the emailAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressListType }
     *     
     */
    public void setEmailAddressList(EmailAddressListType value) {
        this.emailAddressList = value;
    }

}

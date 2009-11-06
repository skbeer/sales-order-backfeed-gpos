
package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertContactInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertContactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactFunction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "InsertContactInfoType", propOrder = {
    "contactFunction",
    "firstName",
    "lastName",
    "jobTitle",
    "phoneNumberList",
    "emailAddressList"
})
public class InsertContactInfoType {

    @XmlElement(name = "ContactFunction", required = true)
    protected String contactFunction;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "JobTitle")
    protected String jobTitle;
    @XmlElement(name = "PhoneNumberList", required = true)
    protected ContactPhoneNumberListType phoneNumberList;
    @XmlElement(name = "EmailAddressList", required = true)
    protected EmailAddressListType emailAddressList;

    /**
     * Gets the value of the contactFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFunction() {
        return contactFunction;
    }

    /**
     * Sets the value of the contactFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFunction(String value) {
        this.contactFunction = value;
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

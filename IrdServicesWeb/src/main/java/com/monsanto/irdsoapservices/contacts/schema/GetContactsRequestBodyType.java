
package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetContactsRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetContactsRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *           &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;/choice>
 *         &lt;element name="ContactFunctionList" type="{urn:monsanto:ird:services:contacts}ContactFunctionListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetContactsRequestBodyType", propOrder = {
    "accountId",
    "contactId",
    "contactFunctionList"
})
public class GetContactsRequestBodyType {

    @XmlElement(name = "AccountId")
    protected Long accountId;
    @XmlElement(name = "ContactId")
    protected Long contactId;
    @XmlElement(name = "ContactFunctionList")
    protected ContactFunctionListType contactFunctionList;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountId(Long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactId(Long value) {
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

}

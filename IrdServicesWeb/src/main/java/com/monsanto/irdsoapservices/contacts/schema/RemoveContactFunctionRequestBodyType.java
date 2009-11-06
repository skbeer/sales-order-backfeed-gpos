
package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveContactFunctionRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveContactFunctionRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ContactFunctionList" type="{urn:monsanto:ird:services:contacts}ContactFunctionListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveContactFunctionRequestBodyType", propOrder = {
    "accountId",
    "contactId",
    "contactFunctionList"
})
public class RemoveContactFunctionRequestBodyType {

    @XmlElement(name = "AccountId")
    protected long accountId;
    @XmlElement(name = "ContactId")
    protected long contactId;
    @XmlElement(name = "ContactFunctionList", required = true)
    protected ContactFunctionListType contactFunctionList;

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

}

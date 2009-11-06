
package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertContactRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertContactRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ContactList" type="{urn:monsanto:ird:services:contacts}InsertContactListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertContactRequestBodyType", propOrder = {
    "accountId",
    "contactList"
})
public class InsertContactRequestBodyType {

    @XmlElement(name = "AccountId")
    protected long accountId;
    @XmlElement(name = "ContactList", required = true)
    protected InsertContactListType contactList;

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
     * Gets the value of the contactList property.
     * 
     * @return
     *     possible object is
     *     {@link InsertContactListType }
     *     
     */
    public InsertContactListType getContactList() {
        return contactList;
    }

    /**
     * Sets the value of the contactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertContactListType }
     *     
     */
    public void setContactList(InsertContactListType value) {
        this.contactList = value;
    }

}

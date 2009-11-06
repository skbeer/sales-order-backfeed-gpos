
package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateContactsRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateContactsRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ContactList" type="{urn:monsanto:ird:services:contacts}PersistableContactListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateContactsRequestBodyType", propOrder = {
    "accountId",
    "contactList"
})
public class UpdateContactsRequestBodyType {

    @XmlElement(name = "AccountId")
    protected long accountId;
    @XmlElement(name = "ContactList", required = true)
    protected PersistableContactListType contactList;

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
     *     {@link PersistableContactListType }
     *     
     */
    public PersistableContactListType getContactList() {
        return contactList;
    }

    /**
     * Sets the value of the contactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersistableContactListType }
     *     
     */
    public void setContactList(PersistableContactListType value) {
        this.contactList = value;
    }

}

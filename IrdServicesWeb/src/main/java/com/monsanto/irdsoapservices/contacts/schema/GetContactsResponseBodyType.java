
package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetContactsResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetContactsResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactList" type="{urn:monsanto:ird:services:contacts}ContactListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetContactsResponseBodyType", propOrder = {
    "contactList"
})
public class GetContactsResponseBodyType {

    @XmlElement(name = "ContactList", required = true)
    protected ContactListType contactList;

    /**
     * Gets the value of the contactList property.
     * 
     * @return
     *     possible object is
     *     {@link ContactListType }
     *     
     */
    public ContactListType getContactList() {
        return contactList;
    }

    /**
     * Sets the value of the contactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactListType }
     *     
     */
    public void setContactList(ContactListType value) {
        this.contactList = value;
    }

}

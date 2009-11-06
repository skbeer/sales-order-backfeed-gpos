
package com.monsanto.irdsoapservices.contacts.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactPhoneNumberListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactPhoneNumberListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactPhoneNumber" type="{urn:monsanto:ird:services:contacts}ContactPhoneNumberType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactPhoneNumberListType", propOrder = {
    "contactPhoneNumber"
})
public class ContactPhoneNumberListType {

    @XmlElement(name = "ContactPhoneNumber")
    protected List<ContactPhoneNumberType> contactPhoneNumber;

    /**
     * Gets the value of the contactPhoneNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPhoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPhoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPhoneNumberType }
     * 
     * 
     */
    public List<ContactPhoneNumberType> getContactPhoneNumber() {
        if (contactPhoneNumber == null) {
            contactPhoneNumber = new ArrayList<ContactPhoneNumberType>();
        }
        return this.contactPhoneNumber;
    }

}

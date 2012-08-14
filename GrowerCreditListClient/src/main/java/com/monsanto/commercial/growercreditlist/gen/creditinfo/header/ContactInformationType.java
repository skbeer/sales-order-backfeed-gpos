
package com.monsanto.commercial.growercreditlist.gen.creditinfo.header;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}ContactName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}ContactDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}ContactPhoneNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}EmailAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInformationType", propOrder = {
    "contactName",
    "contactDescription",
    "contactPhoneNumber",
    "emailAddress"
})
public class ContactInformationType {

    @XmlElement(name = "ContactName")
    protected List<String> contactName;
    @XmlElement(name = "ContactDescription")
    protected List<String> contactDescription;
    @XmlElement(name = "ContactPhoneNumber")
    protected List<String> contactPhoneNumber;
    @XmlElement(name = "EmailAddress")
    protected List<String> emailAddress;

    /**
     * Gets the value of the contactName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContactName() {
        if (contactName == null) {
            contactName = new ArrayList<String>();
        }
        return this.contactName;
    }

    /**
     * Gets the value of the contactDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContactDescription() {
        if (contactDescription == null) {
            contactDescription = new ArrayList<String>();
        }
        return this.contactDescription;
    }

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
     * {@link String }
     * 
     * 
     */
    public List<String> getContactPhoneNumber() {
        if (contactPhoneNumber == null) {
            contactPhoneNumber = new ArrayList<String>();
        }
        return this.contactPhoneNumber;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmailAddress() {
        if (emailAddress == null) {
            emailAddress = new ArrayList<String>();
        }
        return this.emailAddress;
    }

}

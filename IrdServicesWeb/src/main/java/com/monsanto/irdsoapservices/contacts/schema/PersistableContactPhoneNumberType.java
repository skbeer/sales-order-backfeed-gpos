
package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PersistableContactPhoneNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersistableContactPhoneNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Action" type="{urn:monsanto:ird:services:contacts}DatabaseActionType"/>
 *         &lt;element name="Type" type="{urn:monsanto:ird:services:contacts}PhoneNumberEnumType"/>
 *         &lt;element name="PhoneNumber" type="{urn:monsanto:ird:services:contacts}PhoneNumberType" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersistableContactPhoneNumberType", propOrder = {
    "action",
    "type",
    "phoneNumber",
    "extension"
})
public class PersistableContactPhoneNumberType {

    @XmlElement(name = "Action", required = true)
    protected DatabaseActionType action;
    @XmlElement(name = "Type", required = true)
    protected PhoneNumberEnumType type;
    @XmlElement(name = "PhoneNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String phoneNumber;
    @XmlElement(name = "Extension")
    protected String extension;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseActionType }
     *     
     */
    public DatabaseActionType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseActionType }
     *     
     */
    public void setAction(DatabaseActionType value) {
        this.action = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberEnumType }
     *     
     */
    public PhoneNumberEnumType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberEnumType }
     *     
     */
    public void setType(PhoneNumberEnumType value) {
        this.type = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

}


package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersistableContactEmailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersistableContactEmailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Action" type="{urn:monsanto:ird:services:contacts}DatabaseActionType"/>
 *         &lt;element name="Type" type="{urn:monsanto:ird:services:contacts}EmailEnumType"/>
 *         &lt;element name="Value" type="{urn:monsanto:ird:services:contacts}EmailAddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersistableContactEmailType", propOrder = {
    "action",
    "type",
    "value"
})
public class PersistableContactEmailType {

    @XmlElement(name = "Action", required = true)
    protected DatabaseActionType action;
    @XmlElement(name = "Type", required = true)
    protected EmailEnumType type;
    @XmlElement(name = "Value")
    protected String value;

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
     *     {@link EmailEnumType }
     *     
     */
    public EmailEnumType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailEnumType }
     *     
     */
    public void setType(EmailEnumType value) {
        this.type = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}

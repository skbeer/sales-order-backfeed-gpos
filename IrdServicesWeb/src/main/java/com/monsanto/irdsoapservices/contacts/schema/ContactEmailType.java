
package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactEmailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactEmailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{urn:monsanto:ird:services:contacts}EmailEnumType"/>
 *         &lt;element name="Value" type="{urn:monsanto:ird:services:contacts}EmailAddressType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactEmailType", propOrder = {
    "type",
    "value"
})
public class ContactEmailType {

    @XmlElement(name = "Type", required = true)
    protected EmailEnumType type;
    @XmlElement(name = "Value", required = true)
    protected String value;

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


package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for AddContactFunctionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddContactFunctionRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="AddContactFunctionRequestBody" type="{urn:monsanto:ird:services:contacts}AddContactFunctionRequestBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddContactFunctionRequestType", propOrder = {
    "header",
    "addContactFunctionRequestBody"
})
public class AddContactFunctionRequestType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "AddContactFunctionRequestBody", required = true)
    protected AddContactFunctionRequestBodyType addContactFunctionRequestBody;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the addContactFunctionRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link AddContactFunctionRequestBodyType }
     *     
     */
    public AddContactFunctionRequestBodyType getAddContactFunctionRequestBody() {
        return addContactFunctionRequestBody;
    }

    /**
     * Sets the value of the addContactFunctionRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddContactFunctionRequestBodyType }
     *     
     */
    public void setAddContactFunctionRequestBody(AddContactFunctionRequestBodyType value) {
        this.addContactFunctionRequestBody = value;
    }

}
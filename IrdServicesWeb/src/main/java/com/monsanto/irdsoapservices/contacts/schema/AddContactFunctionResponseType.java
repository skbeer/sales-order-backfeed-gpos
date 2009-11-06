
package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for AddContactFunctionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddContactFunctionResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="AddContactFunctionResponseBody" type="{urn:monsanto:ird:services:contacts}SuccessResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddContactFunctionResponseType", propOrder = {
    "header",
    "addContactFunctionResponseBody"
})
public class AddContactFunctionResponseType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "AddContactFunctionResponseBody", required = true)
    protected SuccessResponseType addContactFunctionResponseBody;

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
     * Gets the value of the addContactFunctionResponseBody property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessResponseType }
     *     
     */
    public SuccessResponseType getAddContactFunctionResponseBody() {
        return addContactFunctionResponseBody;
    }

    /**
     * Sets the value of the addContactFunctionResponseBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessResponseType }
     *     
     */
    public void setAddContactFunctionResponseBody(SuccessResponseType value) {
        this.addContactFunctionResponseBody = value;
    }

}

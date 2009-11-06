
package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for UpdateContactsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateContactsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="UpdateContactsRequestBody" type="{urn:monsanto:ird:services:contacts}UpdateContactsRequestBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateContactsRequestType", propOrder = {
    "header",
    "updateContactsRequestBody"
})
public class UpdateContactsRequestType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "UpdateContactsRequestBody", required = true)
    protected UpdateContactsRequestBodyType updateContactsRequestBody;

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
     * Gets the value of the updateContactsRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateContactsRequestBodyType }
     *     
     */
    public UpdateContactsRequestBodyType getUpdateContactsRequestBody() {
        return updateContactsRequestBody;
    }

    /**
     * Sets the value of the updateContactsRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateContactsRequestBodyType }
     *     
     */
    public void setUpdateContactsRequestBody(UpdateContactsRequestBodyType value) {
        this.updateContactsRequestBody = value;
    }

}

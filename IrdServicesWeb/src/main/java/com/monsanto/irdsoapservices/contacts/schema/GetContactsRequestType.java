
package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for GetContactsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetContactsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="GetContactsRequestBody" type="{urn:monsanto:ird:services:contacts}GetContactsRequestBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetContactsRequestType", propOrder = {
    "header",
    "getContactsRequestBody"
})
public class GetContactsRequestType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "GetContactsRequestBody", required = true)
    protected GetContactsRequestBodyType getContactsRequestBody;

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
     * Gets the value of the getContactsRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link GetContactsRequestBodyType }
     *     
     */
    public GetContactsRequestBodyType getGetContactsRequestBody() {
        return getContactsRequestBody;
    }

    /**
     * Sets the value of the getContactsRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetContactsRequestBodyType }
     *     
     */
    public void setGetContactsRequestBody(GetContactsRequestBodyType value) {
        this.getContactsRequestBody = value;
    }

}

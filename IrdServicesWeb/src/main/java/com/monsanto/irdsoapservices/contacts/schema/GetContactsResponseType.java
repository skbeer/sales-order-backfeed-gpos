
package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for GetContactsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetContactsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="GetContactsResponseBody" type="{urn:monsanto:ird:services:contacts}GetContactsResponseBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetContactsResponseType", propOrder = {
    "header",
    "getContactsResponseBody"
})
public class GetContactsResponseType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "GetContactsResponseBody", required = true)
    protected GetContactsResponseBodyType getContactsResponseBody;

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
     * Gets the value of the getContactsResponseBody property.
     * 
     * @return
     *     possible object is
     *     {@link GetContactsResponseBodyType }
     *     
     */
    public GetContactsResponseBodyType getGetContactsResponseBody() {
        return getContactsResponseBody;
    }

    /**
     * Sets the value of the getContactsResponseBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetContactsResponseBodyType }
     *     
     */
    public void setGetContactsResponseBody(GetContactsResponseBodyType value) {
        this.getContactsResponseBody = value;
    }

}

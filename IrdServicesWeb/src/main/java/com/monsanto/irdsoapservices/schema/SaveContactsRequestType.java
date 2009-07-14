
package com.monsanto.irdsoapservices.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for SaveContactsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveContactsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="SaveContactsRequestBody" type="{urn:monsanto:ird:services:account:information}SaveContactsRequestBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveContactsRequestType", propOrder = {
    "header",
    "saveContactsRequestBody"
})
public class SaveContactsRequestType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "SaveContactsRequestBody", required = true)
    protected SaveContactsRequestBodyType saveContactsRequestBody;

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
     * Gets the value of the saveContactsRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link SaveContactsRequestBodyType }
     *     
     */
    public SaveContactsRequestBodyType getSaveContactsRequestBody() {
        return saveContactsRequestBody;
    }

    /**
     * Sets the value of the saveContactsRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveContactsRequestBodyType }
     *     
     */
    public void setSaveContactsRequestBody(SaveContactsRequestBodyType value) {
        this.saveContactsRequestBody = value;
    }

}

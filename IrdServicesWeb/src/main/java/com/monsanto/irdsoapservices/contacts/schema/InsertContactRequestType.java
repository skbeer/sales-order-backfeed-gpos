
package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for InsertContactRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertContactRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="InsertContactRequestBody" type="{urn:monsanto:ird:services:contacts}InsertContactRequestBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertContactRequestType", propOrder = {
    "header",
    "insertContactRequestBody"
})
public class InsertContactRequestType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "InsertContactRequestBody", required = true)
    protected InsertContactRequestBodyType insertContactRequestBody;

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
     * Gets the value of the insertContactRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link InsertContactRequestBodyType }
     *     
     */
    public InsertContactRequestBodyType getInsertContactRequestBody() {
        return insertContactRequestBody;
    }

    /**
     * Sets the value of the insertContactRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertContactRequestBodyType }
     *     
     */
    public void setInsertContactRequestBody(InsertContactRequestBodyType value) {
        this.insertContactRequestBody = value;
    }

}


package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for RemoveContactFunctionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveContactFunctionRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="RemoveContactFunctionRequestBody" type="{urn:monsanto:ird:services:contacts}RemoveContactFunctionRequestBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveContactFunctionRequestType", propOrder = {
    "header",
    "removeContactFunctionRequestBody"
})
public class RemoveContactFunctionRequestType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "RemoveContactFunctionRequestBody", required = true)
    protected RemoveContactFunctionRequestBodyType removeContactFunctionRequestBody;

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
     * Gets the value of the removeContactFunctionRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link RemoveContactFunctionRequestBodyType }
     *     
     */
    public RemoveContactFunctionRequestBodyType getRemoveContactFunctionRequestBody() {
        return removeContactFunctionRequestBody;
    }

    /**
     * Sets the value of the removeContactFunctionRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoveContactFunctionRequestBodyType }
     *     
     */
    public void setRemoveContactFunctionRequestBody(RemoveContactFunctionRequestBodyType value) {
        this.removeContactFunctionRequestBody = value;
    }

}

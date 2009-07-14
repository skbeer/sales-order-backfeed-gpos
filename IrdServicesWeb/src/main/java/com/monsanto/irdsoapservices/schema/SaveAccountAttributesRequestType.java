
package com.monsanto.irdsoapservices.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for SaveAccountAttributesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveAccountAttributesRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="SaveAccountAttributesRequestBody" type="{urn:monsanto:ird:services:account:information}SaveAccountAttributesRequestBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveAccountAttributesRequestType", propOrder = {
    "header",
    "saveAccountAttributesRequestBody"
})
public class SaveAccountAttributesRequestType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "SaveAccountAttributesRequestBody", required = true)
    protected SaveAccountAttributesRequestBodyType saveAccountAttributesRequestBody;

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
     * Gets the value of the saveAccountAttributesRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link SaveAccountAttributesRequestBodyType }
     *     
     */
    public SaveAccountAttributesRequestBodyType getSaveAccountAttributesRequestBody() {
        return saveAccountAttributesRequestBody;
    }

    /**
     * Sets the value of the saveAccountAttributesRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveAccountAttributesRequestBodyType }
     *     
     */
    public void setSaveAccountAttributesRequestBody(SaveAccountAttributesRequestBodyType value) {
        this.saveAccountAttributesRequestBody = value;
    }

}

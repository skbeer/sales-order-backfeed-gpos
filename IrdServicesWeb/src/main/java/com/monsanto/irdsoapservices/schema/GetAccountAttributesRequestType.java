package com.monsanto.irdsoapservices.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for GetAccountAttributesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccountAttributesRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="GetAccountAttributesRequestBody" type="{urn:monsanto:ird:services:account:information}GetAccountAttributesRequestBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountAttributesRequestType", propOrder = {
    "header",
    "getAccountAttributesRequestBody"
})
public class GetAccountAttributesRequestType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "GetAccountAttributesRequestBody", required = true)
    protected GetAccountAttributesRequestBodyType getAccountAttributesRequestBody;

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
     * Gets the value of the getAccountAttributesRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccountAttributesRequestBodyType }
     *     
     */
    public GetAccountAttributesRequestBodyType getGetAccountAttributesRequestBody() {
        return getAccountAttributesRequestBody;
    }

    /**
     * Sets the value of the getAccountAttributesRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccountAttributesRequestBodyType }
     *     
     */
    public void setGetAccountAttributesRequestBody(GetAccountAttributesRequestBodyType value) {
        this.getAccountAttributesRequestBody = value;
    }

}

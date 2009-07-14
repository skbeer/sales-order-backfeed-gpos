
package com.monsanto.irdsoapservices.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for GetAccountDetailsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccountDetailsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="GetAccountDetailsRequestBody" type="{urn:monsanto:ird:services:account:information}GetAccountDetailsRequestBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountDetailsRequestType", propOrder = {
    "header",
    "getAccountDetailsRequestBody"
})
public class GetAccountDetailsRequestType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "GetAccountDetailsRequestBody", required = true)
    protected GetAccountDetailsRequestBodyType getAccountDetailsRequestBody;

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
     * Gets the value of the getAccountDetailsRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccountDetailsRequestBodyType }
     *     
     */
    public GetAccountDetailsRequestBodyType getGetAccountDetailsRequestBody() {
        return getAccountDetailsRequestBody;
    }

    /**
     * Sets the value of the getAccountDetailsRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccountDetailsRequestBodyType }
     *     
     */
    public void setGetAccountDetailsRequestBody(GetAccountDetailsRequestBodyType value) {
        this.getAccountDetailsRequestBody = value;
    }

}

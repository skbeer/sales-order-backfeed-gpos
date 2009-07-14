
package com.monsanto.irdsoapservices.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for GetAccountAttributesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccountAttributesResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="GetAccountAttributesResponseBody" type="{urn:monsanto:ird:services:account:information}GetAccountAttributesResponseBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountAttributesResponseType", propOrder = {
    "header",
    "getAccountAttributesResponseBody"
})
public class GetAccountAttributesResponseType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "GetAccountAttributesResponseBody", required = true)
    protected GetAccountAttributesResponseBodyType getAccountAttributesResponseBody;

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
     * Gets the value of the getAccountAttributesResponseBody property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccountAttributesResponseBodyType }
     *     
     */
    public GetAccountAttributesResponseBodyType getGetAccountAttributesResponseBody() {
        return getAccountAttributesResponseBody;
    }

    /**
     * Sets the value of the getAccountAttributesResponseBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccountAttributesResponseBodyType }
     *     
     */
    public void setGetAccountAttributesResponseBody(GetAccountAttributesResponseBodyType value) {
        this.getAccountAttributesResponseBody = value;
    }

}

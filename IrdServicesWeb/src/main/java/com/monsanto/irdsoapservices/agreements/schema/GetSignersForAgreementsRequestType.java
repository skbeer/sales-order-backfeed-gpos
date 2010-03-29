
package com.monsanto.irdsoapservices.agreements.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for GetSignersForAgreementsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSignersForAgreementsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="GetSignersForAgreementsRequestBody" type="{urn:monsanto:ird:services:account:agreement}GetSignersForAgreementsRequestBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSignersForAgreementsRequestType", propOrder = {
    "header",
    "getSignersForAgreementsRequestBody"
})
public class GetSignersForAgreementsRequestType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "GetSignersForAgreementsRequestBody", required = true)
    protected GetSignersForAgreementsRequestBodyType getSignersForAgreementsRequestBody;

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
     * Gets the value of the getSignersForAgreementsRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link GetSignersForAgreementsRequestBodyType }
     *     
     */
    public GetSignersForAgreementsRequestBodyType getGetSignersForAgreementsRequestBody() {
        return getSignersForAgreementsRequestBody;
    }

    /**
     * Sets the value of the getSignersForAgreementsRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSignersForAgreementsRequestBodyType }
     *     
     */
    public void setGetSignersForAgreementsRequestBody(GetSignersForAgreementsRequestBodyType value) {
        this.getSignersForAgreementsRequestBody = value;
    }

}


package com.monsanto.irdsoapservices.agreements.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for GetSignersForExpiredAgreementsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSignersForExpiredAgreementsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="GetSignersForExpiredAgreementsRequestBody" type="{urn:monsanto:ird:services:account:agreement}GetSignersForExpiredAgreementsRequestBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSignersForExpiredAgreementsRequestType", propOrder = {
    "header",
    "getSignersForExpiredAgreementsRequestBody"
})
public class GetSignersForExpiredAgreementsRequestType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "GetSignersForExpiredAgreementsRequestBody", required = true)
    protected GetSignersForExpiredAgreementsRequestBodyType getSignersForExpiredAgreementsRequestBody;

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
     * Gets the value of the getSignersForExpiredAgreementsRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link GetSignersForExpiredAgreementsRequestBodyType }
     *     
     */
    public GetSignersForExpiredAgreementsRequestBodyType getGetSignersForExpiredAgreementsRequestBody() {
        return getSignersForExpiredAgreementsRequestBody;
    }

    /**
     * Sets the value of the getSignersForExpiredAgreementsRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSignersForExpiredAgreementsRequestBodyType }
     *     
     */
    public void setGetSignersForExpiredAgreementsRequestBody(GetSignersForExpiredAgreementsRequestBodyType value) {
        this.getSignersForExpiredAgreementsRequestBody = value;
    }

}

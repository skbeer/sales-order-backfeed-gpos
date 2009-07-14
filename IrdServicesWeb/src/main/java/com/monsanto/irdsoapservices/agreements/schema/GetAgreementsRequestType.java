
package com.monsanto.irdsoapservices.agreements.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for GetAgreementsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAgreementsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="GetAgreementsRequestBody" type="{urn:monsanto:ird:services:account:agreement}GetAgreementsRequestBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAgreementsRequestType", propOrder = {
    "header",
    "getAgreementsRequestBody"
})
public class GetAgreementsRequestType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "GetAgreementsRequestBody", required = true)
    protected GetAgreementsRequestBodyType getAgreementsRequestBody;

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
     * Gets the value of the getAgreementsRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link GetAgreementsRequestBodyType }
     *     
     */
    public GetAgreementsRequestBodyType getGetAgreementsRequestBody() {
        return getAgreementsRequestBody;
    }

    /**
     * Sets the value of the getAgreementsRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAgreementsRequestBodyType }
     *     
     */
    public void setGetAgreementsRequestBody(GetAgreementsRequestBodyType value) {
        this.getAgreementsRequestBody = value;
    }

}

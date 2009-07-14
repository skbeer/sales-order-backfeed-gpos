
package com.monsanto.irdsoapservices.agreements.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for GetAgreementsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAgreementsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="GetAgreementsResponseBody" type="{urn:monsanto:ird:services:account:agreement}GetAgreementsResponseBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAgreementsResponseType", propOrder = {
    "header",
    "getAgreementsResponseBody"
})
public class GetAgreementsResponseType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "GetAgreementsResponseBody", required = true)
    protected GetAgreementsResponseBodyType getAgreementsResponseBody;

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
     * Gets the value of the getAgreementsResponseBody property.
     * 
     * @return
     *     possible object is
     *     {@link GetAgreementsResponseBodyType }
     *     
     */
    public GetAgreementsResponseBodyType getGetAgreementsResponseBody() {
        return getAgreementsResponseBody;
    }

    /**
     * Sets the value of the getAgreementsResponseBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAgreementsResponseBodyType }
     *     
     */
    public void setGetAgreementsResponseBody(GetAgreementsResponseBodyType value) {
        this.getAgreementsResponseBody = value;
    }

}

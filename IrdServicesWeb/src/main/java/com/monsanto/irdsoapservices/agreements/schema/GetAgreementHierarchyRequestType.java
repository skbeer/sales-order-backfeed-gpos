
package com.monsanto.irdsoapservices.agreements.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for GetAgreementHierarchyRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAgreementHierarchyRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="GetAgreementHierarchyRequestBody" type="{urn:monsanto:ird:services:account:agreement}GetAgreementHierarchyRequestBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAgreementHierarchyRequestType", propOrder = {
    "header",
    "getAgreementHierarchyRequestBody"
})
public class GetAgreementHierarchyRequestType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "GetAgreementHierarchyRequestBody", required = true)
    protected GetAgreementHierarchyRequestBodyType getAgreementHierarchyRequestBody;

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
     * Gets the value of the getAgreementHierarchyRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link GetAgreementHierarchyRequestBodyType }
     *     
     */
    public GetAgreementHierarchyRequestBodyType getGetAgreementHierarchyRequestBody() {
        return getAgreementHierarchyRequestBody;
    }

    /**
     * Sets the value of the getAgreementHierarchyRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAgreementHierarchyRequestBodyType }
     *     
     */
    public void setGetAgreementHierarchyRequestBody(GetAgreementHierarchyRequestBodyType value) {
        this.getAgreementHierarchyRequestBody = value;
    }

}

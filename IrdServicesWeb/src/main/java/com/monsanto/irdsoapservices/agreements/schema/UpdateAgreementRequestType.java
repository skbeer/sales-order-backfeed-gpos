
package com.monsanto.irdsoapservices.agreements.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.monsanto.isdcommon.header.schema.HeaderType;


/**
 * <p>Java class for UpdateAgreementRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateAgreementRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:monsanto:uscomm:service:header}Header"/>
 *         &lt;element name="UpdateAgreementRequestBody" type="{urn:monsanto:ird:services:account:agreement}UpdateAgreementRequestBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateAgreementRequestType", propOrder = {
    "header",
    "updateAgreementRequestBody"
})
public class UpdateAgreementRequestType {

    @XmlElement(name = "Header", namespace = "urn:monsanto:uscomm:service:header", required = true)
    protected HeaderType header;
    @XmlElement(name = "UpdateAgreementRequestBody", required = true)
    protected UpdateAgreementRequestBodyType updateAgreementRequestBody;

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
     * Gets the value of the updateAgreementRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateAgreementRequestBodyType }
     *     
     */
    public UpdateAgreementRequestBodyType getUpdateAgreementRequestBody() {
        return updateAgreementRequestBody;
    }

    /**
     * Sets the value of the updateAgreementRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateAgreementRequestBodyType }
     *     
     */
    public void setUpdateAgreementRequestBody(UpdateAgreementRequestBodyType value) {
        this.updateAgreementRequestBody = value;
    }

}

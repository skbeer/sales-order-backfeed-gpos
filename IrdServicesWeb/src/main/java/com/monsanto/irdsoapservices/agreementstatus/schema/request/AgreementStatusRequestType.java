
package com.monsanto.irdsoapservices.agreementstatus.schema.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgreementStatusRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementStatusRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{urn:ecms:schema:agreement:request:2:0}HeaderType"/>
 *         &lt;element name="AgreementStatusRequestBody" type="{urn:ecms:schema:agreement:request:2:0}AgreementStatusRequestBodyType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="2.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementStatusRequestType", propOrder = {
    "header",
    "agreementStatusRequestBody"
})
@XmlSeeAlso({
    AgreementStatusRequest.class
})
public class AgreementStatusRequestType {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "AgreementStatusRequestBody", required = true)
    protected AgreementStatusRequestBodyType agreementStatusRequestBody;
    @XmlAttribute(name = "Version")
    @XmlSchemaType(name = "anySimpleType")
    protected String version;

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
     * Gets the value of the agreementStatusRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementStatusRequestBodyType }
     *     
     */
    public AgreementStatusRequestBodyType getAgreementStatusRequestBody() {
        return agreementStatusRequestBody;
    }

    /**
     * Sets the value of the agreementStatusRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementStatusRequestBodyType }
     *     
     */
    public void setAgreementStatusRequestBody(AgreementStatusRequestBodyType value) {
        this.agreementStatusRequestBody = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}

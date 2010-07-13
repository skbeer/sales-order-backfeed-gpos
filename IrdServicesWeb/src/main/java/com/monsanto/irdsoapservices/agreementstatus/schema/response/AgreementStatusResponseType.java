
package com.monsanto.irdsoapservices.agreementstatus.schema.response;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AgreementStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementStatusResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ecms:schema:agreement:response:2:0}Header"/>
 *         &lt;element ref="{urn:ecms:schema:agreement:response:2:0}AgreementStatusResponseBody"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}token" fixed="2.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementStatusResponseType", propOrder = {
    "header",
    "agreementStatusResponseBody"
})
public class AgreementStatusResponseType {

    @XmlElement(name = "Header", namespace = "urn:ecms:schema:agreement:response:2:0", required = true)
    protected HeaderType header;
    @XmlElement(name = "AgreementStatusResponseBody", namespace = "urn:ecms:schema:agreement:response:2:0", required = true)
    protected AgreementStatusResponseBodyType agreementStatusResponseBody;
    @XmlAttribute(name = "Version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
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
     * Gets the value of the agreementStatusResponseBody property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementStatusResponseBodyType }
     *     
     */
    public AgreementStatusResponseBodyType getAgreementStatusResponseBody() {
        return agreementStatusResponseBody;
    }

    /**
     * Sets the value of the agreementStatusResponseBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementStatusResponseBodyType }
     *     
     */
    public void setAgreementStatusResponseBody(AgreementStatusResponseBodyType value) {
        this.agreementStatusResponseBody = value;
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

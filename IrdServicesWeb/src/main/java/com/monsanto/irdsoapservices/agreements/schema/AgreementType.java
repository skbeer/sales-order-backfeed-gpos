
package com.monsanto.irdsoapservices.agreements.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgreementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgreementCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AgreementDescr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementType", propOrder = {
    "agreementCode",
    "agreementDescr"
})
public class AgreementType {

    @XmlElement(name = "AgreementCode", required = true)
    protected String agreementCode;
    @XmlElement(name = "AgreementDescr", required = true)
    protected String agreementDescr;

    /**
     * Gets the value of the agreementCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementCode() {
        return agreementCode;
    }

    /**
     * Sets the value of the agreementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementCode(String value) {
        this.agreementCode = value;
    }

    /**
     * Gets the value of the agreementDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementDescr() {
        return agreementDescr;
    }

    /**
     * Sets the value of the agreementDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementDescr(String value) {
        this.agreementDescr = value;
    }

}

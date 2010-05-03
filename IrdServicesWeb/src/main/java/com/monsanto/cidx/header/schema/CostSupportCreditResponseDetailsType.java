
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostSupportCreditResponseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostSupportCreditResponseDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CreditResponseStatusInformation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostSupportCreditResponseDetailsType", propOrder = {
    "creditResponseStatusInformation"
})
public class CostSupportCreditResponseDetailsType {

    @XmlElement(name = "CreditResponseStatusInformation", required = true)
    protected CreditResponseStatusInformationType creditResponseStatusInformation;

    /**
     * Gets the value of the creditResponseStatusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CreditResponseStatusInformationType }
     *     
     */
    public CreditResponseStatusInformationType getCreditResponseStatusInformation() {
        return creditResponseStatusInformation;
    }

    /**
     * Sets the value of the creditResponseStatusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditResponseStatusInformationType }
     *     
     */
    public void setCreditResponseStatusInformation(CreditResponseStatusInformationType value) {
        this.creditResponseStatusInformation = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyerAccountDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerAccountDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}FinancialInstitutionIdentification"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CreditCardInformation"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerAccountDetailsType", propOrder = {
    "financialInstitutionIdentification",
    "creditCardInformation"
})
public class BuyerAccountDetailsType {

    @XmlElement(name = "FinancialInstitutionIdentification")
    protected FinancialInstitutionIdentificationType financialInstitutionIdentification;
    @XmlElement(name = "CreditCardInformation")
    protected CreditCardInformationType creditCardInformation;

    /**
     * Gets the value of the financialInstitutionIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentificationType }
     *     
     */
    public FinancialInstitutionIdentificationType getFinancialInstitutionIdentification() {
        return financialInstitutionIdentification;
    }

    /**
     * Sets the value of the financialInstitutionIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentificationType }
     *     
     */
    public void setFinancialInstitutionIdentification(FinancialInstitutionIdentificationType value) {
        this.financialInstitutionIdentification = value;
    }

    /**
     * Gets the value of the creditCardInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardInformationType }
     *     
     */
    public CreditCardInformationType getCreditCardInformation() {
        return creditCardInformation;
    }

    /**
     * Sets the value of the creditCardInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardInformationType }
     *     
     */
    public void setCreditCardInformation(CreditCardInformationType value) {
        this.creditCardInformation = value;
    }

}

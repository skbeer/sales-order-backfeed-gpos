
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellerAccountDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerAccountDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}FinancialInstitutionIdentification"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerAccountDetailsType", propOrder = {
    "financialInstitutionIdentification"
})
public class SellerAccountDetailsType {

    @XmlElement(name = "FinancialInstitutionIdentification", required = true)
    protected FinancialInstitutionIdentificationType financialInstitutionIdentification;

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

}

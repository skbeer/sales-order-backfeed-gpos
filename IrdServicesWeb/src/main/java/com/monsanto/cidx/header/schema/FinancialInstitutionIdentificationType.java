
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FinancialInstitutionIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstitutionIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}FinancialInstitutionName"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}FinancialInstitutionDFINumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AccountNumber"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstitutionIdentificationType", propOrder = {
    "financialInstitutionName",
    "financialInstitutionDFINumber",
    "accountNumber"
})
public class FinancialInstitutionIdentificationType {

    @XmlElement(name = "FinancialInstitutionName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String financialInstitutionName;
    @XmlElement(name = "FinancialInstitutionDFINumber", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String financialInstitutionDFINumber;
    @XmlElement(name = "AccountNumber", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String accountNumber;

    /**
     * Gets the value of the financialInstitutionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialInstitutionName() {
        return financialInstitutionName;
    }

    /**
     * Sets the value of the financialInstitutionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialInstitutionName(String value) {
        this.financialInstitutionName = value;
    }

    /**
     * Gets the value of the financialInstitutionDFINumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialInstitutionDFINumber() {
        return financialInstitutionDFINumber;
    }

    /**
     * Sets the value of the financialInstitutionDFINumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialInstitutionDFINumber(String value) {
        this.financialInstitutionDFINumber = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

}

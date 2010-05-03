
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AccountInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AccountHolderName" maxOccurs="unbounded"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}FinancialInstitutionIdentification" minOccurs="0"/>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CreditCardInformation" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountInformationType", propOrder = {
    "accountHolderName",
    "financialInstitutionIdentification",
    "creditCardInformation"
})
public class AccountInformationType {

    @XmlElement(name = "AccountHolderName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> accountHolderName;
    @XmlElement(name = "FinancialInstitutionIdentification")
    protected FinancialInstitutionIdentificationType financialInstitutionIdentification;
    @XmlElement(name = "CreditCardInformation")
    protected CreditCardInformationType creditCardInformation;

    /**
     * Gets the value of the accountHolderName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountHolderName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountHolderName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAccountHolderName() {
        if (accountHolderName == null) {
            accountHolderName = new ArrayList<String>();
        }
        return this.accountHolderName;
    }

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

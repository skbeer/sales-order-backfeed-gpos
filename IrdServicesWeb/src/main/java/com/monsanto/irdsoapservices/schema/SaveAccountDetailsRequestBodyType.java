
package com.monsanto.irdsoapservices.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaveAccountDetailsRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveAccountDetailsRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatabaseAction" type="{urn:monsanto:ird:services:account:information}DatabaseActionType"/>
 *         &lt;element name="AccountDetails" type="{urn:monsanto:ird:services:account:information}AccountDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveAccountDetailsRequestBodyType", propOrder = {
    "databaseAction",
    "accountDetails"
})
public class SaveAccountDetailsRequestBodyType {

    @XmlElement(name = "DatabaseAction", required = true)
    protected DatabaseActionType databaseAction;
    @XmlElement(name = "AccountDetails", required = true)
    protected AccountDetailsType accountDetails;

    /**
     * Gets the value of the databaseAction property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseActionType }
     *     
     */
    public DatabaseActionType getDatabaseAction() {
        return databaseAction;
    }

    /**
     * Sets the value of the databaseAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseActionType }
     *     
     */
    public void setDatabaseAction(DatabaseActionType value) {
        this.databaseAction = value;
    }

    /**
     * Gets the value of the accountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDetailsType }
     *     
     */
    public AccountDetailsType getAccountDetails() {
        return accountDetails;
    }

    /**
     * Sets the value of the accountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDetailsType }
     *     
     */
    public void setAccountDetails(AccountDetailsType value) {
        this.accountDetails = value;
    }

}


package com.monsanto.irdsoapservices.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAssociatedEmployeesResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAssociatedEmployeesResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountIdentifier" type="{urn:monsanto:ird:services:account:information}AccountIdentifierType"/>
 *         &lt;element name="Employee" type="{urn:monsanto:ird:services:account:information}EmployeeType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAssociatedEmployeesResponseBodyType", propOrder = {
    "accountIdentifier",
    "employee"
})
public class GetAssociatedEmployeesResponseBodyType {

    @XmlElement(name = "AccountIdentifier", required = true)
    protected AccountIdentifierType accountIdentifier;
    @XmlElement(name = "Employee", required = true)
    protected List<EmployeeType> employee;

    /**
     * Gets the value of the accountIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentifierType }
     *     
     */
    public AccountIdentifierType getAccountIdentifier() {
        return accountIdentifier;
    }

    /**
     * Sets the value of the accountIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentifierType }
     *     
     */
    public void setAccountIdentifier(AccountIdentifierType value) {
        this.accountIdentifier = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeType }
     * 
     * 
     */
    public List<EmployeeType> getEmployee() {
        if (employee == null) {
            employee = new ArrayList<EmployeeType>();
        }
        return this.employee;
    }

}

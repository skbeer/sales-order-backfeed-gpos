
package com.monsanto.irdsoapservices.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersistableContactInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersistableContactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatabaseAction" type="{urn:monsanto:ird:services:account:information}DatabaseActionType"/>
 *         &lt;element name="ContactInfo" type="{urn:monsanto:ird:services:account:information}ContactInfoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersistableContactInfoType", propOrder = {
    "databaseAction",
    "contactInfo"
})
public class PersistableContactInfoType {

    @XmlElement(name = "DatabaseAction", required = true)
    protected DatabaseActionType databaseAction;
    @XmlElement(name = "ContactInfo", required = true)
    protected ContactInfoType contactInfo;

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
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
    }

}

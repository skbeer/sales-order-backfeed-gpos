
package com.monsanto.irdsoapservices.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrowerAcctId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Spouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Family" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterestsHobbies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organizations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChemistryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherChemistryDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDetailsType", propOrder = {
    "growerAcctId",
    "spouse",
    "family",
    "interestsHobbies",
    "organizations",
    "chemistryComments",
    "otherChemistryDescr"
})
public class AccountDetailsType {

    @XmlElement(name = "GrowerAcctId")
    protected long growerAcctId;
    @XmlElement(name = "Spouse")
    protected String spouse;
    @XmlElement(name = "Family")
    protected String family;
    @XmlElement(name = "InterestsHobbies")
    protected String interestsHobbies;
    @XmlElement(name = "Organizations")
    protected String organizations;
    @XmlElement(name = "ChemistryComments")
    protected String chemistryComments;
    @XmlElement(name = "OtherChemistryDescr")
    protected String otherChemistryDescr;

    /**
     * Gets the value of the growerAcctId property.
     * 
     */
    public long getGrowerAcctId() {
        return growerAcctId;
    }

    /**
     * Sets the value of the growerAcctId property.
     * 
     */
    public void setGrowerAcctId(long value) {
        this.growerAcctId = value;
    }

    /**
     * Gets the value of the spouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouse() {
        return spouse;
    }

    /**
     * Sets the value of the spouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouse(String value) {
        this.spouse = value;
    }

    /**
     * Gets the value of the family property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamily() {
        return family;
    }

    /**
     * Sets the value of the family property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamily(String value) {
        this.family = value;
    }

    /**
     * Gets the value of the interestsHobbies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestsHobbies() {
        return interestsHobbies;
    }

    /**
     * Sets the value of the interestsHobbies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestsHobbies(String value) {
        this.interestsHobbies = value;
    }

    /**
     * Gets the value of the organizations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizations() {
        return organizations;
    }

    /**
     * Sets the value of the organizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizations(String value) {
        this.organizations = value;
    }

    /**
     * Gets the value of the chemistryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChemistryComments() {
        return chemistryComments;
    }

    /**
     * Sets the value of the chemistryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChemistryComments(String value) {
        this.chemistryComments = value;
    }

    /**
     * Gets the value of the otherChemistryDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherChemistryDescr() {
        return otherChemistryDescr;
    }

    /**
     * Sets the value of the otherChemistryDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherChemistryDescr(String value) {
        this.otherChemistryDescr = value;
    }

}

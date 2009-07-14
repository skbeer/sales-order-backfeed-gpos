
package com.monsanto.irdsoapservices.agreements.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgreementsBySpecieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementsBySpecieType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecieName" type="{urn:monsanto:ird:services:account:agreement}SpecieNameType"/>
 *         &lt;element name="Agreement" type="{urn:monsanto:ird:services:account:agreement}AgreementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementsBySpecieType", propOrder = {
    "specieName",
    "agreement"
})
public class AgreementsBySpecieType {

    @XmlElement(name = "SpecieName", required = true)
    protected SpecieNameType specieName;
    @XmlElement(name = "Agreement")
    protected List<AgreementType> agreement;

    /**
     * Gets the value of the specieName property.
     * 
     * @return
     *     possible object is
     *     {@link SpecieNameType }
     *     
     */
    public SpecieNameType getSpecieName() {
        return specieName;
    }

    /**
     * Sets the value of the specieName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecieNameType }
     *     
     */
    public void setSpecieName(SpecieNameType value) {
        this.specieName = value;
    }

    /**
     * Gets the value of the agreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgreement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgreementType }
     * 
     * 
     */
    public List<AgreementType> getAgreement() {
        if (agreement == null) {
            agreement = new ArrayList<AgreementType>();
        }
        return this.agreement;
    }

}

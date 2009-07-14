
package com.monsanto.irdsoapservices.agreements.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgreementCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementCategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoryName" type="{urn:monsanto:ird:services:account:agreement}AgreementCategoryNameType"/>
 *         &lt;element name="AgreementsBySpecie" type="{urn:monsanto:ird:services:account:agreement}AgreementsBySpecieType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementCategoryType", propOrder = {
    "categoryName",
    "agreementsBySpecie"
})
public class AgreementCategoryType {

    @XmlElement(name = "CategoryName", required = true)
    protected AgreementCategoryNameType categoryName;
    @XmlElement(name = "AgreementsBySpecie")
    protected List<AgreementsBySpecieType> agreementsBySpecie;

    /**
     * Gets the value of the categoryName property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementCategoryNameType }
     *     
     */
    public AgreementCategoryNameType getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementCategoryNameType }
     *     
     */
    public void setCategoryName(AgreementCategoryNameType value) {
        this.categoryName = value;
    }

    /**
     * Gets the value of the agreementsBySpecie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreementsBySpecie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgreementsBySpecie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgreementsBySpecieType }
     * 
     * 
     */
    public List<AgreementsBySpecieType> getAgreementsBySpecie() {
        if (agreementsBySpecie == null) {
            agreementsBySpecie = new ArrayList<AgreementsBySpecieType>();
        }
        return this.agreementsBySpecie;
    }

}


package com.monsanto.irdsoapservices.agreements.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAgreementHierarchyResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAgreementHierarchyResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgreementCategory" type="{urn:monsanto:ird:services:account:agreement}AgreementCategoryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAgreementHierarchyResponseBodyType", propOrder = {
    "agreementCategory"
})
public class GetAgreementHierarchyResponseBodyType {

    @XmlElement(name = "AgreementCategory")
    protected List<AgreementCategoryType> agreementCategory;

    /**
     * Gets the value of the agreementCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreementCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgreementCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgreementCategoryType }
     * 
     * 
     */
    public List<AgreementCategoryType> getAgreementCategory() {
        if (agreementCategory == null) {
            agreementCategory = new ArrayList<AgreementCategoryType>();
        }
        return this.agreementCategory;
    }

}


package com.monsanto.irdsoapservices.agreements.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAgreementsResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAgreementsResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgreementInformation" type="{urn:monsanto:ird:services:account:agreement}AgreementInformationType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAgreementsResponseBodyType", propOrder = {
    "agreementInformation"
})
public class GetAgreementsResponseBodyType {

    @XmlElement(name = "AgreementInformation", required = true)
    protected List<AgreementInformationType> agreementInformation;

    /**
     * Gets the value of the agreementInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreementInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgreementInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgreementInformationType }
     * 
     * 
     */
    public List<AgreementInformationType> getAgreementInformation() {
        if (agreementInformation == null) {
            agreementInformation = new ArrayList<AgreementInformationType>();
        }
        return this.agreementInformation;
    }

}

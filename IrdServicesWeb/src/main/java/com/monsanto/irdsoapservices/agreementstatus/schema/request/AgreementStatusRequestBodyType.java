
package com.monsanto.irdsoapservices.agreementstatus.schema.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for AgreementStatusRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementStatusRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgreementStatusRequestDetails" type="{urn:ecms:schema:agreement:request:2:0}AgreementStatusRequestDetailsType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementStatusRequestBodyType", propOrder = {
    "agreementStatusRequestDetails"
})
public class AgreementStatusRequestBodyType {

    @XmlElement(name = "AgreementStatusRequestDetails", required = true)
    protected List<AgreementStatusRequestDetailsType> agreementStatusRequestDetails;

    /**
     * Gets the value of the agreementStatusRequestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreementStatusRequestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgreementStatusRequestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgreementStatusRequestDetailsType }
     * 
     * 
     */
    public List<AgreementStatusRequestDetailsType> getAgreementStatusRequestDetails() {
        if (agreementStatusRequestDetails == null) {
            agreementStatusRequestDetails = new ArrayList<AgreementStatusRequestDetailsType>();
        }
        return this.agreementStatusRequestDetails;
    }

}

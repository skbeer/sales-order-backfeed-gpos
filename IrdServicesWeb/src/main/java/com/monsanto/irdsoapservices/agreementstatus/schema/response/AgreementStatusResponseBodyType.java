
package com.monsanto.irdsoapservices.agreementstatus.schema.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for AgreementStatusResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementStatusResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ecms:schema:agreement:response:2:0}AgreementStatusResponseDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementStatusResponseBodyType", propOrder = {
    "agreementStatusResponseDetails"
})
public class AgreementStatusResponseBodyType {

    @XmlElement(name = "AgreementStatusResponseDetails", namespace = "urn:ecms:schema:agreement:response:2:0")
    protected List<AgreementStatusResponseDetails> agreementStatusResponseDetails;

    /**
     * Gets the value of the agreementStatusResponseDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreementStatusResponseDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgreementStatusResponseDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgreementStatusResponseDetails }
     * 
     * 
     */
    public List<AgreementStatusResponseDetails> getAgreementStatusResponseDetails() {
        if (agreementStatusResponseDetails == null) {
            agreementStatusResponseDetails = new ArrayList<AgreementStatusResponseDetails>();
        }
        return this.agreementStatusResponseDetails;
    }

}

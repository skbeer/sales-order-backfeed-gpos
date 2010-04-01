
package com.monsanto.irdsoapservices.agreements.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSignersForExpiredAgreementsResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSignersForExpiredAgreementsResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignerInformation" type="{urn:monsanto:ird:services:account:agreement}SignerInformationType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSignersForExpiredAgreementsResponseBodyType", propOrder = {
    "signerInformation"
})
public class GetSignersForExpiredAgreementsResponseBodyType {

    @XmlElement(name = "SignerInformation", required = true)
    protected List<SignerInformationType> signerInformation;

    /**
     * Gets the value of the signerInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signerInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignerInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignerInformationType }
     * 
     * 
     */
    public List<SignerInformationType> getSignerInformation() {
        if (signerInformation == null) {
            signerInformation = new ArrayList<SignerInformationType>();
        }
        return this.signerInformation;
    }

}

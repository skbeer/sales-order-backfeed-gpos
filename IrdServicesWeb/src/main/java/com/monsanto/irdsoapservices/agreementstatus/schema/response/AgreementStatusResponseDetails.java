
package com.monsanto.irdsoapservices.agreementstatus.schema.response;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ecms:schema:agreement:response:2:0}PartnerInformation"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:ecms:schema:agreement:response:2:0}AgreementStatusList" maxOccurs="unbounded"/>
 *           &lt;element ref="{urn:ecms:schema:agreement:response:2:0}ErrorResponse"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "partnerInformation",
    "agreementStatusList",
    "errorResponse"
})
@XmlRootElement(name = "AgreementStatusResponseDetails")
public class AgreementStatusResponseDetails {

    @XmlElement(name = "PartnerInformation", namespace = "urn:ecms:schema:agreement:response:2:0", required = true)
    protected PartnerInformationType partnerInformation;
    @XmlElement(name = "AgreementStatusList", namespace = "urn:ecms:schema:agreement:response:2:0")
    protected List<AgreementStatusListType> agreementStatusList;
    @XmlElement(name = "ErrorResponse", namespace = "urn:ecms:schema:agreement:response:2:0")
    protected ErrorResponseType errorResponse;

    /**
     * Gets the value of the partnerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerInformationType }
     *     
     */
    public PartnerInformationType getPartnerInformation() {
        return partnerInformation;
    }

    /**
     * Sets the value of the partnerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerInformationType }
     *     
     */
    public void setPartnerInformation(PartnerInformationType value) {
        this.partnerInformation = value;
    }

    /**
     * Gets the value of the agreementStatusList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreementStatusList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgreementStatusList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgreementStatusListType }
     * 
     * 
     */
    public List<AgreementStatusListType> getAgreementStatusList() {
        if (agreementStatusList == null) {
            agreementStatusList = new ArrayList<AgreementStatusListType>();
        }
        return this.agreementStatusList;
    }

    /**
     * Gets the value of the errorResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorResponseType }
     *     
     */
    public ErrorResponseType getErrorResponse() {
        return errorResponse;
    }

    /**
     * Sets the value of the errorResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorResponseType }
     *     
     */
    public void setErrorResponse(ErrorResponseType value) {
        this.errorResponse = value;
    }

}


package com.monsanto.irdsoapservices.agreementstatuspartners.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgreementStatusResponsePropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementStatusResponsePropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:3}AgreementStatusList" maxOccurs="unbounded"/>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:3}ErrorResponse"/>
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
@XmlType(name = "AgreementStatusResponsePropertiesType", propOrder = {
    "agreementStatusList",
    "errorResponse"
})
public class AgreementStatusResponsePropertiesType {

    @XmlElement(name = "AgreementStatusList")
    protected List<AgreementStatusListType> agreementStatusList;
    @XmlElement(name = "ErrorResponse")
    protected ErrorResponseType errorResponse;

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

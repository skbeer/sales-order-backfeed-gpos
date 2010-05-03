
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostSupportCreditRequestPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostSupportCreditRequestPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportAgreementNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestForCreditReferenceNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestIssuedDate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TotalCreditRequested"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostSupportCreditRequestPropertiesType", propOrder = {
    "costSupportAgreementNumber",
    "requestForCreditReferenceNumber",
    "requestIssuedDate",
    "totalCreditRequested"
})
public class CostSupportCreditRequestPropertiesType {

    @XmlElement(name = "CostSupportAgreementNumber", required = true)
    protected CostSupportAgreementNumberType costSupportAgreementNumber;
    @XmlElement(name = "RequestForCreditReferenceNumber", required = true)
    protected RequestForCreditReferenceNumberType requestForCreditReferenceNumber;
    @XmlElement(name = "RequestIssuedDate", required = true)
    protected RequestIssuedDateType requestIssuedDate;
    @XmlElement(name = "TotalCreditRequested", required = true)
    protected TotalCreditRequestedType totalCreditRequested;

    /**
     * Gets the value of the costSupportAgreementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportAgreementNumberType }
     *     
     */
    public CostSupportAgreementNumberType getCostSupportAgreementNumber() {
        return costSupportAgreementNumber;
    }

    /**
     * Sets the value of the costSupportAgreementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportAgreementNumberType }
     *     
     */
    public void setCostSupportAgreementNumber(CostSupportAgreementNumberType value) {
        this.costSupportAgreementNumber = value;
    }

    /**
     * Gets the value of the requestForCreditReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForCreditReferenceNumberType }
     *     
     */
    public RequestForCreditReferenceNumberType getRequestForCreditReferenceNumber() {
        return requestForCreditReferenceNumber;
    }

    /**
     * Sets the value of the requestForCreditReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForCreditReferenceNumberType }
     *     
     */
    public void setRequestForCreditReferenceNumber(RequestForCreditReferenceNumberType value) {
        this.requestForCreditReferenceNumber = value;
    }

    /**
     * Gets the value of the requestIssuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link RequestIssuedDateType }
     *     
     */
    public RequestIssuedDateType getRequestIssuedDate() {
        return requestIssuedDate;
    }

    /**
     * Sets the value of the requestIssuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestIssuedDateType }
     *     
     */
    public void setRequestIssuedDate(RequestIssuedDateType value) {
        this.requestIssuedDate = value;
    }

    /**
     * Gets the value of the totalCreditRequested property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCreditRequestedType }
     *     
     */
    public TotalCreditRequestedType getTotalCreditRequested() {
        return totalCreditRequested;
    }

    /**
     * Sets the value of the totalCreditRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCreditRequestedType }
     *     
     */
    public void setTotalCreditRequested(TotalCreditRequestedType value) {
        this.totalCreditRequested = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CreditResponseStatusInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditResponseStatusInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Status"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ResponseIssuedDate" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CreditRequestApprovalNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}StatusReason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditResponseStatusInformationType", propOrder = {
    "status",
    "responseIssuedDate",
    "creditRequestApprovalNumber",
    "statusReason"
})
public class CreditResponseStatusInformationType {

    @XmlElement(name = "Status", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;
    @XmlElement(name = "ResponseIssuedDate")
    protected ResponseIssuedDateType responseIssuedDate;
    @XmlElement(name = "CreditRequestApprovalNumber")
    protected CreditRequestApprovalNumberType creditRequestApprovalNumber;
    @XmlElement(name = "StatusReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String statusReason;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the responseIssuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseIssuedDateType }
     *     
     */
    public ResponseIssuedDateType getResponseIssuedDate() {
        return responseIssuedDate;
    }

    /**
     * Sets the value of the responseIssuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseIssuedDateType }
     *     
     */
    public void setResponseIssuedDate(ResponseIssuedDateType value) {
        this.responseIssuedDate = value;
    }

    /**
     * Gets the value of the creditRequestApprovalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CreditRequestApprovalNumberType }
     *     
     */
    public CreditRequestApprovalNumberType getCreditRequestApprovalNumber() {
        return creditRequestApprovalNumber;
    }

    /**
     * Sets the value of the creditRequestApprovalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditRequestApprovalNumberType }
     *     
     */
    public void setCreditRequestApprovalNumber(CreditRequestApprovalNumberType value) {
        this.creditRequestApprovalNumber = value;
    }

    /**
     * Gets the value of the statusReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * Sets the value of the statusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusReason(String value) {
        this.statusReason = value;
    }

}

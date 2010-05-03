
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostSupportCreditRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostSupportCreditRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportCreditRequestProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportCreditRequestPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportCreditRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostSupportCreditRequestBodyType", propOrder = {
    "costSupportCreditRequestProperties",
    "costSupportCreditRequestPartners",
    "costSupportCreditRequestDetails"
})
public class CostSupportCreditRequestBodyType {

    @XmlElement(name = "CostSupportCreditRequestProperties", required = true)
    protected CostSupportCreditRequestPropertiesType costSupportCreditRequestProperties;
    @XmlElement(name = "CostSupportCreditRequestPartners", required = true)
    protected CostSupportCreditRequestPartnersType costSupportCreditRequestPartners;
    @XmlElement(name = "CostSupportCreditRequestDetails", required = true)
    protected CostSupportCreditRequestDetailsType costSupportCreditRequestDetails;

    /**
     * Gets the value of the costSupportCreditRequestProperties property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportCreditRequestPropertiesType }
     *     
     */
    public CostSupportCreditRequestPropertiesType getCostSupportCreditRequestProperties() {
        return costSupportCreditRequestProperties;
    }

    /**
     * Sets the value of the costSupportCreditRequestProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportCreditRequestPropertiesType }
     *     
     */
    public void setCostSupportCreditRequestProperties(CostSupportCreditRequestPropertiesType value) {
        this.costSupportCreditRequestProperties = value;
    }

    /**
     * Gets the value of the costSupportCreditRequestPartners property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportCreditRequestPartnersType }
     *     
     */
    public CostSupportCreditRequestPartnersType getCostSupportCreditRequestPartners() {
        return costSupportCreditRequestPartners;
    }

    /**
     * Sets the value of the costSupportCreditRequestPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportCreditRequestPartnersType }
     *     
     */
    public void setCostSupportCreditRequestPartners(CostSupportCreditRequestPartnersType value) {
        this.costSupportCreditRequestPartners = value;
    }

    /**
     * Gets the value of the costSupportCreditRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportCreditRequestDetailsType }
     *     
     */
    public CostSupportCreditRequestDetailsType getCostSupportCreditRequestDetails() {
        return costSupportCreditRequestDetails;
    }

    /**
     * Sets the value of the costSupportCreditRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportCreditRequestDetailsType }
     *     
     */
    public void setCostSupportCreditRequestDetails(CostSupportCreditRequestDetailsType value) {
        this.costSupportCreditRequestDetails = value;
    }

}

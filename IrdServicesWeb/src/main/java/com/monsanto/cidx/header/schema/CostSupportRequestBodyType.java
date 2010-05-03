
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostSupportRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostSupportRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportRequestProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportRequestPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostSupportRequestBodyType", propOrder = {
    "costSupportRequestProperties",
    "costSupportRequestPartners",
    "costSupportRequestDetails"
})
public class CostSupportRequestBodyType {

    @XmlElement(name = "CostSupportRequestProperties", required = true)
    protected CostSupportRequestPropertiesType costSupportRequestProperties;
    @XmlElement(name = "CostSupportRequestPartners", required = true)
    protected CostSupportRequestPartnersType costSupportRequestPartners;
    @XmlElement(name = "CostSupportRequestDetails", required = true)
    protected CostSupportRequestDetailsType costSupportRequestDetails;

    /**
     * Gets the value of the costSupportRequestProperties property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportRequestPropertiesType }
     *     
     */
    public CostSupportRequestPropertiesType getCostSupportRequestProperties() {
        return costSupportRequestProperties;
    }

    /**
     * Sets the value of the costSupportRequestProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportRequestPropertiesType }
     *     
     */
    public void setCostSupportRequestProperties(CostSupportRequestPropertiesType value) {
        this.costSupportRequestProperties = value;
    }

    /**
     * Gets the value of the costSupportRequestPartners property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportRequestPartnersType }
     *     
     */
    public CostSupportRequestPartnersType getCostSupportRequestPartners() {
        return costSupportRequestPartners;
    }

    /**
     * Sets the value of the costSupportRequestPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportRequestPartnersType }
     *     
     */
    public void setCostSupportRequestPartners(CostSupportRequestPartnersType value) {
        this.costSupportRequestPartners = value;
    }

    /**
     * Gets the value of the costSupportRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportRequestDetailsType }
     *     
     */
    public CostSupportRequestDetailsType getCostSupportRequestDetails() {
        return costSupportRequestDetails;
    }

    /**
     * Sets the value of the costSupportRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportRequestDetailsType }
     *     
     */
    public void setCostSupportRequestDetails(CostSupportRequestDetailsType value) {
        this.costSupportRequestDetails = value;
    }

}

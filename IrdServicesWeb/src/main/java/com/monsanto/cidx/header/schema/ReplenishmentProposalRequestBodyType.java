
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplenishmentProposalRequestBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplenishmentProposalRequestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReplenishmentProposalRequestProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReplenishmentProposalRequestPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReplenishmentProposalRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplenishmentProposalRequestBodyType", propOrder = {
    "replenishmentProposalRequestProperties",
    "replenishmentProposalRequestPartners",
    "replenishmentProposalRequestDetails"
})
public class ReplenishmentProposalRequestBodyType {

    @XmlElement(name = "ReplenishmentProposalRequestProperties", required = true)
    protected ReplenishmentProposalRequestPropertiesType replenishmentProposalRequestProperties;
    @XmlElement(name = "ReplenishmentProposalRequestPartners", required = true)
    protected ReplenishmentProposalRequestPartnersType replenishmentProposalRequestPartners;
    @XmlElement(name = "ReplenishmentProposalRequestDetails", required = true)
    protected ReplenishmentProposalRequestDetailsType replenishmentProposalRequestDetails;

    /**
     * Gets the value of the replenishmentProposalRequestProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ReplenishmentProposalRequestPropertiesType }
     *     
     */
    public ReplenishmentProposalRequestPropertiesType getReplenishmentProposalRequestProperties() {
        return replenishmentProposalRequestProperties;
    }

    /**
     * Sets the value of the replenishmentProposalRequestProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplenishmentProposalRequestPropertiesType }
     *     
     */
    public void setReplenishmentProposalRequestProperties(ReplenishmentProposalRequestPropertiesType value) {
        this.replenishmentProposalRequestProperties = value;
    }

    /**
     * Gets the value of the replenishmentProposalRequestPartners property.
     * 
     * @return
     *     possible object is
     *     {@link ReplenishmentProposalRequestPartnersType }
     *     
     */
    public ReplenishmentProposalRequestPartnersType getReplenishmentProposalRequestPartners() {
        return replenishmentProposalRequestPartners;
    }

    /**
     * Sets the value of the replenishmentProposalRequestPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplenishmentProposalRequestPartnersType }
     *     
     */
    public void setReplenishmentProposalRequestPartners(ReplenishmentProposalRequestPartnersType value) {
        this.replenishmentProposalRequestPartners = value;
    }

    /**
     * Gets the value of the replenishmentProposalRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReplenishmentProposalRequestDetailsType }
     *     
     */
    public ReplenishmentProposalRequestDetailsType getReplenishmentProposalRequestDetails() {
        return replenishmentProposalRequestDetails;
    }

    /**
     * Sets the value of the replenishmentProposalRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplenishmentProposalRequestDetailsType }
     *     
     */
    public void setReplenishmentProposalRequestDetails(ReplenishmentProposalRequestDetailsType value) {
        this.replenishmentProposalRequestDetails = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplenishmentProposalResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplenishmentProposalResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReplenishmentProposalResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReplenishmentProposalResponsePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReplenishmentProposalResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplenishmentProposalResponseBodyType", propOrder = {
    "replenishmentProposalResponseProperties",
    "replenishmentProposalResponsePartners",
    "replenishmentProposalResponseDetails"
})
public class ReplenishmentProposalResponseBodyType {

    @XmlElement(name = "ReplenishmentProposalResponseProperties", required = true)
    protected ReplenishmentProposalResponsePropertiesType replenishmentProposalResponseProperties;
    @XmlElement(name = "ReplenishmentProposalResponsePartners", required = true)
    protected ReplenishmentProposalResponsePartnersType replenishmentProposalResponsePartners;
    @XmlElement(name = "ReplenishmentProposalResponseDetails", required = true)
    protected ReplenishmentProposalResponseDetailsType replenishmentProposalResponseDetails;

    /**
     * Gets the value of the replenishmentProposalResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ReplenishmentProposalResponsePropertiesType }
     *     
     */
    public ReplenishmentProposalResponsePropertiesType getReplenishmentProposalResponseProperties() {
        return replenishmentProposalResponseProperties;
    }

    /**
     * Sets the value of the replenishmentProposalResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplenishmentProposalResponsePropertiesType }
     *     
     */
    public void setReplenishmentProposalResponseProperties(ReplenishmentProposalResponsePropertiesType value) {
        this.replenishmentProposalResponseProperties = value;
    }

    /**
     * Gets the value of the replenishmentProposalResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link ReplenishmentProposalResponsePartnersType }
     *     
     */
    public ReplenishmentProposalResponsePartnersType getReplenishmentProposalResponsePartners() {
        return replenishmentProposalResponsePartners;
    }

    /**
     * Sets the value of the replenishmentProposalResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplenishmentProposalResponsePartnersType }
     *     
     */
    public void setReplenishmentProposalResponsePartners(ReplenishmentProposalResponsePartnersType value) {
        this.replenishmentProposalResponsePartners = value;
    }

    /**
     * Gets the value of the replenishmentProposalResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReplenishmentProposalResponseDetailsType }
     *     
     */
    public ReplenishmentProposalResponseDetailsType getReplenishmentProposalResponseDetails() {
        return replenishmentProposalResponseDetails;
    }

    /**
     * Sets the value of the replenishmentProposalResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplenishmentProposalResponseDetailsType }
     *     
     */
    public void setReplenishmentProposalResponseDetails(ReplenishmentProposalResponseDetailsType value) {
        this.replenishmentProposalResponseDetails = value;
    }

}

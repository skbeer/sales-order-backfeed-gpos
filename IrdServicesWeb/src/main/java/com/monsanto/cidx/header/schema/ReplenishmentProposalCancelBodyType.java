
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplenishmentProposalCancelBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplenishmentProposalCancelBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReplenishmentProposalCancelProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReplenishmentProposalCancelPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReplenishmentProposalCancelDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplenishmentProposalCancelBodyType", propOrder = {
    "replenishmentProposalCancelProperties",
    "replenishmentProposalCancelPartners",
    "replenishmentProposalCancelDetails"
})
public class ReplenishmentProposalCancelBodyType {

    @XmlElement(name = "ReplenishmentProposalCancelProperties", required = true)
    protected ReplenishmentProposalCancelPropertiesType replenishmentProposalCancelProperties;
    @XmlElement(name = "ReplenishmentProposalCancelPartners", required = true)
    protected ReplenishmentProposalCancelPartnersType replenishmentProposalCancelPartners;
    @XmlElement(name = "ReplenishmentProposalCancelDetails", required = true)
    protected ReplenishmentProposalCancelDetailsType replenishmentProposalCancelDetails;

    /**
     * Gets the value of the replenishmentProposalCancelProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ReplenishmentProposalCancelPropertiesType }
     *     
     */
    public ReplenishmentProposalCancelPropertiesType getReplenishmentProposalCancelProperties() {
        return replenishmentProposalCancelProperties;
    }

    /**
     * Sets the value of the replenishmentProposalCancelProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplenishmentProposalCancelPropertiesType }
     *     
     */
    public void setReplenishmentProposalCancelProperties(ReplenishmentProposalCancelPropertiesType value) {
        this.replenishmentProposalCancelProperties = value;
    }

    /**
     * Gets the value of the replenishmentProposalCancelPartners property.
     * 
     * @return
     *     possible object is
     *     {@link ReplenishmentProposalCancelPartnersType }
     *     
     */
    public ReplenishmentProposalCancelPartnersType getReplenishmentProposalCancelPartners() {
        return replenishmentProposalCancelPartners;
    }

    /**
     * Sets the value of the replenishmentProposalCancelPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplenishmentProposalCancelPartnersType }
     *     
     */
    public void setReplenishmentProposalCancelPartners(ReplenishmentProposalCancelPartnersType value) {
        this.replenishmentProposalCancelPartners = value;
    }

    /**
     * Gets the value of the replenishmentProposalCancelDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReplenishmentProposalCancelDetailsType }
     *     
     */
    public ReplenishmentProposalCancelDetailsType getReplenishmentProposalCancelDetails() {
        return replenishmentProposalCancelDetails;
    }

    /**
     * Sets the value of the replenishmentProposalCancelDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplenishmentProposalCancelDetailsType }
     *     
     */
    public void setReplenishmentProposalCancelDetails(ReplenishmentProposalCancelDetailsType value) {
        this.replenishmentProposalCancelDetails = value;
    }

}

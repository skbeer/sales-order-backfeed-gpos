
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplenishmentProposalChangeBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplenishmentProposalChangeBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReplenishmentProposalChangeProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReplenishmentProposalChangePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReplenishmentProposalChangeDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplenishmentProposalChangeBodyType", propOrder = {
    "replenishmentProposalChangeProperties",
    "replenishmentProposalChangePartners",
    "replenishmentProposalChangeDetails"
})
public class ReplenishmentProposalChangeBodyType {

    @XmlElement(name = "ReplenishmentProposalChangeProperties", required = true)
    protected ReplenishmentProposalChangePropertiesType replenishmentProposalChangeProperties;
    @XmlElement(name = "ReplenishmentProposalChangePartners", required = true)
    protected ReplenishmentProposalChangePartnersType replenishmentProposalChangePartners;
    @XmlElement(name = "ReplenishmentProposalChangeDetails", required = true)
    protected ReplenishmentProposalChangeDetailsType replenishmentProposalChangeDetails;

    /**
     * Gets the value of the replenishmentProposalChangeProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ReplenishmentProposalChangePropertiesType }
     *     
     */
    public ReplenishmentProposalChangePropertiesType getReplenishmentProposalChangeProperties() {
        return replenishmentProposalChangeProperties;
    }

    /**
     * Sets the value of the replenishmentProposalChangeProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplenishmentProposalChangePropertiesType }
     *     
     */
    public void setReplenishmentProposalChangeProperties(ReplenishmentProposalChangePropertiesType value) {
        this.replenishmentProposalChangeProperties = value;
    }

    /**
     * Gets the value of the replenishmentProposalChangePartners property.
     * 
     * @return
     *     possible object is
     *     {@link ReplenishmentProposalChangePartnersType }
     *     
     */
    public ReplenishmentProposalChangePartnersType getReplenishmentProposalChangePartners() {
        return replenishmentProposalChangePartners;
    }

    /**
     * Sets the value of the replenishmentProposalChangePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplenishmentProposalChangePartnersType }
     *     
     */
    public void setReplenishmentProposalChangePartners(ReplenishmentProposalChangePartnersType value) {
        this.replenishmentProposalChangePartners = value;
    }

    /**
     * Gets the value of the replenishmentProposalChangeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReplenishmentProposalChangeDetailsType }
     *     
     */
    public ReplenishmentProposalChangeDetailsType getReplenishmentProposalChangeDetails() {
        return replenishmentProposalChangeDetails;
    }

    /**
     * Sets the value of the replenishmentProposalChangeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplenishmentProposalChangeDetailsType }
     *     
     */
    public void setReplenishmentProposalChangeDetails(ReplenishmentProposalChangeDetailsType value) {
        this.replenishmentProposalChangeDetails = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplyPlanResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplyPlanResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SupplyPlanResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SupplyPlanResponsePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SupplyPlanResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyPlanResponseBodyType", propOrder = {
    "supplyPlanResponseProperties",
    "supplyPlanResponsePartners",
    "supplyPlanResponseDetails"
})
public class SupplyPlanResponseBodyType {

    @XmlElement(name = "SupplyPlanResponseProperties", required = true)
    protected SupplyPlanResponsePropertiesType supplyPlanResponseProperties;
    @XmlElement(name = "SupplyPlanResponsePartners", required = true)
    protected SupplyPlanResponsePartnersType supplyPlanResponsePartners;
    @XmlElement(name = "SupplyPlanResponseDetails", required = true)
    protected SupplyPlanResponseDetailsType supplyPlanResponseDetails;

    /**
     * Gets the value of the supplyPlanResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyPlanResponsePropertiesType }
     *     
     */
    public SupplyPlanResponsePropertiesType getSupplyPlanResponseProperties() {
        return supplyPlanResponseProperties;
    }

    /**
     * Sets the value of the supplyPlanResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyPlanResponsePropertiesType }
     *     
     */
    public void setSupplyPlanResponseProperties(SupplyPlanResponsePropertiesType value) {
        this.supplyPlanResponseProperties = value;
    }

    /**
     * Gets the value of the supplyPlanResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyPlanResponsePartnersType }
     *     
     */
    public SupplyPlanResponsePartnersType getSupplyPlanResponsePartners() {
        return supplyPlanResponsePartners;
    }

    /**
     * Sets the value of the supplyPlanResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyPlanResponsePartnersType }
     *     
     */
    public void setSupplyPlanResponsePartners(SupplyPlanResponsePartnersType value) {
        this.supplyPlanResponsePartners = value;
    }

    /**
     * Gets the value of the supplyPlanResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyPlanResponseDetailsType }
     *     
     */
    public SupplyPlanResponseDetailsType getSupplyPlanResponseDetails() {
        return supplyPlanResponseDetails;
    }

    /**
     * Sets the value of the supplyPlanResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyPlanResponseDetailsType }
     *     
     */
    public void setSupplyPlanResponseDetails(SupplyPlanResponseDetailsType value) {
        this.supplyPlanResponseDetails = value;
    }

}

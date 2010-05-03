
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplyPlanBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplyPlanBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SupplyPlanProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SupplyPlanPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SupplyPlanDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyPlanBodyType", propOrder = {
    "supplyPlanProperties",
    "supplyPlanPartners",
    "supplyPlanDetails"
})
public class SupplyPlanBodyType {

    @XmlElement(name = "SupplyPlanProperties", required = true)
    protected SupplyPlanPropertiesType supplyPlanProperties;
    @XmlElement(name = "SupplyPlanPartners", required = true)
    protected SupplyPlanPartnersType supplyPlanPartners;
    @XmlElement(name = "SupplyPlanDetails", required = true)
    protected SupplyPlanDetailsType supplyPlanDetails;

    /**
     * Gets the value of the supplyPlanProperties property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyPlanPropertiesType }
     *     
     */
    public SupplyPlanPropertiesType getSupplyPlanProperties() {
        return supplyPlanProperties;
    }

    /**
     * Sets the value of the supplyPlanProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyPlanPropertiesType }
     *     
     */
    public void setSupplyPlanProperties(SupplyPlanPropertiesType value) {
        this.supplyPlanProperties = value;
    }

    /**
     * Gets the value of the supplyPlanPartners property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyPlanPartnersType }
     *     
     */
    public SupplyPlanPartnersType getSupplyPlanPartners() {
        return supplyPlanPartners;
    }

    /**
     * Sets the value of the supplyPlanPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyPlanPartnersType }
     *     
     */
    public void setSupplyPlanPartners(SupplyPlanPartnersType value) {
        this.supplyPlanPartners = value;
    }

    /**
     * Gets the value of the supplyPlanDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyPlanDetailsType }
     *     
     */
    public SupplyPlanDetailsType getSupplyPlanDetails() {
        return supplyPlanDetails;
    }

    /**
     * Sets the value of the supplyPlanDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyPlanDetailsType }
     *     
     */
    public void setSupplyPlanDetails(SupplyPlanDetailsType value) {
        this.supplyPlanDetails = value;
    }

}

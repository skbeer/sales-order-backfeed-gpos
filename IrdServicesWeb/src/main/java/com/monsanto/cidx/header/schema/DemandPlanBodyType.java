
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DemandPlanBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DemandPlanBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DemandPlanProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DemandPlanPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DemandPlanDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemandPlanBodyType", propOrder = {
    "demandPlanProperties",
    "demandPlanPartners",
    "demandPlanDetails"
})
public class DemandPlanBodyType {

    @XmlElement(name = "DemandPlanProperties", required = true)
    protected DemandPlanPropertiesType demandPlanProperties;
    @XmlElement(name = "DemandPlanPartners", required = true)
    protected DemandPlanPartnersType demandPlanPartners;
    @XmlElement(name = "DemandPlanDetails", required = true)
    protected DemandPlanDetailsType demandPlanDetails;

    /**
     * Gets the value of the demandPlanProperties property.
     * 
     * @return
     *     possible object is
     *     {@link DemandPlanPropertiesType }
     *     
     */
    public DemandPlanPropertiesType getDemandPlanProperties() {
        return demandPlanProperties;
    }

    /**
     * Sets the value of the demandPlanProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandPlanPropertiesType }
     *     
     */
    public void setDemandPlanProperties(DemandPlanPropertiesType value) {
        this.demandPlanProperties = value;
    }

    /**
     * Gets the value of the demandPlanPartners property.
     * 
     * @return
     *     possible object is
     *     {@link DemandPlanPartnersType }
     *     
     */
    public DemandPlanPartnersType getDemandPlanPartners() {
        return demandPlanPartners;
    }

    /**
     * Sets the value of the demandPlanPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandPlanPartnersType }
     *     
     */
    public void setDemandPlanPartners(DemandPlanPartnersType value) {
        this.demandPlanPartners = value;
    }

    /**
     * Gets the value of the demandPlanDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DemandPlanDetailsType }
     *     
     */
    public DemandPlanDetailsType getDemandPlanDetails() {
        return demandPlanDetails;
    }

    /**
     * Sets the value of the demandPlanDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandPlanDetailsType }
     *     
     */
    public void setDemandPlanDetails(DemandPlanDetailsType value) {
        this.demandPlanDetails = value;
    }

}

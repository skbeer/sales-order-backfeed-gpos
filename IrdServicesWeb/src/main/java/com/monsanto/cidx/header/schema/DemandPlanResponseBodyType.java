
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DemandPlanResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DemandPlanResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DemandPlanResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DemandPlanResponsePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DemandPlanResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemandPlanResponseBodyType", propOrder = {
    "demandPlanResponseProperties",
    "demandPlanResponsePartners",
    "demandPlanResponseDetails"
})
public class DemandPlanResponseBodyType {

    @XmlElement(name = "DemandPlanResponseProperties", required = true)
    protected DemandPlanResponsePropertiesType demandPlanResponseProperties;
    @XmlElement(name = "DemandPlanResponsePartners", required = true)
    protected DemandPlanResponsePartnersType demandPlanResponsePartners;
    @XmlElement(name = "DemandPlanResponseDetails", required = true)
    protected DemandPlanResponseDetailsType demandPlanResponseDetails;

    /**
     * Gets the value of the demandPlanResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link DemandPlanResponsePropertiesType }
     *     
     */
    public DemandPlanResponsePropertiesType getDemandPlanResponseProperties() {
        return demandPlanResponseProperties;
    }

    /**
     * Sets the value of the demandPlanResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandPlanResponsePropertiesType }
     *     
     */
    public void setDemandPlanResponseProperties(DemandPlanResponsePropertiesType value) {
        this.demandPlanResponseProperties = value;
    }

    /**
     * Gets the value of the demandPlanResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link DemandPlanResponsePartnersType }
     *     
     */
    public DemandPlanResponsePartnersType getDemandPlanResponsePartners() {
        return demandPlanResponsePartners;
    }

    /**
     * Sets the value of the demandPlanResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandPlanResponsePartnersType }
     *     
     */
    public void setDemandPlanResponsePartners(DemandPlanResponsePartnersType value) {
        this.demandPlanResponsePartners = value;
    }

    /**
     * Gets the value of the demandPlanResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DemandPlanResponseDetailsType }
     *     
     */
    public DemandPlanResponseDetailsType getDemandPlanResponseDetails() {
        return demandPlanResponseDetails;
    }

    /**
     * Sets the value of the demandPlanResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandPlanResponseDetailsType }
     *     
     */
    public void setDemandPlanResponseDetails(DemandPlanResponseDetailsType value) {
        this.demandPlanResponseDetails = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DemandForecastBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DemandForecastBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DemandForecastProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DemandForecastPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DemandForecastDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemandForecastBodyType", propOrder = {
    "demandForecastProperties",
    "demandForecastPartners",
    "demandForecastDetails"
})
public class DemandForecastBodyType {

    @XmlElement(name = "DemandForecastProperties", required = true)
    protected DemandForecastPropertiesType demandForecastProperties;
    @XmlElement(name = "DemandForecastPartners", required = true)
    protected DemandForecastPartnersType demandForecastPartners;
    @XmlElement(name = "DemandForecastDetails", required = true)
    protected DemandForecastDetailsType demandForecastDetails;

    /**
     * Gets the value of the demandForecastProperties property.
     * 
     * @return
     *     possible object is
     *     {@link DemandForecastPropertiesType }
     *     
     */
    public DemandForecastPropertiesType getDemandForecastProperties() {
        return demandForecastProperties;
    }

    /**
     * Sets the value of the demandForecastProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandForecastPropertiesType }
     *     
     */
    public void setDemandForecastProperties(DemandForecastPropertiesType value) {
        this.demandForecastProperties = value;
    }

    /**
     * Gets the value of the demandForecastPartners property.
     * 
     * @return
     *     possible object is
     *     {@link DemandForecastPartnersType }
     *     
     */
    public DemandForecastPartnersType getDemandForecastPartners() {
        return demandForecastPartners;
    }

    /**
     * Sets the value of the demandForecastPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandForecastPartnersType }
     *     
     */
    public void setDemandForecastPartners(DemandForecastPartnersType value) {
        this.demandForecastPartners = value;
    }

    /**
     * Gets the value of the demandForecastDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DemandForecastDetailsType }
     *     
     */
    public DemandForecastDetailsType getDemandForecastDetails() {
        return demandForecastDetails;
    }

    /**
     * Sets the value of the demandForecastDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandForecastDetailsType }
     *     
     */
    public void setDemandForecastDetails(DemandForecastDetailsType value) {
        this.demandForecastDetails = value;
    }

}

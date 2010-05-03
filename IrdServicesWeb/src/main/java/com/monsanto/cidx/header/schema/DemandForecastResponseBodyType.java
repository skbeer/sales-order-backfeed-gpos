
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DemandForecastResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DemandForecastResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DemandForecastResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DemandForecastResponsePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DemandForecastResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemandForecastResponseBodyType", propOrder = {
    "demandForecastResponseProperties",
    "demandForecastResponsePartners",
    "demandForecastResponseDetails"
})
public class DemandForecastResponseBodyType {

    @XmlElement(name = "DemandForecastResponseProperties", required = true)
    protected DemandForecastResponsePropertiesType demandForecastResponseProperties;
    @XmlElement(name = "DemandForecastResponsePartners", required = true)
    protected DemandForecastResponsePartnersType demandForecastResponsePartners;
    @XmlElement(name = "DemandForecastResponseDetails", required = true)
    protected DemandForecastResponseDetailsType demandForecastResponseDetails;

    /**
     * Gets the value of the demandForecastResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link DemandForecastResponsePropertiesType }
     *     
     */
    public DemandForecastResponsePropertiesType getDemandForecastResponseProperties() {
        return demandForecastResponseProperties;
    }

    /**
     * Sets the value of the demandForecastResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandForecastResponsePropertiesType }
     *     
     */
    public void setDemandForecastResponseProperties(DemandForecastResponsePropertiesType value) {
        this.demandForecastResponseProperties = value;
    }

    /**
     * Gets the value of the demandForecastResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link DemandForecastResponsePartnersType }
     *     
     */
    public DemandForecastResponsePartnersType getDemandForecastResponsePartners() {
        return demandForecastResponsePartners;
    }

    /**
     * Sets the value of the demandForecastResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandForecastResponsePartnersType }
     *     
     */
    public void setDemandForecastResponsePartners(DemandForecastResponsePartnersType value) {
        this.demandForecastResponsePartners = value;
    }

    /**
     * Gets the value of the demandForecastResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DemandForecastResponseDetailsType }
     *     
     */
    public DemandForecastResponseDetailsType getDemandForecastResponseDetails() {
        return demandForecastResponseDetails;
    }

    /**
     * Sets the value of the demandForecastResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandForecastResponseDetailsType }
     *     
     */
    public void setDemandForecastResponseDetails(DemandForecastResponseDetailsType value) {
        this.demandForecastResponseDetails = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostSupportResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostSupportResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportResponsePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostSupportResponseBodyType", propOrder = {
    "costSupportResponseProperties",
    "costSupportResponsePartners",
    "costSupportResponseDetails"
})
public class CostSupportResponseBodyType {

    @XmlElement(name = "CostSupportResponseProperties", required = true)
    protected CostSupportResponsePropertiesType costSupportResponseProperties;
    @XmlElement(name = "CostSupportResponsePartners", required = true)
    protected CostSupportResponsePartnersType costSupportResponsePartners;
    @XmlElement(name = "CostSupportResponseDetails", required = true)
    protected CostSupportResponseDetailsType costSupportResponseDetails;

    /**
     * Gets the value of the costSupportResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportResponsePropertiesType }
     *     
     */
    public CostSupportResponsePropertiesType getCostSupportResponseProperties() {
        return costSupportResponseProperties;
    }

    /**
     * Sets the value of the costSupportResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportResponsePropertiesType }
     *     
     */
    public void setCostSupportResponseProperties(CostSupportResponsePropertiesType value) {
        this.costSupportResponseProperties = value;
    }

    /**
     * Gets the value of the costSupportResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportResponsePartnersType }
     *     
     */
    public CostSupportResponsePartnersType getCostSupportResponsePartners() {
        return costSupportResponsePartners;
    }

    /**
     * Sets the value of the costSupportResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportResponsePartnersType }
     *     
     */
    public void setCostSupportResponsePartners(CostSupportResponsePartnersType value) {
        this.costSupportResponsePartners = value;
    }

    /**
     * Gets the value of the costSupportResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportResponseDetailsType }
     *     
     */
    public CostSupportResponseDetailsType getCostSupportResponseDetails() {
        return costSupportResponseDetails;
    }

    /**
     * Sets the value of the costSupportResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportResponseDetailsType }
     *     
     */
    public void setCostSupportResponseDetails(CostSupportResponseDetailsType value) {
        this.costSupportResponseDetails = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostSupportRequestChangeBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostSupportRequestChangeBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportRequestChangeProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportRequestChangePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportRequestChangeDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostSupportRequestChangeBodyType", propOrder = {
    "costSupportRequestChangeProperties",
    "costSupportRequestChangePartners",
    "costSupportRequestChangeDetails"
})
public class CostSupportRequestChangeBodyType {

    @XmlElement(name = "CostSupportRequestChangeProperties", required = true)
    protected CostSupportRequestChangePropertiesType costSupportRequestChangeProperties;
    @XmlElement(name = "CostSupportRequestChangePartners", required = true)
    protected CostSupportRequestChangePartnersType costSupportRequestChangePartners;
    @XmlElement(name = "CostSupportRequestChangeDetails", required = true)
    protected CostSupportRequestChangeDetailsType costSupportRequestChangeDetails;

    /**
     * Gets the value of the costSupportRequestChangeProperties property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportRequestChangePropertiesType }
     *     
     */
    public CostSupportRequestChangePropertiesType getCostSupportRequestChangeProperties() {
        return costSupportRequestChangeProperties;
    }

    /**
     * Sets the value of the costSupportRequestChangeProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportRequestChangePropertiesType }
     *     
     */
    public void setCostSupportRequestChangeProperties(CostSupportRequestChangePropertiesType value) {
        this.costSupportRequestChangeProperties = value;
    }

    /**
     * Gets the value of the costSupportRequestChangePartners property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportRequestChangePartnersType }
     *     
     */
    public CostSupportRequestChangePartnersType getCostSupportRequestChangePartners() {
        return costSupportRequestChangePartners;
    }

    /**
     * Sets the value of the costSupportRequestChangePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportRequestChangePartnersType }
     *     
     */
    public void setCostSupportRequestChangePartners(CostSupportRequestChangePartnersType value) {
        this.costSupportRequestChangePartners = value;
    }

    /**
     * Gets the value of the costSupportRequestChangeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportRequestChangeDetailsType }
     *     
     */
    public CostSupportRequestChangeDetailsType getCostSupportRequestChangeDetails() {
        return costSupportRequestChangeDetails;
    }

    /**
     * Sets the value of the costSupportRequestChangeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportRequestChangeDetailsType }
     *     
     */
    public void setCostSupportRequestChangeDetails(CostSupportRequestChangeDetailsType value) {
        this.costSupportRequestChangeDetails = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostSupportCreditResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostSupportCreditResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportCreditResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportCreditResponsePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CostSupportCreditResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostSupportCreditResponseBodyType", propOrder = {
    "costSupportCreditResponseProperties",
    "costSupportCreditResponsePartners",
    "costSupportCreditResponseDetails"
})
public class CostSupportCreditResponseBodyType {

    @XmlElement(name = "CostSupportCreditResponseProperties", required = true)
    protected CostSupportCreditResponsePropertiesType costSupportCreditResponseProperties;
    @XmlElement(name = "CostSupportCreditResponsePartners", required = true)
    protected CostSupportCreditResponsePartnersType costSupportCreditResponsePartners;
    @XmlElement(name = "CostSupportCreditResponseDetails", required = true)
    protected CostSupportCreditResponseDetailsType costSupportCreditResponseDetails;

    /**
     * Gets the value of the costSupportCreditResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportCreditResponsePropertiesType }
     *     
     */
    public CostSupportCreditResponsePropertiesType getCostSupportCreditResponseProperties() {
        return costSupportCreditResponseProperties;
    }

    /**
     * Sets the value of the costSupportCreditResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportCreditResponsePropertiesType }
     *     
     */
    public void setCostSupportCreditResponseProperties(CostSupportCreditResponsePropertiesType value) {
        this.costSupportCreditResponseProperties = value;
    }

    /**
     * Gets the value of the costSupportCreditResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportCreditResponsePartnersType }
     *     
     */
    public CostSupportCreditResponsePartnersType getCostSupportCreditResponsePartners() {
        return costSupportCreditResponsePartners;
    }

    /**
     * Sets the value of the costSupportCreditResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportCreditResponsePartnersType }
     *     
     */
    public void setCostSupportCreditResponsePartners(CostSupportCreditResponsePartnersType value) {
        this.costSupportCreditResponsePartners = value;
    }

    /**
     * Gets the value of the costSupportCreditResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CostSupportCreditResponseDetailsType }
     *     
     */
    public CostSupportCreditResponseDetailsType getCostSupportCreditResponseDetails() {
        return costSupportCreditResponseDetails;
    }

    /**
     * Sets the value of the costSupportCreditResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostSupportCreditResponseDetailsType }
     *     
     */
    public void setCostSupportCreditResponseDetails(CostSupportCreditResponseDetailsType value) {
        this.costSupportCreditResponseDetails = value;
    }

}

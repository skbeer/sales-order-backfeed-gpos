
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContractProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContractPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContractDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractBodyType", propOrder = {
    "contractProperties",
    "contractPartners",
    "contractDetails"
})
public class ContractBodyType {

    @XmlElement(name = "ContractProperties", required = true)
    protected ContractPropertiesType contractProperties;
    @XmlElement(name = "ContractPartners", required = true)
    protected ContractPartnersType contractPartners;
    @XmlElement(name = "ContractDetails", required = true)
    protected ContractDetailsType contractDetails;

    /**
     * Gets the value of the contractProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ContractPropertiesType }
     *     
     */
    public ContractPropertiesType getContractProperties() {
        return contractProperties;
    }

    /**
     * Sets the value of the contractProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractPropertiesType }
     *     
     */
    public void setContractProperties(ContractPropertiesType value) {
        this.contractProperties = value;
    }

    /**
     * Gets the value of the contractPartners property.
     * 
     * @return
     *     possible object is
     *     {@link ContractPartnersType }
     *     
     */
    public ContractPartnersType getContractPartners() {
        return contractPartners;
    }

    /**
     * Sets the value of the contractPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractPartnersType }
     *     
     */
    public void setContractPartners(ContractPartnersType value) {
        this.contractPartners = value;
    }

    /**
     * Gets the value of the contractDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDetailsType }
     *     
     */
    public ContractDetailsType getContractDetails() {
        return contractDetails;
    }

    /**
     * Sets the value of the contractDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDetailsType }
     *     
     */
    public void setContractDetails(ContractDetailsType value) {
        this.contractDetails = value;
    }

}

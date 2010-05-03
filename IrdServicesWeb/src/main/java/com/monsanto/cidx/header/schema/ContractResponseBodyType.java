
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractResponseBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractResponseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContractResponseProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContractResponsePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContractResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractResponseBodyType", propOrder = {
    "contractResponseProperties",
    "contractResponsePartners",
    "contractResponseDetails"
})
public class ContractResponseBodyType {

    @XmlElement(name = "ContractResponseProperties", required = true)
    protected ContractResponsePropertiesType contractResponseProperties;
    @XmlElement(name = "ContractResponsePartners", required = true)
    protected ContractResponsePartnersType contractResponsePartners;
    @XmlElement(name = "ContractResponseDetails", required = true)
    protected ContractResponseDetailsType contractResponseDetails;

    /**
     * Gets the value of the contractResponseProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ContractResponsePropertiesType }
     *     
     */
    public ContractResponsePropertiesType getContractResponseProperties() {
        return contractResponseProperties;
    }

    /**
     * Sets the value of the contractResponseProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractResponsePropertiesType }
     *     
     */
    public void setContractResponseProperties(ContractResponsePropertiesType value) {
        this.contractResponseProperties = value;
    }

    /**
     * Gets the value of the contractResponsePartners property.
     * 
     * @return
     *     possible object is
     *     {@link ContractResponsePartnersType }
     *     
     */
    public ContractResponsePartnersType getContractResponsePartners() {
        return contractResponsePartners;
    }

    /**
     * Sets the value of the contractResponsePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractResponsePartnersType }
     *     
     */
    public void setContractResponsePartners(ContractResponsePartnersType value) {
        this.contractResponsePartners = value;
    }

    /**
     * Gets the value of the contractResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContractResponseDetailsType }
     *     
     */
    public ContractResponseDetailsType getContractResponseDetails() {
        return contractResponseDetails;
    }

    /**
     * Sets the value of the contractResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractResponseDetailsType }
     *     
     */
    public void setContractResponseDetails(ContractResponseDetailsType value) {
        this.contractResponseDetails = value;
    }

}

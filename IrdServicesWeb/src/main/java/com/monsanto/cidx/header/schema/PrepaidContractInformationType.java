
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepaidContractInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrepaidContractInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContractAmount"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContractProductInformation"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepaidContractInformationType", propOrder = {
    "contractAmount",
    "contractProductInformation"
})
public class PrepaidContractInformationType {

    @XmlElement(name = "ContractAmount")
    protected ContractAmountType contractAmount;
    @XmlElement(name = "ContractProductInformation")
    protected ContractProductInformationType contractProductInformation;

    /**
     * Gets the value of the contractAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ContractAmountType }
     *     
     */
    public ContractAmountType getContractAmount() {
        return contractAmount;
    }

    /**
     * Sets the value of the contractAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractAmountType }
     *     
     */
    public void setContractAmount(ContractAmountType value) {
        this.contractAmount = value;
    }

    /**
     * Gets the value of the contractProductInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContractProductInformationType }
     *     
     */
    public ContractProductInformationType getContractProductInformation() {
        return contractProductInformation;
    }

    /**
     * Sets the value of the contractProductInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractProductInformationType }
     *     
     */
    public void setContractProductInformation(ContractProductInformationType value) {
        this.contractProductInformation = value;
    }

}

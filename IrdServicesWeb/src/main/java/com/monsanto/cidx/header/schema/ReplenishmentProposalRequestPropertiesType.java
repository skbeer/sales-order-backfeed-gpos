
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ReplenishmentProposalRequestPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplenishmentProposalRequestPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LanguageCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReplenishmentProposalInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContractInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PurchaseOrderInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarketPlaceInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplenishmentProposalRequestPropertiesType", propOrder = {
    "languageCode",
    "replenishmentProposalInformation",
    "contractInformation",
    "purchaseOrderInformation",
    "marketPlaceInformation"
})
public class ReplenishmentProposalRequestPropertiesType {

    @XmlElement(name = "LanguageCode", required = true)
    protected LanguageCodeType languageCode;
    @XmlElement(name = "ReplenishmentProposalInformation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String replenishmentProposalInformation;
    @XmlElement(name = "ContractInformation")
    protected ContractInformationType contractInformation;
    @XmlElement(name = "PurchaseOrderInformation")
    protected PurchaseOrderInformationType purchaseOrderInformation;
    @XmlElement(name = "MarketPlaceInformation")
    protected MarketPlaceInformationType marketPlaceInformation;

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setLanguageCode(LanguageCodeType value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the replenishmentProposalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplenishmentProposalInformation() {
        return replenishmentProposalInformation;
    }

    /**
     * Sets the value of the replenishmentProposalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplenishmentProposalInformation(String value) {
        this.replenishmentProposalInformation = value;
    }

    /**
     * Gets the value of the contractInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContractInformationType }
     *     
     */
    public ContractInformationType getContractInformation() {
        return contractInformation;
    }

    /**
     * Sets the value of the contractInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractInformationType }
     *     
     */
    public void setContractInformation(ContractInformationType value) {
        this.contractInformation = value;
    }

    /**
     * Gets the value of the purchaseOrderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderInformationType }
     *     
     */
    public PurchaseOrderInformationType getPurchaseOrderInformation() {
        return purchaseOrderInformation;
    }

    /**
     * Sets the value of the purchaseOrderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderInformationType }
     *     
     */
    public void setPurchaseOrderInformation(PurchaseOrderInformationType value) {
        this.purchaseOrderInformation = value;
    }

    /**
     * Gets the value of the marketPlaceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MarketPlaceInformationType }
     *     
     */
    public MarketPlaceInformationType getMarketPlaceInformation() {
        return marketPlaceInformation;
    }

    /**
     * Sets the value of the marketPlaceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketPlaceInformationType }
     *     
     */
    public void setMarketPlaceInformation(MarketPlaceInformationType value) {
        this.marketPlaceInformation = value;
    }

}

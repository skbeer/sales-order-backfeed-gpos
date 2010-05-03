
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PriceSheetPriceDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceSheetPriceDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceApplicabilityCriteria"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ListPrice"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentTermsID" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceSheetPriceDataType", propOrder = {
    "priceApplicabilityCriteria",
    "listPrice",
    "paymentTermsID",
    "specialInstructions"
})
public class PriceSheetPriceDataType {

    @XmlElement(name = "PriceApplicabilityCriteria", required = true)
    protected PriceApplicabilityCriteriaType priceApplicabilityCriteria;
    @XmlElement(name = "ListPrice", required = true)
    protected ListPriceType listPrice;
    @XmlElement(name = "PaymentTermsID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String paymentTermsID;
    @XmlElement(name = "SpecialInstructions")
    protected SpecialInstructionsType specialInstructions;

    /**
     * Gets the value of the priceApplicabilityCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PriceApplicabilityCriteriaType }
     *     
     */
    public PriceApplicabilityCriteriaType getPriceApplicabilityCriteria() {
        return priceApplicabilityCriteria;
    }

    /**
     * Sets the value of the priceApplicabilityCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceApplicabilityCriteriaType }
     *     
     */
    public void setPriceApplicabilityCriteria(PriceApplicabilityCriteriaType value) {
        this.priceApplicabilityCriteria = value;
    }

    /**
     * Gets the value of the listPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ListPriceType }
     *     
     */
    public ListPriceType getListPrice() {
        return listPrice;
    }

    /**
     * Sets the value of the listPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPriceType }
     *     
     */
    public void setListPrice(ListPriceType value) {
        this.listPrice = value;
    }

    /**
     * Gets the value of the paymentTermsID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTermsID() {
        return paymentTermsID;
    }

    /**
     * Sets the value of the paymentTermsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTermsID(String value) {
        this.paymentTermsID = value;
    }

    /**
     * Gets the value of the specialInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialInstructionsType }
     *     
     */
    public SpecialInstructionsType getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Sets the value of the specialInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialInstructionsType }
     *     
     */
    public void setSpecialInstructions(SpecialInstructionsType value) {
        this.specialInstructions = value;
    }

}

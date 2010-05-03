
package com.monsanto.cidx.header.schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PaymentTermsGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTermsGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentTermsID"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TermsOfSaleDescription"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentTermsBasisDateCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TermsOfSale" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Penalty" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceApplicabilityCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTermsGroupType", propOrder = {
    "paymentTermsID",
    "termsOfSaleDescription",
    "paymentTermsBasisDateCode",
    "termsOfSale",
    "penalty",
    "specialInstructions",
    "priceApplicabilityCriteria"
})
public class PaymentTermsGroupType {

    @XmlElement(name = "PaymentTermsID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String paymentTermsID;
    @XmlElement(name = "TermsOfSaleDescription", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String termsOfSaleDescription;
    @XmlElement(name = "PaymentTermsBasisDateCode")
    protected PaymentTermsBasisDateCodeType paymentTermsBasisDateCode;
    @XmlElement(name = "TermsOfSale", required = true)
    protected List<TermsOfSaleType> termsOfSale;
    @XmlElement(name = "Penalty")
    protected BigDecimal penalty;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "PriceApplicabilityCriteria")
    protected PriceApplicabilityCriteriaType priceApplicabilityCriteria;

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
     * Gets the value of the termsOfSaleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsOfSaleDescription() {
        return termsOfSaleDescription;
    }

    /**
     * Sets the value of the termsOfSaleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsOfSaleDescription(String value) {
        this.termsOfSaleDescription = value;
    }

    /**
     * Gets the value of the paymentTermsBasisDateCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsBasisDateCodeType }
     *     
     */
    public PaymentTermsBasisDateCodeType getPaymentTermsBasisDateCode() {
        return paymentTermsBasisDateCode;
    }

    /**
     * Sets the value of the paymentTermsBasisDateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsBasisDateCodeType }
     *     
     */
    public void setPaymentTermsBasisDateCode(PaymentTermsBasisDateCodeType value) {
        this.paymentTermsBasisDateCode = value;
    }

    /**
     * Gets the value of the termsOfSale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the termsOfSale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTermsOfSale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TermsOfSaleType }
     * 
     * 
     */
    public List<TermsOfSaleType> getTermsOfSale() {
        if (termsOfSale == null) {
            termsOfSale = new ArrayList<TermsOfSaleType>();
        }
        return this.termsOfSale;
    }

    /**
     * Gets the value of the penalty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenalty() {
        return penalty;
    }

    /**
     * Sets the value of the penalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenalty(BigDecimal value) {
        this.penalty = value;
    }

    /**
     * Gets the value of the specialInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialInstructionsType }
     * 
     * 
     */
    public List<SpecialInstructionsType> getSpecialInstructions() {
        if (specialInstructions == null) {
            specialInstructions = new ArrayList<SpecialInstructionsType>();
        }
        return this.specialInstructions;
    }

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

}

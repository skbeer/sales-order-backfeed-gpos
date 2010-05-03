
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AllowanceChargeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllowanceChargeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AllowanceChargeID" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AllowanceChargeIndicator"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AllowanceChargeType"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxOrDuty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AllowanceChargeCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AllowanceChargeDescription"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AllowanceChargeAmount"/>
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
@XmlType(name = "AllowanceChargeType", propOrder = {
    "allowanceChargeID",
    "allowanceChargeIndicator",
    "allowanceChargeType",
    "taxOrDuty",
    "allowanceChargeCode",
    "allowanceChargeDescription",
    "allowanceChargeAmount",
    "priceApplicabilityCriteria"
})
public class AllowanceChargeType {

    @XmlElement(name = "AllowanceChargeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String allowanceChargeID;
    @XmlElement(name = "AllowanceChargeIndicator", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String allowanceChargeIndicator;
    @XmlElement(name = "AllowanceChargeType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String allowanceChargeType;
    @XmlElement(name = "TaxOrDuty")
    protected List<TaxOrDutyType> taxOrDuty;
    @XmlElement(name = "AllowanceChargeCode", required = true)
    protected AllowanceChargeCodeType allowanceChargeCode;
    @XmlElement(name = "AllowanceChargeDescription", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String allowanceChargeDescription;
    @XmlElement(name = "AllowanceChargeAmount", required = true)
    protected AllowanceChargeAmountType allowanceChargeAmount;
    @XmlElement(name = "PriceApplicabilityCriteria")
    protected PriceApplicabilityCriteriaType priceApplicabilityCriteria;

    /**
     * Gets the value of the allowanceChargeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowanceChargeID() {
        return allowanceChargeID;
    }

    /**
     * Sets the value of the allowanceChargeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowanceChargeID(String value) {
        this.allowanceChargeID = value;
    }

    /**
     * Gets the value of the allowanceChargeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowanceChargeIndicator() {
        return allowanceChargeIndicator;
    }

    /**
     * Sets the value of the allowanceChargeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowanceChargeIndicator(String value) {
        this.allowanceChargeIndicator = value;
    }

    /**
     * Gets the value of the allowanceChargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowanceChargeType() {
        return allowanceChargeType;
    }

    /**
     * Sets the value of the allowanceChargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowanceChargeType(String value) {
        this.allowanceChargeType = value;
    }

    /**
     * Gets the value of the taxOrDuty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxOrDuty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxOrDuty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxOrDutyType }
     * 
     * 
     */
    public List<TaxOrDutyType> getTaxOrDuty() {
        if (taxOrDuty == null) {
            taxOrDuty = new ArrayList<TaxOrDutyType>();
        }
        return this.taxOrDuty;
    }

    /**
     * Gets the value of the allowanceChargeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AllowanceChargeCodeType }
     *     
     */
    public AllowanceChargeCodeType getAllowanceChargeCode() {
        return allowanceChargeCode;
    }

    /**
     * Sets the value of the allowanceChargeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceChargeCodeType }
     *     
     */
    public void setAllowanceChargeCode(AllowanceChargeCodeType value) {
        this.allowanceChargeCode = value;
    }

    /**
     * Gets the value of the allowanceChargeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowanceChargeDescription() {
        return allowanceChargeDescription;
    }

    /**
     * Sets the value of the allowanceChargeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowanceChargeDescription(String value) {
        this.allowanceChargeDescription = value;
    }

    /**
     * Gets the value of the allowanceChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AllowanceChargeAmountType }
     *     
     */
    public AllowanceChargeAmountType getAllowanceChargeAmount() {
        return allowanceChargeAmount;
    }

    /**
     * Sets the value of the allowanceChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceChargeAmountType }
     *     
     */
    public void setAllowanceChargeAmount(AllowanceChargeAmountType value) {
        this.allowanceChargeAmount = value;
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

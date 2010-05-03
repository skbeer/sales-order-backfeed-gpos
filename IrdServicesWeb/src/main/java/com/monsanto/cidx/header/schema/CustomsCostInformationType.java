
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomsCostInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsCostInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Pricing" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Allowances" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxOrDuty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsCostInformationType", propOrder = {
    "pricing",
    "allowances",
    "taxOrDuty"
})
public class CustomsCostInformationType {

    @XmlElement(name = "Pricing", required = true)
    protected List<PricingType> pricing;
    @XmlElement(name = "Allowances")
    protected List<AllowancesType> allowances;
    @XmlElement(name = "TaxOrDuty")
    protected List<TaxOrDutyType> taxOrDuty;

    /**
     * Gets the value of the pricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingType }
     * 
     * 
     */
    public List<PricingType> getPricing() {
        if (pricing == null) {
            pricing = new ArrayList<PricingType>();
        }
        return this.pricing;
    }

    /**
     * Gets the value of the allowances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowancesType }
     * 
     * 
     */
    public List<AllowancesType> getAllowances() {
        if (allowances == null) {
            allowances = new ArrayList<AllowancesType>();
        }
        return this.allowances;
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

}

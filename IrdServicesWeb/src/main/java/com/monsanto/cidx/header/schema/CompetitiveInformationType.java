
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
 * <p>Java class for CompetitiveInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompetitiveInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Distributor"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SoldTo"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductDescription" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Pricing" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTerms"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompetitiveInformationType", propOrder = {
    "distributor",
    "soldTo",
    "productDescription",
    "pricing",
    "deliveryTerms",
    "comment"
})
public class CompetitiveInformationType {

    @XmlElement(name = "Distributor", required = true)
    protected DistributorType distributor;
    @XmlElement(name = "SoldTo", required = true)
    protected SoldToType soldTo;
    @XmlElement(name = "ProductDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String productDescription;
    @XmlElement(name = "Pricing", required = true)
    protected List<PricingType> pricing;
    @XmlElement(name = "DeliveryTerms", required = true)
    protected DeliveryTermsType deliveryTerms;
    @XmlElement(name = "Comment")
    protected List<CommentType> comment;

    /**
     * Gets the value of the distributor property.
     * 
     * @return
     *     possible object is
     *     {@link DistributorType }
     *     
     */
    public DistributorType getDistributor() {
        return distributor;
    }

    /**
     * Sets the value of the distributor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributorType }
     *     
     */
    public void setDistributor(DistributorType value) {
        this.distributor = value;
    }

    /**
     * Gets the value of the soldTo property.
     * 
     * @return
     *     possible object is
     *     {@link SoldToType }
     *     
     */
    public SoldToType getSoldTo() {
        return soldTo;
    }

    /**
     * Sets the value of the soldTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoldToType }
     *     
     */
    public void setSoldTo(SoldToType value) {
        this.soldTo = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

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
     * Gets the value of the deliveryTerms property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryTermsType }
     *     
     */
    public DeliveryTermsType getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * Sets the value of the deliveryTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryTermsType }
     *     
     */
    public void setDeliveryTerms(DeliveryTermsType value) {
        this.deliveryTerms = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentType }
     * 
     * 
     */
    public List<CommentType> getComment() {
        if (comment == null) {
            comment = new ArrayList<CommentType>();
        }
        return this.comment;
    }

}

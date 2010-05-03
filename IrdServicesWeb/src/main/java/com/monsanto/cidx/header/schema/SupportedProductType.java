
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
 * <p>Java class for SupportedProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupportedProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductIdentification" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MinimumOrderQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProjectedVolume"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductEndUse" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PercentageOfBlend" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SellingPrice"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DistributorCost"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTerms"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportedProductType", propOrder = {
    "productIdentification",
    "minimumOrderQuantity",
    "projectedVolume",
    "productEndUse",
    "percentageOfBlend",
    "sellingPrice",
    "distributorCost",
    "deliveryTerms"
})
public class SupportedProductType {

    @XmlElement(name = "ProductIdentification", required = true)
    protected List<ProductIdentificationType> productIdentification;
    @XmlElement(name = "MinimumOrderQuantity")
    protected MinimumOrderQuantityType minimumOrderQuantity;
    @XmlElement(name = "ProjectedVolume", required = true)
    protected ProjectedVolumeType projectedVolume;
    @XmlElement(name = "ProductEndUse")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String productEndUse;
    @XmlElement(name = "PercentageOfBlend")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String percentageOfBlend;
    @XmlElement(name = "SellingPrice", required = true)
    protected SellingPriceType sellingPrice;
    @XmlElement(name = "DistributorCost", required = true)
    protected DistributorCostType distributorCost;
    @XmlElement(name = "DeliveryTerms", required = true)
    protected DeliveryTermsType deliveryTerms;

    /**
     * Gets the value of the productIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentificationType }
     * 
     * 
     */
    public List<ProductIdentificationType> getProductIdentification() {
        if (productIdentification == null) {
            productIdentification = new ArrayList<ProductIdentificationType>();
        }
        return this.productIdentification;
    }

    /**
     * Gets the value of the minimumOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumOrderQuantityType }
     *     
     */
    public MinimumOrderQuantityType getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    /**
     * Sets the value of the minimumOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumOrderQuantityType }
     *     
     */
    public void setMinimumOrderQuantity(MinimumOrderQuantityType value) {
        this.minimumOrderQuantity = value;
    }

    /**
     * Gets the value of the projectedVolume property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectedVolumeType }
     *     
     */
    public ProjectedVolumeType getProjectedVolume() {
        return projectedVolume;
    }

    /**
     * Sets the value of the projectedVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectedVolumeType }
     *     
     */
    public void setProjectedVolume(ProjectedVolumeType value) {
        this.projectedVolume = value;
    }

    /**
     * Gets the value of the productEndUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductEndUse() {
        return productEndUse;
    }

    /**
     * Sets the value of the productEndUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductEndUse(String value) {
        this.productEndUse = value;
    }

    /**
     * Gets the value of the percentageOfBlend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentageOfBlend() {
        return percentageOfBlend;
    }

    /**
     * Sets the value of the percentageOfBlend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentageOfBlend(String value) {
        this.percentageOfBlend = value;
    }

    /**
     * Gets the value of the sellingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SellingPriceType }
     *     
     */
    public SellingPriceType getSellingPrice() {
        return sellingPrice;
    }

    /**
     * Sets the value of the sellingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingPriceType }
     *     
     */
    public void setSellingPrice(SellingPriceType value) {
        this.sellingPrice = value;
    }

    /**
     * Gets the value of the distributorCost property.
     * 
     * @return
     *     possible object is
     *     {@link DistributorCostType }
     *     
     */
    public DistributorCostType getDistributorCost() {
        return distributorCost;
    }

    /**
     * Sets the value of the distributorCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributorCostType }
     *     
     */
    public void setDistributorCost(DistributorCostType value) {
        this.distributorCost = value;
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

}

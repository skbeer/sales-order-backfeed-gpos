
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceApplicabilityCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceApplicabilityCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceType" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderFeatures" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductFeatures" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}GeographicFeatures" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceApplicabilityCriteriaType", propOrder = {
    "priceType",
    "orderFeatures",
    "productFeatures",
    "geographicFeatures"
})
public class PriceApplicabilityCriteriaType {

    @XmlElement(name = "PriceType")
    protected CidxListPriceType priceType;
    @XmlElement(name = "OrderFeatures")
    protected List<OrderFeaturesType> orderFeatures;
    @XmlElement(name = "ProductFeatures")
    protected ProductFeaturesType productFeatures;
    @XmlElement(name = "GeographicFeatures")
    protected GeographicFeaturesType geographicFeatures;

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListPriceType }
     *     
     */
    public CidxListPriceType getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListPriceType }
     *     
     */
    public void setPriceType(CidxListPriceType value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the orderFeatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderFeatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderFeaturesType }
     * 
     * 
     */
    public List<OrderFeaturesType> getOrderFeatures() {
        if (orderFeatures == null) {
            orderFeatures = new ArrayList<OrderFeaturesType>();
        }
        return this.orderFeatures;
    }

    /**
     * Gets the value of the productFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link ProductFeaturesType }
     *     
     */
    public ProductFeaturesType getProductFeatures() {
        return productFeatures;
    }

    /**
     * Sets the value of the productFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFeaturesType }
     *     
     */
    public void setProductFeatures(ProductFeaturesType value) {
        this.productFeatures = value;
    }

    /**
     * Gets the value of the geographicFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicFeaturesType }
     *     
     */
    public GeographicFeaturesType getGeographicFeatures() {
        return geographicFeatures;
    }

    /**
     * Sets the value of the geographicFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicFeaturesType }
     *     
     */
    public void setGeographicFeatures(GeographicFeaturesType value) {
        this.geographicFeatures = value;
    }

}

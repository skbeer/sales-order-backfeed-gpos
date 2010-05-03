
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProductCatalogUpdateProductLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCatalogUpdateProductLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductInformation"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CatalogEffectiveDates"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}FullDescription" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Keywords" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductFamilyName" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderLeadTime" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductCatalogPriceData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MinimumOrderQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ApproximateWeight" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NotAvailableInCountryCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShelfLife" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TechnicalSpecificationsURL" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MSDS" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RestrictedOrderFlag" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Restrictions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HAZMATCertificationRequired" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Regulations" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RoundingFactor" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LimitDisplayFlag"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Action" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListProductAttributeNameAgency" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCatalogUpdateProductLineItemType", propOrder = {
    "lineNumber",
    "productInformation",
    "catalogEffectiveDates",
    "fullDescription",
    "keywords",
    "productFamilyName",
    "orderLeadTime",
    "productCatalogPriceData",
    "minimumOrderQuantity",
    "approximateWeight",
    "specialInstructions",
    "notAvailableInCountryCode",
    "shelfLife",
    "technicalSpecificationsURL",
    "msds",
    "restrictedOrderFlag",
    "restrictions",
    "hazmatCertificationRequired",
    "regulations",
    "roundingFactor",
    "limitDisplayFlag"
})
public class ProductCatalogUpdateProductLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "ProductInformation", required = true)
    protected ProductInformationType productInformation;
    @XmlElement(name = "CatalogEffectiveDates", required = true)
    protected CatalogEffectiveDatesType catalogEffectiveDates;
    @XmlElement(name = "FullDescription", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> fullDescription;
    @XmlElement(name = "Keywords")
    protected KeywordsType keywords;
    @XmlElement(name = "ProductFamilyName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String productFamilyName;
    @XmlElement(name = "OrderLeadTime")
    protected OrderLeadTimeType orderLeadTime;
    @XmlElement(name = "ProductCatalogPriceData")
    protected List<ProductCatalogPriceDataType> productCatalogPriceData;
    @XmlElement(name = "MinimumOrderQuantity")
    protected MinimumOrderQuantityType minimumOrderQuantity;
    @XmlElement(name = "ApproximateWeight")
    protected ApproximateWeightType approximateWeight;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "NotAvailableInCountryCode")
    protected List<NotAvailableInCountryCodeType> notAvailableInCountryCode;
    @XmlElement(name = "ShelfLife")
    protected ShelfLifeType shelfLife;
    @XmlElement(name = "TechnicalSpecificationsURL")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String technicalSpecificationsURL;
    @XmlElement(name = "MSDS")
    protected MSDSType msds;
    @XmlElement(name = "RestrictedOrderFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String restrictedOrderFlag;
    @XmlElement(name = "Restrictions")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> restrictions;
    @XmlElement(name = "HAZMATCertificationRequired")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> hazmatCertificationRequired;
    @XmlElement(name = "Regulations")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> regulations;
    @XmlElement(name = "RoundingFactor")
    protected RoundingFactorType roundingFactor;
    @XmlElement(name = "LimitDisplayFlag", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String limitDisplayFlag;
    @XmlAttribute(name = "Action", required = true)
    protected CidxListProductAttributeNameAgency action;

    /**
     * Gets the value of the lineNumber property.
     * 
     */
    public long getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     */
    public void setLineNumber(long value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the productInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformationType }
     *     
     */
    public ProductInformationType getProductInformation() {
        return productInformation;
    }

    /**
     * Sets the value of the productInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformationType }
     *     
     */
    public void setProductInformation(ProductInformationType value) {
        this.productInformation = value;
    }

    /**
     * Gets the value of the catalogEffectiveDates property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogEffectiveDatesType }
     *     
     */
    public CatalogEffectiveDatesType getCatalogEffectiveDates() {
        return catalogEffectiveDates;
    }

    /**
     * Sets the value of the catalogEffectiveDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogEffectiveDatesType }
     *     
     */
    public void setCatalogEffectiveDates(CatalogEffectiveDatesType value) {
        this.catalogEffectiveDates = value;
    }

    /**
     * Gets the value of the fullDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fullDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFullDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFullDescription() {
        if (fullDescription == null) {
            fullDescription = new ArrayList<String>();
        }
        return this.fullDescription;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link KeywordsType }
     *     
     */
    public KeywordsType getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordsType }
     *     
     */
    public void setKeywords(KeywordsType value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the productFamilyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductFamilyName() {
        return productFamilyName;
    }

    /**
     * Sets the value of the productFamilyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductFamilyName(String value) {
        this.productFamilyName = value;
    }

    /**
     * Gets the value of the orderLeadTime property.
     * 
     * @return
     *     possible object is
     *     {@link OrderLeadTimeType }
     *     
     */
    public OrderLeadTimeType getOrderLeadTime() {
        return orderLeadTime;
    }

    /**
     * Sets the value of the orderLeadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderLeadTimeType }
     *     
     */
    public void setOrderLeadTime(OrderLeadTimeType value) {
        this.orderLeadTime = value;
    }

    /**
     * Gets the value of the productCatalogPriceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCatalogPriceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCatalogPriceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCatalogPriceDataType }
     * 
     * 
     */
    public List<ProductCatalogPriceDataType> getProductCatalogPriceData() {
        if (productCatalogPriceData == null) {
            productCatalogPriceData = new ArrayList<ProductCatalogPriceDataType>();
        }
        return this.productCatalogPriceData;
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
     * Gets the value of the approximateWeight property.
     * 
     * @return
     *     possible object is
     *     {@link ApproximateWeightType }
     *     
     */
    public ApproximateWeightType getApproximateWeight() {
        return approximateWeight;
    }

    /**
     * Sets the value of the approximateWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApproximateWeightType }
     *     
     */
    public void setApproximateWeight(ApproximateWeightType value) {
        this.approximateWeight = value;
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
     * Gets the value of the notAvailableInCountryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notAvailableInCountryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotAvailableInCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotAvailableInCountryCodeType }
     * 
     * 
     */
    public List<NotAvailableInCountryCodeType> getNotAvailableInCountryCode() {
        if (notAvailableInCountryCode == null) {
            notAvailableInCountryCode = new ArrayList<NotAvailableInCountryCodeType>();
        }
        return this.notAvailableInCountryCode;
    }

    /**
     * Gets the value of the shelfLife property.
     * 
     * @return
     *     possible object is
     *     {@link ShelfLifeType }
     *     
     */
    public ShelfLifeType getShelfLife() {
        return shelfLife;
    }

    /**
     * Sets the value of the shelfLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShelfLifeType }
     *     
     */
    public void setShelfLife(ShelfLifeType value) {
        this.shelfLife = value;
    }

    /**
     * Gets the value of the technicalSpecificationsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalSpecificationsURL() {
        return technicalSpecificationsURL;
    }

    /**
     * Sets the value of the technicalSpecificationsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalSpecificationsURL(String value) {
        this.technicalSpecificationsURL = value;
    }

    /**
     * Gets the value of the msds property.
     * 
     * @return
     *     possible object is
     *     {@link MSDSType }
     *     
     */
    public MSDSType getMSDS() {
        return msds;
    }

    /**
     * Sets the value of the msds property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSDSType }
     *     
     */
    public void setMSDS(MSDSType value) {
        this.msds = value;
    }

    /**
     * Gets the value of the restrictedOrderFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictedOrderFlag() {
        return restrictedOrderFlag;
    }

    /**
     * Sets the value of the restrictedOrderFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictedOrderFlag(String value) {
        this.restrictedOrderFlag = value;
    }

    /**
     * Gets the value of the restrictions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRestrictions() {
        if (restrictions == null) {
            restrictions = new ArrayList<String>();
        }
        return this.restrictions;
    }

    /**
     * Gets the value of the hazmatCertificationRequired property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazmatCertificationRequired property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHAZMATCertificationRequired().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHAZMATCertificationRequired() {
        if (hazmatCertificationRequired == null) {
            hazmatCertificationRequired = new ArrayList<String>();
        }
        return this.hazmatCertificationRequired;
    }

    /**
     * Gets the value of the regulations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRegulations() {
        if (regulations == null) {
            regulations = new ArrayList<String>();
        }
        return this.regulations;
    }

    /**
     * Gets the value of the roundingFactor property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingFactorType }
     *     
     */
    public RoundingFactorType getRoundingFactor() {
        return roundingFactor;
    }

    /**
     * Sets the value of the roundingFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingFactorType }
     *     
     */
    public void setRoundingFactor(RoundingFactorType value) {
        this.roundingFactor = value;
    }

    /**
     * Gets the value of the limitDisplayFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitDisplayFlag() {
        return limitDisplayFlag;
    }

    /**
     * Sets the value of the limitDisplayFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitDisplayFlag(String value) {
        this.limitDisplayFlag = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListProductAttributeNameAgency }
     *     
     */
    public CidxListProductAttributeNameAgency getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListProductAttributeNameAgency }
     *     
     */
    public void setAction(CidxListProductAttributeNameAgency value) {
        this.action = value;
    }

}

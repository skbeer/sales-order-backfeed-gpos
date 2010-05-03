
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerSpecificCatalogUpdateProductLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSpecificCatalogUpdateProductLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BuyerProductInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductInformation"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceStructure" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MinimumQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MaximumQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OrderLeadTime" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShippingServiceLevelCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialFulfillmentRequestCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProjectedVolume" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}StandardOrderQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CatalogEffectiveDates"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Action" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListActionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSpecificCatalogUpdateProductLineItemType", propOrder = {
    "lineNumber",
    "buyerProductInformation",
    "productInformation",
    "priceStructure",
    "minimumQuantity",
    "maximumQuantity",
    "orderLeadTime",
    "shippingServiceLevelCode",
    "specialFulfillmentRequestCode",
    "projectedVolume",
    "standardOrderQuantity",
    "specialInstructions",
    "catalogEffectiveDates"
})
public class CustomerSpecificCatalogUpdateProductLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "BuyerProductInformation")
    protected BuyerProductInformationType buyerProductInformation;
    @XmlElement(name = "ProductInformation", required = true)
    protected ProductInformationType productInformation;
    @XmlElement(name = "PriceStructure", required = true)
    protected List<PriceStructureType> priceStructure;
    @XmlElement(name = "MinimumQuantity")
    protected MinimumQuantityType minimumQuantity;
    @XmlElement(name = "MaximumQuantity")
    protected MaximumQuantityType maximumQuantity;
    @XmlElement(name = "OrderLeadTime")
    protected OrderLeadTimeType orderLeadTime;
    @XmlElement(name = "ShippingServiceLevelCode")
    protected ShippingServiceLevelCodeType shippingServiceLevelCode;
    @XmlElement(name = "SpecialFulfillmentRequestCode")
    protected List<SpecialFulfillmentRequestCodeType> specialFulfillmentRequestCode;
    @XmlElement(name = "ProjectedVolume")
    protected ProjectedVolumeType projectedVolume;
    @XmlElement(name = "StandardOrderQuantity")
    protected StandardOrderQuantityType standardOrderQuantity;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "CatalogEffectiveDates", required = true)
    protected CatalogEffectiveDatesType catalogEffectiveDates;
    @XmlAttribute(name = "Action", required = true)
    protected CidxListActionType action;

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
     * Gets the value of the buyerProductInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerProductInformationType }
     *     
     */
    public BuyerProductInformationType getBuyerProductInformation() {
        return buyerProductInformation;
    }

    /**
     * Sets the value of the buyerProductInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerProductInformationType }
     *     
     */
    public void setBuyerProductInformation(BuyerProductInformationType value) {
        this.buyerProductInformation = value;
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
     * Gets the value of the priceStructure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceStructure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceStructure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceStructureType }
     * 
     * 
     */
    public List<PriceStructureType> getPriceStructure() {
        if (priceStructure == null) {
            priceStructure = new ArrayList<PriceStructureType>();
        }
        return this.priceStructure;
    }

    /**
     * Gets the value of the minimumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumQuantityType }
     *     
     */
    public MinimumQuantityType getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Sets the value of the minimumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumQuantityType }
     *     
     */
    public void setMinimumQuantity(MinimumQuantityType value) {
        this.minimumQuantity = value;
    }

    /**
     * Gets the value of the maximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumQuantityType }
     *     
     */
    public MaximumQuantityType getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Sets the value of the maximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumQuantityType }
     *     
     */
    public void setMaximumQuantity(MaximumQuantityType value) {
        this.maximumQuantity = value;
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
     * Gets the value of the shippingServiceLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingServiceLevelCodeType }
     *     
     */
    public ShippingServiceLevelCodeType getShippingServiceLevelCode() {
        return shippingServiceLevelCode;
    }

    /**
     * Sets the value of the shippingServiceLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceLevelCodeType }
     *     
     */
    public void setShippingServiceLevelCode(ShippingServiceLevelCodeType value) {
        this.shippingServiceLevelCode = value;
    }

    /**
     * Gets the value of the specialFulfillmentRequestCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialFulfillmentRequestCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialFulfillmentRequestCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialFulfillmentRequestCodeType }
     * 
     * 
     */
    public List<SpecialFulfillmentRequestCodeType> getSpecialFulfillmentRequestCode() {
        if (specialFulfillmentRequestCode == null) {
            specialFulfillmentRequestCode = new ArrayList<SpecialFulfillmentRequestCodeType>();
        }
        return this.specialFulfillmentRequestCode;
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
     * Gets the value of the standardOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link StandardOrderQuantityType }
     *     
     */
    public StandardOrderQuantityType getStandardOrderQuantity() {
        return standardOrderQuantity;
    }

    /**
     * Sets the value of the standardOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardOrderQuantityType }
     *     
     */
    public void setStandardOrderQuantity(StandardOrderQuantityType value) {
        this.standardOrderQuantity = value;
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
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListActionType }
     *     
     */
    public CidxListActionType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListActionType }
     *     
     */
    public void setAction(CidxListActionType value) {
        this.action = value;
    }

}

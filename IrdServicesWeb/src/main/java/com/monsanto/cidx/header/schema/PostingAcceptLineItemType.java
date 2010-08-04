package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingAcceptLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingAcceptLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductIdentification"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CountryOfOriginCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarketingName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ManufacturerInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductQuantity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceInformation" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShippingAvailabilityDate"/>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedDeliveryDateTime"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipFrom"/>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipTo"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingAcceptLineItemType", propOrder = {
    "lineNumber",
    "productIdentification",
    "productSpecification",
    "packagingInformation",
    "countryOfOriginCode",
    "marketingName",
    "manufacturerInformation",
    "productQuantity",
    "priceInformation",
    "shippingAvailabilityDate",
    "requestedDeliveryDateTime",
    "specialInstructions",
    "shipFromAndShipTo"
})
public class PostingAcceptLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "ProductIdentification", required = true)
    protected ProductIdentificationType productIdentification;
    @XmlElement(name = "ProductSpecification")
    protected List<ProductSpecificationType> productSpecification;
    @XmlElement(name = "PackagingInformation")
    protected PackagingInformationType packagingInformation;
    @XmlElement(name = "CountryOfOriginCode")
    protected CountryOfOriginCodeType countryOfOriginCode;
    @XmlElement(name = "MarketingName")
    protected List<MarketingNameType> marketingName;
    @XmlElement(name = "ManufacturerInformation")
    protected ManufacturerInformationType manufacturerInformation;
    @XmlElement(name = "ProductQuantity", required = true)
    protected ProductQuantityType productQuantity;
    @XmlElement(name = "PriceInformation")
    protected PriceInformationType priceInformation;
    @XmlElement(name = "ShippingAvailabilityDate")
    protected ShippingAvailabilityDateType shippingAvailabilityDate;
    @XmlElement(name = "RequestedDeliveryDateTime")
    protected RequestedDeliveryDateTimeType requestedDeliveryDateTime;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElements({
        @XmlElement(name = "ShipFrom", type = ShipFromType.class),
        @XmlElement(name = "ShipTo", type = ShipToType.class)
    })
    protected List<Object> shipFromAndShipTo;

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
     * Gets the value of the productIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationType }
     *     
     */
    public ProductIdentificationType getProductIdentification() {
        return productIdentification;
    }

    /**
     * Sets the value of the productIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationType }
     *     
     */
    public void setProductIdentification(ProductIdentificationType value) {
        this.productIdentification = value;
    }

    /**
     * Gets the value of the productSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSpecificationType }
     * 
     * 
     */
    public List<ProductSpecificationType> getProductSpecification() {
        if (productSpecification == null) {
            productSpecification = new ArrayList<ProductSpecificationType>();
        }
        return this.productSpecification;
    }

    /**
     * Gets the value of the packagingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingInformationType }
     *     
     */
    public PackagingInformationType getPackagingInformation() {
        return packagingInformation;
    }

    /**
     * Sets the value of the packagingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingInformationType }
     *     
     */
    public void setPackagingInformation(PackagingInformationType value) {
        this.packagingInformation = value;
    }

    /**
     * Gets the value of the countryOfOriginCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryOfOriginCodeType }
     *     
     */
    public CountryOfOriginCodeType getCountryOfOriginCode() {
        return countryOfOriginCode;
    }

    /**
     * Sets the value of the countryOfOriginCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryOfOriginCodeType }
     *     
     */
    public void setCountryOfOriginCode(CountryOfOriginCodeType value) {
        this.countryOfOriginCode = value;
    }

    /**
     * Gets the value of the marketingName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketingName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketingNameType }
     * 
     * 
     */
    public List<MarketingNameType> getMarketingName() {
        if (marketingName == null) {
            marketingName = new ArrayList<MarketingNameType>();
        }
        return this.marketingName;
    }

    /**
     * Gets the value of the manufacturerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturerInformationType }
     *     
     */
    public ManufacturerInformationType getManufacturerInformation() {
        return manufacturerInformation;
    }

    /**
     * Sets the value of the manufacturerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturerInformationType }
     *     
     */
    public void setManufacturerInformation(ManufacturerInformationType value) {
        this.manufacturerInformation = value;
    }

    /**
     * Gets the value of the productQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantityType }
     *     
     */
    public ProductQuantityType getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantityType }
     *     
     */
    public void setProductQuantity(ProductQuantityType value) {
        this.productQuantity = value;
    }

    /**
     * Gets the value of the priceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PriceInformationType }
     *     
     */
    public PriceInformationType getPriceInformation() {
        return priceInformation;
    }

    /**
     * Sets the value of the priceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInformationType }
     *     
     */
    public void setPriceInformation(PriceInformationType value) {
        this.priceInformation = value;
    }

    /**
     * Gets the value of the shippingAvailabilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingAvailabilityDateType }
     *     
     */
    public ShippingAvailabilityDateType getShippingAvailabilityDate() {
        return shippingAvailabilityDate;
    }

    /**
     * Sets the value of the shippingAvailabilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingAvailabilityDateType }
     *     
     */
    public void setShippingAvailabilityDate(ShippingAvailabilityDateType value) {
        this.shippingAvailabilityDate = value;
    }

    /**
     * Gets the value of the requestedDeliveryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDeliveryDateTimeType }
     *     
     */
    public RequestedDeliveryDateTimeType getRequestedDeliveryDateTime() {
        return requestedDeliveryDateTime;
    }

    /**
     * Sets the value of the requestedDeliveryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDeliveryDateTimeType }
     *     
     */
    public void setRequestedDeliveryDateTime(RequestedDeliveryDateTimeType value) {
        this.requestedDeliveryDateTime = value;
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
     * Gets the value of the shipFromAndShipTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipFromAndShipTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipFromAndShipTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipFromType }
     * {@link ShipToType }
     * 
     * 
     */
    public List<Object> getShipFromAndShipTo() {
        if (shipFromAndShipTo == null) {
            shipFromAndShipTo = new ArrayList<Object>();
        }
        return this.shipFromAndShipTo;
    }

}

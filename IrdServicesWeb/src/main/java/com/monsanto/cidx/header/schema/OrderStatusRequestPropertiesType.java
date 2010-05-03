
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for OrderStatusRequestPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderStatusRequestPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PurchaseOrderNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReleaseNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PurchaseOrderIssuedDate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LanguageCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarketPlaceInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatusRequestPropertiesType", propOrder = {
    "purchaseOrderNumber",
    "releaseNumber",
    "purchaseOrderIssuedDate",
    "languageCode",
    "marketPlaceInformation"
})
public class OrderStatusRequestPropertiesType {

    @XmlElement(name = "PurchaseOrderNumber", required = true)
    protected PurchaseOrderNumberType purchaseOrderNumber;
    @XmlElement(name = "ReleaseNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String releaseNumber;
    @XmlElement(name = "PurchaseOrderIssuedDate", required = true)
    protected PurchaseOrderIssuedDateType purchaseOrderIssuedDate;
    @XmlElement(name = "LanguageCode", required = true)
    protected LanguageCodeType languageCode;
    @XmlElement(name = "MarketPlaceInformation")
    protected MarketPlaceInformationType marketPlaceInformation;

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderNumberType }
     *     
     */
    public PurchaseOrderNumberType getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Sets the value of the purchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderNumberType }
     *     
     */
    public void setPurchaseOrderNumber(PurchaseOrderNumberType value) {
        this.purchaseOrderNumber = value;
    }

    /**
     * Gets the value of the releaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseNumber() {
        return releaseNumber;
    }

    /**
     * Sets the value of the releaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseNumber(String value) {
        this.releaseNumber = value;
    }

    /**
     * Gets the value of the purchaseOrderIssuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderIssuedDateType }
     *     
     */
    public PurchaseOrderIssuedDateType getPurchaseOrderIssuedDate() {
        return purchaseOrderIssuedDate;
    }

    /**
     * Sets the value of the purchaseOrderIssuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderIssuedDateType }
     *     
     */
    public void setPurchaseOrderIssuedDate(PurchaseOrderIssuedDateType value) {
        this.purchaseOrderIssuedDate = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodeType }
     *     
     */
    public LanguageCodeType getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodeType }
     *     
     */
    public void setLanguageCode(LanguageCodeType value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the marketPlaceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MarketPlaceInformationType }
     *     
     */
    public MarketPlaceInformationType getMarketPlaceInformation() {
        return marketPlaceInformation;
    }

    /**
     * Sets the value of the marketPlaceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketPlaceInformationType }
     *     
     */
    public void setMarketPlaceInformation(MarketPlaceInformationType value) {
        this.marketPlaceInformation = value;
    }

}


package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastedProductMovementTransactionPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastedProductMovementTransactionPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EventDateTime" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LanguageCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CurrencyCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InvoiceTotal" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ForecastedProductMovementType" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListForecastedProductMovementType" />
 *       &lt;attribute name="SaleOrReturnType" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListSaleOrReturnType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastedProductMovementTransactionPropertiesType", propOrder = {
    "referenceInformation",
    "eventDateTime",
    "languageCode",
    "currencyCode",
    "invoiceTotal",
    "specialInstructions"
})
public class ForecastedProductMovementTransactionPropertiesType {

    @XmlElement(name = "ReferenceInformation")
    protected List<ReferenceInformationType> referenceInformation;
    @XmlElement(name = "EventDateTime", required = true)
    protected List<EventDateTimeType> eventDateTime;
    @XmlElement(name = "LanguageCode", required = true)
    protected LanguageCodeType languageCode;
    @XmlElement(name = "CurrencyCode", required = true)
    protected CurrencyCodeType currencyCode;
    @XmlElement(name = "InvoiceTotal")
    protected InvoiceTotalType invoiceTotal;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlAttribute(name = "ForecastedProductMovementType", required = true)
    protected CidxListForecastedProductMovementType forecastedProductMovementType;
    @XmlAttribute(name = "SaleOrReturnType", required = true)
    protected CidxListSaleOrReturnType saleOrReturnType;

    /**
     * Gets the value of the referenceInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInformationType }
     * 
     * 
     */
    public List<ReferenceInformationType> getReferenceInformation() {
        if (referenceInformation == null) {
            referenceInformation = new ArrayList<ReferenceInformationType>();
        }
        return this.referenceInformation;
    }

    /**
     * Gets the value of the eventDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventDateTimeType }
     * 
     * 
     */
    public List<EventDateTimeType> getEventDateTime() {
        if (eventDateTime == null) {
            eventDateTime = new ArrayList<EventDateTimeType>();
        }
        return this.eventDateTime;
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
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyCode(CurrencyCodeType value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the invoiceTotal property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTotalType }
     *     
     */
    public InvoiceTotalType getInvoiceTotal() {
        return invoiceTotal;
    }

    /**
     * Sets the value of the invoiceTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTotalType }
     *     
     */
    public void setInvoiceTotal(InvoiceTotalType value) {
        this.invoiceTotal = value;
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
     * Gets the value of the forecastedProductMovementType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListForecastedProductMovementType }
     *     
     */
    public CidxListForecastedProductMovementType getForecastedProductMovementType() {
        return forecastedProductMovementType;
    }

    /**
     * Sets the value of the forecastedProductMovementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListForecastedProductMovementType }
     *     
     */
    public void setForecastedProductMovementType(CidxListForecastedProductMovementType value) {
        this.forecastedProductMovementType = value;
    }

    /**
     * Gets the value of the saleOrReturnType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListSaleOrReturnType }
     *     
     */
    public CidxListSaleOrReturnType getSaleOrReturnType() {
        return saleOrReturnType;
    }

    /**
     * Sets the value of the saleOrReturnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListSaleOrReturnType }
     *     
     */
    public void setSaleOrReturnType(CidxListSaleOrReturnType value) {
        this.saleOrReturnType = value;
    }

}

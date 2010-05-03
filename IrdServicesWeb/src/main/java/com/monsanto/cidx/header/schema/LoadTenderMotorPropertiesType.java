
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
 * <p>Java class for LoadTenderMotorPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadTenderMotorPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadTenderNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadTenderDateTime"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentMethodOfPaymentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportMethodCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadTenderStatus"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LanguageCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CurrencyCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarketPlaceInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RespondByDateTime" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RoutingInstructions" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CustomsInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedDocument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OtherPartner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentStopType" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadProperties" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadTenderMotorPropertiesType", propOrder = {
    "loadTenderNumber",
    "loadTenderDateTime",
    "shipmentMethodOfPaymentCode",
    "transportMethodCode",
    "loadTenderStatus",
    "languageCode",
    "currencyCode",
    "marketPlaceInformation",
    "referenceInformation",
    "specialInstructions",
    "deliveryTerms",
    "respondByDateTime",
    "routingInstructions",
    "customsInformation",
    "requestedDocument",
    "otherPartner",
    "shipmentStopType",
    "loadProperties"
})
public class LoadTenderMotorPropertiesType {

    @XmlElement(name = "LoadTenderNumber", required = true)
    protected LoadTenderNumberType loadTenderNumber;
    @XmlElement(name = "LoadTenderDateTime", required = true)
    protected LoadTenderDateTimeType loadTenderDateTime;
    @XmlElement(name = "ShipmentMethodOfPaymentCode")
    protected ShipmentMethodOfPaymentCodeType shipmentMethodOfPaymentCode;
    @XmlElement(name = "TransportMethodCode", required = true)
    protected TransportMethodCodeType transportMethodCode;
    @XmlElement(name = "LoadTenderStatus", required = true)
    protected CidxListLoadTenderStatus loadTenderStatus;
    @XmlElement(name = "LanguageCode")
    protected LanguageCodeType languageCode;
    @XmlElement(name = "CurrencyCode")
    protected CurrencyCodeType currencyCode;
    @XmlElement(name = "MarketPlaceInformation")
    protected MarketPlaceInformationType marketPlaceInformation;
    @XmlElement(name = "ReferenceInformation")
    protected List<ReferenceInformationType> referenceInformation;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "DeliveryTerms")
    protected DeliveryTermsType deliveryTerms;
    @XmlElement(name = "RespondByDateTime")
    protected RespondByDateTimeType respondByDateTime;
    @XmlElement(name = "RoutingInstructions")
    protected RoutingInstructionsType routingInstructions;
    @XmlElement(name = "CustomsInformation")
    protected List<CustomsInformationType> customsInformation;
    @XmlElement(name = "RequestedDocument")
    protected List<RequestedDocumentType> requestedDocument;
    @XmlElement(name = "OtherPartner")
    protected List<OtherPartnerType> otherPartner;
    @XmlElement(name = "ShipmentStopType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shipmentStopType;
    @XmlElement(name = "LoadProperties")
    protected LoadPropertiesType loadProperties;

    /**
     * Gets the value of the loadTenderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTenderNumberType }
     *     
     */
    public LoadTenderNumberType getLoadTenderNumber() {
        return loadTenderNumber;
    }

    /**
     * Sets the value of the loadTenderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTenderNumberType }
     *     
     */
    public void setLoadTenderNumber(LoadTenderNumberType value) {
        this.loadTenderNumber = value;
    }

    /**
     * Gets the value of the loadTenderDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTenderDateTimeType }
     *     
     */
    public LoadTenderDateTimeType getLoadTenderDateTime() {
        return loadTenderDateTime;
    }

    /**
     * Sets the value of the loadTenderDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTenderDateTimeType }
     *     
     */
    public void setLoadTenderDateTime(LoadTenderDateTimeType value) {
        this.loadTenderDateTime = value;
    }

    /**
     * Gets the value of the shipmentMethodOfPaymentCode property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentMethodOfPaymentCodeType }
     *     
     */
    public ShipmentMethodOfPaymentCodeType getShipmentMethodOfPaymentCode() {
        return shipmentMethodOfPaymentCode;
    }

    /**
     * Sets the value of the shipmentMethodOfPaymentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentMethodOfPaymentCodeType }
     *     
     */
    public void setShipmentMethodOfPaymentCode(ShipmentMethodOfPaymentCodeType value) {
        this.shipmentMethodOfPaymentCode = value;
    }

    /**
     * Gets the value of the transportMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransportMethodCodeType }
     *     
     */
    public TransportMethodCodeType getTransportMethodCode() {
        return transportMethodCode;
    }

    /**
     * Sets the value of the transportMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMethodCodeType }
     *     
     */
    public void setTransportMethodCode(TransportMethodCodeType value) {
        this.transportMethodCode = value;
    }

    /**
     * Gets the value of the loadTenderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListLoadTenderStatus }
     *     
     */
    public CidxListLoadTenderStatus getLoadTenderStatus() {
        return loadTenderStatus;
    }

    /**
     * Sets the value of the loadTenderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListLoadTenderStatus }
     *     
     */
    public void setLoadTenderStatus(CidxListLoadTenderStatus value) {
        this.loadTenderStatus = value;
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
     * Gets the value of the respondByDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link RespondByDateTimeType }
     *     
     */
    public RespondByDateTimeType getRespondByDateTime() {
        return respondByDateTime;
    }

    /**
     * Sets the value of the respondByDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespondByDateTimeType }
     *     
     */
    public void setRespondByDateTime(RespondByDateTimeType value) {
        this.respondByDateTime = value;
    }

    /**
     * Gets the value of the routingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingInstructionsType }
     *     
     */
    public RoutingInstructionsType getRoutingInstructions() {
        return routingInstructions;
    }

    /**
     * Sets the value of the routingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingInstructionsType }
     *     
     */
    public void setRoutingInstructions(RoutingInstructionsType value) {
        this.routingInstructions = value;
    }

    /**
     * Gets the value of the customsInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customsInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsInformationType }
     * 
     * 
     */
    public List<CustomsInformationType> getCustomsInformation() {
        if (customsInformation == null) {
            customsInformation = new ArrayList<CustomsInformationType>();
        }
        return this.customsInformation;
    }

    /**
     * Gets the value of the requestedDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedDocumentType }
     * 
     * 
     */
    public List<RequestedDocumentType> getRequestedDocument() {
        if (requestedDocument == null) {
            requestedDocument = new ArrayList<RequestedDocumentType>();
        }
        return this.requestedDocument;
    }

    /**
     * Gets the value of the otherPartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherPartnerType }
     * 
     * 
     */
    public List<OtherPartnerType> getOtherPartner() {
        if (otherPartner == null) {
            otherPartner = new ArrayList<OtherPartnerType>();
        }
        return this.otherPartner;
    }

    /**
     * Gets the value of the shipmentStopType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentStopType() {
        return shipmentStopType;
    }

    /**
     * Sets the value of the shipmentStopType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentStopType(String value) {
        this.shipmentStopType = value;
    }

    /**
     * Gets the value of the loadProperties property.
     * 
     * @return
     *     possible object is
     *     {@link LoadPropertiesType }
     *     
     */
    public LoadPropertiesType getLoadProperties() {
        return loadProperties;
    }

    /**
     * Sets the value of the loadProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadPropertiesType }
     *     
     */
    public void setLoadProperties(LoadPropertiesType value) {
        this.loadProperties = value;
    }

}

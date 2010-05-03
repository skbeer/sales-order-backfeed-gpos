
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
 * <p>Java class for ShipmentInstructionsPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentInstructionsPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentReleaseDate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MovementType"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EmergencyResponseContact" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ConveyanceInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InlandOriginPointCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PortOfLoadingCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}IntermodalServiceType" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TranshipmentInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PortOfDischargeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InlandDestinationPointCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentDateReference"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentMethodOfPaymentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportMethodCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentInstructionsStatus"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentQualifierCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LanguageCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CurrencyCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarketPlaceInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RespondByDateTime" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RoutingInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CustomsInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CountryOfFinalDestinationCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ConsolidationType" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentStopType" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CustomsAllowances" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OperationalInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportDocumentInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentInstructionsPropertiesType", propOrder = {
    "referenceInformation",
    "shipmentReleaseDate",
    "movementType",
    "emergencyResponseContact",
    "conveyanceInformation",
    "inlandOriginPointCode",
    "portOfLoadingCode",
    "intermodalServiceType",
    "transhipmentInformation",
    "portOfDischargeCode",
    "inlandDestinationPointCode",
    "shipmentDateReference",
    "shipmentMethodOfPaymentCode",
    "transportMethodCode",
    "shipmentInstructionsStatus",
    "shipmentQualifierCode",
    "languageCode",
    "currencyCode",
    "marketPlaceInformation",
    "specialInstructions",
    "deliveryTerms",
    "respondByDateTime",
    "routingInstructions",
    "customsInformation",
    "countryOfFinalDestinationCode",
    "paymentTerms",
    "consolidationType",
    "inventoryLocation",
    "shipmentStopType",
    "customsAllowances",
    "operationalInstructions",
    "transportDocumentInstructions"
})
public class ShipmentInstructionsPropertiesType {

    @XmlElement(name = "ReferenceInformation", required = true)
    protected List<ReferenceInformationType> referenceInformation;
    @XmlElement(name = "ShipmentReleaseDate", required = true)
    protected ShipmentReleaseDateType shipmentReleaseDate;
    @XmlElement(name = "MovementType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String movementType;
    @XmlElement(name = "EmergencyResponseContact", required = true)
    protected List<EmergencyResponseContactType> emergencyResponseContact;
    @XmlElement(name = "ConveyanceInformation")
    protected ConveyanceInformationType conveyanceInformation;
    @XmlElement(name = "InlandOriginPointCode")
    protected InlandOriginPointCodeType inlandOriginPointCode;
    @XmlElement(name = "PortOfLoadingCode")
    protected PortOfLoadingCodeType portOfLoadingCode;
    @XmlElement(name = "IntermodalServiceType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String intermodalServiceType;
    @XmlElement(name = "TranshipmentInformation")
    protected TranshipmentInformationType transhipmentInformation;
    @XmlElement(name = "PortOfDischargeCode")
    protected PortOfDischargeCodeType portOfDischargeCode;
    @XmlElement(name = "InlandDestinationPointCode")
    protected InlandDestinationPointCodeType inlandDestinationPointCode;
    @XmlElement(name = "ShipmentDateReference", required = true)
    protected ShipmentDateReferenceType shipmentDateReference;
    @XmlElement(name = "ShipmentMethodOfPaymentCode")
    protected ShipmentMethodOfPaymentCodeType shipmentMethodOfPaymentCode;
    @XmlElement(name = "TransportMethodCode", required = true)
    protected TransportMethodCodeType transportMethodCode;
    @XmlElement(name = "ShipmentInstructionsStatus", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shipmentInstructionsStatus;
    @XmlElement(name = "ShipmentQualifierCode")
    protected ShipmentQualifierCodeType shipmentQualifierCode;
    @XmlElement(name = "LanguageCode", required = true)
    protected LanguageCodeType languageCode;
    @XmlElement(name = "CurrencyCode", required = true)
    protected CurrencyCodeType currencyCode;
    @XmlElement(name = "MarketPlaceInformation")
    protected MarketPlaceInformationType marketPlaceInformation;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "DeliveryTerms")
    protected DeliveryTermsType deliveryTerms;
    @XmlElement(name = "RespondByDateTime")
    protected RespondByDateTimeType respondByDateTime;
    @XmlElement(name = "RoutingInstructions")
    protected List<RoutingInstructionsType> routingInstructions;
    @XmlElement(name = "CustomsInformation")
    protected List<CustomsInformationType> customsInformation;
    @XmlElement(name = "CountryOfFinalDestinationCode", required = true)
    protected CountryOfFinalDestinationCodeType countryOfFinalDestinationCode;
    @XmlElement(name = "PaymentTerms")
    protected PaymentTermsType paymentTerms;
    @XmlElement(name = "ConsolidationType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String consolidationType;
    @XmlElement(name = "InventoryLocation")
    protected List<InventoryLocationType> inventoryLocation;
    @XmlElement(name = "ShipmentStopType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shipmentStopType;
    @XmlElement(name = "CustomsAllowances")
    protected CustomsAllowancesType customsAllowances;
    @XmlElement(name = "OperationalInstructions")
    protected List<OperationalInstructionsType> operationalInstructions;
    @XmlElement(name = "TransportDocumentInstructions")
    protected List<TransportDocumentInstructionsType> transportDocumentInstructions;

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
     * Gets the value of the shipmentReleaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentReleaseDateType }
     *     
     */
    public ShipmentReleaseDateType getShipmentReleaseDate() {
        return shipmentReleaseDate;
    }

    /**
     * Sets the value of the shipmentReleaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentReleaseDateType }
     *     
     */
    public void setShipmentReleaseDate(ShipmentReleaseDateType value) {
        this.shipmentReleaseDate = value;
    }

    /**
     * Gets the value of the movementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementType() {
        return movementType;
    }

    /**
     * Sets the value of the movementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementType(String value) {
        this.movementType = value;
    }

    /**
     * Gets the value of the emergencyResponseContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emergencyResponseContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmergencyResponseContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmergencyResponseContactType }
     * 
     * 
     */
    public List<EmergencyResponseContactType> getEmergencyResponseContact() {
        if (emergencyResponseContact == null) {
            emergencyResponseContact = new ArrayList<EmergencyResponseContactType>();
        }
        return this.emergencyResponseContact;
    }

    /**
     * Gets the value of the conveyanceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ConveyanceInformationType }
     *     
     */
    public ConveyanceInformationType getConveyanceInformation() {
        return conveyanceInformation;
    }

    /**
     * Sets the value of the conveyanceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConveyanceInformationType }
     *     
     */
    public void setConveyanceInformation(ConveyanceInformationType value) {
        this.conveyanceInformation = value;
    }

    /**
     * Gets the value of the inlandOriginPointCode property.
     * 
     * @return
     *     possible object is
     *     {@link InlandOriginPointCodeType }
     *     
     */
    public InlandOriginPointCodeType getInlandOriginPointCode() {
        return inlandOriginPointCode;
    }

    /**
     * Sets the value of the inlandOriginPointCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link InlandOriginPointCodeType }
     *     
     */
    public void setInlandOriginPointCode(InlandOriginPointCodeType value) {
        this.inlandOriginPointCode = value;
    }

    /**
     * Gets the value of the portOfLoadingCode property.
     * 
     * @return
     *     possible object is
     *     {@link PortOfLoadingCodeType }
     *     
     */
    public PortOfLoadingCodeType getPortOfLoadingCode() {
        return portOfLoadingCode;
    }

    /**
     * Sets the value of the portOfLoadingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortOfLoadingCodeType }
     *     
     */
    public void setPortOfLoadingCode(PortOfLoadingCodeType value) {
        this.portOfLoadingCode = value;
    }

    /**
     * Gets the value of the intermodalServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntermodalServiceType() {
        return intermodalServiceType;
    }

    /**
     * Sets the value of the intermodalServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntermodalServiceType(String value) {
        this.intermodalServiceType = value;
    }

    /**
     * Gets the value of the transhipmentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TranshipmentInformationType }
     *     
     */
    public TranshipmentInformationType getTranshipmentInformation() {
        return transhipmentInformation;
    }

    /**
     * Sets the value of the transhipmentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranshipmentInformationType }
     *     
     */
    public void setTranshipmentInformation(TranshipmentInformationType value) {
        this.transhipmentInformation = value;
    }

    /**
     * Gets the value of the portOfDischargeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PortOfDischargeCodeType }
     *     
     */
    public PortOfDischargeCodeType getPortOfDischargeCode() {
        return portOfDischargeCode;
    }

    /**
     * Sets the value of the portOfDischargeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortOfDischargeCodeType }
     *     
     */
    public void setPortOfDischargeCode(PortOfDischargeCodeType value) {
        this.portOfDischargeCode = value;
    }

    /**
     * Gets the value of the inlandDestinationPointCode property.
     * 
     * @return
     *     possible object is
     *     {@link InlandDestinationPointCodeType }
     *     
     */
    public InlandDestinationPointCodeType getInlandDestinationPointCode() {
        return inlandDestinationPointCode;
    }

    /**
     * Sets the value of the inlandDestinationPointCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link InlandDestinationPointCodeType }
     *     
     */
    public void setInlandDestinationPointCode(InlandDestinationPointCodeType value) {
        this.inlandDestinationPointCode = value;
    }

    /**
     * Gets the value of the shipmentDateReference property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDateReferenceType }
     *     
     */
    public ShipmentDateReferenceType getShipmentDateReference() {
        return shipmentDateReference;
    }

    /**
     * Sets the value of the shipmentDateReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDateReferenceType }
     *     
     */
    public void setShipmentDateReference(ShipmentDateReferenceType value) {
        this.shipmentDateReference = value;
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
     * Gets the value of the shipmentInstructionsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentInstructionsStatus() {
        return shipmentInstructionsStatus;
    }

    /**
     * Sets the value of the shipmentInstructionsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentInstructionsStatus(String value) {
        this.shipmentInstructionsStatus = value;
    }

    /**
     * Gets the value of the shipmentQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentQualifierCodeType }
     *     
     */
    public ShipmentQualifierCodeType getShipmentQualifierCode() {
        return shipmentQualifierCode;
    }

    /**
     * Sets the value of the shipmentQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentQualifierCodeType }
     *     
     */
    public void setShipmentQualifierCode(ShipmentQualifierCodeType value) {
        this.shipmentQualifierCode = value;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingInstructionsType }
     * 
     * 
     */
    public List<RoutingInstructionsType> getRoutingInstructions() {
        if (routingInstructions == null) {
            routingInstructions = new ArrayList<RoutingInstructionsType>();
        }
        return this.routingInstructions;
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
     * Gets the value of the countryOfFinalDestinationCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryOfFinalDestinationCodeType }
     *     
     */
    public CountryOfFinalDestinationCodeType getCountryOfFinalDestinationCode() {
        return countryOfFinalDestinationCode;
    }

    /**
     * Sets the value of the countryOfFinalDestinationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryOfFinalDestinationCodeType }
     *     
     */
    public void setCountryOfFinalDestinationCode(CountryOfFinalDestinationCodeType value) {
        this.countryOfFinalDestinationCode = value;
    }

    /**
     * Gets the value of the paymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Sets the value of the paymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setPaymentTerms(PaymentTermsType value) {
        this.paymentTerms = value;
    }

    /**
     * Gets the value of the consolidationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsolidationType() {
        return consolidationType;
    }

    /**
     * Sets the value of the consolidationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsolidationType(String value) {
        this.consolidationType = value;
    }

    /**
     * Gets the value of the inventoryLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryLocationType }
     * 
     * 
     */
    public List<InventoryLocationType> getInventoryLocation() {
        if (inventoryLocation == null) {
            inventoryLocation = new ArrayList<InventoryLocationType>();
        }
        return this.inventoryLocation;
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
     * Gets the value of the customsAllowances property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsAllowancesType }
     *     
     */
    public CustomsAllowancesType getCustomsAllowances() {
        return customsAllowances;
    }

    /**
     * Sets the value of the customsAllowances property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsAllowancesType }
     *     
     */
    public void setCustomsAllowances(CustomsAllowancesType value) {
        this.customsAllowances = value;
    }

    /**
     * Gets the value of the operationalInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationalInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationalInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationalInstructionsType }
     * 
     * 
     */
    public List<OperationalInstructionsType> getOperationalInstructions() {
        if (operationalInstructions == null) {
            operationalInstructions = new ArrayList<OperationalInstructionsType>();
        }
        return this.operationalInstructions;
    }

    /**
     * Gets the value of the transportDocumentInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportDocumentInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportDocumentInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportDocumentInstructionsType }
     * 
     * 
     */
    public List<TransportDocumentInstructionsType> getTransportDocumentInstructions() {
        if (transportDocumentInstructions == null) {
            transportDocumentInstructions = new ArrayList<TransportDocumentInstructionsType>();
        }
        return this.transportDocumentInstructions;
    }

}

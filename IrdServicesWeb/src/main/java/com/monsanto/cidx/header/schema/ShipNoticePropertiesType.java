
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
 * <p>Java class for ShipNoticePropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipNoticePropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentIdentification"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipDate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadTenderInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PurchaseOrderInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportMethodCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarketPlaceInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RoutingInstructions" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentMethodOfPaymentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ConveyanceInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PortOfLoadingCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MovementType" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PortOfDischargeCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipNoticeDate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipNoticeStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedDocument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LanguageCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentStopType" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CustomsInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipNoticePropertiesType", propOrder = {
    "shipmentIdentification",
    "shipDate",
    "loadTenderInformation",
    "purchaseOrderInformation",
    "transportMethodCode",
    "marketPlaceInformation",
    "routingInstructions",
    "referenceInformation",
    "shipmentMethodOfPaymentCode",
    "deliveryTerms",
    "conveyanceInformation",
    "portOfLoadingCode",
    "movementType",
    "portOfDischargeCode",
    "specialInstructions",
    "shipNoticeDate",
    "shipNoticeStatus",
    "requestedDocument",
    "languageCode",
    "shipmentStopType",
    "customsInformation"
})
public class ShipNoticePropertiesType {

    @XmlElement(name = "ShipmentIdentification", required = true)
    protected ShipmentIdentificationType shipmentIdentification;
    @XmlElement(name = "ShipDate", required = true)
    protected ShipDateType shipDate;
    @XmlElement(name = "LoadTenderInformation")
    protected LoadTenderInformationType loadTenderInformation;
    @XmlElement(name = "PurchaseOrderInformation")
    protected PurchaseOrderInformationType purchaseOrderInformation;
    @XmlElement(name = "TransportMethodCode", required = true)
    protected TransportMethodCodeType transportMethodCode;
    @XmlElement(name = "MarketPlaceInformation")
    protected MarketPlaceInformationType marketPlaceInformation;
    @XmlElement(name = "RoutingInstructions")
    protected RoutingInstructionsType routingInstructions;
    @XmlElement(name = "ReferenceInformation")
    protected List<ReferenceInformationType> referenceInformation;
    @XmlElement(name = "ShipmentMethodOfPaymentCode")
    protected ShipmentMethodOfPaymentCodeType shipmentMethodOfPaymentCode;
    @XmlElement(name = "DeliveryTerms")
    protected DeliveryTermsType deliveryTerms;
    @XmlElement(name = "ConveyanceInformation")
    protected ConveyanceInformationType conveyanceInformation;
    @XmlElement(name = "PortOfLoadingCode")
    protected PortOfLoadingCodeType portOfLoadingCode;
    @XmlElement(name = "MovementType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String movementType;
    @XmlElement(name = "PortOfDischargeCode")
    protected PortOfDischargeCodeType portOfDischargeCode;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "ShipNoticeDate", required = true)
    protected ShipNoticeDateType shipNoticeDate;
    @XmlElement(name = "ShipNoticeStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shipNoticeStatus;
    @XmlElement(name = "RequestedDocument")
    protected List<RequestedDocumentType> requestedDocument;
    @XmlElement(name = "LanguageCode")
    protected LanguageCodeType languageCode;
    @XmlElement(name = "ShipmentStopType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shipmentStopType;
    @XmlElement(name = "CustomsInformation")
    protected List<CustomsInformationType> customsInformation;

    /**
     * Gets the value of the shipmentIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentIdentificationType }
     *     
     */
    public ShipmentIdentificationType getShipmentIdentification() {
        return shipmentIdentification;
    }

    /**
     * Sets the value of the shipmentIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentIdentificationType }
     *     
     */
    public void setShipmentIdentification(ShipmentIdentificationType value) {
        this.shipmentIdentification = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link ShipDateType }
     *     
     */
    public ShipDateType getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipDateType }
     *     
     */
    public void setShipDate(ShipDateType value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the loadTenderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTenderInformationType }
     *     
     */
    public LoadTenderInformationType getLoadTenderInformation() {
        return loadTenderInformation;
    }

    /**
     * Sets the value of the loadTenderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTenderInformationType }
     *     
     */
    public void setLoadTenderInformation(LoadTenderInformationType value) {
        this.loadTenderInformation = value;
    }

    /**
     * Gets the value of the purchaseOrderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderInformationType }
     *     
     */
    public PurchaseOrderInformationType getPurchaseOrderInformation() {
        return purchaseOrderInformation;
    }

    /**
     * Sets the value of the purchaseOrderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderInformationType }
     *     
     */
    public void setPurchaseOrderInformation(PurchaseOrderInformationType value) {
        this.purchaseOrderInformation = value;
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
     * Gets the value of the shipNoticeDate property.
     * 
     * @return
     *     possible object is
     *     {@link ShipNoticeDateType }
     *     
     */
    public ShipNoticeDateType getShipNoticeDate() {
        return shipNoticeDate;
    }

    /**
     * Sets the value of the shipNoticeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipNoticeDateType }
     *     
     */
    public void setShipNoticeDate(ShipNoticeDateType value) {
        this.shipNoticeDate = value;
    }

    /**
     * Gets the value of the shipNoticeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipNoticeStatus() {
        return shipNoticeStatus;
    }

    /**
     * Sets the value of the shipNoticeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipNoticeStatus(String value) {
        this.shipNoticeStatus = value;
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

}

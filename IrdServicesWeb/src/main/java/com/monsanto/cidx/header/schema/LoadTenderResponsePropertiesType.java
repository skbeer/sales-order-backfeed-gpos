
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
 * <p>Java class for LoadTenderResponsePropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadTenderResponsePropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadTenderNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BookingNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PortDeliveryPoint" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedDeliveryDateTime" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarketPlaceInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AcceptOrReject"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RejectReason" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LoadTenderStatus"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LanguageCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedDocument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OtherPartner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentStopType" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentMethodOfPaymentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RoutingInstructions" minOccurs="0"/>
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
@XmlType(name = "LoadTenderResponsePropertiesType", propOrder = {
    "loadTenderNumber",
    "bookingNumber",
    "portDeliveryPoint",
    "requestedDeliveryDateTime",
    "marketPlaceInformation",
    "acceptOrReject",
    "rejectReason",
    "loadTenderStatus",
    "languageCode",
    "referenceInformation",
    "specialInstructions",
    "requestedDocument",
    "otherPartner",
    "shipmentStopType",
    "deliveryTerms",
    "shipmentMethodOfPaymentCode",
    "routingInstructions",
    "loadProperties"
})
public class LoadTenderResponsePropertiesType {

    @XmlElement(name = "LoadTenderNumber", required = true)
    protected LoadTenderNumberType loadTenderNumber;
    @XmlElement(name = "BookingNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bookingNumber;
    @XmlElement(name = "PortDeliveryPoint")
    protected PortDeliveryPointType portDeliveryPoint;
    @XmlElement(name = "RequestedDeliveryDateTime")
    protected RequestedDeliveryDateTimeType requestedDeliveryDateTime;
    @XmlElement(name = "MarketPlaceInformation")
    protected MarketPlaceInformationType marketPlaceInformation;
    @XmlElement(name = "AcceptOrReject", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String acceptOrReject;
    @XmlElement(name = "RejectReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rejectReason;
    @XmlElement(name = "LoadTenderStatus", required = true)
    protected CidxListLoadTenderStatus loadTenderStatus;
    @XmlElement(name = "LanguageCode")
    protected LanguageCodeType languageCode;
    @XmlElement(name = "ReferenceInformation")
    protected List<ReferenceInformationType> referenceInformation;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "RequestedDocument")
    protected List<RequestedDocumentType> requestedDocument;
    @XmlElement(name = "OtherPartner")
    protected List<OtherPartnerType> otherPartner;
    @XmlElement(name = "ShipmentStopType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shipmentStopType;
    @XmlElement(name = "DeliveryTerms")
    protected DeliveryTermsType deliveryTerms;
    @XmlElement(name = "ShipmentMethodOfPaymentCode")
    protected ShipmentMethodOfPaymentCodeType shipmentMethodOfPaymentCode;
    @XmlElement(name = "RoutingInstructions")
    protected RoutingInstructionsType routingInstructions;
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
     * Gets the value of the bookingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingNumber() {
        return bookingNumber;
    }

    /**
     * Sets the value of the bookingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingNumber(String value) {
        this.bookingNumber = value;
    }

    /**
     * Gets the value of the portDeliveryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link PortDeliveryPointType }
     *     
     */
    public PortDeliveryPointType getPortDeliveryPoint() {
        return portDeliveryPoint;
    }

    /**
     * Sets the value of the portDeliveryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortDeliveryPointType }
     *     
     */
    public void setPortDeliveryPoint(PortDeliveryPointType value) {
        this.portDeliveryPoint = value;
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
     * Gets the value of the acceptOrReject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptOrReject() {
        return acceptOrReject;
    }

    /**
     * Sets the value of the acceptOrReject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptOrReject(String value) {
        this.acceptOrReject = value;
    }

    /**
     * Gets the value of the rejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * Sets the value of the rejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectReason(String value) {
        this.rejectReason = value;
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

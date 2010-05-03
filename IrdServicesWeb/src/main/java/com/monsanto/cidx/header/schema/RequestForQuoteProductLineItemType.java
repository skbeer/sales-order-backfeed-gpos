
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
 * <p>Java class for RequestForQuoteProductLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestForQuoteProductLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RFQProduct" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductIdentification" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProjectedVolume" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}StandardOrderQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedPackaging" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportMethodCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedPrice" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedAgreementPeriod" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedFirstOrderDate" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ScheduleDateTimeInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OtherPartner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentMethodOfPaymentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CountryOfOriginCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DutyStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShippingServiceLevelCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialFulfillmentRequestCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CountryOfFinalDestinationCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PlannedEndUse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedQuoteResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestForQuoteProductLineItemType", propOrder = {
    "lineNumber",
    "rfqProduct",
    "productIdentification",
    "referenceInformation",
    "projectedVolume",
    "standardOrderQuantity",
    "requestedPackaging",
    "transportMethodCode",
    "requestedPrice",
    "requestedAgreementPeriod",
    "requestedFirstOrderDate",
    "scheduleDateTimeInformation",
    "otherPartner",
    "deliveryTerms",
    "shipmentMethodOfPaymentCode",
    "countryOfOriginCode",
    "dutyStatus",
    "shippingServiceLevelCode",
    "specialFulfillmentRequestCode",
    "countryOfFinalDestinationCode",
    "specialInstructions",
    "plannedEndUse",
    "requestedQuoteResponse"
})
public class RequestForQuoteProductLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "RFQProduct")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rfqProduct;
    @XmlElement(name = "ProductIdentification", required = true)
    protected List<ProductIdentificationType> productIdentification;
    @XmlElement(name = "ReferenceInformation")
    protected ReferenceInformationType referenceInformation;
    @XmlElement(name = "ProjectedVolume")
    protected ProjectedVolumeType projectedVolume;
    @XmlElement(name = "StandardOrderQuantity")
    protected StandardOrderQuantityType standardOrderQuantity;
    @XmlElement(name = "RequestedPackaging")
    protected RequestedPackagingType requestedPackaging;
    @XmlElement(name = "TransportMethodCode", required = true)
    protected TransportMethodCodeType transportMethodCode;
    @XmlElement(name = "RequestedPrice")
    protected RequestedPriceType requestedPrice;
    @XmlElement(name = "RequestedAgreementPeriod")
    protected RequestedAgreementPeriodType requestedAgreementPeriod;
    @XmlElement(name = "RequestedFirstOrderDate")
    protected RequestedFirstOrderDateType requestedFirstOrderDate;
    @XmlElement(name = "ScheduleDateTimeInformation")
    protected ScheduleDateTimeInformationType scheduleDateTimeInformation;
    @XmlElement(name = "OtherPartner")
    protected List<OtherPartnerType> otherPartner;
    @XmlElement(name = "DeliveryTerms")
    protected DeliveryTermsType deliveryTerms;
    @XmlElement(name = "ShipmentMethodOfPaymentCode")
    protected ShipmentMethodOfPaymentCodeType shipmentMethodOfPaymentCode;
    @XmlElement(name = "CountryOfOriginCode")
    protected CountryOfOriginCodeType countryOfOriginCode;
    @XmlElement(name = "DutyStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dutyStatus;
    @XmlElement(name = "ShippingServiceLevelCode")
    protected ShippingServiceLevelCodeType shippingServiceLevelCode;
    @XmlElement(name = "SpecialFulfillmentRequestCode")
    protected List<SpecialFulfillmentRequestCodeType> specialFulfillmentRequestCode;
    @XmlElement(name = "CountryOfFinalDestinationCode")
    protected CountryOfFinalDestinationCodeType countryOfFinalDestinationCode;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "PlannedEndUse")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> plannedEndUse;
    @XmlElement(name = "RequestedQuoteResponse")
    protected RequestedQuoteResponseType requestedQuoteResponse;

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
     * Gets the value of the rfqProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFQProduct() {
        return rfqProduct;
    }

    /**
     * Sets the value of the rfqProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFQProduct(String value) {
        this.rfqProduct = value;
    }

    /**
     * Gets the value of the productIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentificationType }
     * 
     * 
     */
    public List<ProductIdentificationType> getProductIdentification() {
        if (productIdentification == null) {
            productIdentification = new ArrayList<ProductIdentificationType>();
        }
        return this.productIdentification;
    }

    /**
     * Gets the value of the referenceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInformationType }
     *     
     */
    public ReferenceInformationType getReferenceInformation() {
        return referenceInformation;
    }

    /**
     * Sets the value of the referenceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInformationType }
     *     
     */
    public void setReferenceInformation(ReferenceInformationType value) {
        this.referenceInformation = value;
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
     * Gets the value of the requestedPackaging property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedPackagingType }
     *     
     */
    public RequestedPackagingType getRequestedPackaging() {
        return requestedPackaging;
    }

    /**
     * Sets the value of the requestedPackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedPackagingType }
     *     
     */
    public void setRequestedPackaging(RequestedPackagingType value) {
        this.requestedPackaging = value;
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
     * Gets the value of the requestedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedPriceType }
     *     
     */
    public RequestedPriceType getRequestedPrice() {
        return requestedPrice;
    }

    /**
     * Sets the value of the requestedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedPriceType }
     *     
     */
    public void setRequestedPrice(RequestedPriceType value) {
        this.requestedPrice = value;
    }

    /**
     * Gets the value of the requestedAgreementPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedAgreementPeriodType }
     *     
     */
    public RequestedAgreementPeriodType getRequestedAgreementPeriod() {
        return requestedAgreementPeriod;
    }

    /**
     * Sets the value of the requestedAgreementPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedAgreementPeriodType }
     *     
     */
    public void setRequestedAgreementPeriod(RequestedAgreementPeriodType value) {
        this.requestedAgreementPeriod = value;
    }

    /**
     * Gets the value of the requestedFirstOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedFirstOrderDateType }
     *     
     */
    public RequestedFirstOrderDateType getRequestedFirstOrderDate() {
        return requestedFirstOrderDate;
    }

    /**
     * Sets the value of the requestedFirstOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedFirstOrderDateType }
     *     
     */
    public void setRequestedFirstOrderDate(RequestedFirstOrderDateType value) {
        this.requestedFirstOrderDate = value;
    }

    /**
     * Gets the value of the scheduleDateTimeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDateTimeInformationType }
     *     
     */
    public ScheduleDateTimeInformationType getScheduleDateTimeInformation() {
        return scheduleDateTimeInformation;
    }

    /**
     * Sets the value of the scheduleDateTimeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDateTimeInformationType }
     *     
     */
    public void setScheduleDateTimeInformation(ScheduleDateTimeInformationType value) {
        this.scheduleDateTimeInformation = value;
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
     * Gets the value of the dutyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyStatus() {
        return dutyStatus;
    }

    /**
     * Sets the value of the dutyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyStatus(String value) {
        this.dutyStatus = value;
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
     * Gets the value of the plannedEndUse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plannedEndUse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlannedEndUse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPlannedEndUse() {
        if (plannedEndUse == null) {
            plannedEndUse = new ArrayList<String>();
        }
        return this.plannedEndUse;
    }

    /**
     * Gets the value of the requestedQuoteResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedQuoteResponseType }
     *     
     */
    public RequestedQuoteResponseType getRequestedQuoteResponse() {
        return requestedQuoteResponse;
    }

    /**
     * Sets the value of the requestedQuoteResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedQuoteResponseType }
     *     
     */
    public void setRequestedQuoteResponse(RequestedQuoteResponseType value) {
        this.requestedQuoteResponse = value;
    }

}

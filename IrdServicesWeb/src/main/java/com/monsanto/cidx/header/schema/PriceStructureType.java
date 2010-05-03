
package com.monsanto.cidx.header.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PriceStructureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceStructureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DocumentReference"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OtherPartner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PlannedEndUse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BuyerContractInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportMethodCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CustomerSpecificCatalogPriceData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DutyStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CountryOfOriginCode" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipTo"/>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CountryOfFinalDestinationCode" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShippingLeadTime" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentMethodOfPaymentCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceStructureType", propOrder = {
    "documentReference",
    "otherPartner",
    "plannedEndUse",
    "buyerContractInformation",
    "deliveryTerms",
    "transportMethodCode",
    "customerSpecificCatalogPriceData",
    "dutyStatus",
    "countryOfOriginCode",
    "shipTo",
    "countryOfFinalDestinationCode",
    "shippingLeadTime",
    "shipmentMethodOfPaymentCode"
})
public class PriceStructureType {

    @XmlElement(name = "DocumentReference", required = true)
    protected DocumentReferenceType documentReference;
    @XmlElement(name = "OtherPartner")
    protected List<OtherPartnerType> otherPartner;
    @XmlElement(name = "PlannedEndUse")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> plannedEndUse;
    @XmlElement(name = "BuyerContractInformation")
    protected BuyerContractInformationType buyerContractInformation;
    @XmlElement(name = "DeliveryTerms")
    protected DeliveryTermsType deliveryTerms;
    @XmlElement(name = "TransportMethodCode")
    protected TransportMethodCodeType transportMethodCode;
    @XmlElement(name = "CustomerSpecificCatalogPriceData")
    protected List<CustomerSpecificCatalogPriceDataType> customerSpecificCatalogPriceData;
    @XmlElement(name = "DutyStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dutyStatus;
    @XmlElement(name = "CountryOfOriginCode")
    protected CountryOfOriginCodeType countryOfOriginCode;
    @XmlElement(name = "ShipTo")
    protected ShipToType shipTo;
    @XmlElement(name = "CountryOfFinalDestinationCode")
    protected CountryOfFinalDestinationCodeType countryOfFinalDestinationCode;
    @XmlElement(name = "ShippingLeadTime")
    protected BigInteger shippingLeadTime;
    @XmlElement(name = "ShipmentMethodOfPaymentCode")
    protected ShipmentMethodOfPaymentCodeType shipmentMethodOfPaymentCode;

    /**
     * Gets the value of the documentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getDocumentReference() {
        return documentReference;
    }

    /**
     * Sets the value of the documentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setDocumentReference(DocumentReferenceType value) {
        this.documentReference = value;
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
     * Gets the value of the buyerContractInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerContractInformationType }
     *     
     */
    public BuyerContractInformationType getBuyerContractInformation() {
        return buyerContractInformation;
    }

    /**
     * Sets the value of the buyerContractInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerContractInformationType }
     *     
     */
    public void setBuyerContractInformation(BuyerContractInformationType value) {
        this.buyerContractInformation = value;
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
     * Gets the value of the customerSpecificCatalogPriceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerSpecificCatalogPriceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerSpecificCatalogPriceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSpecificCatalogPriceDataType }
     * 
     * 
     */
    public List<CustomerSpecificCatalogPriceDataType> getCustomerSpecificCatalogPriceData() {
        if (customerSpecificCatalogPriceData == null) {
            customerSpecificCatalogPriceData = new ArrayList<CustomerSpecificCatalogPriceDataType>();
        }
        return this.customerSpecificCatalogPriceData;
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
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link ShipToType }
     *     
     */
    public ShipToType getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipToType }
     *     
     */
    public void setShipTo(ShipToType value) {
        this.shipTo = value;
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
     * Gets the value of the shippingLeadTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShippingLeadTime() {
        return shippingLeadTime;
    }

    /**
     * Sets the value of the shippingLeadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShippingLeadTime(BigInteger value) {
        this.shippingLeadTime = value;
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

}

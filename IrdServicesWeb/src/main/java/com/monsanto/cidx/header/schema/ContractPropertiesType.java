
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
 * <p>Java class for ContractPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContractStatus"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContractNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContractTypeCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContractCommitmentType" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContractIssuedDate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContractExpirationDate" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContractDateRanges" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LanguageCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CurrencyCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OriginatorSequenceNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReleaseNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContractPaymentTerms" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarketPlaceInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportMethodCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentMethodOfPaymentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PrepaidContractInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Routing" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractPropertiesType", propOrder = {
    "contractStatus",
    "contractNumber",
    "contractTypeCode",
    "contractCommitmentType",
    "contractIssuedDate",
    "contractExpirationDate",
    "contractDateRanges",
    "languageCode",
    "currencyCode",
    "originatorSequenceNumber",
    "referenceInformation",
    "releaseNumber",
    "contractPaymentTerms",
    "marketPlaceInformation",
    "specialInstructions",
    "transportMethodCode",
    "deliveryTerms",
    "shipmentMethodOfPaymentCode",
    "prepaidContractInformation",
    "routing"
})
public class ContractPropertiesType {

    @XmlElement(name = "ContractStatus", required = true)
    protected CidxListContractStatus contractStatus;
    @XmlElement(name = "ContractNumber", required = true)
    protected ContractNumberType contractNumber;
    @XmlElement(name = "ContractTypeCode", required = true)
    protected CidxListContractTypeCode contractTypeCode;
    @XmlElement(name = "ContractCommitmentType")
    protected CidxListContractCommitmentType contractCommitmentType;
    @XmlElement(name = "ContractIssuedDate", required = true)
    protected ContractIssuedDateType contractIssuedDate;
    @XmlElement(name = "ContractExpirationDate")
    protected ContractExpirationDateType contractExpirationDate;
    @XmlElement(name = "ContractDateRanges")
    protected List<ContractDateRangesType> contractDateRanges;
    @XmlElement(name = "LanguageCode", required = true)
    protected LanguageCodeType languageCode;
    @XmlElement(name = "CurrencyCode", required = true)
    protected CurrencyCodeType currencyCode;
    @XmlElement(name = "OriginatorSequenceNumber", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String originatorSequenceNumber;
    @XmlElement(name = "ReferenceInformation")
    protected List<ReferenceInformationType> referenceInformation;
    @XmlElement(name = "ReleaseNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String releaseNumber;
    @XmlElement(name = "ContractPaymentTerms", required = true)
    protected List<ContractPaymentTermsType> contractPaymentTerms;
    @XmlElement(name = "MarketPlaceInformation")
    protected MarketPlaceInformationType marketPlaceInformation;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "TransportMethodCode")
    protected TransportMethodCodeType transportMethodCode;
    @XmlElement(name = "DeliveryTerms")
    protected DeliveryTermsType deliveryTerms;
    @XmlElement(name = "ShipmentMethodOfPaymentCode")
    protected ShipmentMethodOfPaymentCodeType shipmentMethodOfPaymentCode;
    @XmlElement(name = "PrepaidContractInformation")
    protected List<PrepaidContractInformationType> prepaidContractInformation;
    @XmlElement(name = "Routing")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String routing;

    /**
     * Gets the value of the contractStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListContractStatus }
     *     
     */
    public CidxListContractStatus getContractStatus() {
        return contractStatus;
    }

    /**
     * Sets the value of the contractStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListContractStatus }
     *     
     */
    public void setContractStatus(CidxListContractStatus value) {
        this.contractStatus = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ContractNumberType }
     *     
     */
    public ContractNumberType getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractNumberType }
     *     
     */
    public void setContractNumber(ContractNumberType value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the contractTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListContractTypeCode }
     *     
     */
    public CidxListContractTypeCode getContractTypeCode() {
        return contractTypeCode;
    }

    /**
     * Sets the value of the contractTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListContractTypeCode }
     *     
     */
    public void setContractTypeCode(CidxListContractTypeCode value) {
        this.contractTypeCode = value;
    }

    /**
     * Gets the value of the contractCommitmentType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListContractCommitmentType }
     *     
     */
    public CidxListContractCommitmentType getContractCommitmentType() {
        return contractCommitmentType;
    }

    /**
     * Sets the value of the contractCommitmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListContractCommitmentType }
     *     
     */
    public void setContractCommitmentType(CidxListContractCommitmentType value) {
        this.contractCommitmentType = value;
    }

    /**
     * Gets the value of the contractIssuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link ContractIssuedDateType }
     *     
     */
    public ContractIssuedDateType getContractIssuedDate() {
        return contractIssuedDate;
    }

    /**
     * Sets the value of the contractIssuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractIssuedDateType }
     *     
     */
    public void setContractIssuedDate(ContractIssuedDateType value) {
        this.contractIssuedDate = value;
    }

    /**
     * Gets the value of the contractExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link ContractExpirationDateType }
     *     
     */
    public ContractExpirationDateType getContractExpirationDate() {
        return contractExpirationDate;
    }

    /**
     * Sets the value of the contractExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractExpirationDateType }
     *     
     */
    public void setContractExpirationDate(ContractExpirationDateType value) {
        this.contractExpirationDate = value;
    }

    /**
     * Gets the value of the contractDateRanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractDateRanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractDateRanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractDateRangesType }
     * 
     * 
     */
    public List<ContractDateRangesType> getContractDateRanges() {
        if (contractDateRanges == null) {
            contractDateRanges = new ArrayList<ContractDateRangesType>();
        }
        return this.contractDateRanges;
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
     * Gets the value of the originatorSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorSequenceNumber() {
        return originatorSequenceNumber;
    }

    /**
     * Sets the value of the originatorSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorSequenceNumber(String value) {
        this.originatorSequenceNumber = value;
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
     * Gets the value of the contractPaymentTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractPaymentTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractPaymentTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractPaymentTermsType }
     * 
     * 
     */
    public List<ContractPaymentTermsType> getContractPaymentTerms() {
        if (contractPaymentTerms == null) {
            contractPaymentTerms = new ArrayList<ContractPaymentTermsType>();
        }
        return this.contractPaymentTerms;
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
     * Gets the value of the prepaidContractInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prepaidContractInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrepaidContractInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrepaidContractInformationType }
     * 
     * 
     */
    public List<PrepaidContractInformationType> getPrepaidContractInformation() {
        if (prepaidContractInformation == null) {
            prepaidContractInformation = new ArrayList<PrepaidContractInformationType>();
        }
        return this.prepaidContractInformation;
    }

    /**
     * Gets the value of the routing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouting() {
        return routing;
    }

    /**
     * Sets the value of the routing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouting(String value) {
        this.routing = value;
    }

}

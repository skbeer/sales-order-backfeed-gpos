
package com.monsanto.cidx.header.schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LoadTenderRailProductLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadTenderRailProductLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EquipmentDetailsLineNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LadingIdentification" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductIdentification" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductQuantity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PercentActive" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PalletQuantityInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportTemperature" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}VolumetricInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}GrossVolume" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NetVolume" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}GrossWeight" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NetWeight" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CountryOfOriginCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CustomsInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedDeliveryDateTime"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedPickupDateTime" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ControlledTemperature" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}QuoteIdentifier" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingLabel"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OtherPartner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentMethodOfPaymentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HazmatData" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ActionRequest" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EmergencyTemperature" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShippingServiceLevelCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadTenderRailProductLineItemType", propOrder = {
    "lineNumber",
    "equipmentDetailsLineNumber",
    "ladingIdentification",
    "productIdentification",
    "productQuantity",
    "percentActive",
    "palletQuantityInformation",
    "referenceInformation",
    "transportTemperature",
    "packagingInformation",
    "volumetricInformation",
    "grossVolume",
    "netVolume",
    "grossWeight",
    "netWeight",
    "countryOfOriginCode",
    "customsInformation",
    "requestedDeliveryDateTime",
    "requestedPickupDateTime",
    "controlledTemperature",
    "productLabel",
    "quoteIdentifier",
    "packagingLabel",
    "specialInstructions",
    "otherPartner",
    "deliveryTerms",
    "shipmentMethodOfPaymentCode",
    "hazmatData",
    "actionRequest",
    "emergencyTemperature",
    "shippingServiceLevelCode"
})
public class LoadTenderRailProductLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "EquipmentDetailsLineNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> equipmentDetailsLineNumber;
    @XmlElement(name = "LadingIdentification")
    protected LadingIdentificationType ladingIdentification;
    @XmlElement(name = "ProductIdentification")
    protected ProductIdentificationType productIdentification;
    @XmlElement(name = "ProductQuantity", required = true)
    protected ProductQuantityType productQuantity;
    @XmlElement(name = "PercentActive")
    protected BigDecimal percentActive;
    @XmlElement(name = "PalletQuantityInformation")
    protected PalletQuantityInformationType palletQuantityInformation;
    @XmlElement(name = "ReferenceInformation")
    protected List<ReferenceInformationType> referenceInformation;
    @XmlElement(name = "TransportTemperature")
    protected TransportTemperatureType transportTemperature;
    @XmlElement(name = "PackagingInformation")
    protected List<PackagingInformationType> packagingInformation;
    @XmlElement(name = "VolumetricInformation")
    protected VolumetricInformationType volumetricInformation;
    @XmlElement(name = "GrossVolume")
    protected GrossVolumeType grossVolume;
    @XmlElement(name = "NetVolume")
    protected NetVolumeType netVolume;
    @XmlElement(name = "GrossWeight")
    protected GrossWeightType grossWeight;
    @XmlElement(name = "NetWeight")
    protected NetWeightType netWeight;
    @XmlElement(name = "CountryOfOriginCode")
    protected CountryOfOriginCodeType countryOfOriginCode;
    @XmlElement(name = "CustomsInformation")
    protected List<CustomsInformationType> customsInformation;
    @XmlElement(name = "RequestedDeliveryDateTime", required = true)
    protected RequestedDeliveryDateTimeType requestedDeliveryDateTime;
    @XmlElement(name = "RequestedPickupDateTime")
    protected RequestedPickupDateTimeType requestedPickupDateTime;
    @XmlElement(name = "ControlledTemperature")
    protected ControlledTemperatureType controlledTemperature;
    @XmlElement(name = "ProductLabel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> productLabel;
    @XmlElement(name = "QuoteIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String quoteIdentifier;
    @XmlElement(name = "PackagingLabel", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String packagingLabel;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "OtherPartner")
    protected List<OtherPartnerType> otherPartner;
    @XmlElement(name = "DeliveryTerms")
    protected DeliveryTermsType deliveryTerms;
    @XmlElement(name = "ShipmentMethodOfPaymentCode")
    protected ShipmentMethodOfPaymentCodeType shipmentMethodOfPaymentCode;
    @XmlElement(name = "HazmatData")
    protected HazmatDataType hazmatData;
    @XmlElement(name = "ActionRequest")
    protected CidxListActionRequest actionRequest;
    @XmlElement(name = "EmergencyTemperature")
    protected EmergencyTemperatureType emergencyTemperature;
    @XmlElement(name = "ShippingServiceLevelCode")
    protected ShippingServiceLevelCodeType shippingServiceLevelCode;

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
     * Gets the value of the equipmentDetailsLineNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentDetailsLineNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentDetailsLineNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEquipmentDetailsLineNumber() {
        if (equipmentDetailsLineNumber == null) {
            equipmentDetailsLineNumber = new ArrayList<String>();
        }
        return this.equipmentDetailsLineNumber;
    }

    /**
     * Gets the value of the ladingIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link LadingIdentificationType }
     *     
     */
    public LadingIdentificationType getLadingIdentification() {
        return ladingIdentification;
    }

    /**
     * Sets the value of the ladingIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LadingIdentificationType }
     *     
     */
    public void setLadingIdentification(LadingIdentificationType value) {
        this.ladingIdentification = value;
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
     * Gets the value of the percentActive property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentActive() {
        return percentActive;
    }

    /**
     * Sets the value of the percentActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentActive(BigDecimal value) {
        this.percentActive = value;
    }

    /**
     * Gets the value of the palletQuantityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PalletQuantityInformationType }
     *     
     */
    public PalletQuantityInformationType getPalletQuantityInformation() {
        return palletQuantityInformation;
    }

    /**
     * Sets the value of the palletQuantityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PalletQuantityInformationType }
     *     
     */
    public void setPalletQuantityInformation(PalletQuantityInformationType value) {
        this.palletQuantityInformation = value;
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
     * Gets the value of the transportTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TransportTemperatureType }
     *     
     */
    public TransportTemperatureType getTransportTemperature() {
        return transportTemperature;
    }

    /**
     * Sets the value of the transportTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportTemperatureType }
     *     
     */
    public void setTransportTemperature(TransportTemperatureType value) {
        this.transportTemperature = value;
    }

    /**
     * Gets the value of the packagingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingInformationType }
     * 
     * 
     */
    public List<PackagingInformationType> getPackagingInformation() {
        if (packagingInformation == null) {
            packagingInformation = new ArrayList<PackagingInformationType>();
        }
        return this.packagingInformation;
    }

    /**
     * Gets the value of the volumetricInformation property.
     * 
     * @return
     *     possible object is
     *     {@link VolumetricInformationType }
     *     
     */
    public VolumetricInformationType getVolumetricInformation() {
        return volumetricInformation;
    }

    /**
     * Sets the value of the volumetricInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumetricInformationType }
     *     
     */
    public void setVolumetricInformation(VolumetricInformationType value) {
        this.volumetricInformation = value;
    }

    /**
     * Gets the value of the grossVolume property.
     * 
     * @return
     *     possible object is
     *     {@link GrossVolumeType }
     *     
     */
    public GrossVolumeType getGrossVolume() {
        return grossVolume;
    }

    /**
     * Sets the value of the grossVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossVolumeType }
     *     
     */
    public void setGrossVolume(GrossVolumeType value) {
        this.grossVolume = value;
    }

    /**
     * Gets the value of the netVolume property.
     * 
     * @return
     *     possible object is
     *     {@link NetVolumeType }
     *     
     */
    public NetVolumeType getNetVolume() {
        return netVolume;
    }

    /**
     * Sets the value of the netVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetVolumeType }
     *     
     */
    public void setNetVolume(NetVolumeType value) {
        this.netVolume = value;
    }

    /**
     * Gets the value of the grossWeight property.
     * 
     * @return
     *     possible object is
     *     {@link GrossWeightType }
     *     
     */
    public GrossWeightType getGrossWeight() {
        return grossWeight;
    }

    /**
     * Sets the value of the grossWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossWeightType }
     *     
     */
    public void setGrossWeight(GrossWeightType value) {
        this.grossWeight = value;
    }

    /**
     * Gets the value of the netWeight property.
     * 
     * @return
     *     possible object is
     *     {@link NetWeightType }
     *     
     */
    public NetWeightType getNetWeight() {
        return netWeight;
    }

    /**
     * Sets the value of the netWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetWeightType }
     *     
     */
    public void setNetWeight(NetWeightType value) {
        this.netWeight = value;
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
     * Gets the value of the requestedPickupDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedPickupDateTimeType }
     *     
     */
    public RequestedPickupDateTimeType getRequestedPickupDateTime() {
        return requestedPickupDateTime;
    }

    /**
     * Sets the value of the requestedPickupDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedPickupDateTimeType }
     *     
     */
    public void setRequestedPickupDateTime(RequestedPickupDateTimeType value) {
        this.requestedPickupDateTime = value;
    }

    /**
     * Gets the value of the controlledTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledTemperatureType }
     *     
     */
    public ControlledTemperatureType getControlledTemperature() {
        return controlledTemperature;
    }

    /**
     * Sets the value of the controlledTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledTemperatureType }
     *     
     */
    public void setControlledTemperature(ControlledTemperatureType value) {
        this.controlledTemperature = value;
    }

    /**
     * Gets the value of the productLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductLabel() {
        if (productLabel == null) {
            productLabel = new ArrayList<String>();
        }
        return this.productLabel;
    }

    /**
     * Gets the value of the quoteIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteIdentifier() {
        return quoteIdentifier;
    }

    /**
     * Sets the value of the quoteIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteIdentifier(String value) {
        this.quoteIdentifier = value;
    }

    /**
     * Gets the value of the packagingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingLabel() {
        return packagingLabel;
    }

    /**
     * Sets the value of the packagingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingLabel(String value) {
        this.packagingLabel = value;
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
     * Gets the value of the hazmatData property.
     * 
     * @return
     *     possible object is
     *     {@link HazmatDataType }
     *     
     */
    public HazmatDataType getHazmatData() {
        return hazmatData;
    }

    /**
     * Sets the value of the hazmatData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazmatDataType }
     *     
     */
    public void setHazmatData(HazmatDataType value) {
        this.hazmatData = value;
    }

    /**
     * Gets the value of the actionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListActionRequest }
     *     
     */
    public CidxListActionRequest getActionRequest() {
        return actionRequest;
    }

    /**
     * Sets the value of the actionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListActionRequest }
     *     
     */
    public void setActionRequest(CidxListActionRequest value) {
        this.actionRequest = value;
    }

    /**
     * Gets the value of the emergencyTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyTemperatureType }
     *     
     */
    public EmergencyTemperatureType getEmergencyTemperature() {
        return emergencyTemperature;
    }

    /**
     * Sets the value of the emergencyTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyTemperatureType }
     *     
     */
    public void setEmergencyTemperature(EmergencyTemperatureType value) {
        this.emergencyTemperature = value;
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

}


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
 * <p>Java class for ShipmentInstructionsLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentInstructionsLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EquipmentDetailsLineNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LadingIdentification" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InventoryLocation"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductIdentification"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductQuantity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PercentActive" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportTemperature" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EmergencyTemperature" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PalletQuantityInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NumberPackagingUnits" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}VolumetricInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}GrossVolume" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NetVolume" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}GrossWeight" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NetWeight" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CountryOfOriginCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineItemTotal" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LetterOfCreditInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingLabel" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CustomsInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedDeliveryDateTime"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RequestedPickupDateTime" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ControlledTemperature" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}QuoteIdentifier" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentMethodOfPaymentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Section7Name" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InlandDestinationPointCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HazmatData" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CustomsCostInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentInstructionsSubLineItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OperationalInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportDocumentInstructions" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ShipmentInstructionsLineItemType", propOrder = {
    "lineNumber",
    "equipmentDetailsLineNumber",
    "ladingIdentification",
    "inventoryLocation",
    "productIdentification",
    "productQuantity",
    "percentActive",
    "referenceInformation",
    "comment",
    "transportTemperature",
    "emergencyTemperature",
    "palletQuantityInformation",
    "packagingInformation",
    "numberPackagingUnits",
    "volumetricInformation",
    "grossVolume",
    "netVolume",
    "grossWeight",
    "netWeight",
    "countryOfOriginCode",
    "lineItemTotal",
    "letterOfCreditInformation",
    "productLabel",
    "packagingLabel",
    "customsInformation",
    "requestedDeliveryDateTime",
    "requestedPickupDateTime",
    "controlledTemperature",
    "quoteIdentifier",
    "deliveryTerms",
    "shipmentMethodOfPaymentCode",
    "section7Name",
    "inlandDestinationPointCode",
    "specialInstructions",
    "hazmatData",
    "customsCostInformation",
    "shipmentInstructionsSubLineItem",
    "operationalInstructions",
    "transportDocumentInstructions",
    "shippingServiceLevelCode"
})
public class ShipmentInstructionsLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "EquipmentDetailsLineNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> equipmentDetailsLineNumber;
    @XmlElement(name = "LadingIdentification", required = true)
    protected List<LadingIdentificationType> ladingIdentification;
    @XmlElement(name = "InventoryLocation", required = true)
    protected InventoryLocationType inventoryLocation;
    @XmlElement(name = "ProductIdentification", required = true)
    protected ProductIdentificationType productIdentification;
    @XmlElement(name = "ProductQuantity", required = true)
    protected ProductQuantityType productQuantity;
    @XmlElement(name = "PercentActive")
    protected BigDecimal percentActive;
    @XmlElement(name = "ReferenceInformation")
    protected List<ReferenceInformationType> referenceInformation;
    @XmlElement(name = "Comment")
    protected List<CommentType> comment;
    @XmlElement(name = "TransportTemperature")
    protected TransportTemperatureType transportTemperature;
    @XmlElement(name = "EmergencyTemperature")
    protected EmergencyTemperatureType emergencyTemperature;
    @XmlElement(name = "PalletQuantityInformation")
    protected PalletQuantityInformationType palletQuantityInformation;
    @XmlElement(name = "PackagingInformation")
    protected List<PackagingInformationType> packagingInformation;
    @XmlElement(name = "NumberPackagingUnits")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String numberPackagingUnits;
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
    @XmlElement(name = "LineItemTotal")
    protected LineItemTotalType lineItemTotal;
    @XmlElement(name = "LetterOfCreditInformation")
    protected LetterOfCreditInformationType letterOfCreditInformation;
    @XmlElement(name = "ProductLabel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> productLabel;
    @XmlElement(name = "PackagingLabel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String packagingLabel;
    @XmlElement(name = "CustomsInformation")
    protected List<CustomsInformationType> customsInformation;
    @XmlElement(name = "RequestedDeliveryDateTime", required = true)
    protected RequestedDeliveryDateTimeType requestedDeliveryDateTime;
    @XmlElement(name = "RequestedPickupDateTime")
    protected RequestedPickupDateTimeType requestedPickupDateTime;
    @XmlElement(name = "ControlledTemperature")
    protected ControlledTemperatureType controlledTemperature;
    @XmlElement(name = "QuoteIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String quoteIdentifier;
    @XmlElement(name = "DeliveryTerms")
    protected DeliveryTermsType deliveryTerms;
    @XmlElement(name = "ShipmentMethodOfPaymentCode")
    protected ShipmentMethodOfPaymentCodeType shipmentMethodOfPaymentCode;
    @XmlElement(name = "Section7Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String section7Name;
    @XmlElement(name = "InlandDestinationPointCode")
    protected InlandDestinationPointCodeType inlandDestinationPointCode;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "HazmatData")
    protected HazmatDataType hazmatData;
    @XmlElement(name = "CustomsCostInformation")
    protected CustomsCostInformationType customsCostInformation;
    @XmlElement(name = "ShipmentInstructionsSubLineItem")
    protected List<ShipmentInstructionsSubLineItemType> shipmentInstructionsSubLineItem;
    @XmlElement(name = "OperationalInstructions")
    protected List<OperationalInstructionsType> operationalInstructions;
    @XmlElement(name = "TransportDocumentInstructions")
    protected List<TransportDocumentInstructionsType> transportDocumentInstructions;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ladingIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLadingIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LadingIdentificationType }
     * 
     * 
     */
    public List<LadingIdentificationType> getLadingIdentification() {
        if (ladingIdentification == null) {
            ladingIdentification = new ArrayList<LadingIdentificationType>();
        }
        return this.ladingIdentification;
    }

    /**
     * Gets the value of the inventoryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryLocationType }
     *     
     */
    public InventoryLocationType getInventoryLocation() {
        return inventoryLocation;
    }

    /**
     * Sets the value of the inventoryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryLocationType }
     *     
     */
    public void setInventoryLocation(InventoryLocationType value) {
        this.inventoryLocation = value;
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
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentType }
     * 
     * 
     */
    public List<CommentType> getComment() {
        if (comment == null) {
            comment = new ArrayList<CommentType>();
        }
        return this.comment;
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
     * Gets the value of the numberPackagingUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberPackagingUnits() {
        return numberPackagingUnits;
    }

    /**
     * Sets the value of the numberPackagingUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberPackagingUnits(String value) {
        this.numberPackagingUnits = value;
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
     * Gets the value of the lineItemTotal property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemTotalType }
     *     
     */
    public LineItemTotalType getLineItemTotal() {
        return lineItemTotal;
    }

    /**
     * Sets the value of the lineItemTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemTotalType }
     *     
     */
    public void setLineItemTotal(LineItemTotalType value) {
        this.lineItemTotal = value;
    }

    /**
     * Gets the value of the letterOfCreditInformation property.
     * 
     * @return
     *     possible object is
     *     {@link LetterOfCreditInformationType }
     *     
     */
    public LetterOfCreditInformationType getLetterOfCreditInformation() {
        return letterOfCreditInformation;
    }

    /**
     * Sets the value of the letterOfCreditInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterOfCreditInformationType }
     *     
     */
    public void setLetterOfCreditInformation(LetterOfCreditInformationType value) {
        this.letterOfCreditInformation = value;
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
     * Gets the value of the section7Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSection7Name() {
        return section7Name;
    }

    /**
     * Sets the value of the section7Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSection7Name(String value) {
        this.section7Name = value;
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
     * Gets the value of the customsCostInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsCostInformationType }
     *     
     */
    public CustomsCostInformationType getCustomsCostInformation() {
        return customsCostInformation;
    }

    /**
     * Sets the value of the customsCostInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsCostInformationType }
     *     
     */
    public void setCustomsCostInformation(CustomsCostInformationType value) {
        this.customsCostInformation = value;
    }

    /**
     * Gets the value of the shipmentInstructionsSubLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentInstructionsSubLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentInstructionsSubLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentInstructionsSubLineItemType }
     * 
     * 
     */
    public List<ShipmentInstructionsSubLineItemType> getShipmentInstructionsSubLineItem() {
        if (shipmentInstructionsSubLineItem == null) {
            shipmentInstructionsSubLineItem = new ArrayList<ShipmentInstructionsSubLineItemType>();
        }
        return this.shipmentInstructionsSubLineItem;
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

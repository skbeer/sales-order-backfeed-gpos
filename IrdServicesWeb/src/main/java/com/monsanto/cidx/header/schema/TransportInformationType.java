
package com.monsanto.cidx.header.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TransportInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipStartDate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipEndDate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportStepNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportMethodCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LocationFrom"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LocationTo"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CarrierEquipmentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TransportName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}OtherPartner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ConfirmedPrice" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StageIdentifier" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListTransportationInformationStageIdentifier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportInformationType", propOrder = {
    "shipStartDate",
    "shipEndDate",
    "transportStepNumber",
    "transportMethodCode",
    "locationFrom",
    "locationTo",
    "carrierEquipmentCode",
    "referenceInformation",
    "transportName",
    "otherPartner",
    "confirmedPrice"
})
public class TransportInformationType {

    @XmlElement(name = "ShipStartDate", required = true)
    protected ShipStartDateType shipStartDate;
    @XmlElement(name = "ShipEndDate", required = true)
    protected ShipEndDateType shipEndDate;
    @XmlElement(name = "TransportStepNumber", required = true)
    protected BigInteger transportStepNumber;
    @XmlElement(name = "TransportMethodCode", required = true)
    protected TransportMethodCodeType transportMethodCode;
    @XmlElement(name = "LocationFrom", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String locationFrom;
    @XmlElement(name = "LocationTo", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String locationTo;
    @XmlElement(name = "CarrierEquipmentCode")
    protected CarrierEquipmentCodeType carrierEquipmentCode;
    @XmlElement(name = "ReferenceInformation")
    protected ReferenceInformationType referenceInformation;
    @XmlElement(name = "TransportName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> transportName;
    @XmlElement(name = "OtherPartner")
    protected List<OtherPartnerType> otherPartner;
    @XmlElement(name = "ConfirmedPrice")
    protected ConfirmedPriceType confirmedPrice;
    @XmlAttribute(name = "StageIdentifier", required = true)
    protected CidxListTransportationInformationStageIdentifier stageIdentifier;

    /**
     * Gets the value of the shipStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link ShipStartDateType }
     *     
     */
    public ShipStartDateType getShipStartDate() {
        return shipStartDate;
    }

    /**
     * Sets the value of the shipStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipStartDateType }
     *     
     */
    public void setShipStartDate(ShipStartDateType value) {
        this.shipStartDate = value;
    }

    /**
     * Gets the value of the shipEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link ShipEndDateType }
     *     
     */
    public ShipEndDateType getShipEndDate() {
        return shipEndDate;
    }

    /**
     * Sets the value of the shipEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipEndDateType }
     *     
     */
    public void setShipEndDate(ShipEndDateType value) {
        this.shipEndDate = value;
    }

    /**
     * Gets the value of the transportStepNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransportStepNumber() {
        return transportStepNumber;
    }

    /**
     * Sets the value of the transportStepNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransportStepNumber(BigInteger value) {
        this.transportStepNumber = value;
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
     * Gets the value of the locationFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationFrom() {
        return locationFrom;
    }

    /**
     * Sets the value of the locationFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationFrom(String value) {
        this.locationFrom = value;
    }

    /**
     * Gets the value of the locationTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationTo() {
        return locationTo;
    }

    /**
     * Sets the value of the locationTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationTo(String value) {
        this.locationTo = value;
    }

    /**
     * Gets the value of the carrierEquipmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierEquipmentCodeType }
     *     
     */
    public CarrierEquipmentCodeType getCarrierEquipmentCode() {
        return carrierEquipmentCode;
    }

    /**
     * Sets the value of the carrierEquipmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierEquipmentCodeType }
     *     
     */
    public void setCarrierEquipmentCode(CarrierEquipmentCodeType value) {
        this.carrierEquipmentCode = value;
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
     * Gets the value of the transportName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTransportName() {
        if (transportName == null) {
            transportName = new ArrayList<String>();
        }
        return this.transportName;
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
     * Gets the value of the confirmedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmedPriceType }
     *     
     */
    public ConfirmedPriceType getConfirmedPrice() {
        return confirmedPrice;
    }

    /**
     * Sets the value of the confirmedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmedPriceType }
     *     
     */
    public void setConfirmedPrice(ConfirmedPriceType value) {
        this.confirmedPrice = value;
    }

    /**
     * Gets the value of the stageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListTransportationInformationStageIdentifier }
     *     
     */
    public CidxListTransportationInformationStageIdentifier getStageIdentifier() {
        return stageIdentifier;
    }

    /**
     * Sets the value of the stageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListTransportationInformationStageIdentifier }
     *     
     */
    public void setStageIdentifier(CidxListTransportationInformationStageIdentifier value) {
        this.stageIdentifier = value;
    }

}

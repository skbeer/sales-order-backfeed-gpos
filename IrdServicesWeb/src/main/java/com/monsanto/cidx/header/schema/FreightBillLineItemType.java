
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
 * <p>Java class for FreightBillLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightBillLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}EquipmentDetailsLineNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LadingIdentification" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductIdentification"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductQuantity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipDate" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PurchaseOrderInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ShipmentMethodOfPaymentCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CarrierReferenceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialHandlingInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TariffIdentification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}FreightCharge" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DistanceBasis" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RateBasis" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineItemTaxableTotal" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineItemTotal"/>
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
@XmlType(name = "FreightBillLineItemType", propOrder = {
    "lineNumber",
    "equipmentDetailsLineNumber",
    "ladingIdentification",
    "productIdentification",
    "productQuantity",
    "shipDate",
    "purchaseOrderInformation",
    "referenceInformation",
    "deliveryTerms",
    "shipmentMethodOfPaymentCode",
    "carrierReferenceInformation",
    "specialHandlingInformation",
    "specialInstructions",
    "tariffIdentification",
    "freightCharge",
    "distanceBasis",
    "rateBasis",
    "lineItemTaxableTotal",
    "lineItemTotal",
    "shippingServiceLevelCode"
})
public class FreightBillLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "EquipmentDetailsLineNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> equipmentDetailsLineNumber;
    @XmlElement(name = "LadingIdentification", required = true)
    protected List<LadingIdentificationType> ladingIdentification;
    @XmlElement(name = "ProductIdentification", required = true)
    protected ProductIdentificationType productIdentification;
    @XmlElement(name = "ProductQuantity", required = true)
    protected ProductQuantityType productQuantity;
    @XmlElement(name = "ShipDate")
    protected ShipDateType shipDate;
    @XmlElement(name = "PurchaseOrderInformation")
    protected PurchaseOrderInformationType purchaseOrderInformation;
    @XmlElement(name = "ReferenceInformation")
    protected List<ReferenceInformationType> referenceInformation;
    @XmlElement(name = "DeliveryTerms")
    protected DeliveryTermsType deliveryTerms;
    @XmlElement(name = "ShipmentMethodOfPaymentCode")
    protected ShipmentMethodOfPaymentCodeType shipmentMethodOfPaymentCode;
    @XmlElement(name = "CarrierReferenceInformation")
    protected List<CarrierReferenceInformationType> carrierReferenceInformation;
    @XmlElement(name = "SpecialHandlingInformation")
    protected List<SpecialHandlingInformationType> specialHandlingInformation;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "TariffIdentification")
    protected List<TariffIdentificationType> tariffIdentification;
    @XmlElement(name = "FreightCharge")
    protected FreightChargeType freightCharge;
    @XmlElement(name = "DistanceBasis")
    protected DistanceBasisType distanceBasis;
    @XmlElement(name = "RateBasis")
    protected RateBasisType rateBasis;
    @XmlElement(name = "LineItemTaxableTotal")
    protected LineItemTaxableTotalType lineItemTaxableTotal;
    @XmlElement(name = "LineItemTotal", required = true)
    protected LineItemTotalType lineItemTotal;
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
     * Gets the value of the carrierReferenceInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierReferenceInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierReferenceInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierReferenceInformationType }
     * 
     * 
     */
    public List<CarrierReferenceInformationType> getCarrierReferenceInformation() {
        if (carrierReferenceInformation == null) {
            carrierReferenceInformation = new ArrayList<CarrierReferenceInformationType>();
        }
        return this.carrierReferenceInformation;
    }

    /**
     * Gets the value of the specialHandlingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialHandlingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialHandlingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialHandlingInformationType }
     * 
     * 
     */
    public List<SpecialHandlingInformationType> getSpecialHandlingInformation() {
        if (specialHandlingInformation == null) {
            specialHandlingInformation = new ArrayList<SpecialHandlingInformationType>();
        }
        return this.specialHandlingInformation;
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
     * Gets the value of the tariffIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffIdentificationType }
     * 
     * 
     */
    public List<TariffIdentificationType> getTariffIdentification() {
        if (tariffIdentification == null) {
            tariffIdentification = new ArrayList<TariffIdentificationType>();
        }
        return this.tariffIdentification;
    }

    /**
     * Gets the value of the freightCharge property.
     * 
     * @return
     *     possible object is
     *     {@link FreightChargeType }
     *     
     */
    public FreightChargeType getFreightCharge() {
        return freightCharge;
    }

    /**
     * Sets the value of the freightCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightChargeType }
     *     
     */
    public void setFreightCharge(FreightChargeType value) {
        this.freightCharge = value;
    }

    /**
     * Gets the value of the distanceBasis property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceBasisType }
     *     
     */
    public DistanceBasisType getDistanceBasis() {
        return distanceBasis;
    }

    /**
     * Sets the value of the distanceBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceBasisType }
     *     
     */
    public void setDistanceBasis(DistanceBasisType value) {
        this.distanceBasis = value;
    }

    /**
     * Gets the value of the rateBasis property.
     * 
     * @return
     *     possible object is
     *     {@link RateBasisType }
     *     
     */
    public RateBasisType getRateBasis() {
        return rateBasis;
    }

    /**
     * Sets the value of the rateBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateBasisType }
     *     
     */
    public void setRateBasis(RateBasisType value) {
        this.rateBasis = value;
    }

    /**
     * Gets the value of the lineItemTaxableTotal property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemTaxableTotalType }
     *     
     */
    public LineItemTaxableTotalType getLineItemTaxableTotal() {
        return lineItemTaxableTotal;
    }

    /**
     * Sets the value of the lineItemTaxableTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemTaxableTotalType }
     *     
     */
    public void setLineItemTaxableTotal(LineItemTaxableTotalType value) {
        this.lineItemTaxableTotal = value;
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

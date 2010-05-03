
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastedProductMovementProductLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastedProductMovementProductLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductIdentification" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductQuantity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Splits" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ConfirmedPrice" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Characteristic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BatchNumbers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SerialNumbers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PackagingContainerInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CountryOfOrginCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastedProductMovementProductLineItemType", propOrder = {
    "lineNumber",
    "referenceInformation",
    "productIdentification",
    "productQuantity",
    "splits",
    "packagingQuantity",
    "confirmedPrice",
    "characteristic",
    "batchNumbers",
    "serialNumbers",
    "packagingContainerInformation",
    "countryOfOrginCode",
    "specialInstructions"
})
public class ForecastedProductMovementProductLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "ReferenceInformation")
    protected List<ReferenceInformationType> referenceInformation;
    @XmlElement(name = "ProductIdentification", required = true)
    protected List<ProductIdentificationType> productIdentification;
    @XmlElement(name = "ProductQuantity", required = true)
    protected ProductQuantityType productQuantity;
    @XmlElement(name = "Splits")
    protected SplitsType splits;
    @XmlElement(name = "PackagingQuantity")
    protected PackagingQuantityType packagingQuantity;
    @XmlElement(name = "ConfirmedPrice")
    protected ConfirmedPriceType confirmedPrice;
    @XmlElement(name = "Characteristic")
    protected List<CharacteristicType> characteristic;
    @XmlElement(name = "BatchNumbers")
    protected List<BatchNumbersType> batchNumbers;
    @XmlElement(name = "SerialNumbers")
    protected List<SerialNumbersType> serialNumbers;
    @XmlElement(name = "PackagingContainerInformation")
    protected PackagingContainerInformationType packagingContainerInformation;
    @XmlElement(name = "CountryOfOrginCode")
    protected CountryOfOrginCodeType countryOfOrginCode;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;

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
     * Gets the value of the splits property.
     * 
     * @return
     *     possible object is
     *     {@link SplitsType }
     *     
     */
    public SplitsType getSplits() {
        return splits;
    }

    /**
     * Sets the value of the splits property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitsType }
     *     
     */
    public void setSplits(SplitsType value) {
        this.splits = value;
    }

    /**
     * Gets the value of the packagingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingQuantityType }
     *     
     */
    public PackagingQuantityType getPackagingQuantity() {
        return packagingQuantity;
    }

    /**
     * Sets the value of the packagingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingQuantityType }
     *     
     */
    public void setPackagingQuantity(PackagingQuantityType value) {
        this.packagingQuantity = value;
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
     * Gets the value of the characteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacteristicType }
     * 
     * 
     */
    public List<CharacteristicType> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new ArrayList<CharacteristicType>();
        }
        return this.characteristic;
    }

    /**
     * Gets the value of the batchNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchNumbersType }
     * 
     * 
     */
    public List<BatchNumbersType> getBatchNumbers() {
        if (batchNumbers == null) {
            batchNumbers = new ArrayList<BatchNumbersType>();
        }
        return this.batchNumbers;
    }

    /**
     * Gets the value of the serialNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SerialNumbersType }
     * 
     * 
     */
    public List<SerialNumbersType> getSerialNumbers() {
        if (serialNumbers == null) {
            serialNumbers = new ArrayList<SerialNumbersType>();
        }
        return this.serialNumbers;
    }

    /**
     * Gets the value of the packagingContainerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingContainerInformationType }
     *     
     */
    public PackagingContainerInformationType getPackagingContainerInformation() {
        return packagingContainerInformation;
    }

    /**
     * Sets the value of the packagingContainerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingContainerInformationType }
     *     
     */
    public void setPackagingContainerInformation(PackagingContainerInformationType value) {
        this.packagingContainerInformation = value;
    }

    /**
     * Gets the value of the countryOfOrginCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryOfOrginCodeType }
     *     
     */
    public CountryOfOrginCodeType getCountryOfOrginCode() {
        return countryOfOrginCode;
    }

    /**
     * Sets the value of the countryOfOrginCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryOfOrginCodeType }
     *     
     */
    public void setCountryOfOrginCode(CountryOfOrginCodeType value) {
        this.countryOfOrginCode = value;
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

}

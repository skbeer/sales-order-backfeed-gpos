
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductGroupLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductGroupLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductIdentification" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductQuantity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ConfirmedPrice" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ScheduleDateTimeInformation"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OptionType" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListProductGroupOption" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductGroupLineItemType", propOrder = {
    "productIdentification",
    "productQuantity",
    "referenceInformation",
    "confirmedPrice",
    "scheduleDateTimeInformation",
    "specialInstructions"
})
public class ProductGroupLineItemType {

    @XmlElement(name = "ProductIdentification", required = true)
    protected List<ProductIdentificationType> productIdentification;
    @XmlElement(name = "ProductQuantity", required = true)
    protected ProductQuantityType productQuantity;
    @XmlElement(name = "ReferenceInformation")
    protected ReferenceInformationType referenceInformation;
    @XmlElement(name = "ConfirmedPrice")
    protected ConfirmedPriceType confirmedPrice;
    @XmlElement(name = "ScheduleDateTimeInformation", required = true)
    protected ScheduleDateTimeInformationType scheduleDateTimeInformation;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlAttribute(name = "OptionType", required = true)
    protected CidxListProductGroupOption optionType;

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
     * Gets the value of the optionType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListProductGroupOption }
     *     
     */
    public CidxListProductGroupOption getOptionType() {
        return optionType;
    }

    /**
     * Sets the value of the optionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListProductGroupOption }
     *     
     */
    public void setOptionType(CidxListProductGroupOption value) {
        this.optionType = value;
    }

}

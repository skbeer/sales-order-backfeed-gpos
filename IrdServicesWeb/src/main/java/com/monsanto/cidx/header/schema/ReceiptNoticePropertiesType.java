
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
 * <p>Java class for ReceiptNoticePropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiptNoticePropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryReceiptIdentification"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PurchaseOrderInformation"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReceiptCondition" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReceiptNoticeStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReceiptNoticeReason" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LanguageCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiptNoticePropertiesType", propOrder = {
    "deliveryReceiptIdentification",
    "purchaseOrderInformation",
    "referenceInformation",
    "receiptCondition",
    "specialInstructions",
    "receiptNoticeStatus",
    "receiptNoticeReason",
    "languageCode"
})
public class ReceiptNoticePropertiesType {

    @XmlElement(name = "DeliveryReceiptIdentification", required = true)
    protected DeliveryReceiptIdentificationType deliveryReceiptIdentification;
    @XmlElement(name = "PurchaseOrderInformation", required = true)
    protected PurchaseOrderInformationType purchaseOrderInformation;
    @XmlElement(name = "ReferenceInformation")
    protected List<ReferenceInformationType> referenceInformation;
    @XmlElement(name = "ReceiptCondition")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String receiptCondition;
    @XmlElement(name = "SpecialInstructions")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "ReceiptNoticeStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String receiptNoticeStatus;
    @XmlElement(name = "ReceiptNoticeReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String receiptNoticeReason;
    @XmlElement(name = "LanguageCode")
    protected LanguageCodeType languageCode;

    /**
     * Gets the value of the deliveryReceiptIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptIdentificationType }
     *     
     */
    public DeliveryReceiptIdentificationType getDeliveryReceiptIdentification() {
        return deliveryReceiptIdentification;
    }

    /**
     * Sets the value of the deliveryReceiptIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptIdentificationType }
     *     
     */
    public void setDeliveryReceiptIdentification(DeliveryReceiptIdentificationType value) {
        this.deliveryReceiptIdentification = value;
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
     * Gets the value of the receiptCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptCondition() {
        return receiptCondition;
    }

    /**
     * Sets the value of the receiptCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptCondition(String value) {
        this.receiptCondition = value;
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
     * Gets the value of the receiptNoticeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptNoticeStatus() {
        return receiptNoticeStatus;
    }

    /**
     * Sets the value of the receiptNoticeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptNoticeStatus(String value) {
        this.receiptNoticeStatus = value;
    }

    /**
     * Gets the value of the receiptNoticeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptNoticeReason() {
        return receiptNoticeReason;
    }

    /**
     * Sets the value of the receiptNoticeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptNoticeReason(String value) {
        this.receiptNoticeReason = value;
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

}

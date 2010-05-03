
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
 * <p>Java class for DeliveryConfirmationResponsePropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryConfirmationResponsePropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryConfirmationAcceptance"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeliveryConfirmationRejectionDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PurchaseOrderNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReleaseNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PurchaseOrderIssuedDate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LanguageCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReferenceInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarketPlaceInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryConfirmationResponsePropertiesType", propOrder = {
    "deliveryConfirmationAcceptance",
    "deliveryConfirmationRejectionDescription",
    "purchaseOrderNumber",
    "releaseNumber",
    "purchaseOrderIssuedDate",
    "languageCode",
    "referenceInformation",
    "marketPlaceInformation"
})
public class DeliveryConfirmationResponsePropertiesType {

    @XmlElement(name = "DeliveryConfirmationAcceptance", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deliveryConfirmationAcceptance;
    @XmlElement(name = "DeliveryConfirmationRejectionDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> deliveryConfirmationRejectionDescription;
    @XmlElement(name = "PurchaseOrderNumber", required = true)
    protected PurchaseOrderNumberType purchaseOrderNumber;
    @XmlElement(name = "ReleaseNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String releaseNumber;
    @XmlElement(name = "PurchaseOrderIssuedDate", required = true)
    protected PurchaseOrderIssuedDateType purchaseOrderIssuedDate;
    @XmlElement(name = "LanguageCode", required = true)
    protected LanguageCodeType languageCode;
    @XmlElement(name = "ReferenceInformation")
    protected ReferenceInformationType referenceInformation;
    @XmlElement(name = "MarketPlaceInformation")
    protected MarketPlaceInformationType marketPlaceInformation;

    /**
     * Gets the value of the deliveryConfirmationAcceptance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryConfirmationAcceptance() {
        return deliveryConfirmationAcceptance;
    }

    /**
     * Sets the value of the deliveryConfirmationAcceptance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryConfirmationAcceptance(String value) {
        this.deliveryConfirmationAcceptance = value;
    }

    /**
     * Gets the value of the deliveryConfirmationRejectionDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryConfirmationRejectionDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryConfirmationRejectionDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeliveryConfirmationRejectionDescription() {
        if (deliveryConfirmationRejectionDescription == null) {
            deliveryConfirmationRejectionDescription = new ArrayList<String>();
        }
        return this.deliveryConfirmationRejectionDescription;
    }

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderNumberType }
     *     
     */
    public PurchaseOrderNumberType getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Sets the value of the purchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderNumberType }
     *     
     */
    public void setPurchaseOrderNumber(PurchaseOrderNumberType value) {
        this.purchaseOrderNumber = value;
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
     * Gets the value of the purchaseOrderIssuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderIssuedDateType }
     *     
     */
    public PurchaseOrderIssuedDateType getPurchaseOrderIssuedDate() {
        return purchaseOrderIssuedDate;
    }

    /**
     * Sets the value of the purchaseOrderIssuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderIssuedDateType }
     *     
     */
    public void setPurchaseOrderIssuedDate(PurchaseOrderIssuedDateType value) {
        this.purchaseOrderIssuedDate = value;
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

}

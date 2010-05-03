
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DocumentRecipientInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentRecipientInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DocumentRecipientPartner"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DocumentDeliveryMethod" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LanguageCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NumberOfOriginals" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NumberOfCopies" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DeliveryMethodQualifier" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListDocumentDeliveryCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentRecipientInformationType", propOrder = {
    "documentRecipientPartner",
    "documentDeliveryMethod",
    "languageCode",
    "numberOfOriginals",
    "numberOfCopies"
})
public class DocumentRecipientInformationType {

    @XmlElement(name = "DocumentRecipientPartner", required = true)
    protected DocumentRecipientPartnerType documentRecipientPartner;
    @XmlElement(name = "DocumentDeliveryMethod")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String documentDeliveryMethod;
    @XmlElement(name = "LanguageCode")
    protected LanguageCodeType languageCode;
    @XmlElement(name = "NumberOfOriginals")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String numberOfOriginals;
    @XmlElement(name = "NumberOfCopies")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String numberOfCopies;
    @XmlAttribute(name = "DeliveryMethodQualifier", required = true)
    protected CidxListDocumentDeliveryCode deliveryMethodQualifier;

    /**
     * Gets the value of the documentRecipientPartner property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentRecipientPartnerType }
     *     
     */
    public DocumentRecipientPartnerType getDocumentRecipientPartner() {
        return documentRecipientPartner;
    }

    /**
     * Sets the value of the documentRecipientPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentRecipientPartnerType }
     *     
     */
    public void setDocumentRecipientPartner(DocumentRecipientPartnerType value) {
        this.documentRecipientPartner = value;
    }

    /**
     * Gets the value of the documentDeliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDeliveryMethod() {
        return documentDeliveryMethod;
    }

    /**
     * Sets the value of the documentDeliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDeliveryMethod(String value) {
        this.documentDeliveryMethod = value;
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
     * Gets the value of the numberOfOriginals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfOriginals() {
        return numberOfOriginals;
    }

    /**
     * Sets the value of the numberOfOriginals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfOriginals(String value) {
        this.numberOfOriginals = value;
    }

    /**
     * Gets the value of the numberOfCopies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfCopies() {
        return numberOfCopies;
    }

    /**
     * Sets the value of the numberOfCopies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfCopies(String value) {
        this.numberOfCopies = value;
    }

    /**
     * Gets the value of the deliveryMethodQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListDocumentDeliveryCode }
     *     
     */
    public CidxListDocumentDeliveryCode getDeliveryMethodQualifier() {
        return deliveryMethodQualifier;
    }

    /**
     * Sets the value of the deliveryMethodQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListDocumentDeliveryCode }
     *     
     */
    public void setDeliveryMethodQualifier(CidxListDocumentDeliveryCode value) {
        this.deliveryMethodQualifier = value;
    }

}


package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LetterOfCreditInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LetterOfCreditInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DocumentReference"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AdvisingBank"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MonetaryAmount"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LetterOfCreditQuantity" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CurrencyRate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LetterOfCreditVoyageDateTime" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LetterOfCreditDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LetterOfCreditInformationType", propOrder = {
    "documentReference",
    "advisingBank",
    "monetaryAmount",
    "paymentTerms",
    "letterOfCreditQuantity",
    "currencyRate",
    "letterOfCreditVoyageDateTime",
    "letterOfCreditDateTime"
})
public class LetterOfCreditInformationType {

    @XmlElement(name = "DocumentReference", required = true)
    protected DocumentReferenceType documentReference;
    @XmlElement(name = "AdvisingBank", required = true)
    protected AdvisingBankType advisingBank;
    @XmlElement(name = "MonetaryAmount", required = true)
    protected MonetaryAmountType monetaryAmount;
    @XmlElement(name = "PaymentTerms")
    protected PaymentTermsType paymentTerms;
    @XmlElement(name = "LetterOfCreditQuantity")
    protected LetterOfCreditQuantityType letterOfCreditQuantity;
    @XmlElement(name = "CurrencyRate")
    protected List<CurrencyRateType> currencyRate;
    @XmlElement(name = "LetterOfCreditVoyageDateTime")
    protected LetterOfCreditVoyageDateTimeType letterOfCreditVoyageDateTime;
    @XmlElement(name = "LetterOfCreditDateTime")
    protected LetterOfCreditDateTimeType letterOfCreditDateTime;

    /**
     * Gets the value of the documentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getDocumentReference() {
        return documentReference;
    }

    /**
     * Sets the value of the documentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setDocumentReference(DocumentReferenceType value) {
        this.documentReference = value;
    }

    /**
     * Gets the value of the advisingBank property.
     * 
     * @return
     *     possible object is
     *     {@link AdvisingBankType }
     *     
     */
    public AdvisingBankType getAdvisingBank() {
        return advisingBank;
    }

    /**
     * Sets the value of the advisingBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvisingBankType }
     *     
     */
    public void setAdvisingBank(AdvisingBankType value) {
        this.advisingBank = value;
    }

    /**
     * Gets the value of the monetaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getMonetaryAmount() {
        return monetaryAmount;
    }

    /**
     * Sets the value of the monetaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setMonetaryAmount(MonetaryAmountType value) {
        this.monetaryAmount = value;
    }

    /**
     * Gets the value of the paymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Sets the value of the paymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setPaymentTerms(PaymentTermsType value) {
        this.paymentTerms = value;
    }

    /**
     * Gets the value of the letterOfCreditQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link LetterOfCreditQuantityType }
     *     
     */
    public LetterOfCreditQuantityType getLetterOfCreditQuantity() {
        return letterOfCreditQuantity;
    }

    /**
     * Sets the value of the letterOfCreditQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterOfCreditQuantityType }
     *     
     */
    public void setLetterOfCreditQuantity(LetterOfCreditQuantityType value) {
        this.letterOfCreditQuantity = value;
    }

    /**
     * Gets the value of the currencyRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyRateType }
     * 
     * 
     */
    public List<CurrencyRateType> getCurrencyRate() {
        if (currencyRate == null) {
            currencyRate = new ArrayList<CurrencyRateType>();
        }
        return this.currencyRate;
    }

    /**
     * Gets the value of the letterOfCreditVoyageDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link LetterOfCreditVoyageDateTimeType }
     *     
     */
    public LetterOfCreditVoyageDateTimeType getLetterOfCreditVoyageDateTime() {
        return letterOfCreditVoyageDateTime;
    }

    /**
     * Sets the value of the letterOfCreditVoyageDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterOfCreditVoyageDateTimeType }
     *     
     */
    public void setLetterOfCreditVoyageDateTime(LetterOfCreditVoyageDateTimeType value) {
        this.letterOfCreditVoyageDateTime = value;
    }

    /**
     * Gets the value of the letterOfCreditDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link LetterOfCreditDateTimeType }
     *     
     */
    public LetterOfCreditDateTimeType getLetterOfCreditDateTime() {
        return letterOfCreditDateTime;
    }

    /**
     * Sets the value of the letterOfCreditDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterOfCreditDateTimeType }
     *     
     */
    public void setLetterOfCreditDateTime(LetterOfCreditDateTimeType value) {
        this.letterOfCreditDateTime = value;
    }

}

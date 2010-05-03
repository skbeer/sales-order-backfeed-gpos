
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PaymentPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BuyerTransactionNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CreditDebitIndicator"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentMethodCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}MarketPlaceInformation" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReconciliationNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TotalPaymentAmount"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentFormatCode"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BuyerAccountDetails"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SellerAccountDetails"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentDates"/>
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
@XmlType(name = "PaymentPropertiesType", propOrder = {
    "buyerTransactionNumber",
    "creditDebitIndicator",
    "paymentMethodCode",
    "marketPlaceInformation",
    "reconciliationNumber",
    "totalPaymentAmount",
    "paymentFormatCode",
    "buyerAccountDetails",
    "sellerAccountDetails",
    "paymentDates",
    "languageCode"
})
public class PaymentPropertiesType {

    @XmlElement(name = "BuyerTransactionNumber", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String buyerTransactionNumber;
    @XmlElement(name = "CreditDebitIndicator", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String creditDebitIndicator;
    @XmlElement(name = "PaymentMethodCode", required = true)
    protected PaymentMethodCodeType paymentMethodCode;
    @XmlElement(name = "MarketPlaceInformation")
    protected MarketPlaceInformationType marketPlaceInformation;
    @XmlElement(name = "ReconciliationNumber", required = true)
    protected ReconciliationNumberType reconciliationNumber;
    @XmlElement(name = "TotalPaymentAmount", required = true)
    protected TotalPaymentAmountType totalPaymentAmount;
    @XmlElement(name = "PaymentFormatCode", required = true)
    protected PaymentFormatCodeType paymentFormatCode;
    @XmlElement(name = "BuyerAccountDetails", required = true)
    protected BuyerAccountDetailsType buyerAccountDetails;
    @XmlElement(name = "SellerAccountDetails", required = true)
    protected SellerAccountDetailsType sellerAccountDetails;
    @XmlElement(name = "PaymentDates", required = true)
    protected PaymentDatesType paymentDates;
    @XmlElement(name = "LanguageCode")
    protected LanguageCodeType languageCode;

    /**
     * Gets the value of the buyerTransactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerTransactionNumber() {
        return buyerTransactionNumber;
    }

    /**
     * Sets the value of the buyerTransactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerTransactionNumber(String value) {
        this.buyerTransactionNumber = value;
    }

    /**
     * Gets the value of the creditDebitIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    /**
     * Sets the value of the creditDebitIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditDebitIndicator(String value) {
        this.creditDebitIndicator = value;
    }

    /**
     * Gets the value of the paymentMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodCodeType }
     *     
     */
    public PaymentMethodCodeType getPaymentMethodCode() {
        return paymentMethodCode;
    }

    /**
     * Sets the value of the paymentMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodCodeType }
     *     
     */
    public void setPaymentMethodCode(PaymentMethodCodeType value) {
        this.paymentMethodCode = value;
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

    /**
     * Gets the value of the reconciliationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationNumberType }
     *     
     */
    public ReconciliationNumberType getReconciliationNumber() {
        return reconciliationNumber;
    }

    /**
     * Sets the value of the reconciliationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationNumberType }
     *     
     */
    public void setReconciliationNumber(ReconciliationNumberType value) {
        this.reconciliationNumber = value;
    }

    /**
     * Gets the value of the totalPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TotalPaymentAmountType }
     *     
     */
    public TotalPaymentAmountType getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    /**
     * Sets the value of the totalPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPaymentAmountType }
     *     
     */
    public void setTotalPaymentAmount(TotalPaymentAmountType value) {
        this.totalPaymentAmount = value;
    }

    /**
     * Gets the value of the paymentFormatCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormatCodeType }
     *     
     */
    public PaymentFormatCodeType getPaymentFormatCode() {
        return paymentFormatCode;
    }

    /**
     * Sets the value of the paymentFormatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormatCodeType }
     *     
     */
    public void setPaymentFormatCode(PaymentFormatCodeType value) {
        this.paymentFormatCode = value;
    }

    /**
     * Gets the value of the buyerAccountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerAccountDetailsType }
     *     
     */
    public BuyerAccountDetailsType getBuyerAccountDetails() {
        return buyerAccountDetails;
    }

    /**
     * Sets the value of the buyerAccountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerAccountDetailsType }
     *     
     */
    public void setBuyerAccountDetails(BuyerAccountDetailsType value) {
        this.buyerAccountDetails = value;
    }

    /**
     * Gets the value of the sellerAccountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SellerAccountDetailsType }
     *     
     */
    public SellerAccountDetailsType getSellerAccountDetails() {
        return sellerAccountDetails;
    }

    /**
     * Sets the value of the sellerAccountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerAccountDetailsType }
     *     
     */
    public void setSellerAccountDetails(SellerAccountDetailsType value) {
        this.sellerAccountDetails = value;
    }

    /**
     * Gets the value of the paymentDates property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDatesType }
     *     
     */
    public PaymentDatesType getPaymentDates() {
        return paymentDates;
    }

    /**
     * Sets the value of the paymentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDatesType }
     *     
     */
    public void setPaymentDates(PaymentDatesType value) {
        this.paymentDates = value;
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

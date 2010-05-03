
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
 * <p>Java class for QualificationRequestDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualificationRequestDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BuyerReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentMethodCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}InvoicePreference" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CountryOfFinalDestinationCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}StandardIndustrialClassificationNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}NAICSNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualificationRequestDetailsType", propOrder = {
    "buyerReference",
    "paymentTerms",
    "paymentMethodCode",
    "invoicePreference",
    "countryOfFinalDestinationCode",
    "standardIndustrialClassificationNumber",
    "naicsNumber"
})
public class QualificationRequestDetailsType {

    @XmlElement(name = "BuyerReference")
    protected List<BuyerReferenceType> buyerReference;
    @XmlElement(name = "PaymentTerms")
    protected PaymentTermsType paymentTerms;
    @XmlElement(name = "PaymentMethodCode")
    protected PaymentMethodCodeType paymentMethodCode;
    @XmlElement(name = "InvoicePreference")
    protected InvoicePreferenceType invoicePreference;
    @XmlElement(name = "CountryOfFinalDestinationCode")
    protected List<CountryOfFinalDestinationCodeType> countryOfFinalDestinationCode;
    @XmlElement(name = "StandardIndustrialClassificationNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String standardIndustrialClassificationNumber;
    @XmlElement(name = "NAICSNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String naicsNumber;

    /**
     * Gets the value of the buyerReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyerReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyerReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuyerReferenceType }
     * 
     * 
     */
    public List<BuyerReferenceType> getBuyerReference() {
        if (buyerReference == null) {
            buyerReference = new ArrayList<BuyerReferenceType>();
        }
        return this.buyerReference;
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
     * Gets the value of the invoicePreference property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicePreferenceType }
     *     
     */
    public InvoicePreferenceType getInvoicePreference() {
        return invoicePreference;
    }

    /**
     * Sets the value of the invoicePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicePreferenceType }
     *     
     */
    public void setInvoicePreference(InvoicePreferenceType value) {
        this.invoicePreference = value;
    }

    /**
     * Gets the value of the countryOfFinalDestinationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryOfFinalDestinationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryOfFinalDestinationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryOfFinalDestinationCodeType }
     * 
     * 
     */
    public List<CountryOfFinalDestinationCodeType> getCountryOfFinalDestinationCode() {
        if (countryOfFinalDestinationCode == null) {
            countryOfFinalDestinationCode = new ArrayList<CountryOfFinalDestinationCodeType>();
        }
        return this.countryOfFinalDestinationCode;
    }

    /**
     * Gets the value of the standardIndustrialClassificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardIndustrialClassificationNumber() {
        return standardIndustrialClassificationNumber;
    }

    /**
     * Sets the value of the standardIndustrialClassificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardIndustrialClassificationNumber(String value) {
        this.standardIndustrialClassificationNumber = value;
    }

    /**
     * Gets the value of the naicsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAICSNumber() {
        return naicsNumber;
    }

    /**
     * Sets the value of the naicsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAICSNumber(String value) {
        this.naicsNumber = value;
    }

}

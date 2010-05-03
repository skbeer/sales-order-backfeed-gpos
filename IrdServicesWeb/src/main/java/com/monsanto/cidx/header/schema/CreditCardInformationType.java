
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CreditCardInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CreditCardProvider"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CreditCardNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CreditCardExpirationDate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}CardHolderName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardInformationType", propOrder = {
    "creditCardProvider",
    "creditCardNumber",
    "creditCardExpirationDate",
    "cardHolderName"
})
public class CreditCardInformationType {

    @XmlElement(name = "CreditCardProvider", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String creditCardProvider;
    @XmlElement(name = "CreditCardNumber", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String creditCardNumber;
    @XmlElement(name = "CreditCardExpirationDate", required = true)
    protected CreditCardExpirationDateType creditCardExpirationDate;
    @XmlElement(name = "CardHolderName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cardHolderName;

    /**
     * Gets the value of the creditCardProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardProvider() {
        return creditCardProvider;
    }

    /**
     * Sets the value of the creditCardProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardProvider(String value) {
        this.creditCardProvider = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the creditCardExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardExpirationDateType }
     *     
     */
    public CreditCardExpirationDateType getCreditCardExpirationDate() {
        return creditCardExpirationDate;
    }

    /**
     * Sets the value of the creditCardExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardExpirationDateType }
     *     
     */
    public void setCreditCardExpirationDate(CreditCardExpirationDateType value) {
        this.creditCardExpirationDate = value;
    }

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

}


package com.monsanto.commercial.growercreditlist.gen.creditlist.schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GrowerCreditListPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrowerCreditListPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CreditIdentifier">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CreditStatus">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AmountApproved">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MonetaryValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="CurrencyCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AmountAvailable">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MonetaryValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="CurrencyCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DateApproved">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DateTime" type="{Monsanto:Service:GrowerCreditList}DateTimeType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LicenseStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Zone" type="{Monsanto:Service:GrowerCreditList}ZoneType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrowerCreditListPropertiesType", propOrder = {
    "creditType",
    "creditIdentifier",
    "creditStatus",
    "amountApproved",
    "amountAvailable",
    "dateApproved",
    "licenseStatus",
    "zone"
})
public class GrowerCreditListPropertiesType {

    @XmlElement(name = "CreditType", required = true)
    protected String creditType;
    @XmlElement(name = "CreditIdentifier", required = true)
    protected String creditIdentifier;
    @XmlElement(name = "CreditStatus", required = true)
    protected String creditStatus;
    @XmlElement(name = "AmountApproved", required = true)
    protected GrowerCreditListPropertiesType.AmountApproved amountApproved;
    @XmlElement(name = "AmountAvailable", required = true)
    protected GrowerCreditListPropertiesType.AmountAvailable amountAvailable;
    @XmlElement(name = "DateApproved", required = true)
    protected GrowerCreditListPropertiesType.DateApproved dateApproved;
    @XmlElement(name = "LicenseStatus")
    protected String licenseStatus;
    @XmlElement(name = "Zone")
    protected List<ZoneType> zone;

    /**
     * Gets the value of the creditType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditType() {
        return creditType;
    }

    /**
     * Sets the value of the creditType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditType(String value) {
        this.creditType = value;
    }

    /**
     * Gets the value of the creditIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditIdentifier() {
        return creditIdentifier;
    }

    /**
     * Sets the value of the creditIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditIdentifier(String value) {
        this.creditIdentifier = value;
    }

    /**
     * Gets the value of the creditStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditStatus() {
        return creditStatus;
    }

    /**
     * Sets the value of the creditStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditStatus(String value) {
        this.creditStatus = value;
    }

    /**
     * Gets the value of the amountApproved property.
     * 
     * @return
     *     possible object is
     *     {@link GrowerCreditListPropertiesType.AmountApproved }
     *     
     */
    public GrowerCreditListPropertiesType.AmountApproved getAmountApproved() {
        return amountApproved;
    }

    /**
     * Sets the value of the amountApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrowerCreditListPropertiesType.AmountApproved }
     *     
     */
    public void setAmountApproved(GrowerCreditListPropertiesType.AmountApproved value) {
        this.amountApproved = value;
    }

    /**
     * Gets the value of the amountAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link GrowerCreditListPropertiesType.AmountAvailable }
     *     
     */
    public GrowerCreditListPropertiesType.AmountAvailable getAmountAvailable() {
        return amountAvailable;
    }

    /**
     * Sets the value of the amountAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrowerCreditListPropertiesType.AmountAvailable }
     *     
     */
    public void setAmountAvailable(GrowerCreditListPropertiesType.AmountAvailable value) {
        this.amountAvailable = value;
    }

    /**
     * Gets the value of the dateApproved property.
     * 
     * @return
     *     possible object is
     *     {@link GrowerCreditListPropertiesType.DateApproved }
     *     
     */
    public GrowerCreditListPropertiesType.DateApproved getDateApproved() {
        return dateApproved;
    }

    /**
     * Sets the value of the dateApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrowerCreditListPropertiesType.DateApproved }
     *     
     */
    public void setDateApproved(GrowerCreditListPropertiesType.DateApproved value) {
        this.dateApproved = value;
    }

    /**
     * Gets the value of the licenseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseStatus() {
        return licenseStatus;
    }

    /**
     * Sets the value of the licenseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseStatus(String value) {
        this.licenseStatus = value;
    }

    /**
     * Gets the value of the zone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZoneType }
     * 
     * 
     */
    public List<ZoneType> getZone() {
        if (zone == null) {
            zone = new ArrayList<ZoneType>();
        }
        return this.zone;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MonetaryValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="CurrencyCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "monetaryValue",
        "currencyCode"
    })
    public static class AmountApproved {

        @XmlElement(name = "MonetaryValue", required = true)
        protected BigDecimal monetaryValue;
        @XmlElement(name = "CurrencyCode", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String currencyCode;

        /**
         * Gets the value of the monetaryValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMonetaryValue() {
            return monetaryValue;
        }

        /**
         * Sets the value of the monetaryValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMonetaryValue(BigDecimal value) {
            this.monetaryValue = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MonetaryValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="CurrencyCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "monetaryValue",
        "currencyCode"
    })
    public static class AmountAvailable {

        @XmlElement(name = "MonetaryValue", required = true)
        protected BigDecimal monetaryValue;
        @XmlElement(name = "CurrencyCode", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String currencyCode;

        /**
         * Gets the value of the monetaryValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMonetaryValue() {
            return monetaryValue;
        }

        /**
         * Sets the value of the monetaryValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMonetaryValue(BigDecimal value) {
            this.monetaryValue = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DateTime" type="{Monsanto:Service:GrowerCreditList}DateTimeType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dateTime"
    })
    public static class DateApproved {

        @XmlElement(name = "DateTime", required = true)
        protected DateTimeType dateTime;

        /**
         * Gets the value of the dateTime property.
         * 
         * @return
         *     possible object is
         *     {@link DateTimeType }
         *     
         */
        public DateTimeType getDateTime() {
            return dateTime;
        }

        /**
         * Sets the value of the dateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimeType }
         *     
         */
        public void setDateTime(DateTimeType value) {
            this.dateTime = value;
        }

    }

}

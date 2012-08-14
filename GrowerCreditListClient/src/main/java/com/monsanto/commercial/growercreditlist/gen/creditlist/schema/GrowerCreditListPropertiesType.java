
package com.monsanto.commercial.growercreditlist.gen.creditlist.schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *       &lt;sequence maxOccurs="unbounded">
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
    "creditTypeAndCreditIdentifierAndCreditStatus"
})
public class GrowerCreditListPropertiesType {

    @XmlElementRefs({
        @XmlElementRef(name = "CreditStatus", namespace = "Monsanto:Service:GrowerCreditList", type = JAXBElement.class),
        @XmlElementRef(name = "AmountAvailable", namespace = "Monsanto:Service:GrowerCreditList", type = JAXBElement.class),
        @XmlElementRef(name = "DateApproved", namespace = "Monsanto:Service:GrowerCreditList", type = JAXBElement.class),
        @XmlElementRef(name = "AmountApproved", namespace = "Monsanto:Service:GrowerCreditList", type = JAXBElement.class),
        @XmlElementRef(name = "LicenseStatus", namespace = "Monsanto:Service:GrowerCreditList", type = JAXBElement.class),
        @XmlElementRef(name = "CreditIdentifier", namespace = "Monsanto:Service:GrowerCreditList", type = JAXBElement.class),
        @XmlElementRef(name = "CreditType", namespace = "Monsanto:Service:GrowerCreditList", type = JAXBElement.class),
        @XmlElementRef(name = "Zone", namespace = "Monsanto:Service:GrowerCreditList", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> creditTypeAndCreditIdentifierAndCreditStatus;

    /**
     * Gets the value of the creditTypeAndCreditIdentifierAndCreditStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditTypeAndCreditIdentifierAndCreditStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditTypeAndCreditIdentifierAndCreditStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link GrowerCreditListPropertiesType.AmountAvailable }{@code >}
     * {@link JAXBElement }{@code <}{@link GrowerCreditListPropertiesType.DateApproved }{@code >}
     * {@link JAXBElement }{@code <}{@link GrowerCreditListPropertiesType.AmountApproved }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ZoneType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getCreditTypeAndCreditIdentifierAndCreditStatus() {
        if (creditTypeAndCreditIdentifierAndCreditStatus == null) {
            creditTypeAndCreditIdentifierAndCreditStatus = new ArrayList<JAXBElement<?>>();
        }
        return this.creditTypeAndCreditIdentifierAndCreditStatus;
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

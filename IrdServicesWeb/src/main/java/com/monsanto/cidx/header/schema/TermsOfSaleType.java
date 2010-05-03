
package com.monsanto.cidx.header.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TermsOfSaleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermsOfSaleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DiscountDeferredIndicator"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DaysDue"/>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DueDate"/>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}RelativeDueDate"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PercentDue" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Amount" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Percent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermsOfSaleType", propOrder = {
    "discountDeferredIndicator",
    "daysDue",
    "dueDate",
    "relativeDueDate",
    "percentDue",
    "amount",
    "percent"
})
public class TermsOfSaleType {

    @XmlElement(name = "DiscountDeferredIndicator", required = true)
    protected CidxListDiscountDeferredIndicator discountDeferredIndicator;
    @XmlElement(name = "DaysDue")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String daysDue;
    @XmlElement(name = "DueDate")
    protected DueDateType dueDate;
    @XmlElement(name = "RelativeDueDate")
    protected RelativeDueDateType relativeDueDate;
    @XmlElement(name = "PercentDue")
    protected BigDecimal percentDue;
    @XmlElement(name = "Amount")
    protected AmountType amount;
    @XmlElement(name = "Percent")
    protected BigDecimal percent;

    /**
     * Gets the value of the discountDeferredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListDiscountDeferredIndicator }
     *     
     */
    public CidxListDiscountDeferredIndicator getDiscountDeferredIndicator() {
        return discountDeferredIndicator;
    }

    /**
     * Sets the value of the discountDeferredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListDiscountDeferredIndicator }
     *     
     */
    public void setDiscountDeferredIndicator(CidxListDiscountDeferredIndicator value) {
        this.discountDeferredIndicator = value;
    }

    /**
     * Gets the value of the daysDue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysDue() {
        return daysDue;
    }

    /**
     * Sets the value of the daysDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysDue(String value) {
        this.daysDue = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link DueDateType }
     *     
     */
    public DueDateType getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DueDateType }
     *     
     */
    public void setDueDate(DueDateType value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the relativeDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeDueDateType }
     *     
     */
    public RelativeDueDateType getRelativeDueDate() {
        return relativeDueDate;
    }

    /**
     * Sets the value of the relativeDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeDueDateType }
     *     
     */
    public void setRelativeDueDate(RelativeDueDateType value) {
        this.relativeDueDate = value;
    }

    /**
     * Gets the value of the percentDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentDue() {
        return percentDue;
    }

    /**
     * Sets the value of the percentDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentDue(BigDecimal value) {
        this.percentDue = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

}


package com.monsanto.cidx.header.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DiscountsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PercentDiscount"/>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DiscountAmount"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DaysDue"/>
 *           &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DiscountsDueDate"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountsType", propOrder = {
    "percentDiscount",
    "discountAmount",
    "daysDue",
    "discountsDueDate"
})
public class DiscountsType {

    @XmlElement(name = "PercentDiscount")
    protected BigDecimal percentDiscount;
    @XmlElement(name = "DiscountAmount")
    protected DiscountAmountType discountAmount;
    @XmlElement(name = "DaysDue")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String daysDue;
    @XmlElement(name = "DiscountsDueDate")
    protected DiscountsDueDateType discountsDueDate;

    /**
     * Gets the value of the percentDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentDiscount() {
        return percentDiscount;
    }

    /**
     * Sets the value of the percentDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentDiscount(BigDecimal value) {
        this.percentDiscount = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountAmountType }
     *     
     */
    public DiscountAmountType getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountAmountType }
     *     
     */
    public void setDiscountAmount(DiscountAmountType value) {
        this.discountAmount = value;
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
     * Gets the value of the discountsDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountsDueDateType }
     *     
     */
    public DiscountsDueDateType getDiscountsDueDate() {
        return discountsDueDate;
    }

    /**
     * Sets the value of the discountsDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountsDueDateType }
     *     
     */
    public void setDiscountsDueDate(DiscountsDueDateType value) {
        this.discountsDueDate = value;
    }

}

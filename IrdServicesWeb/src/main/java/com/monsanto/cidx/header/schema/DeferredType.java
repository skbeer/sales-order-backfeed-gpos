
package com.monsanto.cidx.header.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeferredType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeferredType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeferredAmount"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DeferredDueDate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PercentDeferredPayable"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeferredType", propOrder = {
    "deferredAmount",
    "deferredDueDate",
    "percentDeferredPayable"
})
public class DeferredType {

    @XmlElement(name = "DeferredAmount", required = true)
    protected DeferredAmountType deferredAmount;
    @XmlElement(name = "DeferredDueDate", required = true)
    protected DeferredDueDateType deferredDueDate;
    @XmlElement(name = "PercentDeferredPayable", required = true)
    protected BigDecimal percentDeferredPayable;

    /**
     * Gets the value of the deferredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link DeferredAmountType }
     *     
     */
    public DeferredAmountType getDeferredAmount() {
        return deferredAmount;
    }

    /**
     * Sets the value of the deferredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeferredAmountType }
     *     
     */
    public void setDeferredAmount(DeferredAmountType value) {
        this.deferredAmount = value;
    }

    /**
     * Gets the value of the deferredDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link DeferredDueDateType }
     *     
     */
    public DeferredDueDateType getDeferredDueDate() {
        return deferredDueDate;
    }

    /**
     * Sets the value of the deferredDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeferredDueDateType }
     *     
     */
    public void setDeferredDueDate(DeferredDueDateType value) {
        this.deferredDueDate = value;
    }

    /**
     * Gets the value of the percentDeferredPayable property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentDeferredPayable() {
        return percentDeferredPayable;
    }

    /**
     * Sets the value of the percentDeferredPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentDeferredPayable(BigDecimal value) {
        this.percentDeferredPayable = value;
    }

}

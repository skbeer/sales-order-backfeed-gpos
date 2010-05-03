
package com.monsanto.cidx.header.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightBillTotalsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightBillTotalsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TotalLineItems" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineItemTotalAmount" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}FreightBillTotal"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}TaxOrDutyTotals" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightBillTotalsType", propOrder = {
    "totalLineItems",
    "lineItemTotalAmount",
    "freightBillTotal",
    "taxOrDutyTotals"
})
public class FreightBillTotalsType {

    @XmlElement(name = "TotalLineItems")
    protected BigInteger totalLineItems;
    @XmlElement(name = "LineItemTotalAmount")
    protected LineItemTotalAmountType lineItemTotalAmount;
    @XmlElement(name = "FreightBillTotal", required = true)
    protected FreightBillTotalType freightBillTotal;
    @XmlElement(name = "TaxOrDutyTotals")
    protected List<TaxOrDutyTotalsType> taxOrDutyTotals;

    /**
     * Gets the value of the totalLineItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalLineItems() {
        return totalLineItems;
    }

    /**
     * Sets the value of the totalLineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalLineItems(BigInteger value) {
        this.totalLineItems = value;
    }

    /**
     * Gets the value of the lineItemTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemTotalAmountType }
     *     
     */
    public LineItemTotalAmountType getLineItemTotalAmount() {
        return lineItemTotalAmount;
    }

    /**
     * Sets the value of the lineItemTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemTotalAmountType }
     *     
     */
    public void setLineItemTotalAmount(LineItemTotalAmountType value) {
        this.lineItemTotalAmount = value;
    }

    /**
     * Gets the value of the freightBillTotal property.
     * 
     * @return
     *     possible object is
     *     {@link FreightBillTotalType }
     *     
     */
    public FreightBillTotalType getFreightBillTotal() {
        return freightBillTotal;
    }

    /**
     * Sets the value of the freightBillTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightBillTotalType }
     *     
     */
    public void setFreightBillTotal(FreightBillTotalType value) {
        this.freightBillTotal = value;
    }

    /**
     * Gets the value of the taxOrDutyTotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxOrDutyTotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxOrDutyTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxOrDutyTotalsType }
     * 
     * 
     */
    public List<TaxOrDutyTotalsType> getTaxOrDutyTotals() {
        if (taxOrDutyTotals == null) {
            taxOrDutyTotals = new ArrayList<TaxOrDutyTotalsType>();
        }
        return this.taxOrDutyTotals;
    }

}

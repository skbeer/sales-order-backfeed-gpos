
package com.monsanto.cidx.header.schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractPaymentTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractPaymentTermsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentTermsOfSale"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentDueDate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentTermsBasisDateCode" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentTermsBasisDate" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Discounts" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Deferred" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Penalty" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ContractPaymentTermsType" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListContractPaymentTermsType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractPaymentTermsType", propOrder = {
    "paymentTermsOfSale",
    "paymentDueDate",
    "paymentTermsBasisDateCode",
    "paymentTermsBasisDate",
    "discounts",
    "deferred",
    "penalty"
})
public class ContractPaymentTermsType {

    @XmlElement(name = "PaymentTermsOfSale", required = true)
    protected PaymentTermsOfSaleType paymentTermsOfSale;
    @XmlElement(name = "PaymentDueDate", required = true)
    protected PaymentDueDateType paymentDueDate;
    @XmlElement(name = "PaymentTermsBasisDateCode")
    protected PaymentTermsBasisDateCodeType paymentTermsBasisDateCode;
    @XmlElement(name = "PaymentTermsBasisDate")
    protected PaymentTermsBasisDateType paymentTermsBasisDate;
    @XmlElement(name = "Discounts")
    protected List<DiscountsType> discounts;
    @XmlElement(name = "Deferred")
    protected DeferredType deferred;
    @XmlElement(name = "Penalty")
    protected BigDecimal penalty;
    @XmlAttribute(name = "ContractPaymentTermsType", required = true)
    protected CidxListContractPaymentTermsType contractPaymentTermsType;

    /**
     * Gets the value of the paymentTermsOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsOfSaleType }
     *     
     */
    public PaymentTermsOfSaleType getPaymentTermsOfSale() {
        return paymentTermsOfSale;
    }

    /**
     * Sets the value of the paymentTermsOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsOfSaleType }
     *     
     */
    public void setPaymentTermsOfSale(PaymentTermsOfSaleType value) {
        this.paymentTermsOfSale = value;
    }

    /**
     * Gets the value of the paymentDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDueDateType }
     *     
     */
    public PaymentDueDateType getPaymentDueDate() {
        return paymentDueDate;
    }

    /**
     * Sets the value of the paymentDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDueDateType }
     *     
     */
    public void setPaymentDueDate(PaymentDueDateType value) {
        this.paymentDueDate = value;
    }

    /**
     * Gets the value of the paymentTermsBasisDateCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsBasisDateCodeType }
     *     
     */
    public PaymentTermsBasisDateCodeType getPaymentTermsBasisDateCode() {
        return paymentTermsBasisDateCode;
    }

    /**
     * Sets the value of the paymentTermsBasisDateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsBasisDateCodeType }
     *     
     */
    public void setPaymentTermsBasisDateCode(PaymentTermsBasisDateCodeType value) {
        this.paymentTermsBasisDateCode = value;
    }

    /**
     * Gets the value of the paymentTermsBasisDate property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsBasisDateType }
     *     
     */
    public PaymentTermsBasisDateType getPaymentTermsBasisDate() {
        return paymentTermsBasisDate;
    }

    /**
     * Sets the value of the paymentTermsBasisDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsBasisDateType }
     *     
     */
    public void setPaymentTermsBasisDate(PaymentTermsBasisDateType value) {
        this.paymentTermsBasisDate = value;
    }

    /**
     * Gets the value of the discounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountsType }
     * 
     * 
     */
    public List<DiscountsType> getDiscounts() {
        if (discounts == null) {
            discounts = new ArrayList<DiscountsType>();
        }
        return this.discounts;
    }

    /**
     * Gets the value of the deferred property.
     * 
     * @return
     *     possible object is
     *     {@link DeferredType }
     *     
     */
    public DeferredType getDeferred() {
        return deferred;
    }

    /**
     * Sets the value of the deferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeferredType }
     *     
     */
    public void setDeferred(DeferredType value) {
        this.deferred = value;
    }

    /**
     * Gets the value of the penalty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenalty() {
        return penalty;
    }

    /**
     * Sets the value of the penalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenalty(BigDecimal value) {
        this.penalty = value;
    }

    /**
     * Gets the value of the contractPaymentTermsType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListContractPaymentTermsType }
     *     
     */
    public CidxListContractPaymentTermsType getContractPaymentTermsType() {
        return contractPaymentTermsType;
    }

    /**
     * Sets the value of the contractPaymentTermsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListContractPaymentTermsType }
     *     
     */
    public void setContractPaymentTermsType(CidxListContractPaymentTermsType value) {
        this.contractPaymentTermsType = value;
    }

}

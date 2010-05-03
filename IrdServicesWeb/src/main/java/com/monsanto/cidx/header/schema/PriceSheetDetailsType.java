
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceSheetDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceSheetDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceZoneGeographyList" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PaymentTermsList" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PriceSheetProductLineItem" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AllowanceChargeList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceSheetDetailsType", propOrder = {
    "priceZoneGeographyList",
    "paymentTermsList",
    "priceSheetProductLineItem",
    "allowanceChargeList"
})
public class PriceSheetDetailsType {

    @XmlElement(name = "PriceZoneGeographyList")
    protected PriceZoneGeographyListType priceZoneGeographyList;
    @XmlElement(name = "PaymentTermsList")
    protected PaymentTermsListType paymentTermsList;
    @XmlElement(name = "PriceSheetProductLineItem", required = true)
    protected List<PriceSheetProductLineItemType> priceSheetProductLineItem;
    @XmlElement(name = "AllowanceChargeList")
    protected AllowanceChargeListType allowanceChargeList;

    /**
     * Gets the value of the priceZoneGeographyList property.
     * 
     * @return
     *     possible object is
     *     {@link PriceZoneGeographyListType }
     *     
     */
    public PriceZoneGeographyListType getPriceZoneGeographyList() {
        return priceZoneGeographyList;
    }

    /**
     * Sets the value of the priceZoneGeographyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceZoneGeographyListType }
     *     
     */
    public void setPriceZoneGeographyList(PriceZoneGeographyListType value) {
        this.priceZoneGeographyList = value;
    }

    /**
     * Gets the value of the paymentTermsList property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsListType }
     *     
     */
    public PaymentTermsListType getPaymentTermsList() {
        return paymentTermsList;
    }

    /**
     * Sets the value of the paymentTermsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsListType }
     *     
     */
    public void setPaymentTermsList(PaymentTermsListType value) {
        this.paymentTermsList = value;
    }

    /**
     * Gets the value of the priceSheetProductLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceSheetProductLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceSheetProductLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceSheetProductLineItemType }
     * 
     * 
     */
    public List<PriceSheetProductLineItemType> getPriceSheetProductLineItem() {
        if (priceSheetProductLineItem == null) {
            priceSheetProductLineItem = new ArrayList<PriceSheetProductLineItemType>();
        }
        return this.priceSheetProductLineItem;
    }

    /**
     * Gets the value of the allowanceChargeList property.
     * 
     * @return
     *     possible object is
     *     {@link AllowanceChargeListType }
     *     
     */
    public AllowanceChargeListType getAllowanceChargeList() {
        return allowanceChargeList;
    }

    /**
     * Sets the value of the allowanceChargeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceChargeListType }
     *     
     */
    public void setAllowanceChargeList(AllowanceChargeListType value) {
        this.allowanceChargeList = value;
    }

}

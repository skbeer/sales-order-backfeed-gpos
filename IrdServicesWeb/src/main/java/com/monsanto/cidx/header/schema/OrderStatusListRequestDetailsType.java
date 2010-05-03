
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatusListRequestDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderStatusListRequestDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PurchaseOrderNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}PurchaseOrderIssuedDateRange" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ScheduleDateTimeInformationRange" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatusListRequestDetailsType", propOrder = {
    "purchaseOrderNumber",
    "purchaseOrderIssuedDateRange",
    "scheduleDateTimeInformationRange"
})
public class OrderStatusListRequestDetailsType {

    @XmlElement(name = "PurchaseOrderNumber")
    protected List<PurchaseOrderNumberType> purchaseOrderNumber;
    @XmlElement(name = "PurchaseOrderIssuedDateRange")
    protected PurchaseOrderIssuedDateRangeType purchaseOrderIssuedDateRange;
    @XmlElement(name = "ScheduleDateTimeInformationRange")
    protected ScheduleDateTimeInformationRangeType scheduleDateTimeInformationRange;

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseOrderNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseOrderNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseOrderNumberType }
     * 
     * 
     */
    public List<PurchaseOrderNumberType> getPurchaseOrderNumber() {
        if (purchaseOrderNumber == null) {
            purchaseOrderNumber = new ArrayList<PurchaseOrderNumberType>();
        }
        return this.purchaseOrderNumber;
    }

    /**
     * Gets the value of the purchaseOrderIssuedDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderIssuedDateRangeType }
     *     
     */
    public PurchaseOrderIssuedDateRangeType getPurchaseOrderIssuedDateRange() {
        return purchaseOrderIssuedDateRange;
    }

    /**
     * Sets the value of the purchaseOrderIssuedDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderIssuedDateRangeType }
     *     
     */
    public void setPurchaseOrderIssuedDateRange(PurchaseOrderIssuedDateRangeType value) {
        this.purchaseOrderIssuedDateRange = value;
    }

    /**
     * Gets the value of the scheduleDateTimeInformationRange property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDateTimeInformationRangeType }
     *     
     */
    public ScheduleDateTimeInformationRangeType getScheduleDateTimeInformationRange() {
        return scheduleDateTimeInformationRange;
    }

    /**
     * Sets the value of the scheduleDateTimeInformationRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDateTimeInformationRangeType }
     *     
     */
    public void setScheduleDateTimeInformationRange(ScheduleDateTimeInformationRangeType value) {
        this.scheduleDateTimeInformationRange = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiptNoticeBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiptNoticeBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReceiptNoticeProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReceiptNoticePartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReceiptNoticeDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiptNoticeBodyType", propOrder = {
    "receiptNoticeProperties",
    "receiptNoticePartners",
    "receiptNoticeDetails"
})
public class ReceiptNoticeBodyType {

    @XmlElement(name = "ReceiptNoticeProperties", required = true)
    protected ReceiptNoticePropertiesType receiptNoticeProperties;
    @XmlElement(name = "ReceiptNoticePartners", required = true)
    protected ReceiptNoticePartnersType receiptNoticePartners;
    @XmlElement(name = "ReceiptNoticeDetails", required = true)
    protected ReceiptNoticeDetailsType receiptNoticeDetails;

    /**
     * Gets the value of the receiptNoticeProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptNoticePropertiesType }
     *     
     */
    public ReceiptNoticePropertiesType getReceiptNoticeProperties() {
        return receiptNoticeProperties;
    }

    /**
     * Sets the value of the receiptNoticeProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptNoticePropertiesType }
     *     
     */
    public void setReceiptNoticeProperties(ReceiptNoticePropertiesType value) {
        this.receiptNoticeProperties = value;
    }

    /**
     * Gets the value of the receiptNoticePartners property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptNoticePartnersType }
     *     
     */
    public ReceiptNoticePartnersType getReceiptNoticePartners() {
        return receiptNoticePartners;
    }

    /**
     * Sets the value of the receiptNoticePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptNoticePartnersType }
     *     
     */
    public void setReceiptNoticePartners(ReceiptNoticePartnersType value) {
        this.receiptNoticePartners = value;
    }

    /**
     * Gets the value of the receiptNoticeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptNoticeDetailsType }
     *     
     */
    public ReceiptNoticeDetailsType getReceiptNoticeDetails() {
        return receiptNoticeDetails;
    }

    /**
     * Sets the value of the receiptNoticeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptNoticeDetailsType }
     *     
     */
    public void setReceiptNoticeDetails(ReceiptNoticeDetailsType value) {
        this.receiptNoticeDetails = value;
    }

}

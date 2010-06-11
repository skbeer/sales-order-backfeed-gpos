
package com.monsanto.irdsoapservices.salesorder.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesOrderReportDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderReportDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesOrderReportProperties" type="{urn:ecms:schema:salesorderreport:response:1:0}SalesOrderReportPropertiesType"/>
 *         &lt;element name="SalesOrderPartners" type="{urn:ecms:schema:salesorderreport:response:1:0}SalesOrderPartnersType"/>
 *         &lt;element name="SalesOrderTransactionDetails" type="{urn:ecms:schema:salesorderreport:response:1:0}SalesOrderTransactionDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderReportDetailsType", propOrder = {
    "salesOrderReportProperties",
    "salesOrderPartners",
    "salesOrderTransactionDetails"
})
public class SalesOrderReportDetailsType {

    @XmlElement(name = "SalesOrderReportProperties", required = true)
    protected SalesOrderReportPropertiesType salesOrderReportProperties;
    @XmlElement(name = "SalesOrderPartners", required = true)
    protected SalesOrderPartnersType salesOrderPartners;
    @XmlElement(name = "SalesOrderTransactionDetails", required = true)
    protected SalesOrderTransactionDetailsType salesOrderTransactionDetails;

    /**
     * Gets the value of the salesOrderReportProperties property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderReportPropertiesType }
     *     
     */
    public SalesOrderReportPropertiesType getSalesOrderReportProperties() {
        return salesOrderReportProperties;
    }

    /**
     * Sets the value of the salesOrderReportProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderReportPropertiesType }
     *     
     */
    public void setSalesOrderReportProperties(SalesOrderReportPropertiesType value) {
        this.salesOrderReportProperties = value;
    }

    /**
     * Gets the value of the salesOrderPartners property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderPartnersType }
     *     
     */
    public SalesOrderPartnersType getSalesOrderPartners() {
        return salesOrderPartners;
    }

    /**
     * Sets the value of the salesOrderPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderPartnersType }
     *     
     */
    public void setSalesOrderPartners(SalesOrderPartnersType value) {
        this.salesOrderPartners = value;
    }

    /**
     * Gets the value of the salesOrderTransactionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderTransactionDetailsType }
     *     
     */
    public SalesOrderTransactionDetailsType getSalesOrderTransactionDetails() {
        return salesOrderTransactionDetails;
    }

    /**
     * Sets the value of the salesOrderTransactionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderTransactionDetailsType }
     *     
     */
    public void setSalesOrderTransactionDetails(SalesOrderTransactionDetailsType value) {
        this.salesOrderTransactionDetails = value;
    }

}

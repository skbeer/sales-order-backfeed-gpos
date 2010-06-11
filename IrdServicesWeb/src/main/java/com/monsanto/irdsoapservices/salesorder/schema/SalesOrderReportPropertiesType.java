
package com.monsanto.irdsoapservices.salesorder.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesOrderReportPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderReportPropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesOrderNumber" type="{urn:ecms:schema:salesorderreport:response:1:0}SalesOrderNumberType" minOccurs="0"/>
 *         &lt;element name="SalesOrderTypeCode" type="{urn:ecms:schema:salesorderreport:response:1:0}SalesOrderTypeCodeType"/>
 *         &lt;element name="SalesOrderIssuedDate" type="{urn:ecms:schema:salesorderreport:response:1:0}SalesOrderIssuedDateType" minOccurs="0"/>
 *         &lt;element name="SalesOrderYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderReportPropertiesType", propOrder = {
    "salesOrderNumber",
    "salesOrderTypeCode",
    "salesOrderIssuedDate",
    "salesOrderYear"
})
public class SalesOrderReportPropertiesType {

    @XmlElement(name = "SalesOrderNumber")
    protected SalesOrderNumberType salesOrderNumber;
    @XmlElement(name = "SalesOrderTypeCode", required = true)
    protected SalesOrderTypeCodeType salesOrderTypeCode;
    @XmlElement(name = "SalesOrderIssuedDate")
    protected SalesOrderIssuedDateType salesOrderIssuedDate;
    @XmlElement(name = "SalesOrderYear")
    protected String salesOrderYear;

    /**
     * Gets the value of the salesOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderNumberType }
     *     
     */
    public SalesOrderNumberType getSalesOrderNumber() {
        return salesOrderNumber;
    }

    /**
     * Sets the value of the salesOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderNumberType }
     *     
     */
    public void setSalesOrderNumber(SalesOrderNumberType value) {
        this.salesOrderNumber = value;
    }

    /**
     * Gets the value of the salesOrderTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderTypeCodeType }
     *     
     */
    public SalesOrderTypeCodeType getSalesOrderTypeCode() {
        return salesOrderTypeCode;
    }

    /**
     * Sets the value of the salesOrderTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderTypeCodeType }
     *     
     */
    public void setSalesOrderTypeCode(SalesOrderTypeCodeType value) {
        this.salesOrderTypeCode = value;
    }

    /**
     * Gets the value of the salesOrderIssuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderIssuedDateType }
     *     
     */
    public SalesOrderIssuedDateType getSalesOrderIssuedDate() {
        return salesOrderIssuedDate;
    }

    /**
     * Sets the value of the salesOrderIssuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderIssuedDateType }
     *     
     */
    public void setSalesOrderIssuedDate(SalesOrderIssuedDateType value) {
        this.salesOrderIssuedDate = value;
    }

    /**
     * Gets the value of the salesOrderYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrderYear() {
        return salesOrderYear;
    }

    /**
     * Sets the value of the salesOrderYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrderYear(String value) {
        this.salesOrderYear = value;
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ScheduleLineDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleLineDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ScheduleLineIdentifier"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}SalesOrderIdentifier" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ProductQuantity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ScheduleDateTimeInformation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleLineDetailsType", propOrder = {
    "scheduleLineIdentifier",
    "salesOrderIdentifier",
    "productQuantity",
    "scheduleDateTimeInformation"
})
public class ScheduleLineDetailsType {

    @XmlElement(name = "ScheduleLineIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String scheduleLineIdentifier;
    @XmlElement(name = "SalesOrderIdentifier")
    protected SalesOrderIdentifierType salesOrderIdentifier;
    @XmlElement(name = "ProductQuantity", required = true)
    protected ProductQuantityType productQuantity;
    @XmlElement(name = "ScheduleDateTimeInformation", required = true)
    protected ScheduleDateTimeInformationType scheduleDateTimeInformation;

    /**
     * Gets the value of the scheduleLineIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleLineIdentifier() {
        return scheduleLineIdentifier;
    }

    /**
     * Sets the value of the scheduleLineIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleLineIdentifier(String value) {
        this.scheduleLineIdentifier = value;
    }

    /**
     * Gets the value of the salesOrderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderIdentifierType }
     *     
     */
    public SalesOrderIdentifierType getSalesOrderIdentifier() {
        return salesOrderIdentifier;
    }

    /**
     * Sets the value of the salesOrderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderIdentifierType }
     *     
     */
    public void setSalesOrderIdentifier(SalesOrderIdentifierType value) {
        this.salesOrderIdentifier = value;
    }

    /**
     * Gets the value of the productQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantityType }
     *     
     */
    public ProductQuantityType getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantityType }
     *     
     */
    public void setProductQuantity(ProductQuantityType value) {
        this.productQuantity = value;
    }

    /**
     * Gets the value of the scheduleDateTimeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDateTimeInformationType }
     *     
     */
    public ScheduleDateTimeInformationType getScheduleDateTimeInformation() {
        return scheduleDateTimeInformation;
    }

    /**
     * Sets the value of the scheduleDateTimeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDateTimeInformationType }
     *     
     */
    public void setScheduleDateTimeInformation(ScheduleDateTimeInformationType value) {
        this.scheduleDateTimeInformation = value;
    }

}

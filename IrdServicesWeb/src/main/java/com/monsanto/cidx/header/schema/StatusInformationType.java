
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for StatusInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Status"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}StatusEffectiveDate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}StatusReason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusInformationType", propOrder = {
    "status",
    "statusEffectiveDate",
    "statusReason"
})
public class StatusInformationType {

    @XmlElement(name = "Status", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;
    @XmlElement(name = "StatusEffectiveDate", required = true)
    protected StatusEffectiveDateType statusEffectiveDate;
    @XmlElement(name = "StatusReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String statusReason;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link StatusEffectiveDateType }
     *     
     */
    public StatusEffectiveDateType getStatusEffectiveDate() {
        return statusEffectiveDate;
    }

    /**
     * Sets the value of the statusEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusEffectiveDateType }
     *     
     */
    public void setStatusEffectiveDate(StatusEffectiveDateType value) {
        this.statusEffectiveDate = value;
    }

    /**
     * Gets the value of the statusReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * Sets the value of the statusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusReason(String value) {
        this.statusReason = value;
    }

}

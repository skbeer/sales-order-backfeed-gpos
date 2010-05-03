
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceSheetEffectiveDateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceSheetEffectiveDateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}DateTimeInformation"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PriceSheetDateType" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListPriceSheetDateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceSheetEffectiveDateType", propOrder = {
    "dateTimeInformation"
})
public class PriceSheetEffectiveDateType {

    @XmlElement(name = "DateTimeInformation", required = true)
    protected DateTimeInformationType dateTimeInformation;
    @XmlAttribute(name = "PriceSheetDateType")
    protected CidxListPriceSheetDateType priceSheetDateType;

    /**
     * Gets the value of the dateTimeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeInformationType }
     *     
     */
    public DateTimeInformationType getDateTimeInformation() {
        return dateTimeInformation;
    }

    /**
     * Sets the value of the dateTimeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeInformationType }
     *     
     */
    public void setDateTimeInformation(DateTimeInformationType value) {
        this.dateTimeInformation = value;
    }

    /**
     * Gets the value of the priceSheetDateType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListPriceSheetDateType }
     *     
     */
    public CidxListPriceSheetDateType getPriceSheetDateType() {
        return priceSheetDateType;
    }

    /**
     * Sets the value of the priceSheetDateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListPriceSheetDateType }
     *     
     */
    public void setPriceSheetDateType(CidxListPriceSheetDateType value) {
        this.priceSheetDateType = value;
    }

}

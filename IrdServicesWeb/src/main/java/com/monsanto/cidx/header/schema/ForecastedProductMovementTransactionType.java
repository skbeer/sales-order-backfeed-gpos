
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastedProductMovementTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastedProductMovementTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ForecastedProductMovementTransactionProperties"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ForecastedProductMovementTransactionPartners"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ForecastedProductMovementTransactionDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastedProductMovementTransactionType", propOrder = {
    "forecastedProductMovementTransactionProperties",
    "forecastedProductMovementTransactionPartners",
    "forecastedProductMovementTransactionDetails"
})
public class ForecastedProductMovementTransactionType {

    @XmlElement(name = "ForecastedProductMovementTransactionProperties", required = true)
    protected ForecastedProductMovementTransactionPropertiesType forecastedProductMovementTransactionProperties;
    @XmlElement(name = "ForecastedProductMovementTransactionPartners", required = true)
    protected ForecastedProductMovementTransactionPartnersType forecastedProductMovementTransactionPartners;
    @XmlElement(name = "ForecastedProductMovementTransactionDetails", required = true)
    protected ForecastedProductMovementTransactionDetailsType forecastedProductMovementTransactionDetails;

    /**
     * Gets the value of the forecastedProductMovementTransactionProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastedProductMovementTransactionPropertiesType }
     *     
     */
    public ForecastedProductMovementTransactionPropertiesType getForecastedProductMovementTransactionProperties() {
        return forecastedProductMovementTransactionProperties;
    }

    /**
     * Sets the value of the forecastedProductMovementTransactionProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastedProductMovementTransactionPropertiesType }
     *     
     */
    public void setForecastedProductMovementTransactionProperties(ForecastedProductMovementTransactionPropertiesType value) {
        this.forecastedProductMovementTransactionProperties = value;
    }

    /**
     * Gets the value of the forecastedProductMovementTransactionPartners property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastedProductMovementTransactionPartnersType }
     *     
     */
    public ForecastedProductMovementTransactionPartnersType getForecastedProductMovementTransactionPartners() {
        return forecastedProductMovementTransactionPartners;
    }

    /**
     * Sets the value of the forecastedProductMovementTransactionPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastedProductMovementTransactionPartnersType }
     *     
     */
    public void setForecastedProductMovementTransactionPartners(ForecastedProductMovementTransactionPartnersType value) {
        this.forecastedProductMovementTransactionPartners = value;
    }

    /**
     * Gets the value of the forecastedProductMovementTransactionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastedProductMovementTransactionDetailsType }
     *     
     */
    public ForecastedProductMovementTransactionDetailsType getForecastedProductMovementTransactionDetails() {
        return forecastedProductMovementTransactionDetails;
    }

    /**
     * Sets the value of the forecastedProductMovementTransactionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastedProductMovementTransactionDetailsType }
     *     
     */
    public void setForecastedProductMovementTransactionDetails(ForecastedProductMovementTransactionDetailsType value) {
        this.forecastedProductMovementTransactionDetails = value;
    }

}

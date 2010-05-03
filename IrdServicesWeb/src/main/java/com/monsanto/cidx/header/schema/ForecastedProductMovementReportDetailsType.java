
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastedProductMovementReportDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastedProductMovementReportDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ReportingEntity"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ForecastedProductMovementTransactions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastedProductMovementReportDetailsType", propOrder = {
    "reportingEntity",
    "forecastedProductMovementTransactions"
})
public class ForecastedProductMovementReportDetailsType {

    @XmlElement(name = "ReportingEntity", required = true)
    protected ReportingEntityType reportingEntity;
    @XmlElement(name = "ForecastedProductMovementTransactions", required = true)
    protected ForecastedProductMovementTransactionsType forecastedProductMovementTransactions;

    /**
     * Gets the value of the reportingEntity property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingEntityType }
     *     
     */
    public ReportingEntityType getReportingEntity() {
        return reportingEntity;
    }

    /**
     * Sets the value of the reportingEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingEntityType }
     *     
     */
    public void setReportingEntity(ReportingEntityType value) {
        this.reportingEntity = value;
    }

    /**
     * Gets the value of the forecastedProductMovementTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastedProductMovementTransactionsType }
     *     
     */
    public ForecastedProductMovementTransactionsType getForecastedProductMovementTransactions() {
        return forecastedProductMovementTransactions;
    }

    /**
     * Sets the value of the forecastedProductMovementTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastedProductMovementTransactionsType }
     *     
     */
    public void setForecastedProductMovementTransactions(ForecastedProductMovementTransactionsType value) {
        this.forecastedProductMovementTransactions = value;
    }

}


package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastedProductMovementReportBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastedProductMovementReportBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ForecastedProductMovementReportProperties" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ForecastedProductMovementReportDetails" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastedProductMovementReportBodyType", propOrder = {
    "forecastedProductMovementReportProperties",
    "forecastedProductMovementReportDetails"
})
public class ForecastedProductMovementReportBodyType {

    @XmlElement(name = "ForecastedProductMovementReportProperties")
    protected ForecastedProductMovementReportPropertiesType forecastedProductMovementReportProperties;
    @XmlElement(name = "ForecastedProductMovementReportDetails", required = true)
    protected List<ForecastedProductMovementReportDetailsType> forecastedProductMovementReportDetails;

    /**
     * Gets the value of the forecastedProductMovementReportProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastedProductMovementReportPropertiesType }
     *     
     */
    public ForecastedProductMovementReportPropertiesType getForecastedProductMovementReportProperties() {
        return forecastedProductMovementReportProperties;
    }

    /**
     * Sets the value of the forecastedProductMovementReportProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastedProductMovementReportPropertiesType }
     *     
     */
    public void setForecastedProductMovementReportProperties(ForecastedProductMovementReportPropertiesType value) {
        this.forecastedProductMovementReportProperties = value;
    }

    /**
     * Gets the value of the forecastedProductMovementReportDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastedProductMovementReportDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastedProductMovementReportDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastedProductMovementReportDetailsType }
     * 
     * 
     */
    public List<ForecastedProductMovementReportDetailsType> getForecastedProductMovementReportDetails() {
        if (forecastedProductMovementReportDetails == null) {
            forecastedProductMovementReportDetails = new ArrayList<ForecastedProductMovementReportDetailsType>();
        }
        return this.forecastedProductMovementReportDetails;
    }

}

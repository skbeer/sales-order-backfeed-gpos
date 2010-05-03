
package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}LineNumber"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ForecastProduct"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ForecastHorizon" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Forecast" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastLineItemType", propOrder = {
    "lineNumber",
    "forecastProduct",
    "forecastHorizon",
    "forecast"
})
public class ForecastLineItemType {

    @XmlElement(name = "LineNumber")
    protected long lineNumber;
    @XmlElement(name = "ForecastProduct", required = true)
    protected ForecastProductType forecastProduct;
    @XmlElement(name = "ForecastHorizon")
    protected ForecastHorizonType forecastHorizon;
    @XmlElement(name = "Forecast", required = true)
    protected List<ForecastType> forecast;

    /**
     * Gets the value of the lineNumber property.
     * 
     */
    public long getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     */
    public void setLineNumber(long value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the forecastProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastProductType }
     *     
     */
    public ForecastProductType getForecastProduct() {
        return forecastProduct;
    }

    /**
     * Sets the value of the forecastProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastProductType }
     *     
     */
    public void setForecastProduct(ForecastProductType value) {
        this.forecastProduct = value;
    }

    /**
     * Gets the value of the forecastHorizon property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastHorizonType }
     *     
     */
    public ForecastHorizonType getForecastHorizon() {
        return forecastHorizon;
    }

    /**
     * Sets the value of the forecastHorizon property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastHorizonType }
     *     
     */
    public void setForecastHorizon(ForecastHorizonType value) {
        this.forecastHorizon = value;
    }

    /**
     * Gets the value of the forecast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastType }
     * 
     * 
     */
    public List<ForecastType> getForecast() {
        if (forecast == null) {
            forecast = new ArrayList<ForecastType>();
        }
        return this.forecast;
    }

}


package com.monsanto.cidx.header.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastedProductMovementTransactionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastedProductMovementTransactionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ForecastedProductMovementTransaction" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ForecastedProductMovementReportType" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListReportType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastedProductMovementTransactionsType", propOrder = {
    "forecastedProductMovementTransaction"
})
public class ForecastedProductMovementTransactionsType {

    @XmlElement(name = "ForecastedProductMovementTransaction", required = true)
    protected List<ForecastedProductMovementTransactionType> forecastedProductMovementTransaction;
    @XmlAttribute(name = "ForecastedProductMovementReportType", required = true)
    protected CidxListReportType forecastedProductMovementReportType;

    /**
     * Gets the value of the forecastedProductMovementTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastedProductMovementTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastedProductMovementTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastedProductMovementTransactionType }
     * 
     * 
     */
    public List<ForecastedProductMovementTransactionType> getForecastedProductMovementTransaction() {
        if (forecastedProductMovementTransaction == null) {
            forecastedProductMovementTransaction = new ArrayList<ForecastedProductMovementTransactionType>();
        }
        return this.forecastedProductMovementTransaction;
    }

    /**
     * Gets the value of the forecastedProductMovementReportType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListReportType }
     *     
     */
    public CidxListReportType getForecastedProductMovementReportType() {
        return forecastedProductMovementReportType;
    }

    /**
     * Sets the value of the forecastedProductMovementReportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListReportType }
     *     
     */
    public void setForecastedProductMovementReportType(CidxListReportType value) {
        this.forecastedProductMovementReportType = value;
    }

}

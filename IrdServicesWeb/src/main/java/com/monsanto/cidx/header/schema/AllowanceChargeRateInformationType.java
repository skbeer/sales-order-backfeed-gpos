
package com.monsanto.cidx.header.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllowanceChargeRateInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllowanceChargeRateInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}AllowanceChargeRate"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}Measurement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllowanceChargeRateInformationType", propOrder = {
    "allowanceChargeRate",
    "measurement"
})
public class AllowanceChargeRateInformationType {

    @XmlElement(name = "AllowanceChargeRate", required = true)
    protected BigDecimal allowanceChargeRate;
    @XmlElement(name = "Measurement")
    protected MeasurementType measurement;

    /**
     * Gets the value of the allowanceChargeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAllowanceChargeRate() {
        return allowanceChargeRate;
    }

    /**
     * Sets the value of the allowanceChargeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAllowanceChargeRate(BigDecimal value) {
        this.allowanceChargeRate = value;
    }

    /**
     * Gets the value of the measurement property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getMeasurement() {
        return measurement;
    }

    /**
     * Sets the value of the measurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setMeasurement(MeasurementType value) {
        this.measurement = value;
    }

}

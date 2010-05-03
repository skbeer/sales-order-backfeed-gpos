
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InlandWaterTransportInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InlandWaterTransportInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BargeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InlandWaterTransportInformationType", propOrder = {
    "bargeType"
})
public class InlandWaterTransportInformationType {

    @XmlElement(name = "BargeType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bargeType;

    /**
     * Gets the value of the bargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBargeType() {
        return bargeType;
    }

    /**
     * Sets the value of the bargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBargeType(String value) {
        this.bargeType = value;
    }

}

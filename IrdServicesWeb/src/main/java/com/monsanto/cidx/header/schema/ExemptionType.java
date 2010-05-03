
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ExemptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExemptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}IndividualExemptionNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ExemptionSource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExemptionType", propOrder = {
    "individualExemptionNumber",
    "exemptionSource"
})
public class ExemptionType {

    @XmlElement(name = "IndividualExemptionNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String individualExemptionNumber;
    @XmlElement(name = "ExemptionSource")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String exemptionSource;

    /**
     * Gets the value of the individualExemptionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualExemptionNumber() {
        return individualExemptionNumber;
    }

    /**
     * Sets the value of the individualExemptionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualExemptionNumber(String value) {
        this.individualExemptionNumber = value;
    }

    /**
     * Gets the value of the exemptionSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptionSource() {
        return exemptionSource;
    }

    /**
     * Sets the value of the exemptionSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptionSource(String value) {
        this.exemptionSource = value;
    }

}

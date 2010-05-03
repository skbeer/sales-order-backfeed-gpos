
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GeographicLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}GeographicName"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}GeographicType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicLocationType", propOrder = {
    "geographicName",
    "geographicType"
})
public class GeographicLocationType {

    @XmlElement(name = "GeographicName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String geographicName;
    @XmlElement(name = "GeographicType", required = true)
    protected CidxListGeographicType geographicType;

    /**
     * Gets the value of the geographicName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeographicName() {
        return geographicName;
    }

    /**
     * Sets the value of the geographicName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeographicName(String value) {
        this.geographicName = value;
    }

    /**
     * Gets the value of the geographicType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListGeographicType }
     *     
     */
    public CidxListGeographicType getGeographicType() {
        return geographicType;
    }

    /**
     * Sets the value of the geographicType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListGeographicType }
     *     
     */
    public void setGeographicType(CidxListGeographicType value) {
        this.geographicType = value;
    }

}

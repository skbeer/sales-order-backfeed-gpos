
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for HandlingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandlingInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HandlingStartDateTime" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HandlingEndDateTime" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HandlingDescription"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}HandlingException" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandlingInformationType", propOrder = {
    "handlingStartDateTime",
    "handlingEndDateTime",
    "handlingDescription",
    "handlingException"
})
public class HandlingInformationType {

    @XmlElement(name = "HandlingStartDateTime")
    protected HandlingStartDateTimeType handlingStartDateTime;
    @XmlElement(name = "HandlingEndDateTime")
    protected HandlingEndDateTimeType handlingEndDateTime;
    @XmlElement(name = "HandlingDescription", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String handlingDescription;
    @XmlElement(name = "HandlingException")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String handlingException;

    /**
     * Gets the value of the handlingStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link HandlingStartDateTimeType }
     *     
     */
    public HandlingStartDateTimeType getHandlingStartDateTime() {
        return handlingStartDateTime;
    }

    /**
     * Sets the value of the handlingStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlingStartDateTimeType }
     *     
     */
    public void setHandlingStartDateTime(HandlingStartDateTimeType value) {
        this.handlingStartDateTime = value;
    }

    /**
     * Gets the value of the handlingEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link HandlingEndDateTimeType }
     *     
     */
    public HandlingEndDateTimeType getHandlingEndDateTime() {
        return handlingEndDateTime;
    }

    /**
     * Sets the value of the handlingEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlingEndDateTimeType }
     *     
     */
    public void setHandlingEndDateTime(HandlingEndDateTimeType value) {
        this.handlingEndDateTime = value;
    }

    /**
     * Gets the value of the handlingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingDescription() {
        return handlingDescription;
    }

    /**
     * Sets the value of the handlingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingDescription(String value) {
        this.handlingDescription = value;
    }

    /**
     * Gets the value of the handlingException property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingException() {
        return handlingException;
    }

    /**
     * Sets the value of the handlingException property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingException(String value) {
        this.handlingException = value;
    }

}

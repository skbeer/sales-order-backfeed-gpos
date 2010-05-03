
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BorderCrossingPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BorderCrossingPointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BorderExit"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BorderEntry"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BorderCrossingPointType", propOrder = {
    "borderExit",
    "borderEntry"
})
public class BorderCrossingPointType {

    @XmlElement(name = "BorderExit", required = true)
    protected BorderExitType borderExit;
    @XmlElement(name = "BorderEntry", required = true)
    protected BorderEntryType borderEntry;

    /**
     * Gets the value of the borderExit property.
     * 
     * @return
     *     possible object is
     *     {@link BorderExitType }
     *     
     */
    public BorderExitType getBorderExit() {
        return borderExit;
    }

    /**
     * Sets the value of the borderExit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorderExitType }
     *     
     */
    public void setBorderExit(BorderExitType value) {
        this.borderExit = value;
    }

    /**
     * Gets the value of the borderEntry property.
     * 
     * @return
     *     possible object is
     *     {@link BorderEntryType }
     *     
     */
    public BorderEntryType getBorderEntry() {
        return borderEntry;
    }

    /**
     * Sets the value of the borderEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorderEntryType }
     *     
     */
    public void setBorderEntry(BorderEntryType value) {
        this.borderEntry = value;
    }

}

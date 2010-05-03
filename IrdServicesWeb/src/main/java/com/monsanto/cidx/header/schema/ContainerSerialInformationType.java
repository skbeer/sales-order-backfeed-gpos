
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ContainerSerialInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContainerSerialInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}ContainerSerialNumber" minOccurs="0"/>
 *         &lt;element ref="{urn:cidx:names:specification:ces:schema:all:5:0}BarCodeDataIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContainerSerialInformationType", propOrder = {
    "containerSerialNumber",
    "barCodeDataIdentifier"
})
public class ContainerSerialInformationType {

    @XmlElement(name = "ContainerSerialNumber")
    protected ContainerSerialNumberType containerSerialNumber;
    @XmlElement(name = "BarCodeDataIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String barCodeDataIdentifier;

    /**
     * Gets the value of the containerSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerSerialNumberType }
     *     
     */
    public ContainerSerialNumberType getContainerSerialNumber() {
        return containerSerialNumber;
    }

    /**
     * Sets the value of the containerSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerSerialNumberType }
     *     
     */
    public void setContainerSerialNumber(ContainerSerialNumberType value) {
        this.containerSerialNumber = value;
    }

    /**
     * Gets the value of the barCodeDataIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCodeDataIdentifier() {
        return barCodeDataIdentifier;
    }

    /**
     * Sets the value of the barCodeDataIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCodeDataIdentifier(String value) {
        this.barCodeDataIdentifier = value;
    }

}

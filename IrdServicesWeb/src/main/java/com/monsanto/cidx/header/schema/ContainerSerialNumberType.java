
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ContainerSerialNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContainerSerialNumberType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:cidx:names:specification:ces:schema:all:5:0>cidxToken">
 *       &lt;attribute name="BarCodeSymbology" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListBarCodeSymbology" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContainerSerialNumberType", propOrder = {
    "value"
})
public class ContainerSerialNumberType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "BarCodeSymbology", required = true)
    protected CidxListBarCodeSymbology barCodeSymbology;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the barCodeSymbology property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListBarCodeSymbology }
     *     
     */
    public CidxListBarCodeSymbology getBarCodeSymbology() {
        return barCodeSymbology;
    }

    /**
     * Sets the value of the barCodeSymbology property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListBarCodeSymbology }
     *     
     */
    public void setBarCodeSymbology(CidxListBarCodeSymbology value) {
        this.barCodeSymbology = value;
    }

}

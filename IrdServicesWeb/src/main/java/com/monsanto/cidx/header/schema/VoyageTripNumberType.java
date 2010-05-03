
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for VoyageTripNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoyageTripNumberType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:cidx:names:specification:ces:schema:all:5:0>cidxToken">
 *       &lt;attribute name="SelectionQualifier" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListVoyageTripNumberAgency" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoyageTripNumberType", propOrder = {
    "value"
})
public class VoyageTripNumberType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "SelectionQualifier", required = true)
    protected CidxListVoyageTripNumberAgency selectionQualifier;

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
     * Gets the value of the selectionQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListVoyageTripNumberAgency }
     *     
     */
    public CidxListVoyageTripNumberAgency getSelectionQualifier() {
        return selectionQualifier;
    }

    /**
     * Sets the value of the selectionQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListVoyageTripNumberAgency }
     *     
     */
    public void setSelectionQualifier(CidxListVoyageTripNumberAgency value) {
        this.selectionQualifier = value;
    }

}

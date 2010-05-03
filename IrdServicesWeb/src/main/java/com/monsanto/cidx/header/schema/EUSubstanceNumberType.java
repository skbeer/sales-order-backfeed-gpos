
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EUSubstanceNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EUSubstanceNumberType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:cidx:names:specification:ces:schema:all:5:0>cidxToken">
 *       &lt;attribute name="Domain" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListEUSubstanceNumberDomain" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EUSubstanceNumberType", propOrder = {
    "value"
})
public class EUSubstanceNumberType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "Domain", required = true)
    protected CidxListEUSubstanceNumberDomain domain;

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
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListEUSubstanceNumberDomain }
     *     
     */
    public CidxListEUSubstanceNumberDomain getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListEUSubstanceNumberDomain }
     *     
     */
    public void setDomain(CidxListEUSubstanceNumberDomain value) {
        this.domain = value;
    }

}

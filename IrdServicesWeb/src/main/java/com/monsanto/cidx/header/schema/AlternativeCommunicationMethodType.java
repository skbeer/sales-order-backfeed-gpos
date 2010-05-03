
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AlternativeCommunicationMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlternativeCommunicationMethodType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:cidx:names:specification:ces:schema:all:5:0>cidxToken">
 *       &lt;attribute name="CommunicationMethodType" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListCommunicationMethodType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternativeCommunicationMethodType", propOrder = {
    "value"
})
public class AlternativeCommunicationMethodType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "CommunicationMethodType", required = true)
    protected CidxListCommunicationMethodType communicationMethodType;

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
     * Gets the value of the communicationMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListCommunicationMethodType }
     *     
     */
    public CidxListCommunicationMethodType getCommunicationMethodType() {
        return communicationMethodType;
    }

    /**
     * Sets the value of the communicationMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListCommunicationMethodType }
     *     
     */
    public void setCommunicationMethodType(CidxListCommunicationMethodType value) {
        this.communicationMethodType = value;
    }

}

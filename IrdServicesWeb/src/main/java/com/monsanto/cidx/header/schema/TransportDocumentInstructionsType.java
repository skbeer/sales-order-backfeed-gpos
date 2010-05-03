
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TransportDocumentInstructionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportDocumentInstructionsType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:cidx:names:specification:ces:schema:all:5:0>cidxToken">
 *       &lt;attribute name="TransportDocumentType" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListReferenceType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportDocumentInstructionsType", propOrder = {
    "value"
})
public class TransportDocumentInstructionsType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "TransportDocumentType")
    protected CidxListReferenceType transportDocumentType;

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
     * Gets the value of the transportDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListReferenceType }
     *     
     */
    public CidxListReferenceType getTransportDocumentType() {
        return transportDocumentType;
    }

    /**
     * Sets the value of the transportDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListReferenceType }
     *     
     */
    public void setTransportDocumentType(CidxListReferenceType value) {
        this.transportDocumentType = value;
    }

}

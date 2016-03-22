
package com.monsanto.irdsoapservices.agreementstatuspartners.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AlternateCommunicationMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlternateCommunicationMethodType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *       &lt;attribute name="CommunicationMethodType" type="{urn:cidx:names:specification:ces:schema:all:5:3}ListCommunicationMethodType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternateCommunicationMethodType", propOrder = {
    "value"
})
public class AlternateCommunicationMethodType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String value;
    @XmlAttribute(name = "CommunicationMethodType")
    protected ListCommunicationMethodType communicationMethodType;

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
     *     {@link ListCommunicationMethodType }
     *     
     */
    public ListCommunicationMethodType getCommunicationMethodType() {
        return communicationMethodType;
    }

    /**
     * Sets the value of the communicationMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCommunicationMethodType }
     *     
     */
    public void setCommunicationMethodType(ListCommunicationMethodType value) {
        this.communicationMethodType = value;
    }

}

package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DateTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateTimeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:cidx:names:specification:ces:schema:all:5:0>cidxDateTime">
 *       &lt;attribute name="DateTimeQualifier" use="required" type="{urn:cidx:names:specification:ces:schema:all:5:0}cidxListDateQualifier" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimeType", propOrder = {
    "value"
})
public class DateTimeType {

    @XmlValue
    protected XMLGregorianCalendar value;
    @XmlAttribute(name = "DateTimeQualifier", required = true)
    protected CidxListDateQualifier dateTimeQualifier;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValue(XMLGregorianCalendar value) {
        this.value = value;
    }

    /**
     * Gets the value of the dateTimeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link CidxListDateQualifier }
     *     
     */
    public CidxListDateQualifier getDateTimeQualifier() {
        return dateTimeQualifier;
    }

    /**
     * Sets the value of the dateTimeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CidxListDateQualifier }
     *     
     */
    public void setDateTimeQualifier(CidxListDateQualifier value) {
        this.dateTimeQualifier = value;
    }

}

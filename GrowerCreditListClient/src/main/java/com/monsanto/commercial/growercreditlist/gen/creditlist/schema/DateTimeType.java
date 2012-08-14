
package com.monsanto.commercial.growercreditlist.gen.creditlist.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>dateTime">
 *       &lt;attribute name="DateTimeQualifier" use="required" type="{Monsanto:Service:GrowerCreditList}ListDateQualifier" />
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
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar value;
    @XmlAttribute(name = "DateTimeQualifier", required = true)
    protected ListDateQualifier dateTimeQualifier;

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
     *     {@link ListDateQualifier }
     *     
     */
    public ListDateQualifier getDateTimeQualifier() {
        return dateTimeQualifier;
    }

    /**
     * Sets the value of the dateTimeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListDateQualifier }
     *     
     */
    public void setDateTimeQualifier(ListDateQualifier value) {
        this.dateTimeQualifier = value;
    }

}

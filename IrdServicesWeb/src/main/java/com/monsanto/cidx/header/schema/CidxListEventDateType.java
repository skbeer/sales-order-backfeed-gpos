
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListEventDateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListEventDateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="InvoiceDate"/>
 *     &lt;enumeration value="OrderDate"/>
 *     &lt;enumeration value="ReturnDate"/>
 *     &lt;enumeration value="ShipDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListEventDateType")
@XmlEnum
public enum CidxListEventDateType {

    @XmlEnumValue("InvoiceDate")
    INVOICE_DATE("InvoiceDate"),
    @XmlEnumValue("OrderDate")
    ORDER_DATE("OrderDate"),
    @XmlEnumValue("ReturnDate")
    RETURN_DATE("ReturnDate"),
    @XmlEnumValue("ShipDate")
    SHIP_DATE("ShipDate");
    private final String value;

    CidxListEventDateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListEventDateType fromValue(String v) {
        for (CidxListEventDateType c: CidxListEventDateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

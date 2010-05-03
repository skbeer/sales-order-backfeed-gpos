
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListOrderScope.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListOrderScope">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Invoice"/>
 *     &lt;enumeration value="LineItem"/>
 *     &lt;enumeration value="EntireOrder"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListOrderScope")
@XmlEnum
public enum CidxListOrderScope {

    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("LineItem")
    LINE_ITEM("LineItem"),
    @XmlEnumValue("EntireOrder")
    ENTIRE_ORDER("EntireOrder");
    private final String value;

    CidxListOrderScope(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListOrderScope fromValue(String v) {
        for (CidxListOrderScope c: CidxListOrderScope.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

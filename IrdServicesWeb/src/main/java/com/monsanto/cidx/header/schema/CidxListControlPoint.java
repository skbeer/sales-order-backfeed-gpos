
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListControlPoint.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListControlPoint">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Loading"/>
 *     &lt;enumeration value="Delivery"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListControlPoint")
@XmlEnum
public enum CidxListControlPoint {

    @XmlEnumValue("Loading")
    LOADING("Loading"),
    @XmlEnumValue("Delivery")
    DELIVERY("Delivery");
    private final String value;

    CidxListControlPoint(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListControlPoint fromValue(String v) {
        for (CidxListControlPoint c: CidxListControlPoint.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

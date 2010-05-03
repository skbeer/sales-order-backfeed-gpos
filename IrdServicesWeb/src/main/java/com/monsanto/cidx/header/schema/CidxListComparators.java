
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListComparators.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListComparators">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="EqualTo"/>
 *     &lt;enumeration value="GreaterThan"/>
 *     &lt;enumeration value="LessThan"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListComparators")
@XmlEnum
public enum CidxListComparators {

    @XmlEnumValue("EqualTo")
    EQUAL_TO("EqualTo"),
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan");
    private final String value;

    CidxListComparators(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListComparators fromValue(String v) {
        for (CidxListComparators c: CidxListComparators.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

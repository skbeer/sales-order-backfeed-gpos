
package com.monsanto.irdsoapservices.vistiveprocessorlist.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActiveFlagType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActiveFlagType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="True"/>
 *     &lt;enumeration value="False"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActiveFlagType")
@XmlEnum
public enum ActiveFlagType {

    @XmlEnumValue("True")
    TRUE("True"),
    @XmlEnumValue("False")
    FALSE("False");
    private final String value;

    ActiveFlagType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActiveFlagType fromValue(String v) {
        for (ActiveFlagType c: ActiveFlagType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

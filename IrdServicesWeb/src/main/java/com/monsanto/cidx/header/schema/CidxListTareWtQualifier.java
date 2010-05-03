
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListTareWtQualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListTareWtQualifier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Actual"/>
 *     &lt;enumeration value="Marked"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListTareWtQualifier")
@XmlEnum
public enum CidxListTareWtQualifier {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Marked")
    MARKED("Marked");
    private final String value;

    CidxListTareWtQualifier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListTareWtQualifier fromValue(String v) {
        for (CidxListTareWtQualifier c: CidxListTareWtQualifier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

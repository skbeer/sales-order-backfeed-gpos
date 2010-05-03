
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListLocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Destination"/>
 *     &lt;enumeration value="Origin"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListLocationType")
@XmlEnum
public enum CidxListLocationType {

    @XmlEnumValue("Destination")
    DESTINATION("Destination"),
    @XmlEnumValue("Origin")
    ORIGIN("Origin");
    private final String value;

    CidxListLocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListLocationType fromValue(String v) {
        for (CidxListLocationType c: CidxListLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

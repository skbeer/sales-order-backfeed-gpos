
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListShipmentDateQualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListShipmentDateQualifier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Actual"/>
 *     &lt;enumeration value="Original"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListShipmentDateQualifier")
@XmlEnum
public enum CidxListShipmentDateQualifier {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Original")
    ORIGINAL("Original");
    private final String value;

    CidxListShipmentDateQualifier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListShipmentDateQualifier fromValue(String v) {
        for (CidxListShipmentDateQualifier c: CidxListShipmentDateQualifier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.monsanto.irdsoapservices.retailseller.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListDateQualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListDateQualifier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="On"/>
 *     &lt;enumeration value="After"/>
 *     &lt;enumeration value="Before"/>
 *     &lt;enumeration value="OnOrAfter"/>
 *     &lt;enumeration value="OnOrBefore"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListDateQualifier")
@XmlEnum
public enum ListDateQualifier {

    @XmlEnumValue("On")
    ON("On"),
    @XmlEnumValue("After")
    AFTER("After"),
    @XmlEnumValue("Before")
    BEFORE("Before"),
    @XmlEnumValue("OnOrAfter")
    ON_OR_AFTER("OnOrAfter"),
    @XmlEnumValue("OnOrBefore")
    ON_OR_BEFORE("OnOrBefore");
    private final String value;

    ListDateQualifier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListDateQualifier fromValue(String v) {
        for (ListDateQualifier c: ListDateQualifier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListDateQualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListDateQualifier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="After"/>
 *     &lt;enumeration value="Before"/>
 *     &lt;enumeration value="On"/>
 *     &lt;enumeration value="OnOrAfter"/>
 *     &lt;enumeration value="OnOrBefore"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListDateQualifier")
@XmlEnum
public enum CidxListDateQualifier {

    @XmlEnumValue("After")
    AFTER("After"),
    @XmlEnumValue("Before")
    BEFORE("Before"),
    @XmlEnumValue("On")
    ON("On"),
    @XmlEnumValue("OnOrAfter")
    ON_OR_AFTER("OnOrAfter"),
    @XmlEnumValue("OnOrBefore")
    ON_OR_BEFORE("OnOrBefore");
    private final String value;

    CidxListDateQualifier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListDateQualifier fromValue(String v) {
        for (CidxListDateQualifier c: CidxListDateQualifier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

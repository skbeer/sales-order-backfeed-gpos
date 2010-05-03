
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListLineStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListLineStatus">
 *   &lt;restriction base="{urn:cidx:names:specification:ces:schema:all:5:0}cidxToken">
 *     &lt;enumeration value="Changed"/>
 *     &lt;enumeration value="Deleted"/>
 *     &lt;enumeration value="Pending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListLineStatus")
@XmlEnum
public enum CidxListLineStatus {

    @XmlEnumValue("Changed")
    CHANGED("Changed"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("Pending")
    PENDING("Pending");
    private final String value;

    CidxListLineStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListLineStatus fromValue(String v) {
        for (CidxListLineStatus c: CidxListLineStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListActionRequest.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListActionRequest">
 *   &lt;restriction base="{urn:cidx:names:specification:ces:schema:all:5:0}cidxToken">
 *     &lt;enumeration value="Change"/>
 *     &lt;enumeration value="Delete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListActionRequest")
@XmlEnum
public enum CidxListActionRequest {

    @XmlEnumValue("Change")
    CHANGE("Change"),
    @XmlEnumValue("Delete")
    DELETE("Delete");
    private final String value;

    CidxListActionRequest(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListActionRequest fromValue(String v) {
        for (CidxListActionRequest c: CidxListActionRequest.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

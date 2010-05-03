
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="Replace"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListActionType")
@XmlEnum
public enum CidxListActionType {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Replace")
    REPLACE("Replace");
    private final String value;

    CidxListActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListActionType fromValue(String v) {
        for (CidxListActionType c: CidxListActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

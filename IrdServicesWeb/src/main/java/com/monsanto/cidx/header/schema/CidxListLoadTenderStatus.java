
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListLoadTenderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListLoadTenderStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Cancel"/>
 *     &lt;enumeration value="Change"/>
 *     &lt;enumeration value="Original"/>
 *     &lt;enumeration value="Replace"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListLoadTenderStatus")
@XmlEnum
public enum CidxListLoadTenderStatus {

    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("Change")
    CHANGE("Change"),
    @XmlEnumValue("Original")
    ORIGINAL("Original"),
    @XmlEnumValue("Replace")
    REPLACE("Replace");
    private final String value;

    CidxListLoadTenderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListLoadTenderStatus fromValue(String v) {
        for (CidxListLoadTenderStatus c: CidxListLoadTenderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

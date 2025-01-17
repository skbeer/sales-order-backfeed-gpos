
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListPriceSheetReferenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListPriceSheetReferenceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Supersedes"/>
 *     &lt;enumeration value="References"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListPriceSheetReferenceType")
@XmlEnum
public enum CidxListPriceSheetReferenceType {

    @XmlEnumValue("Supersedes")
    SUPERSEDES("Supersedes"),
    @XmlEnumValue("References")
    REFERENCES("References");
    private final String value;

    CidxListPriceSheetReferenceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListPriceSheetReferenceType fromValue(String v) {
        for (CidxListPriceSheetReferenceType c: CidxListPriceSheetReferenceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

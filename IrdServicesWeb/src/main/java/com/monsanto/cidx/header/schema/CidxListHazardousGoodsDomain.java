
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListHazardousGoodsDomain.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListHazardousGoodsDomain">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="HIN-UN"/>
 *     &lt;enumeration value="SUPPLIER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListHazardousGoodsDomain")
@XmlEnum
public enum CidxListHazardousGoodsDomain {

    @XmlEnumValue("HIN-UN")
    HIN_UN("HIN-UN"),
    SUPPLIER("SUPPLIER");
    private final String value;

    CidxListHazardousGoodsDomain(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListHazardousGoodsDomain fromValue(String v) {
        for (CidxListHazardousGoodsDomain c: CidxListHazardousGoodsDomain.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

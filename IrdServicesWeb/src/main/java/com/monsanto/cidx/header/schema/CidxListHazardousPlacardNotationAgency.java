
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListHazardousPlacardNotationAgency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListHazardousPlacardNotationAgency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Hazchem"/>
 *     &lt;enumeration value="Kemler"/>
 *     &lt;enumeration value="USDOT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListHazardousPlacardNotationAgency")
@XmlEnum
public enum CidxListHazardousPlacardNotationAgency {

    @XmlEnumValue("Hazchem")
    HAZCHEM("Hazchem"),
    @XmlEnumValue("Kemler")
    KEMLER("Kemler"),
    USDOT("USDOT");
    private final String value;

    CidxListHazardousPlacardNotationAgency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListHazardousPlacardNotationAgency fromValue(String v) {
        for (CidxListHazardousPlacardNotationAgency c: CidxListHazardousPlacardNotationAgency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

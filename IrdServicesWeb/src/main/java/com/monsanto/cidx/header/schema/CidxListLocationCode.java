
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListLocationCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListLocationCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="GPSCode"/>
 *     &lt;enumeration value="SPLC"/>
 *     &lt;enumeration value="UN-LOCODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListLocationCode")
@XmlEnum
public enum CidxListLocationCode {

    @XmlEnumValue("GPSCode")
    GPS_CODE("GPSCode"),
    SPLC("SPLC"),
    @XmlEnumValue("UN-LOCODE")
    UN_LOCODE("UN-LOCODE");
    private final String value;

    CidxListLocationCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListLocationCode fromValue(String v) {
        for (CidxListLocationCode c: CidxListLocationCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

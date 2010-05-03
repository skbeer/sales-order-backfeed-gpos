
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListCharacteristicCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListCharacteristicCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="SeedLicenseNumber"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListCharacteristicCodeType")
@XmlEnum
public enum CidxListCharacteristicCodeType {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("SeedLicenseNumber")
    SEED_LICENSE_NUMBER("SeedLicenseNumber");
    private final String value;

    CidxListCharacteristicCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListCharacteristicCodeType fromValue(String v) {
        for (CidxListCharacteristicCodeType c: CidxListCharacteristicCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

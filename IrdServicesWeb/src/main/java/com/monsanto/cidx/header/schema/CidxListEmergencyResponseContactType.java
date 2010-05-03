
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListEmergencyResponseContactType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListEmergencyResponseContactType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Canutec"/>
 *     &lt;enumeration value="Chemtrec"/>
 *     &lt;enumeration value="Shipper"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListEmergencyResponseContactType")
@XmlEnum
public enum CidxListEmergencyResponseContactType {

    @XmlEnumValue("Canutec")
    CANUTEC("Canutec"),
    @XmlEnumValue("Chemtrec")
    CHEMTREC("Chemtrec"),
    @XmlEnumValue("Shipper")
    SHIPPER("Shipper");
    private final String value;

    CidxListEmergencyResponseContactType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListEmergencyResponseContactType fromValue(String v) {
        for (CidxListEmergencyResponseContactType c: CidxListEmergencyResponseContactType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

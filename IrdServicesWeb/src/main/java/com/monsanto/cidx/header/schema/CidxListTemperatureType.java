
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListTemperatureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListTemperatureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="BoilingPoint"/>
 *     &lt;enumeration value="ControlTemperature"/>
 *     &lt;enumeration value="EmergencyTemperature"/>
 *     &lt;enumeration value="FlashPoint"/>
 *     &lt;enumeration value="MeltingPoint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListTemperatureType")
@XmlEnum
public enum CidxListTemperatureType {

    @XmlEnumValue("BoilingPoint")
    BOILING_POINT("BoilingPoint"),
    @XmlEnumValue("ControlTemperature")
    CONTROL_TEMPERATURE("ControlTemperature"),
    @XmlEnumValue("EmergencyTemperature")
    EMERGENCY_TEMPERATURE("EmergencyTemperature"),
    @XmlEnumValue("FlashPoint")
    FLASH_POINT("FlashPoint"),
    @XmlEnumValue("MeltingPoint")
    MELTING_POINT("MeltingPoint");
    private final String value;

    CidxListTemperatureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListTemperatureType fromValue(String v) {
        for (CidxListTemperatureType c: CidxListTemperatureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListWeightAllowance.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListWeightAllowance">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Cab"/>
 *     &lt;enumeration value="Driver"/>
 *     &lt;enumeration value="Dunnage"/>
 *     &lt;enumeration value="Fuel"/>
 *     &lt;enumeration value="Ice"/>
 *     &lt;enumeration value="Snow"/>
 *     &lt;enumeration value="Water"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListWeightAllowance")
@XmlEnum
public enum CidxListWeightAllowance {

    @XmlEnumValue("Cab")
    CAB("Cab"),
    @XmlEnumValue("Driver")
    DRIVER("Driver"),
    @XmlEnumValue("Dunnage")
    DUNNAGE("Dunnage"),
    @XmlEnumValue("Fuel")
    FUEL("Fuel"),
    @XmlEnumValue("Ice")
    ICE("Ice"),
    @XmlEnumValue("Snow")
    SNOW("Snow"),
    @XmlEnumValue("Water")
    WATER("Water");
    private final String value;

    CidxListWeightAllowance(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListWeightAllowance fromValue(String v) {
        for (CidxListWeightAllowance c: CidxListWeightAllowance.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListWeightType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListWeightType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="ActualNetWeight"/>
 *     &lt;enumeration value="GrossWeight"/>
 *     &lt;enumeration value="LightWeight"/>
 *     &lt;enumeration value="ShipperWeight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListWeightType")
@XmlEnum
public enum CidxListWeightType {

    @XmlEnumValue("ActualNetWeight")
    ACTUAL_NET_WEIGHT("ActualNetWeight"),
    @XmlEnumValue("GrossWeight")
    GROSS_WEIGHT("GrossWeight"),
    @XmlEnumValue("LightWeight")
    LIGHT_WEIGHT("LightWeight"),
    @XmlEnumValue("ShipperWeight")
    SHIPPER_WEIGHT("ShipperWeight");
    private final String value;

    CidxListWeightType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListWeightType fromValue(String v) {
        for (CidxListWeightType c: CidxListWeightType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

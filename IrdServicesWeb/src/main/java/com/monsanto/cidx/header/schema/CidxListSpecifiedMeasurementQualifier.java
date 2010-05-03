
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListSpecifiedMeasurementQualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListSpecifiedMeasurementQualifier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="EqualTo"/>
 *     &lt;enumeration value="Maximum"/>
 *     &lt;enumeration value="Minimum"/>
 *     &lt;enumeration value="Optional"/>
 *     &lt;enumeration value="Over"/>
 *     &lt;enumeration value="Recommended"/>
 *     &lt;enumeration value="Under"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListSpecifiedMeasurementQualifier")
@XmlEnum
public enum CidxListSpecifiedMeasurementQualifier {

    @XmlEnumValue("EqualTo")
    EQUAL_TO("EqualTo"),
    @XmlEnumValue("Maximum")
    MAXIMUM("Maximum"),
    @XmlEnumValue("Minimum")
    MINIMUM("Minimum"),
    @XmlEnumValue("Optional")
    OPTIONAL("Optional"),
    @XmlEnumValue("Over")
    OVER("Over"),
    @XmlEnumValue("Recommended")
    RECOMMENDED("Recommended"),
    @XmlEnumValue("Under")
    UNDER("Under");
    private final String value;

    CidxListSpecifiedMeasurementQualifier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListSpecifiedMeasurementQualifier fromValue(String v) {
        for (CidxListSpecifiedMeasurementQualifier c: CidxListSpecifiedMeasurementQualifier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListLadingIdentificationAgency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListLadingIdentificationAgency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="EAN"/>
 *     &lt;enumeration value="GlobalMaterialIdentifier"/>
 *     &lt;enumeration value="HarmonizedSystemBasedSchedule"/>
 *     &lt;enumeration value="NMFC"/>
 *     &lt;enumeration value="ODETTE"/>
 *     &lt;enumeration value="ScheduleB"/>
 *     &lt;enumeration value="ShipperDefined"/>
 *     &lt;enumeration value="STCC"/>
 *     &lt;enumeration value="UN-NA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListLadingIdentificationAgency")
@XmlEnum
public enum CidxListLadingIdentificationAgency {

    EAN("EAN"),
    @XmlEnumValue("GlobalMaterialIdentifier")
    GLOBAL_MATERIAL_IDENTIFIER("GlobalMaterialIdentifier"),
    @XmlEnumValue("HarmonizedSystemBasedSchedule")
    HARMONIZED_SYSTEM_BASED_SCHEDULE("HarmonizedSystemBasedSchedule"),
    NMFC("NMFC"),
    ODETTE("ODETTE"),
    @XmlEnumValue("ScheduleB")
    SCHEDULE_B("ScheduleB"),
    @XmlEnumValue("ShipperDefined")
    SHIPPER_DEFINED("ShipperDefined"),
    STCC("STCC"),
    @XmlEnumValue("UN-NA")
    UN_NA("UN-NA");
    private final String value;

    CidxListLadingIdentificationAgency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListLadingIdentificationAgency fromValue(String v) {
        for (CidxListLadingIdentificationAgency c: CidxListLadingIdentificationAgency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

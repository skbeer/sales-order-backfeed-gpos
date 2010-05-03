
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListGeographicType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListGeographicType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="CanadianFreightRegionCode"/>
 *     &lt;enumeration value="City"/>
 *     &lt;enumeration value="Country"/>
 *     &lt;enumeration value="County"/>
 *     &lt;enumeration value="Province"/>
 *     &lt;enumeration value="Region"/>
 *     &lt;enumeration value="State"/>
 *     &lt;enumeration value="Zone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListGeographicType")
@XmlEnum
public enum CidxListGeographicType {

    @XmlEnumValue("CanadianFreightRegionCode")
    CANADIAN_FREIGHT_REGION_CODE("CanadianFreightRegionCode"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("County")
    COUNTY("County"),
    @XmlEnumValue("Province")
    PROVINCE("Province"),
    @XmlEnumValue("Region")
    REGION("Region"),
    @XmlEnumValue("State")
    STATE("State"),
    @XmlEnumValue("Zone")
    ZONE("Zone");
    private final String value;

    CidxListGeographicType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListGeographicType fromValue(String v) {
        for (CidxListGeographicType c: CidxListGeographicType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

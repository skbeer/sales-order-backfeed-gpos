
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListLoadBuildingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListLoadBuildingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="FixedLoad"/>
 *     &lt;enumeration value="LoadBuildRequest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListLoadBuildingType")
@XmlEnum
public enum CidxListLoadBuildingType {

    @XmlEnumValue("FixedLoad")
    FIXED_LOAD("FixedLoad"),
    @XmlEnumValue("LoadBuildRequest")
    LOAD_BUILD_REQUEST("LoadBuildRequest");
    private final String value;

    CidxListLoadBuildingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListLoadBuildingType fromValue(String v) {
        for (CidxListLoadBuildingType c: CidxListLoadBuildingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

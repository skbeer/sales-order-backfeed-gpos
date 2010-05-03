
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListTestMethodAgency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListTestMethodAgency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="AssignedByBuyer"/>
 *     &lt;enumeration value="AssignedBySeller"/>
 *     &lt;enumeration value="ASTM"/>
 *     &lt;enumeration value="DIN"/>
 *     &lt;enumeration value="BSI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListTestMethodAgency")
@XmlEnum
public enum CidxListTestMethodAgency {

    @XmlEnumValue("AssignedByBuyer")
    ASSIGNED_BY_BUYER("AssignedByBuyer"),
    @XmlEnumValue("AssignedBySeller")
    ASSIGNED_BY_SELLER("AssignedBySeller"),
    ASTM("ASTM"),
    DIN("DIN"),
    BSI("BSI");
    private final String value;

    CidxListTestMethodAgency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListTestMethodAgency fromValue(String v) {
        for (CidxListTestMethodAgency c: CidxListTestMethodAgency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

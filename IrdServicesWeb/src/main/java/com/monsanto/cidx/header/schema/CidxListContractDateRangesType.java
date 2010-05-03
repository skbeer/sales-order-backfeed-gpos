
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListContractDateRangesType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListContractDateRangesType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="OrderDates"/>
 *     &lt;enumeration value="ShipDates"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListContractDateRangesType")
@XmlEnum
public enum CidxListContractDateRangesType {

    @XmlEnumValue("OrderDates")
    ORDER_DATES("OrderDates"),
    @XmlEnumValue("ShipDates")
    SHIP_DATES("ShipDates");
    private final String value;

    CidxListContractDateRangesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListContractDateRangesType fromValue(String v) {
        for (CidxListContractDateRangesType c: CidxListContractDateRangesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

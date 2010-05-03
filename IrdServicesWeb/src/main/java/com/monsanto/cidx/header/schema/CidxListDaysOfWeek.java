
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListDaysOfWeek.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListDaysOfWeek">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Friday"/>
 *     &lt;enumeration value="Monday"/>
 *     &lt;enumeration value="Saturday"/>
 *     &lt;enumeration value="Sunday"/>
 *     &lt;enumeration value="Thursday"/>
 *     &lt;enumeration value="Tuesday"/>
 *     &lt;enumeration value="Wednesday"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListDaysOfWeek")
@XmlEnum
public enum CidxListDaysOfWeek {

    @XmlEnumValue("Friday")
    FRIDAY("Friday"),
    @XmlEnumValue("Monday")
    MONDAY("Monday"),
    @XmlEnumValue("Saturday")
    SATURDAY("Saturday"),
    @XmlEnumValue("Sunday")
    SUNDAY("Sunday"),
    @XmlEnumValue("Thursday")
    THURSDAY("Thursday"),
    @XmlEnumValue("Tuesday")
    TUESDAY("Tuesday"),
    @XmlEnumValue("Wednesday")
    WEDNESDAY("Wednesday");
    private final String value;

    CidxListDaysOfWeek(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListDaysOfWeek fromValue(String v) {
        for (CidxListDaysOfWeek c: CidxListDaysOfWeek.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

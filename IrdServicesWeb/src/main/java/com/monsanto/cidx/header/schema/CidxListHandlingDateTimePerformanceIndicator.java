
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListHandlingDateTimePerformanceIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListHandlingDateTimePerformanceIndicator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Estimated"/>
 *     &lt;enumeration value="Actual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListHandlingDateTimePerformanceIndicator")
@XmlEnum
public enum CidxListHandlingDateTimePerformanceIndicator {

    @XmlEnumValue("Estimated")
    ESTIMATED("Estimated"),
    @XmlEnumValue("Actual")
    ACTUAL("Actual");
    private final String value;

    CidxListHandlingDateTimePerformanceIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListHandlingDateTimePerformanceIndicator fromValue(String v) {
        for (CidxListHandlingDateTimePerformanceIndicator c: CidxListHandlingDateTimePerformanceIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListDutyDrawBack.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListDutyDrawBack">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Eligible"/>
 *     &lt;enumeration value="Ineligible"/>
 *     &lt;enumeration value="ToBeDetermined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListDutyDrawBack")
@XmlEnum
public enum CidxListDutyDrawBack {

    @XmlEnumValue("Eligible")
    ELIGIBLE("Eligible"),
    @XmlEnumValue("Ineligible")
    INELIGIBLE("Ineligible"),
    @XmlEnumValue("ToBeDetermined")
    TO_BE_DETERMINED("ToBeDetermined");
    private final String value;

    CidxListDutyDrawBack(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListDutyDrawBack fromValue(String v) {
        for (CidxListDutyDrawBack c: CidxListDutyDrawBack.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

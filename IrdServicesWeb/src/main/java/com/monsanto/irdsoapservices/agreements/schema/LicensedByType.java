
package com.monsanto.irdsoapservices.agreements.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicensedByType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LicensedByType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="CTN"/>
 *     &lt;enumeration value="DK"/>
 *     &lt;enumeration value="DNC"/>
 *     &lt;enumeration value="HOL"/>
 *     &lt;enumeration value="MON"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="PLT"/>
 *     &lt;enumeration value="TNC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LicensedByType")
@XmlEnum
public enum LicensedByType {

    CS,
    CTN,
    DK,
    DNC,
    HOL,
    MON,
    MS,
    PLT,
    TNC;

    public String value() {
        return name();
    }

    public static LicensedByType fromValue(String v) {
        return valueOf(v);
    }

}

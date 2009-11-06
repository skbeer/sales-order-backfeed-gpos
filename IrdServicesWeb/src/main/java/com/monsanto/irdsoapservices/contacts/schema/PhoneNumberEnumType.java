
package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoneNumberEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PhoneNumberEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUSINESS"/>
 *     &lt;enumeration value="HOME"/>
 *     &lt;enumeration value="CELL"/>
 *     &lt;enumeration value="FAX"/>
 *     &lt;enumeration value="TDD"/>
 *     &lt;enumeration value="PAGER"/>
 *     &lt;enumeration value="TOLLFREE"/>
 *     &lt;enumeration value="AA"/>
 *     &lt;enumeration value="ELEVATOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PhoneNumberEnumType")
@XmlEnum
public enum PhoneNumberEnumType {

    BUSINESS,
    HOME,
    CELL,
    FAX,
    TDD,
    PAGER,
    TOLLFREE,
    AA,
    ELEVATOR;

    public String value() {
        return name();
    }

    public static PhoneNumberEnumType fromValue(String v) {
        return valueOf(v);
    }

}

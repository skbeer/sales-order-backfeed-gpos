
package com.monsanto.irdsoapservices.contacts.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUSINESS"/>
 *     &lt;enumeration value="ELEVATOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmailEnumType")
@XmlEnum
public enum EmailEnumType {

    BUSINESS,
    ELEVATOR;

    public String value() {
        return name();
    }

    public static EmailEnumType fromValue(String v) {
        return valueOf(v);
    }

}

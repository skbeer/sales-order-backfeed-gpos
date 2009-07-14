
package com.monsanto.irdsoapservices.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrowerContactType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GrowerContactType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INFLUENCER"/>
 *     &lt;enumeration value="PRIMARY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GrowerContactType")
@XmlEnum
public enum GrowerContactType {

    INFLUENCER,
    PRIMARY;

    public String value() {
        return name();
    }

    public static GrowerContactType fromValue(String v) {
        return valueOf(v);
    }

}

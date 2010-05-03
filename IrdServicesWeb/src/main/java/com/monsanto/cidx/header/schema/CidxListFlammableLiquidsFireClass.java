
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListFlammableLiquidsFireClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListFlammableLiquidsFireClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="AI"/>
 *     &lt;enumeration value="AII"/>
 *     &lt;enumeration value="AIII"/>
 *     &lt;enumeration value="B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListFlammableLiquidsFireClass")
@XmlEnum
public enum CidxListFlammableLiquidsFireClass {

    AI,
    AII,
    AIII,
    B;

    public String value() {
        return name();
    }

    public static CidxListFlammableLiquidsFireClass fromValue(String v) {
        return valueOf(v);
    }

}

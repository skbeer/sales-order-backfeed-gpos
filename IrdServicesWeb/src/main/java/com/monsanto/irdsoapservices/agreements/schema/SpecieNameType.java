
package com.monsanto.irdsoapservices.agreements.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecieNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecieNameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="ALFALFA"/>
 *     &lt;enumeration value="CANOLA"/>
 *     &lt;enumeration value="CORN"/>
 *     &lt;enumeration value="COTTON"/>
 *     &lt;enumeration value="SORGHUM"/>
 *     &lt;enumeration value="SOYBEAN"/>
 *     &lt;enumeration value="SUDAX"/>
 *     &lt;enumeration value="SUGARBEET"/>
 *     &lt;enumeration value="SUNFLOWER"/>
 *     &lt;enumeration value="WHEAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecieNameType")
@XmlEnum
public enum SpecieNameType {

    ALFALFA,
    CANOLA,
    CORN,
    COTTON,
    SORGHUM,
    SOYBEAN,
    SUDAX,
    SUGARBEET,
    SUNFLOWER,
    WHEAT;

    public String value() {
        return name();
    }

    public static SpecieNameType fromValue(String v) {
        return valueOf(v);
    }

}

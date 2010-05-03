
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListOperationalInstructionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListOperationalInstructionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Nitrogen"/>
 *     &lt;enumeration value="Sampling"/>
 *     &lt;enumeration value="Sealing"/>
 *     &lt;enumeration value="Labeling"/>
 *     &lt;enumeration value="Blending"/>
 *     &lt;enumeration value="Mixing"/>
 *     &lt;enumeration value="Stabilizer"/>
 *     &lt;enumeration value="Tolerances"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListOperationalInstructionType")
@XmlEnum
public enum CidxListOperationalInstructionType {

    @XmlEnumValue("Nitrogen")
    NITROGEN("Nitrogen"),
    @XmlEnumValue("Sampling")
    SAMPLING("Sampling"),
    @XmlEnumValue("Sealing")
    SEALING("Sealing"),
    @XmlEnumValue("Labeling")
    LABELING("Labeling"),
    @XmlEnumValue("Blending")
    BLENDING("Blending"),
    @XmlEnumValue("Mixing")
    MIXING("Mixing"),
    @XmlEnumValue("Stabilizer")
    STABILIZER("Stabilizer"),
    @XmlEnumValue("Tolerances")
    TOLERANCES("Tolerances");
    private final String value;

    CidxListOperationalInstructionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListOperationalInstructionType fromValue(String v) {
        for (CidxListOperationalInstructionType c: CidxListOperationalInstructionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

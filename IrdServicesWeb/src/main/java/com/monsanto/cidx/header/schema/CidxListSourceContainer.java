
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListSourceContainer.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListSourceContainer">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="SourceBarge"/>
 *     &lt;enumeration value="SourceDrum"/>
 *     &lt;enumeration value="SourceTank"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListSourceContainer")
@XmlEnum
public enum CidxListSourceContainer {

    @XmlEnumValue("SourceBarge")
    SOURCE_BARGE("SourceBarge"),
    @XmlEnumValue("SourceDrum")
    SOURCE_DRUM("SourceDrum"),
    @XmlEnumValue("SourceTank")
    SOURCE_TANK("SourceTank");
    private final String value;

    CidxListSourceContainer(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListSourceContainer fromValue(String v) {
        for (CidxListSourceContainer c: CidxListSourceContainer.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

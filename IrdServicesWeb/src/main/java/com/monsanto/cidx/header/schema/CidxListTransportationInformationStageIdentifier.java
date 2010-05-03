
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListTransportationInformationStageIdentifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListTransportationInformationStageIdentifier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Final"/>
 *     &lt;enumeration value="Main"/>
 *     &lt;enumeration value="Primary"/>
 *     &lt;enumeration value="Secondary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListTransportationInformationStageIdentifier")
@XmlEnum
public enum CidxListTransportationInformationStageIdentifier {

    @XmlEnumValue("Final")
    FINAL("Final"),
    @XmlEnumValue("Main")
    MAIN("Main"),
    @XmlEnumValue("Primary")
    PRIMARY("Primary"),
    @XmlEnumValue("Secondary")
    SECONDARY("Secondary");
    private final String value;

    CidxListTransportationInformationStageIdentifier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListTransportationInformationStageIdentifier fromValue(String v) {
        for (CidxListTransportationInformationStageIdentifier c: CidxListTransportationInformationStageIdentifier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

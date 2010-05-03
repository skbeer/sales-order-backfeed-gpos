
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListProductGroupOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListProductGroupOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="G01"/>
 *     &lt;enumeration value="G02"/>
 *     &lt;enumeration value="G03"/>
 *     &lt;enumeration value="G04"/>
 *     &lt;enumeration value="G05"/>
 *     &lt;enumeration value="G06"/>
 *     &lt;enumeration value="G07"/>
 *     &lt;enumeration value="G08"/>
 *     &lt;enumeration value="G09"/>
 *     &lt;enumeration value="G10"/>
 *     &lt;enumeration value="G11"/>
 *     &lt;enumeration value="G12"/>
 *     &lt;enumeration value="G13"/>
 *     &lt;enumeration value="G14"/>
 *     &lt;enumeration value="G15"/>
 *     &lt;enumeration value="G16"/>
 *     &lt;enumeration value="G17"/>
 *     &lt;enumeration value="G18"/>
 *     &lt;enumeration value="G19"/>
 *     &lt;enumeration value="G20"/>
 *     &lt;enumeration value="G21"/>
 *     &lt;enumeration value="G22"/>
 *     &lt;enumeration value="G23"/>
 *     &lt;enumeration value="G24"/>
 *     &lt;enumeration value="G25"/>
 *     &lt;enumeration value="G26"/>
 *     &lt;enumeration value="G27"/>
 *     &lt;enumeration value="G28"/>
 *     &lt;enumeration value="G29"/>
 *     &lt;enumeration value="G30"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListProductGroupOption")
@XmlEnum
public enum CidxListProductGroupOption {

    @XmlEnumValue("G01")
    G_01("G01"),
    @XmlEnumValue("G02")
    G_02("G02"),
    @XmlEnumValue("G03")
    G_03("G03"),
    @XmlEnumValue("G04")
    G_04("G04"),
    @XmlEnumValue("G05")
    G_05("G05"),
    @XmlEnumValue("G06")
    G_06("G06"),
    @XmlEnumValue("G07")
    G_07("G07"),
    @XmlEnumValue("G08")
    G_08("G08"),
    @XmlEnumValue("G09")
    G_09("G09"),
    @XmlEnumValue("G10")
    G_10("G10"),
    @XmlEnumValue("G11")
    G_11("G11"),
    @XmlEnumValue("G12")
    G_12("G12"),
    @XmlEnumValue("G13")
    G_13("G13"),
    @XmlEnumValue("G14")
    G_14("G14"),
    @XmlEnumValue("G15")
    G_15("G15"),
    @XmlEnumValue("G16")
    G_16("G16"),
    @XmlEnumValue("G17")
    G_17("G17"),
    @XmlEnumValue("G18")
    G_18("G18"),
    @XmlEnumValue("G19")
    G_19("G19"),
    @XmlEnumValue("G20")
    G_20("G20"),
    @XmlEnumValue("G21")
    G_21("G21"),
    @XmlEnumValue("G22")
    G_22("G22"),
    @XmlEnumValue("G23")
    G_23("G23"),
    @XmlEnumValue("G24")
    G_24("G24"),
    @XmlEnumValue("G25")
    G_25("G25"),
    @XmlEnumValue("G26")
    G_26("G26"),
    @XmlEnumValue("G27")
    G_27("G27"),
    @XmlEnumValue("G28")
    G_28("G28"),
    @XmlEnumValue("G29")
    G_29("G29"),
    @XmlEnumValue("G30")
    G_30("G30");
    private final String value;

    CidxListProductGroupOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListProductGroupOption fromValue(String v) {
        for (CidxListProductGroupOption c: CidxListProductGroupOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

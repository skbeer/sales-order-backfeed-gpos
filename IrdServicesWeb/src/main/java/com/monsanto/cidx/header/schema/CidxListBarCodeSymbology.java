
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListBarCodeSymbology.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListBarCodeSymbology">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="ANSI-MH10.8.2"/>
 *     &lt;enumeration value="Codabar"/>
 *     &lt;enumeration value="Code128"/>
 *     &lt;enumeration value="Code-3-of-9"/>
 *     &lt;enumeration value="Code39"/>
 *     &lt;enumeration value="Code49"/>
 *     &lt;enumeration value="Code93"/>
 *     &lt;enumeration value="DUN-14"/>
 *     &lt;enumeration value="EAN"/>
 *     &lt;enumeration value="GTIN"/>
 *     &lt;enumeration value="Interleaved-2-of-5"/>
 *     &lt;enumeration value="ISO-TC-122"/>
 *     &lt;enumeration value="ITF-14"/>
 *     &lt;enumeration value="MicroPDF417"/>
 *     &lt;enumeration value="MSI"/>
 *     &lt;enumeration value="SCC-14"/>
 *     &lt;enumeration value="SSCC-18"/>
 *     &lt;enumeration value="UCC-EAN-128"/>
 *     &lt;enumeration value="UPC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListBarCodeSymbology")
@XmlEnum
public enum CidxListBarCodeSymbology {

    @XmlEnumValue("ANSI-MH10.8.2")
    ANSI_MH_10_8_2("ANSI-MH10.8.2"),
    @XmlEnumValue("Codabar")
    CODABAR("Codabar"),
    @XmlEnumValue("Code128")
    CODE_128("Code128"),
    @XmlEnumValue("Code-3-of-9")
    CODE_3_OF_9("Code-3-of-9"),
    @XmlEnumValue("Code39")
    CODE_39("Code39"),
    @XmlEnumValue("Code49")
    CODE_49("Code49"),
    @XmlEnumValue("Code93")
    CODE_93("Code93"),
    @XmlEnumValue("DUN-14")
    DUN_14("DUN-14"),
    EAN("EAN"),
    GTIN("GTIN"),
    @XmlEnumValue("Interleaved-2-of-5")
    INTERLEAVED_2_OF_5("Interleaved-2-of-5"),
    @XmlEnumValue("ISO-TC-122")
    ISO_TC_122("ISO-TC-122"),
    @XmlEnumValue("ITF-14")
    ITF_14("ITF-14"),
    @XmlEnumValue("MicroPDF417")
    MICRO_PDF_417("MicroPDF417"),
    MSI("MSI"),
    @XmlEnumValue("SCC-14")
    SCC_14("SCC-14"),
    @XmlEnumValue("SSCC-18")
    SSCC_18("SSCC-18"),
    @XmlEnumValue("UCC-EAN-128")
    UCC_EAN_128("UCC-EAN-128"),
    UPC("UPC");
    private final String value;

    CidxListBarCodeSymbology(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListBarCodeSymbology fromValue(String v) {
        for (CidxListBarCodeSymbology c: CidxListBarCodeSymbology.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

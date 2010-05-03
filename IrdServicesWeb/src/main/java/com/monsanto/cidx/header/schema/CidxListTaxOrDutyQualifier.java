
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListTaxOrDutyQualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListTaxOrDutyQualifier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="VAT"/>
 *     &lt;enumeration value="Duty"/>
 *     &lt;enumeration value="Fee"/>
 *     &lt;enumeration value="Tax"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListTaxOrDutyQualifier")
@XmlEnum
public enum CidxListTaxOrDutyQualifier {

    VAT("VAT"),
    @XmlEnumValue("Duty")
    DUTY("Duty"),
    @XmlEnumValue("Fee")
    FEE("Fee"),
    @XmlEnumValue("Tax")
    TAX("Tax");
    private final String value;

    CidxListTaxOrDutyQualifier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListTaxOrDutyQualifier fromValue(String v) {
        for (CidxListTaxOrDutyQualifier c: CidxListTaxOrDutyQualifier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

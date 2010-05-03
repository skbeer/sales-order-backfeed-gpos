
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Divide"/>
 *     &lt;enumeration value="Multiply"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListOperator")
@XmlEnum
public enum CidxListOperator {

    @XmlEnumValue("Divide")
    DIVIDE("Divide"),
    @XmlEnumValue("Multiply")
    MULTIPLY("Multiply");
    private final String value;

    CidxListOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListOperator fromValue(String v) {
        for (CidxListOperator c: CidxListOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

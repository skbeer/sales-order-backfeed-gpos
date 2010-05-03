
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListQuantativeResultLimitAssignment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListQuantativeResultLimitAssignment">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Customer"/>
 *     &lt;enumeration value="Supplier"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListQuantativeResultLimitAssignment")
@XmlEnum
public enum CidxListQuantativeResultLimitAssignment {

    @XmlEnumValue("Customer")
    CUSTOMER("Customer"),
    @XmlEnumValue("Supplier")
    SUPPLIER("Supplier");
    private final String value;

    CidxListQuantativeResultLimitAssignment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListQuantativeResultLimitAssignment fromValue(String v) {
        for (CidxListQuantativeResultLimitAssignment c: CidxListQuantativeResultLimitAssignment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

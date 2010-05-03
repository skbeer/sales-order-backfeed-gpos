
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListSaleOrReturnType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListSaleOrReturnType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="EndUser"/>
 *     &lt;enumeration value="Wholesale"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListSaleOrReturnType")
@XmlEnum
public enum CidxListSaleOrReturnType {

    @XmlEnumValue("EndUser")
    END_USER("EndUser"),
    @XmlEnumValue("Wholesale")
    WHOLESALE("Wholesale");
    private final String value;

    CidxListSaleOrReturnType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListSaleOrReturnType fromValue(String v) {
        for (CidxListSaleOrReturnType c: CidxListSaleOrReturnType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListDiscountDeferredIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListDiscountDeferredIndicator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Base"/>
 *     &lt;enumeration value="Deferred"/>
 *     &lt;enumeration value="Discount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListDiscountDeferredIndicator")
@XmlEnum
public enum CidxListDiscountDeferredIndicator {

    @XmlEnumValue("Base")
    BASE("Base"),
    @XmlEnumValue("Deferred")
    DEFERRED("Deferred"),
    @XmlEnumValue("Discount")
    DISCOUNT("Discount");
    private final String value;

    CidxListDiscountDeferredIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListDiscountDeferredIndicator fromValue(String v) {
        for (CidxListDiscountDeferredIndicator c: CidxListDiscountDeferredIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

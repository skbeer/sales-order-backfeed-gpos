
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListPostingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListPostingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Buy"/>
 *     &lt;enumeration value="Sell"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListPostingType")
@XmlEnum
public enum CidxListPostingType {

    @XmlEnumValue("Buy")
    BUY("Buy"),
    @XmlEnumValue("Sell")
    SELL("Sell");
    private final String value;

    CidxListPostingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListPostingType fromValue(String v) {
        for (CidxListPostingType c: CidxListPostingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

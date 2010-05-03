
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListMarketingName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListMarketingName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="RegisteredTradeMark"/>
 *     &lt;enumeration value="RegisteredTradeName"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListMarketingName")
@XmlEnum
public enum CidxListMarketingName {

    @XmlEnumValue("RegisteredTradeMark")
    REGISTERED_TRADE_MARK("RegisteredTradeMark"),
    @XmlEnumValue("RegisteredTradeName")
    REGISTERED_TRADE_NAME("RegisteredTradeName");
    private final String value;

    CidxListMarketingName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListMarketingName fromValue(String v) {
        for (CidxListMarketingName c: CidxListMarketingName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

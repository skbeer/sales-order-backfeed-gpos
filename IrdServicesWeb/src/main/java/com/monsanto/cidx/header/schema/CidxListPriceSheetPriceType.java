
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListPriceSheetPriceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListPriceSheetPriceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Manufacturer Price"/>
 *     &lt;enumeration value="Suggested Dealer or Retailer Price"/>
 *     &lt;enumeration value="Suggested Grower or End User Price"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListPriceSheetPriceType")
@XmlEnum
public enum CidxListPriceSheetPriceType {

    @XmlEnumValue("Manufacturer Price")
    MANUFACTURER_PRICE("Manufacturer Price"),
    @XmlEnumValue("Suggested Dealer or Retailer Price")
    SUGGESTED_DEALER_OR_RETAILER_PRICE("Suggested Dealer or Retailer Price"),
    @XmlEnumValue("Suggested Grower or End User Price")
    SUGGESTED_GROWER_OR_END_USER_PRICE("Suggested Grower or End User Price");
    private final String value;

    CidxListPriceSheetPriceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListPriceSheetPriceType fromValue(String v) {
        for (CidxListPriceSheetPriceType c: CidxListPriceSheetPriceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

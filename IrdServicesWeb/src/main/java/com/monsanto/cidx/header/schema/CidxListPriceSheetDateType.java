
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListPriceSheetDateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListPriceSheetDateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="DeliveryDate"/>
 *     &lt;enumeration value="InvoiceDate"/>
 *     &lt;enumeration value="OrderDate"/>
 *     &lt;enumeration value="ShipDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListPriceSheetDateType")
@XmlEnum
public enum CidxListPriceSheetDateType {

    @XmlEnumValue("DeliveryDate")
    DELIVERY_DATE("DeliveryDate"),
    @XmlEnumValue("InvoiceDate")
    INVOICE_DATE("InvoiceDate"),
    @XmlEnumValue("OrderDate")
    ORDER_DATE("OrderDate"),
    @XmlEnumValue("ShipDate")
    SHIP_DATE("ShipDate");
    private final String value;

    CidxListPriceSheetDateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListPriceSheetDateType fromValue(String v) {
        for (CidxListPriceSheetDateType c: CidxListPriceSheetDateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

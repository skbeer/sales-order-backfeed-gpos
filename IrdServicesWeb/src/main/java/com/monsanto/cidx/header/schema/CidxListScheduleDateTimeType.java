
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListScheduleDateTimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListScheduleDateTimeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="ConfirmDelivery"/>
 *     &lt;enumeration value="ConfirmPickup"/>
 *     &lt;enumeration value="ConfirmShip"/>
 *     &lt;enumeration value="RequestedDelivery"/>
 *     &lt;enumeration value="RequestedPickup"/>
 *     &lt;enumeration value="RequestedShip"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListScheduleDateTimeType")
@XmlEnum
public enum CidxListScheduleDateTimeType {

    @XmlEnumValue("ConfirmDelivery")
    CONFIRM_DELIVERY("ConfirmDelivery"),
    @XmlEnumValue("ConfirmPickup")
    CONFIRM_PICKUP("ConfirmPickup"),
    @XmlEnumValue("ConfirmShip")
    CONFIRM_SHIP("ConfirmShip"),
    @XmlEnumValue("RequestedDelivery")
    REQUESTED_DELIVERY("RequestedDelivery"),
    @XmlEnumValue("RequestedPickup")
    REQUESTED_PICKUP("RequestedPickup"),
    @XmlEnumValue("RequestedShip")
    REQUESTED_SHIP("RequestedShip");
    private final String value;

    CidxListScheduleDateTimeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListScheduleDateTimeType fromValue(String v) {
        for (CidxListScheduleDateTimeType c: CidxListScheduleDateTimeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

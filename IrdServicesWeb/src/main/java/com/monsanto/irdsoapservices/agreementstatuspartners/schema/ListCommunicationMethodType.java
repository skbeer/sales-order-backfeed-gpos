
package com.monsanto.irdsoapservices.agreementstatuspartners.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListCommunicationMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListCommunicationMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="CellPhone"/>
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="PrinterId"/>
 *     &lt;enumeration value="StationCode"/>
 *     &lt;enumeration value="Telex"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListCommunicationMethodType")
@XmlEnum
public enum ListCommunicationMethodType {

    @XmlEnumValue("CellPhone")
    CELL_PHONE("CellPhone"),
    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("PrinterId")
    PRINTER_ID("PrinterId"),
    @XmlEnumValue("StationCode")
    STATION_CODE("StationCode"),
    @XmlEnumValue("Telex")
    TELEX("Telex");
    private final String value;

    ListCommunicationMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListCommunicationMethodType fromValue(String v) {
        for (ListCommunicationMethodType c: ListCommunicationMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

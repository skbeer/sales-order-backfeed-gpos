
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListRFQDeliveryMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListRFQDeliveryMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="EDI"/>
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="IPAddress"/>
 *     &lt;enumeration value="Mail"/>
 *     &lt;enumeration value="Telephone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListRFQDeliveryMethod")
@XmlEnum
public enum CidxListRFQDeliveryMethod {

    EDI("EDI"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("IPAddress")
    IP_ADDRESS("IPAddress"),
    @XmlEnumValue("Mail")
    MAIL("Mail"),
    @XmlEnumValue("Telephone")
    TELEPHONE("Telephone");
    private final String value;

    CidxListRFQDeliveryMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListRFQDeliveryMethod fromValue(String v) {
        for (CidxListRFQDeliveryMethod c: CidxListRFQDeliveryMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

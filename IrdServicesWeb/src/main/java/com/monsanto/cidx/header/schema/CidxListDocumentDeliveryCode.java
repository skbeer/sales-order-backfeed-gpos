
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListDocumentDeliveryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListDocumentDeliveryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="Mail"/>
 *     &lt;enumeration value="Print"/>
 *     &lt;enumeration value="Telex"/>
 *     &lt;enumeration value="WithDriver"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListDocumentDeliveryCode")
@XmlEnum
public enum CidxListDocumentDeliveryCode {

    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("Mail")
    MAIL("Mail"),
    @XmlEnumValue("Print")
    PRINT("Print"),
    @XmlEnumValue("Telex")
    TELEX("Telex"),
    @XmlEnumValue("WithDriver")
    WITH_DRIVER("WithDriver");
    private final String value;

    CidxListDocumentDeliveryCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListDocumentDeliveryCode fromValue(String v) {
        for (CidxListDocumentDeliveryCode c: CidxListDocumentDeliveryCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

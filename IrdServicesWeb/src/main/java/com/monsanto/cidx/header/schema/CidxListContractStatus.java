
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListContractStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListContractStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="Open"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListContractStatus")
@XmlEnum
public enum CidxListContractStatus {

    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Open")
    OPEN("Open");
    private final String value;

    CidxListContractStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListContractStatus fromValue(String v) {
        for (CidxListContractStatus c: CidxListContractStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

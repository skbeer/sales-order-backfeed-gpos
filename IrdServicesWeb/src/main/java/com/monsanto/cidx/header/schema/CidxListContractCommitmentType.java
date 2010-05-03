
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListContractCommitmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListContractCommitmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Committed"/>
 *     &lt;enumeration value="Open"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListContractCommitmentType")
@XmlEnum
public enum CidxListContractCommitmentType {

    @XmlEnumValue("Committed")
    COMMITTED("Committed"),
    @XmlEnumValue("Open")
    OPEN("Open");
    private final String value;

    CidxListContractCommitmentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListContractCommitmentType fromValue(String v) {
        for (CidxListContractCommitmentType c: CidxListContractCommitmentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

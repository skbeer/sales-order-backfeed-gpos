
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListContractTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListContractTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Basic"/>
 *     &lt;enumeration value="Mode"/>
 *     &lt;enumeration value="Prepaid"/>
 *     &lt;enumeration value="Quantity"/>
 *     &lt;enumeration value="Service"/>
 *     &lt;enumeration value="Value"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListContractTypeCode")
@XmlEnum
public enum CidxListContractTypeCode {

    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("Mode")
    MODE("Mode"),
    @XmlEnumValue("Prepaid")
    PREPAID("Prepaid"),
    @XmlEnumValue("Quantity")
    QUANTITY("Quantity"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Value")
    VALUE("Value");
    private final String value;

    CidxListContractTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListContractTypeCode fromValue(String v) {
        for (CidxListContractTypeCode c: CidxListContractTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListEUSubstanceNumberDomain.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListEUSubstanceNumberDomain">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="EINECS"/>
 *     &lt;enumeration value="ELINCS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListEUSubstanceNumberDomain")
@XmlEnum
public enum CidxListEUSubstanceNumberDomain {

    EINECS,
    ELINCS;

    public String value() {
        return name();
    }

    public static CidxListEUSubstanceNumberDomain fromValue(String v) {
        return valueOf(v);
    }

}

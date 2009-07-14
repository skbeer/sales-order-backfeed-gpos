
package com.monsanto.irdsoapservices.agreements.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountTypeAttribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountTypeAttribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="ACCTID"/>
 *     &lt;enumeration value="ASTA"/>
 *     &lt;enumeration value="BUSID"/>
 *     &lt;enumeration value="CONTID"/>
 *     &lt;enumeration value="DAIRY"/>
 *     &lt;enumeration value="FJ"/>
 *     &lt;enumeration value="FMID"/>
 *     &lt;enumeration value="FP"/>
 *     &lt;enumeration value="GLN"/>
 *     &lt;enumeration value="IC"/>
 *     &lt;enumeration value="INTER"/>
 *     &lt;enumeration value="LOLPRP"/>
 *     &lt;enumeration value="METER"/>
 *     &lt;enumeration value="NAPD"/>
 *     &lt;enumeration value="PROPID"/>
 *     &lt;enumeration value="SAP"/>
 *     &lt;enumeration value="SAPPLT"/>
 *     &lt;enumeration value="SAPSHP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountTypeAttribute")
@XmlEnum
public enum AccountTypeAttribute {

    ACCTID,
    ASTA,
    BUSID,
    CONTID,
    DAIRY,
    FJ,
    FMID,
    FP,
    GLN,
    IC,
    INTER,
    LOLPRP,
    METER,
    NAPD,
    PROPID,
    SAP,
    SAPPLT,
    SAPSHP;

    public String value() {
        return name();
    }

    public static AccountTypeAttribute fromValue(String v) {
        return valueOf(v);
    }

}


package com.monsanto.commercial.growercreditlist.gen.creditinfo.header;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartnerTypeAttribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartnerTypeAttribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="EBID"/>
 *     &lt;enumeration value="ACCT_ID"/>
 *     &lt;enumeration value="SAP_ID"/>
 *     &lt;enumeration value="USER_ID"/>
 *     &lt;enumeration value="GLN"/>
 *     &lt;enumeration value="AssignedBySeller"/>
 *     &lt;enumeration value="AssignedByBuyer"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PartnerTypeAttribute")
@XmlEnum
public enum PartnerTypeAttribute {

    EBID("EBID"),
    ACCT_ID("ACCT_ID"),
    SAP_ID("SAP_ID"),
    USER_ID("USER_ID"),
    GLN("GLN"),
    @XmlEnumValue("AssignedBySeller")
    ASSIGNED_BY_SELLER("AssignedBySeller"),
    @XmlEnumValue("AssignedByBuyer")
    ASSIGNED_BY_BUYER("AssignedByBuyer"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PartnerTypeAttribute(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PartnerTypeAttribute fromValue(String v) {
        for (PartnerTypeAttribute c: PartnerTypeAttribute.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.monsanto.irdsoapservices.agreementstatus.schema.response;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListPartnerAgencyAttribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListPartnerAgencyAttribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="AGIIS-EBID"/>
 *     &lt;enumeration value="AGIIS-NAPD"/>
 *     &lt;enumeration value="AssignedByBuyer"/>
 *     &lt;enumeration value="AssignedByPapiNet"/>
 *     &lt;enumeration value="AssignedBySeller"/>
 *     &lt;enumeration value="AssignedByTestingLaboratory"/>
 *     &lt;enumeration value="D-U-N-S"/>
 *     &lt;enumeration value="EAN"/>
 *     &lt;enumeration value="GLN"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="SCAC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListPartnerAgencyAttribute")
@XmlEnum
public enum ListPartnerAgencyAttribute {

    @XmlEnumValue("AGIIS-EBID")
    AGIIS_EBID("AGIIS-EBID"),
    @XmlEnumValue("AGIIS-NAPD")
    AGIIS_NAPD("AGIIS-NAPD"),
    @XmlEnumValue("AssignedByBuyer")
    ASSIGNED_BY_BUYER("AssignedByBuyer"),
    @XmlEnumValue("AssignedByPapiNet")
    ASSIGNED_BY_PAPI_NET("AssignedByPapiNet"),
    @XmlEnumValue("AssignedBySeller")
    ASSIGNED_BY_SELLER("AssignedBySeller"),
    @XmlEnumValue("AssignedByTestingLaboratory")
    ASSIGNED_BY_TESTING_LABORATORY("AssignedByTestingLaboratory"),
    @XmlEnumValue("D-U-N-S")
    D_U_N_S("D-U-N-S"),
    EAN("EAN"),
    GLN("GLN"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    SCAC("SCAC");
    private final String value;

    ListPartnerAgencyAttribute(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListPartnerAgencyAttribute fromValue(String v) {
        for (ListPartnerAgencyAttribute c: ListPartnerAgencyAttribute.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListProductIDAgency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListProductIDAgency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="AGIIS-ProductID"/>
 *     &lt;enumeration value="ANSI"/>
 *     &lt;enumeration value="AssignedByBuyer"/>
 *     &lt;enumeration value="AssignedByManufacturer"/>
 *     &lt;enumeration value="AssignedBySeller"/>
 *     &lt;enumeration value="EAN"/>
 *     &lt;enumeration value="EDIFACT"/>
 *     &lt;enumeration value="GBABA"/>
 *     &lt;enumeration value="ISO"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="UPC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListProductIDAgency")
@XmlEnum
public enum CidxListProductIDAgency {

    @XmlEnumValue("AGIIS-ProductID")
    AGIIS_PRODUCT_ID("AGIIS-ProductID"),
    ANSI("ANSI"),
    @XmlEnumValue("AssignedByBuyer")
    ASSIGNED_BY_BUYER("AssignedByBuyer"),
    @XmlEnumValue("AssignedByManufacturer")
    ASSIGNED_BY_MANUFACTURER("AssignedByManufacturer"),
    @XmlEnumValue("AssignedBySeller")
    ASSIGNED_BY_SELLER("AssignedBySeller"),
    EAN("EAN"),
    EDIFACT("EDIFACT"),
    GBABA("GBABA"),
    ISO("ISO"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    UPC("UPC");
    private final String value;

    CidxListProductIDAgency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListProductIDAgency fromValue(String v) {
        for (CidxListProductIDAgency c: CidxListProductIDAgency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
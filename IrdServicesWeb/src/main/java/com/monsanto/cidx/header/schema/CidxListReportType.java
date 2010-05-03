
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListReportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListReportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="AgencyReport"/>
 *     &lt;enumeration value="ProductTransferReport"/>
 *     &lt;enumeration value="SalesReport"/>
 *     &lt;enumeration value="SummaryReport"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListReportType")
@XmlEnum
public enum CidxListReportType {

    @XmlEnumValue("AgencyReport")
    AGENCY_REPORT("AgencyReport"),
    @XmlEnumValue("ProductTransferReport")
    PRODUCT_TRANSFER_REPORT("ProductTransferReport"),
    @XmlEnumValue("SalesReport")
    SALES_REPORT("SalesReport"),
    @XmlEnumValue("SummaryReport")
    SUMMARY_REPORT("SummaryReport");
    private final String value;

    CidxListReportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListReportType fromValue(String v) {
        for (CidxListReportType c: CidxListReportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.monsanto.irdsoapservices.datasummary.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListDataVerificationCheckpointAttribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListDataVerificationCheckpointAttribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="InvoiceCount"/>
 *     &lt;enumeration value="InvoiceLineItemCount"/>
 *     &lt;enumeration value="TotalQuantityEquivalent"/>
 *     &lt;enumeration value="TotalDealerCount"/>
 *     &lt;enumeration value="TotalDistinctProductCount"/>
 *     &lt;enumeration value="TotalGrowerCount"/>
 *     &lt;enumeration value="TotalDailyOpenInvoices"/>
 *     &lt;enumeration value="TotalDailyClosedInvoices"/>
 *     &lt;enumeration value="TotalOpenInvoices"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListDataVerificationCheckpointAttribute")
@XmlEnum
public enum ListDataVerificationCheckpointAttribute {

    @XmlEnumValue("InvoiceCount")
    INVOICE_COUNT("InvoiceCount"),
    @XmlEnumValue("InvoiceLineItemCount")
    INVOICE_LINE_ITEM_COUNT("InvoiceLineItemCount"),
    @XmlEnumValue("TotalQuantityEquivalent")
    TOTAL_QUANTITY_EQUIVALENT("TotalQuantityEquivalent"),
    @XmlEnumValue("TotalDealerCount")
    TOTAL_DEALER_COUNT("TotalDealerCount"),
    @XmlEnumValue("TotalDistinctProductCount")
    TOTAL_DISTINCT_PRODUCT_COUNT("TotalDistinctProductCount"),
    @XmlEnumValue("TotalGrowerCount")
    TOTAL_GROWER_COUNT("TotalGrowerCount"),
    @XmlEnumValue("TotalDailyOpenInvoices")
    TOTAL_DAILY_OPEN_INVOICES("TotalDailyOpenInvoices"),
    @XmlEnumValue("TotalDailyClosedInvoices")
    TOTAL_DAILY_CLOSED_INVOICES("TotalDailyClosedInvoices"),
    @XmlEnumValue("TotalOpenInvoices")
    TOTAL_OPEN_INVOICES("TotalOpenInvoices");
    private final String value;

    ListDataVerificationCheckpointAttribute(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListDataVerificationCheckpointAttribute fromValue(String v) {
        for (ListDataVerificationCheckpointAttribute c: ListDataVerificationCheckpointAttribute.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

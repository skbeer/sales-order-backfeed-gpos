
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListInvoiceQualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListInvoiceQualifier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Original"/>
 *     &lt;enumeration value="Copy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListInvoiceQualifier")
@XmlEnum
public enum CidxListInvoiceQualifier {

    @XmlEnumValue("Original")
    ORIGINAL("Original"),
    @XmlEnumValue("Copy")
    COPY("Copy");
    private final String value;

    CidxListInvoiceQualifier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListInvoiceQualifier fromValue(String v) {
        for (CidxListInvoiceQualifier c: CidxListInvoiceQualifier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

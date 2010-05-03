
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListContractPaymentTermsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListContractPaymentTermsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="OrderPayment"/>
 *     &lt;enumeration value="PrepaidInvoice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListContractPaymentTermsType")
@XmlEnum
public enum CidxListContractPaymentTermsType {

    @XmlEnumValue("OrderPayment")
    ORDER_PAYMENT("OrderPayment"),
    @XmlEnumValue("PrepaidInvoice")
    PREPAID_INVOICE("PrepaidInvoice");
    private final String value;

    CidxListContractPaymentTermsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListContractPaymentTermsType fromValue(String v) {
        for (CidxListContractPaymentTermsType c: CidxListContractPaymentTermsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

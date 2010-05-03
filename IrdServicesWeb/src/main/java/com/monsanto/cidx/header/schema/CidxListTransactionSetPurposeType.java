
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListTransactionSetPurposeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListTransactionSetPurposeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="FullRefresh"/>
 *     &lt;enumeration value="ChangesOnly"/>
 *     &lt;enumeration value="SelectedChanges"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListTransactionSetPurposeType")
@XmlEnum
public enum CidxListTransactionSetPurposeType {

    @XmlEnumValue("FullRefresh")
    FULL_REFRESH("FullRefresh"),
    @XmlEnumValue("ChangesOnly")
    CHANGES_ONLY("ChangesOnly"),
    @XmlEnumValue("SelectedChanges")
    SELECTED_CHANGES("SelectedChanges");
    private final String value;

    CidxListTransactionSetPurposeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListTransactionSetPurposeType fromValue(String v) {
        for (CidxListTransactionSetPurposeType c: CidxListTransactionSetPurposeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

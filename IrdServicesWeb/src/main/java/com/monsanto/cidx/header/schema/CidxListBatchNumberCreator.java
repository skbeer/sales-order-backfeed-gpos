
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListBatchNumberCreator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListBatchNumberCreator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Manufacturer"/>
 *     &lt;enumeration value="Seller"/>
 *     &lt;enumeration value="TestingLaboratory"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListBatchNumberCreator")
@XmlEnum
public enum CidxListBatchNumberCreator {

    @XmlEnumValue("Manufacturer")
    MANUFACTURER("Manufacturer"),
    @XmlEnumValue("Seller")
    SELLER("Seller"),
    @XmlEnumValue("TestingLaboratory")
    TESTING_LABORATORY("TestingLaboratory");
    private final String value;

    CidxListBatchNumberCreator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListBatchNumberCreator fromValue(String v) {
        for (CidxListBatchNumberCreator c: CidxListBatchNumberCreator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListProductAttributeNameAgency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListProductAttributeNameAgency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="AGIISProductDirectory"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListProductAttributeNameAgency")
@XmlEnum
public enum CidxListProductAttributeNameAgency {

    @XmlEnumValue("AGIISProductDirectory")
    AGIIS_PRODUCT_DIRECTORY("AGIISProductDirectory"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CidxListProductAttributeNameAgency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListProductAttributeNameAgency fromValue(String v) {
        for (CidxListProductAttributeNameAgency c: CidxListProductAttributeNameAgency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

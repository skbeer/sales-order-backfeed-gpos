
package com.monsanto.irdsoapservices.agreements.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgreementCategoryNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgreementCategoryNameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="MONSANTO_TRAIT_AGREEMENT"/>
 *     &lt;enumeration value="COMMERCIAL_AGREEMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgreementCategoryNameType")
@XmlEnum
public enum AgreementCategoryNameType {

    MONSANTO_TRAIT_AGREEMENT,
    COMMERCIAL_AGREEMENT;

    public String value() {
        return name();
    }

    public static AgreementCategoryNameType fromValue(String v) {
        return valueOf(v);
    }

}

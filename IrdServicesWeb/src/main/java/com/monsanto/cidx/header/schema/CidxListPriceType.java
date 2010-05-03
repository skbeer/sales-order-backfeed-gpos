
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListPriceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListPriceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="DiscountPerUnit"/>
 *     &lt;enumeration value="FOBPrice"/>
 *     &lt;enumeration value="FreightAllowance"/>
 *     &lt;enumeration value="FreightCost"/>
 *     &lt;enumeration value="FreightInsurance"/>
 *     &lt;enumeration value="GeneralAllowance"/>
 *     &lt;enumeration value="GrossPrice"/>
 *     &lt;enumeration value="Manufacturer"/>
 *     &lt;enumeration value="NetPrice"/>
 *     &lt;enumeration value="NetPriceIncludingTax"/>
 *     &lt;enumeration value="PackageCosts"/>
 *     &lt;enumeration value="SuggestedDealerOrRetailerPrice"/>
 *     &lt;enumeration value="SuggestedGrowerOrEndUserPrice"/>
 *     &lt;enumeration value="Taxes"/>
 *     &lt;enumeration value="UpchargePerUnit"/>
 *     &lt;enumeration value="VATTax"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListPriceType")
@XmlEnum
public enum CidxListPriceType {

    @XmlEnumValue("DiscountPerUnit")
    DISCOUNT_PER_UNIT("DiscountPerUnit"),
    @XmlEnumValue("FOBPrice")
    FOB_PRICE("FOBPrice"),
    @XmlEnumValue("FreightAllowance")
    FREIGHT_ALLOWANCE("FreightAllowance"),
    @XmlEnumValue("FreightCost")
    FREIGHT_COST("FreightCost"),
    @XmlEnumValue("FreightInsurance")
    FREIGHT_INSURANCE("FreightInsurance"),
    @XmlEnumValue("GeneralAllowance")
    GENERAL_ALLOWANCE("GeneralAllowance"),
    @XmlEnumValue("GrossPrice")
    GROSS_PRICE("GrossPrice"),
    @XmlEnumValue("Manufacturer")
    MANUFACTURER("Manufacturer"),
    @XmlEnumValue("NetPrice")
    NET_PRICE("NetPrice"),
    @XmlEnumValue("NetPriceIncludingTax")
    NET_PRICE_INCLUDING_TAX("NetPriceIncludingTax"),
    @XmlEnumValue("PackageCosts")
    PACKAGE_COSTS("PackageCosts"),
    @XmlEnumValue("SuggestedDealerOrRetailerPrice")
    SUGGESTED_DEALER_OR_RETAILER_PRICE("SuggestedDealerOrRetailerPrice"),
    @XmlEnumValue("SuggestedGrowerOrEndUserPrice")
    SUGGESTED_GROWER_OR_END_USER_PRICE("SuggestedGrowerOrEndUserPrice"),
    @XmlEnumValue("Taxes")
    TAXES("Taxes"),
    @XmlEnumValue("UpchargePerUnit")
    UPCHARGE_PER_UNIT("UpchargePerUnit"),
    @XmlEnumValue("VATTax")
    VAT_TAX("VATTax");
    private final String value;

    CidxListPriceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListPriceType fromValue(String v) {
        for (CidxListPriceType c: CidxListPriceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

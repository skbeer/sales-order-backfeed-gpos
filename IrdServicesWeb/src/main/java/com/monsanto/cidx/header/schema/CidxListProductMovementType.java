
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListProductMovementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListProductMovementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Consignment"/>
 *     &lt;enumeration value="ConsignmentReturn"/>
 *     &lt;enumeration value="DropShipSale"/>
 *     &lt;enumeration value="FreeOfCharge"/>
 *     &lt;enumeration value="IntraCompanyTransferIn"/>
 *     &lt;enumeration value="IntraCompanyTransferOut"/>
 *     &lt;enumeration value="InventoryAdjustment"/>
 *     &lt;enumeration value="PriceAdjustment"/>
 *     &lt;enumeration value="Return"/>
 *     &lt;enumeration value="ShipAndDebitSale"/>
 *     &lt;enumeration value="StockSale"/>
 *     &lt;enumeration value="SummaryReport"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListProductMovementType")
@XmlEnum
public enum CidxListProductMovementType {

    @XmlEnumValue("Consignment")
    CONSIGNMENT("Consignment"),
    @XmlEnumValue("ConsignmentReturn")
    CONSIGNMENT_RETURN("ConsignmentReturn"),
    @XmlEnumValue("DropShipSale")
    DROP_SHIP_SALE("DropShipSale"),
    @XmlEnumValue("FreeOfCharge")
    FREE_OF_CHARGE("FreeOfCharge"),
    @XmlEnumValue("IntraCompanyTransferIn")
    INTRA_COMPANY_TRANSFER_IN("IntraCompanyTransferIn"),
    @XmlEnumValue("IntraCompanyTransferOut")
    INTRA_COMPANY_TRANSFER_OUT("IntraCompanyTransferOut"),
    @XmlEnumValue("InventoryAdjustment")
    INVENTORY_ADJUSTMENT("InventoryAdjustment"),
    @XmlEnumValue("PriceAdjustment")
    PRICE_ADJUSTMENT("PriceAdjustment"),
    @XmlEnumValue("Return")
    RETURN("Return"),
    @XmlEnumValue("ShipAndDebitSale")
    SHIP_AND_DEBIT_SALE("ShipAndDebitSale"),
    @XmlEnumValue("StockSale")
    STOCK_SALE("StockSale"),
    @XmlEnumValue("SummaryReport")
    SUMMARY_REPORT("SummaryReport");
    private final String value;

    CidxListProductMovementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListProductMovementType fromValue(String v) {
        for (CidxListProductMovementType c: CidxListProductMovementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

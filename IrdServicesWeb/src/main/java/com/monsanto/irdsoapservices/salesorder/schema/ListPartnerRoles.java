
package com.monsanto.irdsoapservices.salesorder.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListPartnerRoles.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListPartnerRoles">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="AdditionalCarrier"/>
 *     &lt;enumeration value="AgencyOrDealer"/>
 *     &lt;enumeration value="AlternateCarrier"/>
 *     &lt;enumeration value="Bank"/>
 *     &lt;enumeration value="BeneficialOwner"/>
 *     &lt;enumeration value="BillToParty"/>
 *     &lt;enumeration value="Buyer"/>
 *     &lt;enumeration value="CareOfParty"/>
 *     &lt;enumeration value="Carrier"/>
 *     &lt;enumeration value="CarrierToExclude"/>
 *     &lt;enumeration value="CommodityBroker"/>
 *     &lt;enumeration value="Consignee"/>
 *     &lt;enumeration value="Customs"/>
 *     &lt;enumeration value="CustomsBroker"/>
 *     &lt;enumeration value="CustomsClearance"/>
 *     &lt;enumeration value="Distributor"/>
 *     &lt;enumeration value="EndUseCustomer"/>
 *     &lt;enumeration value="FinancialInstitution"/>
 *     &lt;enumeration value="FreightForwarder"/>
 *     &lt;enumeration value="HazmatOfficer"/>
 *     &lt;enumeration value="IntermediateCarrier"/>
 *     &lt;enumeration value="Inspection"/>
 *     &lt;enumeration value="LetterOfCreditBank"/>
 *     &lt;enumeration value="ManagingEntity"/>
 *     &lt;enumeration value="Manufacturer"/>
 *     &lt;enumeration value="Marketplace"/>
 *     &lt;enumeration value="NotifyParty"/>
 *     &lt;enumeration value="Payer"/>
 *     &lt;enumeration value="PricingSource"/>
 *     &lt;enumeration value="RebateReceiver"/>
 *     &lt;enumeration value="Receiver"/>
 *     &lt;enumeration value="RemitTo"/>
 *     &lt;enumeration value="Scales"/>
 *     &lt;enumeration value="Seller"/>
 *     &lt;enumeration value="SellingPartner"/>
 *     &lt;enumeration value="Sender"/>
 *     &lt;enumeration value="Shipper"/>
 *     &lt;enumeration value="ShipFrom"/>
 *     &lt;enumeration value="ShipTo"/>
 *     &lt;enumeration value="SoldTo"/>
 *     &lt;enumeration value="SplitBillingPartner"/>
 *     &lt;enumeration value="Supplier"/>
 *     &lt;enumeration value="Surveyor"/>
 *     &lt;enumeration value="TaxAuthority"/>
 *     &lt;enumeration value="TaxRepresentative"/>
 *     &lt;enumeration value="ThirdPartyFreightPayer"/>
 *     &lt;enumeration value="ThirdPartyLogistics"/>
 *     &lt;enumeration value="TransportationBroker"/>
 *     &lt;enumeration value="UltimateConsignee"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListPartnerRoles")
@XmlEnum
public enum ListPartnerRoles {

    @XmlEnumValue("AdditionalCarrier")
    ADDITIONAL_CARRIER("AdditionalCarrier"),
    @XmlEnumValue("AgencyOrDealer")
    AGENCY_OR_DEALER("AgencyOrDealer"),
    @XmlEnumValue("AlternateCarrier")
    ALTERNATE_CARRIER("AlternateCarrier"),
    @XmlEnumValue("Bank")
    BANK("Bank"),
    @XmlEnumValue("BeneficialOwner")
    BENEFICIAL_OWNER("BeneficialOwner"),
    @XmlEnumValue("BillToParty")
    BILL_TO_PARTY("BillToParty"),
    @XmlEnumValue("Buyer")
    BUYER("Buyer"),
    @XmlEnumValue("CareOfParty")
    CARE_OF_PARTY("CareOfParty"),
    @XmlEnumValue("Carrier")
    CARRIER("Carrier"),
    @XmlEnumValue("CarrierToExclude")
    CARRIER_TO_EXCLUDE("CarrierToExclude"),
    @XmlEnumValue("CommodityBroker")
    COMMODITY_BROKER("CommodityBroker"),
    @XmlEnumValue("Consignee")
    CONSIGNEE("Consignee"),
    @XmlEnumValue("Customs")
    CUSTOMS("Customs"),
    @XmlEnumValue("CustomsBroker")
    CUSTOMS_BROKER("CustomsBroker"),
    @XmlEnumValue("CustomsClearance")
    CUSTOMS_CLEARANCE("CustomsClearance"),
    @XmlEnumValue("Distributor")
    DISTRIBUTOR("Distributor"),
    @XmlEnumValue("EndUseCustomer")
    END_USE_CUSTOMER("EndUseCustomer"),
    @XmlEnumValue("FinancialInstitution")
    FINANCIAL_INSTITUTION("FinancialInstitution"),
    @XmlEnumValue("FreightForwarder")
    FREIGHT_FORWARDER("FreightForwarder"),
    @XmlEnumValue("HazmatOfficer")
    HAZMAT_OFFICER("HazmatOfficer"),
    @XmlEnumValue("IntermediateCarrier")
    INTERMEDIATE_CARRIER("IntermediateCarrier"),
    @XmlEnumValue("Inspection")
    INSPECTION("Inspection"),
    @XmlEnumValue("LetterOfCreditBank")
    LETTER_OF_CREDIT_BANK("LetterOfCreditBank"),
    @XmlEnumValue("ManagingEntity")
    MANAGING_ENTITY("ManagingEntity"),
    @XmlEnumValue("Manufacturer")
    MANUFACTURER("Manufacturer"),
    @XmlEnumValue("Marketplace")
    MARKETPLACE("Marketplace"),
    @XmlEnumValue("NotifyParty")
    NOTIFY_PARTY("NotifyParty"),
    @XmlEnumValue("Payer")
    PAYER("Payer"),
    @XmlEnumValue("PricingSource")
    PRICING_SOURCE("PricingSource"),
    @XmlEnumValue("RebateReceiver")
    REBATE_RECEIVER("RebateReceiver"),
    @XmlEnumValue("Receiver")
    RECEIVER("Receiver"),
    @XmlEnumValue("RemitTo")
    REMIT_TO("RemitTo"),
    @XmlEnumValue("Scales")
    SCALES("Scales"),
    @XmlEnumValue("Seller")
    SELLER("Seller"),
    @XmlEnumValue("SellingPartner")
    SELLING_PARTNER("SellingPartner"),
    @XmlEnumValue("Sender")
    SENDER("Sender"),
    @XmlEnumValue("Shipper")
    SHIPPER("Shipper"),
    @XmlEnumValue("ShipFrom")
    SHIP_FROM("ShipFrom"),
    @XmlEnumValue("ShipTo")
    SHIP_TO("ShipTo"),
    @XmlEnumValue("SoldTo")
    SOLD_TO("SoldTo"),
    @XmlEnumValue("SplitBillingPartner")
    SPLIT_BILLING_PARTNER("SplitBillingPartner"),
    @XmlEnumValue("Supplier")
    SUPPLIER("Supplier"),
    @XmlEnumValue("Surveyor")
    SURVEYOR("Surveyor"),
    @XmlEnumValue("TaxAuthority")
    TAX_AUTHORITY("TaxAuthority"),
    @XmlEnumValue("TaxRepresentative")
    TAX_REPRESENTATIVE("TaxRepresentative"),
    @XmlEnumValue("ThirdPartyFreightPayer")
    THIRD_PARTY_FREIGHT_PAYER("ThirdPartyFreightPayer"),
    @XmlEnumValue("ThirdPartyLogistics")
    THIRD_PARTY_LOGISTICS("ThirdPartyLogistics"),
    @XmlEnumValue("TransportationBroker")
    TRANSPORTATION_BROKER("TransportationBroker"),
    @XmlEnumValue("UltimateConsignee")
    ULTIMATE_CONSIGNEE("UltimateConsignee");
    private final String value;

    ListPartnerRoles(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListPartnerRoles fromValue(String v) {
        for (ListPartnerRoles c: ListPartnerRoles.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

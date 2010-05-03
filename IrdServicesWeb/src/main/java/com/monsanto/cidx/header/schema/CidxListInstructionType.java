
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListInstructionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListInstructionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="AdditionalCustomerInformation"/>
 *     &lt;enumeration value="AdditionalEquipmentInformation"/>
 *     &lt;enumeration value="AdditionalHazmatInformation"/>
 *     &lt;enumeration value="AdditionalInformation"/>
 *     &lt;enumeration value="AddMaterialProperties"/>
 *     &lt;enumeration value="BollaDiConsegna"/>
 *     &lt;enumeration value="CarrierInstructions"/>
 *     &lt;enumeration value="COAInstructions"/>
 *     &lt;enumeration value="CompanyStatement"/>
 *     &lt;enumeration value="ConsigneeInstructions"/>
 *     &lt;enumeration value="ControlInstructions"/>
 *     &lt;enumeration value="CustomerRequiredInstructions"/>
 *     &lt;enumeration value="CustomerServiceInstructions"/>
 *     &lt;enumeration value="CustomsClearanceInstructions"/>
 *     &lt;enumeration value="CustomsClearanceRemark"/>
 *     &lt;enumeration value="CustomsDeclaration"/>
 *     &lt;enumeration value="DangerousGoodsIdentification"/>
 *     &lt;enumeration value="Disclaimers"/>
 *     &lt;enumeration value="DocumentDistributionInstructions"/>
 *     &lt;enumeration value="DriverInstructions"/>
 *     &lt;enumeration value="EmptyReturnInstructions"/>
 *     &lt;enumeration value="ExportInstructions"/>
 *     &lt;enumeration value="General"/>
 *     &lt;enumeration value="GovernmentInformation"/>
 *     &lt;enumeration value="ImportInstructions"/>
 *     &lt;enumeration value="InspectionInstructions"/>
 *     &lt;enumeration value="IntermediateCarrier"/>
 *     &lt;enumeration value="InvoiceInstructions"/>
 *     &lt;enumeration value="LoadingInstructions"/>
 *     &lt;enumeration value="MarketingProgramInstructions"/>
 *     &lt;enumeration value="MarkingInstructions"/>
 *     &lt;enumeration value="MiscellaneousInstructions"/>
 *     &lt;enumeration value="ModificationInformation"/>
 *     &lt;enumeration value="PaymentInstructions"/>
 *     &lt;enumeration value="PriceConditions"/>
 *     &lt;enumeration value="PostingInstructions"/>
 *     &lt;enumeration value="RequiredNotice"/>
 *     &lt;enumeration value="RoutingInstructions"/>
 *     &lt;enumeration value="ShipperInstructions"/>
 *     &lt;enumeration value="ShippingInstructions"/>
 *     &lt;enumeration value="SpecialHandling"/>
 *     &lt;enumeration value="SpecialHandlingInstructions"/>
 *     &lt;enumeration value="TankermanInstructions"/>
 *     &lt;enumeration value="TechnicalUnloadingAdvice"/>
 *     &lt;enumeration value="TransportInformation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListInstructionType")
@XmlEnum
public enum CidxListInstructionType {

    @XmlEnumValue("AdditionalCustomerInformation")
    ADDITIONAL_CUSTOMER_INFORMATION("AdditionalCustomerInformation"),
    @XmlEnumValue("AdditionalEquipmentInformation")
    ADDITIONAL_EQUIPMENT_INFORMATION("AdditionalEquipmentInformation"),
    @XmlEnumValue("AdditionalHazmatInformation")
    ADDITIONAL_HAZMAT_INFORMATION("AdditionalHazmatInformation"),
    @XmlEnumValue("AdditionalInformation")
    ADDITIONAL_INFORMATION("AdditionalInformation"),
    @XmlEnumValue("AddMaterialProperties")
    ADD_MATERIAL_PROPERTIES("AddMaterialProperties"),
    @XmlEnumValue("BollaDiConsegna")
    BOLLA_DI_CONSEGNA("BollaDiConsegna"),
    @XmlEnumValue("CarrierInstructions")
    CARRIER_INSTRUCTIONS("CarrierInstructions"),
    @XmlEnumValue("COAInstructions")
    COA_INSTRUCTIONS("COAInstructions"),
    @XmlEnumValue("CompanyStatement")
    COMPANY_STATEMENT("CompanyStatement"),
    @XmlEnumValue("ConsigneeInstructions")
    CONSIGNEE_INSTRUCTIONS("ConsigneeInstructions"),
    @XmlEnumValue("ControlInstructions")
    CONTROL_INSTRUCTIONS("ControlInstructions"),
    @XmlEnumValue("CustomerRequiredInstructions")
    CUSTOMER_REQUIRED_INSTRUCTIONS("CustomerRequiredInstructions"),
    @XmlEnumValue("CustomerServiceInstructions")
    CUSTOMER_SERVICE_INSTRUCTIONS("CustomerServiceInstructions"),
    @XmlEnumValue("CustomsClearanceInstructions")
    CUSTOMS_CLEARANCE_INSTRUCTIONS("CustomsClearanceInstructions"),
    @XmlEnumValue("CustomsClearanceRemark")
    CUSTOMS_CLEARANCE_REMARK("CustomsClearanceRemark"),
    @XmlEnumValue("CustomsDeclaration")
    CUSTOMS_DECLARATION("CustomsDeclaration"),
    @XmlEnumValue("DangerousGoodsIdentification")
    DANGEROUS_GOODS_IDENTIFICATION("DangerousGoodsIdentification"),
    @XmlEnumValue("Disclaimers")
    DISCLAIMERS("Disclaimers"),
    @XmlEnumValue("DocumentDistributionInstructions")
    DOCUMENT_DISTRIBUTION_INSTRUCTIONS("DocumentDistributionInstructions"),
    @XmlEnumValue("DriverInstructions")
    DRIVER_INSTRUCTIONS("DriverInstructions"),
    @XmlEnumValue("EmptyReturnInstructions")
    EMPTY_RETURN_INSTRUCTIONS("EmptyReturnInstructions"),
    @XmlEnumValue("ExportInstructions")
    EXPORT_INSTRUCTIONS("ExportInstructions"),
    @XmlEnumValue("General")
    GENERAL("General"),
    @XmlEnumValue("GovernmentInformation")
    GOVERNMENT_INFORMATION("GovernmentInformation"),
    @XmlEnumValue("ImportInstructions")
    IMPORT_INSTRUCTIONS("ImportInstructions"),
    @XmlEnumValue("InspectionInstructions")
    INSPECTION_INSTRUCTIONS("InspectionInstructions"),
    @XmlEnumValue("IntermediateCarrier")
    INTERMEDIATE_CARRIER("IntermediateCarrier"),
    @XmlEnumValue("InvoiceInstructions")
    INVOICE_INSTRUCTIONS("InvoiceInstructions"),
    @XmlEnumValue("LoadingInstructions")
    LOADING_INSTRUCTIONS("LoadingInstructions"),
    @XmlEnumValue("MarketingProgramInstructions")
    MARKETING_PROGRAM_INSTRUCTIONS("MarketingProgramInstructions"),
    @XmlEnumValue("MarkingInstructions")
    MARKING_INSTRUCTIONS("MarkingInstructions"),
    @XmlEnumValue("MiscellaneousInstructions")
    MISCELLANEOUS_INSTRUCTIONS("MiscellaneousInstructions"),
    @XmlEnumValue("ModificationInformation")
    MODIFICATION_INFORMATION("ModificationInformation"),
    @XmlEnumValue("PaymentInstructions")
    PAYMENT_INSTRUCTIONS("PaymentInstructions"),
    @XmlEnumValue("PriceConditions")
    PRICE_CONDITIONS("PriceConditions"),
    @XmlEnumValue("PostingInstructions")
    POSTING_INSTRUCTIONS("PostingInstructions"),
    @XmlEnumValue("RequiredNotice")
    REQUIRED_NOTICE("RequiredNotice"),
    @XmlEnumValue("RoutingInstructions")
    ROUTING_INSTRUCTIONS("RoutingInstructions"),
    @XmlEnumValue("ShipperInstructions")
    SHIPPER_INSTRUCTIONS("ShipperInstructions"),
    @XmlEnumValue("ShippingInstructions")
    SHIPPING_INSTRUCTIONS("ShippingInstructions"),
    @XmlEnumValue("SpecialHandling")
    SPECIAL_HANDLING("SpecialHandling"),
    @XmlEnumValue("SpecialHandlingInstructions")
    SPECIAL_HANDLING_INSTRUCTIONS("SpecialHandlingInstructions"),
    @XmlEnumValue("TankermanInstructions")
    TANKERMAN_INSTRUCTIONS("TankermanInstructions"),
    @XmlEnumValue("TechnicalUnloadingAdvice")
    TECHNICAL_UNLOADING_ADVICE("TechnicalUnloadingAdvice"),
    @XmlEnumValue("TransportInformation")
    TRANSPORT_INFORMATION("TransportInformation");
    private final String value;

    CidxListInstructionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListInstructionType fromValue(String v) {
        for (CidxListInstructionType c: CidxListInstructionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

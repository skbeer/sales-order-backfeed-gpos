
package com.monsanto.cidx.header.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cidxListReferenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cidxListReferenceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="AppointmentNumber"/>
 *     &lt;enumeration value="Authorization"/>
 *     &lt;enumeration value="BillOfLading"/>
 *     &lt;enumeration value="BillOfLadingNumber"/>
 *     &lt;enumeration value="BollaDiConsegna"/>
 *     &lt;enumeration value="BookingNumber"/>
 *     &lt;enumeration value="BuyerContractNumber"/>
 *     &lt;enumeration value="CarrierReferenceNumber"/>
 *     &lt;enumeration value="CertificateOfAnalysis"/>
 *     &lt;enumeration value="CertificateOfConformity"/>
 *     &lt;enumeration value="CertificateOfInhibition"/>
 *     &lt;enumeration value="CertificateOfOrigin"/>
 *     &lt;enumeration value="ChangeSequenceNumber"/>
 *     &lt;enumeration value="CommercialInvoice"/>
 *     &lt;enumeration value="ConsolidatedShipmentIdentifier"/>
 *     &lt;enumeration value="ContractNumber"/>
 *     &lt;enumeration value="CustomerMasterRecordNumber"/>
 *     &lt;enumeration value="CustomerOrderNumber"/>
 *     &lt;enumeration value="CustomsCertificate"/>
 *     &lt;enumeration value="DeliveryNoteNumber"/>
 *     &lt;enumeration value="DGD"/>
 *     &lt;enumeration value="EndCustomerPONumber"/>
 *     &lt;enumeration value="EngineeringChangeOrderNumber"/>
 *     &lt;enumeration value="ExciseWarehouseIdentification"/>
 *     &lt;enumeration value="ExportDeclaration"/>
 *     &lt;enumeration value="ExportLicenseNumber"/>
 *     &lt;enumeration value="InvoiceNumber"/>
 *     &lt;enumeration value="LetterOfCredit"/>
 *     &lt;enumeration value="LicenseNumber"/>
 *     &lt;enumeration value="LineItemNumber"/>
 *     &lt;enumeration value="LoadPlanningNumber"/>
 *     &lt;enumeration value="LoadTenderNumber"/>
 *     &lt;enumeration value="MSDS"/>
 *     &lt;enumeration value="NAFTA"/>
 *     &lt;enumeration value="OrderFulfillmentNumber"/>
 *     &lt;enumeration value="PackingList"/>
 *     &lt;enumeration value="PaymentNumber"/>
 *     &lt;enumeration value="PickUpNumber"/>
 *     &lt;enumeration value="PriceList"/>
 *     &lt;enumeration value="ProFormaInvoice"/>
 *     &lt;enumeration value="PRONumber"/>
 *     &lt;enumeration value="PurchaseOrderNumber"/>
 *     &lt;enumeration value="RailContractNumber"/>
 *     &lt;enumeration value="ReleaseNumber"/>
 *     &lt;enumeration value="ReplenishmentProposalNumber"/>
 *     &lt;enumeration value="RequestForQuoteNumber"/>
 *     &lt;enumeration value="RequisitionNumber"/>
 *     &lt;enumeration value="SalesOrderReference"/>
 *     &lt;enumeration value="ScaleTicket"/>
 *     &lt;enumeration value="SellerContractNumber"/>
 *     &lt;enumeration value="SellerCreditMemoNumber"/>
 *     &lt;enumeration value="SellersInvoiceNumber"/>
 *     &lt;enumeration value="ShipmentIdentifier"/>
 *     &lt;enumeration value="ShipperPONumber"/>
 *     &lt;enumeration value="ShippersLetterOfInstruction"/>
 *     &lt;enumeration value="SupplierARNumber"/>
 *     &lt;enumeration value="SupplierOrderNumber"/>
 *     &lt;enumeration value="ThirdPartyPurchaseOrderNumber"/>
 *     &lt;enumeration value="TransportEmergencyCard"/>
 *     &lt;enumeration value="VehicleID"/>
 *     &lt;enumeration value="VeterinaryFeedDirective"/>
 *     &lt;enumeration value="WaybillNumber"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cidxListReferenceType")
@XmlEnum
public enum CidxListReferenceType {

    @XmlEnumValue("AppointmentNumber")
    APPOINTMENT_NUMBER("AppointmentNumber"),
    @XmlEnumValue("Authorization")
    AUTHORIZATION("Authorization"),
    @XmlEnumValue("BillOfLading")
    BILL_OF_LADING("BillOfLading"),
    @XmlEnumValue("BillOfLadingNumber")
    BILL_OF_LADING_NUMBER("BillOfLadingNumber"),
    @XmlEnumValue("BollaDiConsegna")
    BOLLA_DI_CONSEGNA("BollaDiConsegna"),
    @XmlEnumValue("BookingNumber")
    BOOKING_NUMBER("BookingNumber"),
    @XmlEnumValue("BuyerContractNumber")
    BUYER_CONTRACT_NUMBER("BuyerContractNumber"),
    @XmlEnumValue("CarrierReferenceNumber")
    CARRIER_REFERENCE_NUMBER("CarrierReferenceNumber"),
    @XmlEnumValue("CertificateOfAnalysis")
    CERTIFICATE_OF_ANALYSIS("CertificateOfAnalysis"),
    @XmlEnumValue("CertificateOfConformity")
    CERTIFICATE_OF_CONFORMITY("CertificateOfConformity"),
    @XmlEnumValue("CertificateOfInhibition")
    CERTIFICATE_OF_INHIBITION("CertificateOfInhibition"),
    @XmlEnumValue("CertificateOfOrigin")
    CERTIFICATE_OF_ORIGIN("CertificateOfOrigin"),
    @XmlEnumValue("ChangeSequenceNumber")
    CHANGE_SEQUENCE_NUMBER("ChangeSequenceNumber"),
    @XmlEnumValue("CommercialInvoice")
    COMMERCIAL_INVOICE("CommercialInvoice"),
    @XmlEnumValue("ConsolidatedShipmentIdentifier")
    CONSOLIDATED_SHIPMENT_IDENTIFIER("ConsolidatedShipmentIdentifier"),
    @XmlEnumValue("ContractNumber")
    CONTRACT_NUMBER("ContractNumber"),
    @XmlEnumValue("CustomerMasterRecordNumber")
    CUSTOMER_MASTER_RECORD_NUMBER("CustomerMasterRecordNumber"),
    @XmlEnumValue("CustomerOrderNumber")
    CUSTOMER_ORDER_NUMBER("CustomerOrderNumber"),
    @XmlEnumValue("CustomsCertificate")
    CUSTOMS_CERTIFICATE("CustomsCertificate"),
    @XmlEnumValue("DeliveryNoteNumber")
    DELIVERY_NOTE_NUMBER("DeliveryNoteNumber"),
    DGD("DGD"),
    @XmlEnumValue("EndCustomerPONumber")
    END_CUSTOMER_PO_NUMBER("EndCustomerPONumber"),
    @XmlEnumValue("EngineeringChangeOrderNumber")
    ENGINEERING_CHANGE_ORDER_NUMBER("EngineeringChangeOrderNumber"),
    @XmlEnumValue("ExciseWarehouseIdentification")
    EXCISE_WAREHOUSE_IDENTIFICATION("ExciseWarehouseIdentification"),
    @XmlEnumValue("ExportDeclaration")
    EXPORT_DECLARATION("ExportDeclaration"),
    @XmlEnumValue("ExportLicenseNumber")
    EXPORT_LICENSE_NUMBER("ExportLicenseNumber"),
    @XmlEnumValue("InvoiceNumber")
    INVOICE_NUMBER("InvoiceNumber"),
    @XmlEnumValue("LetterOfCredit")
    LETTER_OF_CREDIT("LetterOfCredit"),
    @XmlEnumValue("LicenseNumber")
    LICENSE_NUMBER("LicenseNumber"),
    @XmlEnumValue("LineItemNumber")
    LINE_ITEM_NUMBER("LineItemNumber"),
    @XmlEnumValue("LoadPlanningNumber")
    LOAD_PLANNING_NUMBER("LoadPlanningNumber"),
    @XmlEnumValue("LoadTenderNumber")
    LOAD_TENDER_NUMBER("LoadTenderNumber"),
    MSDS("MSDS"),
    NAFTA("NAFTA"),
    @XmlEnumValue("OrderFulfillmentNumber")
    ORDER_FULFILLMENT_NUMBER("OrderFulfillmentNumber"),
    @XmlEnumValue("PackingList")
    PACKING_LIST("PackingList"),
    @XmlEnumValue("PaymentNumber")
    PAYMENT_NUMBER("PaymentNumber"),
    @XmlEnumValue("PickUpNumber")
    PICK_UP_NUMBER("PickUpNumber"),
    @XmlEnumValue("PriceList")
    PRICE_LIST("PriceList"),
    @XmlEnumValue("ProFormaInvoice")
    PRO_FORMA_INVOICE("ProFormaInvoice"),
    @XmlEnumValue("PRONumber")
    PRO_NUMBER("PRONumber"),
    @XmlEnumValue("PurchaseOrderNumber")
    PURCHASE_ORDER_NUMBER("PurchaseOrderNumber"),
    @XmlEnumValue("RailContractNumber")
    RAIL_CONTRACT_NUMBER("RailContractNumber"),
    @XmlEnumValue("ReleaseNumber")
    RELEASE_NUMBER("ReleaseNumber"),
    @XmlEnumValue("ReplenishmentProposalNumber")
    REPLENISHMENT_PROPOSAL_NUMBER("ReplenishmentProposalNumber"),
    @XmlEnumValue("RequestForQuoteNumber")
    REQUEST_FOR_QUOTE_NUMBER("RequestForQuoteNumber"),
    @XmlEnumValue("RequisitionNumber")
    REQUISITION_NUMBER("RequisitionNumber"),
    @XmlEnumValue("SalesOrderReference")
    SALES_ORDER_REFERENCE("SalesOrderReference"),
    @XmlEnumValue("ScaleTicket")
    SCALE_TICKET("ScaleTicket"),
    @XmlEnumValue("SellerContractNumber")
    SELLER_CONTRACT_NUMBER("SellerContractNumber"),
    @XmlEnumValue("SellerCreditMemoNumber")
    SELLER_CREDIT_MEMO_NUMBER("SellerCreditMemoNumber"),
    @XmlEnumValue("SellersInvoiceNumber")
    SELLERS_INVOICE_NUMBER("SellersInvoiceNumber"),
    @XmlEnumValue("ShipmentIdentifier")
    SHIPMENT_IDENTIFIER("ShipmentIdentifier"),
    @XmlEnumValue("ShipperPONumber")
    SHIPPER_PO_NUMBER("ShipperPONumber"),
    @XmlEnumValue("ShippersLetterOfInstruction")
    SHIPPERS_LETTER_OF_INSTRUCTION("ShippersLetterOfInstruction"),
    @XmlEnumValue("SupplierARNumber")
    SUPPLIER_AR_NUMBER("SupplierARNumber"),
    @XmlEnumValue("SupplierOrderNumber")
    SUPPLIER_ORDER_NUMBER("SupplierOrderNumber"),
    @XmlEnumValue("ThirdPartyPurchaseOrderNumber")
    THIRD_PARTY_PURCHASE_ORDER_NUMBER("ThirdPartyPurchaseOrderNumber"),
    @XmlEnumValue("TransportEmergencyCard")
    TRANSPORT_EMERGENCY_CARD("TransportEmergencyCard"),
    @XmlEnumValue("VehicleID")
    VEHICLE_ID("VehicleID"),
    @XmlEnumValue("VeterinaryFeedDirective")
    VETERINARY_FEED_DIRECTIVE("VeterinaryFeedDirective"),
    @XmlEnumValue("WaybillNumber")
    WAYBILL_NUMBER("WaybillNumber");
    private final String value;

    CidxListReferenceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CidxListReferenceType fromValue(String v) {
        for (CidxListReferenceType c: CidxListReferenceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

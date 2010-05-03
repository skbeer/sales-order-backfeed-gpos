
package com.monsanto.cidx.header.schema;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.monsanto.cidx.header.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PaymentDetail_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentDetail");
    private final static QName _PostingChangePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingChangePartners");
    private final static QName _PalletPackageCountQuantity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PalletPackageCountQuantity");
    private final static QName _RateBasisType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RateBasisType");
    private final static QName _ShipmentInstructionsPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentInstructionsPartners");
    private final static QName _DistanceBasis_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DistanceBasis");
    private final static QName _Ingredient_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Ingredient");
    private final static QName _FreightBillProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FreightBillProperties");
    private final static QName _ScheduledShipDateTime_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ScheduledShipDateTime");
    private final static QName _ShipmentReleaseDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentReleaseDate");
    private final static QName _ReceiptNoticeProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReceiptNoticeProductLineItem");
    private final static QName _LoadBuildingResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadBuildingResponseProperties");
    private final static QName _AllowanceCharge_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AllowanceCharge");
    private final static QName _ShipmentPackaging_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentPackaging");
    private final static QName _LoadBuildingMotorProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadBuildingMotorProductLineItem");
    private final static QName _ShipNoticeProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipNoticeProductLineItem");
    private final static QName _BondedWarehouseStatus_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BondedWarehouseStatus");
    private final static QName _CustomerSpecificCatalogUpdateProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CustomerSpecificCatalogUpdateProperties");
    private final static QName _CarrierWeightsDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CarrierWeightsDetails");
    private final static QName _TransportInBond_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TransportInBond");
    private final static QName _DateTimeRange_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DateTimeRange");
    private final static QName _SellingPrice_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SellingPrice");
    private final static QName _ReplenishmentProposalContent_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalContent");
    private final static QName _HazardousNotation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HazardousNotation");
    private final static QName _Keyword_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Keyword");
    private final static QName _ShipmentStatusRequestProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentStatusRequestProperties");
    private final static QName _Allowances_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Allowances");
    private final static QName _OrderStatusResponseBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusResponseBody");
    private final static QName _ForecastedProductMovementReportBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ForecastedProductMovementReportBody");
    private final static QName _RequestedPrice_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestedPrice");
    private final static QName _OrderCreate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderCreate");
    private final static QName _HazmatData_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HazmatData");
    private final static QName _TaxBasis_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TaxBasis");
    private final static QName _ProductLineItemLineNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductLineItemLineNumber");
    private final static QName _EquipmentMaterialType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "EquipmentMaterialType");
    private final static QName _NetVolume_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "NetVolume");
    private final static QName _LanguageCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LanguageCode");
    private final static QName _BalanceItemFlag_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BalanceItemFlag");
    private final static QName _PostingAcceptResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingAcceptResponse");
    private final static QName _ProductAttribute_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductAttribute");
    private final static QName _DeliveryReceiptLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryReceiptLineItem");
    private final static QName _WaterPollutionClass_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "WaterPollutionClass");
    private final static QName _AccompanyingSampleIndicator_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AccompanyingSampleIndicator");
    private final static QName _InvoiceLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InvoiceLineItem");
    private final static QName _LoadTenderOceanProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderOceanProperties");
    private final static QName _SpecialHandlingInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SpecialHandlingInformation");
    private final static QName _ShipmentStatusPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentStatusPartners");
    private final static QName _DeliveryTermsLocation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryTermsLocation");
    private final static QName _ProductSpecificationMethod_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductSpecificationMethod");
    private final static QName _RebateType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RebateType");
    private final static QName _BillingScheduleIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BillingScheduleIdentifier");
    private final static QName _CreditCardNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CreditCardNumber");
    private final static QName _AccountNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AccountNumber");
    private final static QName _CreditCardProvider_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CreditCardProvider");
    private final static QName _TaxInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TaxInformation");
    private final static QName _States_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "States");
    private final static QName _ProductMovementTransaction_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductMovementTransaction");
    private final static QName _OrderResponseProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderResponseProductLineItem");
    private final static QName _HazardousProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HazardousProperties");
    private final static QName _ThirdPartyLaboratory_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ThirdPartyLaboratory");
    private final static QName _ProductGroupLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductGroupLineItem");
    private final static QName _CostSupportRequestChange_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportRequestChange");
    private final static QName _TremcardCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TremcardCode");
    private final static QName _OrderStatusResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusResponseProperties");
    private final static QName _StandardOrderQuantity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "StandardOrderQuantity");
    private final static QName _PostingStatusResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingStatusResponse");
    private final static QName _ExpirationDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ExpirationDate");
    private final static QName _RequestForQuoteProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestForQuoteProductLineItem");
    private final static QName _DeliveryConfirmationBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryConfirmationBody");
    private final static QName _OrderChangePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderChangePartners");
    private final static QName _ScheduleLineDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ScheduleLineDetails");
    private final static QName _ShipNoticeListBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipNoticeListBody");
    private final static QName _AcceptanceNotificationProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AcceptanceNotificationProperties");
    private final static QName _CumulativeTotalQuantity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CumulativeTotalQuantity");
    private final static QName _Payer_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Payer");
    private final static QName _DemandForecastDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandForecastDetails");
    private final static QName _InvoiceTotal_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InvoiceTotal");
    private final static QName _CostSupportRequestBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportRequestBody");
    private final static QName _CostSupportDuration_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportDuration");
    private final static QName _TargetCurrency_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TargetCurrency");
    private final static QName _FreightBillTotals_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FreightBillTotals");
    private final static QName _PaymentResponseBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentResponseBody");
    private final static QName _PostingAcceptBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingAcceptBody");
    private final static QName _StatusEffectiveDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "StatusEffectiveDate");
    private final static QName _ErrorFlag_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ErrorFlag");
    private final static QName _SampleDescription_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SampleDescription");
    private final static QName _PriceShippingTerms_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceShippingTerms");
    private final static QName _InvoiceQuantity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InvoiceQuantity");
    private final static QName _ActionRequest_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ActionRequest");
    private final static QName _LoadTenderResponseProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderResponseProductLineItem");
    private final static QName _NonExempt_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "NonExempt");
    private final static QName _LoadTenderMotorProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderMotorProperties");
    private final static QName _PlanWindow_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PlanWindow");
    private final static QName _HandlingInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HandlingInformation");
    private final static QName _LocationSampleObtained_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LocationSampleObtained");
    private final static QName _OrderStatusListRequestBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusListRequestBody");
    private final static QName _FreightCharge_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FreightCharge");
    private final static QName _ShippingLabelInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShippingLabelInformation");
    private final static QName _HandlingException_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HandlingException");
    private final static QName _ShipmentInstructionsLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentInstructionsLineItem");
    private final static QName _MaximumFillingDegree_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MaximumFillingDegree");
    private final static QName _DutyDrawback_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DutyDrawback");
    private final static QName _TotalNumberOfHandlingUnits_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TotalNumberOfHandlingUnits");
    private final static QName _TankType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TankType");
    private final static QName _TransportTemperature_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TransportTemperature");
    private final static QName _EUSubstanceNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "EUSubstanceNumber");
    private final static QName _PostingAcceptDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingAcceptDetails");
    private final static QName _Header_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Header");
    private final static QName _ProductOptions_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductOptions");
    private final static QName _ReplenishmentProposalRequestLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalRequestLineItem");
    private final static QName _CustomerSpecificCatalogPriceData_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CustomerSpecificCatalogPriceData");
    private final static QName _DeliveryReceiptIdentification_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryReceiptIdentification");
    private final static QName _ReceiptNotice_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReceiptNotice");
    private final static QName _OrderCreateProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderCreateProductLineItem");
    private final static QName _FinancialInstitutionDFINumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FinancialInstitutionDFINumber");
    private final static QName _Content_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Content");
    private final static QName _RequestedCostSupport_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestedCostSupport");
    private final static QName _DocumentDeliveryMethod_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DocumentDeliveryMethod");
    private final static QName _ConversionFactor_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ConversionFactor");
    private final static QName _ReportingEntity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReportingEntity");
    private final static QName _MarketPlaceIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MarketPlaceIdentifier");
    private final static QName _DocumentRecipientInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DocumentRecipientInformation");
    private final static QName _InventoryActualUsageProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryActualUsageProperties");
    private final static QName _TermsOfSale_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TermsOfSale");
    private final static QName _ReplenishmentProposalRequestLocation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalRequestLocation");
    private final static QName _CatalogEffectiveDates_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CatalogEffectiveDates");
    private final static QName _SecondWeightFlag_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SecondWeightFlag");
    private final static QName _DaysDue_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DaysDue");
    private final static QName _PriceZone_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceZone");
    private final static QName _ConsignmentNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ConsignmentNumber");
    private final static QName _EventDateTime_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "EventDateTime");
    private final static QName _PaymentDates_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentDates");
    private final static QName _ExpectedReleaseQuantity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ExpectedReleaseQuantity");
    private final static QName _ReceiptNoticeDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReceiptNoticeDetails");
    private final static QName _PriceSheetIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceSheetIdentifier");
    private final static QName _ReplenishmentProposalRequestPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalRequestPartners");
    private final static QName _RequestSentDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestSentDate");
    private final static QName _ProductMovementTransactionDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductMovementTransactionDetails");
    private final static QName _Exclude_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Exclude");
    private final static QName _ReplenishmentProposalRequestDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalRequestDetails");
    private final static QName _AlternativeCommunicationMethod_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AlternativeCommunicationMethod");
    private final static QName _PriceInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceInformation");
    private final static QName _ProductMovementReport_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductMovementReport");
    private final static QName _StorageTankIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "StorageTankIdentifier");
    private final static QName _ToUnitOfMeasure_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ToUnitOfMeasure");
    private final static QName _QualificationResponseDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QualificationResponseDetails");
    private final static QName _PostingCreateDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingCreateDetails");
    private final static QName _InventoryActualUsagePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryActualUsagePartners");
    private final static QName _ContractResponseDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractResponseDetails");
    private final static QName _TestIdentification_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TestIdentification");
    private final static QName _PaymentTermsList_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentTermsList");
    private final static QName _QualificationResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QualificationResponseProperties");
    private final static QName _SpecialFulfillmentRequestCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SpecialFulfillmentRequestCode");
    private final static QName _PostingStatusRequest_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingStatusRequest");
    private final static QName _DiscountAmount_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DiscountAmount");
    private final static QName _PriceModifierDown_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceModifierDown");
    private final static QName _Payment_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Payment");
    private final static QName _DayOfWeek_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DayOfWeek");
    private final static QName _CountryOfFinalDestinationCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CountryOfFinalDestinationCode");
    private final static QName _LineItemType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LineItemType");
    private final static QName _PostingStatusResponsePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingStatusResponsePartners");
    private final static QName _InvoiceProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InvoiceProperties");
    private final static QName _ScheduleDateTimeInformationRange_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ScheduleDateTimeInformationRange");
    private final static QName _ShipmentIdentification_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentIdentification");
    private final static QName _CardHolderName_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CardHolderName");
    private final static QName _EmailAddress_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "EmailAddress");
    private final static QName _QualificationRequest_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QualificationRequest");
    private final static QName _Percent_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Percent");
    private final static QName _LoadTenderMotorProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderMotorProductLineItem");
    private final static QName _ShipTo_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipTo");
    private final static QName _ContractBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractBody");
    private final static QName _LadingIdentification_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LadingIdentification");
    private final static QName _ShipNoticeListProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipNoticeListProperties");
    private final static QName _ContractPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractPartners");
    private final static QName _Consignment_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Consignment");
    private final static QName _PostingStatusRequestProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingStatusRequestProperties");
    private final static QName _PostingResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingResponse");
    private final static QName _Location_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Location");
    private final static QName _ReplenishmentProposalResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalResponse");
    private final static QName _LoadTenderOceanPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderOceanPartners");
    private final static QName _ManufacturingIdentificationDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ManufacturingIdentificationDetails");
    private final static QName _DeliveryReceiptResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryReceiptResponseProperties");
    private final static QName _ReplenishmentProposalChange_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalChange");
    private final static QName _VoyageTripNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "VoyageTripNumber");
    private final static QName _TaxOrDutyTotals_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TaxOrDutyTotals");
    private final static QName _Supplier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Supplier");
    private final static QName _PostalCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostalCode");
    private final static QName _SellerSequenceNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SellerSequenceNumber");
    private final static QName _AdjustmentCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AdjustmentCode");
    private final static QName _PostingAcceptResponseDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingAcceptResponseDetails");
    private final static QName _ErrorDescription_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ErrorDescription");
    private final static QName _ResponseIssuedDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ResponseIssuedDate");
    private final static QName _PropertyDescription_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PropertyDescription");
    private final static QName _TariffSection_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TariffSection");
    private final static QName _SupplyPlanResponsePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SupplyPlanResponsePartners");
    private final static QName _DeliveryConfirmationAcceptance_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryConfirmationAcceptance");
    private final static QName _CostSupportResponseBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportResponseBody");
    private final static QName _MaximumMeasurement_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MaximumMeasurement");
    private final static QName _PartnerReference_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PartnerReference");
    private final static QName _ShipNoticeProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipNoticeProperties");
    private final static QName _PaymentBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentBody");
    private final static QName _AcceptOrReject_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AcceptOrReject");
    private final static QName _DeliveryReceiptPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryReceiptPartners");
    private final static QName _SupplyPlan_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SupplyPlan");
    private final static QName _RateService_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RateService");
    private final static QName _ForecastedProductMovementReportDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ForecastedProductMovementReportDetails");
    private final static QName _ContractNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractNumber");
    private final static QName _AccountHolderName_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AccountHolderName");
    private final static QName _IsDrug_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "IsDrug");
    private final static QName _PriceAndAvailabilityRequest_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceAndAvailabilityRequest");
    private final static QName _OrderStatusRequestProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusRequestProductLineItem");
    private final static QName _Regulations_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Regulations");
    private final static QName _Include_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Include");
    private final static QName _MinimumMeasurement_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MinimumMeasurement");
    private final static QName _PostingChangeLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingChangeLineItem");
    private final static QName _SupportedSales_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SupportedSales");
    private final static QName _AcceptanceNotificationLocation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AcceptanceNotificationLocation");
    private final static QName _BidDueDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BidDueDate");
    private final static QName _ProductCatalogUpdateDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductCatalogUpdateDetails");
    private final static QName _PostingCreatePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingCreatePartners");
    private final static QName _PriceAndAvailabilityRequestPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceAndAvailabilityRequestPartners");
    private final static QName _DateSampleTaken_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DateSampleTaken");
    private final static QName _FreightBillNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FreightBillNumber");
    private final static QName _DateTimeInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DateTimeInformation");
    private final static QName _OrderChangeDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderChangeDetails");
    private final static QName _FreightIncludedFlag_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FreightIncludedFlag");
    private final static QName _Height_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Height");
    private final static QName _ShipmentInstructionsSubLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentInstructionsSubLineItem");
    private final static QName _PostingCancel_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingCancel");
    private final static QName _TaxableAmountTotal_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TaxableAmountTotal");
    private final static QName _CostSupportCreditResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportCreditResponse");
    private final static QName _LocationFrom_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LocationFrom");
    private final static QName _OrderStatusListRequest_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusListRequest");
    private final static QName _AcceptanceNotificationDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AcceptanceNotificationDetails");
    private final static QName _AllowanceChargeCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AllowanceChargeCode");
    private final static QName _ReleaseNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReleaseNumber");
    private final static QName _TruckType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TruckType");
    private final static QName _InventoryActualUsageResponseBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryActualUsageResponseBody");
    private final static QName _RequestedDocument_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestedDocument");
    private final static QName _CostSupportRequestPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportRequestPartners");
    private final static QName _PostingAcceptResponsePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingAcceptResponsePartners");
    private final static QName _ShipmentStatusRequestPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentStatusRequestPartners");
    private final static QName _ShipType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipType");
    private final static QName _TariffItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TariffItem");
    private final static QName _ProprietaryShipmentTrackingIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProprietaryShipmentTrackingIdentifier");
    private final static QName _GeographicType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "GeographicType");
    private final static QName _LineNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LineNumber");
    private final static QName _OrderedProductQuantity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderedProductQuantity");
    private final static QName _Shipper_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Shipper");
    private final static QName _DeclaredValue_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeclaredValue");
    private final static QName _HazardousSubstanceName_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HazardousSubstanceName");
    private final static QName _InventoryOnSite_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryOnSite");
    private final static QName _DeliveryConfirmation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryConfirmation");
    private final static QName _PriceSheet_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceSheet");
    private final static QName _HAZMATCertificationRequired_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HAZMATCertificationRequired");
    private final static QName _LimitDisplayFlag_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LimitDisplayFlag");
    private final static QName _ShipmentStatusRequestDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentStatusRequestDetails");
    private final static QName _PostalCountry_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostalCountry");
    private final static QName _Temperature_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Temperature");
    private final static QName _Counties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Counties");
    private final static QName _InvoiceResponseBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InvoiceResponseBody");
    private final static QName _DeliveryReceiptLocation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryReceiptLocation");
    private final static QName _OrderStatusResponseDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusResponseDetails");
    private final static QName _InventoryInTransit_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryInTransit");
    private final static QName _FixedContractPriceDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FixedContractPriceDate");
    private final static QName _PackagingItems_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PackagingItems");
    private final static QName _AddressInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AddressInformation");
    private final static QName _ForecastedProductMovementReport_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ForecastedProductMovementReport");
    private final static QName _NetWeight_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "NetWeight");
    private final static QName _DeliveryConfirmationResponsePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryConfirmationResponsePartners");
    private final static QName _DeliveryConfirmationProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryConfirmationProperties");
    private final static QName _SafetyDescription_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SafetyDescription");
    private final static QName _Measurement_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Measurement");
    private final static QName _EstimatedTimeOfDepartureDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "EstimatedTimeOfDepartureDate");
    private final static QName _GrossInvoiceAmount_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "GrossInvoiceAmount");
    private final static QName _AllowExportFlag_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AllowExportFlag");
    private final static QName _ShipmentStatusRequestBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentStatusRequestBody");
    private final static QName _ProductCatalogPriceData_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductCatalogPriceData");
    private final static QName _RestrictedOrderFlag_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RestrictedOrderFlag");
    private final static QName _ReplenishmentProposalCancelDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalCancelDetails");
    private final static QName _ShipNoticeListDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipNoticeListDetails");
    private final static QName _ScheduleLineIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ScheduleLineIdentifier");
    private final static QName _ShipmentInstructionsStatus_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentInstructionsStatus");
    private final static QName _ReceiptNoticePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReceiptNoticePartners");
    private final static QName _ShipmentStatusDateTime_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentStatusDateTime");
    private final static QName _DeliveryConfirmationResponseBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryConfirmationResponseBody");
    private final static QName _RiskPhrase_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RiskPhrase");
    private final static QName _PropertyIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PropertyIdentifier");
    private final static QName _NumberOfMonths_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "NumberOfMonths");
    private final static QName _ConveyanceNameOrIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ConveyanceNameOrIdentifier");
    private final static QName _OrderCreateDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderCreateDetails");
    private final static QName _QualityTestingReportPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QualityTestingReportPartners");
    private final static QName _OrderStatusRequest_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusRequest");
    private final static QName _HandlingEndDateTime_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HandlingEndDateTime");
    private final static QName _CustomerCatalogPrice_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CustomerCatalogPrice");
    private final static QName _SafetyCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SafetyCode");
    private final static QName _SpecialRequirements_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SpecialRequirements");
    private final static QName _ForecastInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ForecastInformation");
    private final static QName _TaxAmount_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TaxAmount");
    private final static QName _HazardousClassPrimaryCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HazardousClassPrimaryCode");
    private final static QName _DemandForecastResponsePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandForecastResponsePartners");
    private final static QName _PostingAcceptProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingAcceptProperties");
    private final static QName _BuyerSequenceNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BuyerSequenceNumber");
    private final static QName _CreditRequestApprovalNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CreditRequestApprovalNumber");
    private final static QName _OrderLeadTime_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderLeadTime");
    private final static QName _CustomerSpecificCatalogUpdateBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CustomerSpecificCatalogUpdateBody");
    private final static QName _OrderStatusRequestBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusRequestBody");
    private final static QName _PostingCancelLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingCancelLineItem");
    private final static QName _Enclosure_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Enclosure");
    private final static QName _PostingStatusRequestBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingStatusRequestBody");
    private final static QName _DutyStatus_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DutyStatus");
    private final static QName _PaymentMethodCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentMethodCode");
    private final static QName _Plan_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Plan");
    private final static QName _OrderStatusListResponseBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusListResponseBody");
    private final static QName _ContractExpirationDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractExpirationDate");
    private final static QName _PaymentPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentPartners");
    private final static QName _SoldBy_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SoldBy");
    private final static QName _EquipmentDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "EquipmentDetails");
    private final static QName _TerminalName_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TerminalName");
    private final static QName _QualificationResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QualificationResponse");
    private final static QName _InventoryLevel_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryLevel");
    private final static QName _ReplenishmentProposalResponseBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalResponseBody");
    private final static QName _ProductAttributeValue_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductAttributeValue");
    private final static QName _PostingCancelResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingCancelResponse");
    private final static QName _PostalCodes_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostalCodes");
    private final static QName _DemandForecastResponseBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandForecastResponseBody");
    private final static QName _RequestForQuoteDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestForQuoteDetails");
    private final static QName _Shipping_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Shipping");
    private final static QName _PackagingQuantity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PackagingQuantity");
    private final static QName _UnitedNationsNorthAmericaCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "UnitedNationsNorthAmericaCode");
    private final static QName _ReconciliationNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReconciliationNumber");
    private final static QName _SpecialLabelsAndMarkings_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SpecialLabelsAndMarkings");
    private final static QName _Description_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Description");
    private final static QName _OrderResponsePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderResponsePartners");
    private final static QName _Plant_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Plant");
    private final static QName _LoadProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadProperties");
    private final static QName _CountryOfOriginCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CountryOfOriginCode");
    private final static QName _TestSpecification_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TestSpecification");
    private final static QName _AnonymityFlag_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AnonymityFlag");
    private final static QName _LoadTenderResponsePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderResponsePartners");
    private final static QName _PortOfTranshipmentCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PortOfTranshipmentCode");
    private final static QName _QualityTestingReportBatchDetail_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QualityTestingReportBatchDetail");
    private final static QName _ShippedProductQuantity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShippedProductQuantity");
    private final static QName _EmergencyTemperature_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "EmergencyTemperature");
    private final static QName _Seal_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Seal");
    private final static QName _ReplenishmentProposalLocation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalLocation");
    private final static QName _PurchaseOrderNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PurchaseOrderNumber");
    private final static QName _OrderChangeProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderChangeProductLineItem");
    private final static QName _PercentageOfBlend_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PercentageOfBlend");
    private final static QName _PackingInstructions_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PackingInstructions");
    private final static QName _GeographicName_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "GeographicName");
    private final static QName _OrderStatusRequestPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusRequestPartners");
    private final static QName _PaymentResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentResponse");
    private final static QName _OpenHours_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OpenHours");
    private final static QName _SerialNumbers_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SerialNumbers");
    private final static QName _CostSupportRequestChangePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportRequestChangePartners");
    private final static QName _BatchNumbers_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BatchNumbers");
    private final static QName _OrderResponseDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderResponseDetails");
    private final static QName _TariffSubItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TariffSubItem");
    private final static QName _ShipmentInstructions_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentInstructions");
    private final static QName _LowerLimit_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LowerLimit");
    private final static QName _DeliveryDateTime_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryDateTime");
    private final static QName _OrderStatusRequestProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusRequestProperties");
    private final static QName _ReplenishmentSummary_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentSummary");
    private final static QName _ReplenishmentProposalChangeBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalChangeBody");
    private final static QName _ModeOfTransportationInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ModeOfTransportationInformation");
    private final static QName _InvoiceIssueDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InvoiceIssueDate");
    private final static QName _ShipmentInstructionsProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentInstructionsProperties");
    private final static QName _LoadTenderMotorPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderMotorPartners");
    private final static QName _ManufacturingIdentificationNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ManufacturingIdentificationNumber");
    private final static QName _RequestIssuedDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestIssuedDate");
    private final static QName _InventoryLocation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryLocation");
    private final static QName _ErrorStatus_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ErrorStatus");
    private final static QName _SampleContainer_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SampleContainer");
    private final static QName _RejectReason_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RejectReason");
    private final static QName _Duration_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Duration");
    private final static QName _EffectiveDates_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "EffectiveDates");
    private final static QName _ProposalProduct_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProposalProduct");
    private final static QName _ForecastedProductMovementReportProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ForecastedProductMovementReportProperties");
    private final static QName _Company_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Company");
    private final static QName _EquipmentDetailsLineNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "EquipmentDetailsLineNumber");
    private final static QName _HazardousClassSubsidiaryCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HazardousClassSubsidiaryCode");
    private final static QName _RateVolume_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RateVolume");
    private final static QName _MonetaryAmount_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MonetaryAmount");
    private final static QName _EquipmentLoadEmptyStatus_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "EquipmentLoadEmptyStatus");
    private final static QName _RespondByDateTime_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RespondByDateTime");
    private final static QName _ProductClassification_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductClassification");
    private final static QName _UnitPrice_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "UnitPrice");
    private final static QName _ShipmentStatusProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentStatusProperties");
    private final static QName _TaxableAmount_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TaxableAmount");
    private final static QName _LoadTenderResponseBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderResponseBody");
    private final static QName _ManufacturerInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ManufacturerInformation");
    private final static QName _RoadTransportInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RoadTransportInformation");
    private final static QName _LoadingLevelIndicator_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadingLevelIndicator");
    private final static QName _LineStatus_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LineStatus");
    private final static QName _DeliveryConfirmationRejectionDescription_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryConfirmationRejectionDescription");
    private final static QName _ShipEndDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipEndDate");
    private final static QName _ContractStatus_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractStatus");
    private final static QName _ContactDescription_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContactDescription");
    private final static QName _CustomsInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CustomsInformation");
    private final static QName _Jurisdiction_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Jurisdiction");
    private final static QName _ShipNoticeListRequestDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipNoticeListRequestDetails");
    private final static QName _PlanProduct_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PlanProduct");
    private final static QName _QuoteIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QuoteIdentifier");
    private final static QName _InvoicePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InvoicePartners");
    private final static QName _ShipmentIndicatorCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentIndicatorCode");
    private final static QName _CostSupportResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportResponseProperties");
    private final static QName _DeliveryConfirmationResponseProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryConfirmationResponseProductLineItem");
    private final static QName _ForecastHorizon_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ForecastHorizon");
    private final static QName _AllowanceChargeList_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AllowanceChargeList");
    private final static QName _LadingIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LadingIdentifier");
    private final static QName _CostSupportAgreementNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportAgreementNumber");
    private final static QName _DemandForecastResponseDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandForecastResponseDetails");
    private final static QName _StorageLocation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "StorageLocation");
    private final static QName _ReplenishmentProposalCancel_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalCancel");
    private final static QName _TaxCertificateType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TaxCertificateType");
    private final static QName _CustomerSpecificCatalogUpdateDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CustomerSpecificCatalogUpdateDetails");
    private final static QName _ProductLabel_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductLabel");
    private final static QName _ForecastedProductMovementProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ForecastedProductMovementProductLineItem");
    private final static QName _RequestedFirstOrderDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestedFirstOrderDate");
    private final static QName _ReplenishmentProposalCancelProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalCancelProperties");
    private final static QName _UnitOfMeasureCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "UnitOfMeasureCode");
    private final static QName _PriceAndAvailabilityResponseBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceAndAvailabilityResponseBody");
    private final static QName _ForecastedProductMovementTransactionProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ForecastedProductMovementTransactionProperties");
    private final static QName _DeliveryTerms_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryTerms");
    private final static QName _TariffIdentification_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TariffIdentification");
    private final static QName _PayableQuantity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PayableQuantity");
    private final static QName _DeliveryProduct_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryProduct");
    private final static QName _OrderChangeBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderChangeBody");
    private final static QName _DemandPlanIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandPlanIdentifier");
    private final static QName _DemandPlan_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandPlan");
    private final static QName _ConveyanceInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ConveyanceInformation");
    private final static QName _TaxOrDuty_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TaxOrDuty");
    private final static QName _OrderStatusListResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusListResponse");
    private final static QName _ReplenishmentProposalChangePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalChangePartners");
    private final static QName _SampleNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SampleNumber");
    private final static QName _ConfirmedPrice_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ConfirmedPrice");
    private final static QName _LoadTenderRailProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderRailProductLineItem");
    private final static QName _RequestedPickupDateTime_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestedPickupDateTime");
    private final static QName _ListPrice_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ListPrice");
    private final static QName _TaxCertificateNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TaxCertificateNumber");
    private final static QName _OrderChange_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderChange");
    private final static QName _UpperLimit_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "UpperLimit");
    private final static QName _ContainerDescription_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContainerDescription");
    private final static QName _DemandPlanProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandPlanProperties");
    private final static QName _SalesOrderIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SalesOrderIdentifier");
    private final static QName _ReplenishmentProposalLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalLineItem");
    private final static QName _PostingCreateLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingCreateLineItem");
    private final static QName _DeliveryReceiptResponseBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryReceiptResponseBody");
    private final static QName _RequestedQuoteResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestedQuoteResponse");
    private final static QName _ThirdPartyLaboratoryDetail_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ThirdPartyLaboratoryDetail");
    private final static QName _Audience_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Audience");
    private final static QName _SourceContainer_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SourceContainer");
    private final static QName _ShipNoticeStatus_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipNoticeStatus");
    private final static QName _From_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "From");
    private final static QName _BatchNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BatchNumber");
    private final static QName _BidInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BidInformation");
    private final static QName _To_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "To");
    private final static QName _PaymentDetailBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentDetailBody");
    private final static QName _ShipNoticeListRequestBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipNoticeListRequestBody");
    private final static QName _UnloadingSequence_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "UnloadingSequence");
    private final static QName _OrderCreateBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderCreateBody");
    private final static QName _PurchaseOrderInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PurchaseOrderInformation");
    private final static QName _OrderResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderResponse");
    private final static QName _LoadBuildingMotorPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadBuildingMotorPartners");
    private final static QName _FullDescription_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FullDescription");
    private final static QName _ReplenishmentProposalResponseDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalResponseDetails");
    private final static QName _PaymentResponsePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentResponsePartners");
    private final static QName _ReplenishmentProposalChangeProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalChangeProperties");
    private final static QName _AcceptanceNotification_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AcceptanceNotification");
    private final static QName _PostingStatusResponseLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingStatusResponseLineItem");
    private final static QName _QualificationResponsePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QualificationResponsePartners");
    private final static QName _ContractDateRanges_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractDateRanges");
    private final static QName _PortOfTranshipmentAllowed_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PortOfTranshipmentAllowed");
    private final static QName _OperationalInstructions_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OperationalInstructions");
    private final static QName _PostBoxNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostBoxNumber");
    private final static QName _ProductMovementReportBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductMovementReportBody");
    private final static QName _SplitBillingPartnerPercentage_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SplitBillingPartnerPercentage");
    private final static QName _LocationType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LocationType");
    private final static QName _MarketingName_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MarketingName");
    private final static QName _ProductSpecification_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductSpecification");
    private final static QName _ImportLicenseAvailableFlag_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ImportLicenseAvailableFlag");
    private final static QName _SellerAccountDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SellerAccountDetails");
    private final static QName _QualificationStatusInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QualificationStatusInformation");
    private final static QName _PrimaryCurrency_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PrimaryCurrency");
    private final static QName _FreightBillTotal_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FreightBillTotal");
    private final static QName _ReferenceInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReferenceInformation");
    private final static QName _ClosingDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ClosingDate");
    private final static QName _Originator_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Originator");
    private final static QName _LineItemRequestedAction_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LineItemRequestedAction");
    private final static QName _DemandPlanResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandPlanResponseProperties");
    private final static QName _ReferenceIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReferenceIdentifier");
    private final static QName _InvoiceNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InvoiceNumber");
    private final static QName _DeliveryConfirmationResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryConfirmationResponse");
    private final static QName _SupplyPlanPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SupplyPlanPartners");
    private final static QName _County_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "County");
    private final static QName _MeasurementRange_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MeasurementRange");
    private final static QName _SealNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SealNumber");
    private final static QName _PriceModifierUp_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceModifierUp");
    private final static QName _SupplyPlanResponseBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SupplyPlanResponseBody");
    private final static QName _Exemption_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Exemption");
    private final static QName _TaxLocation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TaxLocation");
    private final static QName _PostingCreateProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingCreateProperties");
    private final static QName _PostingCreateBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingCreateBody");
    private final static QName _BargeType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BargeType");
    private final static QName _TechnicalName_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TechnicalName");
    private final static QName _RequestForQuoteProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestForQuoteProperties");
    private final static QName _SoldTo_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SoldTo");
    private final static QName _TransportStepNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TransportStepNumber");
    private final static QName _GeographicLocation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "GeographicLocation");
    private final static QName _NetDistributorCost_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "NetDistributorCost");
    private final static QName _ShelfLife_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShelfLife");
    private final static QName _PriceZoneGeography_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceZoneGeography");
    private final static QName _DemandForecastBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandForecastBody");
    private final static QName _FreightBillDateTime_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FreightBillDateTime");
    private final static QName _Forecast_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Forecast");
    private final static QName _SupplyDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SupplyDate");
    private final static QName _PriceSheetInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceSheetInformation");
    private final static QName _ExemptionReason_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ExemptionReason");
    private final static QName _PackagingStackability_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PackagingStackability");
    private final static QName _QualificationStatus_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QualificationStatus");
    private final static QName _NotAvailableInCountryCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "NotAvailableInCountryCode");
    private final static QName _InvoiceType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InvoiceType");
    private final static QName _InvoiceResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InvoiceResponse");
    private final static QName _PurchaseOrderLineItemNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PurchaseOrderLineItemNumber");
    private final static QName _ReplenishmentProposalResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalResponseProperties");
    private final static QName _LoadTenderOcean_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderOcean");
    private final static QName _RequestForCreditReferenceNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestForCreditReferenceNumber");
    private final static QName _TransactionSetPurpose_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TransactionSetPurpose");
    private final static QName _ReceiptSummary_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReceiptSummary");
    private final static QName _LoosePackageCountQuantity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoosePackageCountQuantity");
    private final static QName _RebateInKindQuantity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RebateInKindQuantity");
    private final static QName _PlanHorizon_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PlanHorizon");
    private final static QName _ForecastedProductMovementTransactionPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ForecastedProductMovementTransactionPartners");
    private final static QName _BuyerContractInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BuyerContractInformation");
    private final static QName _ThresholdLimitValueSTEL_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ThresholdLimitValueSTEL");
    private final static QName _ShippingLeadTime_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShippingLeadTime");
    private final static QName _InvoiceDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InvoiceDate");
    private final static QName _ShipmentStatusDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentStatusDetails");
    private final static QName _PaymentDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentDate");
    private final static QName _ReceivingCondition_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReceivingCondition");
    private final static QName _ShipmentStopType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentStopType");
    private final static QName _PriceSheetBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceSheetBody");
    private final static QName _TotalCreditRequested_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TotalCreditRequested");
    private final static QName _ActualValue_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ActualValue");
    private final static QName _PostingAcceptResponseLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingAcceptResponseLineItem");
    private final static QName _ShipmentStatusReasonCodeDescription_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentStatusReasonCodeDescription");
    private final static QName _InventoryUsage_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryUsage");
    private final static QName _Width_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Width");
    private final static QName _VolumetricInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "VolumetricInformation");
    private final static QName _ProductFamilyName_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductFamilyName");
    private final static QName _MeasurementInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MeasurementInformation");
    private final static QName _StatusInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "StatusInformation");
    private final static QName _LoadBuildingResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadBuildingResponse");
    private final static QName _WeightAllowance_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "WeightAllowance");
    private final static QName _ContractResponseTypeCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractResponseTypeCode");
    private final static QName _ThisDocumentDateTime_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ThisDocumentDateTime");
    private final static QName _DemandPlanResponseBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandPlanResponseBody");
    private final static QName _PostingNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingNumber");
    private final static QName _Density_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Density");
    private final static QName _InventoryUsageActual_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryUsageActual");
    private final static QName _MonetaryValue_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MonetaryValue");
    private final static QName _UpperExplosionLimit_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "UpperExplosionLimit");
    private final static QName _Length_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Length");
    private final static QName _ConsignmentPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ConsignmentPartners");
    private final static QName _SplitFactor_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SplitFactor");
    private final static QName _ExchangeRateDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ExchangeRateDate");
    private final static QName _ReceiverSequenceNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReceiverSequenceNumber");
    private final static QName _LoadBuildingResponsePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadBuildingResponsePartners");
    private final static QName _FromUnitOfMeasure_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FromUnitOfMeasure");
    private final static QName _ProductMovementTransactionProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductMovementTransactionProperties");
    private final static QName _ContractResponseProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractResponseProductLineItem");
    private final static QName _CostSupportResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportResponse");
    private final static QName _DeliveryConfirmationPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryConfirmationPartners");
    private final static QName _UnitConversions_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "UnitConversions");
    private final static QName _ForecastProduct_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ForecastProduct");
    private final static QName _TaxIdentifierNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TaxIdentifierNumber");
    private final static QName _MarinePollutantCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MarinePollutantCode");
    private final static QName _TaxRate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TaxRate");
    private final static QName _TermsOfSaleDescription_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TermsOfSaleDescription");
    private final static QName _ProductInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductInformation");
    private final static QName _CostSupportCreditRequestProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportCreditRequestProperties");
    private final static QName _ShipNoticeListRequestProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipNoticeListRequestProperties");
    private final static QName _ShipFrom_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipFrom");
    private final static QName _CostSupportCreditRequestPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportCreditRequestPartners");
    private final static QName _FreightBill_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FreightBill");
    private final static QName _SupportedSellingPrice_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SupportedSellingPrice");
    private final static QName _SpecialProvisionNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SpecialProvisionNumber");
    private final static QName _TransportDocumentInstructions_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TransportDocumentInstructions");
    private final static QName _RequestForQuote_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestForQuote");
    private final static QName _ZoneGeography_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ZoneGeography");
    private final static QName _PostingAccept_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingAccept");
    private final static QName _ContactNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContactNumber");
    private final static QName _AcceptanceNotificationBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AcceptanceNotificationBody");
    private final static QName _LoadBuildingMotorDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadBuildingMotorDetails");
    private final static QName _PaymentTermsBasisDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentTermsBasisDate");
    private final static QName _LoadBuildingResponseDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadBuildingResponseDetails");
    private final static QName _AddressLine_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AddressLine");
    private final static QName _TaxAmountTotal_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TaxAmountTotal");
    private final static QName _PriceAndAvailabilityRequestBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceAndAvailabilityRequestBody");
    private final static QName _PlannedEndUse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PlannedEndUse");
    private final static QName _CustomsCostInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CustomsCostInformation");
    private final static QName _CostSupportResponseStatusInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportResponseStatusInformation");
    private final static QName _HazardousIdentification_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HazardousIdentification");
    private final static QName _CHRISCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CHRISCode");
    private final static QName _ProductSubLineItems_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductSubLineItems");
    private final static QName _ContractProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractProperties");
    private final static QName _FreightBillType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FreightBillType");
    private final static QName _LocationIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LocationIdentifier");
    private final static QName _ShipDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipDate");
    private final static QName _ContractResponsePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractResponsePartners");
    private final static QName _CustomerSpecificCatalogUpdatePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CustomerSpecificCatalogUpdatePartners");
    private final static QName _NonExemptionReason_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "NonExemptionReason");
    private final static QName _MaximumSalesVolume_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MaximumSalesVolume");
    private final static QName _ReceiptNoticeBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReceiptNoticeBody");
    private final static QName _ReceiptNoticeProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReceiptNoticeProperties");
    private final static QName _QualificationResponseBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QualificationResponseBody");
    private final static QName _TimeOfDayRange_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TimeOfDayRange");
    private final static QName _KinematicViscosity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "KinematicViscosity");
    private final static QName _ShipNoticeDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipNoticeDate");
    private final static QName _PriceAndAvailabilityRequestDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceAndAvailabilityRequestDetails");
    private final static QName _LoadingSequence_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadingSequence");
    private final static QName _PaymentDetailLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentDetailLineItem");
    private final static QName _AcceptanceNotificationPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AcceptanceNotificationPartners");
    private final static QName _PricingPercentage_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PricingPercentage");
    private final static QName _DeliveryPoint_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryPoint");
    private final static QName _ConfirmationNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ConfirmationNumber");
    private final static QName _Weight_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Weight");
    private final static QName _RiskCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RiskCode");
    private final static QName _AdditionalInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AdditionalInformation");
    private final static QName _ContractIssuedDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractIssuedDate");
    private final static QName _ForecastedProductMovementTransactionDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ForecastedProductMovementTransactionDetails");
    private final static QName _Adjustment_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Adjustment");
    private final static QName _PostingAcceptLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingAcceptLineItem");
    private final static QName _MarpolCategory_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MarpolCategory");
    private final static QName _StandardIndustrialClassificationNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "StandardIndustrialClassificationNumber");
    private final static QName _LoadTenderResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderResponseProperties");
    private final static QName _SupplyPlanIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SupplyPlanIdentifier");
    private final static QName _OrderStatusListResponseDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusListResponseDetails");
    private final static QName _Resolution_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Resolution");
    private final static QName _DeliveryGroup_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryGroup");
    private final static QName _RequestForQuoteBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestForQuoteBody");
    private final static QName _CertificateOfAnalysisBatchDetail_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CertificateOfAnalysisBatchDetail");
    private final static QName _Contract_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Contract");
    private final static QName _HazardousMarkingNotation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HazardousMarkingNotation");
    private final static QName _CurrencyCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CurrencyCode");
    private final static QName _Penalty_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Penalty");
    private final static QName _ShipStartDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipStartDate");
    private final static QName _PostingInstructions_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingInstructions");
    private final static QName _DemandForecastPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandForecastPartners");
    private final static QName _EULabelingRegulations_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "EULabelingRegulations");
    private final static QName _BorderExit_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BorderExit");
    private final static QName _AllowanceChargeID_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AllowanceChargeID");
    private final static QName _PSNSupplement_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PSNSupplement");
    private final static QName _DemandForecastResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandForecastResponseProperties");
    private final static QName _OrderStatusListRequestProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusListRequestProperties");
    private final static QName _InventoryOther_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryOther");
    private final static QName _DemandForecast_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandForecast");
    private final static QName _BillTo_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BillTo");
    private final static QName _QualitativeResult_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QualitativeResult");
    private final static QName _ReverseChargeFlag_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReverseChargeFlag");
    private final static QName _ZoneID_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ZoneID");
    private final static QName _LoadTenderNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderNumber");
    private final static QName _LoadBuildingMotorProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadBuildingMotorProperties");
    private final static QName _OrderChangeProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderChangeProperties");
    private final static QName _AdditionalHandlingInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AdditionalHandlingInformation");
    private final static QName _LoadTenderRail_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderRail");
    private final static QName _HazardousFormattedText_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HazardousFormattedText");
    private final static QName _Amount_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Amount");
    private final static QName _DocumentRecipientPartner_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DocumentRecipientPartner");
    private final static QName _RelativeDueDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RelativeDueDate");
    private final static QName _Buyer_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Buyer");
    private final static QName _TaxableFlag_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TaxableFlag");
    private final static QName _TestResult_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TestResult");
    private final static QName _InvoiceBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InvoiceBody");
    private final static QName _RequestedShipDateTime_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestedShipDateTime");
    private final static QName _Routing_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Routing");
    private final static QName _DocumentReference_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DocumentReference");
    private final static QName _PostingResponseDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingResponseDetails");
    private final static QName _ReplenishmentProposalRequest_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalRequest");
    private final static QName _DeliveryTolerances_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryTolerances");
    private final static QName _ShippingAvailabilityDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShippingAvailabilityDate");
    private final static QName _LineItemDebitCreditIndicator_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LineItemDebitCreditIndicator");
    private final static QName _IncidentCategoryCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "IncidentCategoryCode");
    private final static QName _ResponseInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ResponseInformation");
    private final static QName _RequestedPackaging_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestedPackaging");
    private final static QName _PaymentTermsGroup_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentTermsGroup");
    private final static QName _RequisitionTypeCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequisitionTypeCode");
    private final static QName _OrderStatusResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusResponse");
    private final static QName _CarrierEquipmentCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CarrierEquipmentCode");
    private final static QName _DemandForecastResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandForecastResponse");
    private final static QName _CertificateOfAnalysisPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CertificateOfAnalysisPartners");
    private final static QName _MarineTransportInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MarineTransportInformation");
    private final static QName _CostSupportPerUnit_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportPerUnit");
    private final static QName _PostingResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingResponseProperties");
    private final static QName _CharacteristicDescription_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CharacteristicDescription");
    private final static QName _ReplenishmentProposalRequestProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalRequestProperties");
    private final static QName _PlanQuantity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PlanQuantity");
    private final static QName _ProductDescription_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductDescription");
    private final static QName _InventoryActualUsageResponseDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryActualUsageResponseDetails");
    private final static QName _NumberPackagingUnits_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "NumberPackagingUnits");
    private final static QName _ScheduleDateTimeInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ScheduleDateTimeInformation");
    private final static QName _NonExemptTotals_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "NonExemptTotals");
    private final static QName _CurrencyRate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CurrencyRate");
    private final static QName _ZoneName_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ZoneName");
    private final static QName _PaymentTermsID_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentTermsID");
    private final static QName _Discounts_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Discounts");
    private final static QName _InventoryActualUsageDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryActualUsageDetails");
    private final static QName _ChemicalAbstractsServiceRegistryNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ChemicalAbstractsServiceRegistryNumber");
    private final static QName _LoadTenderMotorBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderMotorBody");
    private final static QName _CustomerRequestedDeliveryHoldFlag_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CustomerRequestedDeliveryHoldFlag");
    private final static QName _PriceAndAvailabilityRequestProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceAndAvailabilityRequestProductLineItem");
    private final static QName _DistributorCost_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DistributorCost");
    private final static QName _HazardousReportableQuantityIndicator_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HazardousReportableQuantityIndicator");
    private final static QName _CarrierWeights_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CarrierWeights");
    private final static QName _Split_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Split");
    private final static QName _LoadTenderRailPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderRailPartners");
    private final static QName _NFPACode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "NFPACode");
    private final static QName _PartnerInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PartnerInformation");
    private final static QName _DeliveryReceiptResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryReceiptResponse");
    private final static QName _DangerousSubstanceHandling_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DangerousSubstanceHandling");
    private final static QName _InlandWaterTransportInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InlandWaterTransportInformation");
    private final static QName _CertificateOfAnalysisDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CertificateOfAnalysisDetails");
    private final static QName _QualityTestingReportDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QualityTestingReportDetails");
    private final static QName _PostingType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingType");
    private final static QName _ProductMovementTransactions_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductMovementTransactions");
    private final static QName _ProductCatalogUpdateProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductCatalogUpdateProperties");
    private final static QName _CostSupportCreditResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportCreditResponseProperties");
    private final static QName _SafetyPhrase_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SafetyPhrase");
    private final static QName _PartnerName_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PartnerName");
    private final static QName _CreditCardExpirationDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CreditCardExpirationDate");
    private final static QName _DeliveryContent_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryContent");
    private final static QName _DemandPlanResponseDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandPlanResponseDetails");
    private final static QName _LetterOfCreditInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LetterOfCreditInformation");
    private final static QName _SupplyPlanResponseDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SupplyPlanResponseDetails");
    private final static QName _CertificateOfAnalysisProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CertificateOfAnalysisProperties");
    private final static QName _CostSupportRequestChangeBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportRequestChangeBody");
    private final static QName _PriceAndAvailabilityResponsePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceAndAvailabilityResponsePartners");
    private final static QName _OrderStatusResponsePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusResponsePartners");
    private final static QName _MarketPlaceDocumentReference_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MarketPlaceDocumentReference");
    private final static QName _Tariff_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Tariff");
    private final static QName _ManufactureDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ManufactureDate");
    private final static QName _OrderResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderResponseProperties");
    private final static QName _NumberOfUnits_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "NumberOfUnits");
    private final static QName _AcceptanceNotificationIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AcceptanceNotificationIdentifier");
    private final static QName _CompatibilityGroupCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CompatibilityGroupCode");
    private final static QName _Distributor_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Distributor");
    private final static QName _ProductAttributeName_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductAttributeName");
    private final static QName _LoadTenderOceanBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderOceanBody");
    private final static QName _TestValue_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TestValue");
    private final static QName _LoadTenderRailProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderRailProperties");
    private final static QName _RailTransportInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RailTransportInformation");
    private final static QName _LoadDockHours_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadDockHours");
    private final static QName _RiskDescription_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RiskDescription");
    private final static QName _BorderCrossingPoint_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BorderCrossingPoint");
    private final static QName _HazardousGoods_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HazardousGoods");
    private final static QName _CostSupportResponsePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportResponsePartners");
    private final static QName _ProductGradeDescription_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductGradeDescription");
    private final static QName _Instructions_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Instructions");
    private final static QName _ReceiptQuantity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReceiptQuantity");
    private final static QName _AllowanceChargeType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AllowanceChargeType");
    private final static QName _Characteristic_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Characteristic");
    private final static QName _TaxTypeCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TaxTypeCode");
    private final static QName _CostSupportResponseDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportResponseDetails");
    private final static QName _BondedWarehouseRelease_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BondedWarehouseRelease");
    private final static QName _ShipmentDateReference_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentDateReference");
    private final static QName _LoadBuildingType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadBuildingType");
    private final static QName _DeliveryTermsCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryTermsCode");
    private final static QName _PortDeliveryPoint_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PortDeliveryPoint");
    private final static QName _ReferencedPriceSheet_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReferencedPriceSheet");
    private final static QName _PostingCancelProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingCancelProperties");
    private final static QName _SubLineItemNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SubLineItemNumber");
    private final static QName _EmergencyResponsePlanNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "EmergencyResponsePlanNumber");
    private final static QName _PriceSheetProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceSheetProperties");
    private final static QName _Keywords_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Keywords");
    private final static QName _InlandDestinationPointCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InlandDestinationPointCode");
    private final static QName _SupportedProduct_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SupportedProduct");
    private final static QName _PaymentProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentProperties");
    private final static QName _DeliveryReceiptResponsePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryReceiptResponsePartners");
    private final static QName _ReceiptNoticeReason_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReceiptNoticeReason");
    private final static QName _EstimatedTimeOfArrivalDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "EstimatedTimeOfArrivalDate");
    private final static QName _MovementType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MovementType");
    private final static QName _PostingChange_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingChange");
    private final static QName _SpecifiedMeasurement_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SpecifiedMeasurement");
    private final static QName _AcceptanceNotificationLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AcceptanceNotificationLineItem");
    private final static QName _SalesVolume_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SalesVolume");
    private final static QName _RequisitionNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequisitionNumber");
    private final static QName _ContractCommitmentType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractCommitmentType");
    private final static QName _RegulationCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RegulationCode");
    private final static QName _ExternalReference_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ExternalReference");
    private final static QName _OriginatorSequenceNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OriginatorSequenceNumber");
    private final static QName _LadingDescription_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LadingDescription");
    private final static QName _Berth_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Berth");
    private final static QName _PHValue_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PHValue");
    private final static QName _PriceSheetDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceSheetDetails");
    private final static QName _InvoiceDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InvoiceDetails");
    private final static QName _DeliveryReceipt_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryReceipt");
    private final static QName _FreightBillDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FreightBillDetails");
    private final static QName _ReplenishmentProposalCancelPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalCancelPartners");
    private final static QName _InventoryUsageLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryUsageLineItem");
    private final static QName _SpecificGravity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SpecificGravity");
    private final static QName _PackagingDimensions_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PackagingDimensions");
    private final static QName _CostSupportCreditRequestBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportCreditRequestBody");
    private final static QName _PriceReason_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceReason");
    private final static QName _FlammableLiquidsFireClass_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FlammableLiquidsFireClass");
    private final static QName _DangerIndicationText_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DangerIndicationText");
    private final static QName _QualityTestingReport_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QualityTestingReport");
    private final static QName _PostingAcceptPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingAcceptPartners");
    private final static QName _NAICSNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "NAICSNumber");
    private final static QName _ProductSpecificationName_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductSpecificationName");
    private final static QName _CostSupportRequestProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportRequestProperties");
    private final static QName _LoadTenderRailBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderRailBody");
    private final static QName _AllowanceChargeAmount_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AllowanceChargeAmount");
    private final static QName _CostSupportRequestNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportRequestNumber");
    private final static QName _CostSupportRequestDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportRequestDetails");
    private final static QName _ProductSpecificationUnit_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductSpecificationUnit");
    private final static QName _SupplyPlanBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SupplyPlanBody");
    private final static QName _PierName_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PierName");
    private final static QName _RegulationName_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RegulationName");
    private final static QName _HazardousGoodsSymbol_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HazardousGoodsSymbol");
    private final static QName _AllowanceChargeRateInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AllowanceChargeRateInformation");
    private final static QName _InventoryActualUsage_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryActualUsage");
    private final static QName _DeliveryReceiptBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryReceiptBody");
    private final static QName _ShipmentStatusRequest_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentStatusRequest");
    private final static QName _ContractTypeCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractTypeCode");
    private final static QName _PackagingVolume_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PackagingVolume");
    private final static QName _CostSupportCreditRequestDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportCreditRequestDetails");
    private final static QName _Invoice_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Invoice");
    private final static QName _PackagingContainerInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PackagingContainerInformation");
    private final static QName _SeverityLevel_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SeverityLevel");
    private final static QName _LocationTo_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LocationTo");
    private final static QName _ProductCatalogUpdate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductCatalogUpdate");
    private final static QName _RequestingDocumentIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestingDocumentIdentifier");
    private final static QName _LowerExplosionLimit_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LowerExplosionLimit");
    private final static QName _Regulation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Regulation");
    private final static QName _PaymentDetailDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentDetailDetails");
    private final static QName _PaymentTermsBasisDateCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentTermsBasisDateCode");
    private final static QName _PaymentResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentResponseProperties");
    private final static QName _USGoodsReturned_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "USGoodsReturned");
    private final static QName _LoadTenderOceanDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderOceanDetails");
    private final static QName _ResponseStatusReasonDescription_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ResponseStatusReasonDescription");
    private final static QName _ContractAmount_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractAmount");
    private final static QName _ReplenishmentProposalCancelBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalCancelBody");
    private final static QName _LineItemStatusInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LineItemStatusInformation");
    private final static QName _DemandPlanResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandPlanResponse");
    private final static QName _ContainerType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContainerType");
    private final static QName _ContractResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractResponse");
    private final static QName _QualificationRequestPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QualificationRequestPartners");
    private final static QName _ContractResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractResponseProperties");
    private final static QName _DemandPlanLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandPlanLineItem");
    private final static QName _RateBasis_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RateBasis");
    private final static QName _PricingPerUnit_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PricingPerUnit");
    private final static QName _ResponseStatusComments_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ResponseStatusComments");
    private final static QName _PercentDue_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PercentDue");
    private final static QName _ShippingTolerances_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShippingTolerances");
    private final static QName _PackagingTypeCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PackagingTypeCode");
    private final static QName _LadingFreightClass_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LadingFreightClass");
    private final static QName _LoadTenderMotor_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderMotor");
    private final static QName _PaymentDetailPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentDetailPartners");
    private final static QName _ScaleDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ScaleDate");
    private final static QName _AcceptableTextValues_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AcceptableTextValues");
    private final static QName _QualificationRequestBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QualificationRequestBody");
    private final static QName _InventoryUsageLocation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryUsageLocation");
    private final static QName _LetterOfCreditVoyageDateTime_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LetterOfCreditVoyageDateTime");
    private final static QName _LineItemTotalAmount_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LineItemTotalAmount");
    private final static QName _LoadTenderDateTime_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderDateTime");
    private final static QName _TotalNumberOfPackages_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TotalNumberOfPackages");
    private final static QName _Exempt_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Exempt");
    private final static QName _BookingNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BookingNumber");
    private final static QName _ShipmentStatusCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentStatusCode");
    private final static QName _CustomsAllowances_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CustomsAllowances");
    private final static QName _ExemptionSource_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ExemptionSource");
    private final static QName _ShipmentQualifierCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentQualifierCode");
    private final static QName _ForecastedProductMovementTransactions_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ForecastedProductMovementTransactions");
    private final static QName _PriceSheetPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceSheetPartners");
    private final static QName _RateWeight_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RateWeight");
    private final static QName _PercentDiscount_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PercentDiscount");
    private final static QName _FreightBillStatus_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FreightBillStatus");
    private final static QName _LoadTenderMotorDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderMotorDetails");
    private final static QName _ApproximateWeight_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ApproximateWeight");
    private final static QName _DemandPlanPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandPlanPartners");
    private final static QName _RequisitionLineItemNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequisitionLineItemNumber");
    private final static QName _ShipmentInstructionsDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentInstructionsDetails");
    private final static QName _ProductCatalogUpdateBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductCatalogUpdateBody");
    private final static QName _RequestedDocumentTypeCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestedDocumentTypeCode");
    private final static QName _ContractProductInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractProductInformation");
    private final static QName _PriceSheetEffectiveDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceSheetEffectiveDate");
    private final static QName _ReplenishmentProposalResponsePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalResponsePartners");
    private final static QName _ElevatedTemperatureLabel_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ElevatedTemperatureLabel");
    private final static QName _RFQIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RFQIdentifier");
    private final static QName _LoadTenderOceanProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderOceanProductLineItem");
    private final static QName _PackagingInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PackagingInformation");
    private final static QName _TranshipmentInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TranshipmentInformation");
    private final static QName _TotalWeightOfPallets_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TotalWeightOfPallets");
    private final static QName _AdvisingBank_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AdvisingBank");
    private final static QName _IndividualExemptionNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "IndividualExemptionNumber");
    private final static QName _LoadTenderOceanProductSubLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderOceanProductSubLineItem");
    private final static QName _CostSupportRequestChangeDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportRequestChangeDetails");
    private final static QName _ImportLicenseNeededFlag_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ImportLicenseNeededFlag");
    private final static QName _PostingCreate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingCreate");
    private final static QName _FreightBillBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FreightBillBody");
    private final static QName _DeliveryReceiptProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryReceiptProperties");
    private final static QName _HazardousGoodsDangerIndication_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HazardousGoodsDangerIndication");
    private final static QName _OrderStatusResponseProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusResponseProductLineItem");
    private final static QName _SupplyPlanResponse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SupplyPlanResponse");
    private final static QName _ContractInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractInformation");
    private final static QName _QualificationRequestProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QualificationRequestProperties");
    private final static QName _PostingStatusResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingStatusResponseProperties");
    private final static QName _TareWeight_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TareWeight");
    private final static QName _InvoiceResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InvoiceResponseProperties");
    private final static QName _SurfaceLayerPositionCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SurfaceLayerPositionCode");
    private final static QName _PriceAndAvailabilityResponseProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceAndAvailabilityResponseProductLineItem");
    private final static QName _CatalogIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CatalogIdentifier");
    private final static QName _TotalNumberOfEquipment_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TotalNumberOfEquipment");
    private final static QName _ReviewDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReviewDate");
    private final static QName _StateOrProvince_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "StateOrProvince");
    private final static QName _CustomerSpecificCatalogUpdate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CustomerSpecificCatalogUpdate");
    private final static QName _InvoiceMode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InvoiceMode");
    private final static QName _CertificateOfAnalysisBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CertificateOfAnalysisBody");
    private final static QName _SupplyPlanResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SupplyPlanResponseProperties");
    private final static QName _ToDateTime_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ToDateTime");
    private final static QName _CarrierWeightsPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CarrierWeightsPartners");
    private final static QName _PostingCancelResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingCancelResponseProperties");
    private final static QName _SupplyPlanLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SupplyPlanLineItem");
    private final static QName _DeliveryConfirmationResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryConfirmationResponseProperties");
    private final static QName _ContractResponseCommitmentType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractResponseCommitmentType");
    private final static QName _ReceivingConditionCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReceivingConditionCode");
    private final static QName _PostingChangeDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingChangeDetails");
    private final static QName _Status_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Status");
    private final static QName _ShipmentStatusReasonCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentStatusReasonCode");
    private final static QName _PaymentTermsOfSale_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentTermsOfSale");
    private final static QName _State_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "State");
    private final static QName _DeliveryConfirmationResponseDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryConfirmationResponseDetails");
    private final static QName _MinimumSalesVolume_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MinimumSalesVolume");
    private final static QName _PriceAndAvailabilityResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceAndAvailabilityResponseProperties");
    private final static QName _AllowanceChargeDescription_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AllowanceChargeDescription");
    private final static QName _ContainerSerialNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContainerSerialNumber");
    private final static QName _DeliveryConfirmationDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryConfirmationDetails");
    private final static QName _UnitVolume_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "UnitVolume");
    private final static QName _AssociatedEquipment_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AssociatedEquipment");
    private final static QName _CustomerSpecificCatalogUpdateProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CustomerSpecificCatalogUpdateProductLineItem");
    private final static QName _IncidentAccountabilityCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "IncidentAccountabilityCode");
    private final static QName _ShipmentInstructionsBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentInstructionsBody");
    private final static QName _CompetitiveInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CompetitiveInformation");
    private final static QName _ShippingTotalAmount_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShippingTotalAmount");
    private final static QName _ThisDocumentIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ThisDocumentIdentifier");
    private final static QName _PriceAndAvailabilityRequestProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceAndAvailabilityRequestProperties");
    private final static QName _PriceSheetReason_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceSheetReason");
    private final static QName _DemandForecastProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandForecastProperties");
    private final static QName _PostingAcceptResponseBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingAcceptResponseBody");
    private final static QName _ProductQuantity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductQuantity");
    private final static QName _AirTransportInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AirTransportInformation");
    private final static QName _MarketPlaceBuyerIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MarketPlaceBuyerIdentifier");
    private final static QName _PostingCancelBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingCancelBody");
    private final static QName _OrderStatusListResponseProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusListResponseProperties");
    private final static QName _OrderStatusListRequestDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusListRequestDetails");
    private final static QName _ChamberRelatedTemperatureRange_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ChamberRelatedTemperatureRange");
    private final static QName _FinancialInstitutionIdentification_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FinancialInstitutionIdentification");
    private final static QName _DueDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DueDate");
    private final static QName _PriceApplicabilityCriteria_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceApplicabilityCriteria");
    private final static QName _RoutingInstructions_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RoutingInstructions");
    private final static QName _ProductEndUse_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductEndUse");
    private final static QName _MinimumQuantity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MinimumQuantity");
    private final static QName _Seller_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Seller");
    private final static QName _UNPortableTankCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "UNPortableTankCode");
    private final static QName _EquipmentOwnershipCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "EquipmentOwnershipCode");
    private final static QName _ZoneType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ZoneType");
    private final static QName _ShipmentStatusCodeDescription_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentStatusCodeDescription");
    private final static QName _ExchangeRate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ExchangeRate");
    private final static QName _PriceZoneGeographyList_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceZoneGeographyList");
    private final static QName _PostingCancelResponseBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingCancelResponseBody");
    private final static QName _ReplenishmentProposalRequestProduct_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalRequestProduct");
    private final static QName _SupplyPlanDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SupplyPlanDetails");
    private final static QName _RequestedAgreementPeriod_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestedAgreementPeriod");
    private final static QName _ForecastedProductMovementTransaction_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ForecastedProductMovementTransaction");
    private final static QName _RequestedDeliveryDateTime_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestedDeliveryDateTime");
    private final static QName _Pricing_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Pricing");
    private final static QName _PriceSheetPriceData_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceSheetPriceData");
    private final static QName _DeferredDueDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeferredDueDate");
    private final static QName _PaymentDueDate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentDueDate");
    private final static QName _DemandPlanResponsePartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandPlanResponsePartners");
    private final static QName _AllowanceChargeRate_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AllowanceChargeRate");
    private final static QName _Bureau_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Bureau");
    private final static QName _ShippedQuantity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShippedQuantity");
    private final static QName _LoadTenderInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderInformation");
    private final static QName _LoadBuildingResponseBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadBuildingResponseBody");
    private final static QName _LineItemTaxableTotal_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LineItemTaxableTotal");
    private final static QName _NonHazardousFlag_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "NonHazardousFlag");
    private final static QName _DocumentIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DocumentIdentifier");
    private final static QName _DeletionStatus_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeletionStatus");
    private final static QName _LoadingPoint_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadingPoint");
    private final static QName _OrderCreateProperties_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderCreateProperties");
    private final static QName _RoundingFactor_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RoundingFactor");
    private final static QName _PostingStatusResponseDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingStatusResponseDetails");
    private final static QName _SelfBillingFlag_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SelfBillingFlag");
    private final static QName _PurchaseOrderIssuedDateRange_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PurchaseOrderIssuedDateRange");
    private final static QName _MaximumQuantity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MaximumQuantity");
    private final static QName _ProjectedVolume_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProjectedVolume");
    private final static QName _RatedValue_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RatedValue");
    private final static QName _BuyerTransactionNumber_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BuyerTransactionNumber");
    private final static QName _PercentDeferredPayable_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PercentDeferredPayable");
    private final static QName _ShipmentStatus_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentStatus");
    private final static QName _ReceivedQuantity_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReceivedQuantity");
    private final static QName _LoadingCapacityRange_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadingCapacityRange");
    private final static QName _DeferredAmount_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeferredAmount");
    private final static QName _CostSupportOrderType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportOrderType");
    private final static QName _LocationCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LocationCode");
    private final static QName _NumberOfCopies_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "NumberOfCopies");
    private final static QName _ContractProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractProductLineItem");
    private final static QName _ReplenishmentProposalRequestContent_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalRequestContent");
    private final static QName _Restrictions_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Restrictions");
    private final static QName _ProductFeatures_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductFeatures");
    private final static QName _IncidentCauseCode_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "IncidentCauseCode");
    private final static QName _DemandPlanDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandPlanDetails");
    private final static QName _BarCodeDataIdentifier_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BarCodeDataIdentifier");
    private final static QName _ChangesAllowed_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ChangesAllowed");
    private final static QName _RequestType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestType");
    private final static QName _ProductMovementTransactionPartners_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductMovementTransactionPartners");
    private final static QName _CarrierReferenceInformation_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CarrierReferenceInformation");
    private final static QName _PriceSheetProductLineItem_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceSheetProductLineItem");
    private final static QName _PostingResponseBody_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingResponseBody");
    private final static QName _PackagingType_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PackagingType");
    private final static QName _DeliveryReceiptDetails_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryReceiptDetails");
    private final static QName _ExemptTotal_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ExemptTotal");
    private final static QName _CityName_QNAME = new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CityName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.monsanto.cidx.header.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequisitionNumberType }
     * 
     */
    public RequisitionNumberType createRequisitionNumberType() {
        return new RequisitionNumberType();
    }

    /**
     * Create an instance of {@link TimeOfDayRangeType }
     * 
     */
    public TimeOfDayRangeType createTimeOfDayRangeType() {
        return new TimeOfDayRangeType();
    }

    /**
     * Create an instance of {@link WidthType }
     * 
     */
    public WidthType createWidthType() {
        return new WidthType();
    }

    /**
     * Create an instance of {@link RegulationType }
     * 
     */
    public RegulationType createRegulationType() {
        return new RegulationType();
    }

    /**
     * Create an instance of {@link ConveyanceInformationType }
     * 
     */
    public ConveyanceInformationType createConveyanceInformationType() {
        return new ConveyanceInformationType();
    }

    /**
     * Create an instance of {@link DateTimeInformationType }
     * 
     */
    public DateTimeInformationType createDateTimeInformationType() {
        return new DateTimeInformationType();
    }

    /**
     * Create an instance of {@link ConfirmedPriceType }
     * 
     */
    public ConfirmedPriceType createConfirmedPriceType() {
        return new ConfirmedPriceType();
    }

    /**
     * Create an instance of {@link OrderStatusRequestPartnersType }
     * 
     */
    public OrderStatusRequestPartnersType createOrderStatusRequestPartnersType() {
        return new OrderStatusRequestPartnersType();
    }

    /**
     * Create an instance of {@link ReferencedPriceSheetType }
     * 
     */
    public ReferencedPriceSheetType createReferencedPriceSheetType() {
        return new ReferencedPriceSheetType();
    }

    /**
     * Create an instance of {@link PurchaseOrderNumberType }
     * 
     */
    public PurchaseOrderNumberType createPurchaseOrderNumberType() {
        return new PurchaseOrderNumberType();
    }

    /**
     * Create an instance of {@link PriceZoneGeographyType }
     * 
     */
    public PriceZoneGeographyType createPriceZoneGeographyType() {
        return new PriceZoneGeographyType();
    }

    /**
     * Create an instance of {@link PriceShippingTermsType }
     * 
     */
    public PriceShippingTermsType createPriceShippingTermsType() {
        return new PriceShippingTermsType();
    }

    /**
     * Create an instance of {@link PlanHorizonType }
     * 
     */
    public PlanHorizonType createPlanHorizonType() {
        return new PlanHorizonType();
    }

    /**
     * Create an instance of {@link FixedContractPriceDateType }
     * 
     */
    public FixedContractPriceDateType createFixedContractPriceDateType() {
        return new FixedContractPriceDateType();
    }

    /**
     * Create an instance of {@link CharacteristicType }
     * 
     */
    public CharacteristicType createCharacteristicType() {
        return new CharacteristicType();
    }

    /**
     * Create an instance of {@link CreditCardExpirationDateType }
     * 
     */
    public CreditCardExpirationDateType createCreditCardExpirationDateType() {
        return new CreditCardExpirationDateType();
    }

    /**
     * Create an instance of {@link ResponseStatusType }
     * 
     */
    public ResponseStatusType createResponseStatusType() {
        return new ResponseStatusType();
    }

    /**
     * Create an instance of {@link PlanType }
     * 
     */
    public PlanType createPlanType() {
        return new PlanType();
    }

    /**
     * Create an instance of {@link CarrierType }
     * 
     */
    public CarrierType createCarrierType() {
        return new CarrierType();
    }

    /**
     * Create an instance of {@link InvoiceResponseBodyType }
     * 
     */
    public InvoiceResponseBodyType createInvoiceResponseBodyType() {
        return new InvoiceResponseBodyType();
    }

    /**
     * Create an instance of {@link ForecastProductType }
     * 
     */
    public ForecastProductType createForecastProductType() {
        return new ForecastProductType();
    }

    /**
     * Create an instance of {@link PostingChangeType }
     * 
     */
    public PostingChangeType createPostingChangeType() {
        return new PostingChangeType();
    }

    /**
     * Create an instance of {@link LoadTenderRailPartnersType }
     * 
     */
    public LoadTenderRailPartnersType createLoadTenderRailPartnersType() {
        return new LoadTenderRailPartnersType();
    }

    /**
     * Create an instance of {@link SourceCurrencyType }
     * 
     */
    public SourceCurrencyType createSourceCurrencyType() {
        return new SourceCurrencyType();
    }

    /**
     * Create an instance of {@link NetWeightType }
     * 
     */
    public NetWeightType createNetWeightType() {
        return new NetWeightType();
    }

    /**
     * Create an instance of {@link ContractAmountType }
     * 
     */
    public ContractAmountType createContractAmountType() {
        return new ContractAmountType();
    }

    /**
     * Create an instance of {@link InventoryActualUsageType }
     * 
     */
    public InventoryActualUsageType createInventoryActualUsageType() {
        return new InventoryActualUsageType();
    }

    /**
     * Create an instance of {@link TransportMethodCodeType }
     * 
     */
    public TransportMethodCodeType createTransportMethodCodeType() {
        return new TransportMethodCodeType();
    }

    /**
     * Create an instance of {@link PaymentFormatCodeType }
     * 
     */
    public PaymentFormatCodeType createPaymentFormatCodeType() {
        return new PaymentFormatCodeType();
    }

    /**
     * Create an instance of {@link EstimatedTimeOfDepartureDateType }
     * 
     */
    public EstimatedTimeOfDepartureDateType createEstimatedTimeOfDepartureDateType() {
        return new EstimatedTimeOfDepartureDateType();
    }

    /**
     * Create an instance of {@link ShipperType }
     * 
     */
    public ShipperType createShipperType() {
        return new ShipperType();
    }

    /**
     * Create an instance of {@link DistributorCostType }
     * 
     */
    public DistributorCostType createDistributorCostType() {
        return new DistributorCostType();
    }

    /**
     * Create an instance of {@link ContractIssuedDateType }
     * 
     */
    public ContractIssuedDateType createContractIssuedDateType() {
        return new ContractIssuedDateType();
    }

    /**
     * Create an instance of {@link NonExemptType }
     * 
     */
    public NonExemptType createNonExemptType() {
        return new NonExemptType();
    }

    /**
     * Create an instance of {@link PriceSheetPartnersType }
     * 
     */
    public PriceSheetPartnersType createPriceSheetPartnersType() {
        return new PriceSheetPartnersType();
    }

    /**
     * Create an instance of {@link OrderResponseType }
     * 
     */
    public OrderResponseType createOrderResponseType() {
        return new OrderResponseType();
    }

    /**
     * Create an instance of {@link SplitType }
     * 
     */
    public SplitType createSplitType() {
        return new SplitType();
    }

    /**
     * Create an instance of {@link DeliveryTermsType }
     * 
     */
    public DeliveryTermsType createDeliveryTermsType() {
        return new DeliveryTermsType();
    }

    /**
     * Create an instance of {@link DeliveryConfirmationResponseBodyType }
     * 
     */
    public DeliveryConfirmationResponseBodyType createDeliveryConfirmationResponseBodyType() {
        return new DeliveryConfirmationResponseBodyType();
    }

    /**
     * Create an instance of {@link EquipmentOwnershipCodeType }
     * 
     */
    public EquipmentOwnershipCodeType createEquipmentOwnershipCodeType() {
        return new EquipmentOwnershipCodeType();
    }

    /**
     * Create an instance of {@link LetterOfCreditQuantityType }
     * 
     */
    public LetterOfCreditQuantityType createLetterOfCreditQuantityType() {
        return new LetterOfCreditQuantityType();
    }

    /**
     * Create an instance of {@link ProductMovementTransactionDetailsType }
     * 
     */
    public ProductMovementTransactionDetailsType createProductMovementTransactionDetailsType() {
        return new ProductMovementTransactionDetailsType();
    }

    /**
     * Create an instance of {@link DeliveryReceiptBodyType }
     * 
     */
    public DeliveryReceiptBodyType createDeliveryReceiptBodyType() {
        return new DeliveryReceiptBodyType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalChangeDetailsType }
     * 
     */
    public ReplenishmentProposalChangeDetailsType createReplenishmentProposalChangeDetailsType() {
        return new ReplenishmentProposalChangeDetailsType();
    }

    /**
     * Create an instance of {@link TestSpecificationType }
     * 
     */
    public TestSpecificationType createTestSpecificationType() {
        return new TestSpecificationType();
    }

    /**
     * Create an instance of {@link InvoiceQuantityType }
     * 
     */
    public InvoiceQuantityType createInvoiceQuantityType() {
        return new InvoiceQuantityType();
    }

    /**
     * Create an instance of {@link AcceptanceNotificationBodyType }
     * 
     */
    public AcceptanceNotificationBodyType createAcceptanceNotificationBodyType() {
        return new AcceptanceNotificationBodyType();
    }

    /**
     * Create an instance of {@link DeliveryConfirmationResponsePropertiesType }
     * 
     */
    public DeliveryConfirmationResponsePropertiesType createDeliveryConfirmationResponsePropertiesType() {
        return new DeliveryConfirmationResponsePropertiesType();
    }

    /**
     * Create an instance of {@link DangerousSubstanceHandlingType }
     * 
     */
    public DangerousSubstanceHandlingType createDangerousSubstanceHandlingType() {
        return new DangerousSubstanceHandlingType();
    }

    /**
     * Create an instance of {@link PostingAcceptLineItemType }
     * 
     */
    public PostingAcceptLineItemType createPostingAcceptLineItemType() {
        return new PostingAcceptLineItemType();
    }

    /**
     * Create an instance of {@link SupplyPlanDetailsType }
     * 
     */
    public SupplyPlanDetailsType createSupplyPlanDetailsType() {
        return new SupplyPlanDetailsType();
    }

    /**
     * Create an instance of {@link ToType }
     * 
     */
    public ToType createToType() {
        return new ToType();
    }

    /**
     * Create an instance of {@link UpperExplosionLimitType }
     * 
     */
    public UpperExplosionLimitType createUpperExplosionLimitType() {
        return new UpperExplosionLimitType();
    }

    /**
     * Create an instance of {@link TotalCreditRequestedType }
     * 
     */
    public TotalCreditRequestedType createTotalCreditRequestedType() {
        return new TotalCreditRequestedType();
    }

    /**
     * Create an instance of {@link KeywordsType }
     * 
     */
    public KeywordsType createKeywordsType() {
        return new KeywordsType();
    }

    /**
     * Create an instance of {@link ShippingType }
     * 
     */
    public ShippingType createShippingType() {
        return new ShippingType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalResponseDetailsType }
     * 
     */
    public ReplenishmentProposalResponseDetailsType createReplenishmentProposalResponseDetailsType() {
        return new ReplenishmentProposalResponseDetailsType();
    }

    /**
     * Create an instance of {@link QualityTestingReportBodyType }
     * 
     */
    public QualityTestingReportBodyType createQualityTestingReportBodyType() {
        return new QualityTestingReportBodyType();
    }

    /**
     * Create an instance of {@link InlandWaterTransportInformationType }
     * 
     */
    public InlandWaterTransportInformationType createInlandWaterTransportInformationType() {
        return new InlandWaterTransportInformationType();
    }

    /**
     * Create an instance of {@link DeliveryConfirmationDetailsType }
     * 
     */
    public DeliveryConfirmationDetailsType createDeliveryConfirmationDetailsType() {
        return new DeliveryConfirmationDetailsType();
    }

    /**
     * Create an instance of {@link SerialNumbersType }
     * 
     */
    public SerialNumbersType createSerialNumbersType() {
        return new SerialNumbersType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalRequestProductType }
     * 
     */
    public ReplenishmentProposalRequestProductType createReplenishmentProposalRequestProductType() {
        return new ReplenishmentProposalRequestProductType();
    }

    /**
     * Create an instance of {@link InvoiceResponseType }
     * 
     */
    public InvoiceResponseType createInvoiceResponseType() {
        return new InvoiceResponseType();
    }

    /**
     * Create an instance of {@link OrderStatusListResponseType }
     * 
     */
    public OrderStatusListResponseType createOrderStatusListResponseType() {
        return new OrderStatusListResponseType();
    }

    /**
     * Create an instance of {@link ChamberRelatedTemperatureRangeType }
     * 
     */
    public ChamberRelatedTemperatureRangeType createChamberRelatedTemperatureRangeType() {
        return new ChamberRelatedTemperatureRangeType();
    }

    /**
     * Create an instance of {@link KinematicViscosityType }
     * 
     */
    public KinematicViscosityType createKinematicViscosityType() {
        return new KinematicViscosityType();
    }

    /**
     * Create an instance of {@link OrderChangeType }
     * 
     */
    public OrderChangeType createOrderChangeType() {
        return new OrderChangeType();
    }

    /**
     * Create an instance of {@link DemandPlanResponseBodyType }
     * 
     */
    public DemandPlanResponseBodyType createDemandPlanResponseBodyType() {
        return new DemandPlanResponseBodyType();
    }

    /**
     * Create an instance of {@link CostSupportRequestType }
     * 
     */
    public CostSupportRequestType createCostSupportRequestType() {
        return new CostSupportRequestType();
    }

    /**
     * Create an instance of {@link PaymentPropertiesType }
     * 
     */
    public PaymentPropertiesType createPaymentPropertiesType() {
        return new PaymentPropertiesType();
    }

    /**
     * Create an instance of {@link PalletQuantityInformationType }
     * 
     */
    public PalletQuantityInformationType createPalletQuantityInformationType() {
        return new PalletQuantityInformationType();
    }

    /**
     * Create an instance of {@link AllowancesType }
     * 
     */
    public AllowancesType createAllowancesType() {
        return new AllowancesType();
    }

    /**
     * Create an instance of {@link TareWeightType }
     * 
     */
    public TareWeightType createTareWeightType() {
        return new TareWeightType();
    }

    /**
     * Create an instance of {@link PriceAndAvailabilityResponseBodyType }
     * 
     */
    public PriceAndAvailabilityResponseBodyType createPriceAndAvailabilityResponseBodyType() {
        return new PriceAndAvailabilityResponseBodyType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalResponseType }
     * 
     */
    public ReplenishmentProposalResponseType createReplenishmentProposalResponseType() {
        return new ReplenishmentProposalResponseType();
    }

    /**
     * Create an instance of {@link CostSupportRequestChangeBodyType }
     * 
     */
    public CostSupportRequestChangeBodyType createCostSupportRequestChangeBodyType() {
        return new CostSupportRequestChangeBodyType();
    }

    /**
     * Create an instance of {@link QualificationResponsePartnersType }
     * 
     */
    public QualificationResponsePartnersType createQualificationResponsePartnersType() {
        return new QualificationResponsePartnersType();
    }

    /**
     * Create an instance of {@link AcceptanceNotificationType }
     * 
     */
    public AcceptanceNotificationType createAcceptanceNotificationType() {
        return new AcceptanceNotificationType();
    }

    /**
     * Create an instance of {@link QualificationRequestType }
     * 
     */
    public QualificationRequestType createQualificationRequestType() {
        return new QualificationRequestType();
    }

    /**
     * Create an instance of {@link ExemptTotalType }
     * 
     */
    public ExemptTotalType createExemptTotalType() {
        return new ExemptTotalType();
    }

    /**
     * Create an instance of {@link LoadTenderResponseType }
     * 
     */
    public LoadTenderResponseType createLoadTenderResponseType() {
        return new LoadTenderResponseType();
    }

    /**
     * Create an instance of {@link PostingAcceptType }
     * 
     */
    public PostingAcceptType createPostingAcceptType() {
        return new PostingAcceptType();
    }

    /**
     * Create an instance of {@link ShipNoticeDateType }
     * 
     */
    public ShipNoticeDateType createShipNoticeDateType() {
        return new ShipNoticeDateType();
    }

    /**
     * Create an instance of {@link ProposalProductType }
     * 
     */
    public ProposalProductType createProposalProductType() {
        return new ProposalProductType();
    }

    /**
     * Create an instance of {@link ForecastedProductMovementReportPropertiesType }
     * 
     */
    public ForecastedProductMovementReportPropertiesType createForecastedProductMovementReportPropertiesType() {
        return new ForecastedProductMovementReportPropertiesType();
    }

    /**
     * Create an instance of {@link LoadTenderResponseBodyType }
     * 
     */
    public LoadTenderResponseBodyType createLoadTenderResponseBodyType() {
        return new LoadTenderResponseBodyType();
    }

    /**
     * Create an instance of {@link CountiesType }
     * 
     */
    public CountiesType createCountiesType() {
        return new CountiesType();
    }

    /**
     * Create an instance of {@link InventoryActualUsageResponseBodyType }
     * 
     */
    public InventoryActualUsageResponseBodyType createInventoryActualUsageResponseBodyType() {
        return new InventoryActualUsageResponseBodyType();
    }

    /**
     * Create an instance of {@link LoadTenderMotorProductLineItemType }
     * 
     */
    public LoadTenderMotorProductLineItemType createLoadTenderMotorProductLineItemType() {
        return new LoadTenderMotorProductLineItemType();
    }

    /**
     * Create an instance of {@link EquipmentMaterialTypeType }
     * 
     */
    public EquipmentMaterialTypeType createEquipmentMaterialTypeType() {
        return new EquipmentMaterialTypeType();
    }

    /**
     * Create an instance of {@link ContractProductInformationType }
     * 
     */
    public ContractProductInformationType createContractProductInformationType() {
        return new ContractProductInformationType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalCancelPropertiesType }
     * 
     */
    public ReplenishmentProposalCancelPropertiesType createReplenishmentProposalCancelPropertiesType() {
        return new ReplenishmentProposalCancelPropertiesType();
    }

    /**
     * Create an instance of {@link PayerType }
     * 
     */
    public PayerType createPayerType() {
        return new PayerType();
    }

    /**
     * Create an instance of {@link DeliveryConfirmationBodyType }
     * 
     */
    public DeliveryConfirmationBodyType createDeliveryConfirmationBodyType() {
        return new DeliveryConfirmationBodyType();
    }

    /**
     * Create an instance of {@link OrderCreatePartnersType }
     * 
     */
    public OrderCreatePartnersType createOrderCreatePartnersType() {
        return new OrderCreatePartnersType();
    }

    /**
     * Create an instance of {@link AllowanceChargeCodeType }
     * 
     */
    public AllowanceChargeCodeType createAllowanceChargeCodeType() {
        return new AllowanceChargeCodeType();
    }

    /**
     * Create an instance of {@link PriceSheetBodyType }
     * 
     */
    public PriceSheetBodyType createPriceSheetBodyType() {
        return new PriceSheetBodyType();
    }

    /**
     * Create an instance of {@link CarrierWeightsPartnersType }
     * 
     */
    public CarrierWeightsPartnersType createCarrierWeightsPartnersType() {
        return new CarrierWeightsPartnersType();
    }

    /**
     * Create an instance of {@link PostingChangeDetailsType }
     * 
     */
    public PostingChangeDetailsType createPostingChangeDetailsType() {
        return new PostingChangeDetailsType();
    }

    /**
     * Create an instance of {@link ShipmentStatusPropertiesType }
     * 
     */
    public ShipmentStatusPropertiesType createShipmentStatusPropertiesType() {
        return new ShipmentStatusPropertiesType();
    }

    /**
     * Create an instance of {@link ActualValueType }
     * 
     */
    public ActualValueType createActualValueType() {
        return new ActualValueType();
    }

    /**
     * Create an instance of {@link HeightType }
     * 
     */
    public HeightType createHeightType() {
        return new HeightType();
    }

    /**
     * Create an instance of {@link PurchaseOrderInformationType }
     * 
     */
    public PurchaseOrderInformationType createPurchaseOrderInformationType() {
        return new PurchaseOrderInformationType();
    }

    /**
     * Create an instance of {@link ThirdPartyLaboratoryDetailType }
     * 
     */
    public ThirdPartyLaboratoryDetailType createThirdPartyLaboratoryDetailType() {
        return new ThirdPartyLaboratoryDetailType();
    }

    /**
     * Create an instance of {@link CostSupportCreditRequestType }
     * 
     */
    public CostSupportCreditRequestType createCostSupportCreditRequestType() {
        return new CostSupportCreditRequestType();
    }

    /**
     * Create an instance of {@link ShipNoticeListRequestPropertiesType }
     * 
     */
    public ShipNoticeListRequestPropertiesType createShipNoticeListRequestPropertiesType() {
        return new ShipNoticeListRequestPropertiesType();
    }

    /**
     * Create an instance of {@link UnitPriceType }
     * 
     */
    public UnitPriceType createUnitPriceType() {
        return new UnitPriceType();
    }

    /**
     * Create an instance of {@link QualityTestingReportPartnersType }
     * 
     */
    public QualityTestingReportPartnersType createQualityTestingReportPartnersType() {
        return new QualityTestingReportPartnersType();
    }

    /**
     * Create an instance of {@link LoadBuildingMotorPartnersType }
     * 
     */
    public LoadBuildingMotorPartnersType createLoadBuildingMotorPartnersType() {
        return new LoadBuildingMotorPartnersType();
    }

    /**
     * Create an instance of {@link LineOrderStatusCodeType }
     * 
     */
    public LineOrderStatusCodeType createLineOrderStatusCodeType() {
        return new LineOrderStatusCodeType();
    }

    /**
     * Create an instance of {@link CostSupportRequestDetailsType }
     * 
     */
    public CostSupportRequestDetailsType createCostSupportRequestDetailsType() {
        return new CostSupportRequestDetailsType();
    }

    /**
     * Create an instance of {@link CurrencyCodeType }
     * 
     */
    public CurrencyCodeType createCurrencyCodeType() {
        return new CurrencyCodeType();
    }

    /**
     * Create an instance of {@link OrderFeaturesType }
     * 
     */
    public OrderFeaturesType createOrderFeaturesType() {
        return new OrderFeaturesType();
    }

    /**
     * Create an instance of {@link LineItemAcceptanceStatusType }
     * 
     */
    public LineItemAcceptanceStatusType createLineItemAcceptanceStatusType() {
        return new LineItemAcceptanceStatusType();
    }

    /**
     * Create an instance of {@link ForecastedProductMovementProductLineItemType }
     * 
     */
    public ForecastedProductMovementProductLineItemType createForecastedProductMovementProductLineItemType() {
        return new ForecastedProductMovementProductLineItemType();
    }

    /**
     * Create an instance of {@link ReportingEntityType }
     * 
     */
    public ReportingEntityType createReportingEntityType() {
        return new ReportingEntityType();
    }

    /**
     * Create an instance of {@link RequestedAgreementPeriodType }
     * 
     */
    public RequestedAgreementPeriodType createRequestedAgreementPeriodType() {
        return new RequestedAgreementPeriodType();
    }

    /**
     * Create an instance of {@link RateBasisType }
     * 
     */
    public RateBasisType createRateBasisType() {
        return new RateBasisType();
    }

    /**
     * Create an instance of {@link DeliveryReceiptType }
     * 
     */
    public DeliveryReceiptType createDeliveryReceiptType() {
        return new DeliveryReceiptType();
    }

    /**
     * Create an instance of {@link HazmatDataType }
     * 
     */
    public HazmatDataType createHazmatDataType() {
        return new HazmatDataType();
    }

    /**
     * Create an instance of {@link DemandForecastPartnersType }
     * 
     */
    public DemandForecastPartnersType createDemandForecastPartnersType() {
        return new DemandForecastPartnersType();
    }

    /**
     * Create an instance of {@link RatedValueType }
     * 
     */
    public RatedValueType createRatedValueType() {
        return new RatedValueType();
    }

    /**
     * Create an instance of {@link HazardousRelevantQuantityType }
     * 
     */
    public HazardousRelevantQuantityType createHazardousRelevantQuantityType() {
        return new HazardousRelevantQuantityType();
    }

    /**
     * Create an instance of {@link ReconciliationNumberType }
     * 
     */
    public ReconciliationNumberType createReconciliationNumberType() {
        return new ReconciliationNumberType();
    }

    /**
     * Create an instance of {@link TargetCurrencyType }
     * 
     */
    public TargetCurrencyType createTargetCurrencyType() {
        return new TargetCurrencyType();
    }

    /**
     * Create an instance of {@link CostSupportResponseType }
     * 
     */
    public CostSupportResponseType createCostSupportResponseType() {
        return new CostSupportResponseType();
    }

    /**
     * Create an instance of {@link DangerIndicationTextType }
     * 
     */
    public DangerIndicationTextType createDangerIndicationTextType() {
        return new DangerIndicationTextType();
    }

    /**
     * Create an instance of {@link ShipmentInstructionsPropertiesType }
     * 
     */
    public ShipmentInstructionsPropertiesType createShipmentInstructionsPropertiesType() {
        return new ShipmentInstructionsPropertiesType();
    }

    /**
     * Create an instance of {@link ContainerSerialInformationType }
     * 
     */
    public ContainerSerialInformationType createContainerSerialInformationType() {
        return new ContainerSerialInformationType();
    }

    /**
     * Create an instance of {@link UnitConversionsType }
     * 
     */
    public UnitConversionsType createUnitConversionsType() {
        return new UnitConversionsType();
    }

    /**
     * Create an instance of {@link StateType }
     * 
     */
    public StateType createStateType() {
        return new StateType();
    }

    /**
     * Create an instance of {@link BatchNumbersType }
     * 
     */
    public BatchNumbersType createBatchNumbersType() {
        return new BatchNumbersType();
    }

    /**
     * Create an instance of {@link SpecialInstructionsType }
     * 
     */
    public SpecialInstructionsType createSpecialInstructionsType() {
        return new SpecialInstructionsType();
    }

    /**
     * Create an instance of {@link ShipmentStatusDetailsType }
     * 
     */
    public ShipmentStatusDetailsType createShipmentStatusDetailsType() {
        return new ShipmentStatusDetailsType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalLineItemType }
     * 
     */
    public ReplenishmentProposalLineItemType createReplenishmentProposalLineItemType() {
        return new ReplenishmentProposalLineItemType();
    }

    /**
     * Create an instance of {@link PriceApplicabilityCriteriaType }
     * 
     */
    public PriceApplicabilityCriteriaType createPriceApplicabilityCriteriaType() {
        return new PriceApplicabilityCriteriaType();
    }

    /**
     * Create an instance of {@link TransportDocumentInstructionsType }
     * 
     */
    public TransportDocumentInstructionsType createTransportDocumentInstructionsType() {
        return new TransportDocumentInstructionsType();
    }

    /**
     * Create an instance of {@link PostingAcceptDetailsType }
     * 
     */
    public PostingAcceptDetailsType createPostingAcceptDetailsType() {
        return new PostingAcceptDetailsType();
    }

    /**
     * Create an instance of {@link ProductAttributeType }
     * 
     */
    public ProductAttributeType createProductAttributeType() {
        return new ProductAttributeType();
    }

    /**
     * Create an instance of {@link RateServiceType }
     * 
     */
    public RateServiceType createRateServiceType() {
        return new RateServiceType();
    }

    /**
     * Create an instance of {@link SpecificGravityType }
     * 
     */
    public SpecificGravityType createSpecificGravityType() {
        return new SpecificGravityType();
    }

    /**
     * Create an instance of {@link MarketingNameType }
     * 
     */
    public MarketingNameType createMarketingNameType() {
        return new MarketingNameType();
    }

    /**
     * Create an instance of {@link OrderStatusResponseProductLineItemType }
     * 
     */
    public OrderStatusResponseProductLineItemType createOrderStatusResponseProductLineItemType() {
        return new OrderStatusResponseProductLineItemType();
    }

    /**
     * Create an instance of {@link RailTransportInformationType }
     * 
     */
    public RailTransportInformationType createRailTransportInformationType() {
        return new RailTransportInformationType();
    }

    /**
     * Create an instance of {@link LanguageCodeType }
     * 
     */
    public LanguageCodeType createLanguageCodeType() {
        return new LanguageCodeType();
    }

    /**
     * Create an instance of {@link LoadTenderMotorBodyType }
     * 
     */
    public LoadTenderMotorBodyType createLoadTenderMotorBodyType() {
        return new LoadTenderMotorBodyType();
    }

    /**
     * Create an instance of {@link DeliveryReceiptResponseBodyType }
     * 
     */
    public DeliveryReceiptResponseBodyType createDeliveryReceiptResponseBodyType() {
        return new DeliveryReceiptResponseBodyType();
    }

    /**
     * Create an instance of {@link InvoiceTypeType }
     * 
     */
    public InvoiceTypeType createInvoiceTypeType() {
        return new InvoiceTypeType();
    }

    /**
     * Create an instance of {@link OrderingInformationType }
     * 
     */
    public OrderingInformationType createOrderingInformationType() {
        return new OrderingInformationType();
    }

    /**
     * Create an instance of {@link PortOfLoadingCodeType }
     * 
     */
    public PortOfLoadingCodeType createPortOfLoadingCodeType() {
        return new PortOfLoadingCodeType();
    }

    /**
     * Create an instance of {@link LoadPropertiesType }
     * 
     */
    public LoadPropertiesType createLoadPropertiesType() {
        return new LoadPropertiesType();
    }

    /**
     * Create an instance of {@link RequestForQuoteProductLineItemType }
     * 
     */
    public RequestForQuoteProductLineItemType createRequestForQuoteProductLineItemType() {
        return new RequestForQuoteProductLineItemType();
    }

    /**
     * Create an instance of {@link PostingAcceptResponseDetailsType }
     * 
     */
    public PostingAcceptResponseDetailsType createPostingAcceptResponseDetailsType() {
        return new PostingAcceptResponseDetailsType();
    }

    /**
     * Create an instance of {@link InvoicePreferenceType }
     * 
     */
    public InvoicePreferenceType createInvoicePreferenceType() {
        return new InvoicePreferenceType();
    }

    /**
     * Create an instance of {@link LoadBuildingResponseType }
     * 
     */
    public LoadBuildingResponseType createLoadBuildingResponseType() {
        return new LoadBuildingResponseType();
    }

    /**
     * Create an instance of {@link InventoryActualUsageDetailsType }
     * 
     */
    public InventoryActualUsageDetailsType createInventoryActualUsageDetailsType() {
        return new InventoryActualUsageDetailsType();
    }

    /**
     * Create an instance of {@link AdjustmentCodeType }
     * 
     */
    public AdjustmentCodeType createAdjustmentCodeType() {
        return new AdjustmentCodeType();
    }

    /**
     * Create an instance of {@link HazardousClassPrimaryCodeType }
     * 
     */
    public HazardousClassPrimaryCodeType createHazardousClassPrimaryCodeType() {
        return new HazardousClassPrimaryCodeType();
    }

    /**
     * Create an instance of {@link LadingIdentificationType }
     * 
     */
    public LadingIdentificationType createLadingIdentificationType() {
        return new LadingIdentificationType();
    }

    /**
     * Create an instance of {@link ForecastLineItemType }
     * 
     */
    public ForecastLineItemType createForecastLineItemType() {
        return new ForecastLineItemType();
    }

    /**
     * Create an instance of {@link LineItemTotalAmountType }
     * 
     */
    public LineItemTotalAmountType createLineItemTotalAmountType() {
        return new LineItemTotalAmountType();
    }

    /**
     * Create an instance of {@link ProductGroupLineItemType }
     * 
     */
    public ProductGroupLineItemType createProductGroupLineItemType() {
        return new ProductGroupLineItemType();
    }

    /**
     * Create an instance of {@link DistanceBasisType }
     * 
     */
    public DistanceBasisType createDistanceBasisType() {
        return new DistanceBasisType();
    }

    /**
     * Create an instance of {@link LoadTenderInformationType }
     * 
     */
    public LoadTenderInformationType createLoadTenderInformationType() {
        return new LoadTenderInformationType();
    }

    /**
     * Create an instance of {@link LetterOfCreditVoyageDateTimeType }
     * 
     */
    public LetterOfCreditVoyageDateTimeType createLetterOfCreditVoyageDateTimeType() {
        return new LetterOfCreditVoyageDateTimeType();
    }

    /**
     * Create an instance of {@link PriceAndAvailabilityResponseDetailsType }
     * 
     */
    public PriceAndAvailabilityResponseDetailsType createPriceAndAvailabilityResponseDetailsType() {
        return new PriceAndAvailabilityResponseDetailsType();
    }

    /**
     * Create an instance of {@link PartnerIdentifierType }
     * 
     */
    public PartnerIdentifierType createPartnerIdentifierType() {
        return new PartnerIdentifierType();
    }

    /**
     * Create an instance of {@link PriceAndAvailabilityRequestPropertiesType }
     * 
     */
    public PriceAndAvailabilityRequestPropertiesType createPriceAndAvailabilityRequestPropertiesType() {
        return new PriceAndAvailabilityRequestPropertiesType();
    }

    /**
     * Create an instance of {@link DemandPlanResponseType }
     * 
     */
    public DemandPlanResponseType createDemandPlanResponseType() {
        return new DemandPlanResponseType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalRequestDetailsType }
     * 
     */
    public ReplenishmentProposalRequestDetailsType createReplenishmentProposalRequestDetailsType() {
        return new ReplenishmentProposalRequestDetailsType();
    }

    /**
     * Create an instance of {@link PackagingInformationType }
     * 
     */
    public PackagingInformationType createPackagingInformationType() {
        return new PackagingInformationType();
    }

    /**
     * Create an instance of {@link ReceiptNoticePropertiesType }
     * 
     */
    public ReceiptNoticePropertiesType createReceiptNoticePropertiesType() {
        return new ReceiptNoticePropertiesType();
    }

    /**
     * Create an instance of {@link GrossVolumeType }
     * 
     */
    public GrossVolumeType createGrossVolumeType() {
        return new GrossVolumeType();
    }

    /**
     * Create an instance of {@link BuyerProductInformationType }
     * 
     */
    public BuyerProductInformationType createBuyerProductInformationType() {
        return new BuyerProductInformationType();
    }

    /**
     * Create an instance of {@link PostingCreateType }
     * 
     */
    public PostingCreateType createPostingCreateType() {
        return new PostingCreateType();
    }

    /**
     * Create an instance of {@link FreightBillDateTimeType }
     * 
     */
    public FreightBillDateTimeType createFreightBillDateTimeType() {
        return new FreightBillDateTimeType();
    }

    /**
     * Create an instance of {@link DiscountAmountType }
     * 
     */
    public DiscountAmountType createDiscountAmountType() {
        return new DiscountAmountType();
    }

    /**
     * Create an instance of {@link CostSupportRequestChangePropertiesType }
     * 
     */
    public CostSupportRequestChangePropertiesType createCostSupportRequestChangePropertiesType() {
        return new CostSupportRequestChangePropertiesType();
    }

    /**
     * Create an instance of {@link AcceptanceNotificationDetailsType }
     * 
     */
    public AcceptanceNotificationDetailsType createAcceptanceNotificationDetailsType() {
        return new AcceptanceNotificationDetailsType();
    }

    /**
     * Create an instance of {@link InventoryUsageInformationType }
     * 
     */
    public InventoryUsageInformationType createInventoryUsageInformationType() {
        return new InventoryUsageInformationType();
    }

    /**
     * Create an instance of {@link ReceivingConditionType }
     * 
     */
    public ReceivingConditionType createReceivingConditionType() {
        return new ReceivingConditionType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalChangeBodyType }
     * 
     */
    public ReplenishmentProposalChangeBodyType createReplenishmentProposalChangeBodyType() {
        return new ReplenishmentProposalChangeBodyType();
    }

    /**
     * Create an instance of {@link LetterOfCreditInformationType }
     * 
     */
    public LetterOfCreditInformationType createLetterOfCreditInformationType() {
        return new LetterOfCreditInformationType();
    }

    /**
     * Create an instance of {@link InventoryActualUsageResponseDetailsType }
     * 
     */
    public InventoryActualUsageResponseDetailsType createInventoryActualUsageResponseDetailsType() {
        return new InventoryActualUsageResponseDetailsType();
    }

    /**
     * Create an instance of {@link GrossWeightType }
     * 
     */
    public GrossWeightType createGrossWeightType() {
        return new GrossWeightType();
    }

    /**
     * Create an instance of {@link AudienceType }
     * 
     */
    public AudienceType createAudienceType() {
        return new AudienceType();
    }

    /**
     * Create an instance of {@link MeasurementRangeType }
     * 
     */
    public MeasurementRangeType createMeasurementRangeType() {
        return new MeasurementRangeType();
    }

    /**
     * Create an instance of {@link ThresholdLimitValueSTELType }
     * 
     */
    public ThresholdLimitValueSTELType createThresholdLimitValueSTELType() {
        return new ThresholdLimitValueSTELType();
    }

    /**
     * Create an instance of {@link MinimumMeasurementType }
     * 
     */
    public MinimumMeasurementType createMinimumMeasurementType() {
        return new MinimumMeasurementType();
    }

    /**
     * Create an instance of {@link OrderChangePropertiesType }
     * 
     */
    public OrderChangePropertiesType createOrderChangePropertiesType() {
        return new OrderChangePropertiesType();
    }

    /**
     * Create an instance of {@link DemandForecastResponsePartnersType }
     * 
     */
    public DemandForecastResponsePartnersType createDemandForecastResponsePartnersType() {
        return new DemandForecastResponsePartnersType();
    }

    /**
     * Create an instance of {@link PaymentTermsBasisDateType }
     * 
     */
    public PaymentTermsBasisDateType createPaymentTermsBasisDateType() {
        return new PaymentTermsBasisDateType();
    }

    /**
     * Create an instance of {@link ResponseStatusReasonIdentifierType }
     * 
     */
    public ResponseStatusReasonIdentifierType createResponseStatusReasonIdentifierType() {
        return new ResponseStatusReasonIdentifierType();
    }

    /**
     * Create an instance of {@link AdjustmentType }
     * 
     */
    public AdjustmentType createAdjustmentType() {
        return new AdjustmentType();
    }

    /**
     * Create an instance of {@link ProductMovementReportPropertiesType }
     * 
     */
    public ProductMovementReportPropertiesType createProductMovementReportPropertiesType() {
        return new ProductMovementReportPropertiesType();
    }

    /**
     * Create an instance of {@link RequestForQuoteBodyType }
     * 
     */
    public RequestForQuoteBodyType createRequestForQuoteBodyType() {
        return new RequestForQuoteBodyType();
    }

    /**
     * Create an instance of {@link PackagingTypeCodeType }
     * 
     */
    public PackagingTypeCodeType createPackagingTypeCodeType() {
        return new PackagingTypeCodeType();
    }

    /**
     * Create an instance of {@link PostingAcceptBodyType }
     * 
     */
    public PostingAcceptBodyType createPostingAcceptBodyType() {
        return new PostingAcceptBodyType();
    }

    /**
     * Create an instance of {@link OrderLeadTimeType }
     * 
     */
    public OrderLeadTimeType createOrderLeadTimeType() {
        return new OrderLeadTimeType();
    }

    /**
     * Create an instance of {@link PackagingWeightType }
     * 
     */
    public PackagingWeightType createPackagingWeightType() {
        return new PackagingWeightType();
    }

    /**
     * Create an instance of {@link PaymentTermsOfSaleType }
     * 
     */
    public PaymentTermsOfSaleType createPaymentTermsOfSaleType() {
        return new PaymentTermsOfSaleType();
    }

    /**
     * Create an instance of {@link SupplyPlanResponseBodyType }
     * 
     */
    public SupplyPlanResponseBodyType createSupplyPlanResponseBodyType() {
        return new SupplyPlanResponseBodyType();
    }

    /**
     * Create an instance of {@link PurchaseOrderIssuedDateRangeType }
     * 
     */
    public PurchaseOrderIssuedDateRangeType createPurchaseOrderIssuedDateRangeType() {
        return new PurchaseOrderIssuedDateRangeType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link HandlingInformationType }
     * 
     */
    public HandlingInformationType createHandlingInformationType() {
        return new HandlingInformationType();
    }

    /**
     * Create an instance of {@link CostSupportResponsePartnersType }
     * 
     */
    public CostSupportResponsePartnersType createCostSupportResponsePartnersType() {
        return new CostSupportResponsePartnersType();
    }

    /**
     * Create an instance of {@link InvoiceType }
     * 
     */
    public InvoiceType createInvoiceType() {
        return new InvoiceType();
    }

    /**
     * Create an instance of {@link QualityTestingReportPropertiesType }
     * 
     */
    public QualityTestingReportPropertiesType createQualityTestingReportPropertiesType() {
        return new QualityTestingReportPropertiesType();
    }

    /**
     * Create an instance of {@link DeliveryProductType }
     * 
     */
    public DeliveryProductType createDeliveryProductType() {
        return new DeliveryProductType();
    }

    /**
     * Create an instance of {@link CustomerCatalogPriceType }
     * 
     */
    public CustomerCatalogPriceType createCustomerCatalogPriceType() {
        return new CustomerCatalogPriceType();
    }

    /**
     * Create an instance of {@link AdvisingBankType }
     * 
     */
    public AdvisingBankType createAdvisingBankType() {
        return new AdvisingBankType();
    }

    /**
     * Create an instance of {@link ContractDateRangesType }
     * 
     */
    public ContractDateRangesType createContractDateRangesType() {
        return new ContractDateRangesType();
    }

    /**
     * Create an instance of {@link RiskDescriptionType }
     * 
     */
    public RiskDescriptionType createRiskDescriptionType() {
        return new RiskDescriptionType();
    }

    /**
     * Create an instance of {@link DeliveryReceiptDetailsType }
     * 
     */
    public DeliveryReceiptDetailsType createDeliveryReceiptDetailsType() {
        return new DeliveryReceiptDetailsType();
    }

    /**
     * Create an instance of {@link ReviewDateType }
     * 
     */
    public ReviewDateType createReviewDateType() {
        return new ReviewDateType();
    }

    /**
     * Create an instance of {@link AllowanceChargeListType }
     * 
     */
    public AllowanceChargeListType createAllowanceChargeListType() {
        return new AllowanceChargeListType();
    }

    /**
     * Create an instance of {@link InvoiceDateType }
     * 
     */
    public InvoiceDateType createInvoiceDateType() {
        return new InvoiceDateType();
    }

    /**
     * Create an instance of {@link DemandPlanResponsePropertiesType }
     * 
     */
    public DemandPlanResponsePropertiesType createDemandPlanResponsePropertiesType() {
        return new DemandPlanResponsePropertiesType();
    }

    /**
     * Create an instance of {@link LoadTenderMotorType }
     * 
     */
    public LoadTenderMotorType createLoadTenderMotorType() {
        return new LoadTenderMotorType();
    }

    /**
     * Create an instance of {@link ConfirmationNumberType }
     * 
     */
    public ConfirmationNumberType createConfirmationNumberType() {
        return new ConfirmationNumberType();
    }

    /**
     * Create an instance of {@link OrderResponseDetailsType }
     * 
     */
    public OrderResponseDetailsType createOrderResponseDetailsType() {
        return new OrderResponseDetailsType();
    }

    /**
     * Create an instance of {@link LoadBuildingResponsePartnersType }
     * 
     */
    public LoadBuildingResponsePartnersType createLoadBuildingResponsePartnersType() {
        return new LoadBuildingResponsePartnersType();
    }

    /**
     * Create an instance of {@link TestIdentificationType }
     * 
     */
    public TestIdentificationType createTestIdentificationType() {
        return new TestIdentificationType();
    }

    /**
     * Create an instance of {@link ZoneGeographiesType }
     * 
     */
    public ZoneGeographiesType createZoneGeographiesType() {
        return new ZoneGeographiesType();
    }

    /**
     * Create an instance of {@link LowerExplosionLimitType }
     * 
     */
    public LowerExplosionLimitType createLowerExplosionLimitType() {
        return new LowerExplosionLimitType();
    }

    /**
     * Create an instance of {@link TestMethodType }
     * 
     */
    public TestMethodType createTestMethodType() {
        return new TestMethodType();
    }

    /**
     * Create an instance of {@link CertificateOfAnalysisBodyType }
     * 
     */
    public CertificateOfAnalysisBodyType createCertificateOfAnalysisBodyType() {
        return new CertificateOfAnalysisBodyType();
    }

    /**
     * Create an instance of {@link QualityTestingReportBatchDetailType }
     * 
     */
    public QualityTestingReportBatchDetailType createQualityTestingReportBatchDetailType() {
        return new QualityTestingReportBatchDetailType();
    }

    /**
     * Create an instance of {@link CustomerSpecificCatalogUpdateDetailsType }
     * 
     */
    public CustomerSpecificCatalogUpdateDetailsType createCustomerSpecificCatalogUpdateDetailsType() {
        return new CustomerSpecificCatalogUpdateDetailsType();
    }

    /**
     * Create an instance of {@link HazardousShipmentType }
     * 
     */
    public HazardousShipmentType createHazardousShipmentType() {
        return new HazardousShipmentType();
    }

    /**
     * Create an instance of {@link ShipmentInstructionsBodyType }
     * 
     */
    public ShipmentInstructionsBodyType createShipmentInstructionsBodyType() {
        return new ShipmentInstructionsBodyType();
    }

    /**
     * Create an instance of {@link ReceiptQuantityType }
     * 
     */
    public ReceiptQuantityType createReceiptQuantityType() {
        return new ReceiptQuantityType();
    }

    /**
     * Create an instance of {@link FreightBillDetailsType }
     * 
     */
    public FreightBillDetailsType createFreightBillDetailsType() {
        return new FreightBillDetailsType();
    }

    /**
     * Create an instance of {@link TotalWeightOfPalletsType }
     * 
     */
    public TotalWeightOfPalletsType createTotalWeightOfPalletsType() {
        return new TotalWeightOfPalletsType();
    }

    /**
     * Create an instance of {@link BuyerAccountDetailsType }
     * 
     */
    public BuyerAccountDetailsType createBuyerAccountDetailsType() {
        return new BuyerAccountDetailsType();
    }

    /**
     * Create an instance of {@link OrderStatusResponsePartnersType }
     * 
     */
    public OrderStatusResponsePartnersType createOrderStatusResponsePartnersType() {
        return new OrderStatusResponsePartnersType();
    }

    /**
     * Create an instance of {@link CustomsCostInformationType }
     * 
     */
    public CustomsCostInformationType createCustomsCostInformationType() {
        return new CustomsCostInformationType();
    }

    /**
     * Create an instance of {@link ClosingDateType }
     * 
     */
    public ClosingDateType createClosingDateType() {
        return new ClosingDateType();
    }

    /**
     * Create an instance of {@link ReceiptNoticePartnersType }
     * 
     */
    public ReceiptNoticePartnersType createReceiptNoticePartnersType() {
        return new ReceiptNoticePartnersType();
    }

    /**
     * Create an instance of {@link PricingLumpSumType }
     * 
     */
    public PricingLumpSumType createPricingLumpSumType() {
        return new PricingLumpSumType();
    }

    /**
     * Create an instance of {@link CustomerSpecificCatalogUpdateBodyType }
     * 
     */
    public CustomerSpecificCatalogUpdateBodyType createCustomerSpecificCatalogUpdateBodyType() {
        return new CustomerSpecificCatalogUpdateBodyType();
    }

    /**
     * Create an instance of {@link QualificationResponseType }
     * 
     */
    public QualificationResponseType createQualificationResponseType() {
        return new QualificationResponseType();
    }

    /**
     * Create an instance of {@link DemandForecastResponseDetailsType }
     * 
     */
    public DemandForecastResponseDetailsType createDemandForecastResponseDetailsType() {
        return new DemandForecastResponseDetailsType();
    }

    /**
     * Create an instance of {@link OrderStatusListRequestBodyType }
     * 
     */
    public OrderStatusListRequestBodyType createOrderStatusListRequestBodyType() {
        return new OrderStatusListRequestBodyType();
    }

    /**
     * Create an instance of {@link ShelfLifeDateType }
     * 
     */
    public ShelfLifeDateType createShelfLifeDateType() {
        return new ShelfLifeDateType();
    }

    /**
     * Create an instance of {@link TaxableAmountTotalType }
     * 
     */
    public TaxableAmountTotalType createTaxableAmountTotalType() {
        return new TaxableAmountTotalType();
    }

    /**
     * Create an instance of {@link ShipNoticeListDetailsType }
     * 
     */
    public ShipNoticeListDetailsType createShipNoticeListDetailsType() {
        return new ShipNoticeListDetailsType();
    }

    /**
     * Create an instance of {@link ShipmentStatusCodeType }
     * 
     */
    public ShipmentStatusCodeType createShipmentStatusCodeType() {
        return new ShipmentStatusCodeType();
    }

    /**
     * Create an instance of {@link ShippingLabelNumberType }
     * 
     */
    public ShippingLabelNumberType createShippingLabelNumberType() {
        return new ShippingLabelNumberType();
    }

    /**
     * Create an instance of {@link ModeOfTransportationInformationType }
     * 
     */
    public ModeOfTransportationInformationType createModeOfTransportationInformationType() {
        return new ModeOfTransportationInformationType();
    }

    /**
     * Create an instance of {@link DeliveryReceiptResponsePropertiesType }
     * 
     */
    public DeliveryReceiptResponsePropertiesType createDeliveryReceiptResponsePropertiesType() {
        return new DeliveryReceiptResponsePropertiesType();
    }

    /**
     * Create an instance of {@link LoadBuildingMotorPropertiesType }
     * 
     */
    public LoadBuildingMotorPropertiesType createLoadBuildingMotorPropertiesType() {
        return new LoadBuildingMotorPropertiesType();
    }

    /**
     * Create an instance of {@link PostingStatusRequestBodyType }
     * 
     */
    public PostingStatusRequestBodyType createPostingStatusRequestBodyType() {
        return new PostingStatusRequestBodyType();
    }

    /**
     * Create an instance of {@link SalesVolumeType }
     * 
     */
    public SalesVolumeType createSalesVolumeType() {
        return new SalesVolumeType();
    }

    /**
     * Create an instance of {@link PaymentMethodCodeType }
     * 
     */
    public PaymentMethodCodeType createPaymentMethodCodeType() {
        return new PaymentMethodCodeType();
    }

    /**
     * Create an instance of {@link LineItemTotalType }
     * 
     */
    public LineItemTotalType createLineItemTotalType() {
        return new LineItemTotalType();
    }

    /**
     * Create an instance of {@link CostSupportCreditRequestBodyType }
     * 
     */
    public CostSupportCreditRequestBodyType createCostSupportCreditRequestBodyType() {
        return new CostSupportCreditRequestBodyType();
    }

    /**
     * Create an instance of {@link CustomsAllowancesType }
     * 
     */
    public CustomsAllowancesType createCustomsAllowancesType() {
        return new CustomsAllowancesType();
    }

    /**
     * Create an instance of {@link ManufacturerInformationType }
     * 
     */
    public ManufacturerInformationType createManufacturerInformationType() {
        return new ManufacturerInformationType();
    }

    /**
     * Create an instance of {@link SupplyDateType }
     * 
     */
    public SupplyDateType createSupplyDateType() {
        return new SupplyDateType();
    }

    /**
     * Create an instance of {@link IncludeType }
     * 
     */
    public IncludeType createIncludeType() {
        return new IncludeType();
    }

    /**
     * Create an instance of {@link InvoicePropertiesType }
     * 
     */
    public InvoicePropertiesType createInvoicePropertiesType() {
        return new InvoicePropertiesType();
    }

    /**
     * Create an instance of {@link DeliveryConfirmationResponseType }
     * 
     */
    public DeliveryConfirmationResponseType createDeliveryConfirmationResponseType() {
        return new DeliveryConfirmationResponseType();
    }

    /**
     * Create an instance of {@link CostSupportPerUnitType }
     * 
     */
    public CostSupportPerUnitType createCostSupportPerUnitType() {
        return new CostSupportPerUnitType();
    }

    /**
     * Create an instance of {@link CertificateOfAnalysisPartnersType }
     * 
     */
    public CertificateOfAnalysisPartnersType createCertificateOfAnalysisPartnersType() {
        return new CertificateOfAnalysisPartnersType();
    }

    /**
     * Create an instance of {@link PaymentTermsType }
     * 
     */
    public PaymentTermsType createPaymentTermsType() {
        return new PaymentTermsType();
    }

    /**
     * Create an instance of {@link ProductMovementTransactionsType }
     * 
     */
    public ProductMovementTransactionsType createProductMovementTransactionsType() {
        return new ProductMovementTransactionsType();
    }

    /**
     * Create an instance of {@link MaximumFillingDegreeType }
     * 
     */
    public MaximumFillingDegreeType createMaximumFillingDegreeType() {
        return new MaximumFillingDegreeType();
    }

    /**
     * Create an instance of {@link DeliveryReceiptResponsePartnersType }
     * 
     */
    public DeliveryReceiptResponsePartnersType createDeliveryReceiptResponsePartnersType() {
        return new DeliveryReceiptResponsePartnersType();
    }

    /**
     * Create an instance of {@link ContractNumberType }
     * 
     */
    public ContractNumberType createContractNumberType() {
        return new ContractNumberType();
    }

    /**
     * Create an instance of {@link ProductCatalogUpdateBodyType }
     * 
     */
    public ProductCatalogUpdateBodyType createProductCatalogUpdateBodyType() {
        return new ProductCatalogUpdateBodyType();
    }

    /**
     * Create an instance of {@link RequestedFirstOrderDateType }
     * 
     */
    public RequestedFirstOrderDateType createRequestedFirstOrderDateType() {
        return new RequestedFirstOrderDateType();
    }

    /**
     * Create an instance of {@link GrossInvoiceAmountType }
     * 
     */
    public GrossInvoiceAmountType createGrossInvoiceAmountType() {
        return new GrossInvoiceAmountType();
    }

    /**
     * Create an instance of {@link PriceStructureType }
     * 
     */
    public PriceStructureType createPriceStructureType() {
        return new PriceStructureType();
    }

    /**
     * Create an instance of {@link ShippedProductQuantityType }
     * 
     */
    public ShippedProductQuantityType createShippedProductQuantityType() {
        return new ShippedProductQuantityType();
    }

    /**
     * Create an instance of {@link PortOfTranshipmentCodeType }
     * 
     */
    public PortOfTranshipmentCodeType createPortOfTranshipmentCodeType() {
        return new PortOfTranshipmentCodeType();
    }

    /**
     * Create an instance of {@link SellerAccountDetailsType }
     * 
     */
    public SellerAccountDetailsType createSellerAccountDetailsType() {
        return new SellerAccountDetailsType();
    }

    /**
     * Create an instance of {@link ErrorStatusType }
     * 
     */
    public ErrorStatusType createErrorStatusType() {
        return new ErrorStatusType();
    }

    /**
     * Create an instance of {@link OrderStatusResponsePropertiesType }
     * 
     */
    public OrderStatusResponsePropertiesType createOrderStatusResponsePropertiesType() {
        return new OrderStatusResponsePropertiesType();
    }

    /**
     * Create an instance of {@link DeliveryConfirmationProductLineItemType }
     * 
     */
    public DeliveryConfirmationProductLineItemType createDeliveryConfirmationProductLineItemType() {
        return new DeliveryConfirmationProductLineItemType();
    }

    /**
     * Create an instance of {@link DocumentRecipientPartnerType }
     * 
     */
    public DocumentRecipientPartnerType createDocumentRecipientPartnerType() {
        return new DocumentRecipientPartnerType();
    }

    /**
     * Create an instance of {@link RateDistanceType }
     * 
     */
    public RateDistanceType createRateDistanceType() {
        return new RateDistanceType();
    }

    /**
     * Create an instance of {@link TermsOfSaleType }
     * 
     */
    public TermsOfSaleType createTermsOfSaleType() {
        return new TermsOfSaleType();
    }

    /**
     * Create an instance of {@link FreightBillLineItemType }
     * 
     */
    public FreightBillLineItemType createFreightBillLineItemType() {
        return new FreightBillLineItemType();
    }

    /**
     * Create an instance of {@link InvoiceIssueDateType }
     * 
     */
    public InvoiceIssueDateType createInvoiceIssueDateType() {
        return new InvoiceIssueDateType();
    }

    /**
     * Create an instance of {@link DiscountsType }
     * 
     */
    public DiscountsType createDiscountsType() {
        return new DiscountsType();
    }

    /**
     * Create an instance of {@link CertificateOfAnalysisBatchDetailType }
     * 
     */
    public CertificateOfAnalysisBatchDetailType createCertificateOfAnalysisBatchDetailType() {
        return new CertificateOfAnalysisBatchDetailType();
    }

    /**
     * Create an instance of {@link ContractProductLineItemType }
     * 
     */
    public ContractProductLineItemType createContractProductLineItemType() {
        return new ContractProductLineItemType();
    }

    /**
     * Create an instance of {@link OrderStatusRequestDetailsType }
     * 
     */
    public OrderStatusRequestDetailsType createOrderStatusRequestDetailsType() {
        return new OrderStatusRequestDetailsType();
    }

    /**
     * Create an instance of {@link CostSupportResponseBodyType }
     * 
     */
    public CostSupportResponseBodyType createCostSupportResponseBodyType() {
        return new CostSupportResponseBodyType();
    }

    /**
     * Create an instance of {@link CostSupportRequestPartnersType }
     * 
     */
    public CostSupportRequestPartnersType createCostSupportRequestPartnersType() {
        return new CostSupportRequestPartnersType();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link AcceptanceNotificationPropertiesType }
     * 
     */
    public AcceptanceNotificationPropertiesType createAcceptanceNotificationPropertiesType() {
        return new AcceptanceNotificationPropertiesType();
    }

    /**
     * Create an instance of {@link SafetyPhraseType }
     * 
     */
    public SafetyPhraseType createSafetyPhraseType() {
        return new SafetyPhraseType();
    }

    /**
     * Create an instance of {@link DeliveryReceiptLocationType }
     * 
     */
    public DeliveryReceiptLocationType createDeliveryReceiptLocationType() {
        return new DeliveryReceiptLocationType();
    }

    /**
     * Create an instance of {@link ShipNoticePropertiesType }
     * 
     */
    public ShipNoticePropertiesType createShipNoticePropertiesType() {
        return new ShipNoticePropertiesType();
    }

    /**
     * Create an instance of {@link PriceAndAvailabilityRequestDetailsType }
     * 
     */
    public PriceAndAvailabilityRequestDetailsType createPriceAndAvailabilityRequestDetailsType() {
        return new PriceAndAvailabilityRequestDetailsType();
    }

    /**
     * Create an instance of {@link QualificationStatusInformationType }
     * 
     */
    public QualificationStatusInformationType createQualificationStatusInformationType() {
        return new QualificationStatusInformationType();
    }

    /**
     * Create an instance of {@link ControlledTemperatureType }
     * 
     */
    public ControlledTemperatureType createControlledTemperatureType() {
        return new ControlledTemperatureType();
    }

    /**
     * Create an instance of {@link OrderCreateType }
     * 
     */
    public OrderCreateType createOrderCreateType() {
        return new OrderCreateType();
    }

    /**
     * Create an instance of {@link DemandPlanPropertiesType }
     * 
     */
    public DemandPlanPropertiesType createDemandPlanPropertiesType() {
        return new DemandPlanPropertiesType();
    }

    /**
     * Create an instance of {@link CountryOfFinalDestinationCodeType }
     * 
     */
    public CountryOfFinalDestinationCodeType createCountryOfFinalDestinationCodeType() {
        return new CountryOfFinalDestinationCodeType();
    }

    /**
     * Create an instance of {@link ExemptType }
     * 
     */
    public ExemptType createExemptType() {
        return new ExemptType();
    }

    /**
     * Create an instance of {@link OrderChangeDetailsType }
     * 
     */
    public OrderChangeDetailsType createOrderChangeDetailsType() {
        return new OrderChangeDetailsType();
    }

    /**
     * Create an instance of {@link ForecastedProductMovementTransactionsType }
     * 
     */
    public ForecastedProductMovementTransactionsType createForecastedProductMovementTransactionsType() {
        return new ForecastedProductMovementTransactionsType();
    }

    /**
     * Create an instance of {@link ShippingTotalAmountType }
     * 
     */
    public ShippingTotalAmountType createShippingTotalAmountType() {
        return new ShippingTotalAmountType();
    }

    /**
     * Create an instance of {@link PriceSheetEffectiveDateType }
     * 
     */
    public PriceSheetEffectiveDateType createPriceSheetEffectiveDateType() {
        return new PriceSheetEffectiveDateType();
    }

    /**
     * Create an instance of {@link PostingNumberType }
     * 
     */
    public PostingNumberType createPostingNumberType() {
        return new PostingNumberType();
    }

    /**
     * Create an instance of {@link DocumentReferenceType }
     * 
     */
    public DocumentReferenceType createDocumentReferenceType() {
        return new DocumentReferenceType();
    }

    /**
     * Create an instance of {@link ShipmentDateTimeType }
     * 
     */
    public ShipmentDateTimeType createShipmentDateTimeType() {
        return new ShipmentDateTimeType();
    }

    /**
     * Create an instance of {@link FromUnitOfMeasureType }
     * 
     */
    public FromUnitOfMeasureType createFromUnitOfMeasureType() {
        return new FromUnitOfMeasureType();
    }

    /**
     * Create an instance of {@link CustomerSpecificCatalogUpdateProductLineItemType }
     * 
     */
    public CustomerSpecificCatalogUpdateProductLineItemType createCustomerSpecificCatalogUpdateProductLineItemType() {
        return new CustomerSpecificCatalogUpdateProductLineItemType();
    }

    /**
     * Create an instance of {@link SoldToType }
     * 
     */
    public SoldToType createSoldToType() {
        return new SoldToType();
    }

    /**
     * Create an instance of {@link EmergencyResponseContactType }
     * 
     */
    public EmergencyResponseContactType createEmergencyResponseContactType() {
        return new EmergencyResponseContactType();
    }

    /**
     * Create an instance of {@link ForecastedProductMovementTransactionDetailsType }
     * 
     */
    public ForecastedProductMovementTransactionDetailsType createForecastedProductMovementTransactionDetailsType() {
        return new ForecastedProductMovementTransactionDetailsType();
    }

    /**
     * Create an instance of {@link ShipmentStatusPartnersType }
     * 
     */
    public ShipmentStatusPartnersType createShipmentStatusPartnersType() {
        return new ShipmentStatusPartnersType();
    }

    /**
     * Create an instance of {@link ProductCatalogUpdatePartnersType }
     * 
     */
    public ProductCatalogUpdatePartnersType createProductCatalogUpdatePartnersType() {
        return new ProductCatalogUpdatePartnersType();
    }

    /**
     * Create an instance of {@link ExchangeRateDateType }
     * 
     */
    public ExchangeRateDateType createExchangeRateDateType() {
        return new ExchangeRateDateType();
    }

    /**
     * Create an instance of {@link OrderResponsePropertiesType }
     * 
     */
    public OrderResponsePropertiesType createOrderResponsePropertiesType() {
        return new OrderResponsePropertiesType();
    }

    /**
     * Create an instance of {@link TremcardCodeType }
     * 
     */
    public TremcardCodeType createTremcardCodeType() {
        return new TremcardCodeType();
    }

    /**
     * Create an instance of {@link NetVolumeType }
     * 
     */
    public NetVolumeType createNetVolumeType() {
        return new NetVolumeType();
    }

    /**
     * Create an instance of {@link DeliveryDateTimeType }
     * 
     */
    public DeliveryDateTimeType createDeliveryDateTimeType() {
        return new DeliveryDateTimeType();
    }

    /**
     * Create an instance of {@link AdjustmentAmountType }
     * 
     */
    public AdjustmentAmountType createAdjustmentAmountType() {
        return new AdjustmentAmountType();
    }

    /**
     * Create an instance of {@link PHValueType }
     * 
     */
    public PHValueType createPHValueType() {
        return new PHValueType();
    }

    /**
     * Create an instance of {@link HazardousPropertiesType }
     * 
     */
    public HazardousPropertiesType createHazardousPropertiesType() {
        return new HazardousPropertiesType();
    }

    /**
     * Create an instance of {@link DemandPlanLineItemType }
     * 
     */
    public DemandPlanLineItemType createDemandPlanLineItemType() {
        return new DemandPlanLineItemType();
    }

    /**
     * Create an instance of {@link AcceptanceNotificationLineItemType }
     * 
     */
    public AcceptanceNotificationLineItemType createAcceptanceNotificationLineItemType() {
        return new AcceptanceNotificationLineItemType();
    }

    /**
     * Create an instance of {@link TaxableAmountType }
     * 
     */
    public TaxableAmountType createTaxableAmountType() {
        return new TaxableAmountType();
    }

    /**
     * Create an instance of {@link CarrierWeightsDetailsType }
     * 
     */
    public CarrierWeightsDetailsType createCarrierWeightsDetailsType() {
        return new CarrierWeightsDetailsType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link CostSupportDurationType }
     * 
     */
    public CostSupportDurationType createCostSupportDurationType() {
        return new CostSupportDurationType();
    }

    /**
     * Create an instance of {@link TotalNumberOfEquipmentType }
     * 
     */
    public TotalNumberOfEquipmentType createTotalNumberOfEquipmentType() {
        return new TotalNumberOfEquipmentType();
    }

    /**
     * Create an instance of {@link MaximumQuantityType }
     * 
     */
    public MaximumQuantityType createMaximumQuantityType() {
        return new MaximumQuantityType();
    }

    /**
     * Create an instance of {@link DemandForecastResponsePropertiesType }
     * 
     */
    public DemandForecastResponsePropertiesType createDemandForecastResponsePropertiesType() {
        return new DemandForecastResponsePropertiesType();
    }

    /**
     * Create an instance of {@link SecondCurrencyType }
     * 
     */
    public SecondCurrencyType createSecondCurrencyType() {
        return new SecondCurrencyType();
    }

    /**
     * Create an instance of {@link HazardousIdentificationType }
     * 
     */
    public HazardousIdentificationType createHazardousIdentificationType() {
        return new HazardousIdentificationType();
    }

    /**
     * Create an instance of {@link ShipNoticeListPropertiesType }
     * 
     */
    public ShipNoticeListPropertiesType createShipNoticeListPropertiesType() {
        return new ShipNoticeListPropertiesType();
    }

    /**
     * Create an instance of {@link ThisDocumentIdentifierType }
     * 
     */
    public ThisDocumentIdentifierType createThisDocumentIdentifierType() {
        return new ThisDocumentIdentifierType();
    }

    /**
     * Create an instance of {@link DeliveryConfirmationType }
     * 
     */
    public DeliveryConfirmationType createDeliveryConfirmationType() {
        return new DeliveryConfirmationType();
    }

    /**
     * Create an instance of {@link SoldByType }
     * 
     */
    public SoldByType createSoldByType() {
        return new SoldByType();
    }

    /**
     * Create an instance of {@link MeasurementInformationType }
     * 
     */
    public MeasurementInformationType createMeasurementInformationType() {
        return new MeasurementInformationType();
    }

    /**
     * Create an instance of {@link PaymentDetailLineItemType }
     * 
     */
    public PaymentDetailLineItemType createPaymentDetailLineItemType() {
        return new PaymentDetailLineItemType();
    }

    /**
     * Create an instance of {@link NetDistributorCostType }
     * 
     */
    public NetDistributorCostType createNetDistributorCostType() {
        return new NetDistributorCostType();
    }

    /**
     * Create an instance of {@link InventoryProductType }
     * 
     */
    public InventoryProductType createInventoryProductType() {
        return new InventoryProductType();
    }

    /**
     * Create an instance of {@link PriceAndAvailabilityResponseType }
     * 
     */
    public PriceAndAvailabilityResponseType createPriceAndAvailabilityResponseType() {
        return new PriceAndAvailabilityResponseType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalRequestType }
     * 
     */
    public ReplenishmentProposalRequestType createReplenishmentProposalRequestType() {
        return new ReplenishmentProposalRequestType();
    }

    /**
     * Create an instance of {@link DeliveryReceiptResponseType }
     * 
     */
    public DeliveryReceiptResponseType createDeliveryReceiptResponseType() {
        return new DeliveryReceiptResponseType();
    }

    /**
     * Create an instance of {@link ShippingAvailabilityDateType }
     * 
     */
    public ShippingAvailabilityDateType createShippingAvailabilityDateType() {
        return new ShippingAvailabilityDateType();
    }

    /**
     * Create an instance of {@link OrderStatusListResponsePropertiesType }
     * 
     */
    public OrderStatusListResponsePropertiesType createOrderStatusListResponsePropertiesType() {
        return new OrderStatusListResponsePropertiesType();
    }

    /**
     * Create an instance of {@link ProductMovementReportType }
     * 
     */
    public ProductMovementReportType createProductMovementReportType() {
        return new ProductMovementReportType();
    }

    /**
     * Create an instance of {@link ShippedQuantityType }
     * 
     */
    public ShippedQuantityType createShippedQuantityType() {
        return new ShippedQuantityType();
    }

    /**
     * Create an instance of {@link OrderStatusListRequestPropertiesType }
     * 
     */
    public OrderStatusListRequestPropertiesType createOrderStatusListRequestPropertiesType() {
        return new OrderStatusListRequestPropertiesType();
    }

    /**
     * Create an instance of {@link OrderStatusListRequestPartnersType }
     * 
     */
    public OrderStatusListRequestPartnersType createOrderStatusListRequestPartnersType() {
        return new OrderStatusListRequestPartnersType();
    }

    /**
     * Create an instance of {@link LocationCodeType }
     * 
     */
    public LocationCodeType createLocationCodeType() {
        return new LocationCodeType();
    }

    /**
     * Create an instance of {@link PaymentBodyType }
     * 
     */
    public PaymentBodyType createPaymentBodyType() {
        return new PaymentBodyType();
    }

    /**
     * Create an instance of {@link ProductQuantityType }
     * 
     */
    public ProductQuantityType createProductQuantityType() {
        return new ProductQuantityType();
    }

    /**
     * Create an instance of {@link RelativeDueDateType }
     * 
     */
    public RelativeDueDateType createRelativeDueDateType() {
        return new RelativeDueDateType();
    }

    /**
     * Create an instance of {@link TotalNumberOfPackagesType }
     * 
     */
    public TotalNumberOfPackagesType createTotalNumberOfPackagesType() {
        return new TotalNumberOfPackagesType();
    }

    /**
     * Create an instance of {@link FreightBillPartnersType }
     * 
     */
    public FreightBillPartnersType createFreightBillPartnersType() {
        return new FreightBillPartnersType();
    }

    /**
     * Create an instance of {@link InventoryInTankType }
     * 
     */
    public InventoryInTankType createInventoryInTankType() {
        return new InventoryInTankType();
    }

    /**
     * Create an instance of {@link ShipNoticeBodyType }
     * 
     */
    public ShipNoticeBodyType createShipNoticeBodyType() {
        return new ShipNoticeBodyType();
    }

    /**
     * Create an instance of {@link OrderableIncrementType }
     * 
     */
    public OrderableIncrementType createOrderableIncrementType() {
        return new OrderableIncrementType();
    }

    /**
     * Create an instance of {@link CreditCardInformationType }
     * 
     */
    public CreditCardInformationType createCreditCardInformationType() {
        return new CreditCardInformationType();
    }

    /**
     * Create an instance of {@link SpecialFulfillmentRequestCodeType }
     * 
     */
    public SpecialFulfillmentRequestCodeType createSpecialFulfillmentRequestCodeType() {
        return new SpecialFulfillmentRequestCodeType();
    }

    /**
     * Create an instance of {@link DeliveryReceiptPropertiesType }
     * 
     */
    public DeliveryReceiptPropertiesType createDeliveryReceiptPropertiesType() {
        return new DeliveryReceiptPropertiesType();
    }

    /**
     * Create an instance of {@link LoadingCapacityRangeType }
     * 
     */
    public LoadingCapacityRangeType createLoadingCapacityRangeType() {
        return new LoadingCapacityRangeType();
    }

    /**
     * Create an instance of {@link CountryOfOrginCodeType }
     * 
     */
    public CountryOfOrginCodeType createCountryOfOrginCodeType() {
        return new CountryOfOrginCodeType();
    }

    /**
     * Create an instance of {@link PurchaseOrderIssuedDateType }
     * 
     */
    public PurchaseOrderIssuedDateType createPurchaseOrderIssuedDateType() {
        return new PurchaseOrderIssuedDateType();
    }

    /**
     * Create an instance of {@link InventoryLevelType }
     * 
     */
    public InventoryLevelType createInventoryLevelType() {
        return new InventoryLevelType();
    }

    /**
     * Create an instance of {@link SupplyPlanPartnersType }
     * 
     */
    public SupplyPlanPartnersType createSupplyPlanPartnersType() {
        return new SupplyPlanPartnersType();
    }

    /**
     * Create an instance of {@link PostingStatusRequestPropertiesType }
     * 
     */
    public PostingStatusRequestPropertiesType createPostingStatusRequestPropertiesType() {
        return new PostingStatusRequestPropertiesType();
    }

    /**
     * Create an instance of {@link SafetyCodeType }
     * 
     */
    public SafetyCodeType createSafetyCodeType() {
        return new SafetyCodeType();
    }

    /**
     * Create an instance of {@link ContractBodyType }
     * 
     */
    public ContractBodyType createContractBodyType() {
        return new ContractBodyType();
    }

    /**
     * Create an instance of {@link PostingResponseLineItemType }
     * 
     */
    public PostingResponseLineItemType createPostingResponseLineItemType() {
        return new PostingResponseLineItemType();
    }

    /**
     * Create an instance of {@link OrderResponseBodyType }
     * 
     */
    public OrderResponseBodyType createOrderResponseBodyType() {
        return new OrderResponseBodyType();
    }

    /**
     * Create an instance of {@link QualitativeResultType }
     * 
     */
    public QualitativeResultType createQualitativeResultType() {
        return new QualitativeResultType();
    }

    /**
     * Create an instance of {@link MinimumOrderQuantityType }
     * 
     */
    public MinimumOrderQuantityType createMinimumOrderQuantityType() {
        return new MinimumOrderQuantityType();
    }

    /**
     * Create an instance of {@link DateSampleTakenType }
     * 
     */
    public DateSampleTakenType createDateSampleTakenType() {
        return new DateSampleTakenType();
    }

    /**
     * Create an instance of {@link MonetaryAmountType }
     * 
     */
    public MonetaryAmountType createMonetaryAmountType() {
        return new MonetaryAmountType();
    }

    /**
     * Create an instance of {@link DensityType }
     * 
     */
    public DensityType createDensityType() {
        return new DensityType();
    }

    /**
     * Create an instance of {@link SafetyDescriptionType }
     * 
     */
    public SafetyDescriptionType createSafetyDescriptionType() {
        return new SafetyDescriptionType();
    }

    /**
     * Create an instance of {@link LoadTenderOceanBodyType }
     * 
     */
    public LoadTenderOceanBodyType createLoadTenderOceanBodyType() {
        return new LoadTenderOceanBodyType();
    }

    /**
     * Create an instance of {@link CostSupportResponseDetailsType }
     * 
     */
    public CostSupportResponseDetailsType createCostSupportResponseDetailsType() {
        return new CostSupportResponseDetailsType();
    }

    /**
     * Create an instance of {@link PriceAndAvailabilityRequestType }
     * 
     */
    public PriceAndAvailabilityRequestType createPriceAndAvailabilityRequestType() {
        return new PriceAndAvailabilityRequestType();
    }

    /**
     * Create an instance of {@link InventoryActualUsageResponsePropertiesType }
     * 
     */
    public InventoryActualUsageResponsePropertiesType createInventoryActualUsageResponsePropertiesType() {
        return new InventoryActualUsageResponsePropertiesType();
    }

    /**
     * Create an instance of {@link GeographicFeaturesType }
     * 
     */
    public GeographicFeaturesType createGeographicFeaturesType() {
        return new GeographicFeaturesType();
    }

    /**
     * Create an instance of {@link AirTransportInformationType }
     * 
     */
    public AirTransportInformationType createAirTransportInformationType() {
        return new AirTransportInformationType();
    }

    /**
     * Create an instance of {@link RequestForQuoteType }
     * 
     */
    public RequestForQuoteType createRequestForQuoteType() {
        return new RequestForQuoteType();
    }

    /**
     * Create an instance of {@link NFPACodeType }
     * 
     */
    public NFPACodeType createNFPACodeType() {
        return new NFPACodeType();
    }

    /**
     * Create an instance of {@link AccountInformationType }
     * 
     */
    public AccountInformationType createAccountInformationType() {
        return new AccountInformationType();
    }

    /**
     * Create an instance of {@link BillToType }
     * 
     */
    public BillToType createBillToType() {
        return new BillToType();
    }

    /**
     * Create an instance of {@link PriceSheetPriceDataType }
     * 
     */
    public PriceSheetPriceDataType createPriceSheetPriceDataType() {
        return new PriceSheetPriceDataType();
    }

    /**
     * Create an instance of {@link LoadBuildingResponsePropertiesType }
     * 
     */
    public LoadBuildingResponsePropertiesType createLoadBuildingResponsePropertiesType() {
        return new LoadBuildingResponsePropertiesType();
    }

    /**
     * Create an instance of {@link RequestedDeliveryDateTimeType }
     * 
     */
    public RequestedDeliveryDateTimeType createRequestedDeliveryDateTimeType() {
        return new RequestedDeliveryDateTimeType();
    }

    /**
     * Create an instance of {@link TankTypeType }
     * 
     */
    public TankTypeType createTankTypeType() {
        return new TankTypeType();
    }

    /**
     * Create an instance of {@link QualificationResponseDetailsType }
     * 
     */
    public QualificationResponseDetailsType createQualificationResponseDetailsType() {
        return new QualificationResponseDetailsType();
    }

    /**
     * Create an instance of {@link ReceiptNoticeProductLineItemType }
     * 
     */
    public ReceiptNoticeProductLineItemType createReceiptNoticeProductLineItemType() {
        return new ReceiptNoticeProductLineItemType();
    }

    /**
     * Create an instance of {@link CostSupportResponseStatusInformationType }
     * 
     */
    public CostSupportResponseStatusInformationType createCostSupportResponseStatusInformationType() {
        return new CostSupportResponseStatusInformationType();
    }

    /**
     * Create an instance of {@link OrderResponsePartnersType }
     * 
     */
    public OrderResponsePartnersType createOrderResponsePartnersType() {
        return new OrderResponsePartnersType();
    }

    /**
     * Create an instance of {@link ReceiptNoticeDetailsType }
     * 
     */
    public ReceiptNoticeDetailsType createReceiptNoticeDetailsType() {
        return new ReceiptNoticeDetailsType();
    }

    /**
     * Create an instance of {@link ShipmentInstructionsLineItemType }
     * 
     */
    public ShipmentInstructionsLineItemType createShipmentInstructionsLineItemType() {
        return new ShipmentInstructionsLineItemType();
    }

    /**
     * Create an instance of {@link ShipEndDateType }
     * 
     */
    public ShipEndDateType createShipEndDateType() {
        return new ShipEndDateType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalRequestLineItemType }
     * 
     */
    public ReplenishmentProposalRequestLineItemType createReplenishmentProposalRequestLineItemType() {
        return new ReplenishmentProposalRequestLineItemType();
    }

    /**
     * Create an instance of {@link UNSpecialRequirementsType }
     * 
     */
    public UNSpecialRequirementsType createUNSpecialRequirementsType() {
        return new UNSpecialRequirementsType();
    }

    /**
     * Create an instance of {@link ShipNoticeProductLineItemType }
     * 
     */
    public ShipNoticeProductLineItemType createShipNoticeProductLineItemType() {
        return new ShipNoticeProductLineItemType();
    }

    /**
     * Create an instance of {@link ProjectedVolumeType }
     * 
     */
    public ProjectedVolumeType createProjectedVolumeType() {
        return new ProjectedVolumeType();
    }

    /**
     * Create an instance of {@link LoadTenderRailProductLineItemType }
     * 
     */
    public LoadTenderRailProductLineItemType createLoadTenderRailProductLineItemType() {
        return new LoadTenderRailProductLineItemType();
    }

    /**
     * Create an instance of {@link LoadTenderResponseProductLineItemType }
     * 
     */
    public LoadTenderResponseProductLineItemType createLoadTenderResponseProductLineItemType() {
        return new LoadTenderResponseProductLineItemType();
    }

    /**
     * Create an instance of {@link PackingGroupCodeType }
     * 
     */
    public PackingGroupCodeType createPackingGroupCodeType() {
        return new PackingGroupCodeType();
    }

    /**
     * Create an instance of {@link PortOfDischargeCodeType }
     * 
     */
    public PortOfDischargeCodeType createPortOfDischargeCodeType() {
        return new PortOfDischargeCodeType();
    }

    /**
     * Create an instance of {@link ListPriceType }
     * 
     */
    public ListPriceType createListPriceType() {
        return new ListPriceType();
    }

    /**
     * Create an instance of {@link CostSupportRequestBodyType }
     * 
     */
    public CostSupportRequestBodyType createCostSupportRequestBodyType() {
        return new CostSupportRequestBodyType();
    }

    /**
     * Create an instance of {@link InvoiceDetailsType }
     * 
     */
    public InvoiceDetailsType createInvoiceDetailsType() {
        return new InvoiceDetailsType();
    }

    /**
     * Create an instance of {@link MeasurementType }
     * 
     */
    public MeasurementType createMeasurementType() {
        return new MeasurementType();
    }

    /**
     * Create an instance of {@link PriceAndAvailabilityRequestProductLineItemType }
     * 
     */
    public PriceAndAvailabilityRequestProductLineItemType createPriceAndAvailabilityRequestProductLineItemType() {
        return new PriceAndAvailabilityRequestProductLineItemType();
    }

    /**
     * Create an instance of {@link RequestedCostSupportType }
     * 
     */
    public RequestedCostSupportType createRequestedCostSupportType() {
        return new RequestedCostSupportType();
    }

    /**
     * Create an instance of {@link DeliveryReceiptResponseDetailsType }
     * 
     */
    public DeliveryReceiptResponseDetailsType createDeliveryReceiptResponseDetailsType() {
        return new DeliveryReceiptResponseDetailsType();
    }

    /**
     * Create an instance of {@link FinancialInstitutionIdentificationType }
     * 
     */
    public FinancialInstitutionIdentificationType createFinancialInstitutionIdentificationType() {
        return new FinancialInstitutionIdentificationType();
    }

    /**
     * Create an instance of {@link ShipmentStatusRequestDetailsType }
     * 
     */
    public ShipmentStatusRequestDetailsType createShipmentStatusRequestDetailsType() {
        return new ShipmentStatusRequestDetailsType();
    }

    /**
     * Create an instance of {@link EUSubstanceNumberType }
     * 
     */
    public EUSubstanceNumberType createEUSubstanceNumberType() {
        return new EUSubstanceNumberType();
    }

    /**
     * Create an instance of {@link DeliveryReceiptPartnersType }
     * 
     */
    public DeliveryReceiptPartnersType createDeliveryReceiptPartnersType() {
        return new DeliveryReceiptPartnersType();
    }

    /**
     * Create an instance of {@link PaymentDetailBodyType }
     * 
     */
    public PaymentDetailBodyType createPaymentDetailBodyType() {
        return new PaymentDetailBodyType();
    }

    /**
     * Create an instance of {@link DeliveryTermsCodeType }
     * 
     */
    public DeliveryTermsCodeType createDeliveryTermsCodeType() {
        return new DeliveryTermsCodeType();
    }

    /**
     * Create an instance of {@link RebateInKindQuantityType }
     * 
     */
    public RebateInKindQuantityType createRebateInKindQuantityType() {
        return new RebateInKindQuantityType();
    }

    /**
     * Create an instance of {@link AllowanceChargeAmountType }
     * 
     */
    public AllowanceChargeAmountType createAllowanceChargeAmountType() {
        return new AllowanceChargeAmountType();
    }

    /**
     * Create an instance of {@link CumulativeTotalQuantityType }
     * 
     */
    public CumulativeTotalQuantityType createCumulativeTotalQuantityType() {
        return new CumulativeTotalQuantityType();
    }

    /**
     * Create an instance of {@link PaymentType }
     * 
     */
    public PaymentType createPaymentType() {
        return new PaymentType();
    }

    /**
     * Create an instance of {@link PaymentDueDateType }
     * 
     */
    public PaymentDueDateType createPaymentDueDateType() {
        return new PaymentDueDateType();
    }

    /**
     * Create an instance of {@link FreightBillTotalsType }
     * 
     */
    public FreightBillTotalsType createFreightBillTotalsType() {
        return new FreightBillTotalsType();
    }

    /**
     * Create an instance of {@link CarrierWeightsType }
     * 
     */
    public CarrierWeightsType createCarrierWeightsType() {
        return new CarrierWeightsType();
    }

    /**
     * Create an instance of {@link OperationalInstructionsType }
     * 
     */
    public OperationalInstructionsType createOperationalInstructionsType() {
        return new OperationalInstructionsType();
    }

    /**
     * Create an instance of {@link LoadBuildingMotorType }
     * 
     */
    public LoadBuildingMotorType createLoadBuildingMotorType() {
        return new LoadBuildingMotorType();
    }

    /**
     * Create an instance of {@link StatusEffectiveDateType }
     * 
     */
    public StatusEffectiveDateType createStatusEffectiveDateType() {
        return new StatusEffectiveDateType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalChangePartnersType }
     * 
     */
    public ReplenishmentProposalChangePartnersType createReplenishmentProposalChangePartnersType() {
        return new ReplenishmentProposalChangePartnersType();
    }

    /**
     * Create an instance of {@link ShipNoticeListRequestType }
     * 
     */
    public ShipNoticeListRequestType createShipNoticeListRequestType() {
        return new ShipNoticeListRequestType();
    }

    /**
     * Create an instance of {@link DemandPlanPartnersType }
     * 
     */
    public DemandPlanPartnersType createDemandPlanPartnersType() {
        return new DemandPlanPartnersType();
    }

    /**
     * Create an instance of {@link CostSupportCreditResponseBodyType }
     * 
     */
    public CostSupportCreditResponseBodyType createCostSupportCreditResponseBodyType() {
        return new CostSupportCreditResponseBodyType();
    }

    /**
     * Create an instance of {@link CommentType }
     * 
     */
    public CommentType createCommentType() {
        return new CommentType();
    }

    /**
     * Create an instance of {@link ToUnitOfMeasureType }
     * 
     */
    public ToUnitOfMeasureType createToUnitOfMeasureType() {
        return new ToUnitOfMeasureType();
    }

    /**
     * Create an instance of {@link ShipStartDateType }
     * 
     */
    public ShipStartDateType createShipStartDateType() {
        return new ShipStartDateType();
    }

    /**
     * Create an instance of {@link ShipNoticeListRequestBodyType }
     * 
     */
    public ShipNoticeListRequestBodyType createShipNoticeListRequestBodyType() {
        return new ShipNoticeListRequestBodyType();
    }

    /**
     * Create an instance of {@link AlternativeCommunicationMethodType }
     * 
     */
    public AlternativeCommunicationMethodType createAlternativeCommunicationMethodType() {
        return new AlternativeCommunicationMethodType();
    }

    /**
     * Create an instance of {@link ShipmentStatusRequestType }
     * 
     */
    public ShipmentStatusRequestType createShipmentStatusRequestType() {
        return new ShipmentStatusRequestType();
    }

    /**
     * Create an instance of {@link MaximumSalesVolumeType }
     * 
     */
    public MaximumSalesVolumeType createMaximumSalesVolumeType() {
        return new MaximumSalesVolumeType();
    }

    /**
     * Create an instance of {@link EstimatedTimeOfArrivalDateType }
     * 
     */
    public EstimatedTimeOfArrivalDateType createEstimatedTimeOfArrivalDateType() {
        return new EstimatedTimeOfArrivalDateType();
    }

    /**
     * Create an instance of {@link PaymentDetailType }
     * 
     */
    public PaymentDetailType createPaymentDetailType() {
        return new PaymentDetailType();
    }

    /**
     * Create an instance of {@link ZoneGeographyType }
     * 
     */
    public ZoneGeographyType createZoneGeographyType() {
        return new ZoneGeographyType();
    }

    /**
     * Create an instance of {@link CostSupportCreditResponsePartnersType }
     * 
     */
    public CostSupportCreditResponsePartnersType createCostSupportCreditResponsePartnersType() {
        return new CostSupportCreditResponsePartnersType();
    }

    /**
     * Create an instance of {@link OrderedProductQuantityType }
     * 
     */
    public OrderedProductQuantityType createOrderedProductQuantityType() {
        return new OrderedProductQuantityType();
    }

    /**
     * Create an instance of {@link PartnerInformationType }
     * 
     */
    public PartnerInformationType createPartnerInformationType() {
        return new PartnerInformationType();
    }

    /**
     * Create an instance of {@link ContactInformationType }
     * 
     */
    public ContactInformationType createContactInformationType() {
        return new ContactInformationType();
    }

    /**
     * Create an instance of {@link ContractExpirationDateType }
     * 
     */
    public ContractExpirationDateType createContractExpirationDateType() {
        return new ContractExpirationDateType();
    }

    /**
     * Create an instance of {@link ReceiptNoticeType }
     * 
     */
    public ReceiptNoticeType createReceiptNoticeType() {
        return new ReceiptNoticeType();
    }

    /**
     * Create an instance of {@link OrderStatusResponseBodyType }
     * 
     */
    public OrderStatusResponseBodyType createOrderStatusResponseBodyType() {
        return new OrderStatusResponseBodyType();
    }

    /**
     * Create an instance of {@link BatchNumberType }
     * 
     */
    public BatchNumberType createBatchNumberType() {
        return new BatchNumberType();
    }

    /**
     * Create an instance of {@link SupportedSellingPriceType }
     * 
     */
    public SupportedSellingPriceType createSupportedSellingPriceType() {
        return new SupportedSellingPriceType();
    }

    /**
     * Create an instance of {@link AllowanceChargeType }
     * 
     */
    public AllowanceChargeType createAllowanceChargeType() {
        return new AllowanceChargeType();
    }

    /**
     * Create an instance of {@link ProductFormulaType }
     * 
     */
    public ProductFormulaType createProductFormulaType() {
        return new ProductFormulaType();
    }

    /**
     * Create an instance of {@link DemandForecastType }
     * 
     */
    public DemandForecastType createDemandForecastType() {
        return new DemandForecastType();
    }

    /**
     * Create an instance of {@link CustomerSpecificCatalogPriceDataType }
     * 
     */
    public CustomerSpecificCatalogPriceDataType createCustomerSpecificCatalogPriceDataType() {
        return new CustomerSpecificCatalogPriceDataType();
    }

    /**
     * Create an instance of {@link LoadTenderOceanProductLineItemType }
     * 
     */
    public LoadTenderOceanProductLineItemType createLoadTenderOceanProductLineItemType() {
        return new LoadTenderOceanProductLineItemType();
    }

    /**
     * Create an instance of {@link AcceptanceNotificationLocationType }
     * 
     */
    public AcceptanceNotificationLocationType createAcceptanceNotificationLocationType() {
        return new AcceptanceNotificationLocationType();
    }

    /**
     * Create an instance of {@link OrderChangeBodyType }
     * 
     */
    public OrderChangeBodyType createOrderChangeBodyType() {
        return new OrderChangeBodyType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalLocationType }
     * 
     */
    public ReplenishmentProposalLocationType createReplenishmentProposalLocationType() {
        return new ReplenishmentProposalLocationType();
    }

    /**
     * Create an instance of {@link SplitsType }
     * 
     */
    public SplitsType createSplitsType() {
        return new SplitsType();
    }

    /**
     * Create an instance of {@link InventoryActualUsagePartnersType }
     * 
     */
    public InventoryActualUsagePartnersType createInventoryActualUsagePartnersType() {
        return new InventoryActualUsagePartnersType();
    }

    /**
     * Create an instance of {@link HazardousGoodsType }
     * 
     */
    public HazardousGoodsType createHazardousGoodsType() {
        return new HazardousGoodsType();
    }

    /**
     * Create an instance of {@link CostSupportCreditResponseDetailsType }
     * 
     */
    public CostSupportCreditResponseDetailsType createCostSupportCreditResponseDetailsType() {
        return new CostSupportCreditResponseDetailsType();
    }

    /**
     * Create an instance of {@link PriceEffectiveDateType }
     * 
     */
    public PriceEffectiveDateType createPriceEffectiveDateType() {
        return new PriceEffectiveDateType();
    }

    /**
     * Create an instance of {@link ContractInformationType }
     * 
     */
    public ContractInformationType createContractInformationType() {
        return new ContractInformationType();
    }

    /**
     * Create an instance of {@link ReceivedQuantityType }
     * 
     */
    public ReceivedQuantityType createReceivedQuantityType() {
        return new ReceivedQuantityType();
    }

    /**
     * Create an instance of {@link NotAvailableInCountryCodeType }
     * 
     */
    public NotAvailableInCountryCodeType createNotAvailableInCountryCodeType() {
        return new NotAvailableInCountryCodeType();
    }

    /**
     * Create an instance of {@link DemandForecastResponseBodyType }
     * 
     */
    public DemandForecastResponseBodyType createDemandForecastResponseBodyType() {
        return new DemandForecastResponseBodyType();
    }

    /**
     * Create an instance of {@link ProductIdentifierType }
     * 
     */
    public ProductIdentifierType createProductIdentifierType() {
        return new ProductIdentifierType();
    }

    /**
     * Create an instance of {@link WaterPollutionClassType }
     * 
     */
    public WaterPollutionClassType createWaterPollutionClassType() {
        return new WaterPollutionClassType();
    }

    /**
     * Create an instance of {@link PortDeliveryPointType }
     * 
     */
    public PortDeliveryPointType createPortDeliveryPointType() {
        return new PortDeliveryPointType();
    }

    /**
     * Create an instance of {@link RoundingFactorType }
     * 
     */
    public RoundingFactorType createRoundingFactorType() {
        return new RoundingFactorType();
    }

    /**
     * Create an instance of {@link PostalCodesType }
     * 
     */
    public PostalCodesType createPostalCodesType() {
        return new PostalCodesType();
    }

    /**
     * Create an instance of {@link HandlingStartDateTimeType }
     * 
     */
    public HandlingStartDateTimeType createHandlingStartDateTimeType() {
        return new HandlingStartDateTimeType();
    }

    /**
     * Create an instance of {@link AllowanceChargeRateInformationType }
     * 
     */
    public AllowanceChargeRateInformationType createAllowanceChargeRateInformationType() {
        return new AllowanceChargeRateInformationType();
    }

    /**
     * Create an instance of {@link ContainerIdentifierType }
     * 
     */
    public ContainerIdentifierType createContainerIdentifierType() {
        return new ContainerIdentifierType();
    }

    /**
     * Create an instance of {@link CostSupportResponsePropertiesType }
     * 
     */
    public CostSupportResponsePropertiesType createCostSupportResponsePropertiesType() {
        return new CostSupportResponsePropertiesType();
    }

    /**
     * Create an instance of {@link ShipmentInstructionsDetailsType }
     * 
     */
    public ShipmentInstructionsDetailsType createShipmentInstructionsDetailsType() {
        return new ShipmentInstructionsDetailsType();
    }

    /**
     * Create an instance of {@link DeferredAmountType }
     * 
     */
    public DeferredAmountType createDeferredAmountType() {
        return new DeferredAmountType();
    }

    /**
     * Create an instance of {@link StatesType }
     * 
     */
    public StatesType createStatesType() {
        return new StatesType();
    }

    /**
     * Create an instance of {@link ContractResponsePropertiesType }
     * 
     */
    public ContractResponsePropertiesType createContractResponsePropertiesType() {
        return new ContractResponsePropertiesType();
    }

    /**
     * Create an instance of {@link DocumentRecipientInformationType }
     * 
     */
    public DocumentRecipientInformationType createDocumentRecipientInformationType() {
        return new DocumentRecipientInformationType();
    }

    /**
     * Create an instance of {@link LoadBuildingResponseDetailsType }
     * 
     */
    public LoadBuildingResponseDetailsType createLoadBuildingResponseDetailsType() {
        return new LoadBuildingResponseDetailsType();
    }

    /**
     * Create an instance of {@link UnitVolumeType }
     * 
     */
    public UnitVolumeType createUnitVolumeType() {
        return new UnitVolumeType();
    }

    /**
     * Create an instance of {@link CostSupportCreditRequestPropertiesType }
     * 
     */
    public CostSupportCreditRequestPropertiesType createCostSupportCreditRequestPropertiesType() {
        return new CostSupportCreditRequestPropertiesType();
    }

    /**
     * Create an instance of {@link VoyageTripNumberType }
     * 
     */
    public VoyageTripNumberType createVoyageTripNumberType() {
        return new VoyageTripNumberType();
    }

    /**
     * Create an instance of {@link PostingCancelType }
     * 
     */
    public PostingCancelType createPostingCancelType() {
        return new PostingCancelType();
    }

    /**
     * Create an instance of {@link ShipmentIdentificationType }
     * 
     */
    public ShipmentIdentificationType createShipmentIdentificationType() {
        return new ShipmentIdentificationType();
    }

    /**
     * Create an instance of {@link ForecastedProductMovementReportBodyType }
     * 
     */
    public ForecastedProductMovementReportBodyType createForecastedProductMovementReportBodyType() {
        return new ForecastedProductMovementReportBodyType();
    }

    /**
     * Create an instance of {@link MarketPlaceDocumentReferenceType }
     * 
     */
    public MarketPlaceDocumentReferenceType createMarketPlaceDocumentReferenceType() {
        return new MarketPlaceDocumentReferenceType();
    }

    /**
     * Create an instance of {@link ShipmentReleaseDateType }
     * 
     */
    public ShipmentReleaseDateType createShipmentReleaseDateType() {
        return new ShipmentReleaseDateType();
    }

    /**
     * Create an instance of {@link ScheduledShipDateTimeType }
     * 
     */
    public ScheduledShipDateTimeType createScheduledShipDateTimeType() {
        return new ScheduledShipDateTimeType();
    }

    /**
     * Create an instance of {@link UpperLimitType }
     * 
     */
    public UpperLimitType createUpperLimitType() {
        return new UpperLimitType();
    }

    /**
     * Create an instance of {@link OtherPartnerType }
     * 
     */
    public OtherPartnerType createOtherPartnerType() {
        return new OtherPartnerType();
    }

    /**
     * Create an instance of {@link InvoiceBodyType }
     * 
     */
    public InvoiceBodyType createInvoiceBodyType() {
        return new InvoiceBodyType();
    }

    /**
     * Create an instance of {@link DeliveryConfirmationResponseProductLineItemType }
     * 
     */
    public DeliveryConfirmationResponseProductLineItemType createDeliveryConfirmationResponseProductLineItemType() {
        return new DeliveryConfirmationResponseProductLineItemType();
    }

    /**
     * Create an instance of {@link ForecastedProductMovementTransactionPropertiesType }
     * 
     */
    public ForecastedProductMovementTransactionPropertiesType createForecastedProductMovementTransactionPropertiesType() {
        return new ForecastedProductMovementTransactionPropertiesType();
    }

    /**
     * Create an instance of {@link TaxOrDutyTotalsType }
     * 
     */
    public TaxOrDutyTotalsType createTaxOrDutyTotalsType() {
        return new TaxOrDutyTotalsType();
    }

    /**
     * Create an instance of {@link DeclaredValueType }
     * 
     */
    public DeclaredValueType createDeclaredValueType() {
        return new DeclaredValueType();
    }

    /**
     * Create an instance of {@link RequestingDocumentDateTimeType }
     * 
     */
    public RequestingDocumentDateTimeType createRequestingDocumentDateTimeType() {
        return new RequestingDocumentDateTimeType();
    }

    /**
     * Create an instance of {@link ShipmentStatusType }
     * 
     */
    public ShipmentStatusType createShipmentStatusType() {
        return new ShipmentStatusType();
    }

    /**
     * Create an instance of {@link WeightType }
     * 
     */
    public WeightType createWeightType() {
        return new WeightType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalContentType }
     * 
     */
    public ReplenishmentProposalContentType createReplenishmentProposalContentType() {
        return new ReplenishmentProposalContentType();
    }

    /**
     * Create an instance of {@link PostingResponseType }
     * 
     */
    public PostingResponseType createPostingResponseType() {
        return new PostingResponseType();
    }

    /**
     * Create an instance of {@link LetterOfCreditDateTimeType }
     * 
     */
    public LetterOfCreditDateTimeType createLetterOfCreditDateTimeType() {
        return new LetterOfCreditDateTimeType();
    }

    /**
     * Create an instance of {@link EmergencyTemperatureType }
     * 
     */
    public EmergencyTemperatureType createEmergencyTemperatureType() {
        return new EmergencyTemperatureType();
    }

    /**
     * Create an instance of {@link PostingResponseDetailsType }
     * 
     */
    public PostingResponseDetailsType createPostingResponseDetailsType() {
        return new PostingResponseDetailsType();
    }

    /**
     * Create an instance of {@link TransportTemperatureType }
     * 
     */
    public TransportTemperatureType createTransportTemperatureType() {
        return new TransportTemperatureType();
    }

    /**
     * Create an instance of {@link LoadTenderRailDetailsType }
     * 
     */
    public LoadTenderRailDetailsType createLoadTenderRailDetailsType() {
        return new LoadTenderRailDetailsType();
    }

    /**
     * Create an instance of {@link DeliveryConfirmationPartnersType }
     * 
     */
    public DeliveryConfirmationPartnersType createDeliveryConfirmationPartnersType() {
        return new DeliveryConfirmationPartnersType();
    }

    /**
     * Create an instance of {@link PostingAcceptPartnersType }
     * 
     */
    public PostingAcceptPartnersType createPostingAcceptPartnersType() {
        return new PostingAcceptPartnersType();
    }

    /**
     * Create an instance of {@link CarrierReferenceInformationType }
     * 
     */
    public CarrierReferenceInformationType createCarrierReferenceInformationType() {
        return new CarrierReferenceInformationType();
    }

    /**
     * Create an instance of {@link PriceSheetProductLineItemType }
     * 
     */
    public PriceSheetProductLineItemType createPriceSheetProductLineItemType() {
        return new PriceSheetProductLineItemType();
    }

    /**
     * Create an instance of {@link ShipNoticeListType }
     * 
     */
    public ShipNoticeListType createShipNoticeListType() {
        return new ShipNoticeListType();
    }

    /**
     * Create an instance of {@link OrderCreatePropertiesType }
     * 
     */
    public OrderCreatePropertiesType createOrderCreatePropertiesType() {
        return new OrderCreatePropertiesType();
    }

    /**
     * Create an instance of {@link OrderChangeProductLineItemType }
     * 
     */
    public OrderChangeProductLineItemType createOrderChangeProductLineItemType() {
        return new OrderChangeProductLineItemType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalRequestLocationType }
     * 
     */
    public ReplenishmentProposalRequestLocationType createReplenishmentProposalRequestLocationType() {
        return new ReplenishmentProposalRequestLocationType();
    }

    /**
     * Create an instance of {@link ShipToType }
     * 
     */
    public ShipToType createShipToType() {
        return new ShipToType();
    }

    /**
     * Create an instance of {@link ShipmentQualifierCodeType }
     * 
     */
    public ShipmentQualifierCodeType createShipmentQualifierCodeType() {
        return new ShipmentQualifierCodeType();
    }

    /**
     * Create an instance of {@link TaxInformationType }
     * 
     */
    public TaxInformationType createTaxInformationType() {
        return new TaxInformationType();
    }

    /**
     * Create an instance of {@link BidDueDateType }
     * 
     */
    public BidDueDateType createBidDueDateType() {
        return new BidDueDateType();
    }

    /**
     * Create an instance of {@link OrderStatusRequestProductLineItemType }
     * 
     */
    public OrderStatusRequestProductLineItemType createOrderStatusRequestProductLineItemType() {
        return new OrderStatusRequestProductLineItemType();
    }

    /**
     * Create an instance of {@link PostingAcceptResponseLineItemType }
     * 
     */
    public PostingAcceptResponseLineItemType createPostingAcceptResponseLineItemType() {
        return new PostingAcceptResponseLineItemType();
    }

    /**
     * Create an instance of {@link InventoryActualUsageBodyType }
     * 
     */
    public InventoryActualUsageBodyType createInventoryActualUsageBodyType() {
        return new InventoryActualUsageBodyType();
    }

    /**
     * Create an instance of {@link WeightAllowanceType }
     * 
     */
    public WeightAllowanceType createWeightAllowanceType() {
        return new WeightAllowanceType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalChangeType }
     * 
     */
    public ReplenishmentProposalChangeType createReplenishmentProposalChangeType() {
        return new ReplenishmentProposalChangeType();
    }

    /**
     * Create an instance of {@link ShipmentStatusReasonCodeType }
     * 
     */
    public ShipmentStatusReasonCodeType createShipmentStatusReasonCodeType() {
        return new ShipmentStatusReasonCodeType();
    }

    /**
     * Create an instance of {@link TaxAmountType }
     * 
     */
    public TaxAmountType createTaxAmountType() {
        return new TaxAmountType();
    }

    /**
     * Create an instance of {@link PriceAndAvailabilityRequestPartnersType }
     * 
     */
    public PriceAndAvailabilityRequestPartnersType createPriceAndAvailabilityRequestPartnersType() {
        return new PriceAndAvailabilityRequestPartnersType();
    }

    /**
     * Create an instance of {@link ContractResponseProductLineItemType }
     * 
     */
    public ContractResponseProductLineItemType createContractResponseProductLineItemType() {
        return new ContractResponseProductLineItemType();
    }

    /**
     * Create an instance of {@link LoadBuildingMotorDetailsType }
     * 
     */
    public LoadBuildingMotorDetailsType createLoadBuildingMotorDetailsType() {
        return new LoadBuildingMotorDetailsType();
    }

    /**
     * Create an instance of {@link DemandPlanResponseDetailsType }
     * 
     */
    public DemandPlanResponseDetailsType createDemandPlanResponseDetailsType() {
        return new DemandPlanResponseDetailsType();
    }

    /**
     * Create an instance of {@link ApproximateWeightType }
     * 
     */
    public ApproximateWeightType createApproximateWeightType() {
        return new ApproximateWeightType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalRequestContentType }
     * 
     */
    public ReplenishmentProposalRequestContentType createReplenishmentProposalRequestContentType() {
        return new ReplenishmentProposalRequestContentType();
    }

    /**
     * Create an instance of {@link ReferenceTemperatureType }
     * 
     */
    public ReferenceTemperatureType createReferenceTemperatureType() {
        return new ReferenceTemperatureType();
    }

    /**
     * Create an instance of {@link CHRISCodeType }
     * 
     */
    public CHRISCodeType createCHRISCodeType() {
        return new CHRISCodeType();
    }

    /**
     * Create an instance of {@link ReferenceInformationType }
     * 
     */
    public ReferenceInformationType createReferenceInformationType() {
        return new ReferenceInformationType();
    }

    /**
     * Create an instance of {@link SupportedProductType }
     * 
     */
    public SupportedProductType createSupportedProductType() {
        return new SupportedProductType();
    }

    /**
     * Create an instance of {@link ForecastedProductMovementReportType }
     * 
     */
    public ForecastedProductMovementReportType createForecastedProductMovementReportType() {
        return new ForecastedProductMovementReportType();
    }

    /**
     * Create an instance of {@link AddressInformationType }
     * 
     */
    public AddressInformationType createAddressInformationType() {
        return new AddressInformationType();
    }

    /**
     * Create an instance of {@link SupplyPlanResponsePropertiesType }
     * 
     */
    public SupplyPlanResponsePropertiesType createSupplyPlanResponsePropertiesType() {
        return new SupplyPlanResponsePropertiesType();
    }

    /**
     * Create an instance of {@link PaymentDetailPropertiesType }
     * 
     */
    public PaymentDetailPropertiesType createPaymentDetailPropertiesType() {
        return new PaymentDetailPropertiesType();
    }

    /**
     * Create an instance of {@link PostingCancelResponseDetailsType }
     * 
     */
    public PostingCancelResponseDetailsType createPostingCancelResponseDetailsType() {
        return new PostingCancelResponseDetailsType();
    }

    /**
     * Create an instance of {@link AssociatedEquipmentType }
     * 
     */
    public AssociatedEquipmentType createAssociatedEquipmentType() {
        return new AssociatedEquipmentType();
    }

    /**
     * Create an instance of {@link PaymentDatesType }
     * 
     */
    public PaymentDatesType createPaymentDatesType() {
        return new PaymentDatesType();
    }

    /**
     * Create an instance of {@link InventoryOtherType }
     * 
     */
    public InventoryOtherType createInventoryOtherType() {
        return new InventoryOtherType();
    }

    /**
     * Create an instance of {@link InventoryInTransitType }
     * 
     */
    public InventoryInTransitType createInventoryInTransitType() {
        return new InventoryInTransitType();
    }

    /**
     * Create an instance of {@link ProductFeaturesType }
     * 
     */
    public ProductFeaturesType createProductFeaturesType() {
        return new ProductFeaturesType();
    }

    /**
     * Create an instance of {@link HazardousFormattedTextType }
     * 
     */
    public HazardousFormattedTextType createHazardousFormattedTextType() {
        return new HazardousFormattedTextType();
    }

    /**
     * Create an instance of {@link DeliveryConfirmationResponseDetailsType }
     * 
     */
    public DeliveryConfirmationResponseDetailsType createDeliveryConfirmationResponseDetailsType() {
        return new DeliveryConfirmationResponseDetailsType();
    }

    /**
     * Create an instance of {@link ProductMovementTransactionPartnersType }
     * 
     */
    public ProductMovementTransactionPartnersType createProductMovementTransactionPartnersType() {
        return new ProductMovementTransactionPartnersType();
    }

    /**
     * Create an instance of {@link QualificationRequestPropertiesType }
     * 
     */
    public QualificationRequestPropertiesType createQualificationRequestPropertiesType() {
        return new QualificationRequestPropertiesType();
    }

    /**
     * Create an instance of {@link RequestedQuoteResponseType }
     * 
     */
    public RequestedQuoteResponseType createRequestedQuoteResponseType() {
        return new RequestedQuoteResponseType();
    }

    /**
     * Create an instance of {@link MSDSType }
     * 
     */
    public MSDSType createMSDSType() {
        return new MSDSType();
    }

    /**
     * Create an instance of {@link PriceSheetInformationType }
     * 
     */
    public PriceSheetInformationType createPriceSheetInformationType() {
        return new PriceSheetInformationType();
    }

    /**
     * Create an instance of {@link PrimaryCurrencyType }
     * 
     */
    public PrimaryCurrencyType createPrimaryCurrencyType() {
        return new PrimaryCurrencyType();
    }

    /**
     * Create an instance of {@link QualificationRequestPartnersType }
     * 
     */
    public QualificationRequestPartnersType createQualificationRequestPartnersType() {
        return new QualificationRequestPartnersType();
    }

    /**
     * Create an instance of {@link DemandPlanType }
     * 
     */
    public DemandPlanType createDemandPlanType() {
        return new DemandPlanType();
    }

    /**
     * Create an instance of {@link PostingCreateDetailsType }
     * 
     */
    public PostingCreateDetailsType createPostingCreateDetailsType() {
        return new PostingCreateDetailsType();
    }

    /**
     * Create an instance of {@link ExcludeType }
     * 
     */
    public ExcludeType createExcludeType() {
        return new ExcludeType();
    }

    /**
     * Create an instance of {@link PaymentTermsGroupType }
     * 
     */
    public PaymentTermsGroupType createPaymentTermsGroupType() {
        return new PaymentTermsGroupType();
    }

    /**
     * Create an instance of {@link PriceSheetDetailsType }
     * 
     */
    public PriceSheetDetailsType createPriceSheetDetailsType() {
        return new PriceSheetDetailsType();
    }

    /**
     * Create an instance of {@link BorderCrossingPointType }
     * 
     */
    public BorderCrossingPointType createBorderCrossingPointType() {
        return new BorderCrossingPointType();
    }

    /**
     * Create an instance of {@link LoadTenderRailBodyType }
     * 
     */
    public LoadTenderRailBodyType createLoadTenderRailBodyType() {
        return new LoadTenderRailBodyType();
    }

    /**
     * Create an instance of {@link PackagingContainerInformationType }
     * 
     */
    public PackagingContainerInformationType createPackagingContainerInformationType() {
        return new PackagingContainerInformationType();
    }

    /**
     * Create an instance of {@link CarrierWeightsBodyType }
     * 
     */
    public CarrierWeightsBodyType createCarrierWeightsBodyType() {
        return new CarrierWeightsBodyType();
    }

    /**
     * Create an instance of {@link PaymentResponseType }
     * 
     */
    public PaymentResponseType createPaymentResponseType() {
        return new PaymentResponseType();
    }

    /**
     * Create an instance of {@link CostSupportRequestChangePartnersType }
     * 
     */
    public CostSupportRequestChangePartnersType createCostSupportRequestChangePartnersType() {
        return new CostSupportRequestChangePartnersType();
    }

    /**
     * Create an instance of {@link ProductOptionsType }
     * 
     */
    public ProductOptionsType createProductOptionsType() {
        return new ProductOptionsType();
    }

    /**
     * Create an instance of {@link InvoiceResponsePropertiesType }
     * 
     */
    public InvoiceResponsePropertiesType createInvoiceResponsePropertiesType() {
        return new InvoiceResponsePropertiesType();
    }

    /**
     * Create an instance of {@link LoadTenderNumberType }
     * 
     */
    public LoadTenderNumberType createLoadTenderNumberType() {
        return new LoadTenderNumberType();
    }

    /**
     * Create an instance of {@link ProductCatalogUpdateProductLineItemType }
     * 
     */
    public ProductCatalogUpdateProductLineItemType createProductCatalogUpdateProductLineItemType() {
        return new ProductCatalogUpdateProductLineItemType();
    }

    /**
     * Create an instance of {@link PriceAndAvailabilityResponsePropertiesType }
     * 
     */
    public PriceAndAvailabilityResponsePropertiesType createPriceAndAvailabilityResponsePropertiesType() {
        return new PriceAndAvailabilityResponsePropertiesType();
    }

    /**
     * Create an instance of {@link LoadTenderMotorDetailsType }
     * 
     */
    public LoadTenderMotorDetailsType createLoadTenderMotorDetailsType() {
        return new LoadTenderMotorDetailsType();
    }

    /**
     * Create an instance of {@link CountryOfOriginCodeType }
     * 
     */
    public CountryOfOriginCodeType createCountryOfOriginCodeType() {
        return new CountryOfOriginCodeType();
    }

    /**
     * Create an instance of {@link PackagingQuantityType }
     * 
     */
    public PackagingQuantityType createPackagingQuantityType() {
        return new PackagingQuantityType();
    }

    /**
     * Create an instance of {@link OrderStatusResponseType }
     * 
     */
    public OrderStatusResponseType createOrderStatusResponseType() {
        return new OrderStatusResponseType();
    }

    /**
     * Create an instance of {@link ShippingLabelInformationType }
     * 
     */
    public ShippingLabelInformationType createShippingLabelInformationType() {
        return new ShippingLabelInformationType();
    }

    /**
     * Create an instance of {@link HazardousClassSubsidiaryCodeType }
     * 
     */
    public HazardousClassSubsidiaryCodeType createHazardousClassSubsidiaryCodeType() {
        return new HazardousClassSubsidiaryCodeType();
    }

    /**
     * Create an instance of {@link InvoiceTotalType }
     * 
     */
    public InvoiceTotalType createInvoiceTotalType() {
        return new InvoiceTotalType();
    }

    /**
     * Create an instance of {@link LoadTenderMotorPartnersType }
     * 
     */
    public LoadTenderMotorPartnersType createLoadTenderMotorPartnersType() {
        return new LoadTenderMotorPartnersType();
    }

    /**
     * Create an instance of {@link UNPortableTankCodeType }
     * 
     */
    public UNPortableTankCodeType createUNPortableTankCodeType() {
        return new UNPortableTankCodeType();
    }

    /**
     * Create an instance of {@link ShipmentDateType }
     * 
     */
    public ShipmentDateType createShipmentDateType() {
        return new ShipmentDateType();
    }

    /**
     * Create an instance of {@link PaymentDetailPartnersType }
     * 
     */
    public PaymentDetailPartnersType createPaymentDetailPartnersType() {
        return new PaymentDetailPartnersType();
    }

    /**
     * Create an instance of {@link TestValueType }
     * 
     */
    public TestValueType createTestValueType() {
        return new TestValueType();
    }

    /**
     * Create an instance of {@link ScheduleDateTimeInformationType }
     * 
     */
    public ScheduleDateTimeInformationType createScheduleDateTimeInformationType() {
        return new ScheduleDateTimeInformationType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalCancelBodyType }
     * 
     */
    public ReplenishmentProposalCancelBodyType createReplenishmentProposalCancelBodyType() {
        return new ReplenishmentProposalCancelBodyType();
    }

    /**
     * Create an instance of {@link CostSupportRequestChangeType }
     * 
     */
    public CostSupportRequestChangeType createCostSupportRequestChangeType() {
        return new CostSupportRequestChangeType();
    }

    /**
     * Create an instance of {@link CostSupportRequestPropertiesType }
     * 
     */
    public CostSupportRequestPropertiesType createCostSupportRequestPropertiesType() {
        return new CostSupportRequestPropertiesType();
    }

    /**
     * Create an instance of {@link SupplierType }
     * 
     */
    public SupplierType createSupplierType() {
        return new SupplierType();
    }

    /**
     * Create an instance of {@link ContractResponseDetailsType }
     * 
     */
    public ContractResponseDetailsType createContractResponseDetailsType() {
        return new ContractResponseDetailsType();
    }

    /**
     * Create an instance of {@link LineItemTaxableTotalType }
     * 
     */
    public LineItemTaxableTotalType createLineItemTaxableTotalType() {
        return new LineItemTaxableTotalType();
    }

    /**
     * Create an instance of {@link ShipmentInstructionsSubLineItemType }
     * 
     */
    public ShipmentInstructionsSubLineItemType createShipmentInstructionsSubLineItemType() {
        return new ShipmentInstructionsSubLineItemType();
    }

    /**
     * Create an instance of {@link DeliveryReceiptIdentificationType }
     * 
     */
    public DeliveryReceiptIdentificationType createDeliveryReceiptIdentificationType() {
        return new DeliveryReceiptIdentificationType();
    }

    /**
     * Create an instance of {@link PaymentPartnersType }
     * 
     */
    public PaymentPartnersType createPaymentPartnersType() {
        return new PaymentPartnersType();
    }

    /**
     * Create an instance of {@link QualificationRequestBodyType }
     * 
     */
    public QualificationRequestBodyType createQualificationRequestBodyType() {
        return new QualificationRequestBodyType();
    }

    /**
     * Create an instance of {@link ProductMovementReportDetailsType }
     * 
     */
    public ProductMovementReportDetailsType createProductMovementReportDetailsType() {
        return new ProductMovementReportDetailsType();
    }

    /**
     * Create an instance of {@link OrderStatusListRequestType }
     * 
     */
    public OrderStatusListRequestType createOrderStatusListRequestType() {
        return new OrderStatusListRequestType();
    }

    /**
     * Create an instance of {@link ForecastHorizonType }
     * 
     */
    public ForecastHorizonType createForecastHorizonType() {
        return new ForecastHorizonType();
    }

    /**
     * Create an instance of {@link LoadTenderResponsePropertiesType }
     * 
     */
    public LoadTenderResponsePropertiesType createLoadTenderResponsePropertiesType() {
        return new LoadTenderResponsePropertiesType();
    }

    /**
     * Create an instance of {@link RateUnitPriceType }
     * 
     */
    public RateUnitPriceType createRateUnitPriceType() {
        return new RateUnitPriceType();
    }

    /**
     * Create an instance of {@link ProductCatalogPriceDataType }
     * 
     */
    public ProductCatalogPriceDataType createProductCatalogPriceDataType() {
        return new ProductCatalogPriceDataType();
    }

    /**
     * Create an instance of {@link VolumetricInformationType }
     * 
     */
    public VolumetricInformationType createVolumetricInformationType() {
        return new VolumetricInformationType();
    }

    /**
     * Create an instance of {@link OrderStatusResponseDetailsType }
     * 
     */
    public OrderStatusResponseDetailsType createOrderStatusResponseDetailsType() {
        return new OrderStatusResponseDetailsType();
    }

    /**
     * Create an instance of {@link PriceZoneGeographyListType }
     * 
     */
    public PriceZoneGeographyListType createPriceZoneGeographyListType() {
        return new PriceZoneGeographyListType();
    }

    /**
     * Create an instance of {@link LoadBuildingMotorBodyType }
     * 
     */
    public LoadBuildingMotorBodyType createLoadBuildingMotorBodyType() {
        return new LoadBuildingMotorBodyType();
    }

    /**
     * Create an instance of {@link TranshipmentInformationType }
     * 
     */
    public TranshipmentInformationType createTranshipmentInformationType() {
        return new TranshipmentInformationType();
    }

    /**
     * Create an instance of {@link DistributorType }
     * 
     */
    public DistributorType createDistributorType() {
        return new DistributorType();
    }

    /**
     * Create an instance of {@link PostingChangeBodyType }
     * 
     */
    public PostingChangeBodyType createPostingChangeBodyType() {
        return new PostingChangeBodyType();
    }

    /**
     * Create an instance of {@link ShipNoticeListRequestPartnersType }
     * 
     */
    public ShipNoticeListRequestPartnersType createShipNoticeListRequestPartnersType() {
        return new ShipNoticeListRequestPartnersType();
    }

    /**
     * Create an instance of {@link ShipmentInstructionsType }
     * 
     */
    public ShipmentInstructionsType createShipmentInstructionsType() {
        return new ShipmentInstructionsType();
    }

    /**
     * Create an instance of {@link PostingResponseBodyType }
     * 
     */
    public PostingResponseBodyType createPostingResponseBodyType() {
        return new PostingResponseBodyType();
    }

    /**
     * Create an instance of {@link LoadTenderResponseDetailsType }
     * 
     */
    public LoadTenderResponseDetailsType createLoadTenderResponseDetailsType() {
        return new LoadTenderResponseDetailsType();
    }

    /**
     * Create an instance of {@link BatchExpirationDateType }
     * 
     */
    public BatchExpirationDateType createBatchExpirationDateType() {
        return new BatchExpirationDateType();
    }

    /**
     * Create an instance of {@link PlanWindowType }
     * 
     */
    public PlanWindowType createPlanWindowType() {
        return new PlanWindowType();
    }

    /**
     * Create an instance of {@link RespondByDateTimeType }
     * 
     */
    public RespondByDateTimeType createRespondByDateTimeType() {
        return new RespondByDateTimeType();
    }

    /**
     * Create an instance of {@link HandlingEndDateTimeType }
     * 
     */
    public HandlingEndDateTimeType createHandlingEndDateTimeType() {
        return new HandlingEndDateTimeType();
    }

    /**
     * Create an instance of {@link FreightBillType }
     * 
     */
    public FreightBillType createFreightBillType() {
        return new FreightBillType();
    }

    /**
     * Create an instance of {@link InventoryOnSiteType }
     * 
     */
    public InventoryOnSiteType createInventoryOnSiteType() {
        return new InventoryOnSiteType();
    }

    /**
     * Create an instance of {@link InventoryActualUsageResponseType }
     * 
     */
    public InventoryActualUsageResponseType createInventoryActualUsageResponseType() {
        return new InventoryActualUsageResponseType();
    }

    /**
     * Create an instance of {@link CompatibilityGroupCodeType }
     * 
     */
    public CompatibilityGroupCodeType createCompatibilityGroupCodeType() {
        return new CompatibilityGroupCodeType();
    }

    /**
     * Create an instance of {@link ManufactureDateType }
     * 
     */
    public ManufactureDateType createManufactureDateType() {
        return new ManufactureDateType();
    }

    /**
     * Create an instance of {@link RequestForQuotePartnersType }
     * 
     */
    public RequestForQuotePartnersType createRequestForQuotePartnersType() {
        return new RequestForQuotePartnersType();
    }

    /**
     * Create an instance of {@link ShipmentMethodOfPaymentCodeType }
     * 
     */
    public ShipmentMethodOfPaymentCodeType createShipmentMethodOfPaymentCodeType() {
        return new ShipmentMethodOfPaymentCodeType();
    }

    /**
     * Create an instance of {@link DiscountsDueDateType }
     * 
     */
    public DiscountsDueDateType createDiscountsDueDateType() {
        return new DiscountsDueDateType();
    }

    /**
     * Create an instance of {@link SupplyPlanPropertiesType }
     * 
     */
    public SupplyPlanPropertiesType createSupplyPlanPropertiesType() {
        return new SupplyPlanPropertiesType();
    }

    /**
     * Create an instance of {@link CharacteristicCodeType }
     * 
     */
    public CharacteristicCodeType createCharacteristicCodeType() {
        return new CharacteristicCodeType();
    }

    /**
     * Create an instance of {@link PriceBasisType }
     * 
     */
    public PriceBasisType createPriceBasisType() {
        return new PriceBasisType();
    }

    /**
     * Create an instance of {@link QualityTestingReportDetailsType }
     * 
     */
    public QualityTestingReportDetailsType createQualityTestingReportDetailsType() {
        return new QualityTestingReportDetailsType();
    }

    /**
     * Create an instance of {@link NonExemptTotalsType }
     * 
     */
    public NonExemptTotalsType createNonExemptTotalsType() {
        return new NonExemptTotalsType();
    }

    /**
     * Create an instance of {@link PostingChangePropertiesType }
     * 
     */
    public PostingChangePropertiesType createPostingChangePropertiesType() {
        return new PostingChangePropertiesType();
    }

    /**
     * Create an instance of {@link ManufacturingIdentificationDetailsType }
     * 
     */
    public ManufacturingIdentificationDetailsType createManufacturingIdentificationDetailsType() {
        return new ManufacturingIdentificationDetailsType();
    }

    /**
     * Create an instance of {@link MarineTransportInformationType }
     * 
     */
    public MarineTransportInformationType createMarineTransportInformationType() {
        return new MarineTransportInformationType();
    }

    /**
     * Create an instance of {@link ExpectedReleaseQuantityType }
     * 
     */
    public ExpectedReleaseQuantityType createExpectedReleaseQuantityType() {
        return new ExpectedReleaseQuantityType();
    }

    /**
     * Create an instance of {@link InlandOriginPointCodeType }
     * 
     */
    public InlandOriginPointCodeType createInlandOriginPointCodeType() {
        return new InlandOriginPointCodeType();
    }

    /**
     * Create an instance of {@link LowerLimitType }
     * 
     */
    public LowerLimitType createLowerLimitType() {
        return new LowerLimitType();
    }

    /**
     * Create an instance of {@link BuyerReferenceType }
     * 
     */
    public BuyerReferenceType createBuyerReferenceType() {
        return new BuyerReferenceType();
    }

    /**
     * Create an instance of {@link StatusInformationType }
     * 
     */
    public StatusInformationType createStatusInformationType() {
        return new StatusInformationType();
    }

    /**
     * Create an instance of {@link OrderStatusListRequestDetailsType }
     * 
     */
    public OrderStatusListRequestDetailsType createOrderStatusListRequestDetailsType() {
        return new OrderStatusListRequestDetailsType();
    }

    /**
     * Create an instance of {@link RequestForQuotePropertiesType }
     * 
     */
    public RequestForQuotePropertiesType createRequestForQuotePropertiesType() {
        return new RequestForQuotePropertiesType();
    }

    /**
     * Create an instance of {@link PostingStatusResponseBodyType }
     * 
     */
    public PostingStatusResponseBodyType createPostingStatusResponseBodyType() {
        return new PostingStatusResponseBodyType();
    }

    /**
     * Create an instance of {@link InvoiceResponsePartnersType }
     * 
     */
    public InvoiceResponsePartnersType createInvoiceResponsePartnersType() {
        return new InvoiceResponsePartnersType();
    }

    /**
     * Create an instance of {@link ContractPropertiesType }
     * 
     */
    public ContractPropertiesType createContractPropertiesType() {
        return new ContractPropertiesType();
    }

    /**
     * Create an instance of {@link RequestedPickupDateTimeType }
     * 
     */
    public RequestedPickupDateTimeType createRequestedPickupDateTimeType() {
        return new RequestedPickupDateTimeType();
    }

    /**
     * Create an instance of {@link DemandForecastPropertiesType }
     * 
     */
    public DemandForecastPropertiesType createDemandForecastPropertiesType() {
        return new DemandForecastPropertiesType();
    }

    /**
     * Create an instance of {@link PostingStatusRequestType }
     * 
     */
    public PostingStatusRequestType createPostingStatusRequestType() {
        return new PostingStatusRequestType();
    }

    /**
     * Create an instance of {@link LoadTenderOceanPropertiesType }
     * 
     */
    public LoadTenderOceanPropertiesType createLoadTenderOceanPropertiesType() {
        return new LoadTenderOceanPropertiesType();
    }

    /**
     * Create an instance of {@link DemandPlanResponsePartnersType }
     * 
     */
    public DemandPlanResponsePartnersType createDemandPlanResponsePartnersType() {
        return new DemandPlanResponsePartnersType();
    }

    /**
     * Create an instance of {@link UnloadingPointType }
     * 
     */
    public UnloadingPointType createUnloadingPointType() {
        return new UnloadingPointType();
    }

    /**
     * Create an instance of {@link InlandDestinationPointCodeType }
     * 
     */
    public InlandDestinationPointCodeType createInlandDestinationPointCodeType() {
        return new InlandDestinationPointCodeType();
    }

    /**
     * Create an instance of {@link ShipmentPackagingType }
     * 
     */
    public ShipmentPackagingType createShipmentPackagingType() {
        return new ShipmentPackagingType();
    }

    /**
     * Create an instance of {@link CostSupportCreditResponsePropertiesType }
     * 
     */
    public CostSupportCreditResponsePropertiesType createCostSupportCreditResponsePropertiesType() {
        return new CostSupportCreditResponsePropertiesType();
    }

    /**
     * Create an instance of {@link TotalNumberOfHandlingUnitsType }
     * 
     */
    public TotalNumberOfHandlingUnitsType createTotalNumberOfHandlingUnitsType() {
        return new TotalNumberOfHandlingUnitsType();
    }

    /**
     * Create an instance of {@link FreightBillTotalType }
     * 
     */
    public FreightBillTotalType createFreightBillTotalType() {
        return new FreightBillTotalType();
    }

    /**
     * Create an instance of {@link CompetitiveInformationType }
     * 
     */
    public CompetitiveInformationType createCompetitiveInformationType() {
        return new CompetitiveInformationType();
    }

    /**
     * Create an instance of {@link DateTimeType }
     * 
     */
    public DateTimeType createDateTimeType() {
        return new DateTimeType();
    }

    /**
     * Create an instance of {@link ReceiptSummaryType }
     * 
     */
    public ReceiptSummaryType createReceiptSummaryType() {
        return new ReceiptSummaryType();
    }

    /**
     * Create an instance of {@link PostingCancelResponsePropertiesType }
     * 
     */
    public PostingCancelResponsePropertiesType createPostingCancelResponsePropertiesType() {
        return new PostingCancelResponsePropertiesType();
    }

    /**
     * Create an instance of {@link ProductCatalogUpdatePropertiesType }
     * 
     */
    public ProductCatalogUpdatePropertiesType createProductCatalogUpdatePropertiesType() {
        return new ProductCatalogUpdatePropertiesType();
    }

    /**
     * Create an instance of {@link QualificationRequestDetailsType }
     * 
     */
    public QualificationRequestDetailsType createQualificationRequestDetailsType() {
        return new QualificationRequestDetailsType();
    }

    /**
     * Create an instance of {@link ShipNoticeType }
     * 
     */
    public ShipNoticeType createShipNoticeType() {
        return new ShipNoticeType();
    }

    /**
     * Create an instance of {@link DeferredDueDateType }
     * 
     */
    public DeferredDueDateType createDeferredDueDateType() {
        return new DeferredDueDateType();
    }

    /**
     * Create an instance of {@link MaximumMeasurementType }
     * 
     */
    public MaximumMeasurementType createMaximumMeasurementType() {
        return new MaximumMeasurementType();
    }

    /**
     * Create an instance of {@link PackagingVolumeType }
     * 
     */
    public PackagingVolumeType createPackagingVolumeType() {
        return new PackagingVolumeType();
    }

    /**
     * Create an instance of {@link ContractResponseType }
     * 
     */
    public ContractResponseType createContractResponseType() {
        return new ContractResponseType();
    }

    /**
     * Create an instance of {@link OrderCreateDetailsType }
     * 
     */
    public OrderCreateDetailsType createOrderCreateDetailsType() {
        return new OrderCreateDetailsType();
    }

    /**
     * Create an instance of {@link CostSupportRequestNumberType }
     * 
     */
    public CostSupportRequestNumberType createCostSupportRequestNumberType() {
        return new CostSupportRequestNumberType();
    }

    /**
     * Create an instance of {@link ForecastedProductMovementTransactionType }
     * 
     */
    public ForecastedProductMovementTransactionType createForecastedProductMovementTransactionType() {
        return new ForecastedProductMovementTransactionType();
    }

    /**
     * Create an instance of {@link PriceInformationType }
     * 
     */
    public PriceInformationType createPriceInformationType() {
        return new PriceInformationType();
    }

    /**
     * Create an instance of {@link UnitOfMeasureCodeType }
     * 
     */
    public UnitOfMeasureCodeType createUnitOfMeasureCodeType() {
        return new UnitOfMeasureCodeType();
    }

    /**
     * Create an instance of {@link PackagingItemsType }
     * 
     */
    public PackagingItemsType createPackagingItemsType() {
        return new PackagingItemsType();
    }

    /**
     * Create an instance of {@link SourceContainerType }
     * 
     */
    public SourceContainerType createSourceContainerType() {
        return new SourceContainerType();
    }

    /**
     * Create an instance of {@link ShelfLifeType }
     * 
     */
    public ShelfLifeType createShelfLifeType() {
        return new ShelfLifeType();
    }

    /**
     * Create an instance of {@link BorderEntryType }
     * 
     */
    public BorderEntryType createBorderEntryType() {
        return new BorderEntryType();
    }

    /**
     * Create an instance of {@link BuyerContractInformationType }
     * 
     */
    public BuyerContractInformationType createBuyerContractInformationType() {
        return new BuyerContractInformationType();
    }

    /**
     * Create an instance of {@link FreightBillIssueDateType }
     * 
     */
    public FreightBillIssueDateType createFreightBillIssueDateType() {
        return new FreightBillIssueDateType();
    }

    /**
     * Create an instance of {@link RiskPhraseType }
     * 
     */
    public RiskPhraseType createRiskPhraseType() {
        return new RiskPhraseType();
    }

    /**
     * Create an instance of {@link ProductSubLineItemsType }
     * 
     */
    public ProductSubLineItemsType createProductSubLineItemsType() {
        return new ProductSubLineItemsType();
    }

    /**
     * Create an instance of {@link PlanQuantityType }
     * 
     */
    public PlanQuantityType createPlanQuantityType() {
        return new PlanQuantityType();
    }

    /**
     * Create an instance of {@link OrderStatusListResponseDetailsType }
     * 
     */
    public OrderStatusListResponseDetailsType createOrderStatusListResponseDetailsType() {
        return new OrderStatusListResponseDetailsType();
    }

    /**
     * Create an instance of {@link PaymentDateType }
     * 
     */
    public PaymentDateType createPaymentDateType() {
        return new PaymentDateType();
    }

    /**
     * Create an instance of {@link HazmatShippingNameType }
     * 
     */
    public HazmatShippingNameType createHazmatShippingNameType() {
        return new HazmatShippingNameType();
    }

    /**
     * Create an instance of {@link EquipmentDetailsType }
     * 
     */
    public EquipmentDetailsType createEquipmentDetailsType() {
        return new EquipmentDetailsType();
    }

    /**
     * Create an instance of {@link BuyerType }
     * 
     */
    public BuyerType createBuyerType() {
        return new BuyerType();
    }

    /**
     * Create an instance of {@link PostingCreateBodyType }
     * 
     */
    public PostingCreateBodyType createPostingCreateBodyType() {
        return new PostingCreateBodyType();
    }

    /**
     * Create an instance of {@link ContractResponseBodyType }
     * 
     */
    public ContractResponseBodyType createContractResponseBodyType() {
        return new ContractResponseBodyType();
    }

    /**
     * Create an instance of {@link EffectiveDatesType }
     * 
     */
    public EffectiveDatesType createEffectiveDatesType() {
        return new EffectiveDatesType();
    }

    /**
     * Create an instance of {@link SupplyPlanBodyType }
     * 
     */
    public SupplyPlanBodyType createSupplyPlanBodyType() {
        return new SupplyPlanBodyType();
    }

    /**
     * Create an instance of {@link ProductMovementReportBodyType }
     * 
     */
    public ProductMovementReportBodyType createProductMovementReportBodyType() {
        return new ProductMovementReportBodyType();
    }

    /**
     * Create an instance of {@link InventoryLocationType }
     * 
     */
    public InventoryLocationType createInventoryLocationType() {
        return new InventoryLocationType();
    }

    /**
     * Create an instance of {@link PriceZoneType }
     * 
     */
    public PriceZoneType createPriceZoneType() {
        return new PriceZoneType();
    }

    /**
     * Create an instance of {@link FreightChargeType }
     * 
     */
    public FreightChargeType createFreightChargeType() {
        return new FreightChargeType();
    }

    /**
     * Create an instance of {@link LoadTenderDateTimeType }
     * 
     */
    public LoadTenderDateTimeType createLoadTenderDateTimeType() {
        return new LoadTenderDateTimeType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalResponseBodyType }
     * 
     */
    public ReplenishmentProposalResponseBodyType createReplenishmentProposalResponseBodyType() {
        return new ReplenishmentProposalResponseBodyType();
    }

    /**
     * Create an instance of {@link ShipWithPurchaseOrderType }
     * 
     */
    public ShipWithPurchaseOrderType createShipWithPurchaseOrderType() {
        return new ShipWithPurchaseOrderType();
    }

    /**
     * Create an instance of {@link RateVolumeType }
     * 
     */
    public RateVolumeType createRateVolumeType() {
        return new RateVolumeType();
    }

    /**
     * Create an instance of {@link OrderStatusListResponseBodyType }
     * 
     */
    public OrderStatusListResponseBodyType createOrderStatusListResponseBodyType() {
        return new OrderStatusListResponseBodyType();
    }

    /**
     * Create an instance of {@link IngredientType }
     * 
     */
    public IngredientType createIngredientType() {
        return new IngredientType();
    }

    /**
     * Create an instance of {@link SpecifiedMeasurementType }
     * 
     */
    public SpecifiedMeasurementType createSpecifiedMeasurementType() {
        return new SpecifiedMeasurementType();
    }

    /**
     * Create an instance of {@link RequestIssuedDateType }
     * 
     */
    public RequestIssuedDateType createRequestIssuedDateType() {
        return new RequestIssuedDateType();
    }

    /**
     * Create an instance of {@link PostingCancelResponseType }
     * 
     */
    public PostingCancelResponseType createPostingCancelResponseType() {
        return new PostingCancelResponseType();
    }

    /**
     * Create an instance of {@link PostingInstructionsType }
     * 
     */
    public PostingInstructionsType createPostingInstructionsType() {
        return new PostingInstructionsType();
    }

    /**
     * Create an instance of {@link OrderCreateProductLineItemType }
     * 
     */
    public OrderCreateProductLineItemType createOrderCreateProductLineItemType() {
        return new OrderCreateProductLineItemType();
    }

    /**
     * Create an instance of {@link PayableQuantityType }
     * 
     */
    public PayableQuantityType createPayableQuantityType() {
        return new PayableQuantityType();
    }

    /**
     * Create an instance of {@link TaxTypeCodeType }
     * 
     */
    public TaxTypeCodeType createTaxTypeCodeType() {
        return new TaxTypeCodeType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalResponsePartnersType }
     * 
     */
    public ReplenishmentProposalResponsePartnersType createReplenishmentProposalResponsePartnersType() {
        return new ReplenishmentProposalResponsePartnersType();
    }

    /**
     * Create an instance of {@link RequestedDocumentType }
     * 
     */
    public RequestedDocumentType createRequestedDocumentType() {
        return new RequestedDocumentType();
    }

    /**
     * Create an instance of {@link PostingAcceptResponseBodyType }
     * 
     */
    public PostingAcceptResponseBodyType createPostingAcceptResponseBodyType() {
        return new PostingAcceptResponseBodyType();
    }

    /**
     * Create an instance of {@link ProductCatalogUpdateType }
     * 
     */
    public ProductCatalogUpdateType createProductCatalogUpdateType() {
        return new ProductCatalogUpdateType();
    }

    /**
     * Create an instance of {@link InvoiceTotalsType }
     * 
     */
    public InvoiceTotalsType createInvoiceTotalsType() {
        return new InvoiceTotalsType();
    }

    /**
     * Create an instance of {@link EventDateTimeType }
     * 
     */
    public EventDateTimeType createEventDateTimeType() {
        return new EventDateTimeType();
    }

    /**
     * Create an instance of {@link ProductMovementTransactionPropertiesType }
     * 
     */
    public ProductMovementTransactionPropertiesType createProductMovementTransactionPropertiesType() {
        return new ProductMovementTransactionPropertiesType();
    }

    /**
     * Create an instance of {@link MinimumSalesVolumeType }
     * 
     */
    public MinimumSalesVolumeType createMinimumSalesVolumeType() {
        return new MinimumSalesVolumeType();
    }

    /**
     * Create an instance of {@link PaymentResponsePartnersType }
     * 
     */
    public PaymentResponsePartnersType createPaymentResponsePartnersType() {
        return new PaymentResponsePartnersType();
    }

    /**
     * Create an instance of {@link ProductInformationType }
     * 
     */
    public ProductInformationType createProductInformationType() {
        return new ProductInformationType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalRequestBodyType }
     * 
     */
    public ReplenishmentProposalRequestBodyType createReplenishmentProposalRequestBodyType() {
        return new ReplenishmentProposalRequestBodyType();
    }

    /**
     * Create an instance of {@link PostingAcceptResponsePropertiesType }
     * 
     */
    public PostingAcceptResponsePropertiesType createPostingAcceptResponsePropertiesType() {
        return new PostingAcceptResponsePropertiesType();
    }

    /**
     * Create an instance of {@link LoadBuildingMotorProductLineItemType }
     * 
     */
    public LoadBuildingMotorProductLineItemType createLoadBuildingMotorProductLineItemType() {
        return new LoadBuildingMotorProductLineItemType();
    }

    /**
     * Create an instance of {@link FreightBillBodyType }
     * 
     */
    public FreightBillBodyType createFreightBillBodyType() {
        return new FreightBillBodyType();
    }

    /**
     * Create an instance of {@link SellerType }
     * 
     */
    public SellerType createSellerType() {
        return new SellerType();
    }

    /**
     * Create an instance of {@link ContractResponsePartnersType }
     * 
     */
    public ContractResponsePartnersType createContractResponsePartnersType() {
        return new ContractResponsePartnersType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalCancelPartnersType }
     * 
     */
    public ReplenishmentProposalCancelPartnersType createReplenishmentProposalCancelPartnersType() {
        return new ReplenishmentProposalCancelPartnersType();
    }

    /**
     * Create an instance of {@link PostingCreateLineItemType }
     * 
     */
    public PostingCreateLineItemType createPostingCreateLineItemType() {
        return new PostingCreateLineItemType();
    }

    /**
     * Create an instance of {@link PlanProductType }
     * 
     */
    public PlanProductType createPlanProductType() {
        return new PlanProductType();
    }

    /**
     * Create an instance of {@link UnitedNationsNorthAmericaCodeType }
     * 
     */
    public UnitedNationsNorthAmericaCodeType createUnitedNationsNorthAmericaCodeType() {
        return new UnitedNationsNorthAmericaCodeType();
    }

    /**
     * Create an instance of {@link CostSupportAgreementNumberType }
     * 
     */
    public CostSupportAgreementNumberType createCostSupportAgreementNumberType() {
        return new CostSupportAgreementNumberType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalRequestPropertiesType }
     * 
     */
    public ReplenishmentProposalRequestPropertiesType createReplenishmentProposalRequestPropertiesType() {
        return new ReplenishmentProposalRequestPropertiesType();
    }

    /**
     * Create an instance of {@link InventoryUsageType }
     * 
     */
    public InventoryUsageType createInventoryUsageType() {
        return new InventoryUsageType();
    }

    /**
     * Create an instance of {@link LoadTenderOceanDetailsType }
     * 
     */
    public LoadTenderOceanDetailsType createLoadTenderOceanDetailsType() {
        return new LoadTenderOceanDetailsType();
    }

    /**
     * Create an instance of {@link EmergencyScheduleCodeType }
     * 
     */
    public EmergencyScheduleCodeType createEmergencyScheduleCodeType() {
        return new EmergencyScheduleCodeType();
    }

    /**
     * Create an instance of {@link BorderExitType }
     * 
     */
    public BorderExitType createBorderExitType() {
        return new BorderExitType();
    }

    /**
     * Create an instance of {@link LineItemStatusInformationType }
     * 
     */
    public LineItemStatusInformationType createLineItemStatusInformationType() {
        return new LineItemStatusInformationType();
    }

    /**
     * Create an instance of {@link DemandForecastResponseType }
     * 
     */
    public DemandForecastResponseType createDemandForecastResponseType() {
        return new DemandForecastResponseType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalResponsePropertiesType }
     * 
     */
    public ReplenishmentProposalResponsePropertiesType createReplenishmentProposalResponsePropertiesType() {
        return new ReplenishmentProposalResponsePropertiesType();
    }

    /**
     * Create an instance of {@link InventoryUsageLocationType }
     * 
     */
    public InventoryUsageLocationType createInventoryUsageLocationType() {
        return new InventoryUsageLocationType();
    }

    /**
     * Create an instance of {@link DemandPlanDetailsType }
     * 
     */
    public DemandPlanDetailsType createDemandPlanDetailsType() {
        return new DemandPlanDetailsType();
    }

    /**
     * Create an instance of {@link PartnerReferenceType }
     * 
     */
    public PartnerReferenceType createPartnerReferenceType() {
        return new PartnerReferenceType();
    }

    /**
     * Create an instance of {@link DeliveryPerformanceIncidentType }
     * 
     */
    public DeliveryPerformanceIncidentType createDeliveryPerformanceIncidentType() {
        return new DeliveryPerformanceIncidentType();
    }

    /**
     * Create an instance of {@link RequestedPackagingType }
     * 
     */
    public RequestedPackagingType createRequestedPackagingType() {
        return new RequestedPackagingType();
    }

    /**
     * Create an instance of {@link ResponseIssuedDateType }
     * 
     */
    public ResponseIssuedDateType createResponseIssuedDateType() {
        return new ResponseIssuedDateType();
    }

    /**
     * Create an instance of {@link OrderStatusRequestBodyType }
     * 
     */
    public OrderStatusRequestBodyType createOrderStatusRequestBodyType() {
        return new OrderStatusRequestBodyType();
    }

    /**
     * Create an instance of {@link PrepaidContractInformationType }
     * 
     */
    public PrepaidContractInformationType createPrepaidContractInformationType() {
        return new PrepaidContractInformationType();
    }

    /**
     * Create an instance of {@link PriceSheetType }
     * 
     */
    public PriceSheetType createPriceSheetType() {
        return new PriceSheetType();
    }

    /**
     * Create an instance of {@link ShipFromType }
     * 
     */
    public ShipFromType createShipFromType() {
        return new ShipFromType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalCancelDetailsType }
     * 
     */
    public ReplenishmentProposalCancelDetailsType createReplenishmentProposalCancelDetailsType() {
        return new ReplenishmentProposalCancelDetailsType();
    }

    /**
     * Create an instance of {@link ProductIdentificationType }
     * 
     */
    public ProductIdentificationType createProductIdentificationType() {
        return new ProductIdentificationType();
    }

    /**
     * Create an instance of {@link ReplenishmentSummaryType }
     * 
     */
    public ReplenishmentSummaryType createReplenishmentSummaryType() {
        return new ReplenishmentSummaryType();
    }

    /**
     * Create an instance of {@link ShipNoticeListBodyType }
     * 
     */
    public ShipNoticeListBodyType createShipNoticeListBodyType() {
        return new ShipNoticeListBodyType();
    }

    /**
     * Create an instance of {@link LengthType }
     * 
     */
    public LengthType createLengthType() {
        return new LengthType();
    }

    /**
     * Create an instance of {@link ScaleDateType }
     * 
     */
    public ScaleDateType createScaleDateType() {
        return new ScaleDateType();
    }

    /**
     * Create an instance of {@link RateBasisTypeType }
     * 
     */
    public RateBasisTypeType createRateBasisTypeType() {
        return new RateBasisTypeType();
    }

    /**
     * Create an instance of {@link ShipNoticeListRequestDetailsType }
     * 
     */
    public ShipNoticeListRequestDetailsType createShipNoticeListRequestDetailsType() {
        return new ShipNoticeListRequestDetailsType();
    }

    /**
     * Create an instance of {@link MarketPlaceInformationType }
     * 
     */
    public MarketPlaceInformationType createMarketPlaceInformationType() {
        return new MarketPlaceInformationType();
    }

    /**
     * Create an instance of {@link CertificateOfAnalysisType }
     * 
     */
    public CertificateOfAnalysisType createCertificateOfAnalysisType() {
        return new CertificateOfAnalysisType();
    }

    /**
     * Create an instance of {@link PostingStatusResponsePropertiesType }
     * 
     */
    public PostingStatusResponsePropertiesType createPostingStatusResponsePropertiesType() {
        return new PostingStatusResponsePropertiesType();
    }

    /**
     * Create an instance of {@link DateTimeRangeType }
     * 
     */
    public DateTimeRangeType createDateTimeRangeType() {
        return new DateTimeRangeType();
    }

    /**
     * Create an instance of {@link InvoicePartnersType }
     * 
     */
    public InvoicePartnersType createInvoicePartnersType() {
        return new InvoicePartnersType();
    }

    /**
     * Create an instance of {@link FromType }
     * 
     */
    public FromType createFromType() {
        return new FromType();
    }

    /**
     * Create an instance of {@link CostSupportCreditRequestPartnersType }
     * 
     */
    public CostSupportCreditRequestPartnersType createCostSupportCreditRequestPartnersType() {
        return new CostSupportCreditRequestPartnersType();
    }

    /**
     * Create an instance of {@link FreightBillPropertiesType }
     * 
     */
    public FreightBillPropertiesType createFreightBillPropertiesType() {
        return new FreightBillPropertiesType();
    }

    /**
     * Create an instance of {@link DeferredType }
     * 
     */
    public DeferredType createDeferredType() {
        return new DeferredType();
    }

    /**
     * Create an instance of {@link SupplyPlanLineItemType }
     * 
     */
    public SupplyPlanLineItemType createSupplyPlanLineItemType() {
        return new SupplyPlanLineItemType();
    }

    /**
     * Create an instance of {@link CertificateOfAnalysisDetailsType }
     * 
     */
    public CertificateOfAnalysisDetailsType createCertificateOfAnalysisDetailsType() {
        return new CertificateOfAnalysisDetailsType();
    }

    /**
     * Create an instance of {@link SellingPriceType }
     * 
     */
    public SellingPriceType createSellingPriceType() {
        return new SellingPriceType();
    }

    /**
     * Create an instance of {@link SupplyPlanResponseDetailsType }
     * 
     */
    public SupplyPlanResponseDetailsType createSupplyPlanResponseDetailsType() {
        return new SupplyPlanResponseDetailsType();
    }

    /**
     * Create an instance of {@link SupplyPlanResponsePartnersType }
     * 
     */
    public SupplyPlanResponsePartnersType createSupplyPlanResponsePartnersType() {
        return new SupplyPlanResponsePartnersType();
    }

    /**
     * Create an instance of {@link CertificateOfAnalysisPropertiesType }
     * 
     */
    public CertificateOfAnalysisPropertiesType createCertificateOfAnalysisPropertiesType() {
        return new CertificateOfAnalysisPropertiesType();
    }

    /**
     * Create an instance of {@link ShippingTolerancesType }
     * 
     */
    public ShippingTolerancesType createShippingTolerancesType() {
        return new ShippingTolerancesType();
    }

    /**
     * Create an instance of {@link ContractDetailsType }
     * 
     */
    public ContractDetailsType createContractDetailsType() {
        return new ContractDetailsType();
    }

    /**
     * Create an instance of {@link SpecialHandlingInformationType }
     * 
     */
    public SpecialHandlingInformationType createSpecialHandlingInformationType() {
        return new SpecialHandlingInformationType();
    }

    /**
     * Create an instance of {@link RoadTransportInformationType }
     * 
     */
    public RoadTransportInformationType createRoadTransportInformationType() {
        return new RoadTransportInformationType();
    }

    /**
     * Create an instance of {@link RiskCodeType }
     * 
     */
    public RiskCodeType createRiskCodeType() {
        return new RiskCodeType();
    }

    /**
     * Create an instance of {@link PostingChangeLineItemType }
     * 
     */
    public PostingChangeLineItemType createPostingChangeLineItemType() {
        return new PostingChangeLineItemType();
    }

    /**
     * Create an instance of {@link PostingStatusResponseType }
     * 
     */
    public PostingStatusResponseType createPostingStatusResponseType() {
        return new PostingStatusResponseType();
    }

    /**
     * Create an instance of {@link PostingCreatePropertiesType }
     * 
     */
    public PostingCreatePropertiesType createPostingCreatePropertiesType() {
        return new PostingCreatePropertiesType();
    }

    /**
     * Create an instance of {@link EULabelingRegulationsType }
     * 
     */
    public EULabelingRegulationsType createEULabelingRegulationsType() {
        return new EULabelingRegulationsType();
    }

    /**
     * Create an instance of {@link OrderResponseProductLineItemType }
     * 
     */
    public OrderResponseProductLineItemType createOrderResponseProductLineItemType() {
        return new OrderResponseProductLineItemType();
    }

    /**
     * Create an instance of {@link OrderCreateBodyType }
     * 
     */
    public OrderCreateBodyType createOrderCreateBodyType() {
        return new OrderCreateBodyType();
    }

    /**
     * Create an instance of {@link PostingResponsePropertiesType }
     * 
     */
    public PostingResponsePropertiesType createPostingResponsePropertiesType() {
        return new PostingResponsePropertiesType();
    }

    /**
     * Create an instance of {@link ContractPartnersType }
     * 
     */
    public ContractPartnersType createContractPartnersType() {
        return new ContractPartnersType();
    }

    /**
     * Create an instance of {@link RequisitionTypeCodeType }
     * 
     */
    public RequisitionTypeCodeType createRequisitionTypeCodeType() {
        return new RequisitionTypeCodeType();
    }

    /**
     * Create an instance of {@link RequestedShipDateTimeType }
     * 
     */
    public RequestedShipDateTimeType createRequestedShipDateTimeType() {
        return new RequestedShipDateTimeType();
    }

    /**
     * Create an instance of {@link ThirdPartyLaboratoryType }
     * 
     */
    public ThirdPartyLaboratoryType createThirdPartyLaboratoryType() {
        return new ThirdPartyLaboratoryType();
    }

    /**
     * Create an instance of {@link ShipmentStatusRequestPartnersType }
     * 
     */
    public ShipmentStatusRequestPartnersType createShipmentStatusRequestPartnersType() {
        return new ShipmentStatusRequestPartnersType();
    }

    /**
     * Create an instance of {@link CarrierWeightsPropertiesType }
     * 
     */
    public CarrierWeightsPropertiesType createCarrierWeightsPropertiesType() {
        return new CarrierWeightsPropertiesType();
    }

    /**
     * Create an instance of {@link DeliveryTolerancesType }
     * 
     */
    public DeliveryTolerancesType createDeliveryTolerancesType() {
        return new DeliveryTolerancesType();
    }

    /**
     * Create an instance of {@link NumberOfUnitsType }
     * 
     */
    public NumberOfUnitsType createNumberOfUnitsType() {
        return new NumberOfUnitsType();
    }

    /**
     * Create an instance of {@link ContractPaymentTermsType }
     * 
     */
    public ContractPaymentTermsType createContractPaymentTermsType() {
        return new ContractPaymentTermsType();
    }

    /**
     * Create an instance of {@link PurchaseOrderTypeCodeType }
     * 
     */
    public PurchaseOrderTypeCodeType createPurchaseOrderTypeCodeType() {
        return new PurchaseOrderTypeCodeType();
    }

    /**
     * Create an instance of {@link CustomsInformationType }
     * 
     */
    public CustomsInformationType createCustomsInformationType() {
        return new CustomsInformationType();
    }

    /**
     * Create an instance of {@link ShipmentStatusDateTimeType }
     * 
     */
    public ShipmentStatusDateTimeType createShipmentStatusDateTimeType() {
        return new ShipmentStatusDateTimeType();
    }

    /**
     * Create an instance of {@link InvoiceNumberType }
     * 
     */
    public InvoiceNumberType createInvoiceNumberType() {
        return new InvoiceNumberType();
    }

    /**
     * Create an instance of {@link LoadTenderResponsePartnersType }
     * 
     */
    public LoadTenderResponsePartnersType createLoadTenderResponsePartnersType() {
        return new LoadTenderResponsePartnersType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalCancelType }
     * 
     */
    public ReplenishmentProposalCancelType createReplenishmentProposalCancelType() {
        return new ReplenishmentProposalCancelType();
    }

    /**
     * Create an instance of {@link CostSupportRequestChangeDetailsType }
     * 
     */
    public CostSupportRequestChangeDetailsType createCostSupportRequestChangeDetailsType() {
        return new CostSupportRequestChangeDetailsType();
    }

    /**
     * Create an instance of {@link ConsignmentType }
     * 
     */
    public ConsignmentType createConsignmentType() {
        return new ConsignmentType();
    }

    /**
     * Create an instance of {@link DateTestedType }
     * 
     */
    public DateTestedType createDateTestedType() {
        return new DateTestedType();
    }

    /**
     * Create an instance of {@link PostingCancelLineItemType }
     * 
     */
    public PostingCancelLineItemType createPostingCancelLineItemType() {
        return new PostingCancelLineItemType();
    }

    /**
     * Create an instance of {@link LoadTenderMotorPropertiesType }
     * 
     */
    public LoadTenderMotorPropertiesType createLoadTenderMotorPropertiesType() {
        return new LoadTenderMotorPropertiesType();
    }

    /**
     * Create an instance of {@link RequestForQuoteDetailsType }
     * 
     */
    public RequestForQuoteDetailsType createRequestForQuoteDetailsType() {
        return new RequestForQuoteDetailsType();
    }

    /**
     * Create an instance of {@link LoadTenderRailType }
     * 
     */
    public LoadTenderRailType createLoadTenderRailType() {
        return new LoadTenderRailType();
    }

    /**
     * Create an instance of {@link LoadBuildingResponseBodyType }
     * 
     */
    public LoadBuildingResponseBodyType createLoadBuildingResponseBodyType() {
        return new LoadBuildingResponseBodyType();
    }

    /**
     * Create an instance of {@link PaymentDetailDetailsType }
     * 
     */
    public PaymentDetailDetailsType createPaymentDetailDetailsType() {
        return new PaymentDetailDetailsType();
    }

    /**
     * Create an instance of {@link PostingCreatePartnersType }
     * 
     */
    public PostingCreatePartnersType createPostingCreatePartnersType() {
        return new PostingCreatePartnersType();
    }

    /**
     * Create an instance of {@link PostingStatusResponseLineItemType }
     * 
     */
    public PostingStatusResponseLineItemType createPostingStatusResponseLineItemType() {
        return new PostingStatusResponseLineItemType();
    }

    /**
     * Create an instance of {@link PricingPerUnitType }
     * 
     */
    public PricingPerUnitType createPricingPerUnitType() {
        return new PricingPerUnitType();
    }

    /**
     * Create an instance of {@link DemandForecastDetailsType }
     * 
     */
    public DemandForecastDetailsType createDemandForecastDetailsType() {
        return new DemandForecastDetailsType();
    }

    /**
     * Create an instance of {@link PostingAcceptResponseType }
     * 
     */
    public PostingAcceptResponseType createPostingAcceptResponseType() {
        return new PostingAcceptResponseType();
    }

    /**
     * Create an instance of {@link ShipNoticePartnersType }
     * 
     */
    public ShipNoticePartnersType createShipNoticePartnersType() {
        return new ShipNoticePartnersType();
    }

    /**
     * Create an instance of {@link RateWeightType }
     * 
     */
    public RateWeightType createRateWeightType() {
        return new RateWeightType();
    }

    /**
     * Create an instance of {@link RequestedDocumentTypeCodeType }
     * 
     */
    public RequestedDocumentTypeCodeType createRequestedDocumentTypeCodeType() {
        return new RequestedDocumentTypeCodeType();
    }

    /**
     * Create an instance of {@link LoadingPointType }
     * 
     */
    public LoadingPointType createLoadingPointType() {
        return new LoadingPointType();
    }

    /**
     * Create an instance of {@link FreightBillNumberType }
     * 
     */
    public FreightBillNumberType createFreightBillNumberType() {
        return new FreightBillNumberType();
    }

    /**
     * Create an instance of {@link CatalogEffectiveDatesType }
     * 
     */
    public CatalogEffectiveDatesType createCatalogEffectiveDatesType() {
        return new CatalogEffectiveDatesType();
    }

    /**
     * Create an instance of {@link RequestedPriceType }
     * 
     */
    public RequestedPriceType createRequestedPriceType() {
        return new RequestedPriceType();
    }

    /**
     * Create an instance of {@link PriceSheetPropertiesType }
     * 
     */
    public PriceSheetPropertiesType createPriceSheetPropertiesType() {
        return new PriceSheetPropertiesType();
    }

    /**
     * Create an instance of {@link HazardousGoodsDangerIndicationType }
     * 
     */
    public HazardousGoodsDangerIndicationType createHazardousGoodsDangerIndicationType() {
        return new HazardousGoodsDangerIndicationType();
    }

    /**
     * Create an instance of {@link AcceptanceNotificationPartnersType }
     * 
     */
    public AcceptanceNotificationPartnersType createAcceptanceNotificationPartnersType() {
        return new AcceptanceNotificationPartnersType();
    }

    /**
     * Create an instance of {@link TotalAmountPaidType }
     * 
     */
    public TotalAmountPaidType createTotalAmountPaidType() {
        return new TotalAmountPaidType();
    }

    /**
     * Create an instance of {@link CreditRequestApprovalNumberType }
     * 
     */
    public CreditRequestApprovalNumberType createCreditRequestApprovalNumberType() {
        return new CreditRequestApprovalNumberType();
    }

    /**
     * Create an instance of {@link PostingChangePartnersType }
     * 
     */
    public PostingChangePartnersType createPostingChangePartnersType() {
        return new PostingChangePartnersType();
    }

    /**
     * Create an instance of {@link CostSupportCreditRequestDetailsType }
     * 
     */
    public CostSupportCreditRequestDetailsType createCostSupportCreditRequestDetailsType() {
        return new CostSupportCreditRequestDetailsType();
    }

    /**
     * Create an instance of {@link SupplyPlanResponseType }
     * 
     */
    public SupplyPlanResponseType createSupplyPlanResponseType() {
        return new SupplyPlanResponseType();
    }

    /**
     * Create an instance of {@link InventoryActualUsageResponsePartnersType }
     * 
     */
    public InventoryActualUsageResponsePartnersType createInventoryActualUsageResponsePartnersType() {
        return new InventoryActualUsageResponsePartnersType();
    }

    /**
     * Create an instance of {@link ScheduleDateTimeInformationRangeType }
     * 
     */
    public ScheduleDateTimeInformationRangeType createScheduleDateTimeInformationRangeType() {
        return new ScheduleDateTimeInformationRangeType();
    }

    /**
     * Create an instance of {@link ShipmentStatusBodyType }
     * 
     */
    public ShipmentStatusBodyType createShipmentStatusBodyType() {
        return new ShipmentStatusBodyType();
    }

    /**
     * Create an instance of {@link PricingType }
     * 
     */
    public PricingType createPricingType() {
        return new PricingType();
    }

    /**
     * Create an instance of {@link OpenHoursType }
     * 
     */
    public OpenHoursType createOpenHoursType() {
        return new OpenHoursType();
    }

    /**
     * Create an instance of {@link PostingAcceptPropertiesType }
     * 
     */
    public PostingAcceptPropertiesType createPostingAcceptPropertiesType() {
        return new PostingAcceptPropertiesType();
    }

    /**
     * Create an instance of {@link ScheduledPackDateTimeType }
     * 
     */
    public ScheduledPackDateTimeType createScheduledPackDateTimeType() {
        return new ScheduledPackDateTimeType();
    }

    /**
     * Create an instance of {@link BidInformationType }
     * 
     */
    public BidInformationType createBidInformationType() {
        return new BidInformationType();
    }

    /**
     * Create an instance of {@link ProductCatalogUpdateDetailsType }
     * 
     */
    public ProductCatalogUpdateDetailsType createProductCatalogUpdateDetailsType() {
        return new ProductCatalogUpdateDetailsType();
    }

    /**
     * Create an instance of {@link ShipmentStatusRequestPropertiesType }
     * 
     */
    public ShipmentStatusRequestPropertiesType createShipmentStatusRequestPropertiesType() {
        return new ShipmentStatusRequestPropertiesType();
    }

    /**
     * Create an instance of {@link PriceAndAvailabilityRequestBodyType }
     * 
     */
    public PriceAndAvailabilityRequestBodyType createPriceAndAvailabilityRequestBodyType() {
        return new PriceAndAvailabilityRequestBodyType();
    }

    /**
     * Create an instance of {@link ScheduleLineDetailsType }
     * 
     */
    public ScheduleLineDetailsType createScheduleLineDetailsType() {
        return new ScheduleLineDetailsType();
    }

    /**
     * Create an instance of {@link OrderChangePartnersType }
     * 
     */
    public OrderChangePartnersType createOrderChangePartnersType() {
        return new OrderChangePartnersType();
    }

    /**
     * Create an instance of {@link PostingCancelPropertiesType }
     * 
     */
    public PostingCancelPropertiesType createPostingCancelPropertiesType() {
        return new PostingCancelPropertiesType();
    }

    /**
     * Create an instance of {@link PostingCancelBodyType }
     * 
     */
    public PostingCancelBodyType createPostingCancelBodyType() {
        return new PostingCancelBodyType();
    }

    /**
     * Create an instance of {@link PostingAcceptResponsePartnersType }
     * 
     */
    public PostingAcceptResponsePartnersType createPostingAcceptResponsePartnersType() {
        return new PostingAcceptResponsePartnersType();
    }

    /**
     * Create an instance of {@link ShipmentInstructionsPartnersType }
     * 
     */
    public ShipmentInstructionsPartnersType createShipmentInstructionsPartnersType() {
        return new ShipmentInstructionsPartnersType();
    }

    /**
     * Create an instance of {@link InventoryUsageLineItemType }
     * 
     */
    public InventoryUsageLineItemType createInventoryUsageLineItemType() {
        return new InventoryUsageLineItemType();
    }

    /**
     * Create an instance of {@link ShipmentIndicatorCodeType }
     * 
     */
    public ShipmentIndicatorCodeType createShipmentIndicatorCodeType() {
        return new ShipmentIndicatorCodeType();
    }

    /**
     * Create an instance of {@link TaxOrDutyType }
     * 
     */
    public TaxOrDutyType createTaxOrDutyType() {
        return new TaxOrDutyType();
    }

    /**
     * Create an instance of {@link ShipmentStatusRequestBodyType }
     * 
     */
    public ShipmentStatusRequestBodyType createShipmentStatusRequestBodyType() {
        return new ShipmentStatusRequestBodyType();
    }

    /**
     * Create an instance of {@link PaymentResponseBodyType }
     * 
     */
    public PaymentResponseBodyType createPaymentResponseBodyType() {
        return new PaymentResponseBodyType();
    }

    /**
     * Create an instance of {@link PriceAndAvailabilityResponsePartnersType }
     * 
     */
    public PriceAndAvailabilityResponsePartnersType createPriceAndAvailabilityResponsePartnersType() {
        return new PriceAndAvailabilityResponsePartnersType();
    }

    /**
     * Create an instance of {@link TransportInformationType }
     * 
     */
    public TransportInformationType createTransportInformationType() {
        return new TransportInformationType();
    }

    /**
     * Create an instance of {@link CreditResponseStatusInformationType }
     * 
     */
    public CreditResponseStatusInformationType createCreditResponseStatusInformationType() {
        return new CreditResponseStatusInformationType();
    }

    /**
     * Create an instance of {@link ShipmentDateReferenceType }
     * 
     */
    public ShipmentDateReferenceType createShipmentDateReferenceType() {
        return new ShipmentDateReferenceType();
    }

    /**
     * Create an instance of {@link PriceAndAvailabilityResponseProductLineItemType }
     * 
     */
    public PriceAndAvailabilityResponseProductLineItemType createPriceAndAvailabilityResponseProductLineItemType() {
        return new PriceAndAvailabilityResponseProductLineItemType();
    }

    /**
     * Create an instance of {@link OriginatorType }
     * 
     */
    public OriginatorType createOriginatorType() {
        return new OriginatorType();
    }

    /**
     * Create an instance of {@link ForecastedProductMovementTransactionPartnersType }
     * 
     */
    public ForecastedProductMovementTransactionPartnersType createForecastedProductMovementTransactionPartnersType() {
        return new ForecastedProductMovementTransactionPartnersType();
    }

    /**
     * Create an instance of {@link ShipNoticeDetailsType }
     * 
     */
    public ShipNoticeDetailsType createShipNoticeDetailsType() {
        return new ShipNoticeDetailsType();
    }

    /**
     * Create an instance of {@link ExpirationDateType }
     * 
     */
    public ExpirationDateType createExpirationDateType() {
        return new ExpirationDateType();
    }

    /**
     * Create an instance of {@link CustomerSpecificCatalogUpdateType }
     * 
     */
    public CustomerSpecificCatalogUpdateType createCustomerSpecificCatalogUpdateType() {
        return new CustomerSpecificCatalogUpdateType();
    }

    /**
     * Create an instance of {@link LoadTenderOceanProductSubLineItemType }
     * 
     */
    public LoadTenderOceanProductSubLineItemType createLoadTenderOceanProductSubLineItemType() {
        return new LoadTenderOceanProductSubLineItemType();
    }

    /**
     * Create an instance of {@link DeliveryConfirmationResponsePartnersType }
     * 
     */
    public DeliveryConfirmationResponsePartnersType createDeliveryConfirmationResponsePartnersType() {
        return new DeliveryConfirmationResponsePartnersType();
    }

    /**
     * Create an instance of {@link DemandPlanBodyType }
     * 
     */
    public DemandPlanBodyType createDemandPlanBodyType() {
        return new DemandPlanBodyType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalRequestPartnersType }
     * 
     */
    public ReplenishmentProposalRequestPartnersType createReplenishmentProposalRequestPartnersType() {
        return new ReplenishmentProposalRequestPartnersType();
    }

    /**
     * Create an instance of {@link DeliveryConfirmationPropertiesType }
     * 
     */
    public DeliveryConfirmationPropertiesType createDeliveryConfirmationPropertiesType() {
        return new DeliveryConfirmationPropertiesType();
    }

    /**
     * Create an instance of {@link CarrierEquipmentCodeType }
     * 
     */
    public CarrierEquipmentCodeType createCarrierEquipmentCodeType() {
        return new CarrierEquipmentCodeType();
    }

    /**
     * Create an instance of {@link GeographicLocationType }
     * 
     */
    public GeographicLocationType createGeographicLocationType() {
        return new GeographicLocationType();
    }

    /**
     * Create an instance of {@link PaymentResponsePropertiesType }
     * 
     */
    public PaymentResponsePropertiesType createPaymentResponsePropertiesType() {
        return new PaymentResponsePropertiesType();
    }

    /**
     * Create an instance of {@link ShipDateType }
     * 
     */
    public ShipDateType createShipDateType() {
        return new ShipDateType();
    }

    /**
     * Create an instance of {@link InventoryUsageActualType }
     * 
     */
    public InventoryUsageActualType createInventoryUsageActualType() {
        return new InventoryUsageActualType();
    }

    /**
     * Create an instance of {@link ProductMovementProductLineItemType }
     * 
     */
    public ProductMovementProductLineItemType createProductMovementProductLineItemType() {
        return new ProductMovementProductLineItemType();
    }

    /**
     * Create an instance of {@link QualityTestingReportType }
     * 
     */
    public QualityTestingReportType createQualityTestingReportType() {
        return new QualityTestingReportType();
    }

    /**
     * Create an instance of {@link LoadTenderRailPropertiesType }
     * 
     */
    public LoadTenderRailPropertiesType createLoadTenderRailPropertiesType() {
        return new LoadTenderRailPropertiesType();
    }

    /**
     * Create an instance of {@link RequestingDocumentIdentifierType }
     * 
     */
    public RequestingDocumentIdentifierType createRequestingDocumentIdentifierType() {
        return new RequestingDocumentIdentifierType();
    }

    /**
     * Create an instance of {@link SupplyPlanType }
     * 
     */
    public SupplyPlanType createSupplyPlanType() {
        return new SupplyPlanType();
    }

    /**
     * Create an instance of {@link ForecastedProductMovementReportDetailsType }
     * 
     */
    public ForecastedProductMovementReportDetailsType createForecastedProductMovementReportDetailsType() {
        return new ForecastedProductMovementReportDetailsType();
    }

    /**
     * Create an instance of {@link HazardousSubstanceNameType }
     * 
     */
    public HazardousSubstanceNameType createHazardousSubstanceNameType() {
        return new HazardousSubstanceNameType();
    }

    /**
     * Create an instance of {@link SupportedSalesType }
     * 
     */
    public SupportedSalesType createSupportedSalesType() {
        return new SupportedSalesType();
    }

    /**
     * Create an instance of {@link StandardOrderQuantityType }
     * 
     */
    public StandardOrderQuantityType createStandardOrderQuantityType() {
        return new StandardOrderQuantityType();
    }

    /**
     * Create an instance of {@link DemandForecastBodyType }
     * 
     */
    public DemandForecastBodyType createDemandForecastBodyType() {
        return new DemandForecastBodyType();
    }

    /**
     * Create an instance of {@link MinimumQuantityType }
     * 
     */
    public MinimumQuantityType createMinimumQuantityType() {
        return new MinimumQuantityType();
    }

    /**
     * Create an instance of {@link TestResultType }
     * 
     */
    public TestResultType createTestResultType() {
        return new TestResultType();
    }

    /**
     * Create an instance of {@link QuantitativeResultType }
     * 
     */
    public QuantitativeResultType createQuantitativeResultType() {
        return new QuantitativeResultType();
    }

    /**
     * Create an instance of {@link CostSupportCreditResponseType }
     * 
     */
    public CostSupportCreditResponseType createCostSupportCreditResponseType() {
        return new CostSupportCreditResponseType();
    }

    /**
     * Create an instance of {@link PostingStatusResponsePartnersType }
     * 
     */
    public PostingStatusResponsePartnersType createPostingStatusResponsePartnersType() {
        return new PostingStatusResponsePartnersType();
    }

    /**
     * Create an instance of {@link CustomerSpecificCatalogUpdatePartnersType }
     * 
     */
    public CustomerSpecificCatalogUpdatePartnersType createCustomerSpecificCatalogUpdatePartnersType() {
        return new CustomerSpecificCatalogUpdatePartnersType();
    }

    /**
     * Create an instance of {@link PostingStatusResponseDetailsType }
     * 
     */
    public PostingStatusResponseDetailsType createPostingStatusResponseDetailsType() {
        return new PostingStatusResponseDetailsType();
    }

    /**
     * Create an instance of {@link CurrencyRateType }
     * 
     */
    public CurrencyRateType createCurrencyRateType() {
        return new CurrencyRateType();
    }

    /**
     * Create an instance of {@link LoadTenderOceanPartnersType }
     * 
     */
    public LoadTenderOceanPartnersType createLoadTenderOceanPartnersType() {
        return new LoadTenderOceanPartnersType();
    }

    /**
     * Create an instance of {@link ReplenishmentProposalChangePropertiesType }
     * 
     */
    public ReplenishmentProposalChangePropertiesType createReplenishmentProposalChangePropertiesType() {
        return new ReplenishmentProposalChangePropertiesType();
    }

    /**
     * Create an instance of {@link DeliveryPointType }
     * 
     */
    public DeliveryPointType createDeliveryPointType() {
        return new DeliveryPointType();
    }

    /**
     * Create an instance of {@link ReceiptNoticeBodyType }
     * 
     */
    public ReceiptNoticeBodyType createReceiptNoticeBodyType() {
        return new ReceiptNoticeBodyType();
    }

    /**
     * Create an instance of {@link CustomerSpecificCatalogUpdatePropertiesType }
     * 
     */
    public CustomerSpecificCatalogUpdatePropertiesType createCustomerSpecificCatalogUpdatePropertiesType() {
        return new CustomerSpecificCatalogUpdatePropertiesType();
    }

    /**
     * Create an instance of {@link SalesOrderIdentifierType }
     * 
     */
    public SalesOrderIdentifierType createSalesOrderIdentifierType() {
        return new SalesOrderIdentifierType();
    }

    /**
     * Create an instance of {@link PercentageBasisType }
     * 
     */
    public PercentageBasisType createPercentageBasisType() {
        return new PercentageBasisType();
    }

    /**
     * Create an instance of {@link PaymentTermsListType }
     * 
     */
    public PaymentTermsListType createPaymentTermsListType() {
        return new PaymentTermsListType();
    }

    /**
     * Create an instance of {@link PostingCancelResponseBodyType }
     * 
     */
    public PostingCancelResponseBodyType createPostingCancelResponseBodyType() {
        return new PostingCancelResponseBodyType();
    }

    /**
     * Create an instance of {@link ProductMovementTransactionType }
     * 
     */
    public ProductMovementTransactionType createProductMovementTransactionType() {
        return new ProductMovementTransactionType();
    }

    /**
     * Create an instance of {@link ThisDocumentDateTimeType }
     * 
     */
    public ThisDocumentDateTimeType createThisDocumentDateTimeType() {
        return new ThisDocumentDateTimeType();
    }

    /**
     * Create an instance of {@link OrderStatusRequestPropertiesType }
     * 
     */
    public OrderStatusRequestPropertiesType createOrderStatusRequestPropertiesType() {
        return new OrderStatusRequestPropertiesType();
    }

    /**
     * Create an instance of {@link MarinePollutantCodeType }
     * 
     */
    public MarinePollutantCodeType createMarinePollutantCodeType() {
        return new MarinePollutantCodeType();
    }

    /**
     * Create an instance of {@link RequestForCreditReferenceNumberType }
     * 
     */
    public RequestForCreditReferenceNumberType createRequestForCreditReferenceNumberType() {
        return new RequestForCreditReferenceNumberType();
    }

    /**
     * Create an instance of {@link ShippingServiceLevelCodeType }
     * 
     */
    public ShippingServiceLevelCodeType createShippingServiceLevelCodeType() {
        return new ShippingServiceLevelCodeType();
    }

    /**
     * Create an instance of {@link OrderStatusRequestType }
     * 
     */
    public OrderStatusRequestType createOrderStatusRequestType() {
        return new OrderStatusRequestType();
    }

    /**
     * Create an instance of {@link ProductAttributeNameType }
     * 
     */
    public ProductAttributeNameType createProductAttributeNameType() {
        return new ProductAttributeNameType();
    }

    /**
     * Create an instance of {@link InvoiceLineItemType }
     * 
     */
    public InvoiceLineItemType createInvoiceLineItemType() {
        return new InvoiceLineItemType();
    }

    /**
     * Create an instance of {@link TemperatureType }
     * 
     */
    public TemperatureType createTemperatureType() {
        return new TemperatureType();
    }

    /**
     * Create an instance of {@link ForecastType }
     * 
     */
    public ForecastType createForecastType() {
        return new ForecastType();
    }

    /**
     * Create an instance of {@link TariffIdentificationType }
     * 
     */
    public TariffIdentificationType createTariffIdentificationType() {
        return new TariffIdentificationType();
    }

    /**
     * Create an instance of {@link ProductSpecificationType }
     * 
     */
    public ProductSpecificationType createProductSpecificationType() {
        return new ProductSpecificationType();
    }

    /**
     * Create an instance of {@link LoadTenderOceanType }
     * 
     */
    public LoadTenderOceanType createLoadTenderOceanType() {
        return new LoadTenderOceanType();
    }

    /**
     * Create an instance of {@link TotalPaymentAmountType }
     * 
     */
    public TotalPaymentAmountType createTotalPaymentAmountType() {
        return new TotalPaymentAmountType();
    }

    /**
     * Create an instance of {@link PaymentTermsBasisDateCodeType }
     * 
     */
    public PaymentTermsBasisDateCodeType createPaymentTermsBasisDateCodeType() {
        return new PaymentTermsBasisDateCodeType();
    }

    /**
     * Create an instance of {@link DeliveryContentType }
     * 
     */
    public DeliveryContentType createDeliveryContentType() {
        return new DeliveryContentType();
    }

    /**
     * Create an instance of {@link ContainerSerialNumberType }
     * 
     */
    public ContainerSerialNumberType createContainerSerialNumberType() {
        return new ContainerSerialNumberType();
    }

    /**
     * Create an instance of {@link DeliveryReceiptLineItemType }
     * 
     */
    public DeliveryReceiptLineItemType createDeliveryReceiptLineItemType() {
        return new DeliveryReceiptLineItemType();
    }

    /**
     * Create an instance of {@link RequestSentDateType }
     * 
     */
    public RequestSentDateType createRequestSentDateType() {
        return new RequestSentDateType();
    }

    /**
     * Create an instance of {@link RoutingInstructionsType }
     * 
     */
    public RoutingInstructionsType createRoutingInstructionsType() {
        return new RoutingInstructionsType();
    }

    /**
     * Create an instance of {@link LoadDockHoursType }
     * 
     */
    public LoadDockHoursType createLoadDockHoursType() {
        return new LoadDockHoursType();
    }

    /**
     * Create an instance of {@link InventoryActualUsagePropertiesType }
     * 
     */
    public InventoryActualUsagePropertiesType createInventoryActualUsagePropertiesType() {
        return new InventoryActualUsagePropertiesType();
    }

    /**
     * Create an instance of {@link ContractType }
     * 
     */
    public ContractType createContractType() {
        return new ContractType();
    }

    /**
     * Create an instance of {@link ExemptionType }
     * 
     */
    public ExemptionType createExemptionType() {
        return new ExemptionType();
    }

    /**
     * Create an instance of {@link QualificationResponseBodyType }
     * 
     */
    public QualificationResponseBodyType createQualificationResponseBodyType() {
        return new QualificationResponseBodyType();
    }

    /**
     * Create an instance of {@link PackagingDimensionsType }
     * 
     */
    public PackagingDimensionsType createPackagingDimensionsType() {
        return new PackagingDimensionsType();
    }

    /**
     * Create an instance of {@link DueDateType }
     * 
     */
    public DueDateType createDueDateType() {
        return new DueDateType();
    }

    /**
     * Create an instance of {@link QualificationResponsePropertiesType }
     * 
     */
    public QualificationResponsePropertiesType createQualificationResponsePropertiesType() {
        return new QualificationResponsePropertiesType();
    }

    /**
     * Create an instance of {@link TaxAmountTotalType }
     * 
     */
    public TaxAmountTotalType createTaxAmountTotalType() {
        return new TaxAmountTotalType();
    }

    /**
     * Create an instance of {@link ConsignmentPartnersType }
     * 
     */
    public ConsignmentPartnersType createConsignmentPartnersType() {
        return new ConsignmentPartnersType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentDetail")
    public JAXBElement<PaymentDetailType> createPaymentDetail(PaymentDetailType value) {
        return new JAXBElement<PaymentDetailType>(_PaymentDetail_QNAME, PaymentDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingChangePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingChangePartners")
    public JAXBElement<PostingChangePartnersType> createPostingChangePartners(PostingChangePartnersType value) {
        return new JAXBElement<PostingChangePartnersType>(_PostingChangePartners_QNAME, PostingChangePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PalletPackageCountQuantity")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPalletPackageCountQuantity(String value) {
        return new JAXBElement<String>(_PalletPackageCountQuantity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateBasisTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RateBasisType")
    public JAXBElement<RateBasisTypeType> createRateBasisType(RateBasisTypeType value) {
        return new JAXBElement<RateBasisTypeType>(_RateBasisType_QNAME, RateBasisTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentInstructionsPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentInstructionsPartners")
    public JAXBElement<ShipmentInstructionsPartnersType> createShipmentInstructionsPartners(ShipmentInstructionsPartnersType value) {
        return new JAXBElement<ShipmentInstructionsPartnersType>(_ShipmentInstructionsPartners_QNAME, ShipmentInstructionsPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistanceBasisType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DistanceBasis")
    public JAXBElement<DistanceBasisType> createDistanceBasis(DistanceBasisType value) {
        return new JAXBElement<DistanceBasisType>(_DistanceBasis_QNAME, DistanceBasisType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngredientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Ingredient")
    public JAXBElement<IngredientType> createIngredient(IngredientType value) {
        return new JAXBElement<IngredientType>(_Ingredient_QNAME, IngredientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightBillPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FreightBillProperties")
    public JAXBElement<FreightBillPropertiesType> createFreightBillProperties(FreightBillPropertiesType value) {
        return new JAXBElement<FreightBillPropertiesType>(_FreightBillProperties_QNAME, FreightBillPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduledShipDateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ScheduledShipDateTime")
    public JAXBElement<ScheduledShipDateTimeType> createScheduledShipDateTime(ScheduledShipDateTimeType value) {
        return new JAXBElement<ScheduledShipDateTimeType>(_ScheduledShipDateTime_QNAME, ScheduledShipDateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentReleaseDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentReleaseDate")
    public JAXBElement<ShipmentReleaseDateType> createShipmentReleaseDate(ShipmentReleaseDateType value) {
        return new JAXBElement<ShipmentReleaseDateType>(_ShipmentReleaseDate_QNAME, ShipmentReleaseDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptNoticeProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReceiptNoticeProductLineItem")
    public JAXBElement<ReceiptNoticeProductLineItemType> createReceiptNoticeProductLineItem(ReceiptNoticeProductLineItemType value) {
        return new JAXBElement<ReceiptNoticeProductLineItemType>(_ReceiptNoticeProductLineItem_QNAME, ReceiptNoticeProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadBuildingResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadBuildingResponseProperties")
    public JAXBElement<LoadBuildingResponsePropertiesType> createLoadBuildingResponseProperties(LoadBuildingResponsePropertiesType value) {
        return new JAXBElement<LoadBuildingResponsePropertiesType>(_LoadBuildingResponseProperties_QNAME, LoadBuildingResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowanceChargeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AllowanceCharge")
    public JAXBElement<AllowanceChargeType> createAllowanceCharge(AllowanceChargeType value) {
        return new JAXBElement<AllowanceChargeType>(_AllowanceCharge_QNAME, AllowanceChargeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentPackagingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentPackaging")
    public JAXBElement<ShipmentPackagingType> createShipmentPackaging(ShipmentPackagingType value) {
        return new JAXBElement<ShipmentPackagingType>(_ShipmentPackaging_QNAME, ShipmentPackagingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadBuildingMotorProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadBuildingMotorProductLineItem")
    public JAXBElement<LoadBuildingMotorProductLineItemType> createLoadBuildingMotorProductLineItem(LoadBuildingMotorProductLineItemType value) {
        return new JAXBElement<LoadBuildingMotorProductLineItemType>(_LoadBuildingMotorProductLineItem_QNAME, LoadBuildingMotorProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipNoticeProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipNoticeProductLineItem")
    public JAXBElement<ShipNoticeProductLineItemType> createShipNoticeProductLineItem(ShipNoticeProductLineItemType value) {
        return new JAXBElement<ShipNoticeProductLineItemType>(_ShipNoticeProductLineItem_QNAME, ShipNoticeProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BondedWarehouseStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBondedWarehouseStatus(String value) {
        return new JAXBElement<String>(_BondedWarehouseStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSpecificCatalogUpdatePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CustomerSpecificCatalogUpdateProperties")
    public JAXBElement<CustomerSpecificCatalogUpdatePropertiesType> createCustomerSpecificCatalogUpdateProperties(CustomerSpecificCatalogUpdatePropertiesType value) {
        return new JAXBElement<CustomerSpecificCatalogUpdatePropertiesType>(_CustomerSpecificCatalogUpdateProperties_QNAME, CustomerSpecificCatalogUpdatePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarrierWeightsDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CarrierWeightsDetails")
    public JAXBElement<CarrierWeightsDetailsType> createCarrierWeightsDetails(CarrierWeightsDetailsType value) {
        return new JAXBElement<CarrierWeightsDetailsType>(_CarrierWeightsDetails_QNAME, CarrierWeightsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TransportInBond")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTransportInBond(String value) {
        return new JAXBElement<String>(_TransportInBond_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DateTimeRange")
    public JAXBElement<DateTimeRangeType> createDateTimeRange(DateTimeRangeType value) {
        return new JAXBElement<DateTimeRangeType>(_DateTimeRange_QNAME, DateTimeRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellingPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SellingPrice")
    public JAXBElement<SellingPriceType> createSellingPrice(SellingPriceType value) {
        return new JAXBElement<SellingPriceType>(_SellingPrice_QNAME, SellingPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalContent")
    public JAXBElement<ReplenishmentProposalContentType> createReplenishmentProposalContent(ReplenishmentProposalContentType value) {
        return new JAXBElement<ReplenishmentProposalContentType>(_ReplenishmentProposalContent_QNAME, ReplenishmentProposalContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HazardousNotation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createHazardousNotation(String value) {
        return new JAXBElement<String>(_HazardousNotation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Keyword")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createKeyword(String value) {
        return new JAXBElement<String>(_Keyword_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentStatusRequestPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentStatusRequestProperties")
    public JAXBElement<ShipmentStatusRequestPropertiesType> createShipmentStatusRequestProperties(ShipmentStatusRequestPropertiesType value) {
        return new JAXBElement<ShipmentStatusRequestPropertiesType>(_ShipmentStatusRequestProperties_QNAME, ShipmentStatusRequestPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowancesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Allowances")
    public JAXBElement<AllowancesType> createAllowances(AllowancesType value) {
        return new JAXBElement<AllowancesType>(_Allowances_QNAME, AllowancesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusResponseBody")
    public JAXBElement<OrderStatusResponseBodyType> createOrderStatusResponseBody(OrderStatusResponseBodyType value) {
        return new JAXBElement<OrderStatusResponseBodyType>(_OrderStatusResponseBody_QNAME, OrderStatusResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForecastedProductMovementReportBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ForecastedProductMovementReportBody")
    public JAXBElement<ForecastedProductMovementReportBodyType> createForecastedProductMovementReportBody(ForecastedProductMovementReportBodyType value) {
        return new JAXBElement<ForecastedProductMovementReportBodyType>(_ForecastedProductMovementReportBody_QNAME, ForecastedProductMovementReportBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestedPrice")
    public JAXBElement<RequestedPriceType> createRequestedPrice(RequestedPriceType value) {
        return new JAXBElement<RequestedPriceType>(_RequestedPrice_QNAME, RequestedPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderCreateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderCreate")
    public JAXBElement<OrderCreateType> createOrderCreate(OrderCreateType value) {
        return new JAXBElement<OrderCreateType>(_OrderCreate_QNAME, OrderCreateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HazmatDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HazmatData")
    public JAXBElement<HazmatDataType> createHazmatData(HazmatDataType value) {
        return new JAXBElement<HazmatDataType>(_HazmatData_QNAME, HazmatDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TaxBasis")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTaxBasis(String value) {
        return new JAXBElement<String>(_TaxBasis_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductLineItemLineNumber")
    public JAXBElement<BigInteger> createProductLineItemLineNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_ProductLineItemLineNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentMaterialTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "EquipmentMaterialType")
    public JAXBElement<EquipmentMaterialTypeType> createEquipmentMaterialType(EquipmentMaterialTypeType value) {
        return new JAXBElement<EquipmentMaterialTypeType>(_EquipmentMaterialType_QNAME, EquipmentMaterialTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetVolumeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "NetVolume")
    public JAXBElement<NetVolumeType> createNetVolume(NetVolumeType value) {
        return new JAXBElement<NetVolumeType>(_NetVolume_QNAME, NetVolumeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LanguageCode")
    public JAXBElement<LanguageCodeType> createLanguageCode(LanguageCodeType value) {
        return new JAXBElement<LanguageCodeType>(_LanguageCode_QNAME, LanguageCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BalanceItemFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBalanceItemFlag(String value) {
        return new JAXBElement<String>(_BalanceItemFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingAcceptResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingAcceptResponse")
    public JAXBElement<PostingAcceptResponseType> createPostingAcceptResponse(PostingAcceptResponseType value) {
        return new JAXBElement<PostingAcceptResponseType>(_PostingAcceptResponse_QNAME, PostingAcceptResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductAttributeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductAttribute")
    public JAXBElement<ProductAttributeType> createProductAttribute(ProductAttributeType value) {
        return new JAXBElement<ProductAttributeType>(_ProductAttribute_QNAME, ProductAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryReceiptLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryReceiptLineItem")
    public JAXBElement<DeliveryReceiptLineItemType> createDeliveryReceiptLineItem(DeliveryReceiptLineItemType value) {
        return new JAXBElement<DeliveryReceiptLineItemType>(_DeliveryReceiptLineItem_QNAME, DeliveryReceiptLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterPollutionClassType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "WaterPollutionClass")
    public JAXBElement<WaterPollutionClassType> createWaterPollutionClass(WaterPollutionClassType value) {
        return new JAXBElement<WaterPollutionClassType>(_WaterPollutionClass_QNAME, WaterPollutionClassType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AccompanyingSampleIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAccompanyingSampleIndicator(String value) {
        return new JAXBElement<String>(_AccompanyingSampleIndicator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InvoiceLineItem")
    public JAXBElement<InvoiceLineItemType> createInvoiceLineItem(InvoiceLineItemType value) {
        return new JAXBElement<InvoiceLineItemType>(_InvoiceLineItem_QNAME, InvoiceLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderOceanPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderOceanProperties")
    public JAXBElement<LoadTenderOceanPropertiesType> createLoadTenderOceanProperties(LoadTenderOceanPropertiesType value) {
        return new JAXBElement<LoadTenderOceanPropertiesType>(_LoadTenderOceanProperties_QNAME, LoadTenderOceanPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialHandlingInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SpecialHandlingInformation")
    public JAXBElement<SpecialHandlingInformationType> createSpecialHandlingInformation(SpecialHandlingInformationType value) {
        return new JAXBElement<SpecialHandlingInformationType>(_SpecialHandlingInformation_QNAME, SpecialHandlingInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentStatusPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentStatusPartners")
    public JAXBElement<ShipmentStatusPartnersType> createShipmentStatusPartners(ShipmentStatusPartnersType value) {
        return new JAXBElement<ShipmentStatusPartnersType>(_ShipmentStatusPartners_QNAME, ShipmentStatusPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryTermsLocation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDeliveryTermsLocation(String value) {
        return new JAXBElement<String>(_DeliveryTermsLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductSpecificationMethod")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductSpecificationMethod(String value) {
        return new JAXBElement<String>(_ProductSpecificationMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RebateType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRebateType(String value) {
        return new JAXBElement<String>(_RebateType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BillingScheduleIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBillingScheduleIdentifier(String value) {
        return new JAXBElement<String>(_BillingScheduleIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CreditCardNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCreditCardNumber(String value) {
        return new JAXBElement<String>(_CreditCardNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AccountNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAccountNumber(String value) {
        return new JAXBElement<String>(_AccountNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CreditCardProvider")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCreditCardProvider(String value) {
        return new JAXBElement<String>(_CreditCardProvider_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TaxInformation")
    public JAXBElement<TaxInformationType> createTaxInformation(TaxInformationType value) {
        return new JAXBElement<TaxInformationType>(_TaxInformation_QNAME, TaxInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "States")
    public JAXBElement<StatesType> createStates(StatesType value) {
        return new JAXBElement<StatesType>(_States_QNAME, StatesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductMovementTransactionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductMovementTransaction")
    public JAXBElement<ProductMovementTransactionType> createProductMovementTransaction(ProductMovementTransactionType value) {
        return new JAXBElement<ProductMovementTransactionType>(_ProductMovementTransaction_QNAME, ProductMovementTransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponseProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderResponseProductLineItem")
    public JAXBElement<OrderResponseProductLineItemType> createOrderResponseProductLineItem(OrderResponseProductLineItemType value) {
        return new JAXBElement<OrderResponseProductLineItemType>(_OrderResponseProductLineItem_QNAME, OrderResponseProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HazardousPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HazardousProperties")
    public JAXBElement<HazardousPropertiesType> createHazardousProperties(HazardousPropertiesType value) {
        return new JAXBElement<HazardousPropertiesType>(_HazardousProperties_QNAME, HazardousPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThirdPartyLaboratoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ThirdPartyLaboratory")
    public JAXBElement<ThirdPartyLaboratoryType> createThirdPartyLaboratory(ThirdPartyLaboratoryType value) {
        return new JAXBElement<ThirdPartyLaboratoryType>(_ThirdPartyLaboratory_QNAME, ThirdPartyLaboratoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductGroupLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductGroupLineItem")
    public JAXBElement<ProductGroupLineItemType> createProductGroupLineItem(ProductGroupLineItemType value) {
        return new JAXBElement<ProductGroupLineItemType>(_ProductGroupLineItem_QNAME, ProductGroupLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportRequestChangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportRequestChange")
    public JAXBElement<CostSupportRequestChangeType> createCostSupportRequestChange(CostSupportRequestChangeType value) {
        return new JAXBElement<CostSupportRequestChangeType>(_CostSupportRequestChange_QNAME, CostSupportRequestChangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TremcardCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TremcardCode")
    public JAXBElement<TremcardCodeType> createTremcardCode(TremcardCodeType value) {
        return new JAXBElement<TremcardCodeType>(_TremcardCode_QNAME, TremcardCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusResponseProperties")
    public JAXBElement<OrderStatusResponsePropertiesType> createOrderStatusResponseProperties(OrderStatusResponsePropertiesType value) {
        return new JAXBElement<OrderStatusResponsePropertiesType>(_OrderStatusResponseProperties_QNAME, OrderStatusResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardOrderQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "StandardOrderQuantity")
    public JAXBElement<StandardOrderQuantityType> createStandardOrderQuantity(StandardOrderQuantityType value) {
        return new JAXBElement<StandardOrderQuantityType>(_StandardOrderQuantity_QNAME, StandardOrderQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingStatusResponse")
    public JAXBElement<PostingStatusResponseType> createPostingStatusResponse(PostingStatusResponseType value) {
        return new JAXBElement<PostingStatusResponseType>(_PostingStatusResponse_QNAME, PostingStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpirationDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ExpirationDate")
    public JAXBElement<ExpirationDateType> createExpirationDate(ExpirationDateType value) {
        return new JAXBElement<ExpirationDateType>(_ExpirationDate_QNAME, ExpirationDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestForQuoteProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestForQuoteProductLineItem")
    public JAXBElement<RequestForQuoteProductLineItemType> createRequestForQuoteProductLineItem(RequestForQuoteProductLineItemType value) {
        return new JAXBElement<RequestForQuoteProductLineItemType>(_RequestForQuoteProductLineItem_QNAME, RequestForQuoteProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryConfirmationBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryConfirmationBody")
    public JAXBElement<DeliveryConfirmationBodyType> createDeliveryConfirmationBody(DeliveryConfirmationBodyType value) {
        return new JAXBElement<DeliveryConfirmationBodyType>(_DeliveryConfirmationBody_QNAME, DeliveryConfirmationBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderChangePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderChangePartners")
    public JAXBElement<OrderChangePartnersType> createOrderChangePartners(OrderChangePartnersType value) {
        return new JAXBElement<OrderChangePartnersType>(_OrderChangePartners_QNAME, OrderChangePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleLineDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ScheduleLineDetails")
    public JAXBElement<ScheduleLineDetailsType> createScheduleLineDetails(ScheduleLineDetailsType value) {
        return new JAXBElement<ScheduleLineDetailsType>(_ScheduleLineDetails_QNAME, ScheduleLineDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipNoticeListBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipNoticeListBody")
    public JAXBElement<ShipNoticeListBodyType> createShipNoticeListBody(ShipNoticeListBodyType value) {
        return new JAXBElement<ShipNoticeListBodyType>(_ShipNoticeListBody_QNAME, ShipNoticeListBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptanceNotificationPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AcceptanceNotificationProperties")
    public JAXBElement<AcceptanceNotificationPropertiesType> createAcceptanceNotificationProperties(AcceptanceNotificationPropertiesType value) {
        return new JAXBElement<AcceptanceNotificationPropertiesType>(_AcceptanceNotificationProperties_QNAME, AcceptanceNotificationPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CumulativeTotalQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CumulativeTotalQuantity")
    public JAXBElement<CumulativeTotalQuantityType> createCumulativeTotalQuantity(CumulativeTotalQuantityType value) {
        return new JAXBElement<CumulativeTotalQuantityType>(_CumulativeTotalQuantity_QNAME, CumulativeTotalQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Payer")
    public JAXBElement<PayerType> createPayer(PayerType value) {
        return new JAXBElement<PayerType>(_Payer_QNAME, PayerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandForecastDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandForecastDetails")
    public JAXBElement<DemandForecastDetailsType> createDemandForecastDetails(DemandForecastDetailsType value) {
        return new JAXBElement<DemandForecastDetailsType>(_DemandForecastDetails_QNAME, DemandForecastDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceTotalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InvoiceTotal")
    public JAXBElement<InvoiceTotalType> createInvoiceTotal(InvoiceTotalType value) {
        return new JAXBElement<InvoiceTotalType>(_InvoiceTotal_QNAME, InvoiceTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportRequestBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportRequestBody")
    public JAXBElement<CostSupportRequestBodyType> createCostSupportRequestBody(CostSupportRequestBodyType value) {
        return new JAXBElement<CostSupportRequestBodyType>(_CostSupportRequestBody_QNAME, CostSupportRequestBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportDurationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportDuration")
    public JAXBElement<CostSupportDurationType> createCostSupportDuration(CostSupportDurationType value) {
        return new JAXBElement<CostSupportDurationType>(_CostSupportDuration_QNAME, CostSupportDurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetCurrencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TargetCurrency")
    public JAXBElement<TargetCurrencyType> createTargetCurrency(TargetCurrencyType value) {
        return new JAXBElement<TargetCurrencyType>(_TargetCurrency_QNAME, TargetCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightBillTotalsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FreightBillTotals")
    public JAXBElement<FreightBillTotalsType> createFreightBillTotals(FreightBillTotalsType value) {
        return new JAXBElement<FreightBillTotalsType>(_FreightBillTotals_QNAME, FreightBillTotalsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentResponseBody")
    public JAXBElement<PaymentResponseBodyType> createPaymentResponseBody(PaymentResponseBodyType value) {
        return new JAXBElement<PaymentResponseBodyType>(_PaymentResponseBody_QNAME, PaymentResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingAcceptBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingAcceptBody")
    public JAXBElement<PostingAcceptBodyType> createPostingAcceptBody(PostingAcceptBodyType value) {
        return new JAXBElement<PostingAcceptBodyType>(_PostingAcceptBody_QNAME, PostingAcceptBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusEffectiveDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "StatusEffectiveDate")
    public JAXBElement<StatusEffectiveDateType> createStatusEffectiveDate(StatusEffectiveDateType value) {
        return new JAXBElement<StatusEffectiveDateType>(_StatusEffectiveDate_QNAME, StatusEffectiveDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ErrorFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createErrorFlag(String value) {
        return new JAXBElement<String>(_ErrorFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SampleDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSampleDescription(String value) {
        return new JAXBElement<String>(_SampleDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceShippingTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceShippingTerms")
    public JAXBElement<PriceShippingTermsType> createPriceShippingTerms(PriceShippingTermsType value) {
        return new JAXBElement<PriceShippingTermsType>(_PriceShippingTerms_QNAME, PriceShippingTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InvoiceQuantity")
    public JAXBElement<InvoiceQuantityType> createInvoiceQuantity(InvoiceQuantityType value) {
        return new JAXBElement<InvoiceQuantityType>(_InvoiceQuantity_QNAME, InvoiceQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CidxListActionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ActionRequest")
    public JAXBElement<CidxListActionRequest> createActionRequest(CidxListActionRequest value) {
        return new JAXBElement<CidxListActionRequest>(_ActionRequest_QNAME, CidxListActionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderResponseProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderResponseProductLineItem")
    public JAXBElement<LoadTenderResponseProductLineItemType> createLoadTenderResponseProductLineItem(LoadTenderResponseProductLineItemType value) {
        return new JAXBElement<LoadTenderResponseProductLineItemType>(_LoadTenderResponseProductLineItem_QNAME, LoadTenderResponseProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonExemptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "NonExempt")
    public JAXBElement<NonExemptType> createNonExempt(NonExemptType value) {
        return new JAXBElement<NonExemptType>(_NonExempt_QNAME, NonExemptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderMotorPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderMotorProperties")
    public JAXBElement<LoadTenderMotorPropertiesType> createLoadTenderMotorProperties(LoadTenderMotorPropertiesType value) {
        return new JAXBElement<LoadTenderMotorPropertiesType>(_LoadTenderMotorProperties_QNAME, LoadTenderMotorPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanWindowType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PlanWindow")
    public JAXBElement<PlanWindowType> createPlanWindow(PlanWindowType value) {
        return new JAXBElement<PlanWindowType>(_PlanWindow_QNAME, PlanWindowType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandlingInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HandlingInformation")
    public JAXBElement<HandlingInformationType> createHandlingInformation(HandlingInformationType value) {
        return new JAXBElement<HandlingInformationType>(_HandlingInformation_QNAME, HandlingInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LocationSampleObtained")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLocationSampleObtained(String value) {
        return new JAXBElement<String>(_LocationSampleObtained_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusListRequestBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusListRequestBody")
    public JAXBElement<OrderStatusListRequestBodyType> createOrderStatusListRequestBody(OrderStatusListRequestBodyType value) {
        return new JAXBElement<OrderStatusListRequestBodyType>(_OrderStatusListRequestBody_QNAME, OrderStatusListRequestBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightChargeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FreightCharge")
    public JAXBElement<FreightChargeType> createFreightCharge(FreightChargeType value) {
        return new JAXBElement<FreightChargeType>(_FreightCharge_QNAME, FreightChargeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingLabelInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShippingLabelInformation")
    public JAXBElement<ShippingLabelInformationType> createShippingLabelInformation(ShippingLabelInformationType value) {
        return new JAXBElement<ShippingLabelInformationType>(_ShippingLabelInformation_QNAME, ShippingLabelInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HandlingException")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createHandlingException(String value) {
        return new JAXBElement<String>(_HandlingException_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentInstructionsLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentInstructionsLineItem")
    public JAXBElement<ShipmentInstructionsLineItemType> createShipmentInstructionsLineItem(ShipmentInstructionsLineItemType value) {
        return new JAXBElement<ShipmentInstructionsLineItemType>(_ShipmentInstructionsLineItem_QNAME, ShipmentInstructionsLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaximumFillingDegreeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MaximumFillingDegree")
    public JAXBElement<MaximumFillingDegreeType> createMaximumFillingDegree(MaximumFillingDegreeType value) {
        return new JAXBElement<MaximumFillingDegreeType>(_MaximumFillingDegree_QNAME, MaximumFillingDegreeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CidxListDutyDrawBack }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DutyDrawback")
    public JAXBElement<CidxListDutyDrawBack> createDutyDrawback(CidxListDutyDrawBack value) {
        return new JAXBElement<CidxListDutyDrawBack>(_DutyDrawback_QNAME, CidxListDutyDrawBack.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalNumberOfHandlingUnitsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TotalNumberOfHandlingUnits")
    public JAXBElement<TotalNumberOfHandlingUnitsType> createTotalNumberOfHandlingUnits(TotalNumberOfHandlingUnitsType value) {
        return new JAXBElement<TotalNumberOfHandlingUnitsType>(_TotalNumberOfHandlingUnits_QNAME, TotalNumberOfHandlingUnitsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TankTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TankType")
    public JAXBElement<TankTypeType> createTankType(TankTypeType value) {
        return new JAXBElement<TankTypeType>(_TankType_QNAME, TankTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportTemperatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TransportTemperature")
    public JAXBElement<TransportTemperatureType> createTransportTemperature(TransportTemperatureType value) {
        return new JAXBElement<TransportTemperatureType>(_TransportTemperature_QNAME, TransportTemperatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EUSubstanceNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "EUSubstanceNumber")
    public JAXBElement<EUSubstanceNumberType> createEUSubstanceNumber(EUSubstanceNumberType value) {
        return new JAXBElement<EUSubstanceNumberType>(_EUSubstanceNumber_QNAME, EUSubstanceNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingAcceptDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingAcceptDetails")
    public JAXBElement<PostingAcceptDetailsType> createPostingAcceptDetails(PostingAcceptDetailsType value) {
        return new JAXBElement<PostingAcceptDetailsType>(_PostingAcceptDetails_QNAME, PostingAcceptDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Header")
    public JAXBElement<HeaderType> createHeader(HeaderType value) {
        return new JAXBElement<HeaderType>(_Header_QNAME, HeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductOptionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductOptions")
    public JAXBElement<ProductOptionsType> createProductOptions(ProductOptionsType value) {
        return new JAXBElement<ProductOptionsType>(_ProductOptions_QNAME, ProductOptionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalRequestLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalRequestLineItem")
    public JAXBElement<ReplenishmentProposalRequestLineItemType> createReplenishmentProposalRequestLineItem(ReplenishmentProposalRequestLineItemType value) {
        return new JAXBElement<ReplenishmentProposalRequestLineItemType>(_ReplenishmentProposalRequestLineItem_QNAME, ReplenishmentProposalRequestLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSpecificCatalogPriceDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CustomerSpecificCatalogPriceData")
    public JAXBElement<CustomerSpecificCatalogPriceDataType> createCustomerSpecificCatalogPriceData(CustomerSpecificCatalogPriceDataType value) {
        return new JAXBElement<CustomerSpecificCatalogPriceDataType>(_CustomerSpecificCatalogPriceData_QNAME, CustomerSpecificCatalogPriceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryReceiptIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryReceiptIdentification")
    public JAXBElement<DeliveryReceiptIdentificationType> createDeliveryReceiptIdentification(DeliveryReceiptIdentificationType value) {
        return new JAXBElement<DeliveryReceiptIdentificationType>(_DeliveryReceiptIdentification_QNAME, DeliveryReceiptIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptNoticeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReceiptNotice")
    public JAXBElement<ReceiptNoticeType> createReceiptNotice(ReceiptNoticeType value) {
        return new JAXBElement<ReceiptNoticeType>(_ReceiptNotice_QNAME, ReceiptNoticeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderCreateProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderCreateProductLineItem")
    public JAXBElement<OrderCreateProductLineItemType> createOrderCreateProductLineItem(OrderCreateProductLineItemType value) {
        return new JAXBElement<OrderCreateProductLineItemType>(_OrderCreateProductLineItem_QNAME, OrderCreateProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FinancialInstitutionDFINumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFinancialInstitutionDFINumber(String value) {
        return new JAXBElement<String>(_FinancialInstitutionDFINumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Content")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createContent(String value) {
        return new JAXBElement<String>(_Content_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedCostSupportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestedCostSupport")
    public JAXBElement<RequestedCostSupportType> createRequestedCostSupport(RequestedCostSupportType value) {
        return new JAXBElement<RequestedCostSupportType>(_RequestedCostSupport_QNAME, RequestedCostSupportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DocumentDeliveryMethod")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocumentDeliveryMethod(String value) {
        return new JAXBElement<String>(_DocumentDeliveryMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ConversionFactor")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createConversionFactor(String value) {
        return new JAXBElement<String>(_ConversionFactor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportingEntityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReportingEntity")
    public JAXBElement<ReportingEntityType> createReportingEntity(ReportingEntityType value) {
        return new JAXBElement<ReportingEntityType>(_ReportingEntity_QNAME, ReportingEntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MarketPlaceIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMarketPlaceIdentifier(String value) {
        return new JAXBElement<String>(_MarketPlaceIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentRecipientInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DocumentRecipientInformation")
    public JAXBElement<DocumentRecipientInformationType> createDocumentRecipientInformation(DocumentRecipientInformationType value) {
        return new JAXBElement<DocumentRecipientInformationType>(_DocumentRecipientInformation_QNAME, DocumentRecipientInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryActualUsagePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryActualUsageProperties")
    public JAXBElement<InventoryActualUsagePropertiesType> createInventoryActualUsageProperties(InventoryActualUsagePropertiesType value) {
        return new JAXBElement<InventoryActualUsagePropertiesType>(_InventoryActualUsageProperties_QNAME, InventoryActualUsagePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermsOfSaleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TermsOfSale")
    public JAXBElement<TermsOfSaleType> createTermsOfSale(TermsOfSaleType value) {
        return new JAXBElement<TermsOfSaleType>(_TermsOfSale_QNAME, TermsOfSaleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalRequestLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalRequestLocation")
    public JAXBElement<ReplenishmentProposalRequestLocationType> createReplenishmentProposalRequestLocation(ReplenishmentProposalRequestLocationType value) {
        return new JAXBElement<ReplenishmentProposalRequestLocationType>(_ReplenishmentProposalRequestLocation_QNAME, ReplenishmentProposalRequestLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogEffectiveDatesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CatalogEffectiveDates")
    public JAXBElement<CatalogEffectiveDatesType> createCatalogEffectiveDates(CatalogEffectiveDatesType value) {
        return new JAXBElement<CatalogEffectiveDatesType>(_CatalogEffectiveDates_QNAME, CatalogEffectiveDatesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SecondWeightFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSecondWeightFlag(String value) {
        return new JAXBElement<String>(_SecondWeightFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DaysDue")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDaysDue(String value) {
        return new JAXBElement<String>(_DaysDue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceZoneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceZone")
    public JAXBElement<PriceZoneType> createPriceZone(PriceZoneType value) {
        return new JAXBElement<PriceZoneType>(_PriceZone_QNAME, PriceZoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ConsignmentNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createConsignmentNumber(String value) {
        return new JAXBElement<String>(_ConsignmentNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventDateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "EventDateTime")
    public JAXBElement<EventDateTimeType> createEventDateTime(EventDateTimeType value) {
        return new JAXBElement<EventDateTimeType>(_EventDateTime_QNAME, EventDateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentDatesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentDates")
    public JAXBElement<PaymentDatesType> createPaymentDates(PaymentDatesType value) {
        return new JAXBElement<PaymentDatesType>(_PaymentDates_QNAME, PaymentDatesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpectedReleaseQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ExpectedReleaseQuantity")
    public JAXBElement<ExpectedReleaseQuantityType> createExpectedReleaseQuantity(ExpectedReleaseQuantityType value) {
        return new JAXBElement<ExpectedReleaseQuantityType>(_ExpectedReleaseQuantity_QNAME, ExpectedReleaseQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptNoticeDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReceiptNoticeDetails")
    public JAXBElement<ReceiptNoticeDetailsType> createReceiptNoticeDetails(ReceiptNoticeDetailsType value) {
        return new JAXBElement<ReceiptNoticeDetailsType>(_ReceiptNoticeDetails_QNAME, ReceiptNoticeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceSheetIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPriceSheetIdentifier(String value) {
        return new JAXBElement<String>(_PriceSheetIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalRequestPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalRequestPartners")
    public JAXBElement<ReplenishmentProposalRequestPartnersType> createReplenishmentProposalRequestPartners(ReplenishmentProposalRequestPartnersType value) {
        return new JAXBElement<ReplenishmentProposalRequestPartnersType>(_ReplenishmentProposalRequestPartners_QNAME, ReplenishmentProposalRequestPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestSentDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestSentDate")
    public JAXBElement<RequestSentDateType> createRequestSentDate(RequestSentDateType value) {
        return new JAXBElement<RequestSentDateType>(_RequestSentDate_QNAME, RequestSentDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductMovementTransactionDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductMovementTransactionDetails")
    public JAXBElement<ProductMovementTransactionDetailsType> createProductMovementTransactionDetails(ProductMovementTransactionDetailsType value) {
        return new JAXBElement<ProductMovementTransactionDetailsType>(_ProductMovementTransactionDetails_QNAME, ProductMovementTransactionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcludeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Exclude")
    public JAXBElement<ExcludeType> createExclude(ExcludeType value) {
        return new JAXBElement<ExcludeType>(_Exclude_QNAME, ExcludeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalRequestDetails")
    public JAXBElement<ReplenishmentProposalRequestDetailsType> createReplenishmentProposalRequestDetails(ReplenishmentProposalRequestDetailsType value) {
        return new JAXBElement<ReplenishmentProposalRequestDetailsType>(_ReplenishmentProposalRequestDetails_QNAME, ReplenishmentProposalRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlternativeCommunicationMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AlternativeCommunicationMethod")
    public JAXBElement<AlternativeCommunicationMethodType> createAlternativeCommunicationMethod(AlternativeCommunicationMethodType value) {
        return new JAXBElement<AlternativeCommunicationMethodType>(_AlternativeCommunicationMethod_QNAME, AlternativeCommunicationMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceInformation")
    public JAXBElement<PriceInformationType> createPriceInformation(PriceInformationType value) {
        return new JAXBElement<PriceInformationType>(_PriceInformation_QNAME, PriceInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductMovementReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductMovementReport")
    public JAXBElement<ProductMovementReportType> createProductMovementReport(ProductMovementReportType value) {
        return new JAXBElement<ProductMovementReportType>(_ProductMovementReport_QNAME, ProductMovementReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "StorageTankIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStorageTankIdentifier(String value) {
        return new JAXBElement<String>(_StorageTankIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToUnitOfMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ToUnitOfMeasure")
    public JAXBElement<ToUnitOfMeasureType> createToUnitOfMeasure(ToUnitOfMeasureType value) {
        return new JAXBElement<ToUnitOfMeasureType>(_ToUnitOfMeasure_QNAME, ToUnitOfMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualificationResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QualificationResponseDetails")
    public JAXBElement<QualificationResponseDetailsType> createQualificationResponseDetails(QualificationResponseDetailsType value) {
        return new JAXBElement<QualificationResponseDetailsType>(_QualificationResponseDetails_QNAME, QualificationResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingCreateDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingCreateDetails")
    public JAXBElement<PostingCreateDetailsType> createPostingCreateDetails(PostingCreateDetailsType value) {
        return new JAXBElement<PostingCreateDetailsType>(_PostingCreateDetails_QNAME, PostingCreateDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryActualUsagePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryActualUsagePartners")
    public JAXBElement<InventoryActualUsagePartnersType> createInventoryActualUsagePartners(InventoryActualUsagePartnersType value) {
        return new JAXBElement<InventoryActualUsagePartnersType>(_InventoryActualUsagePartners_QNAME, InventoryActualUsagePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractResponseDetails")
    public JAXBElement<ContractResponseDetailsType> createContractResponseDetails(ContractResponseDetailsType value) {
        return new JAXBElement<ContractResponseDetailsType>(_ContractResponseDetails_QNAME, ContractResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TestIdentification")
    public JAXBElement<TestIdentificationType> createTestIdentification(TestIdentificationType value) {
        return new JAXBElement<TestIdentificationType>(_TestIdentification_QNAME, TestIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTermsListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentTermsList")
    public JAXBElement<PaymentTermsListType> createPaymentTermsList(PaymentTermsListType value) {
        return new JAXBElement<PaymentTermsListType>(_PaymentTermsList_QNAME, PaymentTermsListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualificationResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QualificationResponseProperties")
    public JAXBElement<QualificationResponsePropertiesType> createQualificationResponseProperties(QualificationResponsePropertiesType value) {
        return new JAXBElement<QualificationResponsePropertiesType>(_QualificationResponseProperties_QNAME, QualificationResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialFulfillmentRequestCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SpecialFulfillmentRequestCode")
    public JAXBElement<SpecialFulfillmentRequestCodeType> createSpecialFulfillmentRequestCode(SpecialFulfillmentRequestCodeType value) {
        return new JAXBElement<SpecialFulfillmentRequestCodeType>(_SpecialFulfillmentRequestCode_QNAME, SpecialFulfillmentRequestCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingStatusRequest")
    public JAXBElement<PostingStatusRequestType> createPostingStatusRequest(PostingStatusRequestType value) {
        return new JAXBElement<PostingStatusRequestType>(_PostingStatusRequest_QNAME, PostingStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscountAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DiscountAmount")
    public JAXBElement<DiscountAmountType> createDiscountAmount(DiscountAmountType value) {
        return new JAXBElement<DiscountAmountType>(_DiscountAmount_QNAME, DiscountAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceModifierDown")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPriceModifierDown(String value) {
        return new JAXBElement<String>(_PriceModifierDown_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Payment")
    public JAXBElement<PaymentType> createPayment(PaymentType value) {
        return new JAXBElement<PaymentType>(_Payment_QNAME, PaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CidxListDaysOfWeek }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DayOfWeek")
    public JAXBElement<CidxListDaysOfWeek> createDayOfWeek(CidxListDaysOfWeek value) {
        return new JAXBElement<CidxListDaysOfWeek>(_DayOfWeek_QNAME, CidxListDaysOfWeek.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryOfFinalDestinationCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CountryOfFinalDestinationCode")
    public JAXBElement<CountryOfFinalDestinationCodeType> createCountryOfFinalDestinationCode(CountryOfFinalDestinationCodeType value) {
        return new JAXBElement<CountryOfFinalDestinationCodeType>(_CountryOfFinalDestinationCode_QNAME, CountryOfFinalDestinationCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LineItemType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLineItemType(String value) {
        return new JAXBElement<String>(_LineItemType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingStatusResponsePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingStatusResponsePartners")
    public JAXBElement<PostingStatusResponsePartnersType> createPostingStatusResponsePartners(PostingStatusResponsePartnersType value) {
        return new JAXBElement<PostingStatusResponsePartnersType>(_PostingStatusResponsePartners_QNAME, PostingStatusResponsePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoicePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InvoiceProperties")
    public JAXBElement<InvoicePropertiesType> createInvoiceProperties(InvoicePropertiesType value) {
        return new JAXBElement<InvoicePropertiesType>(_InvoiceProperties_QNAME, InvoicePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleDateTimeInformationRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ScheduleDateTimeInformationRange")
    public JAXBElement<ScheduleDateTimeInformationRangeType> createScheduleDateTimeInformationRange(ScheduleDateTimeInformationRangeType value) {
        return new JAXBElement<ScheduleDateTimeInformationRangeType>(_ScheduleDateTimeInformationRange_QNAME, ScheduleDateTimeInformationRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentIdentification")
    public JAXBElement<ShipmentIdentificationType> createShipmentIdentification(ShipmentIdentificationType value) {
        return new JAXBElement<ShipmentIdentificationType>(_ShipmentIdentification_QNAME, ShipmentIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CardHolderName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCardHolderName(String value) {
        return new JAXBElement<String>(_CardHolderName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "EmailAddress")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEmailAddress(String value) {
        return new JAXBElement<String>(_EmailAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QualificationRequest")
    public JAXBElement<QualificationRequestType> createQualificationRequest(QualificationRequestType value) {
        return new JAXBElement<QualificationRequestType>(_QualificationRequest_QNAME, QualificationRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Percent")
    public JAXBElement<BigDecimal> createPercent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Percent_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderMotorProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderMotorProductLineItem")
    public JAXBElement<LoadTenderMotorProductLineItemType> createLoadTenderMotorProductLineItem(LoadTenderMotorProductLineItemType value) {
        return new JAXBElement<LoadTenderMotorProductLineItemType>(_LoadTenderMotorProductLineItem_QNAME, LoadTenderMotorProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipToType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipTo")
    public JAXBElement<ShipToType> createShipTo(ShipToType value) {
        return new JAXBElement<ShipToType>(_ShipTo_QNAME, ShipToType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractBody")
    public JAXBElement<ContractBodyType> createContractBody(ContractBodyType value) {
        return new JAXBElement<ContractBodyType>(_ContractBody_QNAME, ContractBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LadingIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LadingIdentification")
    public JAXBElement<LadingIdentificationType> createLadingIdentification(LadingIdentificationType value) {
        return new JAXBElement<LadingIdentificationType>(_LadingIdentification_QNAME, LadingIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipNoticeListPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipNoticeListProperties")
    public JAXBElement<ShipNoticeListPropertiesType> createShipNoticeListProperties(ShipNoticeListPropertiesType value) {
        return new JAXBElement<ShipNoticeListPropertiesType>(_ShipNoticeListProperties_QNAME, ShipNoticeListPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractPartners")
    public JAXBElement<ContractPartnersType> createContractPartners(ContractPartnersType value) {
        return new JAXBElement<ContractPartnersType>(_ContractPartners_QNAME, ContractPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsignmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Consignment")
    public JAXBElement<ConsignmentType> createConsignment(ConsignmentType value) {
        return new JAXBElement<ConsignmentType>(_Consignment_QNAME, ConsignmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingStatusRequestPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingStatusRequestProperties")
    public JAXBElement<PostingStatusRequestPropertiesType> createPostingStatusRequestProperties(PostingStatusRequestPropertiesType value) {
        return new JAXBElement<PostingStatusRequestPropertiesType>(_PostingStatusRequestProperties_QNAME, PostingStatusRequestPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingResponse")
    public JAXBElement<PostingResponseType> createPostingResponse(PostingResponseType value) {
        return new JAXBElement<PostingResponseType>(_PostingResponse_QNAME, PostingResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Location")
    public JAXBElement<LocationType> createLocation(LocationType value) {
        return new JAXBElement<LocationType>(_Location_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalResponse")
    public JAXBElement<ReplenishmentProposalResponseType> createReplenishmentProposalResponse(ReplenishmentProposalResponseType value) {
        return new JAXBElement<ReplenishmentProposalResponseType>(_ReplenishmentProposalResponse_QNAME, ReplenishmentProposalResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderOceanPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderOceanPartners")
    public JAXBElement<LoadTenderOceanPartnersType> createLoadTenderOceanPartners(LoadTenderOceanPartnersType value) {
        return new JAXBElement<LoadTenderOceanPartnersType>(_LoadTenderOceanPartners_QNAME, LoadTenderOceanPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManufacturingIdentificationDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ManufacturingIdentificationDetails")
    public JAXBElement<ManufacturingIdentificationDetailsType> createManufacturingIdentificationDetails(ManufacturingIdentificationDetailsType value) {
        return new JAXBElement<ManufacturingIdentificationDetailsType>(_ManufacturingIdentificationDetails_QNAME, ManufacturingIdentificationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryReceiptResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryReceiptResponseProperties")
    public JAXBElement<DeliveryReceiptResponsePropertiesType> createDeliveryReceiptResponseProperties(DeliveryReceiptResponsePropertiesType value) {
        return new JAXBElement<DeliveryReceiptResponsePropertiesType>(_DeliveryReceiptResponseProperties_QNAME, DeliveryReceiptResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalChangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalChange")
    public JAXBElement<ReplenishmentProposalChangeType> createReplenishmentProposalChange(ReplenishmentProposalChangeType value) {
        return new JAXBElement<ReplenishmentProposalChangeType>(_ReplenishmentProposalChange_QNAME, ReplenishmentProposalChangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoyageTripNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "VoyageTripNumber")
    public JAXBElement<VoyageTripNumberType> createVoyageTripNumber(VoyageTripNumberType value) {
        return new JAXBElement<VoyageTripNumberType>(_VoyageTripNumber_QNAME, VoyageTripNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxOrDutyTotalsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TaxOrDutyTotals")
    public JAXBElement<TaxOrDutyTotalsType> createTaxOrDutyTotals(TaxOrDutyTotalsType value) {
        return new JAXBElement<TaxOrDutyTotalsType>(_TaxOrDutyTotals_QNAME, TaxOrDutyTotalsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Supplier")
    public JAXBElement<SupplierType> createSupplier(SupplierType value) {
        return new JAXBElement<SupplierType>(_Supplier_QNAME, SupplierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPostalCode(String value) {
        return new JAXBElement<String>(_PostalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SellerSequenceNumber")
    public JAXBElement<BigInteger> createSellerSequenceNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_SellerSequenceNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdjustmentCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AdjustmentCode")
    public JAXBElement<AdjustmentCodeType> createAdjustmentCode(AdjustmentCodeType value) {
        return new JAXBElement<AdjustmentCodeType>(_AdjustmentCode_QNAME, AdjustmentCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingAcceptResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingAcceptResponseDetails")
    public JAXBElement<PostingAcceptResponseDetailsType> createPostingAcceptResponseDetails(PostingAcceptResponseDetailsType value) {
        return new JAXBElement<PostingAcceptResponseDetailsType>(_PostingAcceptResponseDetails_QNAME, PostingAcceptResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ErrorDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createErrorDescription(String value) {
        return new JAXBElement<String>(_ErrorDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseIssuedDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ResponseIssuedDate")
    public JAXBElement<ResponseIssuedDateType> createResponseIssuedDate(ResponseIssuedDateType value) {
        return new JAXBElement<ResponseIssuedDateType>(_ResponseIssuedDate_QNAME, ResponseIssuedDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PropertyDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPropertyDescription(String value) {
        return new JAXBElement<String>(_PropertyDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TariffSection")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTariffSection(String value) {
        return new JAXBElement<String>(_TariffSection_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyPlanResponsePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SupplyPlanResponsePartners")
    public JAXBElement<SupplyPlanResponsePartnersType> createSupplyPlanResponsePartners(SupplyPlanResponsePartnersType value) {
        return new JAXBElement<SupplyPlanResponsePartnersType>(_SupplyPlanResponsePartners_QNAME, SupplyPlanResponsePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryConfirmationAcceptance")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDeliveryConfirmationAcceptance(String value) {
        return new JAXBElement<String>(_DeliveryConfirmationAcceptance_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportResponseBody")
    public JAXBElement<CostSupportResponseBodyType> createCostSupportResponseBody(CostSupportResponseBodyType value) {
        return new JAXBElement<CostSupportResponseBodyType>(_CostSupportResponseBody_QNAME, CostSupportResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaximumMeasurementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MaximumMeasurement")
    public JAXBElement<MaximumMeasurementType> createMaximumMeasurement(MaximumMeasurementType value) {
        return new JAXBElement<MaximumMeasurementType>(_MaximumMeasurement_QNAME, MaximumMeasurementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PartnerReference")
    public JAXBElement<PartnerReferenceType> createPartnerReference(PartnerReferenceType value) {
        return new JAXBElement<PartnerReferenceType>(_PartnerReference_QNAME, PartnerReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipNoticePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipNoticeProperties")
    public JAXBElement<ShipNoticePropertiesType> createShipNoticeProperties(ShipNoticePropertiesType value) {
        return new JAXBElement<ShipNoticePropertiesType>(_ShipNoticeProperties_QNAME, ShipNoticePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentBody")
    public JAXBElement<PaymentBodyType> createPaymentBody(PaymentBodyType value) {
        return new JAXBElement<PaymentBodyType>(_PaymentBody_QNAME, PaymentBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AcceptOrReject")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAcceptOrReject(String value) {
        return new JAXBElement<String>(_AcceptOrReject_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryReceiptPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryReceiptPartners")
    public JAXBElement<DeliveryReceiptPartnersType> createDeliveryReceiptPartners(DeliveryReceiptPartnersType value) {
        return new JAXBElement<DeliveryReceiptPartnersType>(_DeliveryReceiptPartners_QNAME, DeliveryReceiptPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyPlanType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SupplyPlan")
    public JAXBElement<SupplyPlanType> createSupplyPlan(SupplyPlanType value) {
        return new JAXBElement<SupplyPlanType>(_SupplyPlan_QNAME, SupplyPlanType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RateService")
    public JAXBElement<RateServiceType> createRateService(RateServiceType value) {
        return new JAXBElement<RateServiceType>(_RateService_QNAME, RateServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForecastedProductMovementReportDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ForecastedProductMovementReportDetails")
    public JAXBElement<ForecastedProductMovementReportDetailsType> createForecastedProductMovementReportDetails(ForecastedProductMovementReportDetailsType value) {
        return new JAXBElement<ForecastedProductMovementReportDetailsType>(_ForecastedProductMovementReportDetails_QNAME, ForecastedProductMovementReportDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractNumber")
    public JAXBElement<ContractNumberType> createContractNumber(ContractNumberType value) {
        return new JAXBElement<ContractNumberType>(_ContractNumber_QNAME, ContractNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AccountHolderName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAccountHolderName(String value) {
        return new JAXBElement<String>(_AccountHolderName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "IsDrug")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIsDrug(String value) {
        return new JAXBElement<String>(_IsDrug_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceAndAvailabilityRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceAndAvailabilityRequest")
    public JAXBElement<PriceAndAvailabilityRequestType> createPriceAndAvailabilityRequest(PriceAndAvailabilityRequestType value) {
        return new JAXBElement<PriceAndAvailabilityRequestType>(_PriceAndAvailabilityRequest_QNAME, PriceAndAvailabilityRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusRequestProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusRequestProductLineItem")
    public JAXBElement<OrderStatusRequestProductLineItemType> createOrderStatusRequestProductLineItem(OrderStatusRequestProductLineItemType value) {
        return new JAXBElement<OrderStatusRequestProductLineItemType>(_OrderStatusRequestProductLineItem_QNAME, OrderStatusRequestProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Regulations")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRegulations(String value) {
        return new JAXBElement<String>(_Regulations_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncludeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Include")
    public JAXBElement<IncludeType> createInclude(IncludeType value) {
        return new JAXBElement<IncludeType>(_Include_QNAME, IncludeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinimumMeasurementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MinimumMeasurement")
    public JAXBElement<MinimumMeasurementType> createMinimumMeasurement(MinimumMeasurementType value) {
        return new JAXBElement<MinimumMeasurementType>(_MinimumMeasurement_QNAME, MinimumMeasurementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingChangeLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingChangeLineItem")
    public JAXBElement<PostingChangeLineItemType> createPostingChangeLineItem(PostingChangeLineItemType value) {
        return new JAXBElement<PostingChangeLineItemType>(_PostingChangeLineItem_QNAME, PostingChangeLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupportedSalesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SupportedSales")
    public JAXBElement<SupportedSalesType> createSupportedSales(SupportedSalesType value) {
        return new JAXBElement<SupportedSalesType>(_SupportedSales_QNAME, SupportedSalesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptanceNotificationLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AcceptanceNotificationLocation")
    public JAXBElement<AcceptanceNotificationLocationType> createAcceptanceNotificationLocation(AcceptanceNotificationLocationType value) {
        return new JAXBElement<AcceptanceNotificationLocationType>(_AcceptanceNotificationLocation_QNAME, AcceptanceNotificationLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BidDueDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BidDueDate")
    public JAXBElement<BidDueDateType> createBidDueDate(BidDueDateType value) {
        return new JAXBElement<BidDueDateType>(_BidDueDate_QNAME, BidDueDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCatalogUpdateDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductCatalogUpdateDetails")
    public JAXBElement<ProductCatalogUpdateDetailsType> createProductCatalogUpdateDetails(ProductCatalogUpdateDetailsType value) {
        return new JAXBElement<ProductCatalogUpdateDetailsType>(_ProductCatalogUpdateDetails_QNAME, ProductCatalogUpdateDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingCreatePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingCreatePartners")
    public JAXBElement<PostingCreatePartnersType> createPostingCreatePartners(PostingCreatePartnersType value) {
        return new JAXBElement<PostingCreatePartnersType>(_PostingCreatePartners_QNAME, PostingCreatePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceAndAvailabilityRequestPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceAndAvailabilityRequestPartners")
    public JAXBElement<PriceAndAvailabilityRequestPartnersType> createPriceAndAvailabilityRequestPartners(PriceAndAvailabilityRequestPartnersType value) {
        return new JAXBElement<PriceAndAvailabilityRequestPartnersType>(_PriceAndAvailabilityRequestPartners_QNAME, PriceAndAvailabilityRequestPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateSampleTakenType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DateSampleTaken")
    public JAXBElement<DateSampleTakenType> createDateSampleTaken(DateSampleTakenType value) {
        return new JAXBElement<DateSampleTakenType>(_DateSampleTaken_QNAME, DateSampleTakenType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightBillNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FreightBillNumber")
    public JAXBElement<FreightBillNumberType> createFreightBillNumber(FreightBillNumberType value) {
        return new JAXBElement<FreightBillNumberType>(_FreightBillNumber_QNAME, FreightBillNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DateTimeInformation")
    public JAXBElement<DateTimeInformationType> createDateTimeInformation(DateTimeInformationType value) {
        return new JAXBElement<DateTimeInformationType>(_DateTimeInformation_QNAME, DateTimeInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderChangeDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderChangeDetails")
    public JAXBElement<OrderChangeDetailsType> createOrderChangeDetails(OrderChangeDetailsType value) {
        return new JAXBElement<OrderChangeDetailsType>(_OrderChangeDetails_QNAME, OrderChangeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FreightIncludedFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFreightIncludedFlag(String value) {
        return new JAXBElement<String>(_FreightIncludedFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeightType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Height")
    public JAXBElement<HeightType> createHeight(HeightType value) {
        return new JAXBElement<HeightType>(_Height_QNAME, HeightType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentInstructionsSubLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentInstructionsSubLineItem")
    public JAXBElement<ShipmentInstructionsSubLineItemType> createShipmentInstructionsSubLineItem(ShipmentInstructionsSubLineItemType value) {
        return new JAXBElement<ShipmentInstructionsSubLineItemType>(_ShipmentInstructionsSubLineItem_QNAME, ShipmentInstructionsSubLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingCancelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingCancel")
    public JAXBElement<PostingCancelType> createPostingCancel(PostingCancelType value) {
        return new JAXBElement<PostingCancelType>(_PostingCancel_QNAME, PostingCancelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxableAmountTotalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TaxableAmountTotal")
    public JAXBElement<TaxableAmountTotalType> createTaxableAmountTotal(TaxableAmountTotalType value) {
        return new JAXBElement<TaxableAmountTotalType>(_TaxableAmountTotal_QNAME, TaxableAmountTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportCreditResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportCreditResponse")
    public JAXBElement<CostSupportCreditResponseType> createCostSupportCreditResponse(CostSupportCreditResponseType value) {
        return new JAXBElement<CostSupportCreditResponseType>(_CostSupportCreditResponse_QNAME, CostSupportCreditResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LocationFrom")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLocationFrom(String value) {
        return new JAXBElement<String>(_LocationFrom_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusListRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusListRequest")
    public JAXBElement<OrderStatusListRequestType> createOrderStatusListRequest(OrderStatusListRequestType value) {
        return new JAXBElement<OrderStatusListRequestType>(_OrderStatusListRequest_QNAME, OrderStatusListRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptanceNotificationDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AcceptanceNotificationDetails")
    public JAXBElement<AcceptanceNotificationDetailsType> createAcceptanceNotificationDetails(AcceptanceNotificationDetailsType value) {
        return new JAXBElement<AcceptanceNotificationDetailsType>(_AcceptanceNotificationDetails_QNAME, AcceptanceNotificationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowanceChargeCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AllowanceChargeCode")
    public JAXBElement<AllowanceChargeCodeType> createAllowanceChargeCode(AllowanceChargeCodeType value) {
        return new JAXBElement<AllowanceChargeCodeType>(_AllowanceChargeCode_QNAME, AllowanceChargeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReleaseNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReleaseNumber(String value) {
        return new JAXBElement<String>(_ReleaseNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TruckType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTruckType(String value) {
        return new JAXBElement<String>(_TruckType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryActualUsageResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryActualUsageResponseBody")
    public JAXBElement<InventoryActualUsageResponseBodyType> createInventoryActualUsageResponseBody(InventoryActualUsageResponseBodyType value) {
        return new JAXBElement<InventoryActualUsageResponseBodyType>(_InventoryActualUsageResponseBody_QNAME, InventoryActualUsageResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestedDocument")
    public JAXBElement<RequestedDocumentType> createRequestedDocument(RequestedDocumentType value) {
        return new JAXBElement<RequestedDocumentType>(_RequestedDocument_QNAME, RequestedDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportRequestPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportRequestPartners")
    public JAXBElement<CostSupportRequestPartnersType> createCostSupportRequestPartners(CostSupportRequestPartnersType value) {
        return new JAXBElement<CostSupportRequestPartnersType>(_CostSupportRequestPartners_QNAME, CostSupportRequestPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingAcceptResponsePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingAcceptResponsePartners")
    public JAXBElement<PostingAcceptResponsePartnersType> createPostingAcceptResponsePartners(PostingAcceptResponsePartnersType value) {
        return new JAXBElement<PostingAcceptResponsePartnersType>(_PostingAcceptResponsePartners_QNAME, PostingAcceptResponsePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentStatusRequestPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentStatusRequestPartners")
    public JAXBElement<ShipmentStatusRequestPartnersType> createShipmentStatusRequestPartners(ShipmentStatusRequestPartnersType value) {
        return new JAXBElement<ShipmentStatusRequestPartnersType>(_ShipmentStatusRequestPartners_QNAME, ShipmentStatusRequestPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createShipType(String value) {
        return new JAXBElement<String>(_ShipType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TariffItem")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTariffItem(String value) {
        return new JAXBElement<String>(_TariffItem_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProprietaryShipmentTrackingIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProprietaryShipmentTrackingIdentifier(String value) {
        return new JAXBElement<String>(_ProprietaryShipmentTrackingIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CidxListGeographicType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "GeographicType")
    public JAXBElement<CidxListGeographicType> createGeographicType(CidxListGeographicType value) {
        return new JAXBElement<CidxListGeographicType>(_GeographicType_QNAME, CidxListGeographicType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LineNumber")
    public JAXBElement<Long> createLineNumber(Long value) {
        return new JAXBElement<Long>(_LineNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderedProductQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderedProductQuantity")
    public JAXBElement<OrderedProductQuantityType> createOrderedProductQuantity(OrderedProductQuantityType value) {
        return new JAXBElement<OrderedProductQuantityType>(_OrderedProductQuantity_QNAME, OrderedProductQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipperType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Shipper")
    public JAXBElement<ShipperType> createShipper(ShipperType value) {
        return new JAXBElement<ShipperType>(_Shipper_QNAME, ShipperType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeclaredValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeclaredValue")
    public JAXBElement<DeclaredValueType> createDeclaredValue(DeclaredValueType value) {
        return new JAXBElement<DeclaredValueType>(_DeclaredValue_QNAME, DeclaredValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HazardousSubstanceNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HazardousSubstanceName")
    public JAXBElement<HazardousSubstanceNameType> createHazardousSubstanceName(HazardousSubstanceNameType value) {
        return new JAXBElement<HazardousSubstanceNameType>(_HazardousSubstanceName_QNAME, HazardousSubstanceNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryOnSiteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryOnSite")
    public JAXBElement<InventoryOnSiteType> createInventoryOnSite(InventoryOnSiteType value) {
        return new JAXBElement<InventoryOnSiteType>(_InventoryOnSite_QNAME, InventoryOnSiteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryConfirmationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryConfirmation")
    public JAXBElement<DeliveryConfirmationType> createDeliveryConfirmation(DeliveryConfirmationType value) {
        return new JAXBElement<DeliveryConfirmationType>(_DeliveryConfirmation_QNAME, DeliveryConfirmationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceSheetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceSheet")
    public JAXBElement<PriceSheetType> createPriceSheet(PriceSheetType value) {
        return new JAXBElement<PriceSheetType>(_PriceSheet_QNAME, PriceSheetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HAZMATCertificationRequired")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createHAZMATCertificationRequired(String value) {
        return new JAXBElement<String>(_HAZMATCertificationRequired_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LimitDisplayFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLimitDisplayFlag(String value) {
        return new JAXBElement<String>(_LimitDisplayFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentStatusRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentStatusRequestDetails")
    public JAXBElement<ShipmentStatusRequestDetailsType> createShipmentStatusRequestDetails(ShipmentStatusRequestDetailsType value) {
        return new JAXBElement<ShipmentStatusRequestDetailsType>(_ShipmentStatusRequestDetails_QNAME, ShipmentStatusRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostalCountry")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPostalCountry(String value) {
        return new JAXBElement<String>(_PostalCountry_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Temperature")
    public JAXBElement<TemperatureType> createTemperature(TemperatureType value) {
        return new JAXBElement<TemperatureType>(_Temperature_QNAME, TemperatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Counties")
    public JAXBElement<CountiesType> createCounties(CountiesType value) {
        return new JAXBElement<CountiesType>(_Counties_QNAME, CountiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InvoiceResponseBody")
    public JAXBElement<InvoiceResponseBodyType> createInvoiceResponseBody(InvoiceResponseBodyType value) {
        return new JAXBElement<InvoiceResponseBodyType>(_InvoiceResponseBody_QNAME, InvoiceResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryReceiptLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryReceiptLocation")
    public JAXBElement<DeliveryReceiptLocationType> createDeliveryReceiptLocation(DeliveryReceiptLocationType value) {
        return new JAXBElement<DeliveryReceiptLocationType>(_DeliveryReceiptLocation_QNAME, DeliveryReceiptLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusResponseDetails")
    public JAXBElement<OrderStatusResponseDetailsType> createOrderStatusResponseDetails(OrderStatusResponseDetailsType value) {
        return new JAXBElement<OrderStatusResponseDetailsType>(_OrderStatusResponseDetails_QNAME, OrderStatusResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryInTransitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryInTransit")
    public JAXBElement<InventoryInTransitType> createInventoryInTransit(InventoryInTransitType value) {
        return new JAXBElement<InventoryInTransitType>(_InventoryInTransit_QNAME, InventoryInTransitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixedContractPriceDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FixedContractPriceDate")
    public JAXBElement<FixedContractPriceDateType> createFixedContractPriceDate(FixedContractPriceDateType value) {
        return new JAXBElement<FixedContractPriceDateType>(_FixedContractPriceDate_QNAME, FixedContractPriceDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagingItemsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PackagingItems")
    public JAXBElement<PackagingItemsType> createPackagingItems(PackagingItemsType value) {
        return new JAXBElement<PackagingItemsType>(_PackagingItems_QNAME, PackagingItemsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AddressInformation")
    public JAXBElement<AddressInformationType> createAddressInformation(AddressInformationType value) {
        return new JAXBElement<AddressInformationType>(_AddressInformation_QNAME, AddressInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForecastedProductMovementReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ForecastedProductMovementReport")
    public JAXBElement<ForecastedProductMovementReportType> createForecastedProductMovementReport(ForecastedProductMovementReportType value) {
        return new JAXBElement<ForecastedProductMovementReportType>(_ForecastedProductMovementReport_QNAME, ForecastedProductMovementReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetWeightType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "NetWeight")
    public JAXBElement<NetWeightType> createNetWeight(NetWeightType value) {
        return new JAXBElement<NetWeightType>(_NetWeight_QNAME, NetWeightType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryConfirmationResponsePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryConfirmationResponsePartners")
    public JAXBElement<DeliveryConfirmationResponsePartnersType> createDeliveryConfirmationResponsePartners(DeliveryConfirmationResponsePartnersType value) {
        return new JAXBElement<DeliveryConfirmationResponsePartnersType>(_DeliveryConfirmationResponsePartners_QNAME, DeliveryConfirmationResponsePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryConfirmationPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryConfirmationProperties")
    public JAXBElement<DeliveryConfirmationPropertiesType> createDeliveryConfirmationProperties(DeliveryConfirmationPropertiesType value) {
        return new JAXBElement<DeliveryConfirmationPropertiesType>(_DeliveryConfirmationProperties_QNAME, DeliveryConfirmationPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SafetyDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SafetyDescription")
    public JAXBElement<SafetyDescriptionType> createSafetyDescription(SafetyDescriptionType value) {
        return new JAXBElement<SafetyDescriptionType>(_SafetyDescription_QNAME, SafetyDescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Measurement")
    public JAXBElement<MeasurementType> createMeasurement(MeasurementType value) {
        return new JAXBElement<MeasurementType>(_Measurement_QNAME, MeasurementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimatedTimeOfDepartureDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "EstimatedTimeOfDepartureDate")
    public JAXBElement<EstimatedTimeOfDepartureDateType> createEstimatedTimeOfDepartureDate(EstimatedTimeOfDepartureDateType value) {
        return new JAXBElement<EstimatedTimeOfDepartureDateType>(_EstimatedTimeOfDepartureDate_QNAME, EstimatedTimeOfDepartureDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrossInvoiceAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "GrossInvoiceAmount")
    public JAXBElement<GrossInvoiceAmountType> createGrossInvoiceAmount(GrossInvoiceAmountType value) {
        return new JAXBElement<GrossInvoiceAmountType>(_GrossInvoiceAmount_QNAME, GrossInvoiceAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AllowExportFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAllowExportFlag(String value) {
        return new JAXBElement<String>(_AllowExportFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentStatusRequestBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentStatusRequestBody")
    public JAXBElement<ShipmentStatusRequestBodyType> createShipmentStatusRequestBody(ShipmentStatusRequestBodyType value) {
        return new JAXBElement<ShipmentStatusRequestBodyType>(_ShipmentStatusRequestBody_QNAME, ShipmentStatusRequestBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCatalogPriceDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductCatalogPriceData")
    public JAXBElement<ProductCatalogPriceDataType> createProductCatalogPriceData(ProductCatalogPriceDataType value) {
        return new JAXBElement<ProductCatalogPriceDataType>(_ProductCatalogPriceData_QNAME, ProductCatalogPriceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RestrictedOrderFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRestrictedOrderFlag(String value) {
        return new JAXBElement<String>(_RestrictedOrderFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalCancelDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalCancelDetails")
    public JAXBElement<ReplenishmentProposalCancelDetailsType> createReplenishmentProposalCancelDetails(ReplenishmentProposalCancelDetailsType value) {
        return new JAXBElement<ReplenishmentProposalCancelDetailsType>(_ReplenishmentProposalCancelDetails_QNAME, ReplenishmentProposalCancelDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipNoticeListDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipNoticeListDetails")
    public JAXBElement<ShipNoticeListDetailsType> createShipNoticeListDetails(ShipNoticeListDetailsType value) {
        return new JAXBElement<ShipNoticeListDetailsType>(_ShipNoticeListDetails_QNAME, ShipNoticeListDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ScheduleLineIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createScheduleLineIdentifier(String value) {
        return new JAXBElement<String>(_ScheduleLineIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentInstructionsStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createShipmentInstructionsStatus(String value) {
        return new JAXBElement<String>(_ShipmentInstructionsStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptNoticePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReceiptNoticePartners")
    public JAXBElement<ReceiptNoticePartnersType> createReceiptNoticePartners(ReceiptNoticePartnersType value) {
        return new JAXBElement<ReceiptNoticePartnersType>(_ReceiptNoticePartners_QNAME, ReceiptNoticePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentStatusDateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentStatusDateTime")
    public JAXBElement<ShipmentStatusDateTimeType> createShipmentStatusDateTime(ShipmentStatusDateTimeType value) {
        return new JAXBElement<ShipmentStatusDateTimeType>(_ShipmentStatusDateTime_QNAME, ShipmentStatusDateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryConfirmationResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryConfirmationResponseBody")
    public JAXBElement<DeliveryConfirmationResponseBodyType> createDeliveryConfirmationResponseBody(DeliveryConfirmationResponseBodyType value) {
        return new JAXBElement<DeliveryConfirmationResponseBodyType>(_DeliveryConfirmationResponseBody_QNAME, DeliveryConfirmationResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RiskPhraseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RiskPhrase")
    public JAXBElement<RiskPhraseType> createRiskPhrase(RiskPhraseType value) {
        return new JAXBElement<RiskPhraseType>(_RiskPhrase_QNAME, RiskPhraseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PropertyIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPropertyIdentifier(String value) {
        return new JAXBElement<String>(_PropertyIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "NumberOfMonths")
    public JAXBElement<Integer> createNumberOfMonths(Integer value) {
        return new JAXBElement<Integer>(_NumberOfMonths_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ConveyanceNameOrIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createConveyanceNameOrIdentifier(String value) {
        return new JAXBElement<String>(_ConveyanceNameOrIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderCreateDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderCreateDetails")
    public JAXBElement<OrderCreateDetailsType> createOrderCreateDetails(OrderCreateDetailsType value) {
        return new JAXBElement<OrderCreateDetailsType>(_OrderCreateDetails_QNAME, OrderCreateDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityTestingReportPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QualityTestingReportPartners")
    public JAXBElement<QualityTestingReportPartnersType> createQualityTestingReportPartners(QualityTestingReportPartnersType value) {
        return new JAXBElement<QualityTestingReportPartnersType>(_QualityTestingReportPartners_QNAME, QualityTestingReportPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusRequest")
    public JAXBElement<OrderStatusRequestType> createOrderStatusRequest(OrderStatusRequestType value) {
        return new JAXBElement<OrderStatusRequestType>(_OrderStatusRequest_QNAME, OrderStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandlingEndDateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HandlingEndDateTime")
    public JAXBElement<HandlingEndDateTimeType> createHandlingEndDateTime(HandlingEndDateTimeType value) {
        return new JAXBElement<HandlingEndDateTimeType>(_HandlingEndDateTime_QNAME, HandlingEndDateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerCatalogPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CustomerCatalogPrice")
    public JAXBElement<CustomerCatalogPriceType> createCustomerCatalogPrice(CustomerCatalogPriceType value) {
        return new JAXBElement<CustomerCatalogPriceType>(_CustomerCatalogPrice_QNAME, CustomerCatalogPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SafetyCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SafetyCode")
    public JAXBElement<SafetyCodeType> createSafetyCode(SafetyCodeType value) {
        return new JAXBElement<SafetyCodeType>(_SafetyCode_QNAME, SafetyCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SpecialRequirements")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSpecialRequirements(String value) {
        return new JAXBElement<String>(_SpecialRequirements_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ForecastInformation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createForecastInformation(String value) {
        return new JAXBElement<String>(_ForecastInformation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TaxAmount")
    public JAXBElement<TaxAmountType> createTaxAmount(TaxAmountType value) {
        return new JAXBElement<TaxAmountType>(_TaxAmount_QNAME, TaxAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HazardousClassPrimaryCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HazardousClassPrimaryCode")
    public JAXBElement<HazardousClassPrimaryCodeType> createHazardousClassPrimaryCode(HazardousClassPrimaryCodeType value) {
        return new JAXBElement<HazardousClassPrimaryCodeType>(_HazardousClassPrimaryCode_QNAME, HazardousClassPrimaryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandForecastResponsePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandForecastResponsePartners")
    public JAXBElement<DemandForecastResponsePartnersType> createDemandForecastResponsePartners(DemandForecastResponsePartnersType value) {
        return new JAXBElement<DemandForecastResponsePartnersType>(_DemandForecastResponsePartners_QNAME, DemandForecastResponsePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingAcceptPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingAcceptProperties")
    public JAXBElement<PostingAcceptPropertiesType> createPostingAcceptProperties(PostingAcceptPropertiesType value) {
        return new JAXBElement<PostingAcceptPropertiesType>(_PostingAcceptProperties_QNAME, PostingAcceptPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BuyerSequenceNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBuyerSequenceNumber(String value) {
        return new JAXBElement<String>(_BuyerSequenceNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditRequestApprovalNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CreditRequestApprovalNumber")
    public JAXBElement<CreditRequestApprovalNumberType> createCreditRequestApprovalNumber(CreditRequestApprovalNumberType value) {
        return new JAXBElement<CreditRequestApprovalNumberType>(_CreditRequestApprovalNumber_QNAME, CreditRequestApprovalNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderLeadTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderLeadTime")
    public JAXBElement<OrderLeadTimeType> createOrderLeadTime(OrderLeadTimeType value) {
        return new JAXBElement<OrderLeadTimeType>(_OrderLeadTime_QNAME, OrderLeadTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSpecificCatalogUpdateBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CustomerSpecificCatalogUpdateBody")
    public JAXBElement<CustomerSpecificCatalogUpdateBodyType> createCustomerSpecificCatalogUpdateBody(CustomerSpecificCatalogUpdateBodyType value) {
        return new JAXBElement<CustomerSpecificCatalogUpdateBodyType>(_CustomerSpecificCatalogUpdateBody_QNAME, CustomerSpecificCatalogUpdateBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusRequestBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusRequestBody")
    public JAXBElement<OrderStatusRequestBodyType> createOrderStatusRequestBody(OrderStatusRequestBodyType value) {
        return new JAXBElement<OrderStatusRequestBodyType>(_OrderStatusRequestBody_QNAME, OrderStatusRequestBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingCancelLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingCancelLineItem")
    public JAXBElement<PostingCancelLineItemType> createPostingCancelLineItem(PostingCancelLineItemType value) {
        return new JAXBElement<PostingCancelLineItemType>(_PostingCancelLineItem_QNAME, PostingCancelLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CidxListEnclosureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Enclosure")
    public JAXBElement<CidxListEnclosureType> createEnclosure(CidxListEnclosureType value) {
        return new JAXBElement<CidxListEnclosureType>(_Enclosure_QNAME, CidxListEnclosureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingStatusRequestBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingStatusRequestBody")
    public JAXBElement<PostingStatusRequestBodyType> createPostingStatusRequestBody(PostingStatusRequestBodyType value) {
        return new JAXBElement<PostingStatusRequestBodyType>(_PostingStatusRequestBody_QNAME, PostingStatusRequestBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DutyStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDutyStatus(String value) {
        return new JAXBElement<String>(_DutyStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentMethodCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentMethodCode")
    public JAXBElement<PaymentMethodCodeType> createPaymentMethodCode(PaymentMethodCodeType value) {
        return new JAXBElement<PaymentMethodCodeType>(_PaymentMethodCode_QNAME, PaymentMethodCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Plan")
    public JAXBElement<PlanType> createPlan(PlanType value) {
        return new JAXBElement<PlanType>(_Plan_QNAME, PlanType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusListResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusListResponseBody")
    public JAXBElement<OrderStatusListResponseBodyType> createOrderStatusListResponseBody(OrderStatusListResponseBodyType value) {
        return new JAXBElement<OrderStatusListResponseBodyType>(_OrderStatusListResponseBody_QNAME, OrderStatusListResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractExpirationDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractExpirationDate")
    public JAXBElement<ContractExpirationDateType> createContractExpirationDate(ContractExpirationDateType value) {
        return new JAXBElement<ContractExpirationDateType>(_ContractExpirationDate_QNAME, ContractExpirationDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentPartners")
    public JAXBElement<PaymentPartnersType> createPaymentPartners(PaymentPartnersType value) {
        return new JAXBElement<PaymentPartnersType>(_PaymentPartners_QNAME, PaymentPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoldByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SoldBy")
    public JAXBElement<SoldByType> createSoldBy(SoldByType value) {
        return new JAXBElement<SoldByType>(_SoldBy_QNAME, SoldByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "EquipmentDetails")
    public JAXBElement<EquipmentDetailsType> createEquipmentDetails(EquipmentDetailsType value) {
        return new JAXBElement<EquipmentDetailsType>(_EquipmentDetails_QNAME, EquipmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TerminalName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTerminalName(String value) {
        return new JAXBElement<String>(_TerminalName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualificationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QualificationResponse")
    public JAXBElement<QualificationResponseType> createQualificationResponse(QualificationResponseType value) {
        return new JAXBElement<QualificationResponseType>(_QualificationResponse_QNAME, QualificationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryLevelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryLevel")
    public JAXBElement<InventoryLevelType> createInventoryLevel(InventoryLevelType value) {
        return new JAXBElement<InventoryLevelType>(_InventoryLevel_QNAME, InventoryLevelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalResponseBody")
    public JAXBElement<ReplenishmentProposalResponseBodyType> createReplenishmentProposalResponseBody(ReplenishmentProposalResponseBodyType value) {
        return new JAXBElement<ReplenishmentProposalResponseBodyType>(_ReplenishmentProposalResponseBody_QNAME, ReplenishmentProposalResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductAttributeValue")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductAttributeValue(String value) {
        return new JAXBElement<String>(_ProductAttributeValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingCancelResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingCancelResponse")
    public JAXBElement<PostingCancelResponseType> createPostingCancelResponse(PostingCancelResponseType value) {
        return new JAXBElement<PostingCancelResponseType>(_PostingCancelResponse_QNAME, PostingCancelResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalCodesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostalCodes")
    public JAXBElement<PostalCodesType> createPostalCodes(PostalCodesType value) {
        return new JAXBElement<PostalCodesType>(_PostalCodes_QNAME, PostalCodesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandForecastResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandForecastResponseBody")
    public JAXBElement<DemandForecastResponseBodyType> createDemandForecastResponseBody(DemandForecastResponseBodyType value) {
        return new JAXBElement<DemandForecastResponseBodyType>(_DemandForecastResponseBody_QNAME, DemandForecastResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestForQuoteDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestForQuoteDetails")
    public JAXBElement<RequestForQuoteDetailsType> createRequestForQuoteDetails(RequestForQuoteDetailsType value) {
        return new JAXBElement<RequestForQuoteDetailsType>(_RequestForQuoteDetails_QNAME, RequestForQuoteDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Shipping")
    public JAXBElement<ShippingType> createShipping(ShippingType value) {
        return new JAXBElement<ShippingType>(_Shipping_QNAME, ShippingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagingQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PackagingQuantity")
    public JAXBElement<PackagingQuantityType> createPackagingQuantity(PackagingQuantityType value) {
        return new JAXBElement<PackagingQuantityType>(_PackagingQuantity_QNAME, PackagingQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitedNationsNorthAmericaCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "UnitedNationsNorthAmericaCode")
    public JAXBElement<UnitedNationsNorthAmericaCodeType> createUnitedNationsNorthAmericaCode(UnitedNationsNorthAmericaCodeType value) {
        return new JAXBElement<UnitedNationsNorthAmericaCodeType>(_UnitedNationsNorthAmericaCode_QNAME, UnitedNationsNorthAmericaCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReconciliationNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReconciliationNumber")
    public JAXBElement<ReconciliationNumberType> createReconciliationNumber(ReconciliationNumberType value) {
        return new JAXBElement<ReconciliationNumberType>(_ReconciliationNumber_QNAME, ReconciliationNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SpecialLabelsAndMarkings")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSpecialLabelsAndMarkings(String value) {
        return new JAXBElement<String>(_SpecialLabelsAndMarkings_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Description")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponsePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderResponsePartners")
    public JAXBElement<OrderResponsePartnersType> createOrderResponsePartners(OrderResponsePartnersType value) {
        return new JAXBElement<OrderResponsePartnersType>(_OrderResponsePartners_QNAME, OrderResponsePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Plant")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPlant(String value) {
        return new JAXBElement<String>(_Plant_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadProperties")
    public JAXBElement<LoadPropertiesType> createLoadProperties(LoadPropertiesType value) {
        return new JAXBElement<LoadPropertiesType>(_LoadProperties_QNAME, LoadPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryOfOriginCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CountryOfOriginCode")
    public JAXBElement<CountryOfOriginCodeType> createCountryOfOriginCode(CountryOfOriginCodeType value) {
        return new JAXBElement<CountryOfOriginCodeType>(_CountryOfOriginCode_QNAME, CountryOfOriginCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestSpecificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TestSpecification")
    public JAXBElement<TestSpecificationType> createTestSpecification(TestSpecificationType value) {
        return new JAXBElement<TestSpecificationType>(_TestSpecification_QNAME, TestSpecificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AnonymityFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAnonymityFlag(String value) {
        return new JAXBElement<String>(_AnonymityFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderResponsePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderResponsePartners")
    public JAXBElement<LoadTenderResponsePartnersType> createLoadTenderResponsePartners(LoadTenderResponsePartnersType value) {
        return new JAXBElement<LoadTenderResponsePartnersType>(_LoadTenderResponsePartners_QNAME, LoadTenderResponsePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortOfTranshipmentCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PortOfTranshipmentCode")
    public JAXBElement<PortOfTranshipmentCodeType> createPortOfTranshipmentCode(PortOfTranshipmentCodeType value) {
        return new JAXBElement<PortOfTranshipmentCodeType>(_PortOfTranshipmentCode_QNAME, PortOfTranshipmentCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityTestingReportBatchDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QualityTestingReportBatchDetail")
    public JAXBElement<QualityTestingReportBatchDetailType> createQualityTestingReportBatchDetail(QualityTestingReportBatchDetailType value) {
        return new JAXBElement<QualityTestingReportBatchDetailType>(_QualityTestingReportBatchDetail_QNAME, QualityTestingReportBatchDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippedProductQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShippedProductQuantity")
    public JAXBElement<ShippedProductQuantityType> createShippedProductQuantity(ShippedProductQuantityType value) {
        return new JAXBElement<ShippedProductQuantityType>(_ShippedProductQuantity_QNAME, ShippedProductQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmergencyTemperatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "EmergencyTemperature")
    public JAXBElement<EmergencyTemperatureType> createEmergencyTemperature(EmergencyTemperatureType value) {
        return new JAXBElement<EmergencyTemperatureType>(_EmergencyTemperature_QNAME, EmergencyTemperatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Seal")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSeal(String value) {
        return new JAXBElement<String>(_Seal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalLocation")
    public JAXBElement<ReplenishmentProposalLocationType> createReplenishmentProposalLocation(ReplenishmentProposalLocationType value) {
        return new JAXBElement<ReplenishmentProposalLocationType>(_ReplenishmentProposalLocation_QNAME, ReplenishmentProposalLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrderNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PurchaseOrderNumber")
    public JAXBElement<PurchaseOrderNumberType> createPurchaseOrderNumber(PurchaseOrderNumberType value) {
        return new JAXBElement<PurchaseOrderNumberType>(_PurchaseOrderNumber_QNAME, PurchaseOrderNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderChangeProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderChangeProductLineItem")
    public JAXBElement<OrderChangeProductLineItemType> createOrderChangeProductLineItem(OrderChangeProductLineItemType value) {
        return new JAXBElement<OrderChangeProductLineItemType>(_OrderChangeProductLineItem_QNAME, OrderChangeProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PercentageOfBlend")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPercentageOfBlend(String value) {
        return new JAXBElement<String>(_PercentageOfBlend_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PackingInstructions")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPackingInstructions(String value) {
        return new JAXBElement<String>(_PackingInstructions_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "GeographicName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGeographicName(String value) {
        return new JAXBElement<String>(_GeographicName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusRequestPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusRequestPartners")
    public JAXBElement<OrderStatusRequestPartnersType> createOrderStatusRequestPartners(OrderStatusRequestPartnersType value) {
        return new JAXBElement<OrderStatusRequestPartnersType>(_OrderStatusRequestPartners_QNAME, OrderStatusRequestPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentResponse")
    public JAXBElement<PaymentResponseType> createPaymentResponse(PaymentResponseType value) {
        return new JAXBElement<PaymentResponseType>(_PaymentResponse_QNAME, PaymentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenHoursType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OpenHours")
    public JAXBElement<OpenHoursType> createOpenHours(OpenHoursType value) {
        return new JAXBElement<OpenHoursType>(_OpenHours_QNAME, OpenHoursType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerialNumbersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SerialNumbers")
    public JAXBElement<SerialNumbersType> createSerialNumbers(SerialNumbersType value) {
        return new JAXBElement<SerialNumbersType>(_SerialNumbers_QNAME, SerialNumbersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportRequestChangePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportRequestChangePartners")
    public JAXBElement<CostSupportRequestChangePartnersType> createCostSupportRequestChangePartners(CostSupportRequestChangePartnersType value) {
        return new JAXBElement<CostSupportRequestChangePartnersType>(_CostSupportRequestChangePartners_QNAME, CostSupportRequestChangePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchNumbersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BatchNumbers")
    public JAXBElement<BatchNumbersType> createBatchNumbers(BatchNumbersType value) {
        return new JAXBElement<BatchNumbersType>(_BatchNumbers_QNAME, BatchNumbersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderResponseDetails")
    public JAXBElement<OrderResponseDetailsType> createOrderResponseDetails(OrderResponseDetailsType value) {
        return new JAXBElement<OrderResponseDetailsType>(_OrderResponseDetails_QNAME, OrderResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TariffSubItem")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTariffSubItem(String value) {
        return new JAXBElement<String>(_TariffSubItem_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentInstructionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentInstructions")
    public JAXBElement<ShipmentInstructionsType> createShipmentInstructions(ShipmentInstructionsType value) {
        return new JAXBElement<ShipmentInstructionsType>(_ShipmentInstructions_QNAME, ShipmentInstructionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LowerLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LowerLimit")
    public JAXBElement<LowerLimitType> createLowerLimit(LowerLimitType value) {
        return new JAXBElement<LowerLimitType>(_LowerLimit_QNAME, LowerLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryDateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryDateTime")
    public JAXBElement<DeliveryDateTimeType> createDeliveryDateTime(DeliveryDateTimeType value) {
        return new JAXBElement<DeliveryDateTimeType>(_DeliveryDateTime_QNAME, DeliveryDateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusRequestPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusRequestProperties")
    public JAXBElement<OrderStatusRequestPropertiesType> createOrderStatusRequestProperties(OrderStatusRequestPropertiesType value) {
        return new JAXBElement<OrderStatusRequestPropertiesType>(_OrderStatusRequestProperties_QNAME, OrderStatusRequestPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentSummary")
    public JAXBElement<ReplenishmentSummaryType> createReplenishmentSummary(ReplenishmentSummaryType value) {
        return new JAXBElement<ReplenishmentSummaryType>(_ReplenishmentSummary_QNAME, ReplenishmentSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalChangeBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalChangeBody")
    public JAXBElement<ReplenishmentProposalChangeBodyType> createReplenishmentProposalChangeBody(ReplenishmentProposalChangeBodyType value) {
        return new JAXBElement<ReplenishmentProposalChangeBodyType>(_ReplenishmentProposalChangeBody_QNAME, ReplenishmentProposalChangeBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModeOfTransportationInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ModeOfTransportationInformation")
    public JAXBElement<ModeOfTransportationInformationType> createModeOfTransportationInformation(ModeOfTransportationInformationType value) {
        return new JAXBElement<ModeOfTransportationInformationType>(_ModeOfTransportationInformation_QNAME, ModeOfTransportationInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceIssueDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InvoiceIssueDate")
    public JAXBElement<InvoiceIssueDateType> createInvoiceIssueDate(InvoiceIssueDateType value) {
        return new JAXBElement<InvoiceIssueDateType>(_InvoiceIssueDate_QNAME, InvoiceIssueDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentInstructionsPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentInstructionsProperties")
    public JAXBElement<ShipmentInstructionsPropertiesType> createShipmentInstructionsProperties(ShipmentInstructionsPropertiesType value) {
        return new JAXBElement<ShipmentInstructionsPropertiesType>(_ShipmentInstructionsProperties_QNAME, ShipmentInstructionsPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderMotorPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderMotorPartners")
    public JAXBElement<LoadTenderMotorPartnersType> createLoadTenderMotorPartners(LoadTenderMotorPartnersType value) {
        return new JAXBElement<LoadTenderMotorPartnersType>(_LoadTenderMotorPartners_QNAME, LoadTenderMotorPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ManufacturingIdentificationNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createManufacturingIdentificationNumber(String value) {
        return new JAXBElement<String>(_ManufacturingIdentificationNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestIssuedDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestIssuedDate")
    public JAXBElement<RequestIssuedDateType> createRequestIssuedDate(RequestIssuedDateType value) {
        return new JAXBElement<RequestIssuedDateType>(_RequestIssuedDate_QNAME, RequestIssuedDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryLocation")
    public JAXBElement<InventoryLocationType> createInventoryLocation(InventoryLocationType value) {
        return new JAXBElement<InventoryLocationType>(_InventoryLocation_QNAME, InventoryLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ErrorStatus")
    public JAXBElement<ErrorStatusType> createErrorStatus(ErrorStatusType value) {
        return new JAXBElement<ErrorStatusType>(_ErrorStatus_QNAME, ErrorStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SampleContainer")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSampleContainer(String value) {
        return new JAXBElement<String>(_SampleContainer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RejectReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRejectReason(String value) {
        return new JAXBElement<String>(_RejectReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EffectiveDatesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "EffectiveDates")
    public JAXBElement<EffectiveDatesType> createEffectiveDates(EffectiveDatesType value) {
        return new JAXBElement<EffectiveDatesType>(_EffectiveDates_QNAME, EffectiveDatesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProposalProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProposalProduct")
    public JAXBElement<ProposalProductType> createProposalProduct(ProposalProductType value) {
        return new JAXBElement<ProposalProductType>(_ProposalProduct_QNAME, ProposalProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForecastedProductMovementReportPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ForecastedProductMovementReportProperties")
    public JAXBElement<ForecastedProductMovementReportPropertiesType> createForecastedProductMovementReportProperties(ForecastedProductMovementReportPropertiesType value) {
        return new JAXBElement<ForecastedProductMovementReportPropertiesType>(_ForecastedProductMovementReportProperties_QNAME, ForecastedProductMovementReportPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Company")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCompany(String value) {
        return new JAXBElement<String>(_Company_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "EquipmentDetailsLineNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEquipmentDetailsLineNumber(String value) {
        return new JAXBElement<String>(_EquipmentDetailsLineNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HazardousClassSubsidiaryCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HazardousClassSubsidiaryCode")
    public JAXBElement<HazardousClassSubsidiaryCodeType> createHazardousClassSubsidiaryCode(HazardousClassSubsidiaryCodeType value) {
        return new JAXBElement<HazardousClassSubsidiaryCodeType>(_HazardousClassSubsidiaryCode_QNAME, HazardousClassSubsidiaryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateVolumeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RateVolume")
    public JAXBElement<RateVolumeType> createRateVolume(RateVolumeType value) {
        return new JAXBElement<RateVolumeType>(_RateVolume_QNAME, RateVolumeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MonetaryAmount")
    public JAXBElement<MonetaryAmountType> createMonetaryAmount(MonetaryAmountType value) {
        return new JAXBElement<MonetaryAmountType>(_MonetaryAmount_QNAME, MonetaryAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "EquipmentLoadEmptyStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEquipmentLoadEmptyStatus(String value) {
        return new JAXBElement<String>(_EquipmentLoadEmptyStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespondByDateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RespondByDateTime")
    public JAXBElement<RespondByDateTimeType> createRespondByDateTime(RespondByDateTimeType value) {
        return new JAXBElement<RespondByDateTimeType>(_RespondByDateTime_QNAME, RespondByDateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductClassification")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductClassification(String value) {
        return new JAXBElement<String>(_ProductClassification_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "UnitPrice")
    public JAXBElement<UnitPriceType> createUnitPrice(UnitPriceType value) {
        return new JAXBElement<UnitPriceType>(_UnitPrice_QNAME, UnitPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentStatusPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentStatusProperties")
    public JAXBElement<ShipmentStatusPropertiesType> createShipmentStatusProperties(ShipmentStatusPropertiesType value) {
        return new JAXBElement<ShipmentStatusPropertiesType>(_ShipmentStatusProperties_QNAME, ShipmentStatusPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxableAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TaxableAmount")
    public JAXBElement<TaxableAmountType> createTaxableAmount(TaxableAmountType value) {
        return new JAXBElement<TaxableAmountType>(_TaxableAmount_QNAME, TaxableAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderResponseBody")
    public JAXBElement<LoadTenderResponseBodyType> createLoadTenderResponseBody(LoadTenderResponseBodyType value) {
        return new JAXBElement<LoadTenderResponseBodyType>(_LoadTenderResponseBody_QNAME, LoadTenderResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManufacturerInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ManufacturerInformation")
    public JAXBElement<ManufacturerInformationType> createManufacturerInformation(ManufacturerInformationType value) {
        return new JAXBElement<ManufacturerInformationType>(_ManufacturerInformation_QNAME, ManufacturerInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoadTransportInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RoadTransportInformation")
    public JAXBElement<RoadTransportInformationType> createRoadTransportInformation(RoadTransportInformationType value) {
        return new JAXBElement<RoadTransportInformationType>(_RoadTransportInformation_QNAME, RoadTransportInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadingLevelIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLoadingLevelIndicator(String value) {
        return new JAXBElement<String>(_LoadingLevelIndicator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CidxListLineStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LineStatus")
    public JAXBElement<CidxListLineStatus> createLineStatus(CidxListLineStatus value) {
        return new JAXBElement<CidxListLineStatus>(_LineStatus_QNAME, CidxListLineStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryConfirmationRejectionDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDeliveryConfirmationRejectionDescription(String value) {
        return new JAXBElement<String>(_DeliveryConfirmationRejectionDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipEndDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipEndDate")
    public JAXBElement<ShipEndDateType> createShipEndDate(ShipEndDateType value) {
        return new JAXBElement<ShipEndDateType>(_ShipEndDate_QNAME, ShipEndDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CidxListContractStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractStatus")
    public JAXBElement<CidxListContractStatus> createContractStatus(CidxListContractStatus value) {
        return new JAXBElement<CidxListContractStatus>(_ContractStatus_QNAME, CidxListContractStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContactDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createContactDescription(String value) {
        return new JAXBElement<String>(_ContactDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CustomsInformation")
    public JAXBElement<CustomsInformationType> createCustomsInformation(CustomsInformationType value) {
        return new JAXBElement<CustomsInformationType>(_CustomsInformation_QNAME, CustomsInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Jurisdiction")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createJurisdiction(String value) {
        return new JAXBElement<String>(_Jurisdiction_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipNoticeListRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipNoticeListRequestDetails")
    public JAXBElement<ShipNoticeListRequestDetailsType> createShipNoticeListRequestDetails(ShipNoticeListRequestDetailsType value) {
        return new JAXBElement<ShipNoticeListRequestDetailsType>(_ShipNoticeListRequestDetails_QNAME, ShipNoticeListRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PlanProduct")
    public JAXBElement<PlanProductType> createPlanProduct(PlanProductType value) {
        return new JAXBElement<PlanProductType>(_PlanProduct_QNAME, PlanProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QuoteIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createQuoteIdentifier(String value) {
        return new JAXBElement<String>(_QuoteIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoicePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InvoicePartners")
    public JAXBElement<InvoicePartnersType> createInvoicePartners(InvoicePartnersType value) {
        return new JAXBElement<InvoicePartnersType>(_InvoicePartners_QNAME, InvoicePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentIndicatorCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentIndicatorCode")
    public JAXBElement<ShipmentIndicatorCodeType> createShipmentIndicatorCode(ShipmentIndicatorCodeType value) {
        return new JAXBElement<ShipmentIndicatorCodeType>(_ShipmentIndicatorCode_QNAME, ShipmentIndicatorCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportResponseProperties")
    public JAXBElement<CostSupportResponsePropertiesType> createCostSupportResponseProperties(CostSupportResponsePropertiesType value) {
        return new JAXBElement<CostSupportResponsePropertiesType>(_CostSupportResponseProperties_QNAME, CostSupportResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryConfirmationResponseProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryConfirmationResponseProductLineItem")
    public JAXBElement<DeliveryConfirmationResponseProductLineItemType> createDeliveryConfirmationResponseProductLineItem(DeliveryConfirmationResponseProductLineItemType value) {
        return new JAXBElement<DeliveryConfirmationResponseProductLineItemType>(_DeliveryConfirmationResponseProductLineItem_QNAME, DeliveryConfirmationResponseProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForecastHorizonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ForecastHorizon")
    public JAXBElement<ForecastHorizonType> createForecastHorizon(ForecastHorizonType value) {
        return new JAXBElement<ForecastHorizonType>(_ForecastHorizon_QNAME, ForecastHorizonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowanceChargeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AllowanceChargeList")
    public JAXBElement<AllowanceChargeListType> createAllowanceChargeList(AllowanceChargeListType value) {
        return new JAXBElement<AllowanceChargeListType>(_AllowanceChargeList_QNAME, AllowanceChargeListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LadingIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLadingIdentifier(String value) {
        return new JAXBElement<String>(_LadingIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportAgreementNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportAgreementNumber")
    public JAXBElement<CostSupportAgreementNumberType> createCostSupportAgreementNumber(CostSupportAgreementNumberType value) {
        return new JAXBElement<CostSupportAgreementNumberType>(_CostSupportAgreementNumber_QNAME, CostSupportAgreementNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandForecastResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandForecastResponseDetails")
    public JAXBElement<DemandForecastResponseDetailsType> createDemandForecastResponseDetails(DemandForecastResponseDetailsType value) {
        return new JAXBElement<DemandForecastResponseDetailsType>(_DemandForecastResponseDetails_QNAME, DemandForecastResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "StorageLocation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStorageLocation(String value) {
        return new JAXBElement<String>(_StorageLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalCancelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalCancel")
    public JAXBElement<ReplenishmentProposalCancelType> createReplenishmentProposalCancel(ReplenishmentProposalCancelType value) {
        return new JAXBElement<ReplenishmentProposalCancelType>(_ReplenishmentProposalCancel_QNAME, ReplenishmentProposalCancelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TaxCertificateType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTaxCertificateType(String value) {
        return new JAXBElement<String>(_TaxCertificateType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSpecificCatalogUpdateDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CustomerSpecificCatalogUpdateDetails")
    public JAXBElement<CustomerSpecificCatalogUpdateDetailsType> createCustomerSpecificCatalogUpdateDetails(CustomerSpecificCatalogUpdateDetailsType value) {
        return new JAXBElement<CustomerSpecificCatalogUpdateDetailsType>(_CustomerSpecificCatalogUpdateDetails_QNAME, CustomerSpecificCatalogUpdateDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductLabel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductLabel(String value) {
        return new JAXBElement<String>(_ProductLabel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForecastedProductMovementProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ForecastedProductMovementProductLineItem")
    public JAXBElement<ForecastedProductMovementProductLineItemType> createForecastedProductMovementProductLineItem(ForecastedProductMovementProductLineItemType value) {
        return new JAXBElement<ForecastedProductMovementProductLineItemType>(_ForecastedProductMovementProductLineItem_QNAME, ForecastedProductMovementProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedFirstOrderDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestedFirstOrderDate")
    public JAXBElement<RequestedFirstOrderDateType> createRequestedFirstOrderDate(RequestedFirstOrderDateType value) {
        return new JAXBElement<RequestedFirstOrderDateType>(_RequestedFirstOrderDate_QNAME, RequestedFirstOrderDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalCancelPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalCancelProperties")
    public JAXBElement<ReplenishmentProposalCancelPropertiesType> createReplenishmentProposalCancelProperties(ReplenishmentProposalCancelPropertiesType value) {
        return new JAXBElement<ReplenishmentProposalCancelPropertiesType>(_ReplenishmentProposalCancelProperties_QNAME, ReplenishmentProposalCancelPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitOfMeasureCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "UnitOfMeasureCode")
    public JAXBElement<UnitOfMeasureCodeType> createUnitOfMeasureCode(UnitOfMeasureCodeType value) {
        return new JAXBElement<UnitOfMeasureCodeType>(_UnitOfMeasureCode_QNAME, UnitOfMeasureCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceAndAvailabilityResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceAndAvailabilityResponseBody")
    public JAXBElement<PriceAndAvailabilityResponseBodyType> createPriceAndAvailabilityResponseBody(PriceAndAvailabilityResponseBodyType value) {
        return new JAXBElement<PriceAndAvailabilityResponseBodyType>(_PriceAndAvailabilityResponseBody_QNAME, PriceAndAvailabilityResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForecastedProductMovementTransactionPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ForecastedProductMovementTransactionProperties")
    public JAXBElement<ForecastedProductMovementTransactionPropertiesType> createForecastedProductMovementTransactionProperties(ForecastedProductMovementTransactionPropertiesType value) {
        return new JAXBElement<ForecastedProductMovementTransactionPropertiesType>(_ForecastedProductMovementTransactionProperties_QNAME, ForecastedProductMovementTransactionPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryTerms")
    public JAXBElement<DeliveryTermsType> createDeliveryTerms(DeliveryTermsType value) {
        return new JAXBElement<DeliveryTermsType>(_DeliveryTerms_QNAME, DeliveryTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TariffIdentification")
    public JAXBElement<TariffIdentificationType> createTariffIdentification(TariffIdentificationType value) {
        return new JAXBElement<TariffIdentificationType>(_TariffIdentification_QNAME, TariffIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayableQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PayableQuantity")
    public JAXBElement<PayableQuantityType> createPayableQuantity(PayableQuantityType value) {
        return new JAXBElement<PayableQuantityType>(_PayableQuantity_QNAME, PayableQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryProduct")
    public JAXBElement<DeliveryProductType> createDeliveryProduct(DeliveryProductType value) {
        return new JAXBElement<DeliveryProductType>(_DeliveryProduct_QNAME, DeliveryProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderChangeBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderChangeBody")
    public JAXBElement<OrderChangeBodyType> createOrderChangeBody(OrderChangeBodyType value) {
        return new JAXBElement<OrderChangeBodyType>(_OrderChangeBody_QNAME, OrderChangeBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandPlanIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDemandPlanIdentifier(String value) {
        return new JAXBElement<String>(_DemandPlanIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandPlanType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandPlan")
    public JAXBElement<DemandPlanType> createDemandPlan(DemandPlanType value) {
        return new JAXBElement<DemandPlanType>(_DemandPlan_QNAME, DemandPlanType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConveyanceInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ConveyanceInformation")
    public JAXBElement<ConveyanceInformationType> createConveyanceInformation(ConveyanceInformationType value) {
        return new JAXBElement<ConveyanceInformationType>(_ConveyanceInformation_QNAME, ConveyanceInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxOrDutyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TaxOrDuty")
    public JAXBElement<TaxOrDutyType> createTaxOrDuty(TaxOrDutyType value) {
        return new JAXBElement<TaxOrDutyType>(_TaxOrDuty_QNAME, TaxOrDutyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusListResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusListResponse")
    public JAXBElement<OrderStatusListResponseType> createOrderStatusListResponse(OrderStatusListResponseType value) {
        return new JAXBElement<OrderStatusListResponseType>(_OrderStatusListResponse_QNAME, OrderStatusListResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalChangePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalChangePartners")
    public JAXBElement<ReplenishmentProposalChangePartnersType> createReplenishmentProposalChangePartners(ReplenishmentProposalChangePartnersType value) {
        return new JAXBElement<ReplenishmentProposalChangePartnersType>(_ReplenishmentProposalChangePartners_QNAME, ReplenishmentProposalChangePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SampleNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSampleNumber(String value) {
        return new JAXBElement<String>(_SampleNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmedPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ConfirmedPrice")
    public JAXBElement<ConfirmedPriceType> createConfirmedPrice(ConfirmedPriceType value) {
        return new JAXBElement<ConfirmedPriceType>(_ConfirmedPrice_QNAME, ConfirmedPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderRailProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderRailProductLineItem")
    public JAXBElement<LoadTenderRailProductLineItemType> createLoadTenderRailProductLineItem(LoadTenderRailProductLineItemType value) {
        return new JAXBElement<LoadTenderRailProductLineItemType>(_LoadTenderRailProductLineItem_QNAME, LoadTenderRailProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedPickupDateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestedPickupDateTime")
    public JAXBElement<RequestedPickupDateTimeType> createRequestedPickupDateTime(RequestedPickupDateTimeType value) {
        return new JAXBElement<RequestedPickupDateTimeType>(_RequestedPickupDateTime_QNAME, RequestedPickupDateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ListPrice")
    public JAXBElement<ListPriceType> createListPrice(ListPriceType value) {
        return new JAXBElement<ListPriceType>(_ListPrice_QNAME, ListPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TaxCertificateNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTaxCertificateNumber(String value) {
        return new JAXBElement<String>(_TaxCertificateNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderChangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderChange")
    public JAXBElement<OrderChangeType> createOrderChange(OrderChangeType value) {
        return new JAXBElement<OrderChangeType>(_OrderChange_QNAME, OrderChangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpperLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "UpperLimit")
    public JAXBElement<UpperLimitType> createUpperLimit(UpperLimitType value) {
        return new JAXBElement<UpperLimitType>(_UpperLimit_QNAME, UpperLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContainerDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createContainerDescription(String value) {
        return new JAXBElement<String>(_ContainerDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandPlanPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandPlanProperties")
    public JAXBElement<DemandPlanPropertiesType> createDemandPlanProperties(DemandPlanPropertiesType value) {
        return new JAXBElement<DemandPlanPropertiesType>(_DemandPlanProperties_QNAME, DemandPlanPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesOrderIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SalesOrderIdentifier")
    public JAXBElement<SalesOrderIdentifierType> createSalesOrderIdentifier(SalesOrderIdentifierType value) {
        return new JAXBElement<SalesOrderIdentifierType>(_SalesOrderIdentifier_QNAME, SalesOrderIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalLineItem")
    public JAXBElement<ReplenishmentProposalLineItemType> createReplenishmentProposalLineItem(ReplenishmentProposalLineItemType value) {
        return new JAXBElement<ReplenishmentProposalLineItemType>(_ReplenishmentProposalLineItem_QNAME, ReplenishmentProposalLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingCreateLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingCreateLineItem")
    public JAXBElement<PostingCreateLineItemType> createPostingCreateLineItem(PostingCreateLineItemType value) {
        return new JAXBElement<PostingCreateLineItemType>(_PostingCreateLineItem_QNAME, PostingCreateLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryReceiptResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryReceiptResponseBody")
    public JAXBElement<DeliveryReceiptResponseBodyType> createDeliveryReceiptResponseBody(DeliveryReceiptResponseBodyType value) {
        return new JAXBElement<DeliveryReceiptResponseBodyType>(_DeliveryReceiptResponseBody_QNAME, DeliveryReceiptResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedQuoteResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestedQuoteResponse")
    public JAXBElement<RequestedQuoteResponseType> createRequestedQuoteResponse(RequestedQuoteResponseType value) {
        return new JAXBElement<RequestedQuoteResponseType>(_RequestedQuoteResponse_QNAME, RequestedQuoteResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThirdPartyLaboratoryDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ThirdPartyLaboratoryDetail")
    public JAXBElement<ThirdPartyLaboratoryDetailType> createThirdPartyLaboratoryDetail(ThirdPartyLaboratoryDetailType value) {
        return new JAXBElement<ThirdPartyLaboratoryDetailType>(_ThirdPartyLaboratoryDetail_QNAME, ThirdPartyLaboratoryDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudienceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Audience")
    public JAXBElement<AudienceType> createAudience(AudienceType value) {
        return new JAXBElement<AudienceType>(_Audience_QNAME, AudienceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SourceContainer")
    public JAXBElement<SourceContainerType> createSourceContainer(SourceContainerType value) {
        return new JAXBElement<SourceContainerType>(_SourceContainer_QNAME, SourceContainerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipNoticeStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createShipNoticeStatus(String value) {
        return new JAXBElement<String>(_ShipNoticeStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FromType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "From")
    public JAXBElement<FromType> createFrom(FromType value) {
        return new JAXBElement<FromType>(_From_QNAME, FromType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BatchNumber")
    public JAXBElement<BatchNumberType> createBatchNumber(BatchNumberType value) {
        return new JAXBElement<BatchNumberType>(_BatchNumber_QNAME, BatchNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BidInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BidInformation")
    public JAXBElement<BidInformationType> createBidInformation(BidInformationType value) {
        return new JAXBElement<BidInformationType>(_BidInformation_QNAME, BidInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "To")
    public JAXBElement<ToType> createTo(ToType value) {
        return new JAXBElement<ToType>(_To_QNAME, ToType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentDetailBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentDetailBody")
    public JAXBElement<PaymentDetailBodyType> createPaymentDetailBody(PaymentDetailBodyType value) {
        return new JAXBElement<PaymentDetailBodyType>(_PaymentDetailBody_QNAME, PaymentDetailBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipNoticeListRequestBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipNoticeListRequestBody")
    public JAXBElement<ShipNoticeListRequestBodyType> createShipNoticeListRequestBody(ShipNoticeListRequestBodyType value) {
        return new JAXBElement<ShipNoticeListRequestBodyType>(_ShipNoticeListRequestBody_QNAME, ShipNoticeListRequestBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "UnloadingSequence")
    public JAXBElement<BigInteger> createUnloadingSequence(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnloadingSequence_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderCreateBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderCreateBody")
    public JAXBElement<OrderCreateBodyType> createOrderCreateBody(OrderCreateBodyType value) {
        return new JAXBElement<OrderCreateBodyType>(_OrderCreateBody_QNAME, OrderCreateBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrderInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PurchaseOrderInformation")
    public JAXBElement<PurchaseOrderInformationType> createPurchaseOrderInformation(PurchaseOrderInformationType value) {
        return new JAXBElement<PurchaseOrderInformationType>(_PurchaseOrderInformation_QNAME, PurchaseOrderInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderResponse")
    public JAXBElement<OrderResponseType> createOrderResponse(OrderResponseType value) {
        return new JAXBElement<OrderResponseType>(_OrderResponse_QNAME, OrderResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadBuildingMotorPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadBuildingMotorPartners")
    public JAXBElement<LoadBuildingMotorPartnersType> createLoadBuildingMotorPartners(LoadBuildingMotorPartnersType value) {
        return new JAXBElement<LoadBuildingMotorPartnersType>(_LoadBuildingMotorPartners_QNAME, LoadBuildingMotorPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FullDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFullDescription(String value) {
        return new JAXBElement<String>(_FullDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalResponseDetails")
    public JAXBElement<ReplenishmentProposalResponseDetailsType> createReplenishmentProposalResponseDetails(ReplenishmentProposalResponseDetailsType value) {
        return new JAXBElement<ReplenishmentProposalResponseDetailsType>(_ReplenishmentProposalResponseDetails_QNAME, ReplenishmentProposalResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentResponsePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentResponsePartners")
    public JAXBElement<PaymentResponsePartnersType> createPaymentResponsePartners(PaymentResponsePartnersType value) {
        return new JAXBElement<PaymentResponsePartnersType>(_PaymentResponsePartners_QNAME, PaymentResponsePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalChangePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalChangeProperties")
    public JAXBElement<ReplenishmentProposalChangePropertiesType> createReplenishmentProposalChangeProperties(ReplenishmentProposalChangePropertiesType value) {
        return new JAXBElement<ReplenishmentProposalChangePropertiesType>(_ReplenishmentProposalChangeProperties_QNAME, ReplenishmentProposalChangePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptanceNotificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AcceptanceNotification")
    public JAXBElement<AcceptanceNotificationType> createAcceptanceNotification(AcceptanceNotificationType value) {
        return new JAXBElement<AcceptanceNotificationType>(_AcceptanceNotification_QNAME, AcceptanceNotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingStatusResponseLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingStatusResponseLineItem")
    public JAXBElement<PostingStatusResponseLineItemType> createPostingStatusResponseLineItem(PostingStatusResponseLineItemType value) {
        return new JAXBElement<PostingStatusResponseLineItemType>(_PostingStatusResponseLineItem_QNAME, PostingStatusResponseLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualificationResponsePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QualificationResponsePartners")
    public JAXBElement<QualificationResponsePartnersType> createQualificationResponsePartners(QualificationResponsePartnersType value) {
        return new JAXBElement<QualificationResponsePartnersType>(_QualificationResponsePartners_QNAME, QualificationResponsePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractDateRangesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractDateRanges")
    public JAXBElement<ContractDateRangesType> createContractDateRanges(ContractDateRangesType value) {
        return new JAXBElement<ContractDateRangesType>(_ContractDateRanges_QNAME, ContractDateRangesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PortOfTranshipmentAllowed")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPortOfTranshipmentAllowed(String value) {
        return new JAXBElement<String>(_PortOfTranshipmentAllowed_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationalInstructionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OperationalInstructions")
    public JAXBElement<OperationalInstructionsType> createOperationalInstructions(OperationalInstructionsType value) {
        return new JAXBElement<OperationalInstructionsType>(_OperationalInstructions_QNAME, OperationalInstructionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostBoxNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPostBoxNumber(String value) {
        return new JAXBElement<String>(_PostBoxNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductMovementReportBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductMovementReportBody")
    public JAXBElement<ProductMovementReportBodyType> createProductMovementReportBody(ProductMovementReportBodyType value) {
        return new JAXBElement<ProductMovementReportBodyType>(_ProductMovementReportBody_QNAME, ProductMovementReportBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SplitBillingPartnerPercentage")
    public JAXBElement<BigDecimal> createSplitBillingPartnerPercentage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SplitBillingPartnerPercentage_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CidxListLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LocationType")
    public JAXBElement<CidxListLocationType> createLocationType(CidxListLocationType value) {
        return new JAXBElement<CidxListLocationType>(_LocationType_QNAME, CidxListLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MarketingName")
    public JAXBElement<MarketingNameType> createMarketingName(MarketingNameType value) {
        return new JAXBElement<MarketingNameType>(_MarketingName_QNAME, MarketingNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductSpecificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductSpecification")
    public JAXBElement<ProductSpecificationType> createProductSpecification(ProductSpecificationType value) {
        return new JAXBElement<ProductSpecificationType>(_ProductSpecification_QNAME, ProductSpecificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ImportLicenseAvailableFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createImportLicenseAvailableFlag(String value) {
        return new JAXBElement<String>(_ImportLicenseAvailableFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellerAccountDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SellerAccountDetails")
    public JAXBElement<SellerAccountDetailsType> createSellerAccountDetails(SellerAccountDetailsType value) {
        return new JAXBElement<SellerAccountDetailsType>(_SellerAccountDetails_QNAME, SellerAccountDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualificationStatusInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QualificationStatusInformation")
    public JAXBElement<QualificationStatusInformationType> createQualificationStatusInformation(QualificationStatusInformationType value) {
        return new JAXBElement<QualificationStatusInformationType>(_QualificationStatusInformation_QNAME, QualificationStatusInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimaryCurrencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PrimaryCurrency")
    public JAXBElement<PrimaryCurrencyType> createPrimaryCurrency(PrimaryCurrencyType value) {
        return new JAXBElement<PrimaryCurrencyType>(_PrimaryCurrency_QNAME, PrimaryCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightBillTotalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FreightBillTotal")
    public JAXBElement<FreightBillTotalType> createFreightBillTotal(FreightBillTotalType value) {
        return new JAXBElement<FreightBillTotalType>(_FreightBillTotal_QNAME, FreightBillTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReferenceInformation")
    public JAXBElement<ReferenceInformationType> createReferenceInformation(ReferenceInformationType value) {
        return new JAXBElement<ReferenceInformationType>(_ReferenceInformation_QNAME, ReferenceInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClosingDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ClosingDate")
    public JAXBElement<ClosingDateType> createClosingDate(ClosingDateType value) {
        return new JAXBElement<ClosingDateType>(_ClosingDate_QNAME, ClosingDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Originator")
    public JAXBElement<OriginatorType> createOriginator(OriginatorType value) {
        return new JAXBElement<OriginatorType>(_Originator_QNAME, OriginatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LineItemRequestedAction")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLineItemRequestedAction(String value) {
        return new JAXBElement<String>(_LineItemRequestedAction_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandPlanResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandPlanResponseProperties")
    public JAXBElement<DemandPlanResponsePropertiesType> createDemandPlanResponseProperties(DemandPlanResponsePropertiesType value) {
        return new JAXBElement<DemandPlanResponsePropertiesType>(_DemandPlanResponseProperties_QNAME, DemandPlanResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReferenceIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReferenceIdentifier(String value) {
        return new JAXBElement<String>(_ReferenceIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InvoiceNumber")
    public JAXBElement<InvoiceNumberType> createInvoiceNumber(InvoiceNumberType value) {
        return new JAXBElement<InvoiceNumberType>(_InvoiceNumber_QNAME, InvoiceNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryConfirmationResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryConfirmationResponse")
    public JAXBElement<DeliveryConfirmationResponseType> createDeliveryConfirmationResponse(DeliveryConfirmationResponseType value) {
        return new JAXBElement<DeliveryConfirmationResponseType>(_DeliveryConfirmationResponse_QNAME, DeliveryConfirmationResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyPlanPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SupplyPlanPartners")
    public JAXBElement<SupplyPlanPartnersType> createSupplyPlanPartners(SupplyPlanPartnersType value) {
        return new JAXBElement<SupplyPlanPartnersType>(_SupplyPlanPartners_QNAME, SupplyPlanPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "County")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCounty(String value) {
        return new JAXBElement<String>(_County_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MeasurementRange")
    public JAXBElement<MeasurementRangeType> createMeasurementRange(MeasurementRangeType value) {
        return new JAXBElement<MeasurementRangeType>(_MeasurementRange_QNAME, MeasurementRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SealNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSealNumber(String value) {
        return new JAXBElement<String>(_SealNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceModifierUp")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPriceModifierUp(String value) {
        return new JAXBElement<String>(_PriceModifierUp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyPlanResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SupplyPlanResponseBody")
    public JAXBElement<SupplyPlanResponseBodyType> createSupplyPlanResponseBody(SupplyPlanResponseBodyType value) {
        return new JAXBElement<SupplyPlanResponseBodyType>(_SupplyPlanResponseBody_QNAME, SupplyPlanResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExemptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Exemption")
    public JAXBElement<ExemptionType> createExemption(ExemptionType value) {
        return new JAXBElement<ExemptionType>(_Exemption_QNAME, ExemptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TaxLocation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTaxLocation(String value) {
        return new JAXBElement<String>(_TaxLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingCreatePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingCreateProperties")
    public JAXBElement<PostingCreatePropertiesType> createPostingCreateProperties(PostingCreatePropertiesType value) {
        return new JAXBElement<PostingCreatePropertiesType>(_PostingCreateProperties_QNAME, PostingCreatePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingCreateBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingCreateBody")
    public JAXBElement<PostingCreateBodyType> createPostingCreateBody(PostingCreateBodyType value) {
        return new JAXBElement<PostingCreateBodyType>(_PostingCreateBody_QNAME, PostingCreateBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BargeType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBargeType(String value) {
        return new JAXBElement<String>(_BargeType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TechnicalName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTechnicalName(String value) {
        return new JAXBElement<String>(_TechnicalName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestForQuotePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestForQuoteProperties")
    public JAXBElement<RequestForQuotePropertiesType> createRequestForQuoteProperties(RequestForQuotePropertiesType value) {
        return new JAXBElement<RequestForQuotePropertiesType>(_RequestForQuoteProperties_QNAME, RequestForQuotePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoldToType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SoldTo")
    public JAXBElement<SoldToType> createSoldTo(SoldToType value) {
        return new JAXBElement<SoldToType>(_SoldTo_QNAME, SoldToType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TransportStepNumber")
    public JAXBElement<BigInteger> createTransportStepNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_TransportStepNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeographicLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "GeographicLocation")
    public JAXBElement<GeographicLocationType> createGeographicLocation(GeographicLocationType value) {
        return new JAXBElement<GeographicLocationType>(_GeographicLocation_QNAME, GeographicLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetDistributorCostType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "NetDistributorCost")
    public JAXBElement<NetDistributorCostType> createNetDistributorCost(NetDistributorCostType value) {
        return new JAXBElement<NetDistributorCostType>(_NetDistributorCost_QNAME, NetDistributorCostType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShelfLifeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShelfLife")
    public JAXBElement<ShelfLifeType> createShelfLife(ShelfLifeType value) {
        return new JAXBElement<ShelfLifeType>(_ShelfLife_QNAME, ShelfLifeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceZoneGeographyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceZoneGeography")
    public JAXBElement<PriceZoneGeographyType> createPriceZoneGeography(PriceZoneGeographyType value) {
        return new JAXBElement<PriceZoneGeographyType>(_PriceZoneGeography_QNAME, PriceZoneGeographyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandForecastBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandForecastBody")
    public JAXBElement<DemandForecastBodyType> createDemandForecastBody(DemandForecastBodyType value) {
        return new JAXBElement<DemandForecastBodyType>(_DemandForecastBody_QNAME, DemandForecastBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightBillDateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FreightBillDateTime")
    public JAXBElement<FreightBillDateTimeType> createFreightBillDateTime(FreightBillDateTimeType value) {
        return new JAXBElement<FreightBillDateTimeType>(_FreightBillDateTime_QNAME, FreightBillDateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForecastType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Forecast")
    public JAXBElement<ForecastType> createForecast(ForecastType value) {
        return new JAXBElement<ForecastType>(_Forecast_QNAME, ForecastType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SupplyDate")
    public JAXBElement<SupplyDateType> createSupplyDate(SupplyDateType value) {
        return new JAXBElement<SupplyDateType>(_SupplyDate_QNAME, SupplyDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceSheetInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceSheetInformation")
    public JAXBElement<PriceSheetInformationType> createPriceSheetInformation(PriceSheetInformationType value) {
        return new JAXBElement<PriceSheetInformationType>(_PriceSheetInformation_QNAME, PriceSheetInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ExemptionReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createExemptionReason(String value) {
        return new JAXBElement<String>(_ExemptionReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PackagingStackability")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPackagingStackability(String value) {
        return new JAXBElement<String>(_PackagingStackability_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QualificationStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createQualificationStatus(String value) {
        return new JAXBElement<String>(_QualificationStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotAvailableInCountryCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "NotAvailableInCountryCode")
    public JAXBElement<NotAvailableInCountryCodeType> createNotAvailableInCountryCode(NotAvailableInCountryCodeType value) {
        return new JAXBElement<NotAvailableInCountryCodeType>(_NotAvailableInCountryCode_QNAME, NotAvailableInCountryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InvoiceType")
    public JAXBElement<InvoiceTypeType> createInvoiceType(InvoiceTypeType value) {
        return new JAXBElement<InvoiceTypeType>(_InvoiceType_QNAME, InvoiceTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InvoiceResponse")
    public JAXBElement<InvoiceResponseType> createInvoiceResponse(InvoiceResponseType value) {
        return new JAXBElement<InvoiceResponseType>(_InvoiceResponse_QNAME, InvoiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PurchaseOrderLineItemNumber")
    public JAXBElement<BigInteger> createPurchaseOrderLineItemNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_PurchaseOrderLineItemNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalResponseProperties")
    public JAXBElement<ReplenishmentProposalResponsePropertiesType> createReplenishmentProposalResponseProperties(ReplenishmentProposalResponsePropertiesType value) {
        return new JAXBElement<ReplenishmentProposalResponsePropertiesType>(_ReplenishmentProposalResponseProperties_QNAME, ReplenishmentProposalResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderOceanType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderOcean")
    public JAXBElement<LoadTenderOceanType> createLoadTenderOcean(LoadTenderOceanType value) {
        return new JAXBElement<LoadTenderOceanType>(_LoadTenderOcean_QNAME, LoadTenderOceanType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestForCreditReferenceNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestForCreditReferenceNumber")
    public JAXBElement<RequestForCreditReferenceNumberType> createRequestForCreditReferenceNumber(RequestForCreditReferenceNumberType value) {
        return new JAXBElement<RequestForCreditReferenceNumberType>(_RequestForCreditReferenceNumber_QNAME, RequestForCreditReferenceNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CidxListTransactionSetPurposeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TransactionSetPurpose")
    public JAXBElement<CidxListTransactionSetPurposeType> createTransactionSetPurpose(CidxListTransactionSetPurposeType value) {
        return new JAXBElement<CidxListTransactionSetPurposeType>(_TransactionSetPurpose_QNAME, CidxListTransactionSetPurposeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReceiptSummary")
    public JAXBElement<ReceiptSummaryType> createReceiptSummary(ReceiptSummaryType value) {
        return new JAXBElement<ReceiptSummaryType>(_ReceiptSummary_QNAME, ReceiptSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoosePackageCountQuantity")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLoosePackageCountQuantity(String value) {
        return new JAXBElement<String>(_LoosePackageCountQuantity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RebateInKindQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RebateInKindQuantity")
    public JAXBElement<RebateInKindQuantityType> createRebateInKindQuantity(RebateInKindQuantityType value) {
        return new JAXBElement<RebateInKindQuantityType>(_RebateInKindQuantity_QNAME, RebateInKindQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanHorizonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PlanHorizon")
    public JAXBElement<PlanHorizonType> createPlanHorizon(PlanHorizonType value) {
        return new JAXBElement<PlanHorizonType>(_PlanHorizon_QNAME, PlanHorizonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForecastedProductMovementTransactionPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ForecastedProductMovementTransactionPartners")
    public JAXBElement<ForecastedProductMovementTransactionPartnersType> createForecastedProductMovementTransactionPartners(ForecastedProductMovementTransactionPartnersType value) {
        return new JAXBElement<ForecastedProductMovementTransactionPartnersType>(_ForecastedProductMovementTransactionPartners_QNAME, ForecastedProductMovementTransactionPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyerContractInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BuyerContractInformation")
    public JAXBElement<BuyerContractInformationType> createBuyerContractInformation(BuyerContractInformationType value) {
        return new JAXBElement<BuyerContractInformationType>(_BuyerContractInformation_QNAME, BuyerContractInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThresholdLimitValueSTELType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ThresholdLimitValueSTEL")
    public JAXBElement<ThresholdLimitValueSTELType> createThresholdLimitValueSTEL(ThresholdLimitValueSTELType value) {
        return new JAXBElement<ThresholdLimitValueSTELType>(_ThresholdLimitValueSTEL_QNAME, ThresholdLimitValueSTELType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShippingLeadTime")
    public JAXBElement<BigInteger> createShippingLeadTime(BigInteger value) {
        return new JAXBElement<BigInteger>(_ShippingLeadTime_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InvoiceDate")
    public JAXBElement<InvoiceDateType> createInvoiceDate(InvoiceDateType value) {
        return new JAXBElement<InvoiceDateType>(_InvoiceDate_QNAME, InvoiceDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentStatusDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentStatusDetails")
    public JAXBElement<ShipmentStatusDetailsType> createShipmentStatusDetails(ShipmentStatusDetailsType value) {
        return new JAXBElement<ShipmentStatusDetailsType>(_ShipmentStatusDetails_QNAME, ShipmentStatusDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentDate")
    public JAXBElement<PaymentDateType> createPaymentDate(PaymentDateType value) {
        return new JAXBElement<PaymentDateType>(_PaymentDate_QNAME, PaymentDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceivingConditionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReceivingCondition")
    public JAXBElement<ReceivingConditionType> createReceivingCondition(ReceivingConditionType value) {
        return new JAXBElement<ReceivingConditionType>(_ReceivingCondition_QNAME, ReceivingConditionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentStopType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createShipmentStopType(String value) {
        return new JAXBElement<String>(_ShipmentStopType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceSheetBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceSheetBody")
    public JAXBElement<PriceSheetBodyType> createPriceSheetBody(PriceSheetBodyType value) {
        return new JAXBElement<PriceSheetBodyType>(_PriceSheetBody_QNAME, PriceSheetBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalCreditRequestedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TotalCreditRequested")
    public JAXBElement<TotalCreditRequestedType> createTotalCreditRequested(TotalCreditRequestedType value) {
        return new JAXBElement<TotalCreditRequestedType>(_TotalCreditRequested_QNAME, TotalCreditRequestedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ActualValue")
    public JAXBElement<ActualValueType> createActualValue(ActualValueType value) {
        return new JAXBElement<ActualValueType>(_ActualValue_QNAME, ActualValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingAcceptResponseLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingAcceptResponseLineItem")
    public JAXBElement<PostingAcceptResponseLineItemType> createPostingAcceptResponseLineItem(PostingAcceptResponseLineItemType value) {
        return new JAXBElement<PostingAcceptResponseLineItemType>(_PostingAcceptResponseLineItem_QNAME, PostingAcceptResponseLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentStatusReasonCodeDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createShipmentStatusReasonCodeDescription(String value) {
        return new JAXBElement<String>(_ShipmentStatusReasonCodeDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryUsageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryUsage")
    public JAXBElement<InventoryUsageType> createInventoryUsage(InventoryUsageType value) {
        return new JAXBElement<InventoryUsageType>(_InventoryUsage_QNAME, InventoryUsageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WidthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Width")
    public JAXBElement<WidthType> createWidth(WidthType value) {
        return new JAXBElement<WidthType>(_Width_QNAME, WidthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolumetricInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "VolumetricInformation")
    public JAXBElement<VolumetricInformationType> createVolumetricInformation(VolumetricInformationType value) {
        return new JAXBElement<VolumetricInformationType>(_VolumetricInformation_QNAME, VolumetricInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductFamilyName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductFamilyName(String value) {
        return new JAXBElement<String>(_ProductFamilyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasurementInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MeasurementInformation")
    public JAXBElement<MeasurementInformationType> createMeasurementInformation(MeasurementInformationType value) {
        return new JAXBElement<MeasurementInformationType>(_MeasurementInformation_QNAME, MeasurementInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "StatusInformation")
    public JAXBElement<StatusInformationType> createStatusInformation(StatusInformationType value) {
        return new JAXBElement<StatusInformationType>(_StatusInformation_QNAME, StatusInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadBuildingResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadBuildingResponse")
    public JAXBElement<LoadBuildingResponseType> createLoadBuildingResponse(LoadBuildingResponseType value) {
        return new JAXBElement<LoadBuildingResponseType>(_LoadBuildingResponse_QNAME, LoadBuildingResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeightAllowanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "WeightAllowance")
    public JAXBElement<WeightAllowanceType> createWeightAllowance(WeightAllowanceType value) {
        return new JAXBElement<WeightAllowanceType>(_WeightAllowance_QNAME, WeightAllowanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CidxListContractTypeCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractResponseTypeCode")
    public JAXBElement<CidxListContractTypeCode> createContractResponseTypeCode(CidxListContractTypeCode value) {
        return new JAXBElement<CidxListContractTypeCode>(_ContractResponseTypeCode_QNAME, CidxListContractTypeCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThisDocumentDateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ThisDocumentDateTime")
    public JAXBElement<ThisDocumentDateTimeType> createThisDocumentDateTime(ThisDocumentDateTimeType value) {
        return new JAXBElement<ThisDocumentDateTimeType>(_ThisDocumentDateTime_QNAME, ThisDocumentDateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandPlanResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandPlanResponseBody")
    public JAXBElement<DemandPlanResponseBodyType> createDemandPlanResponseBody(DemandPlanResponseBodyType value) {
        return new JAXBElement<DemandPlanResponseBodyType>(_DemandPlanResponseBody_QNAME, DemandPlanResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingNumber")
    public JAXBElement<PostingNumberType> createPostingNumber(PostingNumberType value) {
        return new JAXBElement<PostingNumberType>(_PostingNumber_QNAME, PostingNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DensityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Density")
    public JAXBElement<DensityType> createDensity(DensityType value) {
        return new JAXBElement<DensityType>(_Density_QNAME, DensityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryUsageActualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryUsageActual")
    public JAXBElement<InventoryUsageActualType> createInventoryUsageActual(InventoryUsageActualType value) {
        return new JAXBElement<InventoryUsageActualType>(_InventoryUsageActual_QNAME, InventoryUsageActualType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MonetaryValue")
    public JAXBElement<BigDecimal> createMonetaryValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MonetaryValue_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpperExplosionLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "UpperExplosionLimit")
    public JAXBElement<UpperExplosionLimitType> createUpperExplosionLimit(UpperExplosionLimitType value) {
        return new JAXBElement<UpperExplosionLimitType>(_UpperExplosionLimit_QNAME, UpperExplosionLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Length")
    public JAXBElement<LengthType> createLength(LengthType value) {
        return new JAXBElement<LengthType>(_Length_QNAME, LengthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsignmentPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ConsignmentPartners")
    public JAXBElement<ConsignmentPartnersType> createConsignmentPartners(ConsignmentPartnersType value) {
        return new JAXBElement<ConsignmentPartnersType>(_ConsignmentPartners_QNAME, ConsignmentPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SplitFactor")
    public JAXBElement<BigDecimal> createSplitFactor(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SplitFactor_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRateDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ExchangeRateDate")
    public JAXBElement<ExchangeRateDateType> createExchangeRateDate(ExchangeRateDateType value) {
        return new JAXBElement<ExchangeRateDateType>(_ExchangeRateDate_QNAME, ExchangeRateDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReceiverSequenceNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReceiverSequenceNumber(String value) {
        return new JAXBElement<String>(_ReceiverSequenceNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadBuildingResponsePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadBuildingResponsePartners")
    public JAXBElement<LoadBuildingResponsePartnersType> createLoadBuildingResponsePartners(LoadBuildingResponsePartnersType value) {
        return new JAXBElement<LoadBuildingResponsePartnersType>(_LoadBuildingResponsePartners_QNAME, LoadBuildingResponsePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FromUnitOfMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FromUnitOfMeasure")
    public JAXBElement<FromUnitOfMeasureType> createFromUnitOfMeasure(FromUnitOfMeasureType value) {
        return new JAXBElement<FromUnitOfMeasureType>(_FromUnitOfMeasure_QNAME, FromUnitOfMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductMovementTransactionPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductMovementTransactionProperties")
    public JAXBElement<ProductMovementTransactionPropertiesType> createProductMovementTransactionProperties(ProductMovementTransactionPropertiesType value) {
        return new JAXBElement<ProductMovementTransactionPropertiesType>(_ProductMovementTransactionProperties_QNAME, ProductMovementTransactionPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractResponseProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractResponseProductLineItem")
    public JAXBElement<ContractResponseProductLineItemType> createContractResponseProductLineItem(ContractResponseProductLineItemType value) {
        return new JAXBElement<ContractResponseProductLineItemType>(_ContractResponseProductLineItem_QNAME, ContractResponseProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportResponse")
    public JAXBElement<CostSupportResponseType> createCostSupportResponse(CostSupportResponseType value) {
        return new JAXBElement<CostSupportResponseType>(_CostSupportResponse_QNAME, CostSupportResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryConfirmationPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryConfirmationPartners")
    public JAXBElement<DeliveryConfirmationPartnersType> createDeliveryConfirmationPartners(DeliveryConfirmationPartnersType value) {
        return new JAXBElement<DeliveryConfirmationPartnersType>(_DeliveryConfirmationPartners_QNAME, DeliveryConfirmationPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitConversionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "UnitConversions")
    public JAXBElement<UnitConversionsType> createUnitConversions(UnitConversionsType value) {
        return new JAXBElement<UnitConversionsType>(_UnitConversions_QNAME, UnitConversionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForecastProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ForecastProduct")
    public JAXBElement<ForecastProductType> createForecastProduct(ForecastProductType value) {
        return new JAXBElement<ForecastProductType>(_ForecastProduct_QNAME, ForecastProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TaxIdentifierNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTaxIdentifierNumber(String value) {
        return new JAXBElement<String>(_TaxIdentifierNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarinePollutantCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MarinePollutantCode")
    public JAXBElement<MarinePollutantCodeType> createMarinePollutantCode(MarinePollutantCodeType value) {
        return new JAXBElement<MarinePollutantCodeType>(_MarinePollutantCode_QNAME, MarinePollutantCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TaxRate")
    public JAXBElement<BigDecimal> createTaxRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TaxRate_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TermsOfSaleDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTermsOfSaleDescription(String value) {
        return new JAXBElement<String>(_TermsOfSaleDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductInformation")
    public JAXBElement<ProductInformationType> createProductInformation(ProductInformationType value) {
        return new JAXBElement<ProductInformationType>(_ProductInformation_QNAME, ProductInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportCreditRequestPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportCreditRequestProperties")
    public JAXBElement<CostSupportCreditRequestPropertiesType> createCostSupportCreditRequestProperties(CostSupportCreditRequestPropertiesType value) {
        return new JAXBElement<CostSupportCreditRequestPropertiesType>(_CostSupportCreditRequestProperties_QNAME, CostSupportCreditRequestPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipNoticeListRequestPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipNoticeListRequestProperties")
    public JAXBElement<ShipNoticeListRequestPropertiesType> createShipNoticeListRequestProperties(ShipNoticeListRequestPropertiesType value) {
        return new JAXBElement<ShipNoticeListRequestPropertiesType>(_ShipNoticeListRequestProperties_QNAME, ShipNoticeListRequestPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipFromType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipFrom")
    public JAXBElement<ShipFromType> createShipFrom(ShipFromType value) {
        return new JAXBElement<ShipFromType>(_ShipFrom_QNAME, ShipFromType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportCreditRequestPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportCreditRequestPartners")
    public JAXBElement<CostSupportCreditRequestPartnersType> createCostSupportCreditRequestPartners(CostSupportCreditRequestPartnersType value) {
        return new JAXBElement<CostSupportCreditRequestPartnersType>(_CostSupportCreditRequestPartners_QNAME, CostSupportCreditRequestPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightBillType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FreightBill")
    public JAXBElement<FreightBillType> createFreightBill(FreightBillType value) {
        return new JAXBElement<FreightBillType>(_FreightBill_QNAME, FreightBillType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupportedSellingPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SupportedSellingPrice")
    public JAXBElement<SupportedSellingPriceType> createSupportedSellingPrice(SupportedSellingPriceType value) {
        return new JAXBElement<SupportedSellingPriceType>(_SupportedSellingPrice_QNAME, SupportedSellingPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SpecialProvisionNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSpecialProvisionNumber(String value) {
        return new JAXBElement<String>(_SpecialProvisionNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportDocumentInstructionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TransportDocumentInstructions")
    public JAXBElement<TransportDocumentInstructionsType> createTransportDocumentInstructions(TransportDocumentInstructionsType value) {
        return new JAXBElement<TransportDocumentInstructionsType>(_TransportDocumentInstructions_QNAME, TransportDocumentInstructionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestForQuoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestForQuote")
    public JAXBElement<RequestForQuoteType> createRequestForQuote(RequestForQuoteType value) {
        return new JAXBElement<RequestForQuoteType>(_RequestForQuote_QNAME, RequestForQuoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneGeographyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ZoneGeography")
    public JAXBElement<ZoneGeographyType> createZoneGeography(ZoneGeographyType value) {
        return new JAXBElement<ZoneGeographyType>(_ZoneGeography_QNAME, ZoneGeographyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingAcceptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingAccept")
    public JAXBElement<PostingAcceptType> createPostingAccept(PostingAcceptType value) {
        return new JAXBElement<PostingAcceptType>(_PostingAccept_QNAME, PostingAcceptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContactNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createContactNumber(String value) {
        return new JAXBElement<String>(_ContactNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptanceNotificationBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AcceptanceNotificationBody")
    public JAXBElement<AcceptanceNotificationBodyType> createAcceptanceNotificationBody(AcceptanceNotificationBodyType value) {
        return new JAXBElement<AcceptanceNotificationBodyType>(_AcceptanceNotificationBody_QNAME, AcceptanceNotificationBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadBuildingMotorDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadBuildingMotorDetails")
    public JAXBElement<LoadBuildingMotorDetailsType> createLoadBuildingMotorDetails(LoadBuildingMotorDetailsType value) {
        return new JAXBElement<LoadBuildingMotorDetailsType>(_LoadBuildingMotorDetails_QNAME, LoadBuildingMotorDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTermsBasisDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentTermsBasisDate")
    public JAXBElement<PaymentTermsBasisDateType> createPaymentTermsBasisDate(PaymentTermsBasisDateType value) {
        return new JAXBElement<PaymentTermsBasisDateType>(_PaymentTermsBasisDate_QNAME, PaymentTermsBasisDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadBuildingResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadBuildingResponseDetails")
    public JAXBElement<LoadBuildingResponseDetailsType> createLoadBuildingResponseDetails(LoadBuildingResponseDetailsType value) {
        return new JAXBElement<LoadBuildingResponseDetailsType>(_LoadBuildingResponseDetails_QNAME, LoadBuildingResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AddressLine")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAddressLine(String value) {
        return new JAXBElement<String>(_AddressLine_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxAmountTotalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TaxAmountTotal")
    public JAXBElement<TaxAmountTotalType> createTaxAmountTotal(TaxAmountTotalType value) {
        return new JAXBElement<TaxAmountTotalType>(_TaxAmountTotal_QNAME, TaxAmountTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceAndAvailabilityRequestBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceAndAvailabilityRequestBody")
    public JAXBElement<PriceAndAvailabilityRequestBodyType> createPriceAndAvailabilityRequestBody(PriceAndAvailabilityRequestBodyType value) {
        return new JAXBElement<PriceAndAvailabilityRequestBodyType>(_PriceAndAvailabilityRequestBody_QNAME, PriceAndAvailabilityRequestBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PlannedEndUse")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPlannedEndUse(String value) {
        return new JAXBElement<String>(_PlannedEndUse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsCostInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CustomsCostInformation")
    public JAXBElement<CustomsCostInformationType> createCustomsCostInformation(CustomsCostInformationType value) {
        return new JAXBElement<CustomsCostInformationType>(_CustomsCostInformation_QNAME, CustomsCostInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportResponseStatusInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportResponseStatusInformation")
    public JAXBElement<CostSupportResponseStatusInformationType> createCostSupportResponseStatusInformation(CostSupportResponseStatusInformationType value) {
        return new JAXBElement<CostSupportResponseStatusInformationType>(_CostSupportResponseStatusInformation_QNAME, CostSupportResponseStatusInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HazardousIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HazardousIdentification")
    public JAXBElement<HazardousIdentificationType> createHazardousIdentification(HazardousIdentificationType value) {
        return new JAXBElement<HazardousIdentificationType>(_HazardousIdentification_QNAME, HazardousIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CHRISCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CHRISCode")
    public JAXBElement<CHRISCodeType> createCHRISCode(CHRISCodeType value) {
        return new JAXBElement<CHRISCodeType>(_CHRISCode_QNAME, CHRISCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductSubLineItemsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductSubLineItems")
    public JAXBElement<ProductSubLineItemsType> createProductSubLineItems(ProductSubLineItemsType value) {
        return new JAXBElement<ProductSubLineItemsType>(_ProductSubLineItems_QNAME, ProductSubLineItemsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractProperties")
    public JAXBElement<ContractPropertiesType> createContractProperties(ContractPropertiesType value) {
        return new JAXBElement<ContractPropertiesType>(_ContractProperties_QNAME, ContractPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FreightBillType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFreightBillType(String value) {
        return new JAXBElement<String>(_FreightBillType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LocationIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLocationIdentifier(String value) {
        return new JAXBElement<String>(_LocationIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipDate")
    public JAXBElement<ShipDateType> createShipDate(ShipDateType value) {
        return new JAXBElement<ShipDateType>(_ShipDate_QNAME, ShipDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractResponsePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractResponsePartners")
    public JAXBElement<ContractResponsePartnersType> createContractResponsePartners(ContractResponsePartnersType value) {
        return new JAXBElement<ContractResponsePartnersType>(_ContractResponsePartners_QNAME, ContractResponsePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSpecificCatalogUpdatePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CustomerSpecificCatalogUpdatePartners")
    public JAXBElement<CustomerSpecificCatalogUpdatePartnersType> createCustomerSpecificCatalogUpdatePartners(CustomerSpecificCatalogUpdatePartnersType value) {
        return new JAXBElement<CustomerSpecificCatalogUpdatePartnersType>(_CustomerSpecificCatalogUpdatePartners_QNAME, CustomerSpecificCatalogUpdatePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "NonExemptionReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNonExemptionReason(String value) {
        return new JAXBElement<String>(_NonExemptionReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaximumSalesVolumeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MaximumSalesVolume")
    public JAXBElement<MaximumSalesVolumeType> createMaximumSalesVolume(MaximumSalesVolumeType value) {
        return new JAXBElement<MaximumSalesVolumeType>(_MaximumSalesVolume_QNAME, MaximumSalesVolumeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptNoticeBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReceiptNoticeBody")
    public JAXBElement<ReceiptNoticeBodyType> createReceiptNoticeBody(ReceiptNoticeBodyType value) {
        return new JAXBElement<ReceiptNoticeBodyType>(_ReceiptNoticeBody_QNAME, ReceiptNoticeBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptNoticePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReceiptNoticeProperties")
    public JAXBElement<ReceiptNoticePropertiesType> createReceiptNoticeProperties(ReceiptNoticePropertiesType value) {
        return new JAXBElement<ReceiptNoticePropertiesType>(_ReceiptNoticeProperties_QNAME, ReceiptNoticePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualificationResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QualificationResponseBody")
    public JAXBElement<QualificationResponseBodyType> createQualificationResponseBody(QualificationResponseBodyType value) {
        return new JAXBElement<QualificationResponseBodyType>(_QualificationResponseBody_QNAME, QualificationResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeOfDayRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TimeOfDayRange")
    public JAXBElement<TimeOfDayRangeType> createTimeOfDayRange(TimeOfDayRangeType value) {
        return new JAXBElement<TimeOfDayRangeType>(_TimeOfDayRange_QNAME, TimeOfDayRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KinematicViscosityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "KinematicViscosity")
    public JAXBElement<KinematicViscosityType> createKinematicViscosity(KinematicViscosityType value) {
        return new JAXBElement<KinematicViscosityType>(_KinematicViscosity_QNAME, KinematicViscosityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipNoticeDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipNoticeDate")
    public JAXBElement<ShipNoticeDateType> createShipNoticeDate(ShipNoticeDateType value) {
        return new JAXBElement<ShipNoticeDateType>(_ShipNoticeDate_QNAME, ShipNoticeDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceAndAvailabilityRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceAndAvailabilityRequestDetails")
    public JAXBElement<PriceAndAvailabilityRequestDetailsType> createPriceAndAvailabilityRequestDetails(PriceAndAvailabilityRequestDetailsType value) {
        return new JAXBElement<PriceAndAvailabilityRequestDetailsType>(_PriceAndAvailabilityRequestDetails_QNAME, PriceAndAvailabilityRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadingSequence")
    public JAXBElement<BigInteger> createLoadingSequence(BigInteger value) {
        return new JAXBElement<BigInteger>(_LoadingSequence_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentDetailLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentDetailLineItem")
    public JAXBElement<PaymentDetailLineItemType> createPaymentDetailLineItem(PaymentDetailLineItemType value) {
        return new JAXBElement<PaymentDetailLineItemType>(_PaymentDetailLineItem_QNAME, PaymentDetailLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptanceNotificationPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AcceptanceNotificationPartners")
    public JAXBElement<AcceptanceNotificationPartnersType> createAcceptanceNotificationPartners(AcceptanceNotificationPartnersType value) {
        return new JAXBElement<AcceptanceNotificationPartnersType>(_AcceptanceNotificationPartners_QNAME, AcceptanceNotificationPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PricingPercentage")
    public JAXBElement<BigDecimal> createPricingPercentage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PricingPercentage_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryPoint")
    public JAXBElement<DeliveryPointType> createDeliveryPoint(DeliveryPointType value) {
        return new JAXBElement<DeliveryPointType>(_DeliveryPoint_QNAME, DeliveryPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmationNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ConfirmationNumber")
    public JAXBElement<ConfirmationNumberType> createConfirmationNumber(ConfirmationNumberType value) {
        return new JAXBElement<ConfirmationNumberType>(_ConfirmationNumber_QNAME, ConfirmationNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeightType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Weight")
    public JAXBElement<WeightType> createWeight(WeightType value) {
        return new JAXBElement<WeightType>(_Weight_QNAME, WeightType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RiskCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RiskCode")
    public JAXBElement<RiskCodeType> createRiskCode(RiskCodeType value) {
        return new JAXBElement<RiskCodeType>(_RiskCode_QNAME, RiskCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AdditionalInformation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAdditionalInformation(String value) {
        return new JAXBElement<String>(_AdditionalInformation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractIssuedDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractIssuedDate")
    public JAXBElement<ContractIssuedDateType> createContractIssuedDate(ContractIssuedDateType value) {
        return new JAXBElement<ContractIssuedDateType>(_ContractIssuedDate_QNAME, ContractIssuedDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForecastedProductMovementTransactionDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ForecastedProductMovementTransactionDetails")
    public JAXBElement<ForecastedProductMovementTransactionDetailsType> createForecastedProductMovementTransactionDetails(ForecastedProductMovementTransactionDetailsType value) {
        return new JAXBElement<ForecastedProductMovementTransactionDetailsType>(_ForecastedProductMovementTransactionDetails_QNAME, ForecastedProductMovementTransactionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdjustmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Adjustment")
    public JAXBElement<AdjustmentType> createAdjustment(AdjustmentType value) {
        return new JAXBElement<AdjustmentType>(_Adjustment_QNAME, AdjustmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingAcceptLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingAcceptLineItem")
    public JAXBElement<PostingAcceptLineItemType> createPostingAcceptLineItem(PostingAcceptLineItemType value) {
        return new JAXBElement<PostingAcceptLineItemType>(_PostingAcceptLineItem_QNAME, PostingAcceptLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MarpolCategory")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMarpolCategory(String value) {
        return new JAXBElement<String>(_MarpolCategory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "StandardIndustrialClassificationNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStandardIndustrialClassificationNumber(String value) {
        return new JAXBElement<String>(_StandardIndustrialClassificationNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderResponseProperties")
    public JAXBElement<LoadTenderResponsePropertiesType> createLoadTenderResponseProperties(LoadTenderResponsePropertiesType value) {
        return new JAXBElement<LoadTenderResponsePropertiesType>(_LoadTenderResponseProperties_QNAME, LoadTenderResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SupplyPlanIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSupplyPlanIdentifier(String value) {
        return new JAXBElement<String>(_SupplyPlanIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusListResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusListResponseDetails")
    public JAXBElement<OrderStatusListResponseDetailsType> createOrderStatusListResponseDetails(OrderStatusListResponseDetailsType value) {
        return new JAXBElement<OrderStatusListResponseDetailsType>(_OrderStatusListResponseDetails_QNAME, OrderStatusListResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Resolution")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createResolution(String value) {
        return new JAXBElement<String>(_Resolution_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryGroup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDeliveryGroup(String value) {
        return new JAXBElement<String>(_DeliveryGroup_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestForQuoteBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestForQuoteBody")
    public JAXBElement<RequestForQuoteBodyType> createRequestForQuoteBody(RequestForQuoteBodyType value) {
        return new JAXBElement<RequestForQuoteBodyType>(_RequestForQuoteBody_QNAME, RequestForQuoteBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateOfAnalysisBatchDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CertificateOfAnalysisBatchDetail")
    public JAXBElement<CertificateOfAnalysisBatchDetailType> createCertificateOfAnalysisBatchDetail(CertificateOfAnalysisBatchDetailType value) {
        return new JAXBElement<CertificateOfAnalysisBatchDetailType>(_CertificateOfAnalysisBatchDetail_QNAME, CertificateOfAnalysisBatchDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Contract")
    public JAXBElement<ContractType> createContract(ContractType value) {
        return new JAXBElement<ContractType>(_Contract_QNAME, ContractType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HazardousMarkingNotation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createHazardousMarkingNotation(String value) {
        return new JAXBElement<String>(_HazardousMarkingNotation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CurrencyCode")
    public JAXBElement<CurrencyCodeType> createCurrencyCode(CurrencyCodeType value) {
        return new JAXBElement<CurrencyCodeType>(_CurrencyCode_QNAME, CurrencyCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Penalty")
    public JAXBElement<BigDecimal> createPenalty(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Penalty_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipStartDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipStartDate")
    public JAXBElement<ShipStartDateType> createShipStartDate(ShipStartDateType value) {
        return new JAXBElement<ShipStartDateType>(_ShipStartDate_QNAME, ShipStartDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingInstructionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingInstructions")
    public JAXBElement<PostingInstructionsType> createPostingInstructions(PostingInstructionsType value) {
        return new JAXBElement<PostingInstructionsType>(_PostingInstructions_QNAME, PostingInstructionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandForecastPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandForecastPartners")
    public JAXBElement<DemandForecastPartnersType> createDemandForecastPartners(DemandForecastPartnersType value) {
        return new JAXBElement<DemandForecastPartnersType>(_DemandForecastPartners_QNAME, DemandForecastPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EULabelingRegulationsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "EULabelingRegulations")
    public JAXBElement<EULabelingRegulationsType> createEULabelingRegulations(EULabelingRegulationsType value) {
        return new JAXBElement<EULabelingRegulationsType>(_EULabelingRegulations_QNAME, EULabelingRegulationsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorderExitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BorderExit")
    public JAXBElement<BorderExitType> createBorderExit(BorderExitType value) {
        return new JAXBElement<BorderExitType>(_BorderExit_QNAME, BorderExitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AllowanceChargeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAllowanceChargeID(String value) {
        return new JAXBElement<String>(_AllowanceChargeID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PSNSupplement")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPSNSupplement(String value) {
        return new JAXBElement<String>(_PSNSupplement_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandForecastResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandForecastResponseProperties")
    public JAXBElement<DemandForecastResponsePropertiesType> createDemandForecastResponseProperties(DemandForecastResponsePropertiesType value) {
        return new JAXBElement<DemandForecastResponsePropertiesType>(_DemandForecastResponseProperties_QNAME, DemandForecastResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusListRequestPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusListRequestProperties")
    public JAXBElement<OrderStatusListRequestPropertiesType> createOrderStatusListRequestProperties(OrderStatusListRequestPropertiesType value) {
        return new JAXBElement<OrderStatusListRequestPropertiesType>(_OrderStatusListRequestProperties_QNAME, OrderStatusListRequestPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryOtherType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryOther")
    public JAXBElement<InventoryOtherType> createInventoryOther(InventoryOtherType value) {
        return new JAXBElement<InventoryOtherType>(_InventoryOther_QNAME, InventoryOtherType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandForecastType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandForecast")
    public JAXBElement<DemandForecastType> createDemandForecast(DemandForecastType value) {
        return new JAXBElement<DemandForecastType>(_DemandForecast_QNAME, DemandForecastType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillToType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BillTo")
    public JAXBElement<BillToType> createBillTo(BillToType value) {
        return new JAXBElement<BillToType>(_BillTo_QNAME, BillToType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualitativeResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QualitativeResult")
    public JAXBElement<QualitativeResultType> createQualitativeResult(QualitativeResultType value) {
        return new JAXBElement<QualitativeResultType>(_QualitativeResult_QNAME, QualitativeResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReverseChargeFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReverseChargeFlag(String value) {
        return new JAXBElement<String>(_ReverseChargeFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ZoneID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createZoneID(String value) {
        return new JAXBElement<String>(_ZoneID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderNumber")
    public JAXBElement<LoadTenderNumberType> createLoadTenderNumber(LoadTenderNumberType value) {
        return new JAXBElement<LoadTenderNumberType>(_LoadTenderNumber_QNAME, LoadTenderNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadBuildingMotorPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadBuildingMotorProperties")
    public JAXBElement<LoadBuildingMotorPropertiesType> createLoadBuildingMotorProperties(LoadBuildingMotorPropertiesType value) {
        return new JAXBElement<LoadBuildingMotorPropertiesType>(_LoadBuildingMotorProperties_QNAME, LoadBuildingMotorPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderChangePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderChangeProperties")
    public JAXBElement<OrderChangePropertiesType> createOrderChangeProperties(OrderChangePropertiesType value) {
        return new JAXBElement<OrderChangePropertiesType>(_OrderChangeProperties_QNAME, OrderChangePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AdditionalHandlingInformation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAdditionalHandlingInformation(String value) {
        return new JAXBElement<String>(_AdditionalHandlingInformation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderRailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderRail")
    public JAXBElement<LoadTenderRailType> createLoadTenderRail(LoadTenderRailType value) {
        return new JAXBElement<LoadTenderRailType>(_LoadTenderRail_QNAME, LoadTenderRailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HazardousFormattedTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HazardousFormattedText")
    public JAXBElement<HazardousFormattedTextType> createHazardousFormattedText(HazardousFormattedTextType value) {
        return new JAXBElement<HazardousFormattedTextType>(_HazardousFormattedText_QNAME, HazardousFormattedTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Amount")
    public JAXBElement<AmountType> createAmount(AmountType value) {
        return new JAXBElement<AmountType>(_Amount_QNAME, AmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentRecipientPartnerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DocumentRecipientPartner")
    public JAXBElement<DocumentRecipientPartnerType> createDocumentRecipientPartner(DocumentRecipientPartnerType value) {
        return new JAXBElement<DocumentRecipientPartnerType>(_DocumentRecipientPartner_QNAME, DocumentRecipientPartnerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelativeDueDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RelativeDueDate")
    public JAXBElement<RelativeDueDateType> createRelativeDueDate(RelativeDueDateType value) {
        return new JAXBElement<RelativeDueDateType>(_RelativeDueDate_QNAME, RelativeDueDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Buyer")
    public JAXBElement<BuyerType> createBuyer(BuyerType value) {
        return new JAXBElement<BuyerType>(_Buyer_QNAME, BuyerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TaxableFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTaxableFlag(String value) {
        return new JAXBElement<String>(_TaxableFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TestResult")
    public JAXBElement<TestResultType> createTestResult(TestResultType value) {
        return new JAXBElement<TestResultType>(_TestResult_QNAME, TestResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InvoiceBody")
    public JAXBElement<InvoiceBodyType> createInvoiceBody(InvoiceBodyType value) {
        return new JAXBElement<InvoiceBodyType>(_InvoiceBody_QNAME, InvoiceBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedShipDateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestedShipDateTime")
    public JAXBElement<RequestedShipDateTimeType> createRequestedShipDateTime(RequestedShipDateTimeType value) {
        return new JAXBElement<RequestedShipDateTimeType>(_RequestedShipDateTime_QNAME, RequestedShipDateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Routing")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRouting(String value) {
        return new JAXBElement<String>(_Routing_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DocumentReference")
    public JAXBElement<DocumentReferenceType> createDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_DocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingResponseDetails")
    public JAXBElement<PostingResponseDetailsType> createPostingResponseDetails(PostingResponseDetailsType value) {
        return new JAXBElement<PostingResponseDetailsType>(_PostingResponseDetails_QNAME, PostingResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalRequest")
    public JAXBElement<ReplenishmentProposalRequestType> createReplenishmentProposalRequest(ReplenishmentProposalRequestType value) {
        return new JAXBElement<ReplenishmentProposalRequestType>(_ReplenishmentProposalRequest_QNAME, ReplenishmentProposalRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryTolerancesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryTolerances")
    public JAXBElement<DeliveryTolerancesType> createDeliveryTolerances(DeliveryTolerancesType value) {
        return new JAXBElement<DeliveryTolerancesType>(_DeliveryTolerances_QNAME, DeliveryTolerancesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingAvailabilityDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShippingAvailabilityDate")
    public JAXBElement<ShippingAvailabilityDateType> createShippingAvailabilityDate(ShippingAvailabilityDateType value) {
        return new JAXBElement<ShippingAvailabilityDateType>(_ShippingAvailabilityDate_QNAME, ShippingAvailabilityDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LineItemDebitCreditIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLineItemDebitCreditIndicator(String value) {
        return new JAXBElement<String>(_LineItemDebitCreditIndicator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "IncidentCategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIncidentCategoryCode(String value) {
        return new JAXBElement<String>(_IncidentCategoryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ResponseInformation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createResponseInformation(String value) {
        return new JAXBElement<String>(_ResponseInformation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedPackagingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestedPackaging")
    public JAXBElement<RequestedPackagingType> createRequestedPackaging(RequestedPackagingType value) {
        return new JAXBElement<RequestedPackagingType>(_RequestedPackaging_QNAME, RequestedPackagingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTermsGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentTermsGroup")
    public JAXBElement<PaymentTermsGroupType> createPaymentTermsGroup(PaymentTermsGroupType value) {
        return new JAXBElement<PaymentTermsGroupType>(_PaymentTermsGroup_QNAME, PaymentTermsGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequisitionTypeCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequisitionTypeCode")
    public JAXBElement<RequisitionTypeCodeType> createRequisitionTypeCode(RequisitionTypeCodeType value) {
        return new JAXBElement<RequisitionTypeCodeType>(_RequisitionTypeCode_QNAME, RequisitionTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusResponse")
    public JAXBElement<OrderStatusResponseType> createOrderStatusResponse(OrderStatusResponseType value) {
        return new JAXBElement<OrderStatusResponseType>(_OrderStatusResponse_QNAME, OrderStatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarrierEquipmentCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CarrierEquipmentCode")
    public JAXBElement<CarrierEquipmentCodeType> createCarrierEquipmentCode(CarrierEquipmentCodeType value) {
        return new JAXBElement<CarrierEquipmentCodeType>(_CarrierEquipmentCode_QNAME, CarrierEquipmentCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandForecastResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandForecastResponse")
    public JAXBElement<DemandForecastResponseType> createDemandForecastResponse(DemandForecastResponseType value) {
        return new JAXBElement<DemandForecastResponseType>(_DemandForecastResponse_QNAME, DemandForecastResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateOfAnalysisPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CertificateOfAnalysisPartners")
    public JAXBElement<CertificateOfAnalysisPartnersType> createCertificateOfAnalysisPartners(CertificateOfAnalysisPartnersType value) {
        return new JAXBElement<CertificateOfAnalysisPartnersType>(_CertificateOfAnalysisPartners_QNAME, CertificateOfAnalysisPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarineTransportInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MarineTransportInformation")
    public JAXBElement<MarineTransportInformationType> createMarineTransportInformation(MarineTransportInformationType value) {
        return new JAXBElement<MarineTransportInformationType>(_MarineTransportInformation_QNAME, MarineTransportInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportPerUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportPerUnit")
    public JAXBElement<CostSupportPerUnitType> createCostSupportPerUnit(CostSupportPerUnitType value) {
        return new JAXBElement<CostSupportPerUnitType>(_CostSupportPerUnit_QNAME, CostSupportPerUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingResponseProperties")
    public JAXBElement<PostingResponsePropertiesType> createPostingResponseProperties(PostingResponsePropertiesType value) {
        return new JAXBElement<PostingResponsePropertiesType>(_PostingResponseProperties_QNAME, PostingResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CharacteristicDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCharacteristicDescription(String value) {
        return new JAXBElement<String>(_CharacteristicDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalRequestPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalRequestProperties")
    public JAXBElement<ReplenishmentProposalRequestPropertiesType> createReplenishmentProposalRequestProperties(ReplenishmentProposalRequestPropertiesType value) {
        return new JAXBElement<ReplenishmentProposalRequestPropertiesType>(_ReplenishmentProposalRequestProperties_QNAME, ReplenishmentProposalRequestPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PlanQuantity")
    public JAXBElement<PlanQuantityType> createPlanQuantity(PlanQuantityType value) {
        return new JAXBElement<PlanQuantityType>(_PlanQuantity_QNAME, PlanQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductDescription(String value) {
        return new JAXBElement<String>(_ProductDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryActualUsageResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryActualUsageResponseDetails")
    public JAXBElement<InventoryActualUsageResponseDetailsType> createInventoryActualUsageResponseDetails(InventoryActualUsageResponseDetailsType value) {
        return new JAXBElement<InventoryActualUsageResponseDetailsType>(_InventoryActualUsageResponseDetails_QNAME, InventoryActualUsageResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "NumberPackagingUnits")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNumberPackagingUnits(String value) {
        return new JAXBElement<String>(_NumberPackagingUnits_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleDateTimeInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ScheduleDateTimeInformation")
    public JAXBElement<ScheduleDateTimeInformationType> createScheduleDateTimeInformation(ScheduleDateTimeInformationType value) {
        return new JAXBElement<ScheduleDateTimeInformationType>(_ScheduleDateTimeInformation_QNAME, ScheduleDateTimeInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonExemptTotalsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "NonExemptTotals")
    public JAXBElement<NonExemptTotalsType> createNonExemptTotals(NonExemptTotalsType value) {
        return new JAXBElement<NonExemptTotalsType>(_NonExemptTotals_QNAME, NonExemptTotalsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyRateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CurrencyRate")
    public JAXBElement<CurrencyRateType> createCurrencyRate(CurrencyRateType value) {
        return new JAXBElement<CurrencyRateType>(_CurrencyRate_QNAME, CurrencyRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ZoneName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createZoneName(String value) {
        return new JAXBElement<String>(_ZoneName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentTermsID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPaymentTermsID(String value) {
        return new JAXBElement<String>(_PaymentTermsID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscountsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Discounts")
    public JAXBElement<DiscountsType> createDiscounts(DiscountsType value) {
        return new JAXBElement<DiscountsType>(_Discounts_QNAME, DiscountsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryActualUsageDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryActualUsageDetails")
    public JAXBElement<InventoryActualUsageDetailsType> createInventoryActualUsageDetails(InventoryActualUsageDetailsType value) {
        return new JAXBElement<InventoryActualUsageDetailsType>(_InventoryActualUsageDetails_QNAME, InventoryActualUsageDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ChemicalAbstractsServiceRegistryNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createChemicalAbstractsServiceRegistryNumber(String value) {
        return new JAXBElement<String>(_ChemicalAbstractsServiceRegistryNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderMotorBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderMotorBody")
    public JAXBElement<LoadTenderMotorBodyType> createLoadTenderMotorBody(LoadTenderMotorBodyType value) {
        return new JAXBElement<LoadTenderMotorBodyType>(_LoadTenderMotorBody_QNAME, LoadTenderMotorBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CustomerRequestedDeliveryHoldFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomerRequestedDeliveryHoldFlag(String value) {
        return new JAXBElement<String>(_CustomerRequestedDeliveryHoldFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceAndAvailabilityRequestProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceAndAvailabilityRequestProductLineItem")
    public JAXBElement<PriceAndAvailabilityRequestProductLineItemType> createPriceAndAvailabilityRequestProductLineItem(PriceAndAvailabilityRequestProductLineItemType value) {
        return new JAXBElement<PriceAndAvailabilityRequestProductLineItemType>(_PriceAndAvailabilityRequestProductLineItem_QNAME, PriceAndAvailabilityRequestProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistributorCostType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DistributorCost")
    public JAXBElement<DistributorCostType> createDistributorCost(DistributorCostType value) {
        return new JAXBElement<DistributorCostType>(_DistributorCost_QNAME, DistributorCostType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HazardousReportableQuantityIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createHazardousReportableQuantityIndicator(String value) {
        return new JAXBElement<String>(_HazardousReportableQuantityIndicator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarrierWeightsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CarrierWeights")
    public JAXBElement<CarrierWeightsType> createCarrierWeights(CarrierWeightsType value) {
        return new JAXBElement<CarrierWeightsType>(_CarrierWeights_QNAME, CarrierWeightsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SplitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Split")
    public JAXBElement<SplitType> createSplit(SplitType value) {
        return new JAXBElement<SplitType>(_Split_QNAME, SplitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderRailPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderRailPartners")
    public JAXBElement<LoadTenderRailPartnersType> createLoadTenderRailPartners(LoadTenderRailPartnersType value) {
        return new JAXBElement<LoadTenderRailPartnersType>(_LoadTenderRailPartners_QNAME, LoadTenderRailPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NFPACodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "NFPACode")
    public JAXBElement<NFPACodeType> createNFPACode(NFPACodeType value) {
        return new JAXBElement<NFPACodeType>(_NFPACode_QNAME, NFPACodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PartnerInformation")
    public JAXBElement<PartnerInformationType> createPartnerInformation(PartnerInformationType value) {
        return new JAXBElement<PartnerInformationType>(_PartnerInformation_QNAME, PartnerInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryReceiptResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryReceiptResponse")
    public JAXBElement<DeliveryReceiptResponseType> createDeliveryReceiptResponse(DeliveryReceiptResponseType value) {
        return new JAXBElement<DeliveryReceiptResponseType>(_DeliveryReceiptResponse_QNAME, DeliveryReceiptResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DangerousSubstanceHandlingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DangerousSubstanceHandling")
    public JAXBElement<DangerousSubstanceHandlingType> createDangerousSubstanceHandling(DangerousSubstanceHandlingType value) {
        return new JAXBElement<DangerousSubstanceHandlingType>(_DangerousSubstanceHandling_QNAME, DangerousSubstanceHandlingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InlandWaterTransportInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InlandWaterTransportInformation")
    public JAXBElement<InlandWaterTransportInformationType> createInlandWaterTransportInformation(InlandWaterTransportInformationType value) {
        return new JAXBElement<InlandWaterTransportInformationType>(_InlandWaterTransportInformation_QNAME, InlandWaterTransportInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateOfAnalysisDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CertificateOfAnalysisDetails")
    public JAXBElement<CertificateOfAnalysisDetailsType> createCertificateOfAnalysisDetails(CertificateOfAnalysisDetailsType value) {
        return new JAXBElement<CertificateOfAnalysisDetailsType>(_CertificateOfAnalysisDetails_QNAME, CertificateOfAnalysisDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityTestingReportDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QualityTestingReportDetails")
    public JAXBElement<QualityTestingReportDetailsType> createQualityTestingReportDetails(QualityTestingReportDetailsType value) {
        return new JAXBElement<QualityTestingReportDetailsType>(_QualityTestingReportDetails_QNAME, QualityTestingReportDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPostingType(String value) {
        return new JAXBElement<String>(_PostingType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductMovementTransactionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductMovementTransactions")
    public JAXBElement<ProductMovementTransactionsType> createProductMovementTransactions(ProductMovementTransactionsType value) {
        return new JAXBElement<ProductMovementTransactionsType>(_ProductMovementTransactions_QNAME, ProductMovementTransactionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCatalogUpdatePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductCatalogUpdateProperties")
    public JAXBElement<ProductCatalogUpdatePropertiesType> createProductCatalogUpdateProperties(ProductCatalogUpdatePropertiesType value) {
        return new JAXBElement<ProductCatalogUpdatePropertiesType>(_ProductCatalogUpdateProperties_QNAME, ProductCatalogUpdatePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportCreditResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportCreditResponseProperties")
    public JAXBElement<CostSupportCreditResponsePropertiesType> createCostSupportCreditResponseProperties(CostSupportCreditResponsePropertiesType value) {
        return new JAXBElement<CostSupportCreditResponsePropertiesType>(_CostSupportCreditResponseProperties_QNAME, CostSupportCreditResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SafetyPhraseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SafetyPhrase")
    public JAXBElement<SafetyPhraseType> createSafetyPhrase(SafetyPhraseType value) {
        return new JAXBElement<SafetyPhraseType>(_SafetyPhrase_QNAME, SafetyPhraseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PartnerName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPartnerName(String value) {
        return new JAXBElement<String>(_PartnerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCardExpirationDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CreditCardExpirationDate")
    public JAXBElement<CreditCardExpirationDateType> createCreditCardExpirationDate(CreditCardExpirationDateType value) {
        return new JAXBElement<CreditCardExpirationDateType>(_CreditCardExpirationDate_QNAME, CreditCardExpirationDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryContent")
    public JAXBElement<DeliveryContentType> createDeliveryContent(DeliveryContentType value) {
        return new JAXBElement<DeliveryContentType>(_DeliveryContent_QNAME, DeliveryContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandPlanResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandPlanResponseDetails")
    public JAXBElement<DemandPlanResponseDetailsType> createDemandPlanResponseDetails(DemandPlanResponseDetailsType value) {
        return new JAXBElement<DemandPlanResponseDetailsType>(_DemandPlanResponseDetails_QNAME, DemandPlanResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LetterOfCreditInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LetterOfCreditInformation")
    public JAXBElement<LetterOfCreditInformationType> createLetterOfCreditInformation(LetterOfCreditInformationType value) {
        return new JAXBElement<LetterOfCreditInformationType>(_LetterOfCreditInformation_QNAME, LetterOfCreditInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyPlanResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SupplyPlanResponseDetails")
    public JAXBElement<SupplyPlanResponseDetailsType> createSupplyPlanResponseDetails(SupplyPlanResponseDetailsType value) {
        return new JAXBElement<SupplyPlanResponseDetailsType>(_SupplyPlanResponseDetails_QNAME, SupplyPlanResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateOfAnalysisPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CertificateOfAnalysisProperties")
    public JAXBElement<CertificateOfAnalysisPropertiesType> createCertificateOfAnalysisProperties(CertificateOfAnalysisPropertiesType value) {
        return new JAXBElement<CertificateOfAnalysisPropertiesType>(_CertificateOfAnalysisProperties_QNAME, CertificateOfAnalysisPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportRequestChangeBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportRequestChangeBody")
    public JAXBElement<CostSupportRequestChangeBodyType> createCostSupportRequestChangeBody(CostSupportRequestChangeBodyType value) {
        return new JAXBElement<CostSupportRequestChangeBodyType>(_CostSupportRequestChangeBody_QNAME, CostSupportRequestChangeBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceAndAvailabilityResponsePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceAndAvailabilityResponsePartners")
    public JAXBElement<PriceAndAvailabilityResponsePartnersType> createPriceAndAvailabilityResponsePartners(PriceAndAvailabilityResponsePartnersType value) {
        return new JAXBElement<PriceAndAvailabilityResponsePartnersType>(_PriceAndAvailabilityResponsePartners_QNAME, PriceAndAvailabilityResponsePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusResponsePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusResponsePartners")
    public JAXBElement<OrderStatusResponsePartnersType> createOrderStatusResponsePartners(OrderStatusResponsePartnersType value) {
        return new JAXBElement<OrderStatusResponsePartnersType>(_OrderStatusResponsePartners_QNAME, OrderStatusResponsePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketPlaceDocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MarketPlaceDocumentReference")
    public JAXBElement<MarketPlaceDocumentReferenceType> createMarketPlaceDocumentReference(MarketPlaceDocumentReferenceType value) {
        return new JAXBElement<MarketPlaceDocumentReferenceType>(_MarketPlaceDocumentReference_QNAME, MarketPlaceDocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Tariff")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTariff(String value) {
        return new JAXBElement<String>(_Tariff_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManufactureDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ManufactureDate")
    public JAXBElement<ManufactureDateType> createManufactureDate(ManufactureDateType value) {
        return new JAXBElement<ManufactureDateType>(_ManufactureDate_QNAME, ManufactureDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderResponseProperties")
    public JAXBElement<OrderResponsePropertiesType> createOrderResponseProperties(OrderResponsePropertiesType value) {
        return new JAXBElement<OrderResponsePropertiesType>(_OrderResponseProperties_QNAME, OrderResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberOfUnitsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "NumberOfUnits")
    public JAXBElement<NumberOfUnitsType> createNumberOfUnits(NumberOfUnitsType value) {
        return new JAXBElement<NumberOfUnitsType>(_NumberOfUnits_QNAME, NumberOfUnitsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AcceptanceNotificationIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAcceptanceNotificationIdentifier(String value) {
        return new JAXBElement<String>(_AcceptanceNotificationIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompatibilityGroupCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CompatibilityGroupCode")
    public JAXBElement<CompatibilityGroupCodeType> createCompatibilityGroupCode(CompatibilityGroupCodeType value) {
        return new JAXBElement<CompatibilityGroupCodeType>(_CompatibilityGroupCode_QNAME, CompatibilityGroupCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistributorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Distributor")
    public JAXBElement<DistributorType> createDistributor(DistributorType value) {
        return new JAXBElement<DistributorType>(_Distributor_QNAME, DistributorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductAttributeNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductAttributeName")
    public JAXBElement<ProductAttributeNameType> createProductAttributeName(ProductAttributeNameType value) {
        return new JAXBElement<ProductAttributeNameType>(_ProductAttributeName_QNAME, ProductAttributeNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderOceanBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderOceanBody")
    public JAXBElement<LoadTenderOceanBodyType> createLoadTenderOceanBody(LoadTenderOceanBodyType value) {
        return new JAXBElement<LoadTenderOceanBodyType>(_LoadTenderOceanBody_QNAME, LoadTenderOceanBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TestValue")
    public JAXBElement<TestValueType> createTestValue(TestValueType value) {
        return new JAXBElement<TestValueType>(_TestValue_QNAME, TestValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderRailPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderRailProperties")
    public JAXBElement<LoadTenderRailPropertiesType> createLoadTenderRailProperties(LoadTenderRailPropertiesType value) {
        return new JAXBElement<LoadTenderRailPropertiesType>(_LoadTenderRailProperties_QNAME, LoadTenderRailPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RailTransportInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RailTransportInformation")
    public JAXBElement<RailTransportInformationType> createRailTransportInformation(RailTransportInformationType value) {
        return new JAXBElement<RailTransportInformationType>(_RailTransportInformation_QNAME, RailTransportInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadDockHoursType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadDockHours")
    public JAXBElement<LoadDockHoursType> createLoadDockHours(LoadDockHoursType value) {
        return new JAXBElement<LoadDockHoursType>(_LoadDockHours_QNAME, LoadDockHoursType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RiskDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RiskDescription")
    public JAXBElement<RiskDescriptionType> createRiskDescription(RiskDescriptionType value) {
        return new JAXBElement<RiskDescriptionType>(_RiskDescription_QNAME, RiskDescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorderCrossingPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BorderCrossingPoint")
    public JAXBElement<BorderCrossingPointType> createBorderCrossingPoint(BorderCrossingPointType value) {
        return new JAXBElement<BorderCrossingPointType>(_BorderCrossingPoint_QNAME, BorderCrossingPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HazardousGoodsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HazardousGoods")
    public JAXBElement<HazardousGoodsType> createHazardousGoods(HazardousGoodsType value) {
        return new JAXBElement<HazardousGoodsType>(_HazardousGoods_QNAME, HazardousGoodsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportResponsePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportResponsePartners")
    public JAXBElement<CostSupportResponsePartnersType> createCostSupportResponsePartners(CostSupportResponsePartnersType value) {
        return new JAXBElement<CostSupportResponsePartnersType>(_CostSupportResponsePartners_QNAME, CostSupportResponsePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductGradeDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductGradeDescription(String value) {
        return new JAXBElement<String>(_ProductGradeDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Instructions")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInstructions(String value) {
        return new JAXBElement<String>(_Instructions_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReceiptQuantity")
    public JAXBElement<ReceiptQuantityType> createReceiptQuantity(ReceiptQuantityType value) {
        return new JAXBElement<ReceiptQuantityType>(_ReceiptQuantity_QNAME, ReceiptQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AllowanceChargeType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAllowanceChargeType(String value) {
        return new JAXBElement<String>(_AllowanceChargeType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharacteristicType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Characteristic")
    public JAXBElement<CharacteristicType> createCharacteristic(CharacteristicType value) {
        return new JAXBElement<CharacteristicType>(_Characteristic_QNAME, CharacteristicType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxTypeCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TaxTypeCode")
    public JAXBElement<TaxTypeCodeType> createTaxTypeCode(TaxTypeCodeType value) {
        return new JAXBElement<TaxTypeCodeType>(_TaxTypeCode_QNAME, TaxTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportResponseDetails")
    public JAXBElement<CostSupportResponseDetailsType> createCostSupportResponseDetails(CostSupportResponseDetailsType value) {
        return new JAXBElement<CostSupportResponseDetailsType>(_CostSupportResponseDetails_QNAME, CostSupportResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BondedWarehouseRelease")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBondedWarehouseRelease(String value) {
        return new JAXBElement<String>(_BondedWarehouseRelease_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentDateReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentDateReference")
    public JAXBElement<ShipmentDateReferenceType> createShipmentDateReference(ShipmentDateReferenceType value) {
        return new JAXBElement<ShipmentDateReferenceType>(_ShipmentDateReference_QNAME, ShipmentDateReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CidxListLoadBuildingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadBuildingType")
    public JAXBElement<CidxListLoadBuildingType> createLoadBuildingType(CidxListLoadBuildingType value) {
        return new JAXBElement<CidxListLoadBuildingType>(_LoadBuildingType_QNAME, CidxListLoadBuildingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryTermsCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryTermsCode")
    public JAXBElement<DeliveryTermsCodeType> createDeliveryTermsCode(DeliveryTermsCodeType value) {
        return new JAXBElement<DeliveryTermsCodeType>(_DeliveryTermsCode_QNAME, DeliveryTermsCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortDeliveryPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PortDeliveryPoint")
    public JAXBElement<PortDeliveryPointType> createPortDeliveryPoint(PortDeliveryPointType value) {
        return new JAXBElement<PortDeliveryPointType>(_PortDeliveryPoint_QNAME, PortDeliveryPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferencedPriceSheetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReferencedPriceSheet")
    public JAXBElement<ReferencedPriceSheetType> createReferencedPriceSheet(ReferencedPriceSheetType value) {
        return new JAXBElement<ReferencedPriceSheetType>(_ReferencedPriceSheet_QNAME, ReferencedPriceSheetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingCancelPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingCancelProperties")
    public JAXBElement<PostingCancelPropertiesType> createPostingCancelProperties(PostingCancelPropertiesType value) {
        return new JAXBElement<PostingCancelPropertiesType>(_PostingCancelProperties_QNAME, PostingCancelPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SubLineItemNumber")
    public JAXBElement<BigInteger> createSubLineItemNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_SubLineItemNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "EmergencyResponsePlanNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEmergencyResponsePlanNumber(String value) {
        return new JAXBElement<String>(_EmergencyResponsePlanNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceSheetPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceSheetProperties")
    public JAXBElement<PriceSheetPropertiesType> createPriceSheetProperties(PriceSheetPropertiesType value) {
        return new JAXBElement<PriceSheetPropertiesType>(_PriceSheetProperties_QNAME, PriceSheetPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Keywords")
    public JAXBElement<KeywordsType> createKeywords(KeywordsType value) {
        return new JAXBElement<KeywordsType>(_Keywords_QNAME, KeywordsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InlandDestinationPointCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InlandDestinationPointCode")
    public JAXBElement<InlandDestinationPointCodeType> createInlandDestinationPointCode(InlandDestinationPointCodeType value) {
        return new JAXBElement<InlandDestinationPointCodeType>(_InlandDestinationPointCode_QNAME, InlandDestinationPointCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupportedProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SupportedProduct")
    public JAXBElement<SupportedProductType> createSupportedProduct(SupportedProductType value) {
        return new JAXBElement<SupportedProductType>(_SupportedProduct_QNAME, SupportedProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentProperties")
    public JAXBElement<PaymentPropertiesType> createPaymentProperties(PaymentPropertiesType value) {
        return new JAXBElement<PaymentPropertiesType>(_PaymentProperties_QNAME, PaymentPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryReceiptResponsePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryReceiptResponsePartners")
    public JAXBElement<DeliveryReceiptResponsePartnersType> createDeliveryReceiptResponsePartners(DeliveryReceiptResponsePartnersType value) {
        return new JAXBElement<DeliveryReceiptResponsePartnersType>(_DeliveryReceiptResponsePartners_QNAME, DeliveryReceiptResponsePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReceiptNoticeReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReceiptNoticeReason(String value) {
        return new JAXBElement<String>(_ReceiptNoticeReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimatedTimeOfArrivalDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "EstimatedTimeOfArrivalDate")
    public JAXBElement<EstimatedTimeOfArrivalDateType> createEstimatedTimeOfArrivalDate(EstimatedTimeOfArrivalDateType value) {
        return new JAXBElement<EstimatedTimeOfArrivalDateType>(_EstimatedTimeOfArrivalDate_QNAME, EstimatedTimeOfArrivalDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MovementType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMovementType(String value) {
        return new JAXBElement<String>(_MovementType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingChangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingChange")
    public JAXBElement<PostingChangeType> createPostingChange(PostingChangeType value) {
        return new JAXBElement<PostingChangeType>(_PostingChange_QNAME, PostingChangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecifiedMeasurementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SpecifiedMeasurement")
    public JAXBElement<SpecifiedMeasurementType> createSpecifiedMeasurement(SpecifiedMeasurementType value) {
        return new JAXBElement<SpecifiedMeasurementType>(_SpecifiedMeasurement_QNAME, SpecifiedMeasurementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptanceNotificationLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AcceptanceNotificationLineItem")
    public JAXBElement<AcceptanceNotificationLineItemType> createAcceptanceNotificationLineItem(AcceptanceNotificationLineItemType value) {
        return new JAXBElement<AcceptanceNotificationLineItemType>(_AcceptanceNotificationLineItem_QNAME, AcceptanceNotificationLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesVolumeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SalesVolume")
    public JAXBElement<SalesVolumeType> createSalesVolume(SalesVolumeType value) {
        return new JAXBElement<SalesVolumeType>(_SalesVolume_QNAME, SalesVolumeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequisitionNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequisitionNumber")
    public JAXBElement<RequisitionNumberType> createRequisitionNumber(RequisitionNumberType value) {
        return new JAXBElement<RequisitionNumberType>(_RequisitionNumber_QNAME, RequisitionNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CidxListContractCommitmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractCommitmentType")
    public JAXBElement<CidxListContractCommitmentType> createContractCommitmentType(CidxListContractCommitmentType value) {
        return new JAXBElement<CidxListContractCommitmentType>(_ContractCommitmentType_QNAME, CidxListContractCommitmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RegulationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRegulationCode(String value) {
        return new JAXBElement<String>(_RegulationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ExternalReference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createExternalReference(String value) {
        return new JAXBElement<String>(_ExternalReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OriginatorSequenceNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOriginatorSequenceNumber(String value) {
        return new JAXBElement<String>(_OriginatorSequenceNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LadingDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLadingDescription(String value) {
        return new JAXBElement<String>(_LadingDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Berth")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBerth(String value) {
        return new JAXBElement<String>(_Berth_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PHValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PHValue")
    public JAXBElement<PHValueType> createPHValue(PHValueType value) {
        return new JAXBElement<PHValueType>(_PHValue_QNAME, PHValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceSheetDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceSheetDetails")
    public JAXBElement<PriceSheetDetailsType> createPriceSheetDetails(PriceSheetDetailsType value) {
        return new JAXBElement<PriceSheetDetailsType>(_PriceSheetDetails_QNAME, PriceSheetDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InvoiceDetails")
    public JAXBElement<InvoiceDetailsType> createInvoiceDetails(InvoiceDetailsType value) {
        return new JAXBElement<InvoiceDetailsType>(_InvoiceDetails_QNAME, InvoiceDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryReceiptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryReceipt")
    public JAXBElement<DeliveryReceiptType> createDeliveryReceipt(DeliveryReceiptType value) {
        return new JAXBElement<DeliveryReceiptType>(_DeliveryReceipt_QNAME, DeliveryReceiptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightBillDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FreightBillDetails")
    public JAXBElement<FreightBillDetailsType> createFreightBillDetails(FreightBillDetailsType value) {
        return new JAXBElement<FreightBillDetailsType>(_FreightBillDetails_QNAME, FreightBillDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalCancelPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalCancelPartners")
    public JAXBElement<ReplenishmentProposalCancelPartnersType> createReplenishmentProposalCancelPartners(ReplenishmentProposalCancelPartnersType value) {
        return new JAXBElement<ReplenishmentProposalCancelPartnersType>(_ReplenishmentProposalCancelPartners_QNAME, ReplenishmentProposalCancelPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryUsageLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryUsageLineItem")
    public JAXBElement<InventoryUsageLineItemType> createInventoryUsageLineItem(InventoryUsageLineItemType value) {
        return new JAXBElement<InventoryUsageLineItemType>(_InventoryUsageLineItem_QNAME, InventoryUsageLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecificGravityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SpecificGravity")
    public JAXBElement<SpecificGravityType> createSpecificGravity(SpecificGravityType value) {
        return new JAXBElement<SpecificGravityType>(_SpecificGravity_QNAME, SpecificGravityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagingDimensionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PackagingDimensions")
    public JAXBElement<PackagingDimensionsType> createPackagingDimensions(PackagingDimensionsType value) {
        return new JAXBElement<PackagingDimensionsType>(_PackagingDimensions_QNAME, PackagingDimensionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportCreditRequestBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportCreditRequestBody")
    public JAXBElement<CostSupportCreditRequestBodyType> createCostSupportCreditRequestBody(CostSupportCreditRequestBodyType value) {
        return new JAXBElement<CostSupportCreditRequestBodyType>(_CostSupportCreditRequestBody_QNAME, CostSupportCreditRequestBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPriceReason(String value) {
        return new JAXBElement<String>(_PriceReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CidxListFlammableLiquidsFireClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FlammableLiquidsFireClass")
    public JAXBElement<CidxListFlammableLiquidsFireClass> createFlammableLiquidsFireClass(CidxListFlammableLiquidsFireClass value) {
        return new JAXBElement<CidxListFlammableLiquidsFireClass>(_FlammableLiquidsFireClass_QNAME, CidxListFlammableLiquidsFireClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DangerIndicationTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DangerIndicationText")
    public JAXBElement<DangerIndicationTextType> createDangerIndicationText(DangerIndicationTextType value) {
        return new JAXBElement<DangerIndicationTextType>(_DangerIndicationText_QNAME, DangerIndicationTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityTestingReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QualityTestingReport")
    public JAXBElement<QualityTestingReportType> createQualityTestingReport(QualityTestingReportType value) {
        return new JAXBElement<QualityTestingReportType>(_QualityTestingReport_QNAME, QualityTestingReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingAcceptPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingAcceptPartners")
    public JAXBElement<PostingAcceptPartnersType> createPostingAcceptPartners(PostingAcceptPartnersType value) {
        return new JAXBElement<PostingAcceptPartnersType>(_PostingAcceptPartners_QNAME, PostingAcceptPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "NAICSNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNAICSNumber(String value) {
        return new JAXBElement<String>(_NAICSNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductSpecificationName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductSpecificationName(String value) {
        return new JAXBElement<String>(_ProductSpecificationName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportRequestPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportRequestProperties")
    public JAXBElement<CostSupportRequestPropertiesType> createCostSupportRequestProperties(CostSupportRequestPropertiesType value) {
        return new JAXBElement<CostSupportRequestPropertiesType>(_CostSupportRequestProperties_QNAME, CostSupportRequestPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderRailBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderRailBody")
    public JAXBElement<LoadTenderRailBodyType> createLoadTenderRailBody(LoadTenderRailBodyType value) {
        return new JAXBElement<LoadTenderRailBodyType>(_LoadTenderRailBody_QNAME, LoadTenderRailBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowanceChargeAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AllowanceChargeAmount")
    public JAXBElement<AllowanceChargeAmountType> createAllowanceChargeAmount(AllowanceChargeAmountType value) {
        return new JAXBElement<AllowanceChargeAmountType>(_AllowanceChargeAmount_QNAME, AllowanceChargeAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportRequestNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportRequestNumber")
    public JAXBElement<CostSupportRequestNumberType> createCostSupportRequestNumber(CostSupportRequestNumberType value) {
        return new JAXBElement<CostSupportRequestNumberType>(_CostSupportRequestNumber_QNAME, CostSupportRequestNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportRequestDetails")
    public JAXBElement<CostSupportRequestDetailsType> createCostSupportRequestDetails(CostSupportRequestDetailsType value) {
        return new JAXBElement<CostSupportRequestDetailsType>(_CostSupportRequestDetails_QNAME, CostSupportRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductSpecificationUnit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductSpecificationUnit(String value) {
        return new JAXBElement<String>(_ProductSpecificationUnit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyPlanBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SupplyPlanBody")
    public JAXBElement<SupplyPlanBodyType> createSupplyPlanBody(SupplyPlanBodyType value) {
        return new JAXBElement<SupplyPlanBodyType>(_SupplyPlanBody_QNAME, SupplyPlanBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PierName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPierName(String value) {
        return new JAXBElement<String>(_PierName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RegulationName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRegulationName(String value) {
        return new JAXBElement<String>(_RegulationName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HazardousGoodsSymbol")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createHazardousGoodsSymbol(String value) {
        return new JAXBElement<String>(_HazardousGoodsSymbol_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowanceChargeRateInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AllowanceChargeRateInformation")
    public JAXBElement<AllowanceChargeRateInformationType> createAllowanceChargeRateInformation(AllowanceChargeRateInformationType value) {
        return new JAXBElement<AllowanceChargeRateInformationType>(_AllowanceChargeRateInformation_QNAME, AllowanceChargeRateInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryActualUsageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryActualUsage")
    public JAXBElement<InventoryActualUsageType> createInventoryActualUsage(InventoryActualUsageType value) {
        return new JAXBElement<InventoryActualUsageType>(_InventoryActualUsage_QNAME, InventoryActualUsageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryReceiptBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryReceiptBody")
    public JAXBElement<DeliveryReceiptBodyType> createDeliveryReceiptBody(DeliveryReceiptBodyType value) {
        return new JAXBElement<DeliveryReceiptBodyType>(_DeliveryReceiptBody_QNAME, DeliveryReceiptBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentStatusRequest")
    public JAXBElement<ShipmentStatusRequestType> createShipmentStatusRequest(ShipmentStatusRequestType value) {
        return new JAXBElement<ShipmentStatusRequestType>(_ShipmentStatusRequest_QNAME, ShipmentStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CidxListContractTypeCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractTypeCode")
    public JAXBElement<CidxListContractTypeCode> createContractTypeCode(CidxListContractTypeCode value) {
        return new JAXBElement<CidxListContractTypeCode>(_ContractTypeCode_QNAME, CidxListContractTypeCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagingVolumeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PackagingVolume")
    public JAXBElement<PackagingVolumeType> createPackagingVolume(PackagingVolumeType value) {
        return new JAXBElement<PackagingVolumeType>(_PackagingVolume_QNAME, PackagingVolumeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportCreditRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportCreditRequestDetails")
    public JAXBElement<CostSupportCreditRequestDetailsType> createCostSupportCreditRequestDetails(CostSupportCreditRequestDetailsType value) {
        return new JAXBElement<CostSupportCreditRequestDetailsType>(_CostSupportCreditRequestDetails_QNAME, CostSupportCreditRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Invoice")
    public JAXBElement<InvoiceType> createInvoice(InvoiceType value) {
        return new JAXBElement<InvoiceType>(_Invoice_QNAME, InvoiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagingContainerInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PackagingContainerInformation")
    public JAXBElement<PackagingContainerInformationType> createPackagingContainerInformation(PackagingContainerInformationType value) {
        return new JAXBElement<PackagingContainerInformationType>(_PackagingContainerInformation_QNAME, PackagingContainerInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SeverityLevel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSeverityLevel(String value) {
        return new JAXBElement<String>(_SeverityLevel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LocationTo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLocationTo(String value) {
        return new JAXBElement<String>(_LocationTo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCatalogUpdateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductCatalogUpdate")
    public JAXBElement<ProductCatalogUpdateType> createProductCatalogUpdate(ProductCatalogUpdateType value) {
        return new JAXBElement<ProductCatalogUpdateType>(_ProductCatalogUpdate_QNAME, ProductCatalogUpdateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestingDocumentIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestingDocumentIdentifier")
    public JAXBElement<RequestingDocumentIdentifierType> createRequestingDocumentIdentifier(RequestingDocumentIdentifierType value) {
        return new JAXBElement<RequestingDocumentIdentifierType>(_RequestingDocumentIdentifier_QNAME, RequestingDocumentIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LowerExplosionLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LowerExplosionLimit")
    public JAXBElement<LowerExplosionLimitType> createLowerExplosionLimit(LowerExplosionLimitType value) {
        return new JAXBElement<LowerExplosionLimitType>(_LowerExplosionLimit_QNAME, LowerExplosionLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegulationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Regulation")
    public JAXBElement<RegulationType> createRegulation(RegulationType value) {
        return new JAXBElement<RegulationType>(_Regulation_QNAME, RegulationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentDetailDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentDetailDetails")
    public JAXBElement<PaymentDetailDetailsType> createPaymentDetailDetails(PaymentDetailDetailsType value) {
        return new JAXBElement<PaymentDetailDetailsType>(_PaymentDetailDetails_QNAME, PaymentDetailDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTermsBasisDateCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentTermsBasisDateCode")
    public JAXBElement<PaymentTermsBasisDateCodeType> createPaymentTermsBasisDateCode(PaymentTermsBasisDateCodeType value) {
        return new JAXBElement<PaymentTermsBasisDateCodeType>(_PaymentTermsBasisDateCode_QNAME, PaymentTermsBasisDateCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentResponseProperties")
    public JAXBElement<PaymentResponsePropertiesType> createPaymentResponseProperties(PaymentResponsePropertiesType value) {
        return new JAXBElement<PaymentResponsePropertiesType>(_PaymentResponseProperties_QNAME, PaymentResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "USGoodsReturned")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUSGoodsReturned(String value) {
        return new JAXBElement<String>(_USGoodsReturned_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderOceanDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderOceanDetails")
    public JAXBElement<LoadTenderOceanDetailsType> createLoadTenderOceanDetails(LoadTenderOceanDetailsType value) {
        return new JAXBElement<LoadTenderOceanDetailsType>(_LoadTenderOceanDetails_QNAME, LoadTenderOceanDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ResponseStatusReasonDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createResponseStatusReasonDescription(String value) {
        return new JAXBElement<String>(_ResponseStatusReasonDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractAmount")
    public JAXBElement<ContractAmountType> createContractAmount(ContractAmountType value) {
        return new JAXBElement<ContractAmountType>(_ContractAmount_QNAME, ContractAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalCancelBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalCancelBody")
    public JAXBElement<ReplenishmentProposalCancelBodyType> createReplenishmentProposalCancelBody(ReplenishmentProposalCancelBodyType value) {
        return new JAXBElement<ReplenishmentProposalCancelBodyType>(_ReplenishmentProposalCancelBody_QNAME, ReplenishmentProposalCancelBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemStatusInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LineItemStatusInformation")
    public JAXBElement<LineItemStatusInformationType> createLineItemStatusInformation(LineItemStatusInformationType value) {
        return new JAXBElement<LineItemStatusInformationType>(_LineItemStatusInformation_QNAME, LineItemStatusInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandPlanResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandPlanResponse")
    public JAXBElement<DemandPlanResponseType> createDemandPlanResponse(DemandPlanResponseType value) {
        return new JAXBElement<DemandPlanResponseType>(_DemandPlanResponse_QNAME, DemandPlanResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContainerType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createContainerType(String value) {
        return new JAXBElement<String>(_ContainerType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractResponse")
    public JAXBElement<ContractResponseType> createContractResponse(ContractResponseType value) {
        return new JAXBElement<ContractResponseType>(_ContractResponse_QNAME, ContractResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualificationRequestPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QualificationRequestPartners")
    public JAXBElement<QualificationRequestPartnersType> createQualificationRequestPartners(QualificationRequestPartnersType value) {
        return new JAXBElement<QualificationRequestPartnersType>(_QualificationRequestPartners_QNAME, QualificationRequestPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractResponseProperties")
    public JAXBElement<ContractResponsePropertiesType> createContractResponseProperties(ContractResponsePropertiesType value) {
        return new JAXBElement<ContractResponsePropertiesType>(_ContractResponseProperties_QNAME, ContractResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandPlanLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandPlanLineItem")
    public JAXBElement<DemandPlanLineItemType> createDemandPlanLineItem(DemandPlanLineItemType value) {
        return new JAXBElement<DemandPlanLineItemType>(_DemandPlanLineItem_QNAME, DemandPlanLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateBasisType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RateBasis")
    public JAXBElement<RateBasisType> createRateBasis(RateBasisType value) {
        return new JAXBElement<RateBasisType>(_RateBasis_QNAME, RateBasisType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PricingPerUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PricingPerUnit")
    public JAXBElement<PricingPerUnitType> createPricingPerUnit(PricingPerUnitType value) {
        return new JAXBElement<PricingPerUnitType>(_PricingPerUnit_QNAME, PricingPerUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ResponseStatusComments")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createResponseStatusComments(String value) {
        return new JAXBElement<String>(_ResponseStatusComments_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PercentDue")
    public JAXBElement<BigDecimal> createPercentDue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PercentDue_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingTolerancesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShippingTolerances")
    public JAXBElement<ShippingTolerancesType> createShippingTolerances(ShippingTolerancesType value) {
        return new JAXBElement<ShippingTolerancesType>(_ShippingTolerances_QNAME, ShippingTolerancesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagingTypeCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PackagingTypeCode")
    public JAXBElement<PackagingTypeCodeType> createPackagingTypeCode(PackagingTypeCodeType value) {
        return new JAXBElement<PackagingTypeCodeType>(_PackagingTypeCode_QNAME, PackagingTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LadingFreightClass")
    public JAXBElement<BigDecimal> createLadingFreightClass(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LadingFreightClass_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderMotorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderMotor")
    public JAXBElement<LoadTenderMotorType> createLoadTenderMotor(LoadTenderMotorType value) {
        return new JAXBElement<LoadTenderMotorType>(_LoadTenderMotor_QNAME, LoadTenderMotorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentDetailPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentDetailPartners")
    public JAXBElement<PaymentDetailPartnersType> createPaymentDetailPartners(PaymentDetailPartnersType value) {
        return new JAXBElement<PaymentDetailPartnersType>(_PaymentDetailPartners_QNAME, PaymentDetailPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScaleDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ScaleDate")
    public JAXBElement<ScaleDateType> createScaleDate(ScaleDateType value) {
        return new JAXBElement<ScaleDateType>(_ScaleDate_QNAME, ScaleDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AcceptableTextValues")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAcceptableTextValues(String value) {
        return new JAXBElement<String>(_AcceptableTextValues_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualificationRequestBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QualificationRequestBody")
    public JAXBElement<QualificationRequestBodyType> createQualificationRequestBody(QualificationRequestBodyType value) {
        return new JAXBElement<QualificationRequestBodyType>(_QualificationRequestBody_QNAME, QualificationRequestBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryUsageLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryUsageLocation")
    public JAXBElement<InventoryUsageLocationType> createInventoryUsageLocation(InventoryUsageLocationType value) {
        return new JAXBElement<InventoryUsageLocationType>(_InventoryUsageLocation_QNAME, InventoryUsageLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LetterOfCreditVoyageDateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LetterOfCreditVoyageDateTime")
    public JAXBElement<LetterOfCreditVoyageDateTimeType> createLetterOfCreditVoyageDateTime(LetterOfCreditVoyageDateTimeType value) {
        return new JAXBElement<LetterOfCreditVoyageDateTimeType>(_LetterOfCreditVoyageDateTime_QNAME, LetterOfCreditVoyageDateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemTotalAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LineItemTotalAmount")
    public JAXBElement<LineItemTotalAmountType> createLineItemTotalAmount(LineItemTotalAmountType value) {
        return new JAXBElement<LineItemTotalAmountType>(_LineItemTotalAmount_QNAME, LineItemTotalAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderDateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderDateTime")
    public JAXBElement<LoadTenderDateTimeType> createLoadTenderDateTime(LoadTenderDateTimeType value) {
        return new JAXBElement<LoadTenderDateTimeType>(_LoadTenderDateTime_QNAME, LoadTenderDateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalNumberOfPackagesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TotalNumberOfPackages")
    public JAXBElement<TotalNumberOfPackagesType> createTotalNumberOfPackages(TotalNumberOfPackagesType value) {
        return new JAXBElement<TotalNumberOfPackagesType>(_TotalNumberOfPackages_QNAME, TotalNumberOfPackagesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExemptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Exempt")
    public JAXBElement<ExemptType> createExempt(ExemptType value) {
        return new JAXBElement<ExemptType>(_Exempt_QNAME, ExemptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BookingNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBookingNumber(String value) {
        return new JAXBElement<String>(_BookingNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentStatusCode")
    public JAXBElement<ShipmentStatusCodeType> createShipmentStatusCode(ShipmentStatusCodeType value) {
        return new JAXBElement<ShipmentStatusCodeType>(_ShipmentStatusCode_QNAME, ShipmentStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsAllowancesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CustomsAllowances")
    public JAXBElement<CustomsAllowancesType> createCustomsAllowances(CustomsAllowancesType value) {
        return new JAXBElement<CustomsAllowancesType>(_CustomsAllowances_QNAME, CustomsAllowancesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ExemptionSource")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createExemptionSource(String value) {
        return new JAXBElement<String>(_ExemptionSource_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentQualifierCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentQualifierCode")
    public JAXBElement<ShipmentQualifierCodeType> createShipmentQualifierCode(ShipmentQualifierCodeType value) {
        return new JAXBElement<ShipmentQualifierCodeType>(_ShipmentQualifierCode_QNAME, ShipmentQualifierCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForecastedProductMovementTransactionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ForecastedProductMovementTransactions")
    public JAXBElement<ForecastedProductMovementTransactionsType> createForecastedProductMovementTransactions(ForecastedProductMovementTransactionsType value) {
        return new JAXBElement<ForecastedProductMovementTransactionsType>(_ForecastedProductMovementTransactions_QNAME, ForecastedProductMovementTransactionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceSheetPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceSheetPartners")
    public JAXBElement<PriceSheetPartnersType> createPriceSheetPartners(PriceSheetPartnersType value) {
        return new JAXBElement<PriceSheetPartnersType>(_PriceSheetPartners_QNAME, PriceSheetPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateWeightType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RateWeight")
    public JAXBElement<RateWeightType> createRateWeight(RateWeightType value) {
        return new JAXBElement<RateWeightType>(_RateWeight_QNAME, RateWeightType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PercentDiscount")
    public JAXBElement<BigDecimal> createPercentDiscount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PercentDiscount_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FreightBillStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFreightBillStatus(String value) {
        return new JAXBElement<String>(_FreightBillStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderMotorDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderMotorDetails")
    public JAXBElement<LoadTenderMotorDetailsType> createLoadTenderMotorDetails(LoadTenderMotorDetailsType value) {
        return new JAXBElement<LoadTenderMotorDetailsType>(_LoadTenderMotorDetails_QNAME, LoadTenderMotorDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApproximateWeightType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ApproximateWeight")
    public JAXBElement<ApproximateWeightType> createApproximateWeight(ApproximateWeightType value) {
        return new JAXBElement<ApproximateWeightType>(_ApproximateWeight_QNAME, ApproximateWeightType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandPlanPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandPlanPartners")
    public JAXBElement<DemandPlanPartnersType> createDemandPlanPartners(DemandPlanPartnersType value) {
        return new JAXBElement<DemandPlanPartnersType>(_DemandPlanPartners_QNAME, DemandPlanPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequisitionLineItemNumber")
    public JAXBElement<BigInteger> createRequisitionLineItemNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_RequisitionLineItemNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentInstructionsDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentInstructionsDetails")
    public JAXBElement<ShipmentInstructionsDetailsType> createShipmentInstructionsDetails(ShipmentInstructionsDetailsType value) {
        return new JAXBElement<ShipmentInstructionsDetailsType>(_ShipmentInstructionsDetails_QNAME, ShipmentInstructionsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCatalogUpdateBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductCatalogUpdateBody")
    public JAXBElement<ProductCatalogUpdateBodyType> createProductCatalogUpdateBody(ProductCatalogUpdateBodyType value) {
        return new JAXBElement<ProductCatalogUpdateBodyType>(_ProductCatalogUpdateBody_QNAME, ProductCatalogUpdateBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedDocumentTypeCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestedDocumentTypeCode")
    public JAXBElement<RequestedDocumentTypeCodeType> createRequestedDocumentTypeCode(RequestedDocumentTypeCodeType value) {
        return new JAXBElement<RequestedDocumentTypeCodeType>(_RequestedDocumentTypeCode_QNAME, RequestedDocumentTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractProductInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractProductInformation")
    public JAXBElement<ContractProductInformationType> createContractProductInformation(ContractProductInformationType value) {
        return new JAXBElement<ContractProductInformationType>(_ContractProductInformation_QNAME, ContractProductInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceSheetEffectiveDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceSheetEffectiveDate")
    public JAXBElement<PriceSheetEffectiveDateType> createPriceSheetEffectiveDate(PriceSheetEffectiveDateType value) {
        return new JAXBElement<PriceSheetEffectiveDateType>(_PriceSheetEffectiveDate_QNAME, PriceSheetEffectiveDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalResponsePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalResponsePartners")
    public JAXBElement<ReplenishmentProposalResponsePartnersType> createReplenishmentProposalResponsePartners(ReplenishmentProposalResponsePartnersType value) {
        return new JAXBElement<ReplenishmentProposalResponsePartnersType>(_ReplenishmentProposalResponsePartners_QNAME, ReplenishmentProposalResponsePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ElevatedTemperatureLabel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createElevatedTemperatureLabel(String value) {
        return new JAXBElement<String>(_ElevatedTemperatureLabel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RFQIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRFQIdentifier(String value) {
        return new JAXBElement<String>(_RFQIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderOceanProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderOceanProductLineItem")
    public JAXBElement<LoadTenderOceanProductLineItemType> createLoadTenderOceanProductLineItem(LoadTenderOceanProductLineItemType value) {
        return new JAXBElement<LoadTenderOceanProductLineItemType>(_LoadTenderOceanProductLineItem_QNAME, LoadTenderOceanProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagingInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PackagingInformation")
    public JAXBElement<PackagingInformationType> createPackagingInformation(PackagingInformationType value) {
        return new JAXBElement<PackagingInformationType>(_PackagingInformation_QNAME, PackagingInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranshipmentInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TranshipmentInformation")
    public JAXBElement<TranshipmentInformationType> createTranshipmentInformation(TranshipmentInformationType value) {
        return new JAXBElement<TranshipmentInformationType>(_TranshipmentInformation_QNAME, TranshipmentInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalWeightOfPalletsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TotalWeightOfPallets")
    public JAXBElement<TotalWeightOfPalletsType> createTotalWeightOfPallets(TotalWeightOfPalletsType value) {
        return new JAXBElement<TotalWeightOfPalletsType>(_TotalWeightOfPallets_QNAME, TotalWeightOfPalletsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdvisingBankType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AdvisingBank")
    public JAXBElement<AdvisingBankType> createAdvisingBank(AdvisingBankType value) {
        return new JAXBElement<AdvisingBankType>(_AdvisingBank_QNAME, AdvisingBankType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "IndividualExemptionNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIndividualExemptionNumber(String value) {
        return new JAXBElement<String>(_IndividualExemptionNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderOceanProductSubLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderOceanProductSubLineItem")
    public JAXBElement<LoadTenderOceanProductSubLineItemType> createLoadTenderOceanProductSubLineItem(LoadTenderOceanProductSubLineItemType value) {
        return new JAXBElement<LoadTenderOceanProductSubLineItemType>(_LoadTenderOceanProductSubLineItem_QNAME, LoadTenderOceanProductSubLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportRequestChangeDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportRequestChangeDetails")
    public JAXBElement<CostSupportRequestChangeDetailsType> createCostSupportRequestChangeDetails(CostSupportRequestChangeDetailsType value) {
        return new JAXBElement<CostSupportRequestChangeDetailsType>(_CostSupportRequestChangeDetails_QNAME, CostSupportRequestChangeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ImportLicenseNeededFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createImportLicenseNeededFlag(String value) {
        return new JAXBElement<String>(_ImportLicenseNeededFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingCreateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingCreate")
    public JAXBElement<PostingCreateType> createPostingCreate(PostingCreateType value) {
        return new JAXBElement<PostingCreateType>(_PostingCreate_QNAME, PostingCreateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightBillBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FreightBillBody")
    public JAXBElement<FreightBillBodyType> createFreightBillBody(FreightBillBodyType value) {
        return new JAXBElement<FreightBillBodyType>(_FreightBillBody_QNAME, FreightBillBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryReceiptPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryReceiptProperties")
    public JAXBElement<DeliveryReceiptPropertiesType> createDeliveryReceiptProperties(DeliveryReceiptPropertiesType value) {
        return new JAXBElement<DeliveryReceiptPropertiesType>(_DeliveryReceiptProperties_QNAME, DeliveryReceiptPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HazardousGoodsDangerIndicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HazardousGoodsDangerIndication")
    public JAXBElement<HazardousGoodsDangerIndicationType> createHazardousGoodsDangerIndication(HazardousGoodsDangerIndicationType value) {
        return new JAXBElement<HazardousGoodsDangerIndicationType>(_HazardousGoodsDangerIndication_QNAME, HazardousGoodsDangerIndicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusResponseProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusResponseProductLineItem")
    public JAXBElement<OrderStatusResponseProductLineItemType> createOrderStatusResponseProductLineItem(OrderStatusResponseProductLineItemType value) {
        return new JAXBElement<OrderStatusResponseProductLineItemType>(_OrderStatusResponseProductLineItem_QNAME, OrderStatusResponseProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyPlanResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SupplyPlanResponse")
    public JAXBElement<SupplyPlanResponseType> createSupplyPlanResponse(SupplyPlanResponseType value) {
        return new JAXBElement<SupplyPlanResponseType>(_SupplyPlanResponse_QNAME, SupplyPlanResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractInformation")
    public JAXBElement<ContractInformationType> createContractInformation(ContractInformationType value) {
        return new JAXBElement<ContractInformationType>(_ContractInformation_QNAME, ContractInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualificationRequestPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QualificationRequestProperties")
    public JAXBElement<QualificationRequestPropertiesType> createQualificationRequestProperties(QualificationRequestPropertiesType value) {
        return new JAXBElement<QualificationRequestPropertiesType>(_QualificationRequestProperties_QNAME, QualificationRequestPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingStatusResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingStatusResponseProperties")
    public JAXBElement<PostingStatusResponsePropertiesType> createPostingStatusResponseProperties(PostingStatusResponsePropertiesType value) {
        return new JAXBElement<PostingStatusResponsePropertiesType>(_PostingStatusResponseProperties_QNAME, PostingStatusResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TareWeightType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TareWeight")
    public JAXBElement<TareWeightType> createTareWeight(TareWeightType value) {
        return new JAXBElement<TareWeightType>(_TareWeight_QNAME, TareWeightType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InvoiceResponseProperties")
    public JAXBElement<InvoiceResponsePropertiesType> createInvoiceResponseProperties(InvoiceResponsePropertiesType value) {
        return new JAXBElement<InvoiceResponsePropertiesType>(_InvoiceResponseProperties_QNAME, InvoiceResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SurfaceLayerPositionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSurfaceLayerPositionCode(String value) {
        return new JAXBElement<String>(_SurfaceLayerPositionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceAndAvailabilityResponseProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceAndAvailabilityResponseProductLineItem")
    public JAXBElement<PriceAndAvailabilityResponseProductLineItemType> createPriceAndAvailabilityResponseProductLineItem(PriceAndAvailabilityResponseProductLineItemType value) {
        return new JAXBElement<PriceAndAvailabilityResponseProductLineItemType>(_PriceAndAvailabilityResponseProductLineItem_QNAME, PriceAndAvailabilityResponseProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CatalogIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCatalogIdentifier(String value) {
        return new JAXBElement<String>(_CatalogIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalNumberOfEquipmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TotalNumberOfEquipment")
    public JAXBElement<TotalNumberOfEquipmentType> createTotalNumberOfEquipment(TotalNumberOfEquipmentType value) {
        return new JAXBElement<TotalNumberOfEquipmentType>(_TotalNumberOfEquipment_QNAME, TotalNumberOfEquipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReviewDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReviewDate")
    public JAXBElement<ReviewDateType> createReviewDate(ReviewDateType value) {
        return new JAXBElement<ReviewDateType>(_ReviewDate_QNAME, ReviewDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "StateOrProvince")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStateOrProvince(String value) {
        return new JAXBElement<String>(_StateOrProvince_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSpecificCatalogUpdateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CustomerSpecificCatalogUpdate")
    public JAXBElement<CustomerSpecificCatalogUpdateType> createCustomerSpecificCatalogUpdate(CustomerSpecificCatalogUpdateType value) {
        return new JAXBElement<CustomerSpecificCatalogUpdateType>(_CustomerSpecificCatalogUpdate_QNAME, CustomerSpecificCatalogUpdateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InvoiceMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInvoiceMode(String value) {
        return new JAXBElement<String>(_InvoiceMode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateOfAnalysisBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CertificateOfAnalysisBody")
    public JAXBElement<CertificateOfAnalysisBodyType> createCertificateOfAnalysisBody(CertificateOfAnalysisBodyType value) {
        return new JAXBElement<CertificateOfAnalysisBodyType>(_CertificateOfAnalysisBody_QNAME, CertificateOfAnalysisBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyPlanResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SupplyPlanResponseProperties")
    public JAXBElement<SupplyPlanResponsePropertiesType> createSupplyPlanResponseProperties(SupplyPlanResponsePropertiesType value) {
        return new JAXBElement<SupplyPlanResponsePropertiesType>(_SupplyPlanResponseProperties_QNAME, SupplyPlanResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ToDateTime")
    public JAXBElement<XMLGregorianCalendar> createToDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ToDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarrierWeightsPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CarrierWeightsPartners")
    public JAXBElement<CarrierWeightsPartnersType> createCarrierWeightsPartners(CarrierWeightsPartnersType value) {
        return new JAXBElement<CarrierWeightsPartnersType>(_CarrierWeightsPartners_QNAME, CarrierWeightsPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingCancelResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingCancelResponseProperties")
    public JAXBElement<PostingCancelResponsePropertiesType> createPostingCancelResponseProperties(PostingCancelResponsePropertiesType value) {
        return new JAXBElement<PostingCancelResponsePropertiesType>(_PostingCancelResponseProperties_QNAME, PostingCancelResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyPlanLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SupplyPlanLineItem")
    public JAXBElement<SupplyPlanLineItemType> createSupplyPlanLineItem(SupplyPlanLineItemType value) {
        return new JAXBElement<SupplyPlanLineItemType>(_SupplyPlanLineItem_QNAME, SupplyPlanLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryConfirmationResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryConfirmationResponseProperties")
    public JAXBElement<DeliveryConfirmationResponsePropertiesType> createDeliveryConfirmationResponseProperties(DeliveryConfirmationResponsePropertiesType value) {
        return new JAXBElement<DeliveryConfirmationResponsePropertiesType>(_DeliveryConfirmationResponseProperties_QNAME, DeliveryConfirmationResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CidxListContractCommitmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractResponseCommitmentType")
    public JAXBElement<CidxListContractCommitmentType> createContractResponseCommitmentType(CidxListContractCommitmentType value) {
        return new JAXBElement<CidxListContractCommitmentType>(_ContractResponseCommitmentType_QNAME, CidxListContractCommitmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReceivingConditionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReceivingConditionCode(String value) {
        return new JAXBElement<String>(_ReceivingConditionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingChangeDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingChangeDetails")
    public JAXBElement<PostingChangeDetailsType> createPostingChangeDetails(PostingChangeDetailsType value) {
        return new JAXBElement<PostingChangeDetailsType>(_PostingChangeDetails_QNAME, PostingChangeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStatus(String value) {
        return new JAXBElement<String>(_Status_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentStatusReasonCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentStatusReasonCode")
    public JAXBElement<ShipmentStatusReasonCodeType> createShipmentStatusReasonCode(ShipmentStatusReasonCodeType value) {
        return new JAXBElement<ShipmentStatusReasonCodeType>(_ShipmentStatusReasonCode_QNAME, ShipmentStatusReasonCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTermsOfSaleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentTermsOfSale")
    public JAXBElement<PaymentTermsOfSaleType> createPaymentTermsOfSale(PaymentTermsOfSaleType value) {
        return new JAXBElement<PaymentTermsOfSaleType>(_PaymentTermsOfSale_QNAME, PaymentTermsOfSaleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "State")
    public JAXBElement<StateType> createState(StateType value) {
        return new JAXBElement<StateType>(_State_QNAME, StateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryConfirmationResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryConfirmationResponseDetails")
    public JAXBElement<DeliveryConfirmationResponseDetailsType> createDeliveryConfirmationResponseDetails(DeliveryConfirmationResponseDetailsType value) {
        return new JAXBElement<DeliveryConfirmationResponseDetailsType>(_DeliveryConfirmationResponseDetails_QNAME, DeliveryConfirmationResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinimumSalesVolumeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MinimumSalesVolume")
    public JAXBElement<MinimumSalesVolumeType> createMinimumSalesVolume(MinimumSalesVolumeType value) {
        return new JAXBElement<MinimumSalesVolumeType>(_MinimumSalesVolume_QNAME, MinimumSalesVolumeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceAndAvailabilityResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceAndAvailabilityResponseProperties")
    public JAXBElement<PriceAndAvailabilityResponsePropertiesType> createPriceAndAvailabilityResponseProperties(PriceAndAvailabilityResponsePropertiesType value) {
        return new JAXBElement<PriceAndAvailabilityResponsePropertiesType>(_PriceAndAvailabilityResponseProperties_QNAME, PriceAndAvailabilityResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AllowanceChargeDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAllowanceChargeDescription(String value) {
        return new JAXBElement<String>(_AllowanceChargeDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContainerSerialNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContainerSerialNumber")
    public JAXBElement<ContainerSerialNumberType> createContainerSerialNumber(ContainerSerialNumberType value) {
        return new JAXBElement<ContainerSerialNumberType>(_ContainerSerialNumber_QNAME, ContainerSerialNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryConfirmationDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryConfirmationDetails")
    public JAXBElement<DeliveryConfirmationDetailsType> createDeliveryConfirmationDetails(DeliveryConfirmationDetailsType value) {
        return new JAXBElement<DeliveryConfirmationDetailsType>(_DeliveryConfirmationDetails_QNAME, DeliveryConfirmationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitVolumeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "UnitVolume")
    public JAXBElement<UnitVolumeType> createUnitVolume(UnitVolumeType value) {
        return new JAXBElement<UnitVolumeType>(_UnitVolume_QNAME, UnitVolumeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociatedEquipmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AssociatedEquipment")
    public JAXBElement<AssociatedEquipmentType> createAssociatedEquipment(AssociatedEquipmentType value) {
        return new JAXBElement<AssociatedEquipmentType>(_AssociatedEquipment_QNAME, AssociatedEquipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSpecificCatalogUpdateProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CustomerSpecificCatalogUpdateProductLineItem")
    public JAXBElement<CustomerSpecificCatalogUpdateProductLineItemType> createCustomerSpecificCatalogUpdateProductLineItem(CustomerSpecificCatalogUpdateProductLineItemType value) {
        return new JAXBElement<CustomerSpecificCatalogUpdateProductLineItemType>(_CustomerSpecificCatalogUpdateProductLineItem_QNAME, CustomerSpecificCatalogUpdateProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "IncidentAccountabilityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIncidentAccountabilityCode(String value) {
        return new JAXBElement<String>(_IncidentAccountabilityCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentInstructionsBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentInstructionsBody")
    public JAXBElement<ShipmentInstructionsBodyType> createShipmentInstructionsBody(ShipmentInstructionsBodyType value) {
        return new JAXBElement<ShipmentInstructionsBodyType>(_ShipmentInstructionsBody_QNAME, ShipmentInstructionsBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompetitiveInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CompetitiveInformation")
    public JAXBElement<CompetitiveInformationType> createCompetitiveInformation(CompetitiveInformationType value) {
        return new JAXBElement<CompetitiveInformationType>(_CompetitiveInformation_QNAME, CompetitiveInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingTotalAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShippingTotalAmount")
    public JAXBElement<ShippingTotalAmountType> createShippingTotalAmount(ShippingTotalAmountType value) {
        return new JAXBElement<ShippingTotalAmountType>(_ShippingTotalAmount_QNAME, ShippingTotalAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThisDocumentIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ThisDocumentIdentifier")
    public JAXBElement<ThisDocumentIdentifierType> createThisDocumentIdentifier(ThisDocumentIdentifierType value) {
        return new JAXBElement<ThisDocumentIdentifierType>(_ThisDocumentIdentifier_QNAME, ThisDocumentIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceAndAvailabilityRequestPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceAndAvailabilityRequestProperties")
    public JAXBElement<PriceAndAvailabilityRequestPropertiesType> createPriceAndAvailabilityRequestProperties(PriceAndAvailabilityRequestPropertiesType value) {
        return new JAXBElement<PriceAndAvailabilityRequestPropertiesType>(_PriceAndAvailabilityRequestProperties_QNAME, PriceAndAvailabilityRequestPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceSheetReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPriceSheetReason(String value) {
        return new JAXBElement<String>(_PriceSheetReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandForecastPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandForecastProperties")
    public JAXBElement<DemandForecastPropertiesType> createDemandForecastProperties(DemandForecastPropertiesType value) {
        return new JAXBElement<DemandForecastPropertiesType>(_DemandForecastProperties_QNAME, DemandForecastPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingAcceptResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingAcceptResponseBody")
    public JAXBElement<PostingAcceptResponseBodyType> createPostingAcceptResponseBody(PostingAcceptResponseBodyType value) {
        return new JAXBElement<PostingAcceptResponseBodyType>(_PostingAcceptResponseBody_QNAME, PostingAcceptResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductQuantity")
    public JAXBElement<ProductQuantityType> createProductQuantity(ProductQuantityType value) {
        return new JAXBElement<ProductQuantityType>(_ProductQuantity_QNAME, ProductQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirTransportInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AirTransportInformation")
    public JAXBElement<AirTransportInformationType> createAirTransportInformation(AirTransportInformationType value) {
        return new JAXBElement<AirTransportInformationType>(_AirTransportInformation_QNAME, AirTransportInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MarketPlaceBuyerIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMarketPlaceBuyerIdentifier(String value) {
        return new JAXBElement<String>(_MarketPlaceBuyerIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingCancelBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingCancelBody")
    public JAXBElement<PostingCancelBodyType> createPostingCancelBody(PostingCancelBodyType value) {
        return new JAXBElement<PostingCancelBodyType>(_PostingCancelBody_QNAME, PostingCancelBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusListResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusListResponseProperties")
    public JAXBElement<OrderStatusListResponsePropertiesType> createOrderStatusListResponseProperties(OrderStatusListResponsePropertiesType value) {
        return new JAXBElement<OrderStatusListResponsePropertiesType>(_OrderStatusListResponseProperties_QNAME, OrderStatusListResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusListRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusListRequestDetails")
    public JAXBElement<OrderStatusListRequestDetailsType> createOrderStatusListRequestDetails(OrderStatusListRequestDetailsType value) {
        return new JAXBElement<OrderStatusListRequestDetailsType>(_OrderStatusListRequestDetails_QNAME, OrderStatusListRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChamberRelatedTemperatureRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ChamberRelatedTemperatureRange")
    public JAXBElement<ChamberRelatedTemperatureRangeType> createChamberRelatedTemperatureRange(ChamberRelatedTemperatureRangeType value) {
        return new JAXBElement<ChamberRelatedTemperatureRangeType>(_ChamberRelatedTemperatureRange_QNAME, ChamberRelatedTemperatureRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialInstitutionIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FinancialInstitutionIdentification")
    public JAXBElement<FinancialInstitutionIdentificationType> createFinancialInstitutionIdentification(FinancialInstitutionIdentificationType value) {
        return new JAXBElement<FinancialInstitutionIdentificationType>(_FinancialInstitutionIdentification_QNAME, FinancialInstitutionIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DueDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DueDate")
    public JAXBElement<DueDateType> createDueDate(DueDateType value) {
        return new JAXBElement<DueDateType>(_DueDate_QNAME, DueDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceApplicabilityCriteriaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceApplicabilityCriteria")
    public JAXBElement<PriceApplicabilityCriteriaType> createPriceApplicabilityCriteria(PriceApplicabilityCriteriaType value) {
        return new JAXBElement<PriceApplicabilityCriteriaType>(_PriceApplicabilityCriteria_QNAME, PriceApplicabilityCriteriaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingInstructionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RoutingInstructions")
    public JAXBElement<RoutingInstructionsType> createRoutingInstructions(RoutingInstructionsType value) {
        return new JAXBElement<RoutingInstructionsType>(_RoutingInstructions_QNAME, RoutingInstructionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductEndUse")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductEndUse(String value) {
        return new JAXBElement<String>(_ProductEndUse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinimumQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MinimumQuantity")
    public JAXBElement<MinimumQuantityType> createMinimumQuantity(MinimumQuantityType value) {
        return new JAXBElement<MinimumQuantityType>(_MinimumQuantity_QNAME, MinimumQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Seller")
    public JAXBElement<SellerType> createSeller(SellerType value) {
        return new JAXBElement<SellerType>(_Seller_QNAME, SellerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UNPortableTankCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "UNPortableTankCode")
    public JAXBElement<UNPortableTankCodeType> createUNPortableTankCode(UNPortableTankCodeType value) {
        return new JAXBElement<UNPortableTankCodeType>(_UNPortableTankCode_QNAME, UNPortableTankCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentOwnershipCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "EquipmentOwnershipCode")
    public JAXBElement<EquipmentOwnershipCodeType> createEquipmentOwnershipCode(EquipmentOwnershipCodeType value) {
        return new JAXBElement<EquipmentOwnershipCodeType>(_EquipmentOwnershipCode_QNAME, EquipmentOwnershipCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ZoneType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createZoneType(String value) {
        return new JAXBElement<String>(_ZoneType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentStatusCodeDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createShipmentStatusCodeDescription(String value) {
        return new JAXBElement<String>(_ShipmentStatusCodeDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ExchangeRate")
    public JAXBElement<BigDecimal> createExchangeRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ExchangeRate_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceZoneGeographyListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceZoneGeographyList")
    public JAXBElement<PriceZoneGeographyListType> createPriceZoneGeographyList(PriceZoneGeographyListType value) {
        return new JAXBElement<PriceZoneGeographyListType>(_PriceZoneGeographyList_QNAME, PriceZoneGeographyListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingCancelResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingCancelResponseBody")
    public JAXBElement<PostingCancelResponseBodyType> createPostingCancelResponseBody(PostingCancelResponseBodyType value) {
        return new JAXBElement<PostingCancelResponseBodyType>(_PostingCancelResponseBody_QNAME, PostingCancelResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalRequestProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalRequestProduct")
    public JAXBElement<ReplenishmentProposalRequestProductType> createReplenishmentProposalRequestProduct(ReplenishmentProposalRequestProductType value) {
        return new JAXBElement<ReplenishmentProposalRequestProductType>(_ReplenishmentProposalRequestProduct_QNAME, ReplenishmentProposalRequestProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyPlanDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SupplyPlanDetails")
    public JAXBElement<SupplyPlanDetailsType> createSupplyPlanDetails(SupplyPlanDetailsType value) {
        return new JAXBElement<SupplyPlanDetailsType>(_SupplyPlanDetails_QNAME, SupplyPlanDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedAgreementPeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestedAgreementPeriod")
    public JAXBElement<RequestedAgreementPeriodType> createRequestedAgreementPeriod(RequestedAgreementPeriodType value) {
        return new JAXBElement<RequestedAgreementPeriodType>(_RequestedAgreementPeriod_QNAME, RequestedAgreementPeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForecastedProductMovementTransactionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ForecastedProductMovementTransaction")
    public JAXBElement<ForecastedProductMovementTransactionType> createForecastedProductMovementTransaction(ForecastedProductMovementTransactionType value) {
        return new JAXBElement<ForecastedProductMovementTransactionType>(_ForecastedProductMovementTransaction_QNAME, ForecastedProductMovementTransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedDeliveryDateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestedDeliveryDateTime")
    public JAXBElement<RequestedDeliveryDateTimeType> createRequestedDeliveryDateTime(RequestedDeliveryDateTimeType value) {
        return new JAXBElement<RequestedDeliveryDateTimeType>(_RequestedDeliveryDateTime_QNAME, RequestedDeliveryDateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PricingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Pricing")
    public JAXBElement<PricingType> createPricing(PricingType value) {
        return new JAXBElement<PricingType>(_Pricing_QNAME, PricingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceSheetPriceDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceSheetPriceData")
    public JAXBElement<PriceSheetPriceDataType> createPriceSheetPriceData(PriceSheetPriceDataType value) {
        return new JAXBElement<PriceSheetPriceDataType>(_PriceSheetPriceData_QNAME, PriceSheetPriceDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeferredDueDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeferredDueDate")
    public JAXBElement<DeferredDueDateType> createDeferredDueDate(DeferredDueDateType value) {
        return new JAXBElement<DeferredDueDateType>(_DeferredDueDate_QNAME, DeferredDueDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentDueDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentDueDate")
    public JAXBElement<PaymentDueDateType> createPaymentDueDate(PaymentDueDateType value) {
        return new JAXBElement<PaymentDueDateType>(_PaymentDueDate_QNAME, PaymentDueDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandPlanResponsePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandPlanResponsePartners")
    public JAXBElement<DemandPlanResponsePartnersType> createDemandPlanResponsePartners(DemandPlanResponsePartnersType value) {
        return new JAXBElement<DemandPlanResponsePartnersType>(_DemandPlanResponsePartners_QNAME, DemandPlanResponsePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AllowanceChargeRate")
    public JAXBElement<BigDecimal> createAllowanceChargeRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AllowanceChargeRate_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Bureau")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBureau(String value) {
        return new JAXBElement<String>(_Bureau_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippedQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShippedQuantity")
    public JAXBElement<ShippedQuantityType> createShippedQuantity(ShippedQuantityType value) {
        return new JAXBElement<ShippedQuantityType>(_ShippedQuantity_QNAME, ShippedQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderInformation")
    public JAXBElement<LoadTenderInformationType> createLoadTenderInformation(LoadTenderInformationType value) {
        return new JAXBElement<LoadTenderInformationType>(_LoadTenderInformation_QNAME, LoadTenderInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadBuildingResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadBuildingResponseBody")
    public JAXBElement<LoadBuildingResponseBodyType> createLoadBuildingResponseBody(LoadBuildingResponseBodyType value) {
        return new JAXBElement<LoadBuildingResponseBodyType>(_LoadBuildingResponseBody_QNAME, LoadBuildingResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemTaxableTotalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LineItemTaxableTotal")
    public JAXBElement<LineItemTaxableTotalType> createLineItemTaxableTotal(LineItemTaxableTotalType value) {
        return new JAXBElement<LineItemTaxableTotalType>(_LineItemTaxableTotal_QNAME, LineItemTaxableTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "NonHazardousFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNonHazardousFlag(String value) {
        return new JAXBElement<String>(_NonHazardousFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DocumentIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocumentIdentifier(String value) {
        return new JAXBElement<String>(_DocumentIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeletionStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDeletionStatus(String value) {
        return new JAXBElement<String>(_DeletionStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadingPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadingPoint")
    public JAXBElement<LoadingPointType> createLoadingPoint(LoadingPointType value) {
        return new JAXBElement<LoadingPointType>(_LoadingPoint_QNAME, LoadingPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderCreatePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderCreateProperties")
    public JAXBElement<OrderCreatePropertiesType> createOrderCreateProperties(OrderCreatePropertiesType value) {
        return new JAXBElement<OrderCreatePropertiesType>(_OrderCreateProperties_QNAME, OrderCreatePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoundingFactorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RoundingFactor")
    public JAXBElement<RoundingFactorType> createRoundingFactor(RoundingFactorType value) {
        return new JAXBElement<RoundingFactorType>(_RoundingFactor_QNAME, RoundingFactorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingStatusResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingStatusResponseDetails")
    public JAXBElement<PostingStatusResponseDetailsType> createPostingStatusResponseDetails(PostingStatusResponseDetailsType value) {
        return new JAXBElement<PostingStatusResponseDetailsType>(_PostingStatusResponseDetails_QNAME, PostingStatusResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SelfBillingFlag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSelfBillingFlag(String value) {
        return new JAXBElement<String>(_SelfBillingFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrderIssuedDateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PurchaseOrderIssuedDateRange")
    public JAXBElement<PurchaseOrderIssuedDateRangeType> createPurchaseOrderIssuedDateRange(PurchaseOrderIssuedDateRangeType value) {
        return new JAXBElement<PurchaseOrderIssuedDateRangeType>(_PurchaseOrderIssuedDateRange_QNAME, PurchaseOrderIssuedDateRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaximumQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MaximumQuantity")
    public JAXBElement<MaximumQuantityType> createMaximumQuantity(MaximumQuantityType value) {
        return new JAXBElement<MaximumQuantityType>(_MaximumQuantity_QNAME, MaximumQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectedVolumeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProjectedVolume")
    public JAXBElement<ProjectedVolumeType> createProjectedVolume(ProjectedVolumeType value) {
        return new JAXBElement<ProjectedVolumeType>(_ProjectedVolume_QNAME, ProjectedVolumeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RatedValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RatedValue")
    public JAXBElement<RatedValueType> createRatedValue(RatedValueType value) {
        return new JAXBElement<RatedValueType>(_RatedValue_QNAME, RatedValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BuyerTransactionNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBuyerTransactionNumber(String value) {
        return new JAXBElement<String>(_BuyerTransactionNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PercentDeferredPayable")
    public JAXBElement<BigDecimal> createPercentDeferredPayable(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PercentDeferredPayable_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentStatus")
    public JAXBElement<ShipmentStatusType> createShipmentStatus(ShipmentStatusType value) {
        return new JAXBElement<ShipmentStatusType>(_ShipmentStatus_QNAME, ShipmentStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceivedQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReceivedQuantity")
    public JAXBElement<ReceivedQuantityType> createReceivedQuantity(ReceivedQuantityType value) {
        return new JAXBElement<ReceivedQuantityType>(_ReceivedQuantity_QNAME, ReceivedQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadingCapacityRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadingCapacityRange")
    public JAXBElement<LoadingCapacityRangeType> createLoadingCapacityRange(LoadingCapacityRangeType value) {
        return new JAXBElement<LoadingCapacityRangeType>(_LoadingCapacityRange_QNAME, LoadingCapacityRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeferredAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeferredAmount")
    public JAXBElement<DeferredAmountType> createDeferredAmount(DeferredAmountType value) {
        return new JAXBElement<DeferredAmountType>(_DeferredAmount_QNAME, DeferredAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportOrderType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCostSupportOrderType(String value) {
        return new JAXBElement<String>(_CostSupportOrderType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LocationCode")
    public JAXBElement<LocationCodeType> createLocationCode(LocationCodeType value) {
        return new JAXBElement<LocationCodeType>(_LocationCode_QNAME, LocationCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "NumberOfCopies")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNumberOfCopies(String value) {
        return new JAXBElement<String>(_NumberOfCopies_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractProductLineItem")
    public JAXBElement<ContractProductLineItemType> createContractProductLineItem(ContractProductLineItemType value) {
        return new JAXBElement<ContractProductLineItemType>(_ContractProductLineItem_QNAME, ContractProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalRequestContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalRequestContent")
    public JAXBElement<ReplenishmentProposalRequestContentType> createReplenishmentProposalRequestContent(ReplenishmentProposalRequestContentType value) {
        return new JAXBElement<ReplenishmentProposalRequestContentType>(_ReplenishmentProposalRequestContent_QNAME, ReplenishmentProposalRequestContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Restrictions")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRestrictions(String value) {
        return new JAXBElement<String>(_Restrictions_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductFeaturesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductFeatures")
    public JAXBElement<ProductFeaturesType> createProductFeatures(ProductFeaturesType value) {
        return new JAXBElement<ProductFeaturesType>(_ProductFeatures_QNAME, ProductFeaturesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "IncidentCauseCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIncidentCauseCode(String value) {
        return new JAXBElement<String>(_IncidentCauseCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandPlanDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandPlanDetails")
    public JAXBElement<DemandPlanDetailsType> createDemandPlanDetails(DemandPlanDetailsType value) {
        return new JAXBElement<DemandPlanDetailsType>(_DemandPlanDetails_QNAME, DemandPlanDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BarCodeDataIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBarCodeDataIdentifier(String value) {
        return new JAXBElement<String>(_BarCodeDataIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ChangesAllowed")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createChangesAllowed(String value) {
        return new JAXBElement<String>(_ChangesAllowed_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRequestType(String value) {
        return new JAXBElement<String>(_RequestType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductMovementTransactionPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductMovementTransactionPartners")
    public JAXBElement<ProductMovementTransactionPartnersType> createProductMovementTransactionPartners(ProductMovementTransactionPartnersType value) {
        return new JAXBElement<ProductMovementTransactionPartnersType>(_ProductMovementTransactionPartners_QNAME, ProductMovementTransactionPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarrierReferenceInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CarrierReferenceInformation")
    public JAXBElement<CarrierReferenceInformationType> createCarrierReferenceInformation(CarrierReferenceInformationType value) {
        return new JAXBElement<CarrierReferenceInformationType>(_CarrierReferenceInformation_QNAME, CarrierReferenceInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceSheetProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceSheetProductLineItem")
    public JAXBElement<PriceSheetProductLineItemType> createPriceSheetProductLineItem(PriceSheetProductLineItemType value) {
        return new JAXBElement<PriceSheetProductLineItemType>(_PriceSheetProductLineItem_QNAME, PriceSheetProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingResponseBody")
    public JAXBElement<PostingResponseBodyType> createPostingResponseBody(PostingResponseBodyType value) {
        return new JAXBElement<PostingResponseBodyType>(_PostingResponseBody_QNAME, PostingResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PackagingType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPackagingType(String value) {
        return new JAXBElement<String>(_PackagingType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryReceiptDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryReceiptDetails")
    public JAXBElement<DeliveryReceiptDetailsType> createDeliveryReceiptDetails(DeliveryReceiptDetailsType value) {
        return new JAXBElement<DeliveryReceiptDetailsType>(_DeliveryReceiptDetails_QNAME, DeliveryReceiptDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExemptTotalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ExemptTotal")
    public JAXBElement<ExemptTotalType> createExemptTotal(ExemptTotalType value) {
        return new JAXBElement<ExemptTotalType>(_ExemptTotal_QNAME, ExemptTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CityName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCityName(String value) {
        return new JAXBElement<String>(_CityName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadBuildingMotorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadBuildingMotor")
    public JAXBElement<LoadBuildingMotorType> createLoadBuildingMotor(LoadBuildingMotorType value) {
        return new JAXBElement<LoadBuildingMotorType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadBuildingMotor"), LoadBuildingMotorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeographicFeaturesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "GeographicFeatures")
    public JAXBElement<GeographicFeaturesType> createGeographicFeatures(GeographicFeaturesType value) {
        return new JAXBElement<GeographicFeaturesType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "GeographicFeatures"), GeographicFeaturesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipNoticeListRequestPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipNoticeListRequestPartners")
    public JAXBElement<ShipNoticeListRequestPartnersType> createShipNoticeListRequestPartners(ShipNoticeListRequestPartnersType value) {
        return new JAXBElement<ShipNoticeListRequestPartnersType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipNoticeListRequestPartners"), ShipNoticeListRequestPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdjustmentAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AdjustmentAmount")
    public JAXBElement<AdjustmentAmountType> createAdjustmentAmount(AdjustmentAmountType value) {
        return new JAXBElement<AdjustmentAmountType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AdjustmentAmount"), AdjustmentAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "NetDaysDue")
    public JAXBElement<BigInteger> createNetDaysDue(BigInteger value) {
        return new JAXBElement<BigInteger>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "NetDaysDue"), BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalChangeDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalChangeDetails")
    public JAXBElement<ReplenishmentProposalChangeDetailsType> createReplenishmentProposalChangeDetails(ReplenishmentProposalChangeDetailsType value) {
        return new JAXBElement<ReplenishmentProposalChangeDetailsType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalChangeDetails"), ReplenishmentProposalChangeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortOfDischargeCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PortOfDischargeCode")
    public JAXBElement<PortOfDischargeCodeType> createPortOfDischargeCode(PortOfDischargeCodeType value) {
        return new JAXBElement<PortOfDischargeCodeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PortOfDischargeCode"), PortOfDischargeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ParentManufacturingIdentificationNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createParentManufacturingIdentificationNumber(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ParentManufacturingIdentificationNumber"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipNoticeListRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipNoticeListRequest")
    public JAXBElement<ShipNoticeListRequestType> createShipNoticeListRequest(ShipNoticeListRequestType value) {
        return new JAXBElement<ShipNoticeListRequestType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipNoticeListRequest"), ShipNoticeListRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SplitsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Splits")
    public JAXBElement<SplitsType> createSplits(SplitsType value) {
        return new JAXBElement<SplitsType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Splits"), SplitsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagingWeightType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PackagingWeight")
    public JAXBElement<PackagingWeightType> createPackagingWeight(PackagingWeightType value) {
        return new JAXBElement<PackagingWeightType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PackagingWeight"), PackagingWeightType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MSDS")
    public JAXBElement<MSDSType> createMSDS(MSDSType value) {
        return new JAXBElement<MSDSType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MSDS"), MSDSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightBillLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FreightBillLineItem")
    public JAXBElement<FreightBillLineItemType> createFreightBillLineItem(FreightBillLineItemType value) {
        return new JAXBElement<FreightBillLineItemType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FreightBillLineItem"), FreightBillLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentDateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentDateTime")
    public JAXBElement<ShipmentDateTimeType> createShipmentDateTime(ShipmentDateTimeType value) {
        return new JAXBElement<ShipmentDateTimeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentDateTime"), ShipmentDateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportRequest")
    public JAXBElement<CostSupportRequestType> createCostSupportRequest(CostSupportRequestType value) {
        return new JAXBElement<CostSupportRequestType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportRequest"), CostSupportRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnloadingPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "UnloadingPoint")
    public JAXBElement<UnloadingPointType> createUnloadingPoint(UnloadingPointType value) {
        return new JAXBElement<UnloadingPointType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "UnloadingPoint"), UnloadingPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderResponse")
    public JAXBElement<LoadTenderResponseType> createLoadTenderResponse(LoadTenderResponseType value) {
        return new JAXBElement<LoadTenderResponseType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderResponse"), LoadTenderResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryActualUsageResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryActualUsageResponseProperties")
    public JAXBElement<InventoryActualUsageResponsePropertiesType> createInventoryActualUsageResponseProperties(InventoryActualUsageResponsePropertiesType value) {
        return new JAXBElement<InventoryActualUsageResponsePropertiesType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryActualUsageResponseProperties"), InventoryActualUsageResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipNoticeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipNotice")
    public JAXBElement<ShipNoticeType> createShipNotice(ShipNoticeType value) {
        return new JAXBElement<ShipNoticeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipNotice"), ShipNoticeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContainerIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContainerIdentifier")
    public JAXBElement<ContainerIdentifierType> createContainerIdentifier(ContainerIdentifierType value) {
        return new JAXBElement<ContainerIdentifierType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContainerIdentifier"), ContainerIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceCurrencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SourceCurrency")
    public JAXBElement<SourceCurrencyType> createSourceCurrency(SourceCurrencyType value) {
        return new JAXBElement<SourceCurrencyType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SourceCurrency"), SourceCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinimumOrderQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MinimumOrderQuantity")
    public JAXBElement<MinimumOrderQuantityType> createMinimumOrderQuantity(MinimumOrderQuantityType value) {
        return new JAXBElement<MinimumOrderQuantityType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MinimumOrderQuantity"), MinimumOrderQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShelfLifeDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShelfLifeDate")
    public JAXBElement<ShelfLifeDateType> createShelfLifeDate(ShelfLifeDateType value) {
        return new JAXBElement<ShelfLifeDateType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShelfLifeDate"), ShelfLifeDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryUsageInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryUsageInformation")
    public JAXBElement<InventoryUsageInformationType> createInventoryUsageInformation(InventoryUsageInformationType value) {
        return new JAXBElement<InventoryUsageInformationType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryUsageInformation"), InventoryUsageInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CidxListDiscountDeferredIndicator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DiscountDeferredIndicator")
    public JAXBElement<CidxListDiscountDeferredIndicator> createDiscountDeferredIndicator(CidxListDiscountDeferredIndicator value) {
        return new JAXBElement<CidxListDiscountDeferredIndicator>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DiscountDeferredIndicator"), CidxListDiscountDeferredIndicator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RFQProduct")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRFQProduct(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RFQProduct"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FromDateTime")
    public JAXBElement<XMLGregorianCalendar> createFromDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FromDateTime"), XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightBillPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FreightBillPartners")
    public JAXBElement<FreightBillPartnersType> createFreightBillPartners(FreightBillPartnersType value) {
        return new JAXBElement<FreightBillPartnersType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FreightBillPartners"), FreightBillPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrossVolumeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "GrossVolume")
    public JAXBElement<GrossVolumeType> createGrossVolume(GrossVolumeType value) {
        return new JAXBElement<GrossVolumeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "GrossVolume"), GrossVolumeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityTestingReportPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QualityTestingReportProperties")
    public JAXBElement<QualityTestingReportPropertiesType> createQualityTestingReportProperties(QualityTestingReportPropertiesType value) {
        return new JAXBElement<QualityTestingReportPropertiesType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QualityTestingReportProperties"), QualityTestingReportPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentStatusBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentStatusBody")
    public JAXBElement<ShipmentStatusBodyType> createShipmentStatusBody(ShipmentStatusBodyType value) {
        return new JAXBElement<ShipmentStatusBodyType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentStatusBody"), ShipmentStatusBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentTerms")
    public JAXBElement<PaymentTermsType> createPaymentTerms(PaymentTermsType value) {
        return new JAXBElement<PaymentTermsType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentTerms"), PaymentTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemAcceptanceStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LineItemAcceptanceStatus")
    public JAXBElement<LineItemAcceptanceStatusType> createLineItemAcceptanceStatus(LineItemAcceptanceStatusType value) {
        return new JAXBElement<LineItemAcceptanceStatusType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LineItemAcceptanceStatus"), LineItemAcceptanceStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarrierWeightsPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CarrierWeightsProperties")
    public JAXBElement<CarrierWeightsPropertiesType> createCarrierWeightsProperties(CarrierWeightsPropertiesType value) {
        return new JAXBElement<CarrierWeightsPropertiesType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CarrierWeightsProperties"), CarrierWeightsPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PalletQuantityInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PalletQuantityInformation")
    public JAXBElement<PalletQuantityInformationType> createPalletQuantityInformation(PalletQuantityInformationType value) {
        return new JAXBElement<PalletQuantityInformationType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PalletQuantityInformation"), PalletQuantityInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingResponseLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingResponseLineItem")
    public JAXBElement<PostingResponseLineItemType> createPostingResponseLineItem(PostingResponseLineItemType value) {
        return new JAXBElement<PostingResponseLineItemType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingResponseLineItem"), PostingResponseLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CreditDebitIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCreditDebitIndicator(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CreditDebitIndicator"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductMovementReportPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductMovementReportProperties")
    public JAXBElement<ProductMovementReportPropertiesType> createProductMovementReportProperties(ProductMovementReportPropertiesType value) {
        return new JAXBElement<ProductMovementReportPropertiesType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductMovementReportProperties"), ProductMovementReportPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharacteristicCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CharacteristicCode")
    public JAXBElement<CharacteristicCodeType> createCharacteristicCode(CharacteristicCodeType value) {
        return new JAXBElement<CharacteristicCodeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CharacteristicCode"), CharacteristicCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TotalLineItems")
    public JAXBElement<BigInteger> createTotalLineItems(BigInteger value) {
        return new JAXBElement<BigInteger>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TotalLineItems"), BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingStatusResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingStatusResponseBody")
    public JAXBElement<PostingStatusResponseBodyType> createPostingStatusResponseBody(PostingStatusResponseBodyType value) {
        return new JAXBElement<PostingStatusResponseBodyType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingStatusResponseBody"), PostingStatusResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipNoticeDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipNoticeDetails")
    public JAXBElement<ShipNoticeDetailsType> createShipNoticeDetails(ShipNoticeDetailsType value) {
        return new JAXBElement<ShipNoticeDetailsType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipNoticeDetails"), ShipNoticeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Trademark")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTrademark(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Trademark"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UNSpecialRequirementsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "UNSpecialRequirements")
    public JAXBElement<UNSpecialRequirementsType> createUNSpecialRequirements(UNSpecialRequirementsType value) {
        return new JAXBElement<UNSpecialRequirementsType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "UNSpecialRequirements"), UNSpecialRequirementsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MeasurementValue")
    public JAXBElement<Double> createMeasurementValue(Double value) {
        return new JAXBElement<Double>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MeasurementValue"), Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCatalogUpdateProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductCatalogUpdateProductLineItem")
    public JAXBElement<ProductCatalogUpdateProductLineItemType> createProductCatalogUpdateProductLineItem(ProductCatalogUpdateProductLineItemType value) {
        return new JAXBElement<ProductCatalogUpdateProductLineItemType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductCatalogUpdateProductLineItem"), ProductCatalogUpdateProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HandlingDescription")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createHandlingDescription(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HandlingDescription"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SupplierMarketSegment")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSupplierMarketSegment(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SupplierMarketSegment"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PartOfSupplyChainCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPartOfSupplyChainCode(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PartOfSupplyChainCode"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyerAccountDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BuyerAccountDetails")
    public JAXBElement<BuyerAccountDetailsType> createBuyerAccountDetails(BuyerAccountDetailsType value) {
        return new JAXBElement<BuyerAccountDetailsType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BuyerAccountDetails"), BuyerAccountDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingStatusResponseIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPostingStatusResponseIdentifier(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingStatusResponseIdentifier"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingChangeBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingChangeBody")
    public JAXBElement<PostingChangeBodyType> createPostingChangeBody(PostingChangeBodyType value) {
        return new JAXBElement<PostingChangeBodyType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingChangeBody"), PostingChangeBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductName(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "NumberOfOriginals")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNumberOfOriginals(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "NumberOfOriginals"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneGeographiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ZoneGeographies")
    public JAXBElement<ZoneGeographiesType> createZoneGeographies(ZoneGeographiesType value) {
        return new JAXBElement<ZoneGeographiesType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ZoneGeographies"), ZoneGeographiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplenishmentProposalRequestBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalRequestBody")
    public JAXBElement<ReplenishmentProposalRequestBodyType> createReplenishmentProposalRequestBody(ReplenishmentProposalRequestBodyType value) {
        return new JAXBElement<ReplenishmentProposalRequestBodyType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalRequestBody"), ReplenishmentProposalRequestBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PackagingDisposition")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPackagingDisposition(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PackagingDisposition"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryConfirmationProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryConfirmationProductLineItem")
    public JAXBElement<DeliveryConfirmationProductLineItemType> createDeliveryConfirmationProductLineItem(DeliveryConfirmationProductLineItemType value) {
        return new JAXBElement<DeliveryConfirmationProductLineItemType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryConfirmationProductLineItem"), DeliveryConfirmationProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Section7Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSection7Name(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Section7Name"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateUnitPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RateUnitPrice")
    public JAXBElement<RateUnitPriceType> createRateUnitPrice(RateUnitPriceType value) {
        return new JAXBElement<RateUnitPriceType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RateUnitPrice"), RateUnitPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LetterOfCreditQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LetterOfCreditQuantity")
    public JAXBElement<LetterOfCreditQuantityType> createLetterOfCreditQuantity(LetterOfCreditQuantityType value) {
        return new JAXBElement<LetterOfCreditQuantityType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LetterOfCreditQuantity"), LetterOfCreditQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipNoticeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipNoticeList")
    public JAXBElement<ShipNoticeListType> createShipNoticeList(ShipNoticeListType value) {
        return new JAXBElement<ShipNoticeListType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipNoticeList"), ShipNoticeListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "NumberFullPallets")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNumberFullPallets(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "NumberFullPallets"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PackagingLabel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPackagingLabel(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PackagingLabel"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractPaymentTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractPaymentTerms")
    public JAXBElement<ContractPaymentTermsType> createContractPaymentTerms(ContractPaymentTermsType value) {
        return new JAXBElement<ContractPaymentTermsType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractPaymentTerms"), ContractPaymentTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrderIssuedDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PurchaseOrderIssuedDate")
    public JAXBElement<PurchaseOrderIssuedDateType> createPurchaseOrderIssuedDate(PurchaseOrderIssuedDateType value) {
        return new JAXBElement<PurchaseOrderIssuedDateType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PurchaseOrderIssuedDate"), PurchaseOrderIssuedDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialInstructionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SpecialInstructions")
    public JAXBElement<SpecialInstructionsType> createSpecialInstructions(SpecialInstructionsType value) {
        return new JAXBElement<SpecialInstructionsType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SpecialInstructions"), SpecialInstructionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MarketPlaceSellerIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMarketPlaceSellerIdentifier(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MarketPlaceSellerIdentifier"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestingDocumentDateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestingDocumentDateTime")
    public JAXBElement<RequestingDocumentDateTimeType> createRequestingDocumentDateTime(RequestingDocumentDateTimeType value) {
        return new JAXBElement<RequestingDocumentDateTimeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestingDocumentDateTime"), RequestingDocumentDateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportCreditResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportCreditResponseBody")
    public JAXBElement<CostSupportCreditResponseBodyType> createCostSupportCreditResponseBody(CostSupportCreditResponseBodyType value) {
        return new JAXBElement<CostSupportCreditResponseBodyType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportCreditResponseBody"), CostSupportCreditResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepaidContractInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PrepaidContractInformation")
    public JAXBElement<PrepaidContractInformationType> createPrepaidContractInformation(PrepaidContractInformationType value) {
        return new JAXBElement<PrepaidContractInformationType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PrepaidContractInformation"), PrepaidContractInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryReceiptIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDeliveryReceiptIdentifier(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryReceiptIdentifier"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalAmountPaidType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TotalAmountPaid")
    public JAXBElement<TotalAmountPaidType> createTotalAmountPaid(TotalAmountPaidType value) {
        return new JAXBElement<TotalAmountPaidType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TotalAmountPaid"), TotalAmountPaidType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualificationRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QualificationRequestDetails")
    public JAXBElement<QualificationRequestDetailsType> createQualificationRequestDetails(QualificationRequestDetailsType value) {
        return new JAXBElement<QualificationRequestDetailsType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QualificationRequestDetails"), QualificationRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingServiceLevelCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShippingServiceLevelCode")
    public JAXBElement<ShippingServiceLevelCodeType> createShippingServiceLevelCode(ShippingServiceLevelCodeType value) {
        return new JAXBElement<ShippingServiceLevelCodeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShippingServiceLevelCode"), ShippingServiceLevelCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HazardousShipmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HazardousShipment")
    public JAXBElement<HazardousShipmentType> createHazardousShipment(HazardousShipmentType value) {
        return new JAXBElement<HazardousShipmentType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HazardousShipment"), HazardousShipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplyPlanPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SupplyPlanProperties")
    public JAXBElement<SupplyPlanPropertiesType> createSupplyPlanProperties(SupplyPlanPropertiesType value) {
        return new JAXBElement<SupplyPlanPropertiesType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SupplyPlanProperties"), SupplyPlanPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCardInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CreditCardInformation")
    public JAXBElement<CreditCardInformationType> createCreditCardInformation(CreditCardInformationType value) {
        return new JAXBElement<CreditCardInformationType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CreditCardInformation"), CreditCardInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryOfOrginCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CountryOfOrginCode")
    public JAXBElement<CountryOfOrginCodeType> createCountryOfOrginCode(CountryOfOrginCodeType value) {
        return new JAXBElement<CountryOfOrginCodeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CountryOfOrginCode"), CountryOfOrginCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ResponseStatus")
    public JAXBElement<ResponseStatusType> createResponseStatus(ResponseStatusType value) {
        return new JAXBElement<ResponseStatusType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ResponseStatus"), ResponseStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductIdentification")
    public JAXBElement<ProductIdentificationType> createProductIdentification(ProductIdentificationType value) {
        return new JAXBElement<ProductIdentificationType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductIdentification"), ProductIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingCancelResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingCancelResponseDetails")
    public JAXBElement<PostingCancelResponseDetailsType> createPostingCancelResponseDetails(PostingCancelResponseDetailsType value) {
        return new JAXBElement<PostingCancelResponseDetailsType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingCancelResponseDetails"), PostingCancelResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCatalogUpdatePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductCatalogUpdatePartners")
    public JAXBElement<ProductCatalogUpdatePartnersType> createProductCatalogUpdatePartners(ProductCatalogUpdatePartnersType value) {
        return new JAXBElement<ProductCatalogUpdatePartnersType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductCatalogUpdatePartners"), ProductCatalogUpdatePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractResponseBody")
    public JAXBElement<ContractResponseBodyType> createContractResponseBody(ContractResponseBodyType value) {
        return new JAXBElement<ContractResponseBodyType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractResponseBody"), ContractResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LetterOfCreditDateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LetterOfCreditDateTime")
    public JAXBElement<LetterOfCreditDateTimeType> createLetterOfCreditDateTime(LetterOfCreditDateTimeType value) {
        return new JAXBElement<LetterOfCreditDateTimeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LetterOfCreditDateTime"), LetterOfCreditDateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlledTemperatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ControlledTemperature")
    public JAXBElement<ControlledTemperatureType> createControlledTemperature(ControlledTemperatureType value) {
        return new JAXBElement<ControlledTemperatureType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ControlledTemperature"), ControlledTemperatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmergencyResponseContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "EmergencyResponseContact")
    public JAXBElement<EmergencyResponseContactType> createEmergencyResponseContact(EmergencyResponseContactType value) {
        return new JAXBElement<EmergencyResponseContactType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "EmergencyResponseContact"), EmergencyResponseContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InlandOriginPointCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InlandOriginPointCode")
    public JAXBElement<InlandOriginPointCodeType> createInlandOriginPointCode(InlandOriginPointCodeType value) {
        return new JAXBElement<InlandOriginPointCodeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InlandOriginPointCode"), InlandOriginPointCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderRailDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderRailDetails")
    public JAXBElement<LoadTenderRailDetailsType> createLoadTenderRailDetails(LoadTenderRailDetailsType value) {
        return new JAXBElement<LoadTenderRailDetailsType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderRailDetails"), LoadTenderRailDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTenderResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderResponseDetails")
    public JAXBElement<LoadTenderResponseDetailsType> createLoadTenderResponseDetails(LoadTenderResponseDetailsType value) {
        return new JAXBElement<LoadTenderResponseDetailsType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderResponseDetails"), LoadTenderResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AllowanceChargeIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAllowanceChargeIndicator(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AllowanceChargeIndicator"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineOrderStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LineOrderStatusCode")
    public JAXBElement<LineOrderStatusCodeType> createLineOrderStatusCode(LineOrderStatusCodeType value) {
        return new JAXBElement<LineOrderStatusCodeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LineOrderStatusCode"), LineOrderStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualityTestingReportBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QualityTestingReportBody")
    public JAXBElement<QualityTestingReportBodyType> createQualityTestingReportBody(QualityTestingReportBodyType value) {
        return new JAXBElement<QualityTestingReportBodyType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QualityTestingReportBody"), QualityTestingReportBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketPlaceInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MarketPlaceInformation")
    public JAXBElement<MarketPlaceInformationType> createMarketPlaceInformation(MarketPlaceInformationType value) {
        return new JAXBElement<MarketPlaceInformationType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MarketPlaceInformation"), MarketPlaceInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryInTankType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryInTank")
    public JAXBElement<InventoryInTankType> createInventoryInTank(InventoryInTankType value) {
        return new JAXBElement<InventoryInTankType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryInTank"), InventoryInTankType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceAndAvailabilityResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceAndAvailabilityResponse")
    public JAXBElement<PriceAndAvailabilityResponseType> createPriceAndAvailabilityResponse(PriceAndAvailabilityResponseType value) {
        return new JAXBElement<PriceAndAvailabilityResponseType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceAndAvailabilityResponse"), PriceAndAvailabilityResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HandlingUnitReference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createHandlingUnitReference(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HandlingUnitReference"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeferredType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Deferred")
    public JAXBElement<DeferredType> createDeferred(DeferredType value) {
        return new JAXBElement<DeferredType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Deferred"), DeferredType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseStatusReasonIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ResponseStatusReasonIdentifier")
    public JAXBElement<ResponseStatusReasonIdentifierType> createResponseStatusReasonIdentifier(ResponseStatusReasonIdentifierType value) {
        return new JAXBElement<ResponseStatusReasonIdentifierType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ResponseStatusReasonIdentifier"), ResponseStatusReasonIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrossWeightType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "GrossWeight")
    public JAXBElement<GrossWeightType> createGrossWeight(GrossWeightType value) {
        return new JAXBElement<GrossWeightType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "GrossWeight"), GrossWeightType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductMovementReportDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductMovementReportDetails")
    public JAXBElement<ProductMovementReportDetailsType> createProductMovementReportDetails(ProductMovementReportDetailsType value) {
        return new JAXBElement<ProductMovementReportDetailsType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductMovementReportDetails"), ProductMovementReportDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderCreatePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderCreatePartners")
    public JAXBElement<OrderCreatePartnersType> createOrderCreatePartners(OrderCreatePartnersType value) {
        return new JAXBElement<OrderCreatePartnersType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderCreatePartners"), OrderCreatePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceResponsePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InvoiceResponsePartners")
    public JAXBElement<InvoiceResponsePartnersType> createInvoiceResponsePartners(InvoiceResponsePartnersType value) {
        return new JAXBElement<InvoiceResponsePartnersType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InvoiceResponsePartners"), InvoiceResponsePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduledPackDateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ScheduledPackDateTime")
    public JAXBElement<ScheduledPackDateTimeType> createScheduledPackDateTime(ScheduledPackDateTimeType value) {
        return new JAXBElement<ScheduledPackDateTimeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ScheduledPackDateTime"), ScheduledPackDateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryActualUsageResponsePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryActualUsageResponsePartners")
    public JAXBElement<InventoryActualUsageResponsePartnersType> createInventoryActualUsageResponsePartners(InventoryActualUsageResponsePartnersType value) {
        return new JAXBElement<InventoryActualUsageResponsePartnersType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryActualUsageResponsePartners"), InventoryActualUsageResponsePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateOfAnalysisType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CertificateOfAnalysis")
    public JAXBElement<CertificateOfAnalysisType> createCertificateOfAnalysis(CertificateOfAnalysisType value) {
        return new JAXBElement<CertificateOfAnalysisType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CertificateOfAnalysis"), CertificateOfAnalysisType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReferenceItem")
    public JAXBElement<BigInteger> createReferenceItem(BigInteger value) {
        return new JAXBElement<BigInteger>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReferenceItem"), BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CidxListPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceType")
    public JAXBElement<CidxListPriceType> createPriceType(CidxListPriceType value) {
        return new JAXBElement<CidxListPriceType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceType"), CidxListPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryActualUsageBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryActualUsageBody")
    public JAXBElement<InventoryActualUsageBodyType> createInventoryActualUsageBody(InventoryActualUsageBodyType value) {
        return new JAXBElement<InventoryActualUsageBodyType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryActualUsageBody"), InventoryActualUsageBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmergencyScheduleCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "EmergencyScheduleCode")
    public JAXBElement<EmergencyScheduleCodeType> createEmergencyScheduleCode(EmergencyScheduleCodeType value) {
        return new JAXBElement<EmergencyScheduleCodeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "EmergencyScheduleCode"), EmergencyScheduleCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SourceSubqualifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSourceSubqualifier(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SourceSubqualifier"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceTemperatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReferenceTemperature")
    public JAXBElement<ReferenceTemperatureType> createReferenceTemperature(ReferenceTemperatureType value) {
        return new JAXBElement<ReferenceTemperatureType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReferenceTemperature"), ReferenceTemperatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReplenishmentProposalInformation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReplenishmentProposalInformation(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReplenishmentProposalInformation"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "MarpolShipType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMarpolShipType(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "MarpolShipType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightBillIssueDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FreightBillIssueDate")
    public JAXBElement<FreightBillIssueDateType> createFreightBillIssueDate(FreightBillIssueDateType value) {
        return new JAXBElement<FreightBillIssueDateType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FreightBillIssueDate"), FreightBillIssueDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "IntermodalServiceType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIntermodalServiceType(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "IntermodalServiceType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentStatusSearchValue")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createShipmentStatusSearchValue(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentStatusSearchValue"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarrierWeightsBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CarrierWeightsBody")
    public JAXBElement<CarrierWeightsBodyType> createCarrierWeightsBody(CarrierWeightsBodyType value) {
        return new JAXBElement<CarrierWeightsBodyType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CarrierWeightsBody"), CarrierWeightsBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReceiptCondition")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReceiptCondition(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReceiptCondition"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PartnerIdentifier")
    public JAXBElement<PartnerIdentifierType> createPartnerIdentifier(PartnerIdentifierType value) {
        return new JAXBElement<PartnerIdentifierType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PartnerIdentifier"), PartnerIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTestedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DateTested")
    public JAXBElement<DateTestedType> createDateTested(DateTestedType value) {
        return new JAXBElement<DateTestedType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DateTested"), DateTestedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentMethodOfPaymentCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentMethodOfPaymentCode")
    public JAXBElement<ShipmentMethodOfPaymentCodeType> createShipmentMethodOfPaymentCode(ShipmentMethodOfPaymentCodeType value) {
        return new JAXBElement<ShipmentMethodOfPaymentCodeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentMethodOfPaymentCode"), ShipmentMethodOfPaymentCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceEffectiveDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceEffectiveDate")
    public JAXBElement<PriceEffectiveDateType> createPriceEffectiveDate(PriceEffectiveDateType value) {
        return new JAXBElement<PriceEffectiveDateType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceEffectiveDate"), PriceEffectiveDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CidxListOperator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ExchangeOperator")
    public JAXBElement<CidxListOperator> createExchangeOperator(CidxListOperator value) {
        return new JAXBElement<CidxListOperator>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ExchangeOperator"), CidxListOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ResponseIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createResponseIdentifier(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ResponseIdentifier"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ConsolidationType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createConsolidationType(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ConsolidationType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContactInformation")
    public JAXBElement<ContactInformationType> createContactInformation(ContactInformationType value) {
        return new JAXBElement<ContactInformationType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContactInformation"), ContactInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SerialNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSerialNumber(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SerialNumber"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusListRequestPartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusListRequestPartners")
    public JAXBElement<OrderStatusListRequestPartnersType> createOrderStatusListRequestPartners(OrderStatusListRequestPartnersType value) {
        return new JAXBElement<OrderStatusListRequestPartnersType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusListRequestPartners"), OrderStatusListRequestPartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportRequestChangePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportRequestChangeProperties")
    public JAXBElement<CostSupportRequestChangePropertiesType> createCostSupportRequestChangeProperties(CostSupportRequestChangePropertiesType value) {
        return new JAXBElement<CostSupportRequestChangePropertiesType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportRequestChangeProperties"), CostSupportRequestChangePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "EquipmentIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEquipmentIdentifier(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "EquipmentIdentifier"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportCreditResponsePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportCreditResponsePartners")
    public JAXBElement<CostSupportCreditResponsePartnersType> createCostSupportCreditResponsePartners(CostSupportCreditResponsePartnersType value) {
        return new JAXBElement<CostSupportCreditResponsePartnersType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportCreditResponsePartners"), CostSupportCreditResponsePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportCreditResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportCreditResponseDetails")
    public JAXBElement<CostSupportCreditResponseDetailsType> createCostSupportCreditResponseDetails(CostSupportCreditResponseDetailsType value) {
        return new JAXBElement<CostSupportCreditResponseDetailsType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportCreditResponseDetails"), CostSupportCreditResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherPartnerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OtherPartner")
    public JAXBElement<OtherPartnerType> createOtherPartner(OtherPartnerType value) {
        return new JAXBElement<OtherPartnerType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OtherPartner"), OtherPartnerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortOfLoadingCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PortOfLoadingCode")
    public JAXBElement<PortOfLoadingCodeType> createPortOfLoadingCode(PortOfLoadingCodeType value) {
        return new JAXBElement<PortOfLoadingCodeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PortOfLoadingCode"), PortOfLoadingCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemTotalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LineItemTotal")
    public JAXBElement<LineItemTotalType> createLineItemTotal(LineItemTotalType value) {
        return new JAXBElement<LineItemTotalType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LineItemTotal"), LineItemTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceStructureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceStructure")
    public JAXBElement<PriceStructureType> createPriceStructure(PriceStructureType value) {
        return new JAXBElement<PriceStructureType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceStructure"), PriceStructureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadBuildingMotorBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadBuildingMotorBody")
    public JAXBElement<LoadBuildingMotorBodyType> createLoadBuildingMotorBody(LoadBuildingMotorBodyType value) {
        return new JAXBElement<LoadBuildingMotorBodyType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadBuildingMotorBody"), LoadBuildingMotorBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipNoticePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipNoticePartners")
    public JAXBElement<ShipNoticePartnersType> createShipNoticePartners(ShipNoticePartnersType value) {
        return new JAXBElement<ShipNoticePartnersType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipNoticePartners"), ShipNoticePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "EmptyTankClassification")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEmptyTankClassification(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "EmptyTankClassification"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContactName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createContactName(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContactName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CurrencyUnit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCurrencyUnit(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CurrencyUnit"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductSpecificationValue")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductSpecificationValue(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductSpecificationValue"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CidxListLoadTenderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "LoadTenderStatus")
    public JAXBElement<CidxListLoadTenderStatus> createLoadTenderStatus(CidxListLoadTenderStatus value) {
        return new JAXBElement<CidxListLoadTenderStatus>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "LoadTenderStatus"), CidxListLoadTenderStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProperShippingName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProperShippingName(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProperShippingName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForecastLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ForecastLineItem")
    public JAXBElement<ForecastLineItemType> createForecastLineItem(ForecastLineItemType value) {
        return new JAXBElement<ForecastLineItemType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ForecastLineItem"), ForecastLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceSheetDescription")
    public JAXBElement<String> createPriceSheetDescription(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceSheetDescription"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductMovementProductLineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductMovementProductLineItem")
    public JAXBElement<ProductMovementProductLineItemType> createProductMovementProductLineItem(ProductMovementProductLineItemType value) {
        return new JAXBElement<ProductMovementProductLineItemType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductMovementProductLineItem"), ProductMovementProductLineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PercentageBasisType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PercentageBasis")
    public JAXBElement<PercentageBasisType> createPercentageBasis(PercentageBasisType value) {
        return new JAXBElement<PercentageBasisType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PercentageBasis"), PercentageBasisType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderStatusRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderStatusRequestDetails")
    public JAXBElement<OrderStatusRequestDetailsType> createOrderStatusRequestDetails(OrderStatusRequestDetailsType value) {
        return new JAXBElement<OrderStatusRequestDetailsType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderStatusRequestDetails"), OrderStatusRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AircraftLimitations")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAircraftLimitations(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AircraftLimitations"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarrierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Carrier")
    public JAXBElement<CarrierType> createCarrier(CarrierType value) {
        return new JAXBElement<CarrierType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Carrier"), CarrierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryReceiptResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryReceiptResponseDetails")
    public JAXBElement<DeliveryReceiptResponseDetailsType> createDeliveryReceiptResponseDetails(DeliveryReceiptResponseDetailsType value) {
        return new JAXBElement<DeliveryReceiptResponseDetailsType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryReceiptResponseDetails"), DeliveryReceiptResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AccountInformation")
    public JAXBElement<AccountInformationType> createAccountInformation(AccountInformationType value) {
        return new JAXBElement<AccountInformationType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AccountInformation"), AccountInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscountsDueDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DiscountsDueDate")
    public JAXBElement<DiscountsDueDateType> createDiscountsDueDate(DiscountsDueDateType value) {
        return new JAXBElement<DiscountsDueDateType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DiscountsDueDate"), DiscountsDueDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditResponseStatusInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CreditResponseStatusInformation")
    public JAXBElement<CreditResponseStatusInformationType> createCreditResponseStatusInformation(CreditResponseStatusInformationType value) {
        return new JAXBElement<CreditResponseStatusInformationType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CreditResponseStatusInformation"), CreditResponseStatusInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackingGroupCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PackingGroupCode")
    public JAXBElement<PackingGroupCodeType> createPackingGroupCode(PackingGroupCodeType value) {
        return new JAXBElement<PackingGroupCodeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PackingGroupCode"), PackingGroupCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorderEntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BorderEntry")
    public JAXBElement<BorderEntryType> createBorderEntry(BorderEntryType value) {
        return new JAXBElement<BorderEntryType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BorderEntry"), BorderEntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TransportName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTransportName(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TransportName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandlingStartDateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HandlingStartDateTime")
    public JAXBElement<HandlingStartDateTimeType> createHandlingStartDateTime(HandlingStartDateTimeType value) {
        return new JAXBElement<HandlingStartDateTimeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HandlingStartDateTime"), HandlingStartDateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuantitativeResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QuantitativeResult")
    public JAXBElement<QuantitativeResultType> createQuantitativeResult(QuantitativeResultType value) {
        return new JAXBElement<QuantitativeResultType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QuantitativeResult"), QuantitativeResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentFormatCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentFormatCode")
    public JAXBElement<PaymentFormatCodeType> createPaymentFormatCode(PaymentFormatCodeType value) {
        return new JAXBElement<PaymentFormatCodeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentFormatCode"), PaymentFormatCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContainerSerialInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContainerSerialInformation")
    public JAXBElement<ContainerSerialInformationType> createContainerSerialInformation(ContainerSerialInformationType value) {
        return new JAXBElement<ContainerSerialInformationType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContainerSerialInformation"), ContainerSerialInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchExpirationDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BatchExpirationDate")
    public JAXBElement<BatchExpirationDateType> createBatchExpirationDate(BatchExpirationDateType value) {
        return new JAXBElement<BatchExpirationDateType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BatchExpirationDate"), BatchExpirationDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentDetailPropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PaymentDetailProperties")
    public JAXBElement<PaymentDetailPropertiesType> createPaymentDetailProperties(PaymentDetailPropertiesType value) {
        return new JAXBElement<PaymentDetailPropertiesType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PaymentDetailProperties"), PaymentDetailPropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyerProductInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BuyerProductInformation")
    public JAXBElement<BuyerProductInformationType> createBuyerProductInformation(BuyerProductInformationType value) {
        return new JAXBElement<BuyerProductInformationType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BuyerProductInformation"), BuyerProductInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportMethodCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TransportMethodCode")
    public JAXBElement<TransportMethodCodeType> createTransportMethodCode(TransportMethodCodeType value) {
        return new JAXBElement<TransportMethodCodeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TransportMethodCode"), TransportMethodCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyerReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "BuyerReference")
    public JAXBElement<BuyerReferenceType> createBuyerReference(BuyerReferenceType value) {
        return new JAXBElement<BuyerReferenceType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "BuyerReference"), BuyerReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestForQuotePartnersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RequestForQuotePartners")
    public JAXBElement<RequestForQuotePartnersType> createRequestForQuotePartners(RequestForQuotePartnersType value) {
        return new JAXBElement<RequestForQuotePartnersType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RequestForQuotePartners"), RequestForQuotePartnersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalPaymentAmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TotalPaymentAmount")
    public JAXBElement<TotalPaymentAmountType> createTotalPaymentAmount(TotalPaymentAmountType value) {
        return new JAXBElement<TotalPaymentAmountType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TotalPaymentAmount"), TotalPaymentAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HazardousRelevantQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HazardousRelevantQuantity")
    public JAXBElement<HazardousRelevantQuantityType> createHazardousRelevantQuantity(HazardousRelevantQuantityType value) {
        return new JAXBElement<HazardousRelevantQuantityType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HazardousRelevantQuantity"), HazardousRelevantQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderingInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderingInformation")
    public JAXBElement<OrderingInformationType> createOrderingInformation(OrderingInformationType value) {
        return new JAXBElement<OrderingInformationType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderingInformation"), OrderingInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PercentActive")
    public JAXBElement<BigDecimal> createPercentActive(BigDecimal value) {
        return new JAXBElement<BigDecimal>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PercentActive"), BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "StartTime")
    public JAXBElement<XMLGregorianCalendar> createStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "StartTime"), XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "URL")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createURL(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "URL"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ContractDetails")
    public JAXBElement<ContractDetailsType> createContractDetails(ContractDetailsType value) {
        return new JAXBElement<ContractDetailsType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ContractDetails"), ContractDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryProduct")
    public JAXBElement<InventoryProductType> createInventoryProduct(InventoryProductType value) {
        return new JAXBElement<InventoryProductType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryProduct"), InventoryProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DateOfMonth")
    public JAXBElement<Integer> createDateOfMonth(Integer value) {
        return new JAXBElement<Integer>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DateOfMonth"), Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TechnicalSpecificationsURL")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTechnicalSpecificationsURL(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TechnicalSpecificationsURL"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "QualitativeText")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createQualitativeText(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "QualitativeText"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "Comment")
    public JAXBElement<CommentType> createComment(CommentType value) {
        return new JAXBElement<CommentType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "Comment"), CommentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryActualUsageResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InventoryActualUsageResponse")
    public JAXBElement<InventoryActualUsageResponseType> createInventoryActualUsageResponse(InventoryActualUsageResponseType value) {
        return new JAXBElement<InventoryActualUsageResponseType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InventoryActualUsageResponse"), InventoryActualUsageResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipmentDate")
    public JAXBElement<ShipmentDateType> createShipmentDate(ShipmentDateType value) {
        return new JAXBElement<ShipmentDateType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipmentDate"), ShipmentDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ManufacturingIdentificationType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createManufacturingIdentificationType(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ManufacturingIdentificationType"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemandPlanBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DemandPlanBody")
    public JAXBElement<DemandPlanBodyType> createDemandPlanBody(DemandPlanBodyType value) {
        return new JAXBElement<DemandPlanBodyType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DemandPlanBody"), DemandPlanBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderFeaturesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderFeatures")
    public JAXBElement<OrderFeaturesType> createOrderFeatures(OrderFeaturesType value) {
        return new JAXBElement<OrderFeaturesType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderFeatures"), OrderFeaturesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrderTypeCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PurchaseOrderTypeCode")
    public JAXBElement<PurchaseOrderTypeCodeType> createPurchaseOrderTypeCode(PurchaseOrderTypeCodeType value) {
        return new JAXBElement<PurchaseOrderTypeCodeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PurchaseOrderTypeCode"), PurchaseOrderTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PricingLumpSumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PricingLumpSum")
    public JAXBElement<PricingLumpSumType> createPricingLumpSum(PricingLumpSumType value) {
        return new JAXBElement<PricingLumpSumType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PricingLumpSum"), PricingLumpSumType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "AcceptanceNotificationStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAcceptanceNotificationStatus(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "AcceptanceNotificationStatus"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "FinancialInstitutionName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFinancialInstitutionName(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "FinancialInstitutionName"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "StatusReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStatusReason(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "StatusReason"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TestMethod")
    public JAXBElement<TestMethodType> createTestMethod(TestMethodType value) {
        return new JAXBElement<TestMethodType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TestMethod"), TestMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipNoticeBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipNoticeBody")
    public JAXBElement<ShipNoticeBodyType> createShipNoticeBody(ShipNoticeBodyType value) {
        return new JAXBElement<ShipNoticeBodyType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipNoticeBody"), ShipNoticeBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ReceiptNoticeStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReceiptNoticeStatus(String value) {
        return new JAXBElement<String>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ReceiptNoticeStatus"), String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductIdentifier")
    public JAXBElement<ProductIdentifierType> createProductIdentifier(ProductIdentifierType value) {
        return new JAXBElement<ProductIdentifierType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductIdentifier"), ProductIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecondCurrencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "SecondCurrency")
    public JAXBElement<SecondCurrencyType> createSecondCurrency(SecondCurrencyType value) {
        return new JAXBElement<SecondCurrencyType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "SecondCurrency"), SecondCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductFormulaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ProductFormula")
    public JAXBElement<ProductFormulaType> createProductFormula(ProductFormulaType value) {
        return new JAXBElement<ProductFormulaType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ProductFormula"), ProductFormulaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "TransportInformation")
    public JAXBElement<TransportInformationType> createTransportInformation(TransportInformationType value) {
        return new JAXBElement<TransportInformationType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "TransportInformation"), TransportInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponseBodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderResponseBody")
    public JAXBElement<OrderResponseBodyType> createOrderResponseBody(OrderResponseBodyType value) {
        return new JAXBElement<OrderResponseBodyType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderResponseBody"), OrderResponseBodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CostSupportCreditRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "CostSupportCreditRequest")
    public JAXBElement<CostSupportCreditRequestType> createCostSupportCreditRequest(CostSupportCreditRequestType value) {
        return new JAXBElement<CostSupportCreditRequestType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "CostSupportCreditRequest"), CostSupportCreditRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceTotalsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InvoiceTotals")
    public JAXBElement<InvoiceTotalsType> createInvoiceTotals(InvoiceTotalsType value) {
        return new JAXBElement<InvoiceTotalsType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InvoiceTotals"), InvoiceTotalsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceAndAvailabilityResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceAndAvailabilityResponseDetails")
    public JAXBElement<PriceAndAvailabilityResponseDetailsType> createPriceAndAvailabilityResponseDetails(PriceAndAvailabilityResponseDetailsType value) {
        return new JAXBElement<PriceAndAvailabilityResponseDetailsType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceAndAvailabilityResponseDetails"), PriceAndAvailabilityResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingChangePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingChangeProperties")
    public JAXBElement<PostingChangePropertiesType> createPostingChangeProperties(PostingChangePropertiesType value) {
        return new JAXBElement<PostingChangePropertiesType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingChangeProperties"), PostingChangePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateDistanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "RateDistance")
    public JAXBElement<RateDistanceType> createRateDistance(RateDistanceType value) {
        return new JAXBElement<RateDistanceType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "RateDistance"), RateDistanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoicePreferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "InvoicePreference")
    public JAXBElement<InvoicePreferenceType> createInvoicePreference(InvoicePreferenceType value) {
        return new JAXBElement<InvoicePreferenceType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "InvoicePreference"), InvoicePreferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipWithPurchaseOrderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShipWithPurchaseOrder")
    public JAXBElement<ShipWithPurchaseOrderType> createShipWithPurchaseOrder(ShipWithPurchaseOrderType value) {
        return new JAXBElement<ShipWithPurchaseOrderType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShipWithPurchaseOrder"), ShipWithPurchaseOrderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryPerformanceIncidentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DeliveryPerformanceIncident")
    public JAXBElement<DeliveryPerformanceIncidentType> createDeliveryPerformanceIncident(DeliveryPerformanceIncidentType value) {
        return new JAXBElement<DeliveryPerformanceIncidentType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DeliveryPerformanceIncident"), DeliveryPerformanceIncidentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "DateTime")
    public JAXBElement<DateTimeType> createDateTime(DateTimeType value) {
        return new JAXBElement<DateTimeType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "DateTime"), DateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceBasisType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PriceBasis")
    public JAXBElement<PriceBasisType> createPriceBasis(PriceBasisType value) {
        return new JAXBElement<PriceBasisType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PriceBasis"), PriceBasisType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingLabelNumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "ShippingLabelNumber")
    public JAXBElement<ShippingLabelNumberType> createShippingLabelNumber(ShippingLabelNumberType value) {
        return new JAXBElement<ShippingLabelNumberType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "ShippingLabelNumber"), ShippingLabelNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HazmatShippingNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "HazmatShippingName")
    public JAXBElement<HazmatShippingNameType> createHazmatShippingName(HazmatShippingNameType value) {
        return new JAXBElement<HazmatShippingNameType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "HazmatShippingName"), HazmatShippingNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostingAcceptResponsePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "PostingAcceptResponseProperties")
    public JAXBElement<PostingAcceptResponsePropertiesType> createPostingAcceptResponseProperties(PostingAcceptResponsePropertiesType value) {
        return new JAXBElement<PostingAcceptResponsePropertiesType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "PostingAcceptResponseProperties"), PostingAcceptResponsePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderableIncrementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cidx:names:specification:ces:schema:all:5:0", name = "OrderableIncrement")
    public JAXBElement<OrderableIncrementType> createOrderableIncrement(OrderableIncrementType value) {
        return new JAXBElement<OrderableIncrementType>(new QName("urn:cidx:names:specification:ces:schema:all:5:0", "OrderableIncrement"), OrderableIncrementType.class, null, value);
    }

}

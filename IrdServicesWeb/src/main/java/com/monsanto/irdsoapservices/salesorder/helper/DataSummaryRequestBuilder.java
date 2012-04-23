package com.monsanto.irdsoapservices.salesorder.helper;

import com.monsanto.irdsoapservices.datasummary.schema.DataSummaryReport;
import com.monsanto.irdsoapservices.salesorder.constants.XmlConstants;
import com.monsanto.irdsoapservices.salesorder.domain.DataSummaryInfo;
import com.monsanto.irdsoapservices.salesorder.domain.DataSummaryTotals;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.datasummary.schema.*;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: caggarw
 * Date: Apr 3, 2012
 * Time: 10:26:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class DataSummaryRequestBuilder {

    public DataSummaryReport buildDataSummaryReportRequest(DataSummaryInfo dataSummaryInfo, DataSummaryTotals dataSummaryTotals, TransactionInfo transactionInfo) {
        DataSummaryReport dataSummaryReport = new DataSummaryReport();
        dataSummaryReport.setHeader(getHeaderType(transactionInfo, transactionInfo.getDataSourceType()));
        dataSummaryReport.setVersion("1.0");
        DataSummaryReportBodyType bodyType = new DataSummaryReportBodyType();
        bodyType.setReportFileList(getReportFileListType(transactionInfo));
        bodyType.setReportDataVerification(getReportDataVerificationType(dataSummaryInfo, dataSummaryTotals));
        dataSummaryReport.setDataSummaryReportBody(bodyType);
        return dataSummaryReport;
    }

    private ReportDataVerificationType getReportDataVerificationType(DataSummaryInfo dataSummaryInfo, DataSummaryTotals dataSummaryTotals) {
        ReportDataVerificationType verification = new ReportDataVerificationType();
        List<DataVerificationCheckpointType> verificationCheckpointTypeList = verification.getDataVerificationCheckpoint();

        DataVerificationCheckpointType invoiceCountCheckpointType = new DataVerificationCheckpointType();
        invoiceCountCheckpointType.setName(ListDataVerificationCheckpointAttribute.INVOICE_COUNT);
        invoiceCountCheckpointType.setValue(String.valueOf(dataSummaryInfo.getTotalInvoices()));
        verificationCheckpointTypeList.add(invoiceCountCheckpointType);

        DataVerificationCheckpointType invoiceLineItemCountCheckpointType = new DataVerificationCheckpointType();
        invoiceLineItemCountCheckpointType.setName(ListDataVerificationCheckpointAttribute.INVOICE_LINE_ITEM_COUNT);
        invoiceLineItemCountCheckpointType.setValue(String.valueOf(dataSummaryInfo.getTotalLineItems()));
        verificationCheckpointTypeList.add(invoiceLineItemCountCheckpointType);

        DataVerificationCheckpointType totalQuantityEquivalentCheckpointType = new DataVerificationCheckpointType();
        totalQuantityEquivalentCheckpointType.setName(ListDataVerificationCheckpointAttribute.TOTAL_QUANTITY_EQUIVALENT);
        totalQuantityEquivalentCheckpointType.setValue(String.valueOf(dataSummaryInfo.getTotalEquivalentQuantity()));
        verificationCheckpointTypeList.add(totalQuantityEquivalentCheckpointType);

        DataVerificationCheckpointType totalDealerCountCheckpointType = new DataVerificationCheckpointType();
        totalDealerCountCheckpointType.setName(ListDataVerificationCheckpointAttribute.TOTAL_DEALER_COUNT);
        totalDealerCountCheckpointType.setValue(String.valueOf(dataSummaryInfo.getTotalDealers()));
        verificationCheckpointTypeList.add(totalDealerCountCheckpointType);

        DataVerificationCheckpointType totalGrowerCountCheckpointType = new DataVerificationCheckpointType();
        totalGrowerCountCheckpointType.setName(ListDataVerificationCheckpointAttribute.TOTAL_GROWER_COUNT);
        totalGrowerCountCheckpointType.setValue(String.valueOf(dataSummaryInfo.getTotalGrowers()));
        verificationCheckpointTypeList.add(totalGrowerCountCheckpointType);

        DataVerificationCheckpointType totalDailyOpenInvoicesCheckpointType = new DataVerificationCheckpointType();
        totalDailyOpenInvoicesCheckpointType.setName(ListDataVerificationCheckpointAttribute.TOTAL_DAILY_OPEN_INVOICES);
        totalDailyOpenInvoicesCheckpointType.setValue(dataSummaryTotals.getTotalDailyOpenInvoices());
        verificationCheckpointTypeList.add(totalDailyOpenInvoicesCheckpointType);


        DataVerificationCheckpointType totalOpenInvoicesCheckpointType = new DataVerificationCheckpointType();
        totalOpenInvoicesCheckpointType.setName(ListDataVerificationCheckpointAttribute.TOTAL_OPEN_INVOICES);
        totalOpenInvoicesCheckpointType.setValue(dataSummaryTotals.getTotalOpenInvoices());
        verificationCheckpointTypeList.add(totalOpenInvoicesCheckpointType);

        return verification;
    }


    private ReportFileListType getReportFileListType(TransactionInfo transactionInfo) {
        ReportFileListType fileList = new ReportFileListType();
        fileList.setType(transactionInfo.getFileType());
        fileList.setFileCount(BigInteger.valueOf(transactionInfo.getFileCount()));
        List<ReportFileType> reportFile = fileList.getReportFile();
        List<String> documentIdsList = transactionInfo.getDocumentIds();
        for (String documentId : documentIdsList) {
            ReportFileType reportFileType = new ReportFileType();
            reportFileType.setDocumentIdentifier(documentId);
            reportFile.add(reportFileType);
        }
        return fileList;
    }

    private HeaderType getHeaderType(TransactionInfo transactionInfo, String tranType) {
        HeaderType headerType = new HeaderType();

        FromType fromType = new FromType();
        PartnerInformationType partnerInformationType = getPartnerInformationForHeader(XmlConstants.MONSANTO_PARTNER_NAME, XmlConstants.MONSANTO_EBID, ListPartnerAgencyAttribute.AGIIS_EBID);
        fromType.setPartnerInformation(partnerInformationType);

        ToType toType = new ToType();
        partnerInformationType = getPartnerInformationForHeader(transactionInfo.getName(), transactionInfo.getCompanyCode(), ListPartnerAgencyAttribute.AGIIS_EBID);
        toType.setPartnerInformation(partnerInformationType);

        ThisDocumentIdentifierType thisDocumentIdentifierType = new ThisDocumentIdentifierType();
        thisDocumentIdentifierType.setDocumentIdentifier(createDocumentIdentifier(transactionInfo, tranType));

        ThisDocumentDateTimeType thisDocumentDateTimeType = new ThisDocumentDateTimeType();
        thisDocumentDateTimeType.setDateTime(getDateTimeType(new Date()));

        headerType.setFrom(fromType);
        headerType.setTo(toType);
        headerType.setThisDocumentIdentifier(thisDocumentIdentifierType);
        headerType.setThisDocumentDateTime(thisDocumentDateTimeType);

        return headerType;
    }

    protected DateTimeType getDateTimeType(Date date) {
        DateTimeType dateTimeType = new DateTimeType();
        dateTimeType.setDateTimeQualifier(ListDateQualifier.ON);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        dateTimeType.setValue(new XMLGregorianCalendarImpl(gregorianCalendar));
        return dateTimeType;
    }

    protected String createDocumentIdentifier(TransactionInfo transactionInfo, String tranType) {
        StringBuffer sBuffer = new StringBuffer();
        sBuffer.append("NS_SUM-");
        sBuffer.append(tranType);
        sBuffer.append("_");
        sBuffer.append(transactionInfo.getCompanyCode());
        sBuffer.append("_");
        sBuffer.append(new SimpleDateFormat(XmlConstants.DATE_FORMAT_FOR_DOCUMENT_IDENTIFIER).format(new Date()));
        return sBuffer.toString();
    }

    protected PartnerInformationType getPartnerInformationForHeader(String partnerName, String partnerEbid, ListPartnerAgencyAttribute agency) {
        PartnerInformationType partnerInformationType = new PartnerInformationType();
        partnerInformationType.getPartnerName().add(partnerName);
        PartnerIdentifierType partnerIdentifierType = new PartnerIdentifierType();
        partnerIdentifierType.setAgency(agency);
        partnerIdentifierType.setValue(partnerEbid);
        partnerInformationType.getPartnerIdentifier().add(partnerIdentifierType);
        return partnerInformationType;
    }
}

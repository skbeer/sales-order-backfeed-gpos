package com.monsanto.salesorder.helper.test;

import com.monsanto.irdsoapservices.constants.DBConstants;
import com.monsanto.irdsoapservices.datasummary.schema.*;
import com.monsanto.irdsoapservices.salesorder.domain.DataSummaryInfo;
import com.monsanto.irdsoapservices.salesorder.domain.DataSummaryTotals;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.helper.DataSummaryRequestBuilder;
import junit.framework.TestCase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: caggarw
 * Date: Apr 3, 2012
 * Time: 10:44:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class DataSummaryRequestBuilder_UT extends TestCase {

    private DataSummaryRequestBuilder requestBuilder = new DataSummaryRequestBuilder();

    public void testBuildDataSummaryReportRequest() throws Exception {
        DataSummaryReport report = requestBuilder.buildDataSummaryReportRequest(getDataSummaryInfo(), getDataSummaryTotals(), getTransactionInfo());
        assertNotNull(report);
        assertEquals("1.0", report.getVersion());
        assertTrue(report.getHeader().getThisDocumentIdentifier().getDocumentIdentifier().startsWith("NS_SUM-Manual"));
        assertEquals("MONSANTO AGRICULTURAL CO", report.getHeader().getFrom().getPartnerInformation().getPartnerName().get(0));
        ReportFileListType fileList = report.getDataSummaryReportBody().getReportFileList();
        assertEquals(2, fileList.getFileCount().intValue());
        assertEquals("Manual", fileList.getType());
        assertEquals("123", fileList.getReportFile().get(0).getDocumentIdentifier());
        assertEquals("456", fileList.getReportFile().get(1).getDocumentIdentifier());
        List<DataVerificationCheckpointType> dataVerificationCheckpointTypes = report.getDataSummaryReportBody().getReportDataVerification().getDataVerificationCheckpoint();

        DataVerificationCheckpointType checkpointType1 = dataVerificationCheckpointTypes.get(0);
        assertEquals(ListDataVerificationCheckpointAttribute.INVOICE_COUNT.value(), checkpointType1.getName().value());
        assertEquals("50", checkpointType1.getValue());

        DataVerificationCheckpointType checkpointType2 = dataVerificationCheckpointTypes.get(1);
        assertEquals(ListDataVerificationCheckpointAttribute.INVOICE_LINE_ITEM_COUNT.value(), checkpointType2.getName().value());
        assertEquals("2", checkpointType2.getValue());

        DataVerificationCheckpointType checkpointType3 = dataVerificationCheckpointTypes.get(2);
        assertEquals(ListDataVerificationCheckpointAttribute.TOTAL_QUANTITY_EQUIVALENT.value(), checkpointType3.getName().value());
        assertEquals("234.599999999999994315658113919198513031005859375", checkpointType3.getValue());

        DataVerificationCheckpointType checkpointType4 = dataVerificationCheckpointTypes.get(3);
        assertEquals(ListDataVerificationCheckpointAttribute.TOTAL_DEALER_COUNT.value(), checkpointType4.getName().value());
        assertEquals("234", checkpointType4.getValue());

        DataVerificationCheckpointType checkpointType5 = dataVerificationCheckpointTypes.get(4);
        assertEquals(ListDataVerificationCheckpointAttribute.TOTAL_GROWER_COUNT.value(), checkpointType5.getName().value());
        assertEquals("3345", checkpointType5.getValue());

        DataVerificationCheckpointType checkpointType6 = dataVerificationCheckpointTypes.get(5);
        assertEquals(ListDataVerificationCheckpointAttribute.TOTAL_DAILY_OPEN_INVOICES.value(), checkpointType6.getName().value());
        assertEquals("2000", checkpointType6.getValue());

        DataVerificationCheckpointType checkpointType7 = dataVerificationCheckpointTypes.get(6);
        assertEquals(ListDataVerificationCheckpointAttribute.TOTAL_OPEN_INVOICES.value(), checkpointType7.getName().value());
        assertEquals("3000", checkpointType7.getValue());
    }

    private DataSummaryInfo getDataSummaryInfo() {
        DataSummaryInfo dataSummaryInfo = new DataSummaryInfo();
        dataSummaryInfo.setTotalDealers(234);
        dataSummaryInfo.setTotalEquivalentQuantity(new BigDecimal(234.6));
        dataSummaryInfo.setTotalGrowers(3345);
        dataSummaryInfo.setTotalInvoices(50);
        dataSummaryInfo.setTotalLineItems(2);
        return dataSummaryInfo;
    }

    private DataSummaryTotals getDataSummaryTotals() {
        DataSummaryTotals dataSummaryTotals  = new DataSummaryTotals();
        dataSummaryTotals.setTotalDailyOpenInvoices("2000");
        dataSummaryTotals.setTotalOpenInvoices("3000");
        return dataSummaryTotals;
    }

    private TransactionInfo getTransactionInfo() {
        TransactionInfo transactionInfo = new TransactionInfo();
        transactionInfo.setCompanyCode("1001");
        transactionInfo.setGroupCode("XA");
        transactionInfo.setName("Company Name");
        transactionInfo.setLastTransactionNumber(0);
        transactionInfo.setTransactionType(DBConstants.GPOS_AGRIMINE_TRAN_TYPE);
        transactionInfo.setDataSourceType(DBConstants.AGRIMINE_DATA_SOURCE_TYPE);
        transactionInfo.setMaxFileSize(10);
        transactionInfo.setFileCount(2);
        transactionInfo.setFileType("Manual");
        ArrayList<String> documentList = new ArrayList<String>();
        documentList.add("123");
        documentList.add("456");
        transactionInfo.setDocumentIds(documentList);
        return transactionInfo;
    }
}

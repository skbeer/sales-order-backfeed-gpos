package com.monsanto.salesorder.helper.test;

import com.monsanto.irdsoapservices.salesorder.domain.LineItemInfo;
import com.monsanto.irdsoapservices.salesorder.domain.PPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.PartnerInfo;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.irdsoapservices.salesorder.helper.PPOSRequestBuilder;
import com.monsanto.irdsoapservices.salesorder.schema.SalesOrderReport;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 10, 2010
 * Time: 12:54:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class PPOSRequestBuilder_UT extends TestCase {

    PPOSRequestBuilder requestBuilder = new PPOSRequestBuilder();

    public void testBuildPPOSRequet() throws Exception {
        SalesOrderReport salesReport = requestBuilder.buildPPOSRequest(getPPOSPposOrderInfo(), getTransactionInfo());
        assertNotNull(salesReport);
        assertEquals("1", salesReport.getHeader().getSalesOrderReportSequenceNumber());
        assertTrue(salesReport.getHeader().getThisDocumentIdentifier().getDocumentIdentifier().startsWith("RT_1_1001_"));
        assertEquals("MONSANTO AGRICULTURAL CO", salesReport.getHeader().getFrom().getPartnerInformation().getPartnerName().get(0));
        assertEquals(1, salesReport.getSalesOrderReportBody().getSalesOrderReportDetails().size());
    }

    private List<PPOSOrderInfo> getPPOSPposOrderInfo() {
        PPOSOrderInfo pposOrderInfo = new PPOSOrderInfo();
        pposOrderInfo.setOrderNumber("100");
        pposOrderInfo.setOrderDate(new Date());
        pposOrderInfo.setOrderFiscalYear("2010");
        pposOrderInfo.setOrderType("RT");
        pposOrderInfo.setDealerInfo(getPartnerInfo("Dealer"));
        pposOrderInfo.setGrowerInfo(getPartnerInfo("Grower"));
        pposOrderInfo.getLineItems().add(getLineItemInfo("1", "Product 1", "GTIN 1", "UPC 1", "100", "BG", "101", "UN", getPartnerInfo("SalesRep1 ")));
        pposOrderInfo.getLineItems().add(getLineItemInfo("2", "Product 2", "GTIN 2", "UPC 2", "200", "BG", "201", "UN", getPartnerInfo("SalesRep2 ")));
        List<PPOSOrderInfo> list = new ArrayList<PPOSOrderInfo>();
        list.add(pposOrderInfo);
        return list;
    }

    private TransactionInfo getTransactionInfo() {
        TransactionInfo transactionInfo = new TransactionInfo();
        transactionInfo.setCompanyCode("1001");
        transactionInfo.setGroupCode("XA");
        transactionInfo.setName("Company Name");
        transactionInfo.setLastTransactionNumber(0);
        transactionInfo.setTransactionType("PPOS");
        return transactionInfo;
    }

    private PartnerInfo getPartnerInfo(String prefix) {
        PartnerInfo partnerInfo = new PartnerInfo();
        partnerInfo.setPartnerName(prefix+" Name");
        partnerInfo.setContactName(prefix+" ContactName");
        partnerInfo.setAcctId(prefix+" AcctId");
        partnerInfo.setAddress(prefix+" Address");
        partnerInfo.setCity(prefix+" City");
        partnerInfo.setCounty(prefix+" County");
        partnerInfo.setEbid(prefix+" Ebid");
        partnerInfo.setState(prefix+" State");
        partnerInfo.setZip(prefix+" Zip");
        return partnerInfo;
    }

    private LineItemInfo getLineItemInfo(String itemNumber, String productName, String productGtin, String productUpc, String equivalentQuantity, String equivalentQuantityUom, String salesQuantity, String salesQuantityUom, PartnerInfo salesRep) {
        LineItemInfo lineItemInfo = new LineItemInfo();
        lineItemInfo.setItemNumber(itemNumber);
        lineItemInfo.setProductName(productName);
        lineItemInfo.setProductGtin(productGtin);
        lineItemInfo.setProductUpc(productUpc);
        lineItemInfo.getEquivalentQuantity().setQtyValue(equivalentQuantity);
        lineItemInfo.getEquivalentQuantity().setQtyUom(equivalentQuantityUom);
        lineItemInfo.getSalesQuantity().setQtyValue(salesQuantity);
        lineItemInfo.getSalesQuantity().setQtyUom(salesQuantityUom);
        salesRep.setBuyerId(itemNumber);
        lineItemInfo.setSalesRep(salesRep);
        return lineItemInfo;
    }

}

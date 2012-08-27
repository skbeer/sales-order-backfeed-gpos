package com.monsanto.creditlist;

import junit.framework.TestCase;
import com.monsanto.irdsoapservices.creditlist.CreditListHelper;
import com.monsanto.irdsoapservices.creditlist.CreditListDAO;
import com.monsanto.irdsoapservices.salesorder.domain.TransactionInfo;
import com.monsanto.commercial.growercreditlist.invoker.GrowerCreditListServiceInvoker;
import com.monsanto.commercial.growercreditlist.invoker.GetCreditInfoServiceInvoker;
import com.monsanto.commercial.growercreditlist.domain.ClientInfo;
import com.monsanto.commercial.growercreditlist.domain.GrowerInfo;
import com.monsanto.commercial.growercreditlist.domain.GrowerCreditInfo;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.ArrayList;


/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Aug 17, 2012
 * Time: 2:07:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreditListHelper_UT extends TestCase {
    CreditListHelper helper;
    GrowerCreditListServiceInvoker growerCreditListServiceInvoker;
    GetCreditInfoServiceInvoker getCreditInfoServiceInvoker;
    ClientInfo clientInfo;
    CreditListDAO creditListDAO;
    List<GrowerInfo> growerList = new ArrayList<GrowerInfo>();
    List<GrowerCreditInfo> growerCreditList = new ArrayList<GrowerCreditInfo>();

    TransactionInfo transactionInfo;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        helper = new CreditListHelper();
        growerCreditListServiceInvoker = mock(GrowerCreditListServiceInvoker.class);
        getCreditInfoServiceInvoker = mock(GetCreditInfoServiceInvoker.class);
        clientInfo = new ClientInfo();
        creditListDAO = mock(CreditListDAO.class);
        transactionInfo = new TransactionInfo();
        transactionInfo.setGroupCode("V9");
        transactionInfo.setName("SSC Compamy");
        transactionInfo.setCompanyCode("101");
        transactionInfo.setTransactionType("FPOS");
        growerList.add(getGrowerInfo("101"));
        growerList.add(getGrowerInfo("102"));
        growerCreditList.add(getGrowerCreditInfo("101"));
        helper.setCreditListDAO(creditListDAO);
        helper.setCreditListServiceInvoker(growerCreditListServiceInvoker);
        helper.setGetCreditInfoServiceInvoker(getCreditInfoServiceInvoker);
    }

    public void testProcessTransactions() throws Exception {
        when(creditListDAO.getGrowerList("V9")).thenReturn(growerList);
        when(getCreditInfoServiceInvoker.getGrowerCreditInfo((List<String>)anyObject(), (ClientInfo)anyObject())).thenReturn(growerCreditList);
        assertEquals(1, helper.processCreditListTransaction(transactionInfo));
        verify(growerCreditListServiceInvoker).invokeService((List<GrowerInfo>)anyObject(), (ClientInfo)anyObject());
    }

    private GrowerInfo getGrowerInfo(String accountId) {
        GrowerInfo growerInfo = new GrowerInfo();
        growerInfo.setAccountId(accountId);
        growerInfo.setSapId(accountId);        
        return growerInfo;
    }

    private GrowerCreditInfo getGrowerCreditInfo(String accountId) {
        GrowerCreditInfo growerInfo = new GrowerCreditInfo();
        growerInfo.setGrowerAccountId(accountId);
        growerInfo.setCreditApproved(100.15);
        growerInfo.setCreditAvailable(75.75);
        return growerInfo;
    }

}

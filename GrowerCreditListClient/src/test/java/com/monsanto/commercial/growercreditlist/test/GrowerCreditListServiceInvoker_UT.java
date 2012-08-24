package com.monsanto.commercial.growercreditlist.test;

import junit.framework.TestCase;
import com.monsanto.commercial.growercreditlist.invoker.GrowerCreditListServiceInvoker;
import com.monsanto.commercial.growercreditlist.domain.ClientInfo;
import com.monsanto.commercial.growercreditlist.domain.GrowerInfo;
import com.monsanto.commercial.growercreditlist.util.EnvironmentEnum;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Aug 17, 2012
 * Time: 10:55:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class GrowerCreditListServiceInvoker_UT extends TestCase {
    GrowerCreditListServiceInvoker serviceInvoker;

    public void test() throws Exception {
        serviceInvoker = new GrowerCreditListServiceInvoker();
        serviceInvoker.invokeService(getGrowerList(2), getClientInfo());
    }

    private List<GrowerInfo> getGrowerList(int count) {
        List<GrowerInfo> growerList = new ArrayList<GrowerInfo>();
        for (int i = 1; i <= count; i++) {
            growerList.add(getGrowerInfo(i));
        }
        return growerList;
    }

    private GrowerInfo getGrowerInfo(int i) {
        GrowerInfo growerInfo = new GrowerInfo();
        growerInfo.setAccountId(i +"234");
        growerInfo.setCity("St.Louis "+ i);
        growerInfo.setState("MO "+ i);
        growerInfo.setZip("6330 "+ i);
        growerInfo.setCreditType("FPOS");
        growerInfo.setCreditApproved(i +1500.00);
        growerInfo.setCreditAvailable(i +1200.05);
        growerInfo.setDateApproved(new Date());
        growerInfo.setGln(i +"00234567");
        growerInfo.setName("Grower "+ i);
        growerInfo.setDealerAccountId(i+456+"");
        return growerInfo;
    }

    private ClientInfo getClientInfo() {
        ClientInfo clientInfo = new ClientInfo();
        clientInfo.setDocIdentifier("MKUCHIP-TEST");
        clientInfo.setEnvironment(EnvironmentEnum.DEV);
        clientInfo.setPartnerId("ABC123");
        clientInfo.setPartnerName("MKUCHIP-TEST");
        return clientInfo;
    }
}

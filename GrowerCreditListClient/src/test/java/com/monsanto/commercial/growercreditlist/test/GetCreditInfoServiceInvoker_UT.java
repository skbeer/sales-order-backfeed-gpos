package com.monsanto.commercial.growercreditlist.test;

import junit.framework.TestCase;
import com.monsanto.commercial.growercreditlist.domain.ClientInfo;
import com.monsanto.commercial.growercreditlist.domain.GrowerCreditInfo;
import com.monsanto.commercial.growercreditlist.util.EnvironmentEnum;
import com.monsanto.commercial.growercreditlist.invoker.GetCreditInfoServiceInvoker;

import java.util.List;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Aug 16, 2012
 * Time: 1:02:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class GetCreditInfoServiceInvoker_UT extends TestCase {

    public void testInvokeService() throws Exception {
        GetCreditInfoServiceInvoker serviceInvoker = new GetCreditInfoServiceInvoker();
        List<GrowerCreditInfo> growerList = serviceInvoker.getGrowerCreditInfo(Arrays.asList(new String[]{"0001001199", "0001001666", "0001290825", "0001655973"}), getClientInfo());
        System.out.println("growerList.size() = " + growerList.size());
        for(GrowerCreditInfo creditInfo : growerList) {
            System.out.println(creditInfo);
        }
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

package com.monsanto.creditlist;

import junit.framework.TestCase;
import com.monsanto.irdsoapservices.creditlist.CreditListErrorEmailer;
import com.monsanto.commercial.growercreditlist.domain.GrowerInfo;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Sep 7, 2012
 * Time: 1:23:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreditListEmailer_UT extends TestCase {
    public void testSendEmail() throws Exception {
        new CreditListErrorEmailer().sendEmail(Arrays.asList(new GrowerInfo[]{getGrowerInfo("1"), getGrowerInfo("2")}), "SSC Company");    
    }

    private GrowerInfo getGrowerInfo(String pref) {
        GrowerInfo growerInfo = new GrowerInfo();
        growerInfo.setSapId(pref +"003083");
        growerInfo.setAccountId(pref +"001");
        growerInfo.setName("Grower "+ pref);
        return growerInfo;
    }
}

package com.monsanto.salesorder.helper.test;

import junit.framework.TestCase;
import com.monsanto.irdsoapservices.salesorder.helper.PPOSHelper;
import com.monsanto.irdsoapservices.salesorder.domain.PPOSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.LineItemInfo;
import com.monsanto.irdsoapservices.salesorder.schema.SalesOrderReport;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 10, 2010
 * Time: 12:10:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class PPOSHelper_UT extends TestCase {
    PPOSHelper pposHelper = new PPOSHelper();
    List<PPOSOrderInfo> pposOrderList = new ArrayList<PPOSOrderInfo>();

    public void testNormalizeOrders() throws Exception {
        pposOrderList.add(getPPOSOrder("1001", "1"));
        pposOrderList.add(getPPOSOrder("1001", "2"));
        pposOrderList.add(getPPOSOrder("1002", "1"));
        pposOrderList.add(getPPOSOrder("1003", "1"));
        pposOrderList.add(getPPOSOrder("1003", "2"));
        pposOrderList.add(getPPOSOrder("1003", "3"));
        List<PPOSOrderInfo> normalizedOrders = pposHelper.normalizeOrderLineItems(pposOrderList);
        assertEquals(3, normalizedOrders.size());
        assertEquals(2, normalizedOrders.get(0).getLineItems().size());
        assertEquals(1, normalizedOrders.get(1).getLineItems().size());
        assertEquals(3, normalizedOrders.get(2).getLineItems().size());
    }

    public void testNormalizeOrders_scenario2() throws Exception {
        pposOrderList.add(getPPOSOrder("1001", "1"));
        pposOrderList.add(getPPOSOrder("1002", "1"));
        pposOrderList.add(getPPOSOrder("1002", "2"));
        pposOrderList.add(getPPOSOrder("1002", "3"));
        pposOrderList.add(getPPOSOrder("1002", "4"));
        pposOrderList.add(getPPOSOrder("1003", "3"));
        List<PPOSOrderInfo> normalizedOrders = pposHelper.normalizeOrderLineItems(pposOrderList);
        assertEquals(3, normalizedOrders.size());
        assertEquals(1, normalizedOrders.get(0).getLineItems().size());
        assertEquals(4, normalizedOrders.get(1).getLineItems().size());
        assertEquals(1, normalizedOrders.get(2).getLineItems().size());
    }

    public void testNormalizeOrders_scenario3() throws Exception {
        pposOrderList.add(getPPOSOrder("1001", "1"));
        pposOrderList.add(getPPOSOrder("1001", "2"));
        pposOrderList.add(getPPOSOrder("1002", "1"));
        pposOrderList.add(getPPOSOrder("1003", "1"));
        pposOrderList.add(getPPOSOrder("1004", "2"));
        pposOrderList.add(getPPOSOrder("1005", "1"));
        pposOrderList.add(getPPOSOrder("1005", "2"));
        pposOrderList.add(getPPOSOrder("1006", "2"));
        pposOrderList.add(getPPOSOrder("1007", "2"));
        pposOrderList.add(getPPOSOrder("1008", "2"));
        List<PPOSOrderInfo> normalizedOrders = pposHelper.normalizeOrderLineItems(pposOrderList);
        assertEquals(8, normalizedOrders.size());
        assertEquals(2, normalizedOrders.get(0).getLineItems().size());
        assertEquals(1, normalizedOrders.get(1).getLineItems().size());
        assertEquals(1, normalizedOrders.get(2).getLineItems().size());
        assertEquals(1, normalizedOrders.get(3).getLineItems().size());
        assertEquals(2, normalizedOrders.get(4).getLineItems().size());
        assertEquals(1, normalizedOrders.get(5).getLineItems().size());
        assertEquals(1, normalizedOrders.get(6).getLineItems().size());
        assertEquals(1, normalizedOrders.get(7).getLineItems().size());
    }




    private PPOSOrderInfo getPPOSOrder(String crmOrderNumber, String lineItemNumber) {
        PPOSOrderInfo pposOrderInfo = new PPOSOrderInfo();
        pposOrderInfo.setCrmOrderNumber(crmOrderNumber);
            LineItemInfo lineItem = new LineItemInfo();
            lineItem.setItemNumber(lineItemNumber);
            pposOrderInfo.setTempLineItem(lineItem);
        return pposOrderInfo;
    }

}

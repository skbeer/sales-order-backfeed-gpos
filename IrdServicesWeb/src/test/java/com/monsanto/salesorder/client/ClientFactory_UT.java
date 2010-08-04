package com.monsanto.salesorder.client;

import com.monsanto.irdsoapservices.salesorder.client.ClientFactory;
import junit.framework.TestCase;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 14, 2010
 * Time: 4:09:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClientFactory_UT extends TestCase {

    public void testGetSalesOrderClient() throws Exception {
        assertNotNull(new ClientFactory().getSalesOrderClient());
    }
}

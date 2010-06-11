package com.monsanto.irdsoapservices.salesorder.dao;

import com.monsanto.irdsoapservices.salesorder.domain.PPOSOrderInfo;

import java.util.List;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 8, 2010
 * Time: 2:19:32 PM
 * To change this template use File | Settings | File Templates.
 */
public interface SalesOrderDao {
    List<PPOSOrderInfo> getPPOSOrderInfo(Date startDate, String groupCode) throws Exception;
}

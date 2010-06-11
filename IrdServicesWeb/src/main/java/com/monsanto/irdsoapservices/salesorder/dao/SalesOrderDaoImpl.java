package com.monsanto.irdsoapservices.salesorder.dao;

import com.monsanto.irdsoapservices.salesorder.domain.PPOSOrderInfo;

import java.util.List;
import java.util.HashMap;
import java.util.Date;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 8, 2010
 * Time: 2:11:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class SalesOrderDaoImpl extends SqlMapClientDaoSupport implements SalesOrderDao {

    public List<PPOSOrderInfo> getPPOSOrderInfo(Date startDate, String groupCode) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("groupCode", groupCode);
        map.put("startDate", startDate);
        return (List<PPOSOrderInfo>)getSqlMapClientTemplate().queryForList("SalesOrder.getPPOSOrders", map);
    }
}

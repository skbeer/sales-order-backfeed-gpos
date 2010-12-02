package com.monsanto.irdsoapservices.salesorder.dao;

import com.monsanto.irdsoapservices.salesorder.domain.COSOrderInfo;
import com.monsanto.irdsoapservices.salesorder.domain.PPOSOrderInfo;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 8, 2010
 * Time: 2:11:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class SalesOrderDaoImpl extends SqlMapClientDaoSupport implements SalesOrderDao {

    public List<PPOSOrderInfo> getPPOSOrders(Date startDate, String groupCode) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("groupCode", groupCode);
        map.put("startDate", startDate);
        return (List<PPOSOrderInfo>)getSqlMapClientTemplate().queryForList("SalesOrder.getPPOSOrders", map);
    }

    public List<COSOrderInfo> getCOSOrders(Date startDate, String groupCode) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("groupCode", groupCode);
        map.put("startDate", startDate);
        return (List<COSOrderInfo>)getSqlMapClientTemplate().queryForList("SalesOrder.getCOSOrders", map);
    }


}

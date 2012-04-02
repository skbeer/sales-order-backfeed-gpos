package com.monsanto.irdsoapservices.salesorder.dao;

import com.monsanto.irdsoapservices.salesorder.domain.DataSummaryInfo;
import com.monsanto.irdsoapservices.salesorder.domain.DataSummaryTotals;
import com.monsanto.irdsoapservices.salesorder.domain.GPOSOrderInfo;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: caggarw
 * Date: Mar 30, 2012
 * Time: 2:13:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class DataSummaryDaoImpl extends SqlMapClientDaoSupport implements DataSummaryDao {
    @Override
    public DataSummaryInfo getDataSummaryInfoWinfield(Date startDate, String groupCode, String transactionType) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("groupCode", groupCode);
        java.sql.Date sqlDate = new java.sql.Date(startDate.getTime());
        map.put("startDate", sqlDate);
        map.put("transactionType", transactionType);
        return (DataSummaryInfo)getSqlMapClientTemplate().queryForObject("DataSummary.getDataSummaryWinfield", map);
    }

    @Override
    public DataSummaryInfo getDataSummaryInfoDirect(Date startDate, String groupCode) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("groupCode", groupCode);
        java.sql.Date sqlDate = new java.sql.Date(startDate.getTime());
        map.put("startDate", sqlDate);
        return (DataSummaryInfo)getSqlMapClientTemplate().queryForObject("DataSummary.getDataSummaryDirect", map);
    }

    @Override
    public DataSummaryTotals getDataSummaryTotalsWinfield(Date startDate, String groupCode, String transactionType) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("groupCode", groupCode);
        java.sql.Date sqlDate = new java.sql.Date(startDate.getTime());
        map.put("startDate", sqlDate);
        map.put("transactionType", transactionType);
        return (DataSummaryTotals)getSqlMapClientTemplate().queryForObject("DataSummary.getTotalsWinfield", map);
    }

    @Override
    public DataSummaryTotals getDataSummaryTotalsDirect(Date startDate, String groupCode) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("groupCode", groupCode);
        java.sql.Date sqlDate = new java.sql.Date(startDate.getTime());
        map.put("startDate", sqlDate);
        return (DataSummaryTotals)getSqlMapClientTemplate().queryForObject("DataSummary.getTotalsDirect", map);
    }

}

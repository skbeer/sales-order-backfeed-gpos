package com.monsanto.retailseller.dao;

import com.monsanto.irdsoapservices.utils.StringUtils;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * Created by IntelliJ IDEA.
 * User: MKUCHIP
 * Date: Jun 28, 2010
 * Time: 11:14:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestDataDaoImpl extends SqlMapClientDaoSupport {

    public int getSellerCount(String aliasCode) {        
        return (Integer) getSqlMapClientTemplate().queryForObject("TestData.getSellerCount", aliasCode+"%");
    }

    public int deleteSellerRecords(String aliasCode) {
        if(StringUtils.isNullOrEmpty(aliasCode)) {
            aliasCode = "alias";
        }
        return getSqlMapClientTemplate().delete("TestData.deleteSellerRecords", aliasCode+"%");
    }
}
